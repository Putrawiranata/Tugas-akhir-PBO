/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.informasi.akademikkampus;

/**
 *
 * @author USER
 */
public class pembayaran {
 
    private String tanggal;
    private int jumlah;
    private int totalBayar;
    
    public pembayaran (){}
    
    //method set
    public void setTanggalPembayaran(String tanggal){
        this.tanggal = tanggal;
    }
    public void setJumlahPembayaran(int jumlah){
        this.jumlah = jumlah;
    }
    public void setTotalBayar(int totalBayar){
        this.totalBayar = totalBayar;
    }
    
    //method get
    public String getTanggalPembayaran(){
        return tanggal;
    }
    public int getJumlahPembayaran(){
        return jumlah;
    }
    public int getTotalBayaran(){
        return totalBayar;
    }
    
}

