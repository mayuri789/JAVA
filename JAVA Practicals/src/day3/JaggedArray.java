package day3;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int [3][];
a[0]=new int[5];
a[1]=new int[6];
a[2]=new int[10];

for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}

	}

}
