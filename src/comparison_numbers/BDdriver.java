package comparison_numbers;

import java.sql.*;

public class BDdriver {
    public static void main (String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/cities?useUnicode=true&serverTimezone=UTC";
        String user = "sasha";
        String password = "Sasha285158";


        try {
            Connection con = DriverManager.getConnection (url, user, password);
            System.out.println ("Соединение успешно");
            Statement st = con.createStatement ();
            // Результирующий запрос
            ResultSet rs = st.executeQuery ("select * from country");
            // Количество колонок в результирующем запросе
            int columns = rs.getMetaData ().getColumnCount ();
            // Перебор строк с данными
            while (rs.next ()) {
                for (int i = 1; i <= columns; i++) {
                    System.out.print (rs.getString (i) + "\t");
                }
                System.out.println ();
            }
            System.out.println ();
            if (rs != null)
                rs.close ();
            if (st != null)
                st.close ();
            if (con != null)
                con.close ();
        } catch (SQLException e) {
            System.out.println ("Connection Failed! Check output console");
            e.printStackTrace ();
        }
    }
}