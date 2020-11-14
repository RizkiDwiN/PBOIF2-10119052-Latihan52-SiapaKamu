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
public class Mahasiswa extends Manusia{
    private String nim,kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public void kelasApa (){
       System.out.println(" “Saya Rizki Dwi Nugraha umur 19 tahun sedang belajar di kelas PBOIF2”"); 
    }
     @Override
     public  void siapaKamu(){
    System.out.println("“Saya Mahasiswa”");
    }
}
