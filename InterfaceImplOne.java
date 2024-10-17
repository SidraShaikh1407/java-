    /*Aim:interface Matrix:
	{
	Final static int M=5, N=5;
	Void readMatrix();
	25
	Void displayMatrix();
	Void addMatrix();
	}
	Implement above interface using suitable java class program and also develop the main program.
	*NAME:Sidra Shaikh
	*UIN:231P064
	*ROLL NO:40
	*DIV:A*/
    package skll_oop_B3_odd;
    import java.util.Scanner;
	interface MatrixOne {
	final static int M=5, N=5;
	Void readMatrix();
	Void displayMatrix();
	Void addMatrix();
	}
	class MatrixOneImpl implements MatrixOne{
	int add[][] = new int[M][N];
	int set1[][] = new int[M][N];
	int set2[][] = new int[M][M];
	Scanner sc = new Scanner(System.in);
	int i,j;
	@Override
	public Void readMatrix() {
	// TODO Auto-generated method stub
	System.out.println("Enter the first "+M+"x"+N+" matrix:");
	for (int i = 0; i < M; i++) {
	for (int j = 0; j < N; j++) {
	set1[i][j] = sc.nextInt();
	}}
	System.out.println("Enter the second "+M+"x"+N+" matrix:");
	for (i = 0; i < M; i++) {
	for (j = 0; j < N; j++) {
	set2[i][j] = sc.nextInt();
	}}
	return null;
	}
	@Override
	public Void displayMatrix() {
	System.out.println("The first "+M+"x"+N+" matrix is : ");
	for (i = 0; i < M; i++) {
	for (j = 0; j < N; j++) {
	System.out.print(set1[i][j] + "\t");
	}
	System.out.println(" ");
	}
	System.out.println("The second "+M+"x"+N+" matrix is : ");
	for (i = 0; i < M; i++) {
	for (j = 0; j < N; j++) {
	System.out.print(set2[i][j] + "\t");
	}
	System.out.println(" ");
	}
	
	return null;
	}
	@Override
	public Void addMatrix() {
	for (i = 0; i < M; i++) {
	for (j = 0; j < N; j++) {
	add[i][j] = set1[i][j] + set2[i][j];
	}
	}
	System.out.println("The resultant addition "+M+"x"+N+" matrix is :");
	for (i = 0; i < M; i++) {
	for (j = 0; j < N; j++) {
	System.out.print(add[i][j] + "\t");
	}
	System.out.println(" ");
	}
	return null;
	}
	}
	public class InterfaceImplOne {
	public static void main(String[] args) {
	MatrixOneImpl matrixOneImpl = new MatrixOneImpl();
	matrixOneImpl.readMatrix();
	matrixOneImpl.displayMatrix();
	matrixOneImpl.addMatrix();
	System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
	}
	}
	