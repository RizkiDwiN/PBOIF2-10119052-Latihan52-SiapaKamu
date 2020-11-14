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
public class PBOIF210119052Latihan52SiapaKamu {

    public static void main(String[] args) {
        Dosen dosen = new  Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println();
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10118062");
        System.out.println("NIM MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
