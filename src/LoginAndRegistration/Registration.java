package LoginAndRegistration;

import MainKetNoiSQL.KetNoiSQL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration extends JFrame {
    private JPanel Center;
    private JLabel TieuDe;
    private JLabel Username;
    private JTextField NhapUserName;
    private JPasswordField NhapPassword;
    private JTextField NhapSoDT;
    private JLabel Password;
    private JLabel SoDT;
    private JButton Register;
    private JPanel MainRegister;
    private JButton KetNoiDangNhap;
    private JCheckBox ShowPassword;
    private JPasswordField NhapConfirmPassword;
    private JLabel Name;
    private JTextField NhapHoTen;
    private JTextField NhapDiaChi;
    private JLabel Address;
    private JTextField NhapDate;
    private JLabel Logo;
    private JPanel Left;
    private JPanel Right;
    private JPanel Bottom;
    private JPanel Top;
    private JLabel Date;
    private JLabel ConfirmPassword;

    public Registration() {
        super("Quản Lý Nhà Hàng");
        this.setContentPane(this.MainRegister);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.pack(); //Tự động thay đổi kích thước JFame dựa trên kích thước component nó chứa
        Register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String userName = NhapUserName.getText();
                    String password = NhapPassword.getText();
                    String confirmPassword = NhapConfirmPassword.getText();
                    String fullName = NhapHoTen.getText();
                    String soDT = NhapSoDT.getText();
                    String addRess = NhapDiaChi.getText();
                    String daTe = NhapDate.getText();
                    Pattern pattern = Pattern.compile("[a-zA-Z0-9_-]{5,10}$");
                    Pattern patternFullName = Pattern.compile("^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ" + "ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ" + "ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s]+$");
                    Pattern patternPhoneNumber = Pattern.compile("^0[983]{1}\\d{8}$");
                    Pattern patternAddress = Pattern.compile("^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ0-9" + " , " + "ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ" + "ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s]+$");
                    Pattern patternDate = Pattern.compile("^[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$");
                    Matcher matcherUserName = pattern.matcher(userName);
                    Matcher matcherPassword = pattern.matcher(password);
                    Matcher matcherFullName = patternFullName.matcher(fullName);
                    Matcher matcherPhoneNumber = patternPhoneNumber.matcher(soDT);
                    Matcher matcherAddress = patternAddress.matcher(addRess);
                    Matcher matcherDate = patternDate.matcher(daTe);
                    if (matcherUserName.find()) {
                        if (matcherPassword.find()) {
                            if (matcherFullName.find()) {
                                if (matcherPhoneNumber.find()) {
                                    if(matcherAddress.find()) {
                                        if (matcherDate.find()) {
                                            if (!password.isEmpty() && !confirmPassword.isEmpty()) {
                                                if (password.equals(confirmPassword)) {
                                                    Connection connection = KetNoiSQL.getConnection();
                                                    String query = "INSERT TaiKhoan values('" + userName + "','" + password + "') " +
                                                            "INSERT KhachHang values('" + fullName + "','" + soDT + "','" + addRess + "')" +
                                                            "INSERT DangKy values('" + userName + "','" + soDT + "','" + daTe + "')";
                                                    Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
                                                    int x = statement.executeUpdate(query);
                                                    if (x == 0) {
                                                        JOptionPane.showMessageDialog(null, "Tài khoản đã tồn tại");
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Bạn đã tạo tài khoản thành công");
                                                        Login login = new Login();
                                                        login.setSize(640, 380);
                                                        login.setVisible(true);
                                                        dispose();
                                                    }
                                                    connection.close();
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Mật khẩu chưa trùng khớp!!!");
                                                }
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng định dạng ngày yyyy-mm-dd!!!");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Vui lòng nhập ghi rõ địa chỉ!!!");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng số điện thoại!!!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng họ và tên!!!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng password có độ dài từ 5-10 kí tự, không có khoảng trắng và không dấu!!!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng username có độ dài từ 5-10 kí tự, không có khoảng trắng và không dấu!!!");
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Nhập sai mời nhập lại!!!");
                }
            }
        });
        KetNoiDangNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                login.setVisible(true);
                dispose();
            }
        });
        ShowPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ShowPassword.isSelected()) {
                    NhapPassword.setEchoChar((char) 0);
                    NhapConfirmPassword.setEchoChar((char) 0);
                } else {
                    NhapPassword.setEchoChar('•');
                    NhapConfirmPassword.setEchoChar('•');
                }
            }
        });
    }

    private void createUIComponents() {
        ImageIcon iconLogo = new ImageIcon(new ImageIcon("image\\logo-restaurant.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        ImageIcon iconName = new ImageIcon(new ImageIcon("image\\username.png").getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        ImageIcon iconLock = new ImageIcon(new ImageIcon("image\\lock.png").getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        ImageIcon iconConfirm = new ImageIcon(new ImageIcon("image\\check-lock.png").getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        ImageIcon iconFullName = new ImageIcon(new ImageIcon("image\\name.png").getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        ImageIcon iconPhone = new ImageIcon(new ImageIcon("image\\phone-number.png").getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        ImageIcon iconAddress = new ImageIcon(new ImageIcon("image\\address.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        ImageIcon iconDate = new ImageIcon(new ImageIcon("image\\date.png").getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        Logo = new JLabel("", iconLogo, SwingConstants.CENTER);
        Username = new JLabel("", iconName, SwingConstants.CENTER);
        Password = new JLabel("", iconLock, SwingConstants.CENTER);
        ConfirmPassword = new JLabel("", iconConfirm, SwingConstants.CENTER);
        Name = new JLabel("", iconFullName, SwingConstants.CENTER);
        SoDT = new JLabel("", iconPhone, SwingConstants.CENTER);
        Address = new JLabel("", iconAddress, SwingConstants.CENTER);
        Date = new JLabel("", iconDate, SwingConstants.CENTER);
    }
}
