import java.util.*;
class fifo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r,i,j,f,flag,hit=0,count=0,fault=0;
		System.out.println("Enter no. of references: ");
		r=sc.nextInt();
		System.out.println("Enter no. of frames: ");
		f=sc.nextInt();
		int fra[]=new int [f];
		for(i=0;i<f;i++)
			fra[i]=-1;
		int ref[]=new int [r];
		for(i=0;i<r;i++)
		{
			System.out.println("\nEnter of references: ");
			ref[i]=sc.nextInt();
		}
		
		for(i=0;i<r;i++)
		{
			flag=0;
			for(j=0;j<f;j++)
			{
				if(fra[j]==ref[i])
				{
					flag=1;
					hit++;
					break;
				}
			}
			if(flag==0)
			{
				fra[count]=ref[i];
				fault++;
				count++;
				if(count>=f)
					count=0;
			}
		}
		System.out.println("\nHit = "+hit+"\nFault = "+fault);
	}	
}