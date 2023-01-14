package view;

import controller.AllObjectController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TambahKaryawanGui {
    JFrame judul = new JFrame();
    JLabel tambahKaryawan, top;

    JTextField textalamat, textjabatan, textumur, textEmail, textNama;
    JLabel Labeljabatan, Labelumur, LabelName, LabelAlamat, LabelNama;
    JButton tambah, exit;
    JTable tabelakun = new JTable();
    JScrollPane scrollstaff = new JScrollPane(tabelakun);

    public TambahKaryawanGui() {

        judul.setSize(1000, 600);
        judul.setLayout(null);
        judul.getContentPane().setBackground(Color.WHITE);
        top = new JLabel("KARYAWAN");
        top.setBounds(290, 30, 500, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        judul.add(top);

        scrollstaff.setBounds(470, 180, 500, 200);

//Tabel
        tabelakun.setModel(AllObjectController.dataKaryawanController.DaftarKaryawan());
        judul.add(scrollstaff);

        tambahKaryawan = new JLabel("Daftar Karyawan");
        tambahKaryawan.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tambahKaryawan.setBounds(470, 60, 210, 100);
        judul.add(tambahKaryawan);

        tambahKaryawan = new JLabel("Tambah Data Karyawan");
        tambahKaryawan.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tambahKaryawan.setBounds(30, 60, 210, 100);
        judul.add(tambahKaryawan);

        judul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        judul.setVisible(true);
        judul.setLocationRelativeTo(null);
        LabelName = new JLabel("Email");
        LabelName.setBounds(30, 110, 100, 50);
        judul.add(LabelName);
        textEmail = new JTextField();
        textEmail.setBounds(30, 140, 200, 30);
        judul.add(textEmail);

        Labeljabatan = new JLabel("Bagian");
        Labeljabatan.setBounds(30, 170, 100, 30);
        judul.add(Labeljabatan);
        textjabatan = new JTextField();
        textjabatan.setBounds(30, 200, 200, 30);
        judul.add(textjabatan);

        LabelNama = new JLabel("Nama");
        LabelNama.setBounds(30, 230, 100, 50);
        judul.add(LabelNama);
        textNama = new JTextField();
        textNama.setBounds(30, 260, 200, 30);
        judul.add(textNama);

        LabelAlamat = new JLabel("Alamat");
        LabelAlamat.setBounds(30, 290, 100, 30);
        judul.add(LabelAlamat);
        textalamat = new JTextField();
        textalamat.setBounds(30, 320, 200, 30);
        judul.add(textalamat);

        Labelumur = new JLabel("Umur");
        Labelumur.setBounds(30, 350, 100, 30);
        judul.add(Labelumur);
        textumur = new JTextField();
        textumur.setBounds(30, 380, 200, 30);
        judul.add(textumur);

        tambah = new JButton("Tambah");
        tambah.setBounds(30, 480, 100, 30);
        tambah.setBackground(Color.WHITE);
        judul.add(tambah);

        exit = new JButton("Keluar");
        exit.setBounds(170, 480, 100, 30);
        exit.setBackground(Color.WHITE);
        judul.add(exit);

        judul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        judul.setVisible(true);
        judul.setLocationRelativeTo(null);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    MenuGui menuGui = new MenuGui();
                    judul.dispose();

                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(
                            null, "Salah", "information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String email   = textEmail.getText();
                    String jabatan = textjabatan.getText();
                    String nama    = textNama.getText();
                    String alamat  = textalamat.getText();
                    int umur = Integer.parseInt(textumur.getText());
                    AllObjectController.dataKaryawanController.tambahData(email,jabatan,nama,alamat,umur);
                    tabelakun.setModel(AllObjectController.dataKaryawanController.DaftarKaryawan());
                    JOptionPane.showMessageDialog(null, "Tambah Data Sukses ", "information", JOptionPane.INFORMATION_MESSAGE);
                TambahKaryawanGui tambahKaryawanGui = new TambahKaryawanGui();
                judul.dispose();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Tambah Buku Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

    }
}



