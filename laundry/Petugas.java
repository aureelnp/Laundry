
package laundry;

import java.util.ArrayList;
public class Petugas implements User {
private ArrayList<String> namaPetugas = new ArrayList<String>(); 
private ArrayList<String> alamat = new ArrayList<String>(); 
private ArrayList<String> telepon = new ArrayList<String>(); 
private ArrayList<String> jabatan = new ArrayList<String>();

public Petugas (){
    this.namaPetugas.add("Salsa");
    this.alamat.add("Malang");
    this.telepon.add("081323879975");
    this.jabatan.add("Pemilik toko");
    
    this.namaPetugas.add("Shifa");
    this.alamat.add("Lesanpuro");
    this.telepon.add("088740248515");
    this.jabatan.add("Petugas cuci");
    
    this.namaPetugas.add("Alya");
    this.alamat.add("Sukoharjo");
    this.telepon.add("080152953856");
    this.jabatan.add("Petugas setrika");
    
    this.namaPetugas.add("Alika");
    this.alamat.add("Danau Tambingan");
    this.telepon.add("080238749625");
    this.jabatan.add("Petugas packing");
}
public void setJabatan(String jabatan){
    this.jabatan.add(jabatan);
}
public String getJabatan(int id){
    return this.jabatan.get(id);
}
public int getJmlPetugas(){
    return this.namaPetugas.size();
}

    @Override
    public void setNama(String namaKaryawan) {
        this.namaPetugas.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaPetugas.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaPetugas.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaPetugas.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }
    
}
