
public class secondlargest {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int i=arr[0];
	for(int j=0;j<arr.length-1;j++) {
		arr[j]=arr[j+1];
	}
	arr[arr.length-1]=i;
	for(int k:arr) {
		System.out.print(k+" ");
	}
	}

}
