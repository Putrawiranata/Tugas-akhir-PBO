
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package sistem.informasi.akademikkampus;
public class mahasiswa {
    
    private String nama;
    private String npm;
    private String kelas;
    private String fakultas;
    private String jurusan;
    private String tempatlahir;
    private String tanggallahir;
    private String agama;
    private String jeniskelamin;
    private String telpon;
    
    public mahasiswa (String nama, String npm, String kelas, String fakultas, String jurusan, String tempatlahir,
            String tanggallahir, String agama, String jeniskelamin, String telpon){ //Constructor Overload
        setNamaMahasiswa(nama);
        setNpm(npm);
        setKelas(kelas);
        setFakultas(fakultas);
        setJurusan(jurusan);
        setTempatLahir(tempatlahir);
        setTanggalLahir(tanggallahir);
        setAgama(agama);
        setJenisKelamin(jeniskelamin);
        setTelpon(telpon);
    }
    
    //method set
    public void setNamaMahasiswa(String nama){
        this.nama = nama;
    }
    public void setNpm(String npm){
        this.npm = npm;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setTempatLahir(String tempatlahir){
        this.tempatlahir = tempatlahir;
    }
    public void setTanggalLahir(String tanggallahir){
        this.tanggallahir = tanggallahir;
    }
    public void setAgama(String agama){
        this.agama = agama;
    }
    public void setJenisKelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
    public void setTelpon(String telpon){
        this.telpon = telpon;
    }
    
    //method get
    public String getNamaMahasiswa(){
        return nama;
    }
    public String getNpm(){
        return npm;
    }
    public String getKelas(){
        return kelas;
    }
    public String Fakultas(){
        return fakultas;
    }
    public String getJurusan(){
        return jurusan;
    }
    public String getTempatLahir(){
        return tempatlahir;
    }
    public String getTanggalLahir(){
        return tanggallahir;
    }
    public String getAgama(){
        return agama;
    }
    public String getJenisKelamin(){
        return jeniskelamin;
    }
    public String getTelpon(){
        return telpon;
    }
    
}

    

