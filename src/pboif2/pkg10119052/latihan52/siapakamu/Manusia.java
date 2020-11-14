package pboif2.pkg10119052.latihan52.siapakamu;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Siapa Kamu dengan polymorpism
 * 
 */
public class Manusia {
     protected String nama;
   protected int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void siapaKamu(){
        System.out.println("saya manusia ");
    }
}
