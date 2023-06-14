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
public class dataMahasiswa {
    private ArrayList <Integer> nama;
    private ArrayList <Integer> npm;
    private ArrayList <Integer> kelas;
    private ArrayList <Integer> fakultas;
    private ArrayList <Integer> jurusan;
    private ArrayList <Integer> tempat_lahir;
    private ArrayList <Integer> tanggal_lahir;
    private ArrayList <Integer> agama;
    private ArrayList <Integer> jenis_kelamin;
    private ArrayList <Integer> telpon;
    
    public dataMahasiswa (){
        nama = new ArrayList <Integer>();
        npm = new ArrayList <Integer>();
        kelas = new ArrayList <Integer>();
        fakultas = new ArrayList <Integer>();
        jurusan = new ArrayList <Integer>();
        tempat_lahir = new ArrayList <Integer>();
        tanggal_lahir = new ArrayList <Integer>();
        agama = new ArrayList <Integer>();
        jenis_kelamin = new ArrayList <Integer>();
        telpon = new ArrayList <Integer>();
    };
    
    
    public void insertNama(Integer isi){
    this.nama.add(isi);
    }
    
    public ArrayList <Integer> getRecordNama(){
        return this.nama;
    }
    
    public void insertNpm(Integer isi){
    this.npm.add(isi);
    }
    
    public ArrayList <Integer> getRecordNpm(){
        return this.npm;
    }
    
    public void insertKelas(Integer isi){
    this.kelas.add(isi);
    }
    
    public ArrayList <Integer> getRecordKelas(){
        return this.kelas;
    }
    
    public void insertFakultas(Integer isi){
    this.fakultas.add(isi);
    }
    
    public ArrayList <Integer> getRecordFakultas(){
        return this.fakultas;
    }
    
    public void insertJurusan(Integer isi){
    this.jurusan.add(isi);
    }
    
    public ArrayList <Integer> getRecordJurusan(){
        return this.jurusan;
    }
    
    public void insertTempat_lahir(Integer isi){
    this.tempat_lahir.add(isi);
    }
    
    public ArrayList <Integer> getRecordTempat_lahir(){
        return this.tempat_lahir;
    }
    
    public void insertTanggal_lahir(Integer isi){
    this.tanggal_lahir.add(isi);
    }
    
    public ArrayList <Integer> getRecordTanggal_lahir(){
        return this.tanggal_lahir;
    }
    
    public void insertAgama(Integer isi){
    this.agama.add(isi);
    }
    
    public ArrayList <Integer> getRecordAgama(){
        return this.agama;
    }
    
    public void insertJenis_kelamin(Integer isi){
    this.jenis_kelamin.add(isi);
    }
    
    public ArrayList <Integer> getRecordJenis_kelamin(){
        return this.jenis_kelamin;
    }
    
    public void insertTelpon(Integer isi){
    this.telpon.add(isi);
    }
    
    public ArrayList <Integer> getRecordTelpon(){
        return this.telpon;
    }
}
