import java.sql.Statement;
import java.sql.Connection;

import java.sql.ResultSet;

public class SelectJDBC {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionsProvider.getConnection();
            String q = "select * from table1";
            Statement stmt = con.createStatement();
            ResultSet set =stmt.executeQuery(q);

            while(set.next()){
                int id= set.getInt(1);
                String name =set.getString(2);
                String city =set.getString(3);
                System.out.println(id+" : "+name+" : "+city);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
