
public class sortedornot {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
		int a=arr[0];
		boolean flag=true;
		for(int i=0;i<arr.length;i++){
			if(a<=arr[i]) {
				flag=true;
			
				
			}
		  else { flag=false; break;}
			a=arr[i];
		}
if(flag)System.out.println("It's Sorted");
else System.out.println("Error!");
	}

}
