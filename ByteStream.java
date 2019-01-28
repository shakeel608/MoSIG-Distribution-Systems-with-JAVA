// Java Program illustrating the Byte Stream to copy  
// contents of one file to another file. 
import java.io.*;

public class ByteStream {
	public static void main(String[] args) throws IOException {

		FileInputStream  src = null;
		FileOutputStream target = null;


		try {

			src  = new FileInputStream("test.txt");
			target = new FileOutputStream("target.txt");

			//Reading Soure File and writing to target file

			int temp;
			while((temp = src.read()) !=-1)
				target.write((byte)temp);


		}

		finally {
			if(src !=null)
				src.close();
			if(target != null)
				target.close();
		}
	}
}