package com.rplbo.utsnota;

public class BukuTulis extends Barang{
    private String merk;

    public BukuTulis(String kodebarang,int harga,int berat,String deskripsi,
                     String merk)
    {
        super(kodebarang,harga,berat,deskripsi);
        this.merk = merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    void getInformasi(){
        System.out.println("Kode : "+this.getKodebarang());
        System.out.println("Harga : "+this.getHarga());
        System.out.println("Berat : "+this.getBerat());
        System.out.println("Deskripsi : "+this.getDeskripsi());
        System.out.println("Merk : "+this.getMerk());
        System.out.println("---------------------------------------------");
    }
}
