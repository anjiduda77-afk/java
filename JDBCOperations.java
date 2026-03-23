import java.sql.*;

class JDBCOperations
{
	Connection con = null;
		int res = 0;
	JDBCOperations()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException ce)
		{
			System.out.println("Exception: " + ce);
		}
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studdb", "root", "root");
		}
		catch(SQLException se)
		{
			System.out.println("Exception: " + se);
		}

		 
	}
	
	int insertDataToDB(String query)
	{
		//3. Creating and executing a statement
		try
		{
			Statement st = con.createStatement();
			res = st.executeUpdate(query);
		}
		catch(SQLException se)
		{
			System.out.println("Exception: " + se);
		}
		
		return res;
		 
	}
}