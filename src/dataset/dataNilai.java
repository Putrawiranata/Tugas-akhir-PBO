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
public class dataNilai {
    private ArrayList <Integer> Npm;
    private ArrayList <String> Nama;
    private ArrayList <Integer> Matakuliah;
    private ArrayList <Integer> Absen;
    private ArrayList <Integer> Tugas;
    
    public dataNilai (){
        Npm = new ArrayList <Integer>();
        Nama = new ArrayList <String>();
        Matakuliah = new ArrayList <Integer>();
        Absen = new ArrayList <Integer>();
        Tugas = new ArrayList <Integer>();
    };
    
    
    public void insertNpm(Integer isi){
    this.Npm.add(isi);
    }
    
    public ArrayList <Integer> getRecordNpm(){
        return this.Npm;
    }
    
    public void insertNama(String isi){
    this.Nama.add(isi);
    }
    
    public ArrayList <String> getRecordNama(){
        return this.Nama;
    }
    
    public void insertMatakuliah(Integer isi){
    this.Matakuliah.add(isi);
    }
    
    public ArrayList <Integer> getMatakuliah_stok(){
        return this.Matakuliah;
    }
    
    public void insertTugas(Integer isi){
    this.Tugas.add(isi);
    }
    
    public ArrayList <Integer> getRecordTugas(){
        return this.Tugas;
    }
    
    public void insertAbsen(Integer isi){
    this.Absen.add(isi);
    }
    
    public ArrayList <Integer> getRecordAbsen(){
        return this.Absen;
    }
}
