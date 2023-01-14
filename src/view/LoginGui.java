package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGui {

    JFrame LogReg = new JFrame();
    JLabel login, top;
    JTextField textkodelogin;
    JLabel LabelUsernamelogin, LabelPasswordLogin;
    JButton masuk,keluar;
    JPasswordField passwordlogin;

    public LoginGui() {

        LogReg.setSize(500, 500);
        LogReg.setLayout(null);
      //  LogReg.getContentPane().setBackground(Color.YELLOW);
        top = new JLabel("Data Karyawan");
        top.setBounds(90, 50, 500, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        LogReg.add(top);
        login = new JLabel("LOGIN");
        login.setBounds(190, 130, 500, 50);
        login.setFont(new Font("Times New Roman", Font.BOLD, 30));
        LogReg.add(login);


        LabelUsernamelogin = new JLabel("Username");
        LabelUsernamelogin.setBounds(200, 188, 300, 30);
        LabelUsernamelogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
        LogReg.add(LabelUsernamelogin);

        textkodelogin = new JTextField();
        textkodelogin.setBounds(105, 210, 280, 30);
        LogReg.add(textkodelogin);

        LabelPasswordLogin = new JLabel("Password");
        LabelPasswordLogin.setBounds(200, 255, 100, 30);
        LabelPasswordLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
        LogReg.add(LabelPasswordLogin);

        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(105, 279, 280, 30);
        LogReg.add(passwordlogin);

        masuk = new JButton("MASUK");
        masuk.setBounds(105, 320, 80, 30);
        masuk.setBackground(Color.WHITE);
        LogReg.add(masuk);

        keluar = new JButton("KELUAR");
        keluar.setBounds(280, 320, 105, 30);
        keluar.setBackground(Color.WHITE);
        LogReg.add(keluar);

        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);

        masuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    AllObjectView.adminControl.login(textkodelogin.getText(), passwordlogin.getText());
                    JOptionPane.showMessageDialog(null, "selamat datang " , "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    MenuGui mgui = new MenuGui();
                    LogReg.dispose();

                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(
                            null, "Kode atau password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

    }
    void kosong (){

        textkodelogin.setText(null);
        passwordlogin.setText(null);
    }
}

