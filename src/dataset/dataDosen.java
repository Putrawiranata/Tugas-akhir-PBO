/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author ASUSX411N
 */
public class dataDosen {
    private ArrayList <String> nama;
    private ArrayList <String> tempat_lahir;
    private ArrayList <Integer> tanggal_lahir;
    private ArrayList <String> agama;
    private ArrayList <String> jeniskelamin;
    private ArrayList <Integer> telpon;
    private ArrayList <String> email;
    private ArrayList <String> alamat;
    
    public dataDosen (){
        nama = new ArrayList <String>();
        tempat_lahir = new ArrayList <String>();
        tanggal_lahir = new ArrayList <Integer>();
        agama = new ArrayList <String>();
        jeniskelamin = new ArrayList <String>();
        telpon = new ArrayList <Integer>();
        email = new ArrayList <String>();
        alamat = new ArrayList <String>();
    };
    

    public void insertnama(String isi){
    this.nama.add(isi);
    }
    
    public ArrayList <String> getRecordnama(){
        return this.nama;
    }
    
    public void inserttempat_lahir(String isi){
    this.tempat_lahir.add(isi);
    }
    
    public ArrayList <String> getRecordtempat_lahir(){
        return this.tempat_lahir;
    }
    
    public void inserttanggal_lahir(Integer isi){
    this.tanggal_lahir.add(isi);
    }
    
    public ArrayList <Integer> getRecordtanggal_lahir(){
        return this.tanggal_lahir;
    }
    
    public void insertagama(String isi){
    this.agama.add(isi);
    }
    
    public ArrayList <String> getRecordagama(){
        return this.agama;
    }
    
    public void insertjeniskelamin(String isi){
    this.jeniskelamin.add(isi);
    }
    
    public ArrayList <String> getRecordjeniskelamin(){
        return this.jeniskelamin;
    }
    
    public void inserttelpon(Integer isi){
    this.telpon.add(isi);
    }
    
    public ArrayList <Integer> getRecordtelpon(){
        return this.telpon;
    }
    
    public void insertemail(String isi){
    this.email.add(isi);
    }
    
    public ArrayList <String> getRecordemail(){
        return this.email;
    }
    
    public void insertalamat(String isi){
    this.alamat.add(isi);
    }
    
    public ArrayList <String> getRecordalamat(){
        return this.alamat;
    }

}