package view;
import java.util.Scanner;
import controller.AdminController;
import controller.DataKaryawanController;

public class AdminView {
    Scanner input = new Scanner(System.in);
    AdminController objek =new AdminController();
    DataKaryawanController data = new DataKaryawanController();
    public void menu(){
        String pilih;
        do {
            System.out.println("""                 
                    1. Login Admin
                    2. Exit
                    """);
            System.out.print("Masukkan Pilihan = ");
            pilih = input.nextLine();
            switch (pilih){
                case "1" -> inputData();
                case "2" -> System.out.println("exit");
                default -> System.out.println("inputan tidak ada");
            }
        }while (!pilih.equals("2"));
    }

    private void inputData(){
        System.out.println();
        System.out.print("Masukkan Username anda :");
        String email = input.nextLine();
        System.out.print("Masukkan Password anda :");
        String password = input.nextLine();
        boolean cari = objek.cariData(email,password);
        if(cari){
         //   data.menuToAdmin();
        }
        else{
            System.out.println("Salah");
        }
    }
}
