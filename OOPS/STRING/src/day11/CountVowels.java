package day11;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="apple";
		int count=0;
		String vowels= "";
		for(int i=0;i<name.length();i++)
		{
			char ch= name.charAt(i);

			if (ch=='a'| ch=='e'|ch=='i'|ch=='o'|ch=='u')
			{
				++count;
				vowels=vowels+ch;

			}
		}
		System.out.println(count);
		System.out.println(vowels);
	}

}
