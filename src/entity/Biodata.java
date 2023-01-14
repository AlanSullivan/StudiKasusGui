package entity;

public abstract class Biodata {
    private String Username;
    private String Jabatan;

    public Biodata(String username, String jabatan) {
        Username = username;
        this.Jabatan = jabatan;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }
}
