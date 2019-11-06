import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamDemo {

	public static void main(String[] args) {
		
		long starttime = System.currentTimeMillis();
		FileInputStream inputStream =null;
		FileOutputStream outputstream=null;
		try {
			inputStream = new FileInputStream(args[0]);
			outputstream = new FileOutputStream(args[1]);
			int data = inputStream.read();
			while (data != -1) {
				outputstream.write(data);
				data = inputStream.read();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				outputstream.close();
				inputStream.close();
			} catch (Exception e) {
			}
		}
		long endtime = System.currentTimeMillis();
		System.out.println(" Time taken  = " + (endtime- starttime)/1000 );
	}

}
