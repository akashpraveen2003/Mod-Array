package mod_Array;

import java.util.Scanner;

/*
 You are given a large number in the form of a array A of size N where each element denotes a digit of the number.
You are also given a number B. You have to find out the value of A % B and return it.


	Input 1:
	
	A = [1, 4, 3] B = 2
	
	Input 2:
	
	A = [4, 3, 5, 3, 5, 3, 2, 1] B = 47
	
	Output 1:
	
	1
	
	Output 2:
	
	20
		
	
 */
public class Mod_Array {

	private static void calculate_mod_array(int[] array, int divisor) {
		
		int power=1;			// Power initialized to 1
		int result=0;			// Final value the result stores
		
		for(int i=array.length-1;i>=0;i--)			// Iterating from the last digit
		{
			int number=array[i]%10;					// Getting the last digit
			
			int temp=number*(power%divisor);		// Since,Number is a single value, we mod the power with divisor
			
			result=(result+temp)%divisor;			// Then we add the mod value of the number to the result
			
			power=(power%divisor)*10;				// Mod Power with Divisor to avoid overflow and for next digit multiply by 10
			
		}
		
		System.out.println(result%divisor);			// print result mod by divisor, cause it may have exceeded the limit
		
	}	
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
		int b=scanner.nextInt();
		calculate_mod_array(array,b);

	}
}
/*
 
8
4
3
5
3
5
3
2
1
47
*/