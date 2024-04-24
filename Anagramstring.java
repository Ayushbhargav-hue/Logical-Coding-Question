import java.util.*;
public class Anagramstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
sc.close();
char[] temp1=s1.toCharArray();
char[] temp2=s2.toCharArray();
Arrays.sort(temp1);
Arrays.sort(temp2);
boolean flag=false;
for(int i=0,j=0;i<s1.length()&&j<s2.length();i++,j++) {
	if(temp1[i]==temp2[j])flag=true;
	else flag=false;
}

if(flag)System.out.println("Anagram");
else System.out.println("Not Anagram");
	}

}
