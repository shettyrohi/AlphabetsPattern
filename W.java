import java.util.Scanner;
public class W {
	public static void main(String[] args) 	{
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a number");
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if((j==0||j==n-1)||(i==j||i+j==n-1)&&i>n/2-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
