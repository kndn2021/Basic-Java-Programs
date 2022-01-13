package javaLoops;

public class Pyramids {

	public static void main(String[] args) {


//		for(int i=0; i<=5; i++)
//		{
//			for(int j=0; j<=i; j++)
//			{
//				System.out.print(" * ");
//			}
//			
//			System.out.println();
//		}
		
		for(int i=0; i<5; i++)
		{
			for(int j=4; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
//	     Square
//			for(int i=0; i<5; i++)
//			{
//				for(int j=0; j<5; j++)
//				{
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
			
//		     Cube
//				for(int i=0; i<3; i++)
//				{
//					for(int j=0; j<7; j++)
//					{
//						System.out.print("* ");
//					}
//					System.out.println();
		
	}

}
