package sistem.absensi.sekolah.application;

import sistem.absensi.sekolah.data.Gender;
import sistem.absensi.sekolah.data.Presensi;
import sistem.absensi.sekolah.data.Siswa;

public class GenderApp {
    public static void main(String[] args) {

        Siswa siswa = new Siswa();
        siswa.setName("Gilberdi Axel Nathaniel Sinaga");
        siswa.setGender(Gender.M);
        siswa.setPresensi(Presensi.H);

        System.out.println(siswa.getName());
        System.out.println(siswa.getGender());
        System.out.println(siswa.getGender().getDescription());
        System.out.println(siswa.getPresensi());
        System.out.println(siswa.getPresensi().getDescription());
    }
}
