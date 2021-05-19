package LoginAndRegistration;

import MainKetNoiSQL.KetNoiSQL;
import Window.mainframe;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends JFrame {
    private JPanel MainLogin;
    private JLabel TieuDe;
    private JTextField NhapUsername;
    private JPasswordField NhapPassword;
    private JButton login;
    private JLabel Username;
    private JLabel Password;
    private JPanel Left;
    private JPanel Right;
    private JLabel ImageUser;
    private JButton KetNoiDangKy;
    private JCheckBox ShowPassword;
    private Border matteBorderColor;
    private Border matteBorderIcon;
    Connection connection = null;
    Statement st = null;
    ResultSet set = null;

    public Login() {
        super("Quản Lý Nhà Hàng");
        this.setContentPane(this.MainLogin);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(640, 380);
        this.setLocationRelativeTo(null); //Hiển thị cửa sổ giữa màn hình
        this.setResizable(false); //Khóa phóng to, thu nhỏ
        this.setVisible(true);

        //Kết nối SQL Server + Đăng Nhập
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String userName = NhapUsername.getText();
                    String password = NhapPassword.getText();
                    Pattern pattern = Pattern.compile("[a-zA-Z0-9_-]{5,10}$");
                    Matcher matcher = pattern.matcher(userName);
                    Matcher matcher1 = pattern.matcher(password);
                    if (matcher.find() && matcher1.find()) {
                        connection = KetNoiSQL.getConnection();
                        String query = "Select * from TaiKhoan where TenTk ='" + userName + "' and MatKhau = '" + password + "'";
                        st = connection.createStatement();
                        set = st.executeQuery(query);
                        if (set.next()) {
                            JOptionPane.showMessageDialog(null, "Login thành công");
                            //Chổ để code khi đã Login thành công
                            mainframe frame = new mainframe();
                            frame.setVisible(true);
                            dispose(); //Phá hủy cửa sổ Window khi đăng nhập được
                        } else {
                            JOptionPane.showMessageDialog(null, "Mời đăng nhập lại!!!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Mời đăng nhập lại!!!");
                    }
                } catch (Exception el) {
                }
            }
        });

        KetNoiDangKy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registration registration = new Registration();
                registration.setSize(800, 500);
                registration.setLocationRelativeTo(null); //Hiển thị cửa sổ giữa màn hình
                registration.setResizable(false);//Khóa phóng to, thu nhỏ
                registration.setVisible(true);
                dispose(); //Phá hủy cửa sổ Window Đăng nhập
            }
        });

        ShowPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ShowPassword.isSelected()) {
                    NhapPassword.setEchoChar((char) 0);
                } else {
                    NhapPassword.setEchoChar('•');
                }
            }
        });

    }

    private void createUIComponents() {
        //Thêm hình ảnh, đổi kích thước ảnh
        ImageIcon icon = new ImageIcon(new ImageIcon("image\\User.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        ImageIcon iconName = new ImageIcon(new ImageIcon("image\\username.png").getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        ImageIcon iconLock = new ImageIcon(new ImageIcon("image\\lock.png").getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        ImageUser = new JLabel("", icon, SwingConstants.CENTER);
        Username = new JLabel("", iconName, SwingConstants.CENTER);
        Password = new JLabel("", iconLock, SwingConstants.CENTER);
    }
}