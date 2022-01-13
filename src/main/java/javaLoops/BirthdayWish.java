package javaLoops;

public class BirthdayWish {

	public static void main(String[] args) throws InterruptedException {
		int z=1;
		while(z == 1)
		{
		for (int i=0; i<=38; i++) 
		{
			for (int j=0; j<=38-i; j++) 
			{
				System.out.print(" ");
			}
			for (int k=1; k<=1; k++) 
			{
				System.out.print("/ Happy Birthday to you Yash / ");
			}
			System.out.println();
		}
		for (int m=0; m<38; m++) 
		{
			for (int n=0; n<1; n++) 
			{
				System.out.print("\\ Happy Birthday to you Yash \\ ");
			}
			System.out.println();
			for (int o=0; o<=m; o++) 
			{
				System.out.print(" ");
			}

		}
	}
	}

}
