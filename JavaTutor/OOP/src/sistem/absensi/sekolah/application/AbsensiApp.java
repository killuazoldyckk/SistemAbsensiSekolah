package sistem.absensi.sekolah.application;

import sistem.absensi.sekolah.data.Gender;
import sistem.absensi.sekolah.data.Presensi;
import sistem.absensi.sekolah.data.Siswa;

public class AbsensiApp {
    public static void main(String[] args) {

        Siswa siswa = new Siswa();
        siswa.setName("Gilberdi Axel Nathaniel Sinaga");
        siswa.setGender(Gender.M);
        siswa.setNis("211401039");
        siswa.setKelas("Kelas 12A");
        siswa.setPresensi(Presensi.H);

        System.out.println("Nama: " + siswa.getName());
        System.out.println("Gender: " + siswa.getGender());
        System.out.println("Deskripsi Gender: " + siswa.getGender().getDescription());
        System.out.println("NIS: " + siswa.getNis());
        System.out.println("Kelas: " + siswa.getKelas());
        System.out.println("Presensi: " + siswa.getPresensi());
        System.out.println("Deskripsi Presensi: " + siswa.getPresensi().getDescription());
    }
}
