
package laundry;

import java.util.ArrayList;
public class JenisLaundry {
    
    private ArrayList<String> JenisLaundry = new ArrayList<String>(); 
    private ArrayList<Integer> durasi = new ArrayList<Integer>(); 
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public JenisLaundry (){
        this.JenisLaundry.add("Seragam/Set");
        this.harga.add(15000);
        this.durasi.add(0);
        
        
        this.JenisLaundry.add("Baju/Kg ");
        this.harga.add(12000);
        this.durasi.add(0);
        
        
        this.JenisLaundry.add("Celana/Kg");
        this.harga.add(5000);
        this.durasi.add(0);
        
        
        this.JenisLaundry.add("Selimut/Pcs");
        this.harga.add(14000);
        this.durasi.add(0);
        
        
    }
    public int getJmlJenisLaundry(){
        return this.JenisLaundry.size();
    }
    public void setJenisLaundry(String namaBarang ){ 
        this.JenisLaundry.add(namaBarang);
    }
    public String getJenisLaundry(int idBarang){
        return this.JenisLaundry.get(idBarang);
    }
    public void setDurasi(int Durasi ){ 
        this.durasi.add(Durasi);
    }
    public int getDurasi(int idBarang){ 
        return this.durasi.get(idBarang);
    }
    public void editDurasi(int idBarang, int Durasi){ 
        this.durasi.set(idBarang, Durasi);
    }
    public void setHarga(int harga ){ 
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){ 
        return this.harga.get(idBarang);
}
}

