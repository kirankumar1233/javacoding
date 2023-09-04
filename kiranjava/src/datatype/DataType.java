package datatype;

public class DataType {

	public static void main(String[] args) {
		char a ='a';
		if(a>=0 && a<=9)
		{
			System.out.println(" integer");
			
		}
		else if(a>='a' && a<='z')
		{
			System.out.println("small case");
			
		}
		else if(a>='A' && a<='Z')
		{
			System.out.println("upper case");
			
		}
		else
		{
			System.out.println("special character");
		}
		

	}

}
