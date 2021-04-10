package com.aditiya_corp.pong;

public class Car {
    
    private String merk;
    private String warna;
    private int jmlhBan;
    private float panjang;
    private float lebar;
    private String tipe;
    
    public Car(String warna, String merk, int jmlhBan, float panjang, float lebar, String tipe) {
        this.setWarna(warna);
        this.setMerk(merk);
        this.setJmlhBan(jmlhBan);
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTipe(tipe);
    }

    public Car(String warna, String merk, int jmlhBan,String tipe){
        this.setWarna(warna);
        this.setMerk(merk);
        this.setJmlhBan(jmlhBan);
        this.setTipe(tipe);
    }

    public Car(String merk){
        this.setMerk(merk);
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public int getJmlhBan() {
        return jmlhBan;
    }

    public void setJmlhBan(int jmlhBan) {
        this.jmlhBan = jmlhBan;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }


}
