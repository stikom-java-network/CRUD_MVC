package Controller;

import Model.ModelMahasiswa;
import java.util.ArrayList;

public class ControllerMahasiswa {
     ArrayList<ModelMahasiswa> ListMahasiswa = new ArrayList<>();

    public ControllerMahasiswa() {
    }

    public ArrayList<ModelMahasiswa> getListMahasiswa() {
        return ListMahasiswa;
    }

    public void setListMahasiswa(ArrayList<ModelMahasiswa> ListMahasiswa) {
        this.ListMahasiswa = ListMahasiswa;
    }


     public void insertData(String nim, String nama, String prodi, String jk, String alamat) {
        ModelMahasiswa a = new ModelMahasiswa(nim, nama, prodi, jk, alamat);
        ListMahasiswa.add(a);
    }
     
     public void updateData(int position, String nim, String nama, String prodi, String jk, String alamat) {
        ModelMahasiswa a = new ModelMahasiswa(nim, nama, prodi, jk, alamat);
        ListMahasiswa.get(position).setNim(nim);
        ListMahasiswa.get(position).setNama(nama);
        ListMahasiswa.get(position).setProdi(prodi);
        ListMahasiswa.get(position).setJk(jk);
        ListMahasiswa.get(position).setAlamat(alamat);

    } 
     
    public void deleteData(int position) {
        ListMahasiswa.remove(position);

    }

    public int getArraySize() {
        return ListMahasiswa.size();
    } 
     
}
