package day11;

public class Ex1ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hello java";
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			System.out.println(ch+" ");
		}
		
		
		System.out.println(" reverse string ");
		for(int i=name.length();i>0;i--)
		{
			char ch=name.charAt(i);
			System.out.println(ch+" ");
		}
	}

}
