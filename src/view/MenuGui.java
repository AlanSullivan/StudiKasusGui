package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGui {
    JFrame menu = new JFrame();
    JLabel judul;
    JButton Tambah,Delete,Edit,Keluar;
    JTable tabelakun = new JTable();
    JScrollPane scrollstaff = new JScrollPane(tabelakun);

    public MenuGui (){
        menu.setSize(500, 500);
        menu.setLayout(null);

        judul= new JLabel("Pilihan Menu ");
        judul.setBounds(50, 50, 500, 50);
        judul.setFont(new Font("Times New Roman", Font.BOLD, 40));
        menu.add(judul);

        Tambah = new JButton("Tambah Karyawan");
        Tambah.setBounds(90, 100, 150, 30);
        Tambah.setBackground(Color.WHITE);
        menu.add(Tambah);

        Edit = new JButton("Edit Karyawan");
        Edit.setBounds(90, 150, 150, 30);
        Edit.setBackground(Color.WHITE);
        menu.add(Edit);

        Delete = new JButton("Hapus Karyawan");
        Delete.setBounds(90, 200, 150, 30);
        Delete.setBackground(Color.WHITE);
        menu.add(Delete);

        Keluar = new JButton("Keluar");
        Keluar.setBounds(90, 250, 150, 30);
        Keluar.setBackground(Color.WHITE);
        menu.add(Keluar);

        scrollstaff.setBounds(30, 40, 280, 250);
        menu.add(scrollstaff);

        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);

        Tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    TambahKaryawanGui tambahGui = new TambahKaryawanGui();
                    menu.dispose();
                }
        });

        Edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    EditKaryawanGui edit = new EditKaryawanGui();
                    menu.dispose();
                }
        });
        Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    HapusGui hapus = new HapusGui();
                    menu.dispose();
                }
        });
        Keluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    menu.dispose();
            }
        });
    }
}
