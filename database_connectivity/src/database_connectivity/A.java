package database_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class A {
public static void main(String[] args) {
	try {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dataset", "root", "Vinod654@");

       //PreparedStatement ps = con.prepareStatement("insert into logine values(?,?,?,?,?,?)");
//       ps.setString(1, "vinod@g,ail.com");
//       ps.setString(2, "vinod@g,ail.com");
//       ps.setString(3, "vinod@g,ail.com");
//       ps.setString(4, "vinod@g,ail.com");
//       ps.setString(5, "vinod@g,ail.com");
//       ps.setString(6, "vinod@g,ail.com");
//       ps.executeUpdate();
       
       
//       PreparedStatement ps = con.prepareStatement("select * from logine");       
//		ResultSet result = ps.executeQuery();
//		while(result.next()) {
//			System.out.print(result.getString(1)+" ");
//			System.out.print(" "+result.getString(2));
//			System.out.print(" "+result.getString(3));
//			System.out.print(" "+result.getString(4));
//			System.out.print(" "+result.getString(5));
//			System.out.print(" "+result.getString(6));
//		}

		
		Statement stmnt = con.createStatement();

		//stmnt.execute("alter table logine add column DOB varchar(20)");
//		ResultSet result = stmnt.executeQuery("desc logine");
//		while(result.next()) {
//			System.out.print(result.getString(1)+" ");
//			System.out.print(" "+result.getString(2));
//			System.out.print(" "+result.getString(3));
//     		System.out.print(" "+result.getString(4));
//			System.out.print(" "+result.getString(5));
//			System.out.print(" "+result.getString(6));
//			System.out.println();
//		}
		//stmnt.executeUpdate("insert into logine values('sdd','dwdwd','wdd','dd','12','hggg')");
		//stmnt.executeUpdate("update logine set state='H.P' where name='sdd'");
		ResultSet res = stmnt.executeQuery("select * from logine");
		while(res.next()) {
			System.out.print(res.getString(1)+" ");
			System.out.print(" "+res.getString(2));
			System.out.print(" "+res.getString(3));
			System.out.print(" "+res.getString(4));
			System.out.print(" "+res.getString(5));
			System.out.print(" "+res.getString(6));
			System.out.println();
		}
		
		stmnt.close();
		con.close();
	}
	catch (Exception e) {
        e.printStackTrace();
	}
}
}
