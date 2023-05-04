package demo;
import java.util.*;

public class binarysearch {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the String");
		 String a=sc.next();
		 String ac="";
		 for(int i=a.length()-1;i>=0;i--) {
			 ac=ac+a.charAt(i);
			 
		 }
		 System.out.println(ac);
	}

}
