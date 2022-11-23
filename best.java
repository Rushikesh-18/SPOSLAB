class best
{
	static void bestfit(int memory[],int m,int process[],int p)
	{
		int i,j,k,min,diff,waste;
		int allocate[]=new int [m];
		for(i=0;i<m;i++)
			allocate[i]=-1;			
		k=0;
		System.out.println("Process No.  Process Size  Block Allocated  Wastege");
		for(i=0;i<p;i++)
		{
			min=99999;
			for(j=0;j<m;j++)
			{				
				if(process[i]<=memory[j] && allocate[j]==-1)
				{
					diff=memory[j]-process[i];
					if(diff<min)
					{
						min=diff;
						k=j;
					}
				}	
			}
			allocate[k]=1;
			waste=memory[k]-process[i];
			if(memory[k]>=process[i])
				System.out.println("   "+(i+1)+"\t\t   "+process[i]+"\t\t   "+(k+1)+"\t     "+waste);
			else
				System.out.println("   "+(i+1)+"\t\t   "+process[i]+"\t   Not Allocated\t-");
		}
	}
	
	
	public static void main(String[] args)
	{
		int memory[]={100,500,200,300,600};
		int process[]={212,417,112,426};
		int m=memory.length;
		int p=process.length;
		bestfit(memory,m,process,p);
	}
}