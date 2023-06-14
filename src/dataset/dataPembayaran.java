/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author Asus X441N
 */
public class dataPembayaran {
    private ArrayList <Integer> tanggal;
    private ArrayList <Integer> jumlah;
    private ArrayList <String> total_bayar;
    
    public dataPembayaran (){
        tanggal = new ArrayList <Integer>();
        jumlah = new ArrayList <Integer>();
        total_bayar = new ArrayList <String>();
    };
    

    public void insertTanggal(Integer isi){
    this.tanggal.add(isi);
    }
    
    public ArrayList <Integer> getRecordTanggal(){
        return this.tanggal;
    }
    
    public void insertJumlah(Integer isi){
    this.jumlah.add(isi);
    }
    
    public ArrayList <Integer> getRecordJumlah(){
        return this.jumlah;
    }
    
    public void insertTotal_bayar(String isi){
    this.total_bayar.add(isi);
    }
    
    public ArrayList <String> getRecordTotal_bayar(){
        return this.total_bayar;
    }
}
