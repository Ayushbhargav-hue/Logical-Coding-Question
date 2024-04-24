import java.util.*;
public class spiltstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String[] temp=s.split(" ");
sc.close();
for(String a:temp) {
	System.out.print(a);
}
	}

}
