class next
{
	static void nextfit(int memory[],int m,int process[],int p)
	{
		int i,j,k,flag,waste;
		int allocate[]=new int [m];
		for(i=0;i<m;i++)
			allocate[i]=-1;			
		
		System.out.println("Process No.  Process Size  Block Allocated  Wastege");
		j=0;
		for(i=0;i<p;i++)
		{
			flag=0;
			waste=0;
			k=0;
			for(j=j;j<m;j++)
			{
				k++;
				if(process[i] <= memory[j] && allocate[j]==-1)
				{
					waste=memory[j]-process[i];
					allocate[j]=1;
					flag=1;
					k=j;
					break;
				}
				if(j >= (m-1) )
					j=0;
				if(k>12)
				{
					flag=0;
					break;
				}
			}
			if(flag == 1)
				System.out.println("   "+(i+1)+"\t\t   "+process[i]+"\t\t   "+(j+1)+"\t     "+waste);
			else
				System.out.println("   "+(i+1)+"\t\t   "+process[i]+"\t   Not Allocated      -");
		}
	}
	
	
	public static void main(String[] args)
	{
		int memory[]={100,500,200,300,600};
		int process[]={212,417,112,426};
		int m=memory.length;
		int p=process.length;
		nextfit(memory,m,process,p);
	}
}