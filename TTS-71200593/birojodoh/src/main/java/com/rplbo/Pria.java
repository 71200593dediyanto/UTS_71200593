package com.rplbo;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private double jumlahCinta;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    public Pria(String nama,int usia){
        this.nama = nama;
        this.usia = usia;
    }

    public void PDKT(Perempuan calon){
        if (this.getTemanKencan() == null){
            setTemanKencan(calon);
            calon.setTemanKencan(this);
        }else{
            System.out.println("JANGAN SELINGKUH MAS HEI TOLONG");
        }

    }

    public void MengajakKencan(Perempuan perempuan){
        if (this.getTemanKencan() == null || this.getTemanKencan() == perempuan){
            this.setJumlahCinta(getJumlahCinta()+1.0);
            perempuan.setJumlahCinta(getJumlahCinta()+1.0);
        }else{
            System.out.println("KAU JANGAN TIDAK SETIA, JANGAN KAU AJAK CEWEK LAIN JALAN!!");
        }
    }

    public void MenembakKekasih(){
        if (this.getTemanKencan() == null){
            System.out.println("SIAPA YANG MAU KAU TEMBAK :') | JANGAN " +
                    "NGAYAL DEH Vito !!!");
        }else {
            if (getJumlahCinta() > temanKencan.getStandarJumlahCinta()){
                this.setJodoh(temanKencan);
                this.setStatus("Pacaran");
                temanKencan.setJodoh(this);
                temanKencan.setStatus("Pacaran");
                System.out.println("SELAMAT KAMU DITERIMA :D |" +
                        "SELAMAT MENJALANI HIDUP BARU Farel");
            }else {
                temanKencan.setTemanKencan(null);
                this.setTemanKencan(null);
                System.out.println("Maaf anda kurang beruntung" +
                        "anda jadi badut dia aja :)");
            }
        }
    }

    //getter method

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getStatus() {
        return status;
    }

    public double getJumlahCinta() {
        return jumlahCinta;
    }

    public Perempuan getJodoh() {
        return jodoh;
    }

    public Perempuan getTemanKencan() {
        return temanKencan;
    }

    //setter method

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setJumlahCinta(double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }

    public static void main(String[] args) {

    }
}
