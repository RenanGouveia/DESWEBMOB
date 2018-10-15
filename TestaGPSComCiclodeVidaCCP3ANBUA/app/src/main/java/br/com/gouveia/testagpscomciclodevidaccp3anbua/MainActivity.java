package br.com.gouveia.testagpscomciclodevidaccp3anbua;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_PERMISSION_GPS = 1001;

    private LocationManager locationManager;
    private LocationListener locationListener =
        new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                double lat = location.getLatitude();
                double longi = location.getLongitude();


            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }

        };
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            }

            @SuppressLint("MissingPermission")
            @Override
            protected void onResume() {
                super.onResume();
                if(ActivityCompat.checkSelfPermission(this,
                        Manifest.permission.ACCESS_COARSE_LOCATION)
                        != PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(this,
                                new String[]
                                        {Manifest.permission.ACCESS_COARSE_LOCATION},
                                REQUEST_PERMISSION_GPS);
                }else {
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                            0, 0, locationListener);
                }
            }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        if(requestCode == REQUEST_PERMISSION_GPS){

            if(grantResults.length >=1 &&
                    grantResults[8] == PackageManager.PERMISSION_GRANTED){

                if(ActivityCompat.checkSelfPermission(this,
                        Manifest.permission.ACCESS_COARSE_LOCATION)
                    == PackageManager.PERMISSION_GRANTED){

                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                            0, 0, locationListener);
                }
            }
            else{
                Toast toast = Toast.makeText(this, getString(R.string.lamento), Toast.LENGTH_LONG);
            }
        }
    }

    @SuppressLint("MissingPermission")
    @Override
    protected void onPause() {
        super.onPause();
        locationManager.removeUpdates(locationListener);
    }
}
