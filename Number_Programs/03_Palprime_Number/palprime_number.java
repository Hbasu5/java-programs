import java.util.*;
public class palprime_number
{
    boolean palin (int x)
    {
        int y=x,rev=0,d;
        while(y!=0)
        {
            d=y%10;
            rev=(rev*10)+d;
            y=y/10;
        }
        if(rev==x)
            return(true);
        else
            return(false);
    }
    int prime (int x)
    {
        int i,f=0;
        for(i=1;i<=x;i++) 
        {
            if(x%i==0)
            {
                f++;
            }
        }
        if(f==2)
            return(1);
        else
            return(0);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter starting and ending limit");
            int st=sc.nextInt();
            int end=sc.nextInt();
            int end1=end;
            int st1=st;
            if(end<st)//for foolproof execution
            {
                st=end1;
                end=st1;
            }
            int k,v;
            palprime_number ob = new palprime_number();
            for(k=st;k<=end;k++)
            {
                v= ob.prime(k);
                boolean b=ob.palin(k);
                if(v==1&&b==true)
                {
                    System.out.println("Palprime no."+k);
                }
            }
            System.out.println("Do you want to continue? Y/N");
            char c = sc.next().charAt(0);
            if (c=='y' || c=='Y')
            {
                continue;
            }
            else if (c=='n' || c=='N')
            {
                System.out.println("You chose to exit");
                break;
            }
            else
            {
                System.out.println("No valid option chosen!! Program exits");
                break;
            }
        }
    }
}
