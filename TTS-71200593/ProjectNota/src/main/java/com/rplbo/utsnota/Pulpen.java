package com.rplbo.utsnota;

public class Pulpen extends Barang{
    private String warna;

    public Pulpen(String kodebarang,int harga,int berat,String deskripsi,String warna)
    {
        super(kodebarang,harga,berat,deskripsi);
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    void getInformasi(){
        System.out.println("Kode : "+this.getKodebarang());
        System.out.println("Harga : "+this.getHarga());
        System.out.println("Berat : "+this.getBerat());
        System.out.println("Deskripsi : "+this.getDeskripsi());
        System.out.println("Warna : "+this.getWarna());
        System.out.println("---------------------------------------------");
    }
}
