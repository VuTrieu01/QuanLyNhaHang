package Login;

import Dao.TaiKhoanDao;
import Helper.DangNhap;
import Model.TaiKhoan;
import Window.adminPage;
import Window.userPage;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    public Login() {
        setTitle("Quản lý nhà hàng ");
        setUndecorated(true);
        ImageIcon webIcon = new ImageIcon("C:\\Users\\TRUYEN\\Desktop\\QuanLyNhaHang\\src\\image\\cutlery.png");
        setIconImage(webIcon.getImage());
        initComponents();
        setLocationRelativeTo(null); //Hiện giữa màn hình
        addPlaceholderStyle(NhapUsername);
        addPlaceholderStyle(NhapPassword);
    }

    public void addPlaceholderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.LIGHT_GRAY);
    }

    public void removePlaceholderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NhapUsername = new javax.swing.JTextField();
        ShowPassword = new javax.swing.JCheckBox();
        NhapPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPThoat = new javax.swing.JPanel();
        jLThoat = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/username.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(580, 130, 48, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lock.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 220, 50, 70);

        NhapUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NhapUsername.setForeground(new java.awt.Color(255, 255, 255));
        NhapUsername.setText("Username");
        NhapUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        NhapUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        NhapUsername.setOpaque(false);
        NhapUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NhapUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NhapUsernameFocusLost(evt);
            }
        });
        NhapUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(NhapUsername);
        NhapUsername.setBounds(640, 150, 330, 50);

        ShowPassword.setBackground(new java.awt.Color(51, 51, 51));
        ShowPassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        ShowPassword.setText("Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(ShowPassword);
        ShowPassword.setBounds(640, 300, 150, 30);

        NhapPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NhapPassword.setForeground(new java.awt.Color(255, 255, 255));
        NhapPassword.setText("Password");
        NhapPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        NhapPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        NhapPassword.setEchoChar('\u0000');
        NhapPassword.setOpaque(false);
        NhapPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NhapPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NhapPasswordFocusLost(evt);
            }
        });
        NhapPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(NhapPassword);
        NhapPassword.setBounds(640, 230, 330, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(730, 50, 160, 70);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPThoat.setBackground(new java.awt.Color(51, 51, 51));

        jLThoat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLThoat.setForeground(new java.awt.Color(255, 255, 255));
        jLThoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLThoat.setText("X");
        jLThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLThoatMouseClicked(evt);
            }
        });
        jLThoat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLThoatKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPThoatLayout = new javax.swing.GroupLayout(jPThoat);
        jPThoat.setLayout(jPThoatLayout);
        jPThoatLayout.setHorizontalGroup(
            jPThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLThoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPThoatLayout.setVerticalGroup(
            jPThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPThoatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        login.setBackground(new java.awt.Color(0, 153, 153));
        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        login.setText("Login");
        login.setToolTipText("");
        login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.setPreferredSize(new java.awt.Dimension(79, 29));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(560, 0, 440, 460);

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background_user.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 463);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NhapUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NhapUsernameFocusGained
        if (NhapUsername.getText().equals("Username")) {
            NhapUsername.setText(null);
            NhapUsername.requestFocus();
            removePlaceholderStyle(NhapUsername); //Loại bỏ chữ
        }
    }//GEN-LAST:event_NhapUsernameFocusGained

    private void NhapUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NhapUsernameFocusLost
        if (NhapUsername.getText().length() == 0) {
            addPlaceholderStyle(NhapUsername);
            NhapUsername.setText("Username");
        }
    }//GEN-LAST:event_NhapUsernameFocusLost

    private void NhapUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NhapUsernameActionPerformed

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed
        if (ShowPassword.isSelected()) {
            NhapPassword.setEchoChar((char) 0);
        } else {
            NhapPassword.setEchoChar('•');
        }
    }//GEN-LAST:event_ShowPasswordActionPerformed

    private void NhapPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NhapPasswordFocusGained
        if (NhapPassword.getText().equals("Password")) {
            NhapPassword.setText(null);
            NhapPassword.requestFocus();
            NhapPassword.setEchoChar('•'); //Đặt ký tự mật khẩu
            removePlaceholderStyle(NhapPassword);
        }
    }//GEN-LAST:event_NhapPasswordFocusGained

    private void NhapPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NhapPasswordFocusLost
        if (NhapPassword.getText().length() == 0) {
            addPlaceholderStyle(NhapPassword);
            NhapPassword.setText("Password");
            NhapPassword.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_NhapPasswordFocusLost

    private void NhapPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NhapPasswordActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {
            String userName = NhapUsername.getText();
            String password = new String(NhapPassword.getPassword());
            Pattern pattern = Pattern.compile("[a-zA-Z0-9_-]{3,10}$");
            Matcher matcher = pattern.matcher(userName);
            Matcher matcher1 = pattern.matcher(password);
            if (matcher.find() && matcher1.find()) {
                TaiKhoanDao dao = new TaiKhoanDao();
                TaiKhoan tk = dao.checkLogin(userName, password);
                if (tk == null) {
                    JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không chính xác!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login thành công");
                    DangNhap.TenDangNhap = userName;
                    DangNhap.MatKhaua = password;
                    dispose(); //Phá hủy cửa sổ login khi đăng nhập xong
                    //Chổ để code khi đã Login thành công
                    if (dao.findByKiemtra(userName, "admin") != null) {
                        adminPage apage = new adminPage();
                        apage.setVisible(true);
                    } else if (dao.findByKiemtra(userName, "user") != null) {
                        userPage upage = new userPage();
                        upage.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Đăng nhập bị lỗi!");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không chính xác!");
            }
        } catch (Exception el) {
            el.printStackTrace();
        }
    }//GEN-LAST:event_loginActionPerformed

    private void jLThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLThoatMouseClicked
        jPThoat.setBackground(Color.red);
        int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (click == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            jPThoat.setBackground(new Color(51, 51, 51));
        }
    }//GEN-LAST:event_jLThoatMouseClicked

    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
        login.doClick(KeyEvent.VK_ENTER);
    }//GEN-LAST:event_loginKeyPressed

    private void jLThoatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLThoatKeyPressed

    }//GEN-LAST:event_jLThoatKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField NhapPassword;
    public javax.swing.JTextField NhapUsername;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JLabel jLThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPThoat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
