//Check how many unique elements present in array
public class Uniqueelementsinarray {

	public static void main(String[] args) {
		int[] arr={1,1,2,2,2,2,2,3,3,4};
		int i=0;
	for(int j=0;j<arr.length;j++) {
		if(arr[i]!=arr[j]) {
			arr[i+1]=arr[j];
			i++;
		}
	}
	System.out.println(i+1);
	}

}
