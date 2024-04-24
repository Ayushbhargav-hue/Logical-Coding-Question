import java.util.*;
public class countalphabetsinstring {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	       String s=sc.nextLine();
	       sc.close();
	       int count=0;
	       for(int i=0;i<s.length();i++) {
	    	   if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')count++;
	       }
	       System.out.println(count);
	}

}
