import java.util.Scanner;

class diagonalsums{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

int[][] matrix = new int[3][3];
System.out.println("Print 3x3 matrix :\n");

for(int i =0;i<3;i++){
for(int j=0;j<3;j++){

matrix[i][j] = sc.nextInt();
}
}
int leftDiagonalsum =0;
int rightDiagonalsum =0;
for (int i =0;i<3;i++){
leftDiagonalsum += matrix[i][i];
rightDiagonalsum += matrix[i][2-i];
}
System.out.println("Sum of left diagonal elements "+ leftDiagonalsum);
System.out.println("Sum of right diagonal elements "+ rightDiagonalsum);
sc.close();
}
}

