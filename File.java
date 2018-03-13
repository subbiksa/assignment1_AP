package mininet;
import java.io.*;

public class File {
	
		public static void main(String[] args) throws IOException{
			FileReader fr = new FileReader("Data.txt");
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str = br.readLine()) != null) {
			System.out.println(str);
			}
			fr.close();
		}
	}

