package model;

import entity.DataKaryawanEntity;

import java.util.ArrayList;

public class DataKaryawanModel {
    private final static ArrayList<DataKaryawanEntity> arrayKaryawan = new ArrayList<>();

    public static ArrayList<DataKaryawanEntity> all(){
        return arrayKaryawan;
    }

    public static DataKaryawanEntity cari(String nama){
        for(DataKaryawanEntity objekKaryawan:arrayKaryawan){
            if(objekKaryawan.getNama().equals(nama)){
                return objekKaryawan;
            }
        }
        return null;
    }


    public static void insert(String username, String Jabatan, String nama, String alamat, int umur){
        arrayKaryawan.add(new DataKaryawanEntity(username,Jabatan,nama,alamat,umur));
    }

    public static void hapus(int index){

        if(index != -1){
            arrayKaryawan.remove(index);
        }
    }

    public static int indexData(String nama){
        DataKaryawanEntity data = cari(nama);
        return arrayKaryawan.indexOf(data);
    }
    public int search (int index) {
        if (index < this.arrayKaryawan.size())
            return index;
        else
            return -1;
    }
    public void update(int index, int pilih,String data)
    {

        if (search(index)==-1)
        {

            System.out.println("data tidak ditemukan");
        }
        else
        {

            switch (pilih) {
                case 1:

                    arrayKaryawan.get(index).setNama(data);
                    break;
                case 2:

                    arrayKaryawan.get(index).setAlamat(data);
                    break;
                case 3:
                    arrayKaryawan.get(index).setUmur(Integer.parseInt(data));
                    break;
                default:
            }
        }
    }
}
