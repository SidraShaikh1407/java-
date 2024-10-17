/* Name:Sidra Shaikh
* Aim:WAP to perform matrix addition
* UIN:231P064
* DIV:A
*/
package skll_oop_B3_odd;  
import java.util.*;
public class MatrixAddition {

 public static void main(String[] args) {
 // TODO Auto-generated method stub
 int i,j;
 int set1[][]=new int[3][3];
 int set2[][]=new int[3][3];
 int add[][]=new int[3][3];

 Scanner input=new Scanner(System.in);
 System.out.print("Enter First 3X3 Matrix is :\n");
 for (i=0;i<3;i++)
 {
 for(j=0;j<3;j++)
 {
 set1[i][j]=input.nextInt();
 }
 }
 System.out.print("Enter Second 3X3 Matrix is :\n");
 for (i=0;i<3;i++)
 {
 for(j=0;j<3;j++)
 {
 set2[i][j]=input.nextInt();
 }
 }
 System.out.println("First 3X3 Matrix is :");
 for (i=0;i<3;i++)
 {
 for(j=0;j<3;j++)
 {
 System.out.print(set1[i][j]+"\t");
 } System.out.println(" ");

 }
 System.out.print("Second 3X3 Matrix is :\n");
 for (i=0;i<3;i++)
 {
 for(j=0;j<3;j++)
 {
 System.out.print(set2[i][j]+"\t");
 } System.out.println(" ");
 }


 System.out.println(" ");
 for (i=0;i<3;i++)
 {
 for(j=0;j<3;j++)
 {
 add[i][j]=set1[i][j]+set2[i][j];

 }
 }
 System.out.println("Enter Resultant 3X3 Matrix is :");
 for (i=0;i<3;i++)
 {
 for(j=0;j<3;j++)
 {
 System.out.print(add[i][j]+"\t");
 } System.out.println(" ");
 }
 System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

 }

 }