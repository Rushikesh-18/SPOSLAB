import java.util.*;
class fcfs
{
    public static void main(String[] args)
    {
        int arrtime[]=new int[20];
        int bursttime[]=new int[20];
        int servicetime[]=new int[20];
        int waittime[]=new int[20];
        int turntime[]=new int[20];
        int total=0;
        int avg;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of process you want to enter:");
        int no=sc.nextInt();
        for(int i=0;i<no;i++)
        {
          System.out.println("Enter the arrival time of process "+(i+1)+"=");
          arrtime[i]=sc.nextInt();
          System.out.println("Enter the bursttime of process"+(i+1)+"=");
          bursttime[i]=sc.nextInt();
        }
        servicetime[0]=0;
        for(int i=1;i<no;i++)
        {
            servicetime[i]=servicetime[i-1]+bursttime[i-1];
        } 
        waittime[0]=0;
        for(int i=1;i<no;i++)
        {
            waittime[i]=servicetime[i]-arrtime[i];
        }
        for(int i=0;i<no;i++)
        {
            turntime[i]=waittime[i]+bursttime[i];
            total=total+turntime[i];
        }
        avg=total/no;
        System.out.println("\nArrivaltime\tBursttime\tServicetime\twaitingtime\tturnaroundtime");
        for(int i=0;i<no;i++)
        {
            System.out.println(arrtime[i]+"\t\t"+bursttime[i]+"\t\t"+servicetime[i]+"\t\t"+waittime[i]+"\t\t"+turntime[i]);
        }
        System.out.println("AverageTurnaroundTime:");
        System.out.print(avg);
    }
}