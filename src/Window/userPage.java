/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Window;

import Dao.DatBanDao;
import Dao.TaiKhoanDao;
import Helper.DangNhap;
import Login.Login;
import Model.DatBan;
import Model.TaiKhoan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class userPage extends JFrame {

    JPanel Top;
    JPanel Left;
    JPanel Right;
    JPanel pnBorderLayout;
//    ImageIcon iconTieuDe;
//    JLabel TieuDe;

    public userPage() {
        function();
    }

    private void function() {
        setTitle("Quản Lý Nhà Hàng");
        ImageIcon webIcon = new ImageIcon("C:\\Users\\TRUYEN\\Desktop\\QuanLyNhaHang\\src\\image\\cutlery.png");
        setIconImage(webIcon.getImage());
        setSize(1880, 1000); //Khai báo kích thước Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Tat chuong trinh khi click vao nut X tren thanh tieu de
        setLocationRelativeTo(null); //Hiển thị cửa sổ hiện lên vị trí giữa màn hình
        pnBorderLayout = new JPanel(new BorderLayout());
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        CardLayout card = new CardLayout(); //Dùng để chuyển trang

        //Thêm icon tiêu đề
//        iconTieuDe = new ImageIcon(new ImageIcon("C:\\Users\\TRUYEN\\Desktop\\QuanLyNhaHang\\src\\image\\logo-restaurant.png").getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        ////Bắt đầu vùng North (Vùng Bắc - Trên)
        Top = new JPanel(new BorderLayout()); //Gọi top la borderLayout
        Top.setPreferredSize(new Dimension(0, 80));//Thay đổi kích thước Panel
        Top.setBackground(new Color(26, 35, 47));

        //Tiêu Đề
//        TieuDe = new JLabel("QUẢN LÝ NHÀ HÀNG");
//        TieuDe.setForeground(Color.WHITE);
//        TieuDe.setFont(new Font("Tahoma", Font.BOLD, 20));
//        TieuDe.setIcon(iconTieuDe);
        //Trang Chủ
        Home home = new Home();

        //Menu
        Menu menu = new Menu();

        //Panel k để tạo khoảng cách
        JPanel k = new JPanel();
        k.setPreferredSize(new Dimension(5, 0));
        k.setBackground(new Color(26, 35, 47));

        //Thêm Panel vào top
        Top.add(k, BorderLayout.WEST);
        Top.add(menu.PanelMenu, BorderLayout.EAST);
        Top.add(home.PanelHome, BorderLayout.CENTER); //Khai báo Tiêu đề nằm giữa Top
        pnBorderLayout.add(Top, BorderLayout.NORTH); //Khai báo biến Top nằm bên trên BorderLayout
        ////Kết thúc vùng North
        ////Bắt đầu vùng West (Hướng tây - Trái)
        Left = new JPanel();
        Left.setPreferredSize(new Dimension(300, 0));//Thay đổi kích thước Panel
        Left.setLayout(new BoxLayout(Left, BoxLayout.Y_AXIS));
        Left.setBackground(new Color(26, 35, 47));

        //Order
        Orderr orderr = new Orderr();

        //Thoát
        Exit exit = new Exit();
        //Panel a tạo khoảng cách giữa top và left
        JPanel a = new JPanel();
        a.setPreferredSize(new Dimension(260, 1));
        a.setBackground(new Color(13, 16, 25));

        //Khai báo các bảng nằm bên trái
        Left.setLayout(layout);
        Left.add(a);
        Left.add(orderr.PanelOrder);
        Left.add(exit.PanelExit);
        pnBorderLayout.add(Left, BorderLayout.WEST); //Khai báo biến Left nằm bên Trái BorderLayout
        ////Kết thúc vùng West

        ////Bắt đầu vùng Center (Giữa)
        Right = new JPanel();
        Right.setLayout(new BoxLayout(Right, BoxLayout.Y_AXIS));
        Right.setLayout(card);

        //Khai báo các bảng nằm bên phải
        Right.add(home.RPanelHome, "Trang 1");
        Right.add(orderr.RPanelOrder, "Trang 2");
        Right.add(menu.RPanelMenu, "Trang 5");
        //Khi vào Dashboard (Bảng điều khiển) sẽ xuất hiện trang chủ đầu tiên
        card.show(Right, "Trang 1");

        //Cài đặt click vào bảng nào thì hiện background bảng đó
        home.PanelHome.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                card.show(Right, "Trang 1");
                orderr.PanelOrder.setBackground(new Color(26, 35, 47));
                exit.PanelExit.setBackground(new Color(26, 35, 47));
                orderr.cardLayout.show(orderr.mainPanel, "Trang đặt bàn");
            }
        });

        orderr.PanelOrder.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                card.show(Right, "Trang 2");
                orderr.PanelOrder.setBackground(new Color(54, 54, 54));
                exit.PanelExit.setBackground(new Color(26, 35, 47));
                orderr.cardLayout.show(orderr.mainPanel, "Trang đặt bàn");
                try {
                    DatBanDao dao = new DatBanDao();
                    //Bàn 1
                    DatBan TBan1 = dao.findByKiemtra(1, "Ban1");
                    DatBan FBan1 = dao.findByKiemtra(0, "Ban1");
                    if (TBan1 != null) {
                        orderr.DatBan1.setVisible(false);
                        orderr.HuyDatBan1.setVisible(true);
                        orderr.DangPhucVu1.setVisible(false);
                    }
                    if (FBan1 != null) {
                        orderr.DatBan1.setVisible(false);
                        orderr.HuyDatBan1.setVisible(false);
                        orderr.DangPhucVu1.setVisible(true);
                    }
                    //Bàn 2
                    DatBan TBan2 = dao.findByKiemtra(1, "Ban2");
                    DatBan FBan2 = dao.findByKiemtra(0, "Ban2");
                    if (TBan2 != null) {
                        orderr.DatBan2.setVisible(false);
                        orderr.HuyDatBan2.setVisible(true);
                        orderr.DangPhucVu2.setVisible(false);
                    }
                    if (FBan2 != null) {
                        orderr.DatBan2.setVisible(false);
                        orderr.HuyDatBan2.setVisible(false);
                        orderr.DangPhucVu2.setVisible(true);
                    }
                    //Bàn 3
                    DatBan TBan3 = dao.findByKiemtra(1, "Ban3");
                    DatBan FBan3 = dao.findByKiemtra(0, "Ban3");
                    if (TBan3 != null) {
                        orderr.DatBan3.setVisible(false);
                        orderr.HuyDatBan3.setVisible(true);
                        orderr.DangPhucVu3.setVisible(false);
                    }
                    if (FBan3 != null) {
                        orderr.DatBan3.setVisible(false);
                        orderr.HuyDatBan3.setVisible(false);
                        orderr.DangPhucVu3.setVisible(true);
                    }
                    //Bàn 4
                    DatBan TBan4 = dao.findByKiemtra(1, "Ban4");
                    DatBan FBan4 = dao.findByKiemtra(0, "Ban4");
                    if (TBan4 != null) {
                        orderr.DatBan4.setVisible(false);
                        orderr.HuyDatBan4.setVisible(true);
                        orderr.DangPhucVu4.setVisible(false);
                    }
                    if (FBan4 != null) {
                        orderr.DatBan4.setVisible(false);
                        orderr.HuyDatBan4.setVisible(false);
                        orderr.DangPhucVu4.setVisible(true);
                    }
                    //Bàn 5
                    DatBan TBan5 = dao.findByKiemtra(1, "Ban5");
                    DatBan FBan5 = dao.findByKiemtra(0, "Ban5");
                    if (TBan5 != null) {
                        orderr.DatBan5.setVisible(false);
                        orderr.HuyDatBan5.setVisible(true);
                        orderr.DangPhucVu5.setVisible(false);
                    }
                    if (FBan5 != null) {
                        orderr.DatBan5.setVisible(false);
                        orderr.HuyDatBan5.setVisible(false);
                        orderr.DangPhucVu5.setVisible(true);
                    }
                    //Bàn 6
                    DatBan TBan6 = dao.findByKiemtra(1, "Ban6");
                    DatBan FBan6 = dao.findByKiemtra(0, "Ban6");
                    if (TBan6 != null) {
                        orderr.DatBan6.setVisible(false);
                        orderr.HuyDatBan6.setVisible(true);
                        orderr.DangPhucVu6.setVisible(false);
                    }
                    if (FBan6 != null) {
                        orderr.DatBan6.setVisible(false);
                        orderr.HuyDatBan6.setVisible(false);
                        orderr.DangPhucVu6.setVisible(true);
                    }
                    //Bàn 7
                    DatBan TBan7 = dao.findByKiemtra(1, "Ban7");
                    DatBan FBan7 = dao.findByKiemtra(0, "Ban7");
                    if (TBan7 != null) {
                        orderr.DatBan7.setVisible(false);
                        orderr.HuyDatBan7.setVisible(true);
                        orderr.DangPhucVu7.setVisible(false);
                    }
                    if (FBan7 != null) {
                        orderr.DatBan7.setVisible(false);
                        orderr.HuyDatBan7.setVisible(false);
                        orderr.DangPhucVu7.setVisible(true);
                    }
                    //Bàn 8
                    DatBan TBan8 = dao.findByKiemtra(1, "Ban8");
                    DatBan FBan8 = dao.findByKiemtra(0, "Ban8");
                    if (TBan8 != null) {
                        orderr.DatBan8.setVisible(false);
                        orderr.HuyDatBan8.setVisible(true);
                        orderr.DangPhucVu8.setVisible(false);
                    }
                    if (FBan8 != null) {
                        orderr.DatBan8.setVisible(false);
                        orderr.HuyDatBan8.setVisible(false);
                        orderr.DangPhucVu8.setVisible(true);
                    }
                } catch (Exception evt) {
                    evt.printStackTrace();
                }
            }
        });

        pnBorderLayout.add(Right, BorderLayout.CENTER); //Khai báo Biến Right nằm ở gữa BorderLayout
        ////Kết thúc vùng Center
        this.add(pnBorderLayout);

        menu.out.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (click == JOptionPane.YES_OPTION) {
                    Login login = new Login();
                    login.setVisible(true);
                    dispose();
                }
            }
        });
        menu.tt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    TaiKhoanDao dao = new TaiKhoanDao();
                    TaiKhoan user = dao.findByKiemtra(DangNhap.TenDangNhap, "user");
                    if (user != null) {
                        menu.jLTK.setText(DangNhap.TenDangNhap);
                    }
                } catch (Exception evt) {
                }
                card.show(Right, "Trang 5");
            }
        });
    }
}
