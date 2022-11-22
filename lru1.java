import java.util.*;
public  class lru1
{
	public void LruImplementation(int pages[],int capacity)
	{
		int pageFaults=0;
		HashMap<Integer,Integer> map=new HashMap();
		HashSet<Integer> currentSet=new HashSet();
		for(int i=0;i<pages.length;i++)
		{
			if(currentSet.size()<capacity)  //jo prynt frame bhrt ny first 3 sathi
			{
				if(!currentSet.contains(pages[i]))
				{
					currentSet.add(pages[i]);
					pageFaults++;
				}
				map.put(pages[i],i);
			}
			else{
				if(!currentSet.contains(pages[i]))
				{
					Iterator<Integer> it=currentSet.iterator();
					int lru=Integer.MAX_VALUE;
					int val=0;
					while(it.hasNext())
					{
						int temp=it.next();
						if(map.get(temp)<lru){
							lru=map.get(temp);
							val=temp; 
						}
					}
					currentSet.remove(val);
					map.remove(val);
					currentSet.add(pages[i]);
					pageFaults++;
				}
				map.put(pages[i],i);
			}
		}
		System.out.println("Page Faults: "+pageFaults);
		int pageHits = pages.length - pageFaults;
		System.out.println("Page Hits: "+pageHits);
		System.out.println("Hit Ratio: "+pageHits + "/" + pages.length + " = " + (double)pageHits/pages.length);
	}
 public static void main(String[] args)
 {
	int capacity,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter capacity of page frame:");
	capacity=sc.nextInt();
	System.out.println("No of elements you want to enter in reference string:");
	n=sc.nextInt
	();
	int pages[]=new int[n];
	System.out.print("Enter values (space separated): ");
		for(int i = 0 ; i < n ; i++) {
			pages[i] = sc.nextInt();
		}
	lru1 lru=new lru1();
		lru.LruImplementation(pages, capacity);


 }
}