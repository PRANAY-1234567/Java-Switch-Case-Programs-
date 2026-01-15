import java.io.*;
class VowelOrConsonant
{
	public static void main(String [] args)throws IOException
	{
		System.out.print("Enter any alphabet :");
		char ch = (char)System.in.read();
		if(Character.isLetter(ch))
		{
			ch = Character.toUpperCase(ch);
			switch(ch)
			{
			   case 'A':
			   case 'E':
			   case 'I':
			   case 'O':
			   case 'U': System.out.println("Vowel");
			             break;
			   default : System.out.println("Consonant");
			             break;
	    	}
	   }
	   else
	       System.out.println("Error");
	}
}