package sistem.absensi.sekolah.data;

public class Siswa {

    //Encapsulation : memastikan data sensitif sebuah object tersembunyi dari akses luar
    //dengan membuat semua field memiliki access modifier private dengan tujuan agar data
    //sebuah object tetap baik dan valid
    private String name;

    private Gender gender;

    private Presensi presensi;

    public Presensi getPresensi() {
        return presensi;
    }

    public void setPresensi(Presensi presensi) {
        this.presensi = presensi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
