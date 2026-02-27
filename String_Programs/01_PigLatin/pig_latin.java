import java.util.*;
public class pig_latin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter a word: ");
            String str = sc.next();
            int i,p;
            String str1="",str2="";
            str=str.toUpperCase();
            for(i=0;i<(str.length());i++)
            {
                char ch = str.charAt(i);
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    str1=str.substring(i);
                    break;
                }
                else
                {
                    str2=str2+ch;
                }
            }
            System.out.println("PigLatin Form "+str1+str2+"AY");
            System.out.println("Do you want to continue Y/N");
            char ch = sc.next().charAt(0);
            if (ch == 'y' || ch == 'Y')
            {
                 continue;   
            }
            else if (ch=='n' || ch=='N') 
            {
                System.out.println("You chose to exit!!");
                 break;
            }
            else
            {
                System.out.println("As no valid option is chosen, program terminates");
                break;
            }
        }
    }
}