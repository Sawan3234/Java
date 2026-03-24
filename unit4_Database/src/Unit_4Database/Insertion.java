package Unit_4Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Insertion {
   Connection con;
   Statement st;
   ResultSet set;
   public Insertion() throws ClassNotFoundException, SQLException {
     con = new DataBase().__getcon__();
     if (con == null) {
       System.out.println("Connection failed!");
       return;
    }
    st = con.createStatement();

  String insert = "INSERT INTO college_tbl(name) VALUES ('Hetauda school of management')";
  st.executeUpdate(insert);
  JOptionPane.showMessageDialog(null, "Data inserted Successfully");
  set = st.executeQuery("SELECT * FROM college_tbl");
  
  while (set.next()) {
    System.out.println("College id = " + set.getInt("id"));
    System.out.println("College name = " +
    set.getString("name"));
    }
  }
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
   new Insertion();
  }
}