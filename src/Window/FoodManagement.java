package Window;

import Dao.ThucDonDao;
import Model.ThucDon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TRUYEN
 */
public class FoodManagement extends javax.swing.JPanel {

    ImageIcon iconThucDon;
    JPanel PanelThucDon;
    JLabel td;
    DefaultTableModel tblModel;
    String monan = "";
    String ten = "";
    String cloai = "";
    String dgia = "";

    public FoodManagement() {
        initComponents();
        LeftThucDon();
        initTabletd();
        loadDataToTabletd();
    }

    private void initTabletd() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã món", "Tên món", "Loại", "Giá"}); //Thiết lập danh sách tên cột cho bảng
        BangThucDon.setModel(tblModel); //Gán tbtModel vào BangThucDon
    }

    private void loadDataToTabletd() {
        try {
            ThucDonDao dao = new ThucDonDao();
            List<ThucDon> list = dao.findAll();
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (ThucDon tdn : list) {
                tblModel.addRow(new Object[]{
                    tdn.getMaMon(), tdn.getTenMon(), tdn.getLoai(), tdn.getDonGia()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void LeftThucDon() {
        //Thêm icon
        iconThucDon = new ImageIcon(new ImageIcon("C:\\Users\\TRUYEN\\Desktop\\QuanLyNhaHang\\src\\image\\thucdon.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));

        //Tạo giao diện trái
        PanelThucDon = new JPanel();
        PanelThucDon.setPreferredSize(new Dimension(300, 60));
        PanelThucDon.setLayout(new BoxLayout(PanelThucDon, BoxLayout.X_AXIS));
        td = new JLabel("Thực đơn");
        td.setIcon(iconThucDon);
        td.setForeground(Color.WHITE);
        td.setFont(new Font("Tahoma", Font.PLAIN, 16));
        PanelThucDon.setBackground(new Color(26, 35, 47));
        PanelThucDon.add(td);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RPanelThucDon = new javax.swing.JPanel();
        mainPaneltd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangThucDon = new javax.swing.JTable();
        Nhapten = new javax.swing.JTextField();
        Nhapgia = new javax.swing.JTextField();
        Them = new javax.swing.JButton();
        CapNhat = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();
        LamMoi = new javax.swing.JButton();
        Nhaptimkiem = new javax.swing.JTextField();
        TimKiem = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ChonLoai = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Nhapma = new javax.swing.JLabel();

        RPanelThucDon.setBackground(new java.awt.Color(245, 255, 250));

        mainPaneltd.setBackground(new java.awt.Color(255, 255, 255));
        mainPaneltd.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Mã món");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Tên món");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Giá");

        BangThucDon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BangThucDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        BangThucDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BangThucDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BangThucDon);

        Nhapten.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Nhapgia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nhapgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapgiaActionPerformed(evt);
            }
        });

        Them.setBackground(new java.awt.Color(51, 153, 0));
        Them.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Them.setForeground(new java.awt.Color(255, 255, 255));
        Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        Them.setText("Thêm");
        Them.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });

        CapNhat.setBackground(new java.awt.Color(0, 102, 204));
        CapNhat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CapNhat.setForeground(new java.awt.Color(255, 255, 255));
        CapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/updated.png"))); // NOI18N
        CapNhat.setText("Cập nhật");
        CapNhat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapNhatActionPerformed(evt);
            }
        });

        Xoa.setBackground(new java.awt.Color(255, 102, 102));
        Xoa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Xoa.setForeground(new java.awt.Color(255, 255, 255));
        Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        Xoa.setText("Xóa");
        Xoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });

        LamMoi.setBackground(new java.awt.Color(51, 153, 0));
        LamMoi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LamMoi.setForeground(new java.awt.Color(255, 255, 255));
        LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh.png"))); // NOI18N
        LamMoi.setText("Làm mới");
        LamMoi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoiActionPerformed(evt);
            }
        });

        Nhaptimkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nhaptimkiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                NhaptimkiemCaretUpdate(evt);
            }
        });
        Nhaptimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhaptimkiemActionPerformed(evt);
            }
        });

        TimKiem.setBackground(new java.awt.Color(0, 102, 204));
        TimKiem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifying-glass.png"))); // NOI18N
        TimKiem.setText("Tìm kiếm");
        TimKiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ THỰC ĐƠN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Tìm kiếm mã món");

        ChonLoai.setBackground(new java.awt.Color(240, 240, 240));
        ChonLoai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ChonLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Loại", "Súp", "Rau", "Mực", "Gỏi", "Lẩu các loại", "Nem", "Canh các món", "Gà", "Vịt", "Cá", "Đồ uống" }));
        ChonLoai.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Loại");

        Nhapma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Nhapma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Nhapma, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPaneltdLayout = new javax.swing.GroupLayout(mainPaneltd);
        mainPaneltd.setLayout(mainPaneltdLayout);
        mainPaneltdLayout.setHorizontalGroup(
            mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneltdLayout.createSequentialGroup()
                .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPaneltdLayout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Them, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(60, 60, 60)
                            .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneltdLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(mainPaneltdLayout.createSequentialGroup()
                                    .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6))
                                    .addGap(63, 63, 63))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPaneltdLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Nhapgia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                .addComponent(Nhapten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                .addComponent(ChonLoai, javax.swing.GroupLayout.Alignment.TRAILING, 0, 321, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(mainPaneltdLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPaneltdLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Nhaptimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        mainPaneltdLayout.setVerticalGroup(
            mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneltdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPaneltdLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nhapten, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChonLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nhapgia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Them, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(mainPaneltdLayout.createSequentialGroup()
                        .addGroup(mainPaneltdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nhaptimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout RPanelThucDonLayout = new javax.swing.GroupLayout(RPanelThucDon);
        RPanelThucDon.setLayout(RPanelThucDonLayout);
        RPanelThucDonLayout.setHorizontalGroup(
            RPanelThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPanelThucDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPaneltd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        RPanelThucDonLayout.setVerticalGroup(
            RPanelThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPanelThucDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPaneltd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPanelThucDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPanelThucDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NhapgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NhapgiaActionPerformed

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
        StringBuilder sb = new StringBuilder();
        String loai = (String) ChonLoai.getSelectedItem();
        if (Nhapten.getText().equals("")) {
            sb.append("Bạn chưa nhập tên món!!!");
        } else if (loai.equals("--Loại")) {
            sb.append("Vui lòng chọn loại món!!!");
        } else if (Nhapgia.getText().equals("")) {
            sb.append("Bạn chưa nhập giá món!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb);
            return;
        }
        try {
            ThucDon td = new ThucDon();

            td.setTenMon(Nhapten.getText());
            td.setLoai(loai);
            String gia = Nhapgia.getText();
            td.setDonGia(gia);
            Pattern pattern = Pattern.compile("[0-9_-]$");
            Matcher matchegia = pattern.matcher(gia);
            ThucDonDao dao = new ThucDonDao();
            if (matchegia.find()) {
                if (dao.findByMaMon(Nhapma.getText()) != null) {
                    JOptionPane.showMessageDialog(null, "Món ăn đã tồn tại");
                } else {
                    if (dao.insert(td)) {
                        JOptionPane.showMessageDialog(null, "Thêm món thành công");
                        loadDataToTabletd();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập số");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_ThemActionPerformed

    private void CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapNhatActionPerformed
        StringBuilder sb = new StringBuilder();
        String loai = (String) ChonLoai.getSelectedItem();
        if (Nhapten.getText().equals("")) {
            sb.append("Bạn chưa nhập tên món!!!");
        } else if (loai.equals("--Loại")) {
            sb.append("Vui lòng chọn loại món!!!");
        } else if (Nhapgia.getText().equals("")) {
            sb.append("Bạn chưa nhập giá món!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb);
            return;
        }
        try {
            ThucDon td = new ThucDon();
            td.setMaMon(Nhapma.getText());
            td.setTenMon(Nhapten.getText());
            td.setLoai(loai);
            String gia = Nhapgia.getText();
            td.setDonGia(gia);
            Pattern pattern = Pattern.compile("[0-9_-]$");
            Matcher matchegia = pattern.matcher(gia);
            ThucDonDao dao = new ThucDonDao();
            if (matchegia.find()) {
                if (monan.equals(Nhapma.getText()) && ten.equals(Nhapten.getText()) && cloai.equals(loai) && dgia.equals(gia)) {
                    JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
                    loadDataToTabletd();
                } else {
                    if (dao.update(td)) {
                        JOptionPane.showMessageDialog(null, "Cập nhật món thành công");
                        loadDataToTabletd();
                        if (monan.equals(Nhapma.getText()) && ten.equals(Nhapten.getText()) && cloai.equals(loai) && dgia.equals(gia)) {
                            JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
                            loadDataToTabletd();
                        }
                    } else {
                        if (dao.insert(td)) {
                            JOptionPane.showMessageDialog(null, "Thêm món thành công");
                            loadDataToTabletd();
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập số");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_CapNhatActionPerformed

    private void NhaptimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhaptimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NhaptimkiemActionPerformed

    private void TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemActionPerformed
        try {
            ThucDon td = new ThucDon();
            ThucDonDao dao = new ThucDonDao();
            td.setTenMon(Nhaptimkiem.getText());
            if (dao.findtableMamon(Nhaptimkiem.getText()) != null) {
                List<ThucDon> list = dao.findtableMamon(Nhaptimkiem.getText());
                tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                for (ThucDon tdn : list) {
                    tblModel.addRow(new Object[]{
                        tdn.getMaMon(), tdn.getTenMon(), tdn.getLoai(), tdn.getDonGia()
                    });
                }
                tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TimKiemActionPerformed

    private void LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoiActionPerformed
        Nhapma.setText("");
        Nhapten.setText("");
        ChonLoai.setSelectedItem("--Loại");
        Nhapgia.setText("");
        Nhaptimkiem.setText("");
    }//GEN-LAST:event_LamMoiActionPerformed

    private void NhaptimkiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_NhaptimkiemCaretUpdate
        try {
            ThucDon td = new ThucDon();
            ThucDonDao dao = new ThucDonDao();
            td.setTenMon(Nhaptimkiem.getText());
            if (dao.findtableMamon(Nhaptimkiem.getText()) != null) {
                List<ThucDon> list = dao.findtableMamon(Nhaptimkiem.getText());
                tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                for (ThucDon tdn : list) {
                    tblModel.addRow(new Object[]{
                        tdn.getMaMon(), tdn.getTenMon(), tdn.getLoai(), tdn.getDonGia()
                    });
                }
                tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_NhaptimkiemCaretUpdate

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        try {
            ThucDonDao dao = new ThucDonDao();
            if (dao.delete(monan)) {
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                loadDataToTabletd();
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn hàng để xóa");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_XoaActionPerformed

    private void BangThucDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangThucDonMouseClicked
        int row = BangThucDon.getSelectedRow();
        try {
            if (row >= 0) {
                monan = BangThucDon.getValueAt(row, 0).toString(); //Tại cột đầu tiên
                ten = BangThucDon.getValueAt(row, 1).toString(); //Tại cột đầu tiên
                cloai = BangThucDon.getValueAt(row, 2).toString(); //Tại cột đầu tiên
                dgia = BangThucDon.getValueAt(row, 3).toString(); //Tại cột đầu tiên
                ThucDonDao dao = new ThucDonDao();
                ThucDon td = dao.findByMaMon(monan);
                if (td != null) {
                    Nhapma.setText(td.getMaMon());
                    Nhapten.setText(td.getTenMon());
                    ChonLoai.setSelectedItem(td.getLoai());
                    Nhapgia.setText(td.getDonGia());
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BangThucDonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangThucDon;
    private javax.swing.JButton CapNhat;
    private javax.swing.JComboBox<String> ChonLoai;
    private javax.swing.JButton LamMoi;
    private javax.swing.JTextField Nhapgia;
    private javax.swing.JLabel Nhapma;
    private javax.swing.JTextField Nhapten;
    private javax.swing.JTextField Nhaptimkiem;
    public javax.swing.JPanel RPanelThucDon;
    private javax.swing.JButton Them;
    private javax.swing.JButton TimKiem;
    private javax.swing.JButton Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel mainPaneltd;
    // End of variables declaration//GEN-END:variables
}
