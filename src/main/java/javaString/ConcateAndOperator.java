package javaString;

public class ConcateAndOperator {

	public static void main(String[] args) {

		String name = "Kundan";  // SCP
		name=name.concat("Bhagat");
		System.out.println(name);
		
		String st = new String("Kundan"); //Heap Memory
		st=st.concat("Bhagat");
		System.out.println(st);
		
		if(st==name)   //Compare Referance/Address
		{
			System.out.println("== True");
		}
		else if(st.equals(name))  //Compare Content i.e data
		{
			System.out.println("Equals True");
		}
		else
		{
			System.out.println("False");
		}
		
		String name1 = "Sanket" + "Bhagat";
		System.out.println(name1);
		
		StringBuffer sb = new StringBuffer("Yashoda");
		sb.append("Bhagat");
		System.out.println(sb);
		
	}

}
