package controller;

import entity.DataKaryawanEntity;
import model.AllObjectModel;
import model.DataKaryawanModel;


import javax.swing.table.DefaultTableModel;

public class DataKaryawanController {

    // public void menuToAdmin(){
    //   DataKaryawanView data = new DataKaryawanView();
    //  data.menu();
    //}
    public void tambahData(String username, String Jabatan, String nama, String alamat, int umur) {
        DataKaryawanModel.insert(username, Jabatan, nama, alamat, umur);
    }

    public void remove(int index) {
        DataKaryawanModel.hapus(index - 1);
    }


    public DefaultTableModel DaftarKaryawan() {
        DefaultTableModel daftarkaryawan = new DefaultTableModel();
        Object[] kolom = {"No", "Email", "Jabatan", "Nama", "Alamat", "Umur"};
        daftarkaryawan.setColumnIdentifiers(kolom);
        int size = AllObjectModel.dataKaryawanModel.all().size();
        for (int i = 0; i < size; i++) {

            Object[] data = new Object[6];
            data[0] = i + 1;
            data[1] = AllObjectModel.dataKaryawanModel.all().get(i).getUsername();
            data[2] = AllObjectModel.dataKaryawanModel.all().get(i).getJabatan();
            data[3] = AllObjectModel.dataKaryawanModel.all().get(i).getNama();
            data[4] = AllObjectModel.dataKaryawanModel.all().get(i).getAlamat();
            data[5] = AllObjectModel.dataKaryawanModel.all().get(i).getUmur();

            daftarkaryawan.addRow(data);
        }
        return daftarkaryawan;
    }

    public void UpdateDAT(int index, int pilih, String data) {
        AllObjectModel.dataKaryawanModel.update(index-1, pilih, data);
    }
}
