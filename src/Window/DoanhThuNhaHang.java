package Window;

import Dao.HoaDonDao;
import Model.HoaDon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class DoanhThuNhaHang extends javax.swing.JFrame {

    JPanel Paneldoanhthu;
    JLabel DoanhThu;
    ImageIcon icondoanhthu;
    ImageIcon iconBackgoundHome;
    DefaultTableModel tblModel;
    String hoadon = "";

    public DoanhThuNhaHang() {
        initComponents();
        LeftDoanhThu();
        initTabletd();
        loadDataToTablehd();
    }

    public void LeftDoanhThu() {
        //Thêm icon vào Trang chủ
        icondoanhthu = new ImageIcon(new ImageIcon("C:\\Users\\TRUYEN\\Desktop\\QuanLyNhaHang\\src\\image\\thongke.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));

        //Tạo giao diện trái
        Paneldoanhthu = new JPanel();
        Paneldoanhthu.setPreferredSize(new Dimension(300, 60));
        Paneldoanhthu.setLayout(new BoxLayout(Paneldoanhthu, BoxLayout.X_AXIS)); //Vị trí label bên trái
        DoanhThu = new JLabel("Thống kê");
        DoanhThu.setIcon(icondoanhthu);
        DoanhThu.setForeground(Color.WHITE);
        DoanhThu.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Paneldoanhthu.setBackground(new Color(26, 35, 47));
        Paneldoanhthu.add(DoanhThu);
    }

    private void initTabletd() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Số hóa đơn", "Ngày hóa đơn", "Tổng tiền"}); //Thiết lập danh sách tên cột cho bảng
        BangHoaDon.setModel(tblModel); //Gán tbtModel vào BangThucDon
    }

    public void loadDataToTablehd() {
        try {
            HoaDonDao dao = new HoaDonDao();
            List<HoaDon> list = dao.findAllhd();
            tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
            for (HoaDon hdn : list) {
                tblModel.addRow(new Object[]{
                    hdn.getSoHoaDon(), hdn.getNgayHD(), hdn.getTongTien()
                });
            }
            tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
            soluong.setText("Số Lượng Hóa Đơn:" + list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        RPanelThongKe = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NhapTimKiem = new javax.swing.JTextField();
        TimKiem = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();
        soluong = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangHoaDon = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        RPanelThongKe.setBackground(new java.awt.Color(245, 255, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỐNG KÊ DOANH THU ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Tìm kiếm theo ngày ");

        NhapTimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                NhapTimKiemCaretUpdate(evt);
            }
        });
        NhapTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapTimKiemActionPerformed(evt);
            }
        });

        TimKiem.setBackground(new java.awt.Color(0, 102, 204));
        TimKiem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifying-glass.png"))); // NOI18N
        TimKiem.setText("Tìm Kiếm");
        TimKiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemActionPerformed(evt);
            }
        });

        Xoa.setBackground(new java.awt.Color(255, 51, 51));
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

        soluong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        soluong.setText("Số Lượng Hóa Đơn:");

        BangHoaDon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BangHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        BangHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BangHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BangHoaDon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NhapTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(soluong)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(NhapTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soluong)
                .addContainerGap())
        );

        javax.swing.GroupLayout RPanelThongKeLayout = new javax.swing.GroupLayout(RPanelThongKe);
        RPanelThongKe.setLayout(RPanelThongKeLayout);
        RPanelThongKeLayout.setHorizontalGroup(
            RPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPanelThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        RPanelThongKeLayout.setVerticalGroup(
            RPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPanelThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RPanelThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RPanelThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void NhapTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapTimKiemActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NhapTimKiemActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_formComponentShown

    private void TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemActionPerformed
        try {
            HoaDon hd = new HoaDon();
            HoaDonDao dao = new HoaDonDao();
            hd.setNgayHD(NhapTimKiem.getText());
            if (dao.findtableNgayHD(NhapTimKiem.getText()) != null) {
                List<HoaDon> list = dao.findtableNgayHD(NhapTimKiem.getText());
                tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                for (HoaDon hdn : list) {
                    tblModel.addRow(new Object[]{
                        hdn.getSoHoaDon(), hdn.getNgayHD(), hdn.getTongTien()
                    });
                }
                tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TimKiemActionPerformed

    private void NhapTimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_NhapTimKiemCaretUpdate
        try {
            HoaDon hd = new HoaDon();
            HoaDonDao dao = new HoaDonDao();
            hd.setNgayHD(NhapTimKiem.getText());
            if (dao.findtableNgayHD(NhapTimKiem.getText()) != null) {
                List<HoaDon> list = dao.findtableNgayHD(NhapTimKiem.getText());
                tblModel.setRowCount(0); //Xóa dữ liệu hiễn thị trên bảng và cho phép hiển thị lại dữ liệu
                for (HoaDon hdn : list) {
                    tblModel.addRow(new Object[]{
                        hdn.getSoHoaDon(), hdn.getNgayHD(), hdn.getTongTien()
                    });
                }
                tblModel.fireTableDataChanged();//Cập nhật hiển thị dữ liệu trong bảng
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_NhapTimKiemCaretUpdate

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        try {
            HoaDonDao dao = new HoaDonDao();
            if (dao.delete(hoadon)) {
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                loadDataToTablehd();
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn hàng để xóa");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_XoaActionPerformed

    private void BangHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangHoaDonMouseClicked
        int row = BangHoaDon.getSelectedRow();
        hoadon = BangHoaDon.getValueAt(row, 0).toString(); //Tại cột đầu tiên
    }//GEN-LAST:event_BangHoaDonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangHoaDon;
    private javax.swing.JTextField NhapTimKiem;
    public javax.swing.JPanel RPanelThongKe;
    private javax.swing.JButton TimKiem;
    private javax.swing.JButton Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel soluong;
    // End of variables declaration//GEN-END:variables

}
