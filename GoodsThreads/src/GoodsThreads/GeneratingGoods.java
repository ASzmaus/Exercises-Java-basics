package GoodsThreads;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GeneratingGoods {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("C:\\Users\\aga\\git\\Exercises-Java-basics\\goods.txt");
			for( int i=1; i<=10000; i++ ) {
				out.write(i);
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			out.close();
		}

	}

}
