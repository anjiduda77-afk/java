import java.util.Scanner;
class JDBCDriverClass
{
	public static void main(String [] args)
	{
		JDBCOperations j=new JDBCOperations();
		int res = 0;
		System.out.println("1.create Table 2.Insert 3.Retrieve Data");
		System.out.println("Enter your option");
		Scanner s = new Scanner(System.in);
		int opt = s.nextInt();

		String query = "insert into studinfo values(2, 'mani', 'M.Tech')";
		res=j.insertDataToDB(query);
		
		if(res == 1)
			System.out.println("1 row inserted successfully");
		else
			System.out.println("Unsuccessful");
	}
}