//insertion in array
class ArrayInsertion{
public static void main(String[] args){
int[] arr={1, 2, 3, 4, 5};
  int insert=4;
  int value=7;
  for(int i=arr.length-1;i>insert;i--){
      arr[i]=arr[i-1];
  }
  arr[insert]=value;
  for(int j:arr)System.out.print(j+" ");
}
}
