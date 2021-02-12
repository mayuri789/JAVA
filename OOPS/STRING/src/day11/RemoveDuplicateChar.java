package day11;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="appple";
String s1="";

for(int i=0;i<name.length();i++)
{
	char ch =name.charAt(i);//take single single char
	System.out.println("char : "+ch);
	
	s1=s1+ch;
	System.out.println("s1 :"+ch );
	//name=name.replace(ch,'');
}

System.out.println("name "+name);
System.out.println("s1 "+s1);
	}

}
