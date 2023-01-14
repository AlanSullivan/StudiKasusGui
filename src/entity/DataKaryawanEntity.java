package entity;

public class DataKaryawanEntity extends Biodata{
    String nama,alamat;
    int umur;

    public DataKaryawanEntity(String username, String Jabatan, String nama, String alamat, int umur) {
        super(username, Jabatan);
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
