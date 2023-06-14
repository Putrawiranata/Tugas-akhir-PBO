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
public class dataMatakuliah {
    private ArrayList <Integer> visual;
    private ArrayList <Integer> sbd;
    private ArrayList <Integer> pbo;
    private ArrayList <Integer> web2;
    
    public dataMatakuliah (){
        visual = new ArrayList <Integer>();
        sbd = new ArrayList <Integer>();
        pbo = new ArrayList <Integer>();
        web2 = new ArrayList <Integer>();
    };
    

    public void insertVisual(Integer isi){
    this.visual.add(isi);
    }
    
    public ArrayList <Integer> getRecordVisual(){
        return this.visual;
    }
    
    public void insertSbd(Integer isi){
    this.sbd.add(isi);
    }
    
    public ArrayList <Integer> getRecordSbd(){
        return this.sbd;
    }
    
    public void insertPbo(Integer isi){
    this.pbo.add(isi);
    }
    
    public ArrayList <Integer> getRecordPbo(){
        return this.pbo;
    }
    
    public void insertWeb2(Integer isi){
    this.web2.add(isi);
    }
    
    public ArrayList <Integer> getRecordWeb2(){
        return this.web2;
    }
}
