package jdbdemo;

import java.sql.*;

class Driver {

	public static void main(String[] args) {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/record_company";
		String user = "root";
		String password = "3740214s";
		try {
			Class.forName(driverName);
			
			Connection myConn = DriverManager.getConnection(url , user , password);
			
			Statement myStmt = myConn.createStatement();
			
////			ResultSet myRs = myStmt.executeQuery("select * from employee");
//			
//			While (myRs.next()); {
//				System.out.println(myRs.getString("first_Name") + ", " + myRs.getString("email"));
//			}
			
			
			String sql = "insert into employee " + "(first_name, email, mobile, designation, salary)" + 
			"values ('Seedy darbo', 'seedyadrbo11@gmail.com', '073664748494', 'n/a', 40000 )";
			
			myStmt.executeUpdate (sql);
			
			System.out.println("mision respected");
			
			
			
			
		} catch (Exception exc) {}
		//comment
		
	}

	public static void While(boolean next) {
		// TODO Auto-generated method stub
		
	}

//	private static void While(boolean next) {
//		// TODO Auto-generated method stub
//		
//	}

}
