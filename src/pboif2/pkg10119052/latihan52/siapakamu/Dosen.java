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
public class Dosen extends Manusia{
    private String nip,mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public void mengajarApa(){
        System.out.println("“Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar matakuliah PBO”");
    }
    @Override
    public void siapaKamu(){
        System.out.println("“Saya Dosen”");
    }
}
