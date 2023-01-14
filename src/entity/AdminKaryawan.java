package entity;

public class AdminKaryawan extends Biodata{
    private String nama;

    public AdminKaryawan(String Username,String password,String nama) {
       super(Username,password);

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
