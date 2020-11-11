import java.sql.*;
public class Login {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/studentdb";
		String uname="prathyu";
		String pass="root";
		String query = "select * from student where url=2";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			
		String name = rs.getString("uname");
		String pas=rs.getString("pass");
		System.out.println(name);
		System.out.println(pas);
		}
		st.close();
		con.close();
	}

}
