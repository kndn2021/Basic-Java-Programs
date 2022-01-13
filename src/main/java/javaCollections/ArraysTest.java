package javaCollections;

public class ArraysTest {

	public static void main(String[] args) {


//		String name = "Kundan";
//		String name1 = "Sanket";
//		String name2 = "Yash";
//		String name3 = "Viraj";
		
//		String[] name = {"Kundan", "Viraj", "Yash", "Sanket"};
		String[] name = new String[5];
		name[0] = "Kundan";
		name[1] = "Dinkar";
		name[2] = "Yashoda";
		name[3] = "Bhagat";
		name[4] = "Sayali";
		
		for(String str : name)
		{
			System.out.println(str);
		}
		System.out.println();
		
		for(int i=0; i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println();
		
		int j=0;
		while(j < name.length)
		{
			System.out.println(name[j]);
			j++;
		}
	}

}
