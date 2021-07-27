package Appender;
/* Define the Appender append (String app, int n) method in the class, 
 * which appends the n-times duplicate string represented by app to the source string src.*/

public class Main {

  public static void main(String[] args) {
    Appender ap = new Appender("Ala");
    ap.append(" has cat", 3).append( " and dog", 2);
    System.out.println(ap);
    ap.append(" olala", 3);
    System.out.println(ap);
  }

}
