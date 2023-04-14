import java.util.Scanner;
import java.util.HashMap;
public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni) {
        nim = ni;
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putri", "3H", "Struktur Data", 2828888));
        mhs.put("2", new Mahasiswa("Agus k", "3A", "Matematika", 2828812));
        mhs.put("3", new Mahasiswa("Arro", "3D", "Pemrograman", 2828817));

        System.out.println("Masukkan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama + ", Kelas : " + data.kelas + ", mata kuliah praktikum : " + data.matkulPraktikum + ", nim : " + data.nim);
        }
    }
}