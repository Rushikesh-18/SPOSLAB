import java.util.*;
public class fifo
{
    public static void fif(int refstr[],int m,int fifo1[],int n)
    {
        boolean check=false;
        int hit=0;
        int fault=0,count=0;
        for(int i=0;i<m;i++)
        {
            check=false;
            for(int j=0;j<n;j++)
            {
                if(fifo1[j]==refstr[i])
                {
                    check=true;
                    hit++;
                    break;
                }
               
            } 
            if(check==false)
                {
                    fifo1[count]=refstr[i];
                    count++;
                    if(count==n){
                    count=0;  }
                    fault++;
                }
             
        }
        System.out.println("HIT:"+hit);
        System.out.println("FAULT:"+fault);

    }
    public static void main(String[] args)
    {
        System.out.println("Enter the no of inputs of reference string:");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int refstr[]=new int[m];
        for(int i=0;i<m;i++)
        {
            refstr[i]=sc.nextInt();
        }
        System.out.println("Enter the no of frames:");
        int n=sc.nextInt();
        int fifo1[]=new int[n];
        fif(refstr,m,fifo1,n);
    }
}