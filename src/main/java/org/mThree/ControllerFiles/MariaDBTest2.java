package org.mThree.ControllerFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author pooya
 */
public class MariaDBTest2 {
	public static void main(String[] args) {
		System.out.println("asdas");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://stockdb.cj3bjba60knj.us-east-2.rds.amazonaws.com/project","mthreeadmin","N00840896");
//here sonoo is database name, root is username and password
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM day_data");
			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			con.close();
		}catch(Exception e){ System.out.println(e);}
	}
}
