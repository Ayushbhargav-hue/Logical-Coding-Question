//finding second largest element in array
public class secondlargest {

	public static void main(String[] args) {
		int[] arr={5,5,5,5,5,5};
		int a=arr[0],sl=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>a) {
				sl=a;
				a=arr[i];
			}
		}
		System.out.println(sl);
	}

}
