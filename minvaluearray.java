//Finding smallest value in array
public class minvaluearray {

	public static void main(String[] args) {
		int[] arr= {3,2,1,5,2};
int min=arr[0];
for(int i:arr) {
	if(i<min)min=i;
}
System.out.println(min);
	}

}
