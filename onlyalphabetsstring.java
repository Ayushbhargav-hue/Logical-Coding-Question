import java.util.*;
public class onlyalphabetsstring {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       sc.close();
       String temp="";
       for(int i=0;i<s.length();i++) {
    	   if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')temp+=s.charAt(i);
       }
       System.out.println(temp);
	}

}
