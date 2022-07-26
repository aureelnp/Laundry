
package laundry;

import java.util.ArrayList; //menyimpan banyak data
public class Client implements User {
    private ArrayList<String> namaClient = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client(){
        this.namaClient.add("Aurellia");
        this.alamat.add("Sawojajar");
        this.telepon.add("085904146644");
        this.saldo.add(80000);
        
        this.namaClient.add("Zahra");
        this.alamat.add("\tSawojajar 2");
        this.telepon.add("081381401997");
        this.saldo.add(100000);
        
        this.namaClient.add("Putri");
        this.alamat.add("\tKedungkandang");
        this.telepon.add("081243485944");
        this.saldo.add(60000);
        
    }
    public void setSaldo(int saldo){ //method 
        this.saldo.add(saldo);
    }
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    public void editSaldo(int idMember, int saldo){
        this.saldo.set(idMember, saldo);
    }
    public int getJmlClient(){
        return this.saldo.size(); 
    }
    
    
    @Override
    public void setNama(String namaMember) {
        this.namaClient.add(namaMember);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaClient.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }
    
}