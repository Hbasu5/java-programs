import java.util.*;
public class palindrome
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int d,r=0,p=n;
            do
            {
                d=n%10;
                r = r*10+d;
                n = n/10;
            }
            while (n!=0);
            if (r==p)
            {
                System.out.println("Is a palindrome number");
            }
            else
            {
                System.out.println("Not a palindrome number");
            }
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