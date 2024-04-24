import java.util.*;
public class firstcharactersameinstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		sc.close();
        boolean flag=false;
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(i)) {flag=true; break;}
				else {
				System.out.println("NOT FOUND SAME AT SAME INDEX");
				break;
				}
			}
		}
		if(flag)System.out.println("SAME Found");
		
	}

}
