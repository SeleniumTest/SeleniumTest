package first_package;

public class Secod {

	
		public static void main(String[] args) {
		String str1= new String("roopa");
		String str2= new String("roopa");
			
	//		String str1 = "roopa";
		//	String str2= "roopa";
		if(str1 == str2)
		{
		System.out.println("String 1 equalst String 2 is true");
		}
		else
		{
		System.out.println("String 1 == String 2 is false");
		String str3 = str2;
		if( str2 == str3)
		{
		System.out.println("String 2 == String 3 is true");
		}
		else
		{
		System.out.println("String 2 == String 3 is false");
		}
		if(str1.equals(str2))
		{
		System.out.println("String 1 equals string 2 is true");
		}
		else
		{
		System.out.println("String 1 equals string 2 is false");
		}
		
		}}
}
