import java.io.*;
class FileInputSteram
{
	public static void main(String args[])
	{
		FileInputSteream f = new FileInputStream("test.txt");
		int i;
		while((i=f.read())!=-1)
		{
			System.out.Println((char)i);
		}
		f.close();
	}
}