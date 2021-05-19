package Window;

import javax.swing.*;
import java.awt.*;

public class TrangChu {
    JPanel PanelHome;
    JLabel Home;
    ImageIcon iconHome;
    JPanel RPanelHome;
    JLabel RHome;

    public TrangChu() {
        LeftHome();
        RightHome();
    }

    public void LeftHome() {
        //Thêm icon vào Trang chủ
        iconHome = new ImageIcon(new ImageIcon("image\\Home.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));

        //Tạo giao diện trái
        PanelHome = new JPanel();
        PanelHome.setPreferredSize(new Dimension(260, 60));
        PanelHome.setLayout(new BoxLayout(PanelHome, BoxLayout.X_AXIS)); //Vị trí label bên trái
        Home = new JLabel("Trang Chủ");
        Home.setIcon(iconHome);
        Home.setForeground(Color.WHITE);
        Home.setFont(new Font("Tahoma", Font.PLAIN, 16));
        PanelHome.setBackground(new Color(26, 35, 47));
        PanelHome.add(Home);
    }

    public void RightHome() {
        //Tạo trang giao diện phải
        RPanelHome = new JPanel();
        RHome = new JLabel("Trang 1");
        RHome.setForeground(Color.BLACK);
        RHome.setFont(new Font("Tahoma", Font.PLAIN, 16));
        RPanelHome.add(RHome);
        RPanelHome.setBackground(new Color(245, 255, 250));

        //Tạo chức năng

    }
}
