import java.util.*;
public class onlydigitinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
sc.close();
String temp=""; 
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)>='0'&&s.charAt(i)<='9')temp+=s.charAt(i);
}
System.out.println(temp);
	}

}
