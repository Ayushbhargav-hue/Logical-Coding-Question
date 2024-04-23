public class multiplecatchexample
{
	public static void main(String[] args) {
		try{int[] arr=new int[2];
		arr[3]=1;
		     System.out.println("Try block executed");
	 
		   
		}
		catch(ArithmeticException e){
		    System.out.println("Arithmetic error");
		}
		catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("Array Index out of bound exception");
		}
	}
}
