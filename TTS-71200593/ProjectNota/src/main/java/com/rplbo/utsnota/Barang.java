package com.rplbo.utsnota;

abstract public class Barang {
    private String deskripsi;
    private String kodebarang;
    private int harga;
    private int berat;

    public Barang(){

    }
    public Barang(String kodebarang,int harga,int berat,String deskripsi){
        this.deskripsi = deskripsi;
        this.kodebarang =kodebarang;
        this.harga = harga;
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public String getKodebarang() {
        return kodebarang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    abstract void getInformasi();

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
