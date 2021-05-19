package MainKetNoiSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiSQL {
    private static String url="jdbc:sqlserver://localhost;databaseName=QuanLyNhaHang;";
    private static String driveName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String username = "sa";
    private static String password = "123";
    private static Connection connection;
    private static String urlstring;
public static Connection getConnection(){
    try {
        Class.forName(driveName);
        try {
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Thanh cong");
        }catch (SQLException ex){
            System.out.println("Khong tao duoc ket noi co so du lieu");
            ex.printStackTrace();
        }
    }catch (ClassNotFoundException ex){
        System.out.println("Khong tim thay Driver");
    }
    return connection;
}
    public static void main(String[] args) {
        getConnection();
    }
}
