/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.informasi.akademikkampus;

/**
 *
 * @author USER
 */
public class Nilai {
    
    
    
    private String Npm;
    private String Nama;
    private String Matakuliah;
    private String Absen;
    private String Tugas;
    
    
    public Nilai(String Npm, String Nama, String Matakuliah, String Absen, String Tugas ){
        setNpm(Npm);
        setNama(Nama);
        setMatakuliah(Matakuliah);
        setAbsen(Absen);
        setTugas(Tugas);         
    }
    
    //method set
    public void setNpm(String Npm){
        this.Npm = Npm;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setMatakuliah(String Matakuliah){
        this.Matakuliah = Matakuliah;
    }
    public void setAbsen(String Absen){
        this.Absen = Absen;
    }
    public void setTugas(String Tugas){
        this.Tugas = Tugas;
    }
    
    //method get
    

    private void setNpm(int Npm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    private void setTugas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private void setNama(int Nama) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setMatakuliah(int Matakuliah) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setAbsen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
    

