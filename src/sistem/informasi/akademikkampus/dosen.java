/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.informasi.akademikkampus;

/**
 *
 * @author ASUS
 */
public class dosen {
    
    private String nama;
    private String tempatlahir;
    private int tanggallahir;
    private String agama;
    private String jeniskelamin;
    private int telpon;
    private String email;
    private String alamat;
    
    public dosen(String nama, String tempatLahir, int tanggalLahir, String agama, String jenisKelamin, int telpon,
            String email, String alamat){ //Constructor Overload
        setnama(nama);
        settempatlahir(tempatlahir);
        settanggallahir(tanggallahir);
        setagama(agama);
        setjeniskelamin(jeniskelamin);
        settelpon(telpon);
        setemail(email);
        setalamat(alamat);
    }
    
    //method set
    public void setnama(String nama){
        this.nama = nama;
    }
    public void settempatlahir(String tempatlahir){
        this.tempatlahir = tempatlahir;
    }
    public void settanggallahir(int tanggallahir){
        this.tanggallahir = tanggallahir;
    }
    public void setagama(String agama){
        this.agama = agama;
    }
    public void setjeniskelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
    public void settelpon(int telpon){
        this.telpon = telpon;
    }
    public void setemail(String email){
        this.email = email;
    }
    public void setalamat(String alamat){
        this.alamat = alamat;
    }


    
    //method get
    public String getnama(){
        return nama;
    }
    public String gettempatlahir(){
        return tempatlahir;
    }
    public Integer gettanggallahir(){
        return tanggallahir;
    }
    public String getagama(){
        return agama;
    }
    public String getjeniskelamin(){
        return jeniskelamin;
    }
    public Integer gettelpon(){
        return telpon;
    }
    public String getemail(){
        return email;
    }
    public String getalamat(){
        return alamat;
    }
    
}
