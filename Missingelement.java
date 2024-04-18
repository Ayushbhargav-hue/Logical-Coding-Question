class Missingelement
{
	public static void main(String[] args) {
		int[] arr={1,2,4,5};
		int n=5;
		int sum=n*(n+1)/2;
		int a=0;
		for(int i=0;i<arr.length;i++)a+=arr[i];
		System.out.println(sum-a);
	}
}
