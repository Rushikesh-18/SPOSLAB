class worst
{
	static void worstfit(int memory[],int process[],int m,int p)
	{
		int i,j,k,max,waste;
		
		System.out.println("Process No.  Process Size  Block Allocated  Wastege");
		for(i=0;i<p;i++)
		{
			max=memory[0];
			k=0;
			for(j=1;j<m;j++)
			{
				if(max<memory[j])
				{
					max=memory[j];
					k=j;
				}
			}
			waste=memory[k]-process[i];
			if(memory[k]>=process[i])
				System.out.println("   "+(i+1)+"\t\t   "+process[i]+"\t\t   "+(k+1)+"\t     "+waste);
			else
				System.out.println("   "+(i+1)+"\t\t   "+process[i]+"\t   Not Allocated\t-");
			
			memory[k]=-999;
		}
	}
	
	public static void main(String[] args)
	{
		int memory[]={100,500,200,300,600};
		int process[]={212,417,112,426};
		int m=memory.length;
		int p=process.length;
		worstfit(memory,process,m,p);
	}
}
