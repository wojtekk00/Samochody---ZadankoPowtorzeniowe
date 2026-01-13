package com.example.myapplication;

public class Samochod {
    private String marka;
    private String model;
    private int rocznik;
    private boolean czyPierwszyWlasciciel;
    private String historia;

    public Samochod(String marka, String model, int rocznik, boolean czyPierwszyWlasciciel, String historia) {
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
        this.czyPierwszyWlasciciel = czyPierwszyWlasciciel;
        this.historia = historia;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public boolean isCzyPierwszyWlasciciel() {
        return czyPierwszyWlasciciel;
    }

    public void setCzyPierwszyWlasciciel(boolean czyPierwszyWlasciciel) {
        this.czyPierwszyWlasciciel = czyPierwszyWlasciciel;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
