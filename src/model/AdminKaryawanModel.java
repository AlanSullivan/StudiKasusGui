package model;
import entity.AdminKaryawan;
import entity.DataKaryawanEntity;

import java.util.ArrayList;

public class AdminKaryawanModel {
    private static ArrayList<AdminKaryawan> arrayAdmin = new ArrayList<>();

    public static void initialData(){
        arrayAdmin.add(new AdminKaryawan("alan","1111","sialan"));
        arrayAdmin.add(new AdminKaryawan("intun","2222","intan"));
        arrayAdmin.add(new AdminKaryawan("dwi","3333","dwi"));
    }

    public static ArrayList<AdminKaryawan> all(){
        return arrayAdmin;
    }

    public int cekData(String Username, String passwordAdmin) {
        int loop = 0;
        for (AdminKaryawan adminentity : arrayAdmin) {
            if (adminentity.getUsername().equals(Username) && adminentity.getJabatan().equals(passwordAdmin)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
}
