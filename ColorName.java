import java.io.*;
class ColorName
{
	public static void main(String [] args)throws IOException
	{
		System.out.print("Enter any alphabet :");
		char ch = (char)System.in.read();
		if(ch>='A' && ch<='Z' || ch>='a'&&ch<='z')
		{
			switch(ch)
			{
			   case 'R':
			   case 'r': System.out.println("Red");
			             break;
			   case 'G':
			   case 'g': System.out.println("Green");
			             break;
			   case 'B':
			   case 'b': System.out.println("Blue");
			             break;
			   default : System.out.println("Black");
			             break;
	    	}
	   }
	   else
	       System.out.println("Error");
	}
}