package br.com.gouveia.weatherforecastbycityccp3anbua;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherArrayAdapter extends ArrayAdapter <Weather>{

    private Map<String, Bitmap> bitmaps = new HashMap<>();
    public WeatherArrayAdapter(Context context, List<Weather> forecast){
        super(context,-1, forecast);
    }

    private class ViewHolder{
        ImageView conditionImageView;
        TextView dayTextView;
        TextView lowTextView;
        TextView highTextView;
        TextView humidityTextView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Weather previsao = getItem(position);
        View raiz = null;
        ViewHolder viewHolder = null;
        Context context = getContext();
        if(convertView == null){

            LayoutInflater inflater = LayoutInflater.from(context);
            raiz = inflater.inflate(R.layout.list_item, parent,false);
            viewHolder = new ViewHolder();
            raiz.setTag(viewHolder);
            viewHolder.conditionImageView = raiz.findViewById(R.id.conditionImageView);
            viewHolder.dayTextView = raiz.findViewById(R.id.dayTextView);
            viewHolder.lowTextView = raiz.findViewById(R.id.lowTextView);
            viewHolder.highTextView = raiz.findViewById(R.id.highTextView);
            viewHolder.humidityTextView = raiz.findViewById(R.id.humidityTextView);

        }else{
            raiz = convertView;
            viewHolder = (ViewHolder) raiz.getTag();
        }

        viewHolder.dayTextView.setText(context.getString(R.string.day_description, previsao.dayOfWeek, previsao.description));
        viewHolder.lowTextView.setText(context.getString(R.string.low_temp, previsao.minTemp));
        viewHolder.highTextView.setText(context.getString(R.string.high_temp, previsao.maxTemp));
        viewHolder.humidityTextView.setText(context.getString(R.string.humidity, previsao.humidity));

        if(bitmaps.containsKey(previsao.iconName)){
            viewHolder.conditionImageView.setImageBitmap(bitmaps.get(previsao.iconName));
        }else {
            ImageGetter imageGetter = new ImageGetter(viewHolder.conditionImageView, bitmaps);
            imageGetter.execute(context.getString(R.string.image_download_url, previsao.iconName));
        }
        return raiz;
    }

    private class ImageGetter extends AsyncTask<String, Void, Bitmap> {

        private ImageView imageView;
        private Map<String, Bitmap> bitmaps;

        public ImageGetter(ImageView imageView, Map<String, Bitmap> bitmaps){
            this.imageView = imageView;
            this.bitmaps = bitmaps;
        }
        @Override
        protected Bitmap doInBackground(String... urlS) {
            try{
                URL url = new URL(urlS[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = connection.getInputStream();
                Bitmap figura = BitmapFactory.decodeStream(inputStream);
                imageView.setImageBitmap(figura);
                bitmaps.put(urlS[0], figura);
                return figura;
            }
            catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(Bitmap figura) {
            imageView.setImageBitmap(figura);
        }
    }
}
