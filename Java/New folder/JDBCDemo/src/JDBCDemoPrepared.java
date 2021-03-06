import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class JDBCDemoPrepared {

	public static void main(String[] args) {
		Scanner sc=null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String userName = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, userName,password);
			
			String sql = "SELECT * FROM Trainee WHERE traineeId = ? and traineeName = ?";
			sc = new Scanner(System.in);
			System.out.println("Enter id to search data :: ");
			int id = sc.nextInt();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+" --> "+rs.getString(2));
				System.out.println(rs.getString("traineeName"));
			}
			
		}
			catch (SQLException | ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
