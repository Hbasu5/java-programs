import java.util.Scanner;
public class harshad_number
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int p=0,a,sm=0;
            p = n;
            while (n>0)
            {
                a = n%10;
                sm=sm+a;
                n = n/10;
            }
            int q = p%sm;
            if (q==0)
            {
                System.out.println("Is a Harshad no.");    
            }
            else
            {
                System.out.println("Is not a Harshad no.");
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