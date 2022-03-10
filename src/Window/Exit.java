package Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Exit {

    JPanel PanelExit;
    JLabel Exit;
    ImageIcon iconExit;

    public Exit() {
        //Thêm icon
        iconExit = new ImageIcon(new ImageIcon("C:\\Users\\TRUYEN\\Desktop\\QuanLyNhaHang\\src\\image\\Exit.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));

        //Tạo giao diện + chức năng Exit
        PanelExit = new JPanel();
        PanelExit.setPreferredSize(new Dimension(300, 60));
        PanelExit.setLayout(new BoxLayout(PanelExit, BoxLayout.X_AXIS));
        Exit = new JLabel("Thoát");
        Exit.setIcon(iconExit);
        Exit.setForeground(Color.WHITE);
        Exit.setFont(new Font("Tahoma", Font.PLAIN, 16));
        PanelExit.setBackground(new Color(26, 35, 47));
        PanelExit.add(Exit);

        //Click Thoát
        PanelExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (click == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }
}
