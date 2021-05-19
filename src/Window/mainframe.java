package Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mainframe extends JFrame {
    JPanel Top;
    JPanel Left;
    JPanel Right;
    ImageIcon iconTieuDe;
    JPanel pnBorderLayout;
    JLabel TieuDe;

    public mainframe() {
        Vmainframe();
    }

    private void Vmainframe() {
        this.setTitle("Quản Lý Nhà Hàng");
        this.setSize(1500, 900); //Khai báo kích thước Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Tat chuong trinh khi click vao nut X tren thanh tieu de
        this.setLocationRelativeTo(null); //Hiển thị cửa sổ hiện lên vị trí giữa màn hình
        pnBorderLayout = new JPanel(new BorderLayout());
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        CardLayout card = new CardLayout(); //Dùng để chuyển trang

        //Thêm icon tiêu đề
        iconTieuDe = new ImageIcon(new ImageIcon("image\\logo-restaurant.png").getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));

        ////Bắt đầu vùng North (Vùng Bắc - Trên)
        Top = new JPanel(new BorderLayout()); //Gọi top la borderLayout
        Top.setPreferredSize(new Dimension(0, 80));//Thay đổi kích thước Panel
        Top.setBackground(new Color(26, 35, 47));

        //Tiêu Đề
        TieuDe = new JLabel("QUẢN LÝ NHÀ HÀNG");
        TieuDe.setForeground(Color.WHITE);
        TieuDe.setFont(new Font("Tahoma", Font.BOLD, 20));
        TieuDe.setIcon(iconTieuDe);

        //Tài Khoản
        TaiKhoan taiKhoan = new TaiKhoan();

        //Panel k để tạo khoảng cách
        JPanel k = new JPanel();
        k.setPreferredSize(new Dimension(5, 0));
        k.setBackground(new Color(26, 35, 47));

        //Thêm Panel vào top
        Top.add(k, BorderLayout.WEST);
        Top.add(TieuDe, BorderLayout.CENTER); //Khai báo Tiêu đề nằm giữa Top
        Top.add(taiKhoan.PanelAccount, BorderLayout.EAST);
        pnBorderLayout.add(Top, BorderLayout.NORTH); //Khai báo biến Top nằm bên trên BorderLayout
        ////Kết thúc vùng North

        ////Bắt đầu vùng West (Hướng tây - Trái)
        Left = new JPanel();
        Left.setPreferredSize(new Dimension(260, 0));//Thay đổi kích thước Panel
        Left.setLayout(new BoxLayout(Left, BoxLayout.Y_AXIS));
        Left.setBackground(new Color(26, 35, 47));

        //Trang Chủ
        TrangChu trangChu = new TrangChu();

        //Order
        OrDer orDer = new OrDer();

        //Lịch sử đặt tiệc
        LichSu lichSu = new LichSu();

        //Thoát
        Exit exit = new Exit();

        //Panel a tạo khoảng cách giữa top và left
        JPanel a = new JPanel();
        a.setPreferredSize(new Dimension(260, 1));
        a.setBackground(new Color(13, 16, 25));

        //Khai báo các bảng nằm bên trái
        Left.setLayout(layout);
        Left.add(a);
        Left.add(trangChu.PanelHome);
        Left.add(orDer.PanelOrder);
        Left.add(lichSu.PanelHistory);
        Left.add(exit.PanelExit);
        pnBorderLayout.add(Left, BorderLayout.WEST); //Khai báo biến Left nằm bên Trái BorderLayout
        ////Kết thúc vùng West

        ////Bắt đầu vùng Center (Giữa)
        Right = new JPanel();
        Right.setLayout(new BoxLayout(Right, BoxLayout.Y_AXIS));
        Right.setLayout(card);

        //Khai báo các bảng nằm bên phải
        Right.add(trangChu.RPanelHome, "Trang 1");
        Right.add(orDer.RPanelOrder, "Trang 2");
        Right.add(lichSu.RPanelHistory, "Trang 3");

        //Khi vào Dashboard (Bảng điều khiển) sẽ xuất hiện trang chủ đầu tiên
        card.show(Right, "Trang 1");
        trangChu.PanelHome.setBackground(new Color(54, 54, 54));

        //Cài đặt click vào bảng nào thì hiện background bảng đó
        trangChu.PanelHome.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                card.show(Right, "Trang 1");
                trangChu.PanelHome.setBackground(new Color(54, 54, 54));
                orDer.PanelOrder.setBackground(new Color(26, 35, 47));
                lichSu.PanelHistory.setBackground(new Color(26, 35, 47));
                exit.PanelExit.setBackground(new Color(26, 35, 47));
            }
        });

        orDer.PanelOrder.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                card.show(Right, "Trang 2");
                trangChu.PanelHome.setBackground(new Color(26, 35, 47));
                orDer.PanelOrder.setBackground(new Color(54, 54, 54));
                lichSu.PanelHistory.setBackground(new Color(26, 35, 47));
                exit.PanelExit.setBackground(new Color(26, 35, 47));
            }
        });

        lichSu.PanelHistory.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                card.show(Right, "Trang 3");
                trangChu.PanelHome.setBackground(new Color(26, 35, 47));
                orDer.PanelOrder.setBackground(new Color(26, 35, 47));
                lichSu.PanelHistory.setBackground(new Color(54, 54, 54));
                exit.PanelExit.setBackground(new Color(26, 35, 47));
            }
        });
        pnBorderLayout.add(Right, BorderLayout.CENTER); //Khai báo Biến Right nằm ở gữa BorderLayout
        ////Kết thúc vùng Center
        this.add(pnBorderLayout);
    }
}
