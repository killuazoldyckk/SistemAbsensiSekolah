package sistem.absensi.sekolah.data;

public enum Gender {
    M("Laki-Laki"),
    W("Perempuan");

    private String description;

    Gender(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
