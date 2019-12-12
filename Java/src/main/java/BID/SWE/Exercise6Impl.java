package BID.SWE;

import java.sql.*;

public class Exercise6Impl implements Exercise6 {

    @Override
    public Object Method1() {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/TestAbgaben", "root", "");
            Statement stmt = conn.createStatement();
            Statement statement = conn.createStatement();

            int st = 17, min = 5;
            String name = "Michael Weissenboeck";

            PreparedStatement ps = conn
                    .prepareStatement("INSERT INTO TestAbgaben (Stunde, Minute, Name) VALUES (?,?,?)");


            ps.setInt(1, st);
            ps.setInt(2, min);
            ps.setString(3, name);

//            ResultSet rs = ps.executeQuery();
//            while (rs.next())
//                System.out.println(rs.getString(1) + "\n" + rs.getString(2));
//            ps.close();
//            conn.close();

            return ps;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
