import java.util.Scanner;
import java.io.*;
public class Main {
	public static void main(String args[]) throws SeatNotAvailableException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the show:");
		int n = sc.nextInt();
		int size = (n*n);
		int s;
		int a[] = new int[size];
		int mat[][] = new int[n][n];
		System.out.println("Enter the number of seats to be booked:");
		int seats = sc.nextInt();
		try {
			for(int i=0;i<seats;i++){
				System.out.println("Enter the seat number "+(i+1));
				s = sc.nextInt();
				if(a[s]==0){
					a[s]=1;
					int t=0;
					for(int j=0;j<n;j++){
						for(int k=0;k<n;k++){
							mat[j][k] = a[t];
							t++;
						}
					}
				}
				else{
		
					throw new SeatNotAvailableException("Already Booked");
				}
			}
		}
		catch (Exception e) {
	
				System.out.println(e);
		}
		finally {
	
				System.out.println("The seats booked are:");
	
				for(int i=0;i<n;i++){
	
					for(int j=0;j<n;j++){
	
						System.out.print(mat[i][j]+" ");
					}
					System.out.println();
				}
		}
	}
}
