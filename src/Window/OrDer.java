package Window;

import javax.swing.*;
import java.awt.*;

public class OrDer {
    JPanel PanelOrder;
    JLabel Order;
    ImageIcon iconOrder;
    JPanel RPanelOrder;
    JLabel ROrder;

    public OrDer() {
        LeftOrder();
        RightOrder();
    }

    public void LeftOrder() {
        //Thêm icon
        iconOrder = new ImageIcon(new ImageIcon("image\\Order.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));

        //Tạo giao diện trái
        PanelOrder = new JPanel();
        PanelOrder.setPreferredSize(new Dimension(260, 60));
        PanelOrder.setLayout(new BoxLayout(PanelOrder, BoxLayout.X_AXIS));
        Order = new JLabel("Order");
        Order.setIcon(iconOrder);
        Order.setForeground(Color.WHITE);
        Order.setFont(new Font("Tahoma", Font.PLAIN, 16));
        PanelOrder.add(Order);
        PanelOrder.setBackground(new Color(26, 35, 47));
    }

    public void RightOrder() {
        //Tạo giao diện phải
        RPanelOrder = new JPanel(new BorderLayout());
        RPanelOrder.setBackground(new Color(245, 255, 250));
        CardLayout card = new CardLayout();

        //Tạo chức năng

        //Tạo khoảng cách trên
        JPanel datban = new JPanel(new BorderLayout());
        datban.setPreferredSize(new Dimension(100, 20));
        datban.setBackground(new Color(245, 255, 250));
        RPanelOrder.add(datban, BorderLayout.NORTH);

        //Đặt bàn
//        JPanel ban = new JPanel();
//        ban.setPreferredSize(new Dimension(700, 200));
//        ban.setBackground(new Color(255, 255, 255));
//        RPanelOrder.add(ban, BorderLayout.WEST);


        //Tạo panel đặt
        JPanel dat = new JPanel(new BorderLayout());
        dat.setPreferredSize(new Dimension(800, 200));
        dat.setBackground(new Color(0, 0, 128));
        RPanelOrder.add(dat, BorderLayout.WEST);

        //Click đặt bàn
        JButton datBanButton = new JButton();
        datBanButton.setBounds(200,100,100,50);
        dat.add(datBanButton, BorderLayout.NORTH);

        //Đặt món ăn
//        JPanel monan = new JPanel();
//        monan.setPreferredSize(new Dimension(800, 200));
//        monan.setBackground(new Color(0, 0, 128));
//        dat.add(monan, BorderLayout.WEST);

        //Tạo panel hóa đơn
        JPanel hoadon = new JPanel();
        hoadon.setPreferredSize(new Dimension(400, 200));
        hoadon.setBackground(new Color(255, 0, 0));
        RPanelOrder.add(hoadon, BorderLayout.EAST);

    }
}
