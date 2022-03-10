package Window;

import Dao.DatBanDao;
import Dao.DatMonDao;
import Dao.HoaDonDao;
import Dao.ThucDonDao;
import Model.DatBan;
import Model.DatMon;
import Model.HoaDon;
import Model.ThucDon;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.Date;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Orderr extends javax.swing.JFrame {

    JPanel PanelOrder;
    JLabel Order;
    ImageIcon iconOrder;
    CardLayout cardLayout;
    DefaultTableModel tblModel;
    DefaultTableModel tblModelhd;

    public Orderr() {
        initComponents();
        LeftOrder();
        initTableThucDon();
//        loadDataToTableThucDon();
        initTableHoaDon();
        cardLayout = (CardLayout) (mainPanel.getLayout());
        mainPanel.add(PanelDatBan, "Trang đặt bàn"); //Trang đặt bàn sẽ hiện lên đầu tiên
        mainPanel.add(PanelDatMon, "Trang đặt món");
        jPanelHoaDon.setVisible(false);
    }

    private void initTableThucDon() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã món", "Tên món", "Giá"}); //Thiết lập danh sách tên cột cho bảng
        BangThucDon.setModel(tblModel); //Gán tbtModel vào BangThucDon
    }

    private void initTableHoaDon() {
        tblModelhd = new DefaultTableModel();
        tblModelhd.setColumnIdentifiers(new String[]{"Mã món", "Tên món", "Giá", "Số lượng", "Thành tiền"}); //Thiết lập danh sách tên cột cho bảng
        BangHoaDon.setModel(tblModelhd); //Gán tbtModel vào BangThucDon
    }

    public void LeftOrder() {
        //Thêm icon
        iconOrder = new ImageIcon(new ImageIcon("C:\\Users\\TRUYEN\\Desktop\\QuanLyNhaHang\\src\\image\\Order.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));

        //Tạo giao diện trái
        PanelOrder = new JPanel();
        PanelOrder.setPreferredSize(new Dimension(300, 60));
        PanelOrder.setLayout(new BoxLayout(PanelOrder, BoxLayout.X_AXIS));
        Order = new JLabel("Order");
        Order.setIcon(iconOrder);
        Order.setForeground(Color.WHITE);
        Order.setFont(new Font("Tahoma", Font.PLAIN, 16));
        PanelOrder.add(Order);
        PanelOrder.setBackground(new Color(26, 35, 47));
    }

    public void TinhTien() {
        int tong = Integer.parseInt(TongTien.getText());
        int tra = Integer.parseInt(TienKH.getText());
        int thua = tra - tong;
        TienThua.setText(String.valueOf(thua));
    }

    public void bill() {
        jPanelHoaDon.setVisible(true);
        String tong = TongTien.getText();
        String tra = TienKH.getText();
        String thua = TienThua.getText();
//        jTextHoaDon.setText(jTextHoaDon.getText() + "\n");
//        jTextHoaDon.setText(jTextHoaDon.getText() + "	              HẢI SẢN BIỂN XANH Q9\n");
//        jTextHoaDon.setText(jTextHoaDon.getText() + "	       Tăng Nhơn Phú A, Tp. Thủ Đức\n");
//        jTextHoaDon.setText(jTextHoaDon.getText() + "                           Hotline: 09xxxxxxxx - 03xxxxxxxx\n");
        jTextHoaDon.setText(jTextHoaDon.getText() + "-------------------------------------------------------------------------------------\n");
        jTextHoaDon.setText(jTextHoaDon.getText() + "	              HOÁ ĐƠN THANH TOÁN\n");
        Date date = new Date();
        jTextHoaDon.setText(jTextHoaDon.getText() + "Ngày: " + date + "\n");
        jTextHoaDon.setText(jTextHoaDon.getText() + "-------------------------------------------------------------------------------------\n");
        jTextHoaDon.setText(jTextHoaDon.getText() + "     Tên món" + "\t" + "    Giá" + "\t" + "Số lượng" + "\t" + "Thành tiền" + "\n");
        for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
            String tenmon = (String) BangHoaDon.getValueAt(i, 1);
            String gia = (String) BangHoaDon.getValueAt(i, 2);
            int sl = Integer.parseInt(BangHoaDon.getValueAt(i, 3).toString());
            int tt = Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
            jTextHoaDon.setText(jTextHoaDon.getText() + tenmon + "\t" + gia + "\t" + sl + "\t" + tt + "\n");
        }
        jTextHoaDon.setText(jTextHoaDon.getText() + "\n");
        jTextHoaDon.setText(jTextHoaDon.getText() + "\n");
        jTextHoaDon.setText(jTextHoaDon.getText() + "\t" + "\t" + "Tổng tiền: " + tong + "\n");
        jTextHoaDon.setText(jTextHoaDon.getText() + "\t" + "\t" + "Tiền khách trả: " + tra + "\n");
        jTextHoaDon.setText(jTextHoaDon.getText() + "\t" + "\t" + "Tiền thừa: " + thua + "\n");
        jTextHoaDon.setText(jTextHoaDon.getText() + "\n");
        jTextHoaDon.setText(jTextHoaDon.getText() + "-------------------------------------------------------------------------------------\n");
        jTextHoaDon.setText(jTextHoaDon.getText() + "--                                Xin cảm ơn quý khách                                   --\n");
        jTextHoaDon.setText(jTextHoaDon.getText() + "----                                       Hẹn gặp lại                                          ----\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RPanelOrder = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        PanelDatBan = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PanelBan1 = new javax.swing.JPanel();
        DatBan1 = new javax.swing.JButton();
        HuyDatBan1 = new javax.swing.JButton();
        DangPhucVu1 = new javax.swing.JButton();
        DatMon1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PanelBan2 = new javax.swing.JPanel();
        DatBan2 = new javax.swing.JButton();
        HuyDatBan2 = new javax.swing.JButton();
        DangPhucVu2 = new javax.swing.JButton();
        DatMon2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PanelBan3 = new javax.swing.JPanel();
        DatBan3 = new javax.swing.JButton();
        HuyDatBan3 = new javax.swing.JButton();
        DangPhucVu3 = new javax.swing.JButton();
        DatMon3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        PanelBan4 = new javax.swing.JPanel();
        DatBan4 = new javax.swing.JButton();
        HuyDatBan4 = new javax.swing.JButton();
        DangPhucVu4 = new javax.swing.JButton();
        DatMon4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PanelBan5 = new javax.swing.JPanel();
        DatBan5 = new javax.swing.JButton();
        HuyDatBan5 = new javax.swing.JButton();
        DangPhucVu5 = new javax.swing.JButton();
        DatMon5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        PanelBan6 = new javax.swing.JPanel();
        DatBan6 = new javax.swing.JButton();
        HuyDatBan6 = new javax.swing.JButton();
        DangPhucVu6 = new javax.swing.JButton();
        DatMon6 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        PanelBan7 = new javax.swing.JPanel();
        DatBan7 = new javax.swing.JButton();
        HuyDatBan7 = new javax.swing.JButton();
        DangPhucVu7 = new javax.swing.JButton();
        DatMon7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        PanelBan8 = new javax.swing.JPanel();
        DatBan8 = new javax.swing.JButton();
        HuyDatBan8 = new javax.swing.JButton();
        DangPhucVu8 = new javax.swing.JButton();
        DatMon8 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        PanelDatMon = new javax.swing.JPanel();
        comeBackDatBan = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangThucDon = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jL = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        SoLuong = new javax.swing.JSpinner();
        jLTenmon = new javax.swing.JLabel();
        jLGia = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        GoiMonAn1 = new javax.swing.JButton();
        GoiMonAn2 = new javax.swing.JButton();
        GoiMonAn3 = new javax.swing.JButton();
        GoiMonAn4 = new javax.swing.JButton();
        GoiMonAn5 = new javax.swing.JButton();
        GoiMonAn6 = new javax.swing.JButton();
        GoiMonAn7 = new javax.swing.JButton();
        GoiMonAn8 = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        jPanelHoaDon = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextHoaDon = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        BangHoaDon = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TongTien = new javax.swing.JTextField();
        TienKH = new javax.swing.JTextField();
        TienThua = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPThanhToan = new javax.swing.JPanel();
        ThanhToan1 = new javax.swing.JButton();
        ThanhToan2 = new javax.swing.JButton();
        ThanhToan3 = new javax.swing.JButton();
        ThanhToan4 = new javax.swing.JButton();
        ThanhToan5 = new javax.swing.JButton();
        ThanhToan6 = new javax.swing.JButton();
        ThanhToan7 = new javax.swing.JButton();
        ThanhToan8 = new javax.swing.JButton();
        jBLoai7 = new javax.swing.JButton();
        jBLoai1 = new javax.swing.JButton();
        jBLoai2 = new javax.swing.JButton();
        jBLoai8 = new javax.swing.JButton();
        jBLoai3 = new javax.swing.JButton();
        jBLoai9 = new javax.swing.JButton();
        jBLoai10 = new javax.swing.JButton();
        jBLoai4 = new javax.swing.JButton();
        jBLoai5 = new javax.swing.JButton();
        jBLoai11 = new javax.swing.JButton();
        jBLoai6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1700, 731));

        RPanelOrder.setBackground(new java.awt.Color(245, 255, 250));
        RPanelOrder.setPreferredSize(new java.awt.Dimension(1700, 710));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        PanelDatBan.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatBan.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Danh sách bàn ăn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ĐẶT BÀN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        PanelBan1.setBackground(new java.awt.Color(204, 204, 255));
        PanelBan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatBan1.setBackground(new java.awt.Color(51, 153, 0));
        DatBan1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatBan1.setForeground(new java.awt.Color(255, 255, 255));
        DatBan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phones.png"))); // NOI18N
        DatBan1.setText("Đặt bàn");
        DatBan1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatBan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatBan1ActionPerformed(evt);
            }
        });
        PanelBan1.add(DatBan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        HuyDatBan1.setBackground(new java.awt.Color(255, 102, 102));
        HuyDatBan1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        HuyDatBan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        HuyDatBan1.setText("Hủy đặt bàn");
        HuyDatBan1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HuyDatBan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyDatBan1ActionPerformed(evt);
            }
        });
        PanelBan1.add(HuyDatBan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DangPhucVu1.setBackground(new java.awt.Color(102, 153, 255));
        DangPhucVu1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DangPhucVu1.setForeground(new java.awt.Color(255, 255, 255));
        DangPhucVu1.setText("Đang phục vụ");
        DangPhucVu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangPhucVu1ActionPerformed(evt);
            }
        });
        PanelBan1.add(DangPhucVu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DatMon1.setBackground(new java.awt.Color(0, 102, 204));
        DatMon1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatMon1.setForeground(new java.awt.Color(255, 255, 255));
        DatMon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        DatMon1.setText("Gọi món");
        DatMon1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatMon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatMon1ActionPerformed(evt);
            }
        });
        PanelBan1.add(DatMon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/table_restaurant.png"))); // NOI18N
        jLabel1.setText("Bàn 1 (SL: 4)");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelBan1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 272));

        PanelBan2.setBackground(new java.awt.Color(204, 204, 255));
        PanelBan2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatBan2.setBackground(new java.awt.Color(51, 153, 0));
        DatBan2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatBan2.setForeground(new java.awt.Color(255, 255, 255));
        DatBan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phones.png"))); // NOI18N
        DatBan2.setText("Đặt bàn");
        DatBan2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatBan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatBan2ActionPerformed(evt);
            }
        });
        PanelBan2.add(DatBan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        HuyDatBan2.setBackground(new java.awt.Color(255, 102, 102));
        HuyDatBan2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        HuyDatBan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        HuyDatBan2.setText("Hủy đặt bàn");
        HuyDatBan2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HuyDatBan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyDatBan2ActionPerformed(evt);
            }
        });
        PanelBan2.add(HuyDatBan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DangPhucVu2.setBackground(new java.awt.Color(102, 153, 255));
        DangPhucVu2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DangPhucVu2.setForeground(new java.awt.Color(255, 255, 255));
        DangPhucVu2.setText("Đang phục vụ");
        DangPhucVu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangPhucVu2ActionPerformed(evt);
            }
        });
        PanelBan2.add(DangPhucVu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DatMon2.setBackground(new java.awt.Color(0, 102, 204));
        DatMon2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatMon2.setForeground(new java.awt.Color(255, 255, 255));
        DatMon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        DatMon2.setText("Gọi món");
        DatMon2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatMon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatMon2ActionPerformed(evt);
            }
        });
        PanelBan2.add(DatMon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/table_restaurant.png"))); // NOI18N
        jLabel3.setText("Bàn 2 (SL: 4)");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelBan2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 272));

        PanelBan3.setBackground(new java.awt.Color(204, 204, 255));
        PanelBan3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatBan3.setBackground(new java.awt.Color(51, 153, 0));
        DatBan3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatBan3.setForeground(new java.awt.Color(255, 255, 255));
        DatBan3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phones.png"))); // NOI18N
        DatBan3.setText("Đặt bàn");
        DatBan3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatBan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatBan3ActionPerformed(evt);
            }
        });
        PanelBan3.add(DatBan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        HuyDatBan3.setBackground(new java.awt.Color(255, 102, 102));
        HuyDatBan3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        HuyDatBan3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        HuyDatBan3.setText("Hủy đặt bàn");
        HuyDatBan3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HuyDatBan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyDatBan3ActionPerformed(evt);
            }
        });
        PanelBan3.add(HuyDatBan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DangPhucVu3.setBackground(new java.awt.Color(102, 153, 255));
        DangPhucVu3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DangPhucVu3.setForeground(new java.awt.Color(255, 255, 255));
        DangPhucVu3.setText("Đang phục vụ");
        DangPhucVu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangPhucVu3ActionPerformed(evt);
            }
        });
        PanelBan3.add(DangPhucVu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DatMon3.setBackground(new java.awt.Color(0, 102, 204));
        DatMon3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatMon3.setForeground(new java.awt.Color(255, 255, 255));
        DatMon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        DatMon3.setText("Gọi món");
        DatMon3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatMon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatMon3ActionPerformed(evt);
            }
        });
        PanelBan3.add(DatMon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/table_restaurant.png"))); // NOI18N
        jLabel5.setText("Bàn 3 (SL: 4)");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelBan3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 272));

        PanelBan4.setBackground(new java.awt.Color(204, 204, 255));
        PanelBan4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatBan4.setBackground(new java.awt.Color(51, 153, 0));
        DatBan4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatBan4.setForeground(new java.awt.Color(255, 255, 255));
        DatBan4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phones.png"))); // NOI18N
        DatBan4.setText("Đặt bàn");
        DatBan4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatBan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatBan4ActionPerformed(evt);
            }
        });
        PanelBan4.add(DatBan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        HuyDatBan4.setBackground(new java.awt.Color(255, 102, 102));
        HuyDatBan4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        HuyDatBan4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        HuyDatBan4.setText("Hủy đặt bàn");
        HuyDatBan4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HuyDatBan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyDatBan4ActionPerformed(evt);
            }
        });
        PanelBan4.add(HuyDatBan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DangPhucVu4.setBackground(new java.awt.Color(102, 153, 255));
        DangPhucVu4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DangPhucVu4.setForeground(new java.awt.Color(255, 255, 255));
        DangPhucVu4.setText("Đang phục vụ");
        DangPhucVu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangPhucVu4ActionPerformed(evt);
            }
        });
        PanelBan4.add(DangPhucVu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DatMon4.setBackground(new java.awt.Color(0, 102, 204));
        DatMon4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatMon4.setForeground(new java.awt.Color(255, 255, 255));
        DatMon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        DatMon4.setText("Gọi món");
        DatMon4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatMon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatMon4ActionPerformed(evt);
            }
        });
        PanelBan4.add(DatMon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/table_restaurant.png"))); // NOI18N
        jLabel9.setText("Bàn 4 (SL: 4)");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelBan4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 272));

        PanelBan5.setBackground(new java.awt.Color(204, 204, 255));
        PanelBan5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatBan5.setBackground(new java.awt.Color(51, 153, 0));
        DatBan5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatBan5.setForeground(new java.awt.Color(255, 255, 255));
        DatBan5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phones.png"))); // NOI18N
        DatBan5.setText("Đặt bàn");
        DatBan5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatBan5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatBan5ActionPerformed(evt);
            }
        });
        PanelBan5.add(DatBan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        HuyDatBan5.setBackground(new java.awt.Color(255, 102, 102));
        HuyDatBan5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        HuyDatBan5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        HuyDatBan5.setText("Hủy đặt bàn");
        HuyDatBan5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HuyDatBan5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyDatBan5ActionPerformed(evt);
            }
        });
        PanelBan5.add(HuyDatBan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DangPhucVu5.setBackground(new java.awt.Color(102, 153, 255));
        DangPhucVu5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DangPhucVu5.setForeground(new java.awt.Color(255, 255, 255));
        DangPhucVu5.setText("Đang phục vụ");
        DangPhucVu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangPhucVu5ActionPerformed(evt);
            }
        });
        PanelBan5.add(DangPhucVu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DatMon5.setBackground(new java.awt.Color(0, 102, 204));
        DatMon5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatMon5.setForeground(new java.awt.Color(255, 255, 255));
        DatMon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        DatMon5.setText("Gọi món");
        DatMon5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatMon5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatMon5ActionPerformed(evt);
            }
        });
        PanelBan5.add(DatMon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, 60));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/table_restaurant.png"))); // NOI18N
        jLabel16.setText("Bàn 5 (SL: 4)");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelBan5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 272));

        PanelBan6.setBackground(new java.awt.Color(204, 204, 255));
        PanelBan6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatBan6.setBackground(new java.awt.Color(51, 153, 0));
        DatBan6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatBan6.setForeground(new java.awt.Color(255, 255, 255));
        DatBan6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phones.png"))); // NOI18N
        DatBan6.setText("Đặt bàn");
        DatBan6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatBan6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatBan6ActionPerformed(evt);
            }
        });
        PanelBan6.add(DatBan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        HuyDatBan6.setBackground(new java.awt.Color(255, 102, 102));
        HuyDatBan6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        HuyDatBan6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        HuyDatBan6.setText("Hủy đặt bàn");
        HuyDatBan6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HuyDatBan6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyDatBan6ActionPerformed(evt);
            }
        });
        PanelBan6.add(HuyDatBan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DangPhucVu6.setBackground(new java.awt.Color(102, 153, 255));
        DangPhucVu6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DangPhucVu6.setForeground(new java.awt.Color(255, 255, 255));
        DangPhucVu6.setText("Đang phục vụ");
        DangPhucVu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangPhucVu6ActionPerformed(evt);
            }
        });
        PanelBan6.add(DangPhucVu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DatMon6.setBackground(new java.awt.Color(0, 102, 204));
        DatMon6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatMon6.setForeground(new java.awt.Color(255, 255, 255));
        DatMon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        DatMon6.setText("Gọi món");
        DatMon6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatMon6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatMon6ActionPerformed(evt);
            }
        });
        PanelBan6.add(DatMon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, 60));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/table_restaurant.png"))); // NOI18N
        jLabel20.setText("Bàn 6 (SL: 4)");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelBan6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 272));

        PanelBan7.setBackground(new java.awt.Color(204, 204, 255));
        PanelBan7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatBan7.setBackground(new java.awt.Color(51, 153, 0));
        DatBan7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatBan7.setForeground(new java.awt.Color(255, 255, 255));
        DatBan7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phones.png"))); // NOI18N
        DatBan7.setText("Đặt bàn");
        DatBan7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatBan7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatBan7ActionPerformed(evt);
            }
        });
        PanelBan7.add(DatBan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        HuyDatBan7.setBackground(new java.awt.Color(255, 102, 102));
        HuyDatBan7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        HuyDatBan7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        HuyDatBan7.setText("Hủy đặt bàn");
        HuyDatBan7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HuyDatBan7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyDatBan7ActionPerformed(evt);
            }
        });
        PanelBan7.add(HuyDatBan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DangPhucVu7.setBackground(new java.awt.Color(102, 153, 255));
        DangPhucVu7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DangPhucVu7.setForeground(new java.awt.Color(255, 255, 255));
        DangPhucVu7.setText("Đang phục vụ");
        DangPhucVu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangPhucVu7ActionPerformed(evt);
            }
        });
        PanelBan7.add(DangPhucVu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DatMon7.setBackground(new java.awt.Color(0, 102, 204));
        DatMon7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatMon7.setForeground(new java.awt.Color(255, 255, 255));
        DatMon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        DatMon7.setText("Gọi món");
        DatMon7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatMon7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatMon7ActionPerformed(evt);
            }
        });
        PanelBan7.add(DatMon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, 60));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/table_restaurant.png"))); // NOI18N
        jLabel15.setText("Bàn 7 (SL: 8)");
        jLabel15.setToolTipText("");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelBan7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 272));

        PanelBan8.setBackground(new java.awt.Color(204, 204, 255));
        PanelBan8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatBan8.setBackground(new java.awt.Color(51, 153, 0));
        DatBan8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatBan8.setForeground(new java.awt.Color(255, 255, 255));
        DatBan8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phones.png"))); // NOI18N
        DatBan8.setText("Đặt bàn");
        DatBan8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatBan8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatBan8ActionPerformed(evt);
            }
        });
        PanelBan8.add(DatBan8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        HuyDatBan8.setBackground(new java.awt.Color(255, 102, 102));
        HuyDatBan8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        HuyDatBan8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        HuyDatBan8.setText("Hủy đặt bàn");
        HuyDatBan8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HuyDatBan8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyDatBan8ActionPerformed(evt);
            }
        });
        PanelBan8.add(HuyDatBan8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DangPhucVu8.setBackground(new java.awt.Color(102, 153, 255));
        DangPhucVu8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DangPhucVu8.setForeground(new java.awt.Color(255, 255, 255));
        DangPhucVu8.setText("Đang phục vụ");
        DangPhucVu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangPhucVu8ActionPerformed(evt);
            }
        });
        PanelBan8.add(DangPhucVu8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        DatMon8.setBackground(new java.awt.Color(0, 102, 204));
        DatMon8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DatMon8.setForeground(new java.awt.Color(255, 255, 255));
        DatMon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        DatMon8.setText("Gọi món");
        DatMon8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatMon8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatMon8ActionPerformed(evt);
            }
        });
        PanelBan8.add(DatMon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, 60));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/table_restaurant.png"))); // NOI18N
        jLabel21.setText("Bàn 8 (SL: 8)");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelBan8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 272));

        javax.swing.GroupLayout PanelDatBanLayout = new javax.swing.GroupLayout(PanelDatBan);
        PanelDatBan.setLayout(PanelDatBanLayout);
        PanelDatBanLayout.setHorizontalGroup(
            PanelDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatBanLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatBanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelBan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelBan5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(PanelDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBan6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBan2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(PanelDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBan7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBan3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(PanelDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBan4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBan8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelDatBanLayout.setVerticalGroup(
            PanelDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatBanLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBan2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBan3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBan4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBan1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(PanelDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBan5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBan6, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBan7, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBan8, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        mainPanel.add(PanelDatBan, "card3");

        PanelDatMon.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatMon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comeBackDatBan.setBackground(new java.awt.Color(255, 255, 255));
        comeBackDatBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/undo.png"))); // NOI18N
        comeBackDatBan.setBorder(null);
        comeBackDatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comeBackDatBanActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GỌI MÓN");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        BangThucDon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BangThucDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        BangThucDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BangThucDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BangThucDon);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thực đơn");

        jL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jL.setText("Tên món:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Giá:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Số lượng");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("VNĐ");

        SoLuong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SoLuong.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SoLuongStateChanged(evt);
            }
        });

        jLTenmon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLTenmon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLGia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GoiMonAn1.setBackground(new java.awt.Color(0, 0, 102));
        GoiMonAn1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        GoiMonAn1.setForeground(new java.awt.Color(255, 255, 255));
        GoiMonAn1.setText("Gọi món ăn");
        GoiMonAn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GoiMonAn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoiMonAn1ActionPerformed(evt);
            }
        });
        jPanel3.add(GoiMonAn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        GoiMonAn2.setBackground(new java.awt.Color(0, 0, 102));
        GoiMonAn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GoiMonAn2.setForeground(new java.awt.Color(255, 255, 255));
        GoiMonAn2.setText("Gọi món ăn");
        GoiMonAn2.setToolTipText("");
        GoiMonAn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoiMonAn2ActionPerformed(evt);
            }
        });
        jPanel3.add(GoiMonAn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        GoiMonAn3.setBackground(new java.awt.Color(0, 0, 102));
        GoiMonAn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GoiMonAn3.setForeground(new java.awt.Color(255, 255, 255));
        GoiMonAn3.setText("Gọi món ăn");
        GoiMonAn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoiMonAn3ActionPerformed(evt);
            }
        });
        jPanel3.add(GoiMonAn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        GoiMonAn4.setBackground(new java.awt.Color(0, 0, 102));
        GoiMonAn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GoiMonAn4.setForeground(new java.awt.Color(255, 255, 255));
        GoiMonAn4.setText("Gọi món ăn");
        GoiMonAn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoiMonAn4ActionPerformed(evt);
            }
        });
        jPanel3.add(GoiMonAn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        GoiMonAn5.setBackground(new java.awt.Color(0, 0, 102));
        GoiMonAn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GoiMonAn5.setForeground(new java.awt.Color(255, 255, 255));
        GoiMonAn5.setText("Gọi món ăn");
        GoiMonAn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoiMonAn5ActionPerformed(evt);
            }
        });
        jPanel3.add(GoiMonAn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        GoiMonAn6.setBackground(new java.awt.Color(0, 0, 102));
        GoiMonAn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GoiMonAn6.setForeground(new java.awt.Color(255, 255, 255));
        GoiMonAn6.setText("Gọi món ăn");
        GoiMonAn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoiMonAn6ActionPerformed(evt);
            }
        });
        jPanel3.add(GoiMonAn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        GoiMonAn7.setBackground(new java.awt.Color(0, 0, 102));
        GoiMonAn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GoiMonAn7.setForeground(new java.awt.Color(255, 255, 255));
        GoiMonAn7.setText("Gọi món ăn");
        GoiMonAn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoiMonAn7ActionPerformed(evt);
            }
        });
        jPanel3.add(GoiMonAn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        GoiMonAn8.setBackground(new java.awt.Color(0, 0, 102));
        GoiMonAn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GoiMonAn8.setForeground(new java.awt.Color(255, 255, 255));
        GoiMonAn8.setText("Gọi món ăn");
        GoiMonAn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoiMonAn8ActionPerformed(evt);
            }
        });
        jPanel3.add(GoiMonAn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(55, 55, 55)
                        .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(562, 562, 562))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLTenmon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTenmon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Panel.setBackground(new java.awt.Color(0, 153, 255));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextHoaDon.setColumns(20);
        jTextHoaDon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextHoaDon.setRows(5);
        jScrollPane3.setViewportView(jTextHoaDon);

        jPanelHoaDon.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 540));

        Panel.add(jPanelHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 430, 540));

        BangHoaDon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BangHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        BangHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BangHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BangHoaDon);

        Panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 720, 400));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Món đã gọi");
        Panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 11, 138, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Tiền thừa:");
        jLabel14.setToolTipText("");
        Panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("VNĐ");
        Panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("VNĐ");
        Panel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Tổng tiền:");
        Panel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Tiền khách đưa:");
        Panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        TongTien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TongTienActionPerformed(evt);
            }
        });
        Panel.add(TongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 520, 37));

        TienKH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TienKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TienKHActionPerformed(evt);
            }
        });
        Panel.add(TienKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 520, 37));

        TienThua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TienThua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TienThuaActionPerformed(evt);
            }
        });
        Panel.add(TienThua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 520, 37));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("VNĐ");
        Panel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, -1, -1));

        jPThanhToan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ThanhToan1.setBackground(new java.awt.Color(0, 0, 102));
        ThanhToan1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ThanhToan1.setForeground(new java.awt.Color(255, 255, 255));
        ThanhToan1.setText("Thanh toán");
        ThanhToan1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ThanhToan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanhToan1ActionPerformed(evt);
            }
        });
        jPThanhToan.add(ThanhToan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        ThanhToan2.setBackground(new java.awt.Color(0, 0, 102));
        ThanhToan2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ThanhToan2.setForeground(new java.awt.Color(255, 255, 255));
        ThanhToan2.setText("Thanh toán");
        ThanhToan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanhToan2ActionPerformed(evt);
            }
        });
        jPThanhToan.add(ThanhToan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        ThanhToan3.setBackground(new java.awt.Color(0, 0, 102));
        ThanhToan3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ThanhToan3.setForeground(new java.awt.Color(255, 255, 255));
        ThanhToan3.setText("Thanh toán");
        ThanhToan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanhToan3ActionPerformed(evt);
            }
        });
        jPThanhToan.add(ThanhToan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        ThanhToan4.setBackground(new java.awt.Color(0, 0, 102));
        ThanhToan4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ThanhToan4.setForeground(new java.awt.Color(255, 255, 255));
        ThanhToan4.setText("Thanh toán");
        ThanhToan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanhToan4ActionPerformed(evt);
            }
        });
        jPThanhToan.add(ThanhToan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        ThanhToan5.setBackground(new java.awt.Color(0, 0, 102));
        ThanhToan5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ThanhToan5.setForeground(new java.awt.Color(255, 255, 255));
        ThanhToan5.setText("Thanh toán");
        ThanhToan5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanhToan5ActionPerformed(evt);
            }
        });
        jPThanhToan.add(ThanhToan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        ThanhToan6.setBackground(new java.awt.Color(0, 0, 102));
        ThanhToan6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ThanhToan6.setForeground(new java.awt.Color(255, 255, 255));
        ThanhToan6.setText("Thanh toán");
        ThanhToan6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanhToan6ActionPerformed(evt);
            }
        });
        jPThanhToan.add(ThanhToan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        ThanhToan7.setBackground(new java.awt.Color(0, 0, 102));
        ThanhToan7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ThanhToan7.setForeground(new java.awt.Color(255, 255, 255));
        ThanhToan7.setText("Thanh toán");
        ThanhToan7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanhToan7ActionPerformed(evt);
            }
        });
        jPThanhToan.add(ThanhToan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        ThanhToan8.setBackground(new java.awt.Color(0, 0, 102));
        ThanhToan8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ThanhToan8.setForeground(new java.awt.Color(255, 255, 255));
        ThanhToan8.setText("Thanh toán");
        ThanhToan8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanhToan8ActionPerformed(evt);
            }
        });
        jPThanhToan.add(ThanhToan8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        Panel.add(jPThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, -1, 50));

        jBLoai7.setBackground(new java.awt.Color(0, 204, 204));
        jBLoai7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBLoai7.setForeground(new java.awt.Color(255, 255, 255));
        jBLoai7.setText("Rau");
        jBLoai7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLoai7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoai7ActionPerformed(evt);
            }
        });

        jBLoai1.setBackground(new java.awt.Color(0, 204, 204));
        jBLoai1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBLoai1.setForeground(new java.awt.Color(255, 255, 255));
        jBLoai1.setText("Súp");
        jBLoai1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLoai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoai1ActionPerformed(evt);
            }
        });

        jBLoai2.setBackground(new java.awt.Color(0, 204, 204));
        jBLoai2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBLoai2.setForeground(new java.awt.Color(255, 255, 255));
        jBLoai2.setText("Mực");
        jBLoai2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLoai2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoai2ActionPerformed(evt);
            }
        });

        jBLoai8.setBackground(new java.awt.Color(0, 204, 204));
        jBLoai8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBLoai8.setForeground(new java.awt.Color(255, 255, 255));
        jBLoai8.setText("Gỏi");
        jBLoai8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLoai8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoai8ActionPerformed(evt);
            }
        });

        jBLoai3.setBackground(new java.awt.Color(0, 204, 204));
        jBLoai3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBLoai3.setForeground(new java.awt.Color(255, 255, 255));
        jBLoai3.setText("Lẩu các loại");
        jBLoai3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLoai3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoai3ActionPerformed(evt);
            }
        });

        jBLoai9.setBackground(new java.awt.Color(0, 204, 204));
        jBLoai9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBLoai9.setForeground(new java.awt.Color(255, 255, 255));
        jBLoai9.setText("Nem");
        jBLoai9.setToolTipText("");
        jBLoai9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLoai9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoai9ActionPerformed(evt);
            }
        });

        jBLoai10.setBackground(new java.awt.Color(0, 204, 204));
        jBLoai10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBLoai10.setForeground(new java.awt.Color(255, 255, 255));
        jBLoai10.setText("Gà");
        jBLoai10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLoai10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoai10ActionPerformed(evt);
            }
        });

        jBLoai4.setBackground(new java.awt.Color(0, 204, 204));
        jBLoai4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBLoai4.setForeground(new java.awt.Color(255, 255, 255));
        jBLoai4.setText("Canh các món");
        jBLoai4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLoai4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoai4ActionPerformed(evt);
            }
        });

        jBLoai5.setBackground(new java.awt.Color(0, 204, 204));
        jBLoai5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBLoai5.setForeground(new java.awt.Color(255, 255, 255));
        jBLoai5.setText("Vịt");
        jBLoai5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLoai5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoai5ActionPerformed(evt);
            }
        });

        jBLoai11.setBackground(new java.awt.Color(0, 204, 204));
        jBLoai11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBLoai11.setForeground(new java.awt.Color(255, 255, 255));
        jBLoai11.setText("Cá");
        jBLoai11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLoai11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoai11ActionPerformed(evt);
            }
        });

        jBLoai6.setBackground(new java.awt.Color(0, 204, 204));
        jBLoai6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBLoai6.setForeground(new java.awt.Color(255, 255, 255));
        jBLoai6.setText("Đồ uống");
        jBLoai6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLoai6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoai6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDatMonLayout = new javax.swing.GroupLayout(PanelDatMon);
        PanelDatMon.setLayout(PanelDatMonLayout);
        PanelDatMonLayout.setHorizontalGroup(
            PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatMonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatMonLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jBLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jBLoai2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jBLoai3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jBLoai4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jBLoai5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(jBLoai6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(comeBackDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(PanelDatMonLayout.createSequentialGroup()
                        .addGroup(PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelDatMonLayout.createSequentialGroup()
                                .addGap(353, 353, 353)
                                .addComponent(jBLoai7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jBLoai8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDatMonLayout.createSequentialGroup()
                                .addComponent(jBLoai9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jBLoai10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jBLoai11, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PanelDatMonLayout.createSequentialGroup()
                                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        PanelDatMonLayout.setVerticalGroup(
            PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatMonLayout.createSequentialGroup()
                .addGroup(PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comeBackDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDatMonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBLoai2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBLoai1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jBLoai3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jBLoai4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jBLoai5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBLoai6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBLoai7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLoai8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLoai9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLoai10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLoai11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(PanelDatMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainPanel.add(PanelDatMon, "card2");

        javax.swing.GroupLayout RPanelOrderLayout = new javax.swing.GroupLayout(RPanelOrder);
        RPanelOrder.setLayout(RPanelOrderLayout);
        RPanelOrderLayout.setHorizontalGroup(
            RPanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPanelOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        RPanelOrderLayout.setVerticalGroup(
            RPanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPanelOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RPanelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 1585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RPanelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DatMon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatMon1ActionPerformed
        try {
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            DatBanDao dao = new DatBanDao();
            DatMonDao daodt = new DatMonDao();
            if (dao.findByKiemtra(0, "Ban1") != null) { //Kiểm tra nếu có dữ liệu trong đặt bàn thì trang đặt món sẽ hiện lên và bảng hóa đơn có dữ liệu
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(true);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(true);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(false);
                List<DatMon> list = daodt.findAllmon("Ban1");
                tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                for (DatMon dtm : list) {
                    tblModelhd.addRow(new Object[]{
                        dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                    });
                }
                tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
                //Tính tổng tiền
                int sum = 0;
                for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                    sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                }
                TongTien.setText(Integer.toString(sum));
            } else { // Nếu null thì trang đặt món sẽ hiện lên và bảng hóa đơn trống
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(true);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(true);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(false);
                tblModelhd.setRowCount(0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_DatMon1ActionPerformed

    private void DatBan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatBan1ActionPerformed
        try {
            DatBan db = new DatBan();
            db.setMaBan("Ban1");
            db.setTrangThai(1);
            DatBanDao dao = new DatBanDao();
            if (dao.insert(db)) {
                JOptionPane.showMessageDialog(null, "Đặt bàn thành công");
                DatBan1.setVisible(false);
                HuyDatBan1.setVisible(true);
                DangPhucVu1.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DatBan1ActionPerformed

    private void HuyDatBan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyDatBan1ActionPerformed
        try {
            DatBanDao dao = new DatBanDao();
            if (dao.delete("Ban1")) {
                JOptionPane.showMessageDialog(null, "Hủy đặt bàn thành công");
                DatBan1.setVisible(true);
                HuyDatBan1.setVisible(false);
                DangPhucVu1.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_HuyDatBan1ActionPerformed

    private void DatMon6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatMon6ActionPerformed
        try {
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            DatBanDao dao = new DatBanDao();
            DatMonDao daodt = new DatMonDao();
            if (dao.findByKiemtra(0, "Ban6") != null) { //Kiểm tra nếu có dữ liệu trong đặt bàn thì trang đặt món sẽ hiện lên và bảng hóa đơn có dữ liệu
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(true);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(true);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(false);
                List<DatMon> list = daodt.findAllmon("Ban6");
                tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                for (DatMon dtm : list) {
                    tblModelhd.addRow(new Object[]{
                        dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                    });
                }
                tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
                //Tính tổng tiền
                int sum = 0;
                for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                    sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                }
                TongTien.setText(Integer.toString(sum));
            } else { // Nếu null thì trang đặt món sẽ hiện lên và bảng hóa đơn trống
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(true);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(true);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(false);
                tblModelhd.setRowCount(0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_DatMon6ActionPerformed

    private void DangPhucVu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangPhucVu2ActionPerformed

    }//GEN-LAST:event_DangPhucVu2ActionPerformed

    private void DangPhucVu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangPhucVu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DangPhucVu3ActionPerformed

    private void DangPhucVu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangPhucVu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DangPhucVu4ActionPerformed

    private void DangPhucVu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangPhucVu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DangPhucVu5ActionPerformed

    private void DangPhucVu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangPhucVu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DangPhucVu6ActionPerformed

    private void DangPhucVu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangPhucVu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DangPhucVu7ActionPerformed

    private void DangPhucVu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangPhucVu8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DangPhucVu8ActionPerformed

    private void HuyDatBan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyDatBan2ActionPerformed
        try {
            DatBanDao dao = new DatBanDao();
            if (dao.delete("Ban2")) {
                JOptionPane.showMessageDialog(null, "Hủy đặt bàn thành công");
                DatBan2.setVisible(true);
                HuyDatBan2.setVisible(false);
                DangPhucVu2.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_HuyDatBan2ActionPerformed

    private void DangPhucVu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangPhucVu1ActionPerformed

    }//GEN-LAST:event_DangPhucVu1ActionPerformed

    private void DatBan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatBan2ActionPerformed
        try {
            DatBan db = new DatBan();
            db.setMaBan("Ban2");
            db.setTrangThai(1);

            DatBanDao dao = new DatBanDao();
            if (dao.insert(db)) {
                JOptionPane.showMessageDialog(null, "Đặt bàn thành công");
                DatBan2.setVisible(false);
                HuyDatBan2.setVisible(true);
                DangPhucVu2.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DatBan2ActionPerformed

    private void DatMon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatMon2ActionPerformed
        try {
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            DatBanDao dao = new DatBanDao();
            DatMonDao daodt = new DatMonDao();
            if (dao.findByKiemtra(0, "Ban2") != null) { //Kiểm tra nếu có dữ liệu trong đặt bàn thì trang đặt món sẽ hiện lên và bảng hóa đơn có dữ liệu
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(true);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(true);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(false);
                List<DatMon> list = daodt.findAllmon("Ban2");
                tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                for (DatMon dtm : list) {
                    tblModelhd.addRow(new Object[]{
                        dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                    });
                }
                tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
                //Tính tổng tiền
                int sum = 0;
                for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                    sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                }
                TongTien.setText(Integer.toString(sum));
            } else { // Nếu null thì trang đặt món sẽ hiện lên và bảng hóa đơn trống
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(true);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(true);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(false);
                tblModelhd.setRowCount(0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_DatMon2ActionPerformed

    private void DatBan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatBan3ActionPerformed
        try {
            DatBan db = new DatBan();
            db.setMaBan("Ban3");
            db.setTrangThai(1);

            DatBanDao dao = new DatBanDao();
            if (dao.insert(db)) {
                JOptionPane.showMessageDialog(null, "Đặt bàn thành công");
                DatBan3.setVisible(false);
                HuyDatBan3.setVisible(true);
                DangPhucVu3.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DatBan3ActionPerformed

    private void HuyDatBan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyDatBan3ActionPerformed
        try {
            DatBanDao dao = new DatBanDao();
            if (dao.delete("Ban3")) {
                JOptionPane.showMessageDialog(null, "Hủy đặt bàn thành công");
                DatBan3.setVisible(true);
                HuyDatBan3.setVisible(false);
                DangPhucVu3.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_HuyDatBan3ActionPerformed

    private void DatMon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatMon3ActionPerformed
        try {
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            DatBanDao dao = new DatBanDao();
            DatMonDao daodt = new DatMonDao();
            if (dao.findByKiemtra(0, "Ban3") != null) { //Kiểm tra nếu có dữ liệu trong đặt bàn thì trang đặt món sẽ hiện lên và bảng hóa đơn có dữ liệu
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(true);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(true);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(false);
                List<DatMon> list = daodt.findAllmon("Ban3");
                tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                for (DatMon dtm : list) {
                    tblModelhd.addRow(new Object[]{
                        dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                    });
                }
                tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
                //Tính tổng tiền
                int sum = 0;
                for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                    sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                }
                TongTien.setText(Integer.toString(sum));
            } else { // Nếu null thì trang đặt món sẽ hiện lên và bảng hóa đơn trống
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(true);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(true);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(false);
                tblModelhd.setRowCount(0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_DatMon3ActionPerformed

    private void DatMon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatMon4ActionPerformed
        try {
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            DatBanDao dao = new DatBanDao();
            DatMonDao daodt = new DatMonDao();
            if (dao.findByKiemtra(0, "Ban4") != null) { //Kiểm tra nếu có dữ liệu trong đặt bàn thì trang đặt món sẽ hiện lên và bảng hóa đơn có dữ liệu
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(true);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(true);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(false);
                List<DatMon> list = daodt.findAllmon("Ban4");
                tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                for (DatMon dtm : list) {
                    tblModelhd.addRow(new Object[]{
                        dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                    });
                }
                tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
                //Tính tổng tiền
                int sum = 0;
                for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                    sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                }
                TongTien.setText(Integer.toString(sum));
            } else { // Nếu null thì trang đặt món sẽ hiện lên và bảng hóa đơn trống
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(true);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(true);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(false);
                tblModelhd.setRowCount(0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_DatMon4ActionPerformed

    private void DatBan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatBan4ActionPerformed
        try {
            DatBan db = new DatBan();
            db.setMaBan("Ban4");
            db.setTrangThai(1);

            DatBanDao dao = new DatBanDao();
            if (dao.insert(db)) {
                JOptionPane.showMessageDialog(null, "Đặt bàn thành công");
                DatBan4.setVisible(false);
                HuyDatBan4.setVisible(true);
                DangPhucVu4.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DatBan4ActionPerformed

    private void DatBan5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatBan5ActionPerformed
        try {
            DatBan db = new DatBan();
            db.setMaBan("Ban5");
            db.setTrangThai(1);

            DatBanDao dao = new DatBanDao();
            if (dao.insert(db)) {
                JOptionPane.showMessageDialog(null, "Đặt bàn thành công");
                DatBan5.setVisible(false);
                HuyDatBan5.setVisible(true);
                DangPhucVu5.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DatBan5ActionPerformed

    private void DatBan6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatBan6ActionPerformed
        try {
            DatBan db = new DatBan();
            db.setMaBan("Ban6");
            db.setTrangThai(1);

            DatBanDao dao = new DatBanDao();
            if (dao.insert(db)) {
                JOptionPane.showMessageDialog(null, "Đặt bàn thành công");
                DatBan6.setVisible(false);
                HuyDatBan6.setVisible(true);
                DangPhucVu6.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DatBan6ActionPerformed

    private void DatBan7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatBan7ActionPerformed
        try {
            DatBan db = new DatBan();
            db.setMaBan("Ban7");
            db.setTrangThai(1);

            DatBanDao dao = new DatBanDao();
            if (dao.insert(db)) {
                JOptionPane.showMessageDialog(null, "Đặt bàn thành công");
                DatBan7.setVisible(false);
                HuyDatBan7.setVisible(true);
                DangPhucVu7.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DatBan7ActionPerformed

    private void DatBan8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatBan8ActionPerformed
        try {
            DatBan db = new DatBan();
            db.setMaBan("Ban8");
            db.setTrangThai(1);

            DatBanDao dao = new DatBanDao();
            if (dao.insert(db)) {
                JOptionPane.showMessageDialog(null, "Đặt bàn thành công");
                DatBan8.setVisible(false);
                HuyDatBan8.setVisible(true);
                DangPhucVu8.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DatBan8ActionPerformed

    private void HuyDatBan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyDatBan4ActionPerformed
        try {
            DatBanDao dao = new DatBanDao();
            if (dao.delete("Ban4")) {
                JOptionPane.showMessageDialog(null, "Hủy đặt bàn thành công");
                DatBan4.setVisible(true);
                HuyDatBan4.setVisible(false);
                DangPhucVu4.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_HuyDatBan4ActionPerformed

    private void HuyDatBan5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyDatBan5ActionPerformed
        try {
            DatBanDao dao = new DatBanDao();
            if (dao.delete("Ban5")) {
                JOptionPane.showMessageDialog(null, "Hủy đặt bàn thành công");
                DatBan5.setVisible(true);
                HuyDatBan5.setVisible(false);
                DangPhucVu5.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_HuyDatBan5ActionPerformed

    private void HuyDatBan6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyDatBan6ActionPerformed
        try {
            DatBanDao dao = new DatBanDao();
            if (dao.delete("Ban6")) {
                JOptionPane.showMessageDialog(null, "Hủy đặt bàn thành công");
                DatBan6.setVisible(true);
                HuyDatBan6.setVisible(false);
                DangPhucVu6.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_HuyDatBan6ActionPerformed

    private void HuyDatBan7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyDatBan7ActionPerformed
        try {
            DatBanDao dao = new DatBanDao();
            if (dao.delete("Ban7")) {
                JOptionPane.showMessageDialog(null, "Hủy đặt bàn thành công");
                DatBan7.setVisible(true);
                HuyDatBan7.setVisible(false);
                DangPhucVu7.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_HuyDatBan7ActionPerformed

    private void HuyDatBan8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyDatBan8ActionPerformed
        try {
            DatBanDao dao = new DatBanDao();
            if (dao.delete("Ban8")) {
                JOptionPane.showMessageDialog(null, "Hủy đặt bàn thành công");
                DatBan8.setVisible(true);
                HuyDatBan8.setVisible(false);
                DangPhucVu8.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_HuyDatBan8ActionPerformed

    private void DatMon5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatMon5ActionPerformed
        try {
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            DatBanDao dao = new DatBanDao();
            DatMonDao daodt = new DatMonDao();
            if (dao.findByKiemtra(0, "Ban5") != null) { //Kiểm tra nếu có dữ liệu trong đặt bàn thì trang đặt món sẽ hiện lên và bảng hóa đơn có dữ liệu
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(true);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(true);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(false);
                List<DatMon> list = daodt.findAllmon("Ban5");
                tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                for (DatMon dtm : list) {
                    tblModelhd.addRow(new Object[]{
                        dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                    });
                }
                tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
                //Tính tổng tiền
                int sum = 0;
                for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                    sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                }
                TongTien.setText(Integer.toString(sum));
            } else { // Nếu null thì trang đặt món sẽ hiện lên và bảng hóa đơn trống
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(true);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(true);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(false);
                tblModelhd.setRowCount(0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_DatMon5ActionPerformed

    private void DatMon7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatMon7ActionPerformed
        try {
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            DatBanDao dao = new DatBanDao();
            DatMonDao daodt = new DatMonDao();
            if (dao.findByKiemtra(0, "Ban7") != null) { //Kiểm tra nếu có dữ liệu trong đặt bàn thì trang đặt món sẽ hiện lên và bảng hóa đơn có dữ liệu
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(true);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(true);
                ThanhToan8.setVisible(false);
                List<DatMon> list = daodt.findAllmon("Ban7");
                tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                for (DatMon dtm : list) {
                    tblModelhd.addRow(new Object[]{
                        dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                    });
                }
                tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
                //Tính tổng tiền
                int sum = 0;
                for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                    sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                }
                TongTien.setText(Integer.toString(sum));
            } else { // Nếu null thì trang đặt món sẽ hiện lên và bảng hóa đơn trống
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(true);
                GoiMonAn8.setVisible(false);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(true);
                ThanhToan8.setVisible(false);
                tblModelhd.setRowCount(0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_DatMon7ActionPerformed

    private void DatMon8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatMon8ActionPerformed
        try {
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            DatBanDao dao = new DatBanDao();
            DatMonDao daodt = new DatMonDao();
            if (dao.findByKiemtra(0, "Ban8") != null) { //Kiểm tra nếu có dữ liệu trong đặt bàn thì trang đặt món sẽ hiện lên và bảng hóa đơn có dữ liệu
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(true);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(true);
                List<DatMon> list = daodt.findAllmon("Ban8");
                tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                for (DatMon dtm : list) {
                    tblModelhd.addRow(new Object[]{
                        dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                    });
                }
                tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
                //Tính tổng tiền
                int sum = 0;
                for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                    sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                }
                TongTien.setText(Integer.toString(sum));
            } else { // Nếu null thì trang đặt món sẽ hiện lên và bảng hóa đơn trống
                cardLayout.show(mainPanel, "Trang đặt món");

                //Hiện button gọi món
                GoiMonAn1.setVisible(false);
                GoiMonAn2.setVisible(false);
                GoiMonAn3.setVisible(false);
                GoiMonAn4.setVisible(false);
                GoiMonAn5.setVisible(false);
                GoiMonAn6.setVisible(false);
                GoiMonAn7.setVisible(false);
                GoiMonAn8.setVisible(true);

                //Hiện button thanh toán
                ThanhToan1.setVisible(false);
                ThanhToan2.setVisible(false);
                ThanhToan3.setVisible(false);
                ThanhToan4.setVisible(false);
                ThanhToan5.setVisible(false);
                ThanhToan6.setVisible(false);
                ThanhToan7.setVisible(false);
                ThanhToan8.setVisible(true);
                tblModelhd.setRowCount(0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_DatMon8ActionPerformed

    private void jBLoai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoai1ActionPerformed
        try {
            ThucDonDao dao = new ThucDonDao();
            List<ThucDon> list = dao.findByLoai("Súp");
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (ThucDon tdn : list) {
                tblModel.addRow(new Object[]{
                    tdn.getMaMon(), tdn.getTenMon(), tdn.getDonGia()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBLoai1ActionPerformed

    private void ThanhToan8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThanhToan8ActionPerformed
        StringBuilder sb = new StringBuilder();
        if (TienKH.getText().equals("")) {
            sb.append("Bạn chưa nhập tiền khách trả!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb);
            return;
        }

        try {
            TinhTien();
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban8") != null) {
                HoaDon hd = new HoaDon();
                //Cập nhật giờ tự động
                Date date = new Date();
                String str = String.format("%td/%<tm/%<tY", date);
                hd.setNgayHD(str);
                int tong = Integer.parseInt(TongTien.getText()); //Tổng tiền
                hd.setTongTien(tong);
                HoaDonDao dao = new HoaDonDao();
                DatMonDao daomon = new DatMonDao();
                int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn thanh toán không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (click == JOptionPane.YES_OPTION) {
                    if (dao.inserthd(hd)) {
                        bill();
                        int clickhd = JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (clickhd == JOptionPane.YES_OPTION) {
                            jTextHoaDon.print();
                            JOptionPane.showMessageDialog(null, "Mời nhận hóa đơn!!!");
                        }
                        if (daomon.delete("Ban8")) {
                            if (daodb.delete("Ban8")) {
                                TienKH.setText("");
                                TienThua.setText("");
                                jTextHoaDon.setText("");
                                jPanelHoaDon.setVisible(false);
                                DatBan8.setVisible(true);
                                HuyDatBan8.setVisible(false);
                                DangPhucVu8.setVisible(false);
                                cardLayout.show(mainPanel, "Trang đặt bàn");
                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng đặt món!!!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ThanhToan8ActionPerformed

    private void ThanhToan7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThanhToan7ActionPerformed
        StringBuilder sb = new StringBuilder();
        if (TienKH.getText().equals("")) {
            sb.append("Bạn chưa nhập tiền khách trả!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb);
            return;
        }

        try {
            TinhTien();
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban7") != null) {
                HoaDon hd = new HoaDon();
                //Cập nhật giờ tự động
                Date date = new Date();
                String str = String.format("%td/%<tm/%<tY", date);
                hd.setNgayHD(str);
                int tong = Integer.parseInt(TongTien.getText()); //Tổng tiền
                hd.setTongTien(tong);
                HoaDonDao dao = new HoaDonDao();
                DatMonDao daomon = new DatMonDao();
                int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn thanh toán không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (click == JOptionPane.YES_OPTION) {
                    if (dao.inserthd(hd)) {
                        bill();
                        int clickhd = JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (clickhd == JOptionPane.YES_OPTION) {
                            jTextHoaDon.print();
                            JOptionPane.showMessageDialog(null, "Mời nhận hóa đơn!!!");
                        }
                        if (daomon.delete("Ban7")) {
                            if (daodb.delete("Ban7")) {
                                TienKH.setText("");
                                TienThua.setText("");
                                jTextHoaDon.setText("");
                                jPanelHoaDon.setVisible(false);
                                DatBan7.setVisible(true);
                                HuyDatBan7.setVisible(false);
                                DangPhucVu7.setVisible(false);
                                cardLayout.show(mainPanel, "Trang đặt bàn");
                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng đặt món!!!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ThanhToan7ActionPerformed

    private void ThanhToan6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThanhToan6ActionPerformed
        StringBuilder sb = new StringBuilder();
        if (TienKH.getText().equals("")) {
            sb.append("Bạn chưa nhập tiền khách trả!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb);
            return;
        }

        try {
            TinhTien();
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban6") != null) {
                HoaDon hd = new HoaDon();
                //Cập nhật giờ tự động
                Date date = new Date();
                String str = String.format("%td/%<tm/%<tY", date);
                hd.setNgayHD(str);
                int tong = Integer.parseInt(TongTien.getText()); //Tổng tiền
                hd.setTongTien(tong);
                HoaDonDao dao = new HoaDonDao();
                DatMonDao daomon = new DatMonDao();
                int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn thanh toán không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (click == JOptionPane.YES_OPTION) {
                    if (dao.inserthd(hd)) {
                        bill();
                        int clickhd = JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (clickhd == JOptionPane.YES_OPTION) {
                            jTextHoaDon.print();
                            JOptionPane.showMessageDialog(null, "Mời nhận hóa đơn!!!");
                        }
                        if (daomon.delete("Ban6")) {
                            if (daodb.delete("Ban6")) {
                                TienKH.setText("");
                                TienThua.setText("");
                                jTextHoaDon.setText("");
                                jPanelHoaDon.setVisible(false);
                                DatBan6.setVisible(true);
                                HuyDatBan6.setVisible(false);
                                DangPhucVu6.setVisible(false);
                                cardLayout.show(mainPanel, "Trang đặt bàn");
                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng đặt món!!!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ThanhToan6ActionPerformed

    private void ThanhToan5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThanhToan5ActionPerformed
        StringBuilder sb = new StringBuilder();
        if (TienKH.getText().equals("")) {
            sb.append("Bạn chưa nhập tiền khách trả!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb);
            return;
        }

        try {
            TinhTien();
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban5") != null) {
                HoaDon hd = new HoaDon();
                //Cập nhật giờ tự động
                Date date = new Date();
                String str = String.format("%td/%<tm/%<tY", date);
                hd.setNgayHD(str);
                int tong = Integer.parseInt(TongTien.getText()); //Tổng tiền
                hd.setTongTien(tong);
                HoaDonDao dao = new HoaDonDao();
                DatMonDao daomon = new DatMonDao();
                int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn thanh toán không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (click == JOptionPane.YES_OPTION) {
                    if (dao.inserthd(hd)) {
                        bill();
                        int clickhd = JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (clickhd == JOptionPane.YES_OPTION) {
                            jTextHoaDon.print();
                            JOptionPane.showMessageDialog(null, "Mời nhận hóa đơn!!!");
                        }
                        if (daomon.delete("Ban5")) {
                            if (daodb.delete("Ban5")) {
                                TienKH.setText("");
                                TienThua.setText("");
                                jTextHoaDon.setText("");
                                jPanelHoaDon.setVisible(false);
                                DatBan5.setVisible(true);
                                HuyDatBan5.setVisible(false);
                                DangPhucVu5.setVisible(false);
                                cardLayout.show(mainPanel, "Trang đặt bàn");
                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng đặt món!!!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ThanhToan5ActionPerformed

    private void ThanhToan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThanhToan4ActionPerformed
        StringBuilder sb = new StringBuilder();
        if (TienKH.getText().equals("")) {
            sb.append("Bạn chưa nhập tiền khách trả!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb);
            return;
        }

        try {
            TinhTien();
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban4") != null) {
                HoaDon hd = new HoaDon();
                //Cập nhật giờ tự động
                Date date = new Date();
                String str = String.format("%td/%<tm/%<tY", date);
                hd.setNgayHD(str);
                int tong = Integer.parseInt(TongTien.getText()); //Tổng tiền
                hd.setTongTien(tong);
                HoaDonDao dao = new HoaDonDao();
                DatMonDao daomon = new DatMonDao();
                int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn thanh toán không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (click == JOptionPane.YES_OPTION) {
                    if (dao.inserthd(hd)) {
                        bill();
                        int clickhd = JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (clickhd == JOptionPane.YES_OPTION) {
                            jTextHoaDon.print();
                            JOptionPane.showMessageDialog(null, "Mời nhận hóa đơn!!!");
                        }
                        if (daomon.delete("Ban4")) {
                            if (daodb.delete("Ban4")) {
                                TienKH.setText("");
                                TienThua.setText("");
                                jTextHoaDon.setText("");
                                jPanelHoaDon.setVisible(false);
                                DatBan4.setVisible(true);
                                HuyDatBan4.setVisible(false);
                                DangPhucVu4.setVisible(false);
                                cardLayout.show(mainPanel, "Trang đặt bàn");
                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng đặt món!!!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ThanhToan4ActionPerformed

    private void ThanhToan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThanhToan3ActionPerformed
        StringBuilder sb = new StringBuilder();
        if (TienKH.getText().equals("")) {
            sb.append("Bạn chưa nhập tiền khách trả!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb);
            return;
        }

        try {
            TinhTien();
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban3") != null) {
                HoaDon hd = new HoaDon();
                //Cập nhật giờ tự động
                Date date = new Date();
                String str = String.format("%td/%<tm/%<tY", date);
                hd.setNgayHD(str);
                int tong = Integer.parseInt(TongTien.getText()); //Tổng tiền
                hd.setTongTien(tong);
                HoaDonDao dao = new HoaDonDao();
                DatMonDao daomon = new DatMonDao();
                int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn thanh toán không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (click == JOptionPane.YES_OPTION) {
                    if (dao.inserthd(hd)) {
                        bill();
                        int clickhd = JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (clickhd == JOptionPane.YES_OPTION) {
                            jTextHoaDon.print();
                            JOptionPane.showMessageDialog(null, "Mời nhận hóa đơn!!!");
                        }
                        if (daomon.delete("Ban3")) {
                            if (daodb.delete("Ban3")) {
                                TienKH.setText("");
                                TienThua.setText("");
                                jTextHoaDon.setText("");
                                jPanelHoaDon.setVisible(false);
                                DatBan3.setVisible(true);
                                HuyDatBan3.setVisible(false);
                                DangPhucVu3.setVisible(false);
                                cardLayout.show(mainPanel, "Trang đặt bàn");
                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng đặt món!!!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ThanhToan3ActionPerformed

    private void ThanhToan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThanhToan2ActionPerformed
        StringBuilder sb = new StringBuilder();
        if (TienKH.getText().equals("")) {
            sb.append("Bạn chưa nhập tiền khách trả!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb);
            return;
        }

        try {
            TinhTien();
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban2") != null) {
                HoaDon hd = new HoaDon();
                //Cập nhật giờ tự động
                Date date = new Date();
                String str = String.format("%td/%<tm/%<tY", date);
                hd.setNgayHD(str);
                int tong = Integer.parseInt(TongTien.getText()); //Tổng tiền
                hd.setTongTien(tong);
                HoaDonDao dao = new HoaDonDao();
                DatMonDao daomon = new DatMonDao();
                int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn thanh toán không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (click == JOptionPane.YES_OPTION) {
                    if (dao.inserthd(hd)) {
                        bill();
                        int clickhd = JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (clickhd == JOptionPane.YES_OPTION) {
                            jTextHoaDon.print();
                            JOptionPane.showMessageDialog(null, "Mời nhận hóa đơn!!!");
                        }
                        if (daomon.delete("Ban2")) {
                            if (daodb.delete("Ban2")) {
                                TienKH.setText("");
                                TienThua.setText("");
                                jTextHoaDon.setText("");
                                jPanelHoaDon.setVisible(false);
                                DatBan2.setVisible(true);
                                HuyDatBan2.setVisible(false);
                                DangPhucVu2.setVisible(false);
                                cardLayout.show(mainPanel, "Trang đặt bàn");
                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng đặt món!!!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ThanhToan2ActionPerformed

    private void ThanhToan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThanhToan1ActionPerformed
        StringBuilder sb = new StringBuilder();
        if (TienKH.getText().equals("")) {
            sb.append("Bạn chưa nhập tiền khách trả!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb);
            return;
        }

        try {
            TinhTien();
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban1") != null) {
                HoaDon hd = new HoaDon();
                //Cập nhật giờ tự động
                Date date = new Date();
                String str = String.format("%td/%<tm/%<tY", date);
                hd.setNgayHD(str);
                int tong = Integer.parseInt(TongTien.getText()); //Tổng tiền
                hd.setTongTien(tong);
                HoaDonDao dao = new HoaDonDao();
                DatMonDao daomon = new DatMonDao();
                int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn thanh toán không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (click == JOptionPane.YES_OPTION) {
                    if (dao.inserthd(hd)) {
                        bill();
                        int clickhd = JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (clickhd == JOptionPane.YES_OPTION) {
                            jTextHoaDon.print();
                            JOptionPane.showMessageDialog(null, "Mời nhận hóa đơn!!!");
                        }
                        if (daomon.delete("Ban1")) {
                            if (daodb.delete("Ban1")) {
                                TienKH.setText("");
                                TienThua.setText("");
                                jTextHoaDon.setText("");
                                jPanelHoaDon.setVisible(false);
                                DatBan1.setVisible(true);
                                HuyDatBan1.setVisible(false);
                                DangPhucVu1.setVisible(false);
                                cardLayout.show(mainPanel, "Trang đặt bàn");
                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng đặt món!!!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ThanhToan1ActionPerformed

    private void TienThuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TienThuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TienThuaActionPerformed

    private void TienKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TienKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TienKHActionPerformed

    private void TongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TongTienActionPerformed

    private void BangHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangHoaDonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BangHoaDonMouseClicked

    private void GoiMonAn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoiMonAn8ActionPerformed
        try {
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban8") != null) {
                DatMon dt = new DatMon();
                int row = BangThucDon.getSelectedRow();
                String mamon = (String) BangThucDon.getValueAt(row, 0);
                dt.setMaMon(mamon);
                dt.setMaBan("Ban8");
                int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                int gia = Integer.parseInt(jLGia.getText()); //Giá
                int tt = sl * gia; //Tính thành tiền
                dt.setSoLuong(sl);
                dt.setThanhTien(tt);
                DatMonDao dao = new DatMonDao();
                if (sl > 0) {
                    if (dao.insertmon(dt)) {
                        JOptionPane.showMessageDialog(null, "Gọi món thành công");
                        DatBan8.setVisible(false);
                        HuyDatBan8.setVisible(false);
                        DangPhucVu8.setVisible(true);
                        List<DatMon> list = dao.findAllmon(dt.getMaBan());
                        tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                        for (DatMon dtm : list) {
                            tblModelhd.addRow(new Object[]{
                                dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                            });
                        }
                        tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                        //Tính tổng tiền
                        int sum = 0;
                        for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                            sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                        }
                        TongTien.setText(Integer.toString(sum));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng");
                }
            } else if (daodb.findByKiemtra(1, "Ban8") != null) {
                DatBan db = new DatBan();
                db.setMaBan("Ban8");
                db.setTrangThai(0);
                if (daodb.update(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow();
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban8");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan8.setVisible(false);
                            HuyDatBan8.setVisible(false);
                            DangPhucVu8.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            } else { //Kiểm tra nếu bàn 1 dữ liệu là null thì tiến hành đặt trạng thái thành false rồi thêm dữ liệu vào hóa đơn
                DatBan db = new DatBan();
                db.setMaBan("Ban8");
                db.setTrangThai(0);
                if (daodb.insert(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow(); //Trả về một số nguyên, số nguyên này là chỉ số nhỏ nhất của một hàng trong tập hơp các hàng được chọn của bảng
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban8");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan8.setVisible(false);
                            HuyDatBan8.setVisible(false);
                            DangPhucVu8.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!!!");
        }
    }//GEN-LAST:event_GoiMonAn8ActionPerformed

    private void GoiMonAn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoiMonAn7ActionPerformed
        try {
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban7") != null) {
                DatMon dt = new DatMon();
                int row = BangThucDon.getSelectedRow();
                String mamon = (String) BangThucDon.getValueAt(row, 0);
                dt.setMaMon(mamon);
                dt.setMaBan("Ban7");
                int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                int gia = Integer.parseInt(jLGia.getText()); //Giá
                int tt = sl * gia; //Tính thành tiền
                dt.setSoLuong(sl);
                dt.setThanhTien(tt);
                DatMonDao dao = new DatMonDao();
                if (sl > 0) {
                    if (dao.insertmon(dt)) {
                        JOptionPane.showMessageDialog(null, "Gọi món thành công");
                        DatBan7.setVisible(false);
                        HuyDatBan7.setVisible(false);
                        DangPhucVu7.setVisible(true);
                        List<DatMon> list = dao.findAllmon(dt.getMaBan());
                        tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                        for (DatMon dtm : list) {
                            tblModelhd.addRow(new Object[]{
                                dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                            });
                        }
                        tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                        //Tính tổng tiền
                        int sum = 0;
                        for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                            sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                        }
                        TongTien.setText(Integer.toString(sum));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng");
                }
            } else if (daodb.findByKiemtra(1, "Ban7") != null) {
                DatBan db = new DatBan();
                db.setMaBan("Ban7");
                db.setTrangThai(0);
                if (daodb.update(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow();
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban7");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan7.setVisible(false);
                            HuyDatBan7.setVisible(false);
                            DangPhucVu7.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            } else { //Kiểm tra nếu bàn 1 dữ liệu là null thì tiến hành đặt trạng thái thành false rồi thêm dữ liệu vào hóa đơn
                DatBan db = new DatBan();
                db.setMaBan("Ban7");
                db.setTrangThai(0);
                if (daodb.insert(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow(); //Trả về một số nguyên, số nguyên này là chỉ số nhỏ nhất của một hàng trong tập hơp các hàng được chọn của bảng
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban7");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan7.setVisible(false);
                            HuyDatBan7.setVisible(false);
                            DangPhucVu7.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!!!");
        }
    }//GEN-LAST:event_GoiMonAn7ActionPerformed

    private void GoiMonAn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoiMonAn6ActionPerformed
        try {
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban6") != null) {
                DatMon dt = new DatMon();
                int row = BangThucDon.getSelectedRow();
                String mamon = (String) BangThucDon.getValueAt(row, 0);
                dt.setMaMon(mamon);
                dt.setMaBan("Ban6");
                int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                int gia = Integer.parseInt(jLGia.getText()); //Giá
                int tt = sl * gia; //Tính thành tiền
                dt.setSoLuong(sl);
                dt.setThanhTien(tt);
                DatMonDao dao = new DatMonDao();
                if (sl > 0) {
                    if (dao.insertmon(dt)) {
                        JOptionPane.showMessageDialog(null, "Gọi món thành công");
                        DatBan6.setVisible(false);
                        HuyDatBan6.setVisible(false);
                        DangPhucVu6.setVisible(true);
                        List<DatMon> list = dao.findAllmon(dt.getMaBan());
                        tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                        for (DatMon dtm : list) {
                            tblModelhd.addRow(new Object[]{
                                dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                            });
                        }
                        tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                        //Tính tổng tiền
                        int sum = 0;
                        for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                            sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                        }
                        TongTien.setText(Integer.toString(sum));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng");
                }
            } else if (daodb.findByKiemtra(1, "Ban6") != null) {
                DatBan db = new DatBan();
                db.setMaBan("Ban6");
                db.setTrangThai(0);
                if (daodb.update(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow();
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban6");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan6.setVisible(false);
                            HuyDatBan6.setVisible(false);
                            DangPhucVu6.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            } else { //Kiểm tra nếu bàn 1 dữ liệu là null thì tiến hành đặt trạng thái thành false rồi thêm dữ liệu vào hóa đơn
                DatBan db = new DatBan();
                db.setMaBan("Ban6");
                db.setTrangThai(0);
                if (daodb.insert(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow(); //Trả về một số nguyên, số nguyên này là chỉ số nhỏ nhất của một hàng trong tập hơp các hàng được chọn của bảng
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban6");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan6.setVisible(false);
                            HuyDatBan6.setVisible(false);
                            DangPhucVu6.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!!!");
        }
    }//GEN-LAST:event_GoiMonAn6ActionPerformed

    private void GoiMonAn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoiMonAn5ActionPerformed
        try {
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban5") != null) {
                DatMon dt = new DatMon();
                int row = BangThucDon.getSelectedRow();
                String mamon = (String) BangThucDon.getValueAt(row, 0);
                dt.setMaMon(mamon);
                dt.setMaBan("Ban5");
                int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                int gia = Integer.parseInt(jLGia.getText()); //Giá
                int tt = sl * gia; //Tính thành tiền
                dt.setSoLuong(sl);
                dt.setThanhTien(tt);
                DatMonDao dao = new DatMonDao();
                if (sl > 0) {
                    if (dao.insertmon(dt)) {
                        JOptionPane.showMessageDialog(null, "Gọi món thành công");
                        DatBan5.setVisible(false);
                        HuyDatBan5.setVisible(false);
                        DangPhucVu5.setVisible(true);
                        List<DatMon> list = dao.findAllmon(dt.getMaBan());
                        tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                        for (DatMon dtm : list) {
                            tblModelhd.addRow(new Object[]{
                                dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                            });
                        }
                        tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                        //Tính tổng tiền
                        int sum = 0;
                        for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                            sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                        }
                        TongTien.setText(Integer.toString(sum));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng");
                }
            } else if (daodb.findByKiemtra(1, "Ban5") != null) {
                DatBan db = new DatBan();
                db.setMaBan("Ban5");
                db.setTrangThai(0);
                if (daodb.update(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow();
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban5");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan5.setVisible(false);
                            HuyDatBan5.setVisible(false);
                            DangPhucVu5.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            } else { //Kiểm tra nếu bàn 1 dữ liệu là null thì tiến hành đặt trạng thái thành false rồi thêm dữ liệu vào hóa đơn
                DatBan db = new DatBan();
                db.setMaBan("Ban5");
                db.setTrangThai(0);
                if (daodb.insert(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow(); //Trả về một số nguyên, số nguyên này là chỉ số nhỏ nhất của một hàng trong tập hơp các hàng được chọn của bảng
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban5");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan5.setVisible(false);
                            HuyDatBan5.setVisible(false);
                            DangPhucVu5.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!!!");
        }
    }//GEN-LAST:event_GoiMonAn5ActionPerformed

    private void GoiMonAn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoiMonAn4ActionPerformed
        try {
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban4") != null) {
                DatMon dt = new DatMon();
                int row = BangThucDon.getSelectedRow();
                String mamon = (String) BangThucDon.getValueAt(row, 0);
                dt.setMaMon(mamon);
                dt.setMaBan("Ban4");
                int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                int gia = Integer.parseInt(jLGia.getText()); //Giá
                int tt = sl * gia; //Tính thành tiền
                dt.setSoLuong(sl);
                dt.setThanhTien(tt);
                DatMonDao dao = new DatMonDao();
                if (sl > 0) {
                    if (dao.insertmon(dt)) {
                        JOptionPane.showMessageDialog(null, "Gọi món thành công");
                        DatBan4.setVisible(false);
                        HuyDatBan4.setVisible(false);
                        DangPhucVu4.setVisible(true);
                        List<DatMon> list = dao.findAllmon(dt.getMaBan());
                        tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                        for (DatMon dtm : list) {
                            tblModelhd.addRow(new Object[]{
                                dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                            });
                        }
                        tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                        //Tính tổng tiền
                        int sum = 0;
                        for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                            sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                        }
                        TongTien.setText(Integer.toString(sum));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng");
                }
            } else if (daodb.findByKiemtra(1, "Ban4") != null) {
                DatBan db = new DatBan();
                db.setMaBan("Ban4");
                db.setTrangThai(0);
                if (daodb.update(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow();
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban4");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan4.setVisible(false);
                            HuyDatBan4.setVisible(false);
                            DangPhucVu4.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            } else { //Kiểm tra nếu bàn 1 dữ liệu là null thì tiến hành đặt trạng thái thành false rồi thêm dữ liệu vào hóa đơn
                DatBan db = new DatBan();
                db.setMaBan("Ban4");
                db.setTrangThai(0);
                if (daodb.insert(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow(); //Trả về một số nguyên, số nguyên này là chỉ số nhỏ nhất của một hàng trong tập hơp các hàng được chọn của bảng
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban4");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan4.setVisible(false);
                            HuyDatBan4.setVisible(false);
                            DangPhucVu4.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!!!");
        }
    }//GEN-LAST:event_GoiMonAn4ActionPerformed

    private void GoiMonAn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoiMonAn3ActionPerformed
        try {
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban3") != null) {
                DatMon dt = new DatMon();
                int row = BangThucDon.getSelectedRow();
                String mamon = (String) BangThucDon.getValueAt(row, 0);
                dt.setMaMon(mamon);
                dt.setMaBan("Ban3");
                int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                int gia = Integer.parseInt(jLGia.getText()); //Giá
                int tt = sl * gia; //Tính thành tiền
                dt.setSoLuong(sl);
                dt.setThanhTien(tt);
                DatMonDao dao = new DatMonDao();
                if (sl > 0) {
                    if (dao.insertmon(dt)) {
                        JOptionPane.showMessageDialog(null, "Gọi món thành công");
                        DatBan3.setVisible(false);
                        HuyDatBan3.setVisible(false);
                        DangPhucVu3.setVisible(true);
                        List<DatMon> list = dao.findAllmon(dt.getMaBan());
                        tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                        for (DatMon dtm : list) {
                            tblModelhd.addRow(new Object[]{
                                dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                            });
                        }
                        tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                        //Tính tổng tiền
                        int sum = 0;
                        for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                            sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                        }
                        TongTien.setText(Integer.toString(sum));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng");
                }
            } else if (daodb.findByKiemtra(1, "Ban3") != null) {
                DatBan db = new DatBan();
                db.setMaBan("Ban3");
                db.setTrangThai(0);
                if (daodb.update(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow();
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban3");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan3.setVisible(false);
                            HuyDatBan3.setVisible(false);
                            DangPhucVu3.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            } else { //Kiểm tra nếu bàn 1 dữ liệu là null thì tiến hành đặt trạng thái thành false rồi thêm dữ liệu vào hóa đơn
                DatBan db = new DatBan();
                db.setMaBan("Ban3");
                db.setTrangThai(0);
                if (daodb.insert(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow(); //Trả về một số nguyên, số nguyên này là chỉ số nhỏ nhất của một hàng trong tập hơp các hàng được chọn của bảng
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban3");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan3.setVisible(false);
                            HuyDatBan3.setVisible(false);
                            DangPhucVu3.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!!!");
        }
    }//GEN-LAST:event_GoiMonAn3ActionPerformed

    private void GoiMonAn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoiMonAn2ActionPerformed
        try {
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban2") != null) {
                DatMon dt = new DatMon();
                int row = BangThucDon.getSelectedRow();
                String mamon = (String) BangThucDon.getValueAt(row, 0);
                dt.setMaMon(mamon);
                dt.setMaBan("Ban2");
                int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                int gia = Integer.parseInt(jLGia.getText()); //Giá
                int tt = sl * gia; //Tính thành tiền
                dt.setSoLuong(sl);
                dt.setThanhTien(tt);
                DatMonDao dao = new DatMonDao();
                if (sl > 0) {
                    if (dao.insertmon(dt)) {
                        JOptionPane.showMessageDialog(null, "Gọi món thành công");
                        DatBan2.setVisible(false);
                        HuyDatBan2.setVisible(false);
                        DangPhucVu2.setVisible(true);
                        List<DatMon> list = dao.findAllmon(dt.getMaBan());
                        tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                        for (DatMon dtm : list) {
                            tblModelhd.addRow(new Object[]{
                                dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                            });
                        }
                        tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                        //Tính tổng tiền
                        int sum = 0;
                        for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                            sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                        }
                        TongTien.setText(Integer.toString(sum));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng");
                }
            } else if (daodb.findByKiemtra(1, "Ban2") != null) {
                DatBan db = new DatBan();
                db.setMaBan("Ban2");
                db.setTrangThai(0);
                if (daodb.update(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow();
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban2");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan2.setVisible(false);
                            HuyDatBan2.setVisible(false);
                            DangPhucVu2.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            } else { //Kiểm tra nếu bàn 1 dữ liệu là null thì tiến hành đặt trạng thái thành false rồi thêm dữ liệu vào hóa đơn
                DatBan db = new DatBan();
                db.setMaBan("Ban2");
                db.setTrangThai(0);
                if (daodb.insert(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow(); //Trả về một số nguyên, số nguyên này là chỉ số nhỏ nhất của một hàng trong tập hơp các hàng được chọn của bảng
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban2");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan2.setVisible(false);
                            HuyDatBan2.setVisible(false);
                            DangPhucVu2.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!!!");
        }
    }//GEN-LAST:event_GoiMonAn2ActionPerformed

    private void GoiMonAn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoiMonAn1ActionPerformed
        try {
            DatBanDao daodb = new DatBanDao();
            if (daodb.findByKiemtra(0, "Ban1") != null) { //kiểm tra nếu bàn 1 false thì tiến hành thêm dữ liệu vào hóa đơn
                DatMon dt = new DatMon();
                int row = BangThucDon.getSelectedRow(); //Trả về một số nguyên, số nguyên này là chỉ số nhỏ nhất của một hàng trong tập hơp các hàng được chọn của bảng
                String mamon = (String) BangThucDon.getValueAt(row, 0);
                dt.setMaMon(mamon);
                dt.setMaBan("Ban1");
                int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                int gia = Integer.parseInt(jLGia.getText()); //Giá
                int tt = sl * gia; //Tính thành tiền
                dt.setSoLuong(sl);
                dt.setThanhTien(tt);
                DatMonDao dao = new DatMonDao();
                if (sl > 0) {
                    if (dao.insertmon(dt)) {
                        JOptionPane.showMessageDialog(null, "Gọi món thành công");
                        DatBan1.setVisible(false);
                        HuyDatBan1.setVisible(false);
                        DangPhucVu1.setVisible(true);
                        List<DatMon> list = dao.findAllmon(dt.getMaBan());
                        tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                        for (DatMon dtm : list) {
                            tblModelhd.addRow(new Object[]{
                                dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                            });
                        }
                        tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                        //Tính tổng tiền
                        int sum = 0;
                        for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                            sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                        }
                        TongTien.setText(Integer.toString(sum));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng");
                }
            } else if (daodb.findByKiemtra(1, "Ban1") != null) { //kiểm tra nếu bàn 1 dữ liệu là true thì tiến hành chuyển trạng thái thành false rồi thêm dữ liệu vào hóa đơn
                DatBan db = new DatBan();
                db.setMaBan("Ban1");
                db.setTrangThai(0);
                if (daodb.update(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow(); //Trả về một số nguyên, số nguyên này là chỉ số nhỏ nhất của một hàng trong tập hơp các hàng được chọn của bảng
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban1");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan1.setVisible(false);
                            HuyDatBan1.setVisible(false);
                            DangPhucVu1.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            } else { //Kiểm tra nếu bàn 1 dữ liệu là null thì tiến hành đặt trạng thái thành false rồi thêm dữ liệu vào hóa đơn
                DatBan db = new DatBan();
                db.setMaBan("Ban1");
                db.setTrangThai(0);
                if (daodb.insert(db)) {
                    DatMon dt = new DatMon();
                    int row = BangThucDon.getSelectedRow(); //Trả về một số nguyên, số nguyên này là chỉ số nhỏ nhất của một hàng trong tập hơp các hàng được chọn của bảng
                    String mamon = (String) BangThucDon.getValueAt(row, 0);
                    dt.setMaMon(mamon);
                    dt.setMaBan("Ban1");
                    int sl = Integer.parseInt(SoLuong.getValue().toString()); //Số lượng
                    int gia = Integer.parseInt(jLGia.getText()); //Giá
                    int tt = sl * gia; //Tính thành tiền
                    dt.setSoLuong(sl);
                    dt.setThanhTien(tt);
                    DatMonDao dao = new DatMonDao();
                    if (sl > 0) {
                        if (dao.insertmon(dt)) {
                            JOptionPane.showMessageDialog(null, "Gọi món thành công");
                            DatBan1.setVisible(false);
                            HuyDatBan1.setVisible(false);
                            DangPhucVu1.setVisible(true);
                            List<DatMon> list = dao.findAllmon(dt.getMaBan());
                            tblModelhd.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                            for (DatMon dtm : list) {
                                tblModelhd.addRow(new Object[]{
                                    dtm.getMaMon(), dtm.getTenMon(), dtm.getDonGia(), dtm.getSoLuong(), dtm.getThanhTien()
                                });
                            }
                            tblModelhd.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng

                            //Tính tổng tiền
                            int sum = 0;
                            for (int i = 0; i < BangHoaDon.getRowCount(); i++) {
                                sum = sum + Integer.parseInt(BangHoaDon.getValueAt(i, 4).toString());
                            }
                            TongTien.setText(Integer.toString(sum));
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!!!");
        }
    }//GEN-LAST:event_GoiMonAn1ActionPerformed

    private void SoLuongStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SoLuongStateChanged

    }//GEN-LAST:event_SoLuongStateChanged

    private void BangThucDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangThucDonMouseClicked
        try {
            int row = BangThucDon.getSelectedRow();
            //Nếu lớn hơn hoặc bằng 0 thì người dùng chọn 1 hàng dữ liệu trên bảng nếu nhỏ hơn thì ko chọn hàng dữ liệu nào
            if (row >= 0) {
                String tdn = (String) BangThucDon.getValueAt(row, 0); //Tại cột đầu tiên
                ThucDonDao dao = new ThucDonDao();
                ThucDon td = dao.findByMaMon(tdn);
                if (td != null) {
                    jLTenmon.setText(td.getTenMon());
                    jLGia.setText(td.getDonGia());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BangThucDonMouseClicked

    private void comeBackDatBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comeBackDatBanActionPerformed
        cardLayout.show(mainPanel, "Trang đặt bàn");
    }//GEN-LAST:event_comeBackDatBanActionPerformed

    private void jBLoai2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoai2ActionPerformed
        try {
            ThucDonDao dao = new ThucDonDao();
            List<ThucDon> list = dao.findByLoai("Mực");
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (ThucDon tdn : list) {
                tblModel.addRow(new Object[]{
                    tdn.getMaMon(), tdn.getTenMon(), tdn.getDonGia()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBLoai2ActionPerformed

    private void jBLoai7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoai7ActionPerformed
        try {
            ThucDonDao dao = new ThucDonDao();
            List<ThucDon> list = dao.findByLoai("Rau");
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (ThucDon tdn : list) {
                tblModel.addRow(new Object[]{
                    tdn.getMaMon(), tdn.getTenMon(), tdn.getDonGia()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBLoai7ActionPerformed

    private void jBLoai3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoai3ActionPerformed
        try {
            ThucDonDao dao = new ThucDonDao();
            List<ThucDon> list = dao.findByLoai("Lẩu các loại");
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (ThucDon tdn : list) {
                tblModel.addRow(new Object[]{
                    tdn.getMaMon(), tdn.getTenMon(), tdn.getDonGia()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBLoai3ActionPerformed

    private void jBLoai4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoai4ActionPerformed
        try {
            ThucDonDao dao = new ThucDonDao();
            List<ThucDon> list = dao.findByLoai("Canh các món");
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (ThucDon tdn : list) {
                tblModel.addRow(new Object[]{
                    tdn.getMaMon(), tdn.getTenMon(), tdn.getDonGia()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBLoai4ActionPerformed

    private void jBLoai5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoai5ActionPerformed
        try {
            ThucDonDao dao = new ThucDonDao();
            List<ThucDon> list = dao.findByLoai("Vịt");
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (ThucDon tdn : list) {
                tblModel.addRow(new Object[]{
                    tdn.getMaMon(), tdn.getTenMon(), tdn.getDonGia()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBLoai5ActionPerformed

    private void jBLoai6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoai6ActionPerformed
        try {
            ThucDonDao dao = new ThucDonDao();
            List<ThucDon> list = dao.findByLoai("Đồ uống");
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (ThucDon tdn : list) {
                tblModel.addRow(new Object[]{
                    tdn.getMaMon(), tdn.getTenMon(), tdn.getDonGia()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBLoai6ActionPerformed

    private void jBLoai8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoai8ActionPerformed
        try {
            ThucDonDao dao = new ThucDonDao();
            List<ThucDon> list = dao.findByLoai("Gỏi");
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (ThucDon tdn : list) {
                tblModel.addRow(new Object[]{
                    tdn.getMaMon(), tdn.getTenMon(), tdn.getDonGia()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBLoai8ActionPerformed

    private void jBLoai9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoai9ActionPerformed
        try {
            ThucDonDao dao = new ThucDonDao();
            List<ThucDon> list = dao.findByLoai("Nem");
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (ThucDon tdn : list) {
                tblModel.addRow(new Object[]{
                    tdn.getMaMon(), tdn.getTenMon(), tdn.getDonGia()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBLoai9ActionPerformed

    private void jBLoai10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoai10ActionPerformed
        try {
            ThucDonDao dao = new ThucDonDao();
            List<ThucDon> list = dao.findByLoai("Gà");
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (ThucDon tdn : list) {
                tblModel.addRow(new Object[]{
                    tdn.getMaMon(), tdn.getTenMon(), tdn.getDonGia()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBLoai10ActionPerformed

    private void jBLoai11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoai11ActionPerformed
        try {
            ThucDonDao dao = new ThucDonDao();
            List<ThucDon> list = dao.findByLoai("Cá");
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (ThucDon tdn : list) {
                tblModel.addRow(new Object[]{
                    tdn.getMaMon(), tdn.getTenMon(), tdn.getDonGia()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBLoai11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Orderr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orderr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orderr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orderr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orderr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangHoaDon;
    public javax.swing.JTable BangThucDon;
    public javax.swing.JButton DangPhucVu1;
    public javax.swing.JButton DangPhucVu2;
    public javax.swing.JButton DangPhucVu3;
    public javax.swing.JButton DangPhucVu4;
    public javax.swing.JButton DangPhucVu5;
    public javax.swing.JButton DangPhucVu6;
    public javax.swing.JButton DangPhucVu7;
    public javax.swing.JButton DangPhucVu8;
    public javax.swing.JButton DatBan1;
    public javax.swing.JButton DatBan2;
    public javax.swing.JButton DatBan3;
    public javax.swing.JButton DatBan4;
    public javax.swing.JButton DatBan5;
    public javax.swing.JButton DatBan6;
    public javax.swing.JButton DatBan7;
    public javax.swing.JButton DatBan8;
    public javax.swing.JButton DatMon1;
    public javax.swing.JButton DatMon2;
    public javax.swing.JButton DatMon3;
    public javax.swing.JButton DatMon4;
    public javax.swing.JButton DatMon5;
    public javax.swing.JButton DatMon6;
    public javax.swing.JButton DatMon7;
    public javax.swing.JButton DatMon8;
    private javax.swing.JButton GoiMonAn1;
    private javax.swing.JButton GoiMonAn2;
    private javax.swing.JButton GoiMonAn3;
    private javax.swing.JButton GoiMonAn4;
    private javax.swing.JButton GoiMonAn5;
    private javax.swing.JButton GoiMonAn6;
    private javax.swing.JButton GoiMonAn7;
    private javax.swing.JButton GoiMonAn8;
    public javax.swing.JButton HuyDatBan1;
    public javax.swing.JButton HuyDatBan2;
    public javax.swing.JButton HuyDatBan3;
    public javax.swing.JButton HuyDatBan4;
    public javax.swing.JButton HuyDatBan5;
    public javax.swing.JButton HuyDatBan6;
    public javax.swing.JButton HuyDatBan7;
    public javax.swing.JButton HuyDatBan8;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel PanelBan1;
    private javax.swing.JPanel PanelBan2;
    private javax.swing.JPanel PanelBan3;
    private javax.swing.JPanel PanelBan4;
    private javax.swing.JPanel PanelBan5;
    private javax.swing.JPanel PanelBan6;
    private javax.swing.JPanel PanelBan7;
    private javax.swing.JPanel PanelBan8;
    private javax.swing.JPanel PanelDatBan;
    private javax.swing.JPanel PanelDatMon;
    public javax.swing.JPanel RPanelOrder;
    private javax.swing.JSpinner SoLuong;
    private javax.swing.JButton ThanhToan1;
    private javax.swing.JButton ThanhToan2;
    private javax.swing.JButton ThanhToan3;
    private javax.swing.JButton ThanhToan4;
    private javax.swing.JButton ThanhToan5;
    private javax.swing.JButton ThanhToan6;
    private javax.swing.JButton ThanhToan7;
    private javax.swing.JButton ThanhToan8;
    private javax.swing.JTextField TienKH;
    private javax.swing.JTextField TienThua;
    private javax.swing.JTextField TongTien;
    private javax.swing.JButton comeBackDatBan;
    private javax.swing.JButton jBLoai1;
    private javax.swing.JButton jBLoai10;
    private javax.swing.JButton jBLoai11;
    private javax.swing.JButton jBLoai2;
    private javax.swing.JButton jBLoai3;
    private javax.swing.JButton jBLoai4;
    private javax.swing.JButton jBLoai5;
    private javax.swing.JButton jBLoai6;
    private javax.swing.JButton jBLoai7;
    private javax.swing.JButton jBLoai8;
    private javax.swing.JButton jBLoai9;
    private javax.swing.JLabel jL;
    private javax.swing.JLabel jLGia;
    private javax.swing.JLabel jLTenmon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPThanhToan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelHoaDon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextHoaDon;
    public javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
