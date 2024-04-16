//deletion of element present at specific index
class Arraydeletion 
{
	public static void main(String[] args) {
  int[] arr={1, 2, 3, 4, 5};
  int delete=4;
  for(int i=delete;i<arr.length-1;i++){
      arr[i]=arr[i+1];
  }
  arr[delete]=0;
  for(int j:arr)System.out.print(j+" ");
	}
}
