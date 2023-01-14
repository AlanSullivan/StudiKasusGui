//package view;
//
//import entity.DataKaryawanEntity;
//import model.DataKaryawanModel;
//import controller.DataKaryawanController;
//
//import java.util.Scanner;
//
//public class DataKaryawanView implements ViewInterface{
//    Scanner input = new Scanner(System.in);
//    DataKaryawanController data = new DataKaryawanController();
//
//    public void menu(){
//        String pilih;
//        do {
//            System.out.println("""
//                    1. Tambah Karyawan
//                    2. View Karyawan
//                    3. Update Data
//                    4. Hapus data
//                    5. Exit
//                    """);
//            System.out.print("Masukkan Pilihan = ");
//            pilih = input.nextLine();
//            switch (pilih){
//                case "1" -> insert();
//                case "2" -> view();
//                case "3" -> update();
//                case "4" -> hapusData();
//                case "5" -> System.out.println("exit");
//                default -> System.out.println("inputan tidak ada");
//            }
//        }while (!pilih.equals("5"));
//    }
//
//    public void insert(){
//        System.out.print("Masukkan Username = ");
//        String username = input.nextLine();
//        System.out.print("Masukkan Password = ");
//        String password = input.nextLine();
//        System.out.print("Masukkan Nama     = ");
//        String nama = input.nextLine();
//        System.out.print("Masukan Alamat    = ");
//        String alamat = input.nextLine();
//        System.out.print("Masukan Umur      = ");
//        int umur = input.nextInt();
//        input.nextLine();
//
//        data.tambahData(username,password,nama,alamat,umur);
//    }
//
//    public void view(){
//        for(DataKaryawanEntity objek : DataKaryawanModel.all()){
//            System.out.println();
//            System.out.println("=============================");
//            System.out.println("Nama Karyawan       = " + objek.getNama());
//            System.out.println("Umur Karyawan       = " + objek.getUmur());
//            System.out.println("Alamat Karyawan     = " + objek.getAlamat());
//            System.out.println("=============================");
//        }
//    }
//
//    public void update(){
//        System.out.print("Masukkan nama Yang akan diedit    = ");
//        String cariNama = input.nextLine();
//        DataKaryawanEntity data1 = DataKaryawanModel.cari(cariNama);
//        if(data1!=null){
//            System.out.print("Masukkan Username = ");
//            String username = input.nextLine();
//            System.out.print("Masukkan Password = ");
//            String password = input.nextLine();
//            System.out.print("Masukkan Nama     = ");
//            String nama = input.nextLine();
//            System.out.print("Masukan Alamat    = ");
//            String alamat = input.nextLine();
//            System.out.print("Masukan Umur      = ");
//            int umur = input.nextInt();
//            input.nextLine();
//            data1.setUsername(username);
//            data1.setPassword(password);
//            data1.setNama(nama);
//            data1.setAlamat(alamat);
//            data1.setUmur(umur);
//        }
//        else {
//            System.out.println("Data Tidak Ada");
//        }
//    }
//
//    public void hapusData(){
//        System.out.print("Masukkan nama Yang akan dihapus    = ");
//        String cariNama = input.nextLine();
//        DataKaryawanEntity data1 = DataKaryawanModel.cari(cariNama);
//        if(data1!=null){
//            data.remove(cariNama);
//            System.out.println("Berhasil Dihapus");
//        }
//        else{
//            System.out.println("data Tidak Ada");
//        }
//    }
//}
