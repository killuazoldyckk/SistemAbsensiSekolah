package sistem.absensi.sekolah.data;

public enum Presensi {
    H("Hadir"),
    I("Izin"),
    S("Sakit"),
    A("Absen");

    private String description;

    Presensi(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
