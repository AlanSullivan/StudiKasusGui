package view;

import controller.AllObjectController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HapusGui {
    JFrame Hapus = new JFrame();
    JLabel labelpilih;;

    JTable tabelakun = new JTable();

    JTextField textpilih;
    JButton  hapus,keluar;
    JScrollPane scrollstaff = new JScrollPane(tabelakun);

    public HapusGui() {
        //tabel
        tabelakun.setModel(AllObjectController.dataKaryawanController.DaftarKaryawan());

        scrollstaff.setBounds(470, 180, 500, 200);

        Hapus.setSize(1000, 500);
        Hapus.setLayout(null);
        Hapus.add(scrollstaff);

        labelpilih = new JLabel("Masukan Urutan : ");
        labelpilih.setBounds(250, 160, 150, 50);
        Hapus.add(labelpilih);
        textpilih = new JTextField();
        textpilih.setBounds(250, 200, 200, 30);
        Hapus.add(textpilih);

        hapus = new JButton("Hapus");
        hapus.setBounds(250, 240, 100, 30);
        hapus.setBackground(Color.WHITE);
        Hapus.add(hapus);

        keluar = new JButton("Keluar");
        keluar.setBounds(250, 280, 100, 30);
        keluar.setBackground(Color.WHITE);
        Hapus.add(keluar);

        Hapus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hapus.setVisible(true);
        Hapus.setLocationRelativeTo(null);

        keluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuGui menuGui = new MenuGui();
                Hapus.dispose();
            }
        });
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int index = Integer.parseInt(textpilih.getText());
                    AllObjectController.dataKaryawanController.remove(index);

                    JOptionPane.showMessageDialog(null, " Data Berhasil Dihapus ", "information", JOptionPane.INFORMATION_MESSAGE);
                    HapusGui hapus = new HapusGui();
                    Hapus.dispose();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(
                            null, "Nomor Tidak Ada", "information", JOptionPane.INFORMATION_MESSAGE);

                }
            }

        });
    }
}