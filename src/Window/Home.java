package Window;

import javax.swing.*;
import java.awt.*;

public class Home extends javax.swing.JPanel {

    JPanel PanelHome;
    JLabel Home;
    ImageIcon iconHome;
    ImageIcon iconBackgoundHome;

    public Home() {
        initComponents();
        LeftHome();
    }

    public void LeftHome() {
        //Thêm icon vào Trang chủ
        iconHome = new ImageIcon(new ImageIcon("C:\\Users\\TRUYEN\\Desktop\\QuanLyNhaHang\\src\\image\\logo-restaurant.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));

        //Tạo giao diện trái
        PanelHome = new JPanel();
        PanelHome.setPreferredSize(new Dimension(300, 60));
        PanelHome.setLayout(new BoxLayout(PanelHome, BoxLayout.X_AXIS)); //Vị trí label bên trái
        Home = new JLabel("QUẢN LÝ NHÀ HÀNG");
        Home.setIcon(iconHome);
        Home.setForeground(Color.WHITE);
        Home.setFont(new Font("Tahoma", Font.PLAIN, 16));
        PanelHome.setBackground(new Color(26, 35, 47));
        PanelHome.add(Home);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RPanelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        RPanelHome.setBackground(new java.awt.Color(245, 255, 250));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Home.jpg"))); // NOI18N

        javax.swing.GroupLayout RPanelHomeLayout = new javax.swing.GroupLayout(RPanelHome);
        RPanelHome.setLayout(RPanelHomeLayout);
        RPanelHomeLayout.setHorizontalGroup(
            RPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, Short.MAX_VALUE)
        );
        RPanelHomeLayout.setVerticalGroup(
            RPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 705, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RPanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RPanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel RPanelHome;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
