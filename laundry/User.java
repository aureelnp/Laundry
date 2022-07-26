
package laundry;

public interface User { 

    public void setNama (String nama); 
    public void setAlamat (String alamat); //set menambahkan memberi  data/nilai  variabel(bisa dilihat dari add)
    public void setTelepon (String telepon);
    
    public String getNama (int id); //get membaca nilai /mendapatkan nilai
    //punya return value string
    public String getAlamat (int id);
    public String getTelepon (int id);
    
}
