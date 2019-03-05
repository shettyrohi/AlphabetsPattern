import java.util.Scanner;
class J{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a number");
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==0||j==n/2||(i==n-1)&&(j>0&&j<n/2)||(j==0)&&(i>(n*3)/4&&i<n-1))	{
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
