package com.rplbo.utsnota;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Nota {
    private String nonota;
    private String notelppembeli;
    private Item items;
    private String namapembeli;

    public Nota(String nonota,
                String namapembeli,String notelppembeli,Item items)
    {
        this.nonota = nonota;
        this.notelppembeli = notelppembeli;
        this.namapembeli = namapembeli;
        this.items = items;
    }

    public void setNotelppembeli(String notelppembeli) {
        this.notelppembeli = notelppembeli;
    }

    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public String getNonota() {
        return nonota;
    }

    public String getNamapembeli() {
        return namapembeli;
    }

    public void setNonota(String nonota) {
        this.nonota = nonota;
    }

    public void tampilNota(){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEE MMM d HH:mm:ss");

        System.out.println("NOTA PEMBELIAN \n" +
                "No Nota: "+getNonota() +
                "\nNama Pembeli: "+getNamapembeli() +
                "\nTelp Pembeli: "+getNotelppembeli() +
                "\nTgl: "+ date.format(format) + " WIB 2022"+
                "\n=====================================");
        int totalhvs=0;
        int totalbuku=0;
        int totalpulpen=0;

        for (BukuTulis i : items.getBktulis()){
            totalbuku += i.getHarga();
            i.getInformasi();
        }
        System.out.println("Sub Total: "+totalbuku);
        System.out.println("=====================================");

        for (KertasHVS i : items.getKrhvs()){
            totalhvs += i.getHarga();
            i.getInformasi();
        }
        System.out.println("Sub Total: "+totalhvs);
        System.out.println("=====================================");

        for (Pulpen i : items.getPen()){
            totalpulpen += i.getHarga();
            i.getInformasi();
        }
        System.out.println("Sub Total: "+totalpulpen);
        System.out.println("=====================================");

    }

    public String getNotelppembeli() {
        return notelppembeli;
    }

    public int hitungTotalBayar(){
        int totalbayar =0;

        for (BukuTulis i : items.getBktulis()){
            totalbayar += i.getHarga();
        }

        for (KertasHVS i : items.getKrhvs()){
            totalbayar += i.getHarga();
        }

        for (Pulpen i : items.getPen()){
            totalbayar += i.getHarga();
        }

        return totalbayar;
    }

}
