package Unit_4Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Update{
Connection con;
Statement st;
ResultSet set;

public Update() throws ClassNotFoundException, SQLException {
con = new DataBase().__getcon__();
if (con == null) {
  System.out.println("Connection failed!");
  return;
}
st = con.createStatement();
String update = "UPDATE college_tbl SET name = 'Vedas College' WHERE id =2";
st.executeUpdate(update);
JOptionPane.showMessageDialog(null, "Data updated Successfully");
set = st.executeQuery("SELECT * FROM college_tbl");

while (set.next()) {
  System.out.println("College id = " + set.getInt("id"));
  System.out.println("College name = " + set.getString("name"));
 }
}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
// TODO Auto-generated method stub
new Update();
}
}
