package Model;

public class ModelMahasiswa {
    String nim,nama,prodi,jk,alamat;
    
    public ModelMahasiswa(){
    }

    public ModelMahasiswa(String nim, String nama, String prodi, String jk, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.jk = jk;
        this.alamat = alamat;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
