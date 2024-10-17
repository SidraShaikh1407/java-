/*
 * Aim : WAP in java to perform sum of diagonal elements of a matrix.
 * Name : Sidra Shaikh
 * UIN : 231P064
 * Div : A
 */
package skll_oop_B3_odd;
import java .util.*;
public class DiagonalAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set[][] = new int[3][3];
		int i,j;
		int d1=0, d2=0;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Start the program : ");
		
		System.out.println("Enter the 3x3 matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				set[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The 3X3 matrix is : ");
		for (i=0 ; i<3 ; i++)
		{
			for (j=0 ; j<3 ; j++)
			{
				System.out.print(set[i][j]+"\t");
			}
				System.out.println(" ");
		}
		
		
		for (i=0 ; i<3 ; i++)
		{
			for (j=0 ; j<3 ; j++)
			{
				if(i==j)
				{
					d1 = d1+set[i][j];
				}
				
			}		
		}

			
			for (i=0 ; i<3 ; i++)
			{
				for (j=0 ; j<3 ; j++)
				{
					if(i==j)
					{
						d2 = d2+set[i][j];
					}
					
				}
			}	
			
			
		System.out.println("The sum of diagonal is : "+d1);
		
		System.out.println("\nThank You ");
		System.out.println("Name:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

		}

}


