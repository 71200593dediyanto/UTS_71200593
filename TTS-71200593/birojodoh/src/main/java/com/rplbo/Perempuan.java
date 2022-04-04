package com.rplbo;

public class Perempuan {
    private String nama;
    private int usia;
    private String status;
    private double jumlahCinta;
    private Pria jodoh;
    private Pria temanKencan;
    private double standarJumlahCinta;


    public Perempuan(String nama,int usia,double standarJumlahCinta){
        this.setNama(nama);
        this.setUsia(usia);
        this.setStandarJumlahCinta(standarJumlahCinta);
    }

    public void MengajakKencan(Pria pria){
        if (this.getTemanKencan() == null || this.getTemanKencan() == pria){
            this.setJumlahCinta(getJumlahCinta()+0.5);
            pria.setJumlahCinta(getJumlahCinta()+0.5);
        }else{
            System.out.println("JANGAN SELINGKUH MBAK HEI TOLONG" +
                    "JADI CEWEK GACUKUP 1 AJA MBAK");
        }
    }

    //setter method
    public void setTemanKencan(Pria temanKencan) {
        this.temanKencan = temanKencan;
    }

    public void setJumlahCinta(double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public void setJodoh(Pria jodoh) {
        this.jodoh = jodoh;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setStandarJumlahCinta(double standarJumlahCinta) {
        this.standarJumlahCinta = standarJumlahCinta;
    }

    //getter method

    public double getJumlahCinta() {
        return jumlahCinta;
    }

    public double getStandarJumlahCinta() {
        return standarJumlahCinta;
    }

    public String getStatus() {
        return status;
    }

    public int getUsia() {
        return usia;
    }

    public String getNama() {
        return nama;
    }

    public Pria getJodoh() {
        return jodoh;
    }

    public Pria getTemanKencan() {
        return temanKencan;
    }
}
