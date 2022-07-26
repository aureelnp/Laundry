
package laundry;

public class Pengaplikasian {
    public static void main (String [] args){
    
    //membuat objek dari class yang kemudian dipanggil dimain class
    //objek adalah sebuah variabel yang merupakan instance atau perwujudan dari Class.
    Client c = new Client (); 
    Petugas p = new Petugas (); 
    JenisLaundry j = new JenisLaundry (); 
    Transaksi t = new Transaksi ();
    Laporan l = new Laporan ();
    
    l.Laporan(p);
    l.laporan(j);
    l.laporan(c);
    l.laporan(t, j  );
    t.prosesTransaksi(c, t, j);
    l.laporan(t, j);
    l.laporan(j);
    l.laporan(c);
}
}

