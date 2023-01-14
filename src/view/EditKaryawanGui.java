package view;

import controller.AllObjController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditKaryawanGui {
    JFrame baru = new JFrame();
    JLabel EditKaryawan, top;
    JTextField textnomorr, textpilih, textdatabaru;
    JLabel labelidkursus, labelpilih, labeldatabaru, labelnomorr, Labeldata, LabelPassword, Labelumur, LabelName, LabelAlamat, kelaslabel, LabelNama;
    JButton tambah, hapus, edit, exit;
    JPasswordField passwordlogin, alamat;

    JTable tabelakun = new JTable();
    JScrollPane scrollstaff = new JScrollPane(tabelakun);

    public EditKaryawanGui() {
        baru.setSize(500, 500);
        baru.setLayout(null);
        baru.getContentPane().setBackground(Color.WHITE);
        scrollstaff.setBounds(470, 180, 500, 200);

//Tabel
        tabelakun.setModel(AllObjController.dataKaryawanController.DaftarKaryawan());
        baru.add(scrollstaff);

        top = new JLabel("Edit Karyawan");
        top.setFont(new Font("Times New Roman", Font.BOLD, 20));
        top.setBounds(470, 60, 210, 100);
        baru.add(top);

        //Edit Buku
        EditKaryawan = new JLabel("Edit Karyawan");
        EditKaryawan.setFont(new Font("Times New Roman", Font.BOLD, 20));
        EditKaryawan.setBounds(250, 60, 210, 100);
        baru.add(EditKaryawan);

        labelpilih = new JLabel("Masukkan Pilihan : ");
        labelpilih.setBounds(250, 170, 150, 50);
        baru.add(labelpilih);
        textpilih = new JTextField();
        textpilih.setBounds(250, 200, 200, 30);
        baru.add(textpilih);

        LabelName = new JLabel("Menu edit : ");
        LabelName.setBounds(250, 110, 100, 50);
        baru.add(LabelName);
        Labeldata = new JLabel("1. Nama");
        Labeldata.setBounds(250, 125, 150, 50);
        baru.add(Labeldata);
        Labeldata = new JLabel("2. Alamat");
        Labeldata.setBounds(250, 140, 150, 50);
        baru.add(Labeldata);
        Labeldata = new JLabel("3.Umur ");
        Labeldata.setBounds(250, 155, 150, 50);
        baru.add(Labeldata);

        labelnomorr = new JLabel("Masukan No :");
        labelnomorr.setBounds(250, 230, 170, 30);
        baru.add(labelnomorr);
        textnomorr = new JTextField();
        textnomorr.setBounds(250, 260, 200, 30);
        baru.add(textnomorr);

        labeldatabaru = new JLabel("Masukkan Data Baru :");
        labeldatabaru.setBounds(250, 290, 170, 30);
        baru.add(labeldatabaru);
        textdatabaru = new JTextField();
        textdatabaru.setBounds(250, 315, 200, 30);
        baru.add(textdatabaru);

        edit = new JButton("Edit");
        edit.setBounds(250, 350, 100, 30);
        edit.setBackground(Color.WHITE);
        baru.add(edit);


        exit = new JButton("Keluar");
        exit.setBounds(250, 400, 100, 30);
        exit.setBackground(Color.WHITE);
        baru.add(exit);

        baru.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        baru.setVisible(true);
        baru.setLocationRelativeTo(null);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    MenuGui menuGui = new MenuGui();
                    baru.dispose();

                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(
                            null, "Salah", "information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int nomorrR = Integer.parseInt(textnomorr.getText());
                    String data = textdatabaru.getText();
                    int pilihH = Integer.parseInt(textpilih.getText());
                    switch (pilihH) {
                        case 1:
                            AllObjController.dataKaryawanController.UpdateDAT(nomorrR,1, data);
                            break;
                        case 2:
                            AllObjController.dataKaryawanController.UpdateDAT(nomorrR,2, data);
                            break;
                        case 3:
                            AllObjController.dataKaryawanController.UpdateDAT(nomorrR,3, data);
                            break;
                        default:
                    }
                    JOptionPane.showMessageDialog(null, " Data Berhasil Diedit ", "information", JOptionPane.INFORMATION_MESSAGE);
                    EditKaryawanGui editKaryawan = new EditKaryawanGui();
                    baru.dispose();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(
                            null, "Nomor Tidak Ada", "information", JOptionPane.INFORMATION_MESSAGE);

                }
            }

        });

    }
}
