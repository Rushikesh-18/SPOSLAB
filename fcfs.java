import java.util.*;
class fcfs
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,temp,time;
		System.out.print("Enter number of process : ");
		n=sc.nextInt();
		int AT[]=new int [n];
		int AT2[]=new int [n+1];
		int sort[]=new int [n];
		int index[]=new int [n];
		int BT[]=new int [n];
		int CT[]=new int [n];
		int TAT[]=new int [n];
		int WT[]=new int [n];
		String P[]=new String [n];
	
		for(i=0;i<n;i++)
		{
			System.out.print("\nEnter name of process "+(i+1)+" : ");
			P[i]=sc.next();
		}
	
		for(i=0;i<n;i++)
		{
			System.out.print("\nEnter Arrival Time of process "+(i+1)+" : ");
			AT[i]=sc.nextInt();
			sort[i]=AT[i];
		}
		System.out.print("\nAT :  ");
		
		for(i=0;i<n;i++)
		{
			System.out.print("\nEnter Burst Time of process "+(i+1)+" : ");
			BT[i]=sc.nextInt();
		}
	
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(sort[i]>sort[j])
				{
					temp=sort[j];
					sort[j]=sort[i];
					sort[i]=temp;
				}
			}
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(sort[i]==AT[j])
				{
					index[i]=j;
					break;
				}
			}
		}
		
		time=AT[index[0]];
		for(i=0;i<5;i++)
		{
			time=time+BT[index[i]];
			CT[index[i]]=time;
		}
		
		for(i=0;i<n;i++)
		{
			TAT[i]=CT[i]-AT[i];
			WT[i]=TAT[i]-BT[i];
		}
		
		
		
		System.out.println("\nProcess \tAT\tBT\tCT\tTAT\tWT");
		for(i=0;i<n;i++)
		{
			System.out.println("   "+P[i]+"\t\t"+AT[i]+"\t"+BT[i]+"\t"+CT[i]+"\t"+TAT[i]+"\t"+WT[i]);
		}
	}
}