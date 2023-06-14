/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.informasi.akademikkampus;

/**
 *
 * @author Asus X441N
 */
public class tagihan {
    private int no_struk;
    private int kode_tagihan;
    private int jumlah_tagihan;
    private int total_tagihan;
    
    //Method
    
    // Constructor
    public tagihan(int no_struk, int kode_tagihan, int jumlah_tagihan, int total_tagihan) {
        this.no_struk = no_struk;
        this.kode_tagihan = kode_tagihan;
        this.jumlah_tagihan = jumlah_tagihan;
        this.total_tagihan = total_tagihan;
    }

    // Getter and Setter for no_struk
    public int getNoStruk() {
        return no_struk;
    }

    public void setNoStruk(int no_struk) {
        this.no_struk = no_struk;
    }

    // Getter and Setter for kode_tagihan
    public int getKodeTagihan() {
        return kode_tagihan;
    }

    public void setKodeTagihan(int kode_tagihan) {
        this.kode_tagihan = kode_tagihan;
    }

    // Getter and Setter for jumlah_tagihan
    public int getJumlahTagihan() {
        return jumlah_tagihan;
    }

    public void setJumlahTagihan(int jumlah_tagihan) {
        this.jumlah_tagihan = jumlah_tagihan;
    }

    // Getter and Setter for total_tagihan
    public int getTotalTagihan() {
        return total_tagihan;
    }

    public void setTotalTagihan(int total_tagihan) {
        this.total_tagihan = total_tagihan;
    }
}
