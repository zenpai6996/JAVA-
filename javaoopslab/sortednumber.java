import java.util.Scanner;

class sortednumber{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of elements in the array:\n");

int n = sc.nextInt();

int[] numbers = new int[n];

System.out.println("Enter the  element of the array:\n");
for(int i =0;i<n;i++){


numbers[i]=sc.nextInt();

}
for(int i=0;i<n-1;i++){
for(int j=0;j<n-i-1;j++){

if(numbers[j]>numbers[j+1]){

int temp = numbers[j];
numbers[j] = numbers[j+1];
numbers[j+1]= temp;

}
}
}
System.out.println("the sorted numbers are :\n");
for(int i=0;i<n;i++){
System.out.println(numbers[i]+"");
}
sc.close();
}

}
