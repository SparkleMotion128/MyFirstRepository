package sharedSteps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseCommands 
{
	public static String DBFileDir;	
	public static String DBFileName;
	public static String DBTableName;
	
	public static ResultSet rs;
	
	public static void SelectAllFromTheRequiredDB() throws SQLException
	{
		// Specify location of MS Access file as variable dbFile
		String dbFile = DBFileDir+DBFileName;
		
		// Query to execute
		String query = "select * from "+DBTableName+";";
				
		// Create connection to the DB
		Connection con = DriverManager.getConnection("jdbc:ucanaccess:"+dbFile+";memory=false");
		
		// Create statement Object
		Statement stmt = con.createStatement();
		
		// Execute the SQL query. Store results in ResultSet
		ResultSet rs = stmt.executeQuery(query);
	}		
/**		
	
	// While Loop to iterate through all data and print results
		while (rs.next())
		{
			String SearchField = rs.getNString("Search");
			System.out.println(SearchField);
		}
	*/

	
	
}
