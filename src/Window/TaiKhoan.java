package Window;

import javax.swing.*;
import java.awt.*;

public class TaiKhoan {
    ImageIcon iconAccount;
    JPanel PanelAccount;
    JLabel Account;

    public TaiKhoan() {
        VTaiKhoan();
    }

    public void VTaiKhoan() {
        //Thêm icon
        iconAccount = new ImageIcon(new ImageIcon("image\\Account.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));

        //Tạo giao diện trái
        PanelAccount = new JPanel(new BorderLayout());
        PanelAccount.setPreferredSize(new Dimension(60, 80));
        Account = new JLabel("");
        Account.setIcon(iconAccount);
        Account.setForeground(Color.WHITE);
        Account.setFont(new Font("tahoma", Font.PLAIN, 16));
        PanelAccount.setBackground(new Color(26, 35, 47));
        PanelAccount.add(Account, BorderLayout.CENTER);
    }
}
