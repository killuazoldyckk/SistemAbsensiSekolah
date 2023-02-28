package sistem.absensi.sekolah.data;

public class Siswa extends Person {
    // Encapsulation: memastikan data sensitif sebuah object tersembunyi dari akses luar
    // dengan membuat semua field memiliki access modifier private dengan tujuan agar data
    // sebuah object tetap baik dan valid
    private Presensi presensi;
    private String nis;
    private String kelas;

    public Presensi getPresensi() {
        return presensi;
    }

    public void setPresensi(Presensi presensi) {
        this.presensi = presensi;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
