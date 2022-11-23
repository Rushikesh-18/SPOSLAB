class first
{
	static void firstfit(int memory[],int m,int process[],int p)
	{
		int allocate[]=new int[m];
		int waste,i,j,add;
		int flag,was;
		for(i=0;i<m;i++)
			allocate[i]=-1;
		
		System.out.print("Memory Size : ");
		for(i=0;i<m;i++)
			System.out.print("  "+memory[i]);
		
		System.out.print("\nProcess Size : ");
		for(i=0;i<p;i++)
			System.out.print("  "+process[i]);
		was=0;
		System.out.println("\nProcess No.\tProcess Size\tBlock Allocated\t\tWastage");
		for(i=0;i<p;i++)
		{
			flag=0;
			waste=0;
			for(j=0;j<m;j++)
			{
				if(process[i]<=memory[j] && allocate[j]==-1)
				{
					flag=1;
					waste=memory[j]-process[i];
					allocate[j]=1;
					was=was+waste;
					break;
				}
			}
			if(flag==1)
				System.out.println("   "+(i+1)+"\t\t    "+process[i]+"\t\t"+(j+1)+"\t\t\t"+waste);
			else
				System.out.println("   "+(i+1)+"\t\t    "+process[i]+"\t\tNot Allocated\t\t"+"-");
		}
		add=0;
		for(i=0;i<m;i++)
		{
			add=add+memory[i];
		}
		System.out.println("\nTotal Wastage = "+was+" out of "+add);
		
	}
	public static void main(String[] args)
	{
		int memory[]={100,500,200,300,600};
		int process[]={212,417,112,426};
		int m=memory.length;
		int p=process.length;
		firstfit(memory,m,process,p);
	}
}