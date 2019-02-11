import java.io.*;
import java.util.*;
class Checknumber
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
	if((a>b)&&(a<c))
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
  }
}
