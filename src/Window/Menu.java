package Window;

import Dao.TaiKhoanDao;
import Model.TaiKhoan;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends javax.swing.JPanel {

    ImageIcon iconMenu;
    ImageIcon iconDangxuat;
    ImageIcon iconDoiMatKhau;
    JPanel PanelMenu;
    JLabel menu;
    JMenuBar menuBar;
    JMenu mainMenu;
    JLabel mainHinh;
    JMenuItem tt;
    JMenuItem out;

    public Menu() {
        initComponents();
        LeftMenu();

    }

    public void LeftMenu() {
        //Thêm icon
        iconMenu = new ImageIcon(new ImageIcon("C:\\Users\\TRUYEN\\Desktop\\QuanLyNhaHang\\src\\image\\username.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        iconDangxuat = new ImageIcon(new ImageIcon("C:\\Users\\TRUYEN\\Desktop\\QuanLyNhaHang\\src\\image\\exitt.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        iconDoiMatKhau = new ImageIcon(new ImageIcon("C:\\Users\\TRUYEN\\Desktop\\QuanLyNhaHang\\src\\image\\DMK.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));

        //Tạo giao diện trái
        PanelMenu = new JPanel();
        PanelMenu.setPreferredSize(new Dimension(70, 60));
        PanelMenu.setLayout(new BoxLayout(PanelMenu, BoxLayout.X_AXIS));

        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(26, 35, 47));

        mainHinh = new JLabel();
        mainHinh.setIcon(iconMenu); //Gán hình vào JLabel

        mainMenu = new JMenu("▼");
        mainMenu.setForeground(Color.white);
        tt = new JMenuItem("Đổi mật khẩu", iconDoiMatKhau);
        out = new JMenuItem("Đăng xuất", iconDangxuat);
        mainMenu.add(tt);
        mainMenu.add(out);

        menuBar.add(mainHinh);
        menuBar.add(mainMenu);

        PanelMenu.setBackground(new Color(26, 35, 47));
        PanelMenu.add(menuBar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RPanelMenu = new javax.swing.JPanel();
        mainDoiMK = new javax.swing.JPanel();
        jPTK2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBMK = new javax.swing.JButton();
        jTNMK = new javax.swing.JTextField();
        jTMK = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLTK = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTMKM = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();

        RPanelMenu.setBackground(new java.awt.Color(245, 255, 250));

        mainDoiMK.setBackground(new java.awt.Color(255, 255, 255));
        mainDoiMK.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPTK2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Tên tài khoản");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Mật khẩu cũ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Nhập lại mật khẩu mới");

        jBMK.setBackground(new java.awt.Color(51, 102, 255));
        jBMK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBMK.setForeground(new java.awt.Color(255, 255, 255));
        jBMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh.png"))); // NOI18N
        jBMK.setText("Đổi mật khẩu");
        jBMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMKActionPerformed(evt);
            }
        });

        jTNMK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNMKActionPerformed(evt);
            }
        });

        jTMK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLTK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/password.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Mật khẩu mới");

        jTMKM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPTK2Layout = new javax.swing.GroupLayout(jPTK2);
        jPTK2.setLayout(jPTK2Layout);
        jPTK2Layout.setHorizontalGroup(
            jPTK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTK2Layout.createSequentialGroup()
                .addContainerGap(641, Short.MAX_VALUE)
                .addGroup(jPTK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTK2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(603, 603, 603))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTK2Layout.createSequentialGroup()
                        .addComponent(jBMK)
                        .addGap(620, 620, 620))))
            .addGroup(jPTK2Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addGroup(jPTK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(144, 144, 144)
                .addGroup(jPTK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTNMK, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTMK)
                    .addComponent(jTMKM))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPTK2Layout.setVerticalGroup(
            jPTK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTK2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPTK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTK2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPTK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTMK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(40, 40, 40))
                    .addGroup(jPTK2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPTK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTMKM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPTK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTNMK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jBMK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 102));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("ĐỔI MẬT KHẨU");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainDoiMKLayout = new javax.swing.GroupLayout(mainDoiMK);
        mainDoiMK.setLayout(mainDoiMKLayout);
        mainDoiMKLayout.setHorizontalGroup(
            mainDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDoiMKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPTK2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainDoiMKLayout.setVerticalGroup(
            mainDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainDoiMKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPTK2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout RPanelMenuLayout = new javax.swing.GroupLayout(RPanelMenu);
        RPanelMenu.setLayout(RPanelMenuLayout);
        RPanelMenuLayout.setHorizontalGroup(
            RPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        RPanelMenuLayout.setVerticalGroup(
            RPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTNMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNMKActionPerformed

    private void jBMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMKActionPerformed
        try {
            StringBuilder sb = new StringBuilder();
            if (jTMK.getText().equals("")) {
                sb.append("Mật khẩu cũ không được để trống!!!");
            } else if (jTMKM.getText().equals("")) {
                sb.append("Mật khẩu mới không được để trống!!!");
            }

            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(null, sb);
                return;
            }

            TaiKhoan tk = new TaiKhoan();
            TaiKhoan mk = new TaiKhoan();
            tk.setTenTk(jLTK.getText());
            tk.setMatKhau(jTMK.getText());
            mk.setMatKhau(jTMKM.getText());
            jTNMK.getText();
            Pattern pattern = Pattern.compile("[a-zA-Z0-9_-]{5,10}$");
            Matcher matcher = pattern.matcher(jTMKM.getText());
            TaiKhoanDao dao = new TaiKhoanDao();
            if (matcher.find()) {
                if (jTMKM.getText().equals(jTNMK.getText())) {
                    if (dao.update(tk, mk)) {
                        JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công");
                    } else {
                        JOptionPane.showMessageDialog(this, "Đổi mật khẩu thất bại!!!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Mật khẩu không trùng khớp!!!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Mật khẩu mới phải bao gồm 5 - 10 chữ số!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jBMKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel RPanelMenu;
    private javax.swing.JButton jBMK;
    public javax.swing.JLabel jLTK;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPTK2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTMK;
    private javax.swing.JTextField jTMKM;
    private javax.swing.JTextField jTNMK;
    public javax.swing.JPanel mainDoiMK;
    // End of variables declaration//GEN-END:variables
}
