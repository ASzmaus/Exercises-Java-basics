/**
Dates in the text file saved in the home directory are of the form YYYY-MM-DD (year-month-day). In addition to dates, the file contains other information. Read the file and write out all correct dates in one line - that is: after highlighting all fragments that may be dates, check their correctness (e.g. if the number of days in a month is correct)
The program should treat non-uniform information in a specific way
 */
package Date;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


  public static void main(String[] args) {
	 Scanner sc = null;
	 try {
		 String fname = System.getProperty("user.home") + "date.txt";
		 File name = new File(fname);
		 sc = new Scanner(name);
		 String s = "";
		 String regexp = "(19|2[0-9])[0-9]{2}-\\d{2}-\\d{2}(?!\\d+)"; 
		 Pattern pattern = Pattern.compile(regexp); 
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		 while(sc.hasNext()) {
			  Matcher matcher = pattern.matcher(sc.next());
		  while (matcher.find()) {
	          s= matcher.group(); 
		      Date dateStr = formatter.parse(s);
		      String formattedDate = formatter.format(dateStr);
		      if(formattedDate.equals(s)) {
		      System.out.print(formattedDate + " ");
		      }
		    }
		 }
	}catch(Exception exc) {
		exc.printStackTrace();
	}finally {
		sc.close();
    }
  }
 }
