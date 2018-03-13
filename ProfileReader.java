import java.io.*;
public class ProfileReader {

	public static void main(String args[]) throws IOException
	{
		FileReader fr= new FileReader("C:\\Users\\rawri\\eclipse-workspace\\listOfPeople.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s= br.readLine())!=null)
				{
			System.out.println(s);
				}
		fr.close();
	}
}
