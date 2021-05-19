package Window;

import javax.swing.*;
import java.awt.*;

public class LichSu {
    ImageIcon iconHistory;
    JPanel PanelHistory;
    JLabel History;
    JPanel RPanelHistory;
    JLabel Rhistory;

    public LichSu() {
        LeftLichSu();
        RightLichSu();
    }

    public void LeftLichSu() {
        //Thêm icon
        iconHistory = new ImageIcon(new ImageIcon("image\\history.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));

        //Tạo giao diện trái
        PanelHistory = new JPanel();
        PanelHistory.setPreferredSize(new Dimension(260, 60));
        PanelHistory.setLayout(new BoxLayout(PanelHistory, BoxLayout.X_AXIS));
        History = new JLabel("Lịch sử");
        History.setIcon(iconHistory);
        History.setForeground(Color.WHITE);
        History.setFont(new Font("Tahoma", Font.PLAIN, 16));
        PanelHistory.setBackground(new Color(26, 35, 47));
        PanelHistory.add(History);
    }

    public void RightLichSu() {
        //Tạo giao diện phải
        RPanelHistory = new JPanel();
        Rhistory = new JLabel("Trang 3");
        Rhistory.setForeground(Color.BLACK);
        Rhistory.setFont(new Font("Tahoma", Font.PLAIN, 16));
        RPanelHistory.add(Rhistory);
        RPanelHistory.setBackground(new Color(245, 255, 250));

        //Tạo chức năng
    }
}
