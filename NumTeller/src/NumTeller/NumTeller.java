package NumTeller;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class NumTeller {
	static String result="";
	public int number=0;
	
	public static String say(int number) {
		
		if (((Object)number).getClass().getName()!="java.lang.Integer")
		 throw new InputMismatchException();

		String str = Integer.toString(number);

		String temp="";
		String result;
		
		if (number>=0 && number<=8){	
			if (number==0) {
				temp= "owy";
			}
			else if (number==1) {
				temp= "szy";
			}
			else if (number==2) {
				temp= "gi";
			}
			else if (number==3) {
				temp= "ci";
			}
			else if (number==4 || number==5 || number==6) {
				temp= "ty";
			}
			else if (number==7 || number==8) {
				temp= "my";
			}
			result = str + " = " + str + "-" +temp;
		}
		else {
			if(str.endsWith("1") && !str.endsWith("11")) {
				temp="szy";
			}
			else if(str.endsWith("2") && !str.endsWith("12")) {
				temp="gi";
			}
			else if(str.endsWith("3") && !str.endsWith("13")) {
				temp="ci";
			}
			else if ((str.endsWith("0") && number%100!=0 && number%1000000!=0) || (str.endsWith("4") || str.endsWith("5") || str.endsWith("6") || str.endsWith("9") || str.endsWith("11")|| str.endsWith("12") || str.endsWith("13") || str.endsWith("14") || str.endsWith("15") || str.endsWith("16") || str.endsWith("17") || str.endsWith("18") || str.endsWith("19")) ) {
				temp="ty";
			}
			else if(str.endsWith("7") || str.endsWith("8") && !str.endsWith("17") && !str.endsWith("18")){
				temp="my";
			}
			else if(number%100==0 && number%1000000!=0){
				temp="ny";
			}
			else if(number%1000000==0 ){
				temp="owy";
			}
			else {
				throw new NoSuchElementException();
			}
			result = str + "-" +temp;
		}
		return result;
	}
}
