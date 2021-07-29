package GoodsThreads;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import java.util.Iterator;
import java.util.LinkedHashMap;

import java.util.Map.Entry;
import java.util.Set;

public class FileSaved {
public static void main(String[] args) throws IOException {

	 Writer wr  = null;
	 try {
		 wr = new FileWriter("C:\\Users\\aga\\git\\Exercises-Java-basics\\goods.txt");
  
		 LinkedHashMap<Integer, Integer> goods= new LinkedHashMap<>();
		 for( int i=1; i<=10000;i++) {
			 goods.put(i,i+10);
		 }
		 Set<Entry<Integer, Integer>> entries = goods.entrySet();
		 Iterator<Entry<Integer, Integer>> moviesIterator = entries.iterator();
		 while(moviesIterator.hasNext()) {
			 Entry<Integer, Integer> entry = moviesIterator.next();
			 wr.write(entry.getKey() + " " + entry.getValue() + " " ); 
		 }
	 } catch(IOException ex){
		 System.out.println("File operation error: "+ex);
	 }finally {
		 wr.close();
	 }
	}
}