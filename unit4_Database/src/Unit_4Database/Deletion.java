package Unit_4Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Deletion {
  Connection con;
  Statement st;
  ResultSet set;

  public Deletion() throws ClassNotFoundException, SQLException {
    con = new DataBase().__getcon__();
  if (con == null) {
    System.out.println("Connection failed!");
    return;
   }
  
  st = con.createStatement();
  String delete = "DELETE FROM college_tbl WHERE id =2";
  st.executeUpdate(delete);
  
  JOptionPane.showMessageDialog(null, "Data updated Successfully");
  set = st.executeQuery("SELECT * FROM college_tbl");
  while (set.next()) {
    System.out.println("College id = " + set.getInt("id"));
    System.out.println("College name = " + set.getString("name"));
   }
}

public static void main (String args[]) throws ClassNotFoundException, SQLException {
new Deletion();
  }
}