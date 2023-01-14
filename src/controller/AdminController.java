package controller;

import entity.AdminKaryawan;
import model.AdminKaryawanModel;
import java.util.ArrayList;

import model.AllObjectModel;
import view.AdminView;
public class AdminController {
    int indexLogin = 0;


    public void menuToMain(){
        AdminView admin = new AdminView();
        admin.menu();
    }
    public boolean cariData(String Username,String Password){
        ArrayList<AdminKaryawan> arrayAdmin = AdminKaryawanModel.all();
        for(AdminKaryawan objek : arrayAdmin){
            if(objek.getUsername().equals(Username) && objek.getJabatan().equals(Password)){
                return true;
            }

        }
        return false;
    }

    public void login(String Username, String passwordAdmin) {
        indexLogin = AllObjectModel.adminKaryawanModel.cekData(Username, passwordAdmin);
    }
}
