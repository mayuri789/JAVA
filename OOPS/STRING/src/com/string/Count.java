package com.string;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="i am in pune";
name = name.trim();


int wordCount=1;
int charCount=0;


for(int i=0;i<name.length();i++)
{
	char c= name.charAt(i);
	 if(c==' ')
	{
		++wordCount;
	}
	else
	{
		++charCount;
	}
}

System.out.println("no of word :"+wordCount);
System.out.println("no of charchter :"+charCount);
	}

}
