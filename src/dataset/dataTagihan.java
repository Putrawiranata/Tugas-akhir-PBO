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
public class dataTagihan {
    private ArrayList <Integer> no_struk;
    private ArrayList <Integer> kode_tagihan;
    private ArrayList <Integer> jumlah_tagihan;
    private ArrayList <Integer> total_tagihan;
    
    public dataTagihan (){
        no_struk = new ArrayList <Integer>();
        kode_tagihan = new ArrayList <Integer>();
        jumlah_tagihan = new ArrayList <Integer>();
        total_tagihan = new ArrayList <Integer>();
    };
    
    
    public void insertNo_struk(Integer isi){
    this.no_struk.add(isi);
    }
    
    public ArrayList <Integer> getRecordNo_struk(){
        return this.no_struk;
    }
    
    public void insertKode_tagihan(Integer isi){
    this.kode_tagihan.add(isi);
    }
    
    public ArrayList <Integer> getRecordKode_tagihan(){
        return this.kode_tagihan;
    }
    
    public void insertJumlah_tagihan(Integer isi){
    this.jumlah_tagihan.add(isi);
    }
    
    public ArrayList <Integer> getRecordJumlah_tagihan(){
        return this.jumlah_tagihan;
    }
    
    public void insertTotal_tagihan(Integer isi){
    this.total_tagihan.add(isi);
    }
    
    public ArrayList <Integer> getRecordTotal_tagihan(){
        return this.total_tagihan;
    }
}