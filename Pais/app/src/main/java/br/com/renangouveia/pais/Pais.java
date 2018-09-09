package br.com.renangouveia.pais;


/*
    Renan Gouveia Dutra da Silva
    816114946
 */


import java.util.ArrayList;

public class Pais {

    String nome;
    String codigo3;
    String capital;
    String regiao;
    String subRegiao;
    String demonimo;
    int populacao;
    int area;
    String bandeira;
    double gini;
    double latitude;
    double longitude;
    ArrayList<String> idiomas;
    ArrayList<String> moedas;
    ArrayList<String> dominios;
    ArrayList<String> fusos;
    ArrayList<String> fronteiras;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo3() {
        return codigo3;
    }

    public void setCodigo3(String codigo3) {
        this.codigo3 = codigo3;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getSubRegiao() {
        return subRegiao;
    }

    public void setSubRegiao(String subRegiao) {
        this.subRegiao = subRegiao;
    }

    public String getDemonimo() {
        return demonimo;
    }

    public void setDemonimo(String demonimo) {
        this.demonimo = demonimo;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public double getGini() {
        return gini;
    }

    public void setGini(double gini) {
        this.gini = gini;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<String> getMoedas() {
        return moedas;
    }

    public void setMoedas(ArrayList<String> moedas) {
        this.moedas = moedas;
    }

    public ArrayList<String> getDominios() {
        return dominios;
    }

    public void setDominios(ArrayList<String> dominios) {
        this.dominios = dominios;
    }

    public ArrayList<String> getFusos() {
        return fusos;
    }

    public void setFusos(ArrayList<String> fusos) {
        this.fusos = fusos;
    }

    public ArrayList<String> getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(ArrayList<String> fronteiras) {
        this.fronteiras = fronteiras;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                ", codigo3='" + codigo3 + '\'' +
                ", capital='" + capital + '\'' +
                ", regiao='" + regiao + '\'' +
                ", subRegiao='" + subRegiao + '\'' +
                ", demonimo='" + demonimo + '\'' +
                ", populacao=" + populacao +
                ", area=" + area +
                ", bandeira='" + bandeira + '\'' +
                ", gini=" + gini +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", idiomas=" + idiomas +
                ", moedas=" + moedas +
                ", dominios=" + dominios +
                ", fusos=" + fusos +
                ", fronteiras=" + fronteiras +
                '}';
    }
}
