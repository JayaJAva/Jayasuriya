package jaya;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HIT {
	public static void main(String[] args) {
		System.out.println("hi");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.16.5.73:1521:oracle","cse1514021","cse1514021");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select REG_N0,NAME from HIT");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}
