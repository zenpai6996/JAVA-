import java.util.Scanner;

class uppertriangular{

public static void main (String [] args ){

Scanner sc = new Scanner (System.in);

System.out.println("Enter the number of rows :\n");
int row = sc.nextInt();

System.out.println("Enter the number of columns :\n");
int col = sc.nextInt();

int[][] matrix = new int[row][col];

System.out.println("Enter the matrix:\n");
for(int i=0; i<row;i++){
for(int j=0;j<col;j++){
matrix[i][j]= sc.nextInt();
}
}
System.out.println("The upper triangular of matrix :\n");
for(int i=0;i<row;i++){
	for(int j=0;j<col;j++){
		if(i<=j){
    System.out.print(matrix[i][j] + " " );
} else {
System.out.print("  ");
}
}
System.out.println();
}
sc.close();
}
}
