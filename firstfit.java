
public class firstfit {

    static void firstfitt(int blockSize[],int m,int processSize[],int n )
    {
        int allocation[]=new int[n];
        int flag=0;
        for(int i=0;i<n;i++)
        {
            allocation[i]=0;            
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(processSize[i]<=blockSize[j] && blockSize[j]!=0)
                {
                    allocation[i]=processSize[i];
                    blockSize[j]=0;
                    flag=0;
                   // blockSize[j]=blockSize[j]-processSize[i];
                    break;
                }
                else{
                flag=1;
                }

            }
            if(flag==0)
            {
                System.out.print(processSize[i]);
                System.out.println("MemoryAllocated");
            }
            else{
                System.out.print(processSize[i]); 
                System.out.println("Not Allocatred");
            }
        }
        /*System.out.println("\nProcess No.\tProcessSize\tBlockNo.");
        for(int i=0;i<n;i++)
        {
            System.out.println();
            System.out.print(""+(i+1)+"\t\t"+processSize[i]+"\t\t");
            if(allocation[i]!=0)
            {
                System.out.print(allocation[i]);
                System.out.println();
            }
            else{
                System.out.print("Not Allocated");
                System.out.println();
            }
        }*/

    }

public static void main(String[] args)
{
    int blockSize[]={100,500,200,300,600};
    int processSize[]={212,417,112,426};
    int m=blockSize.length;
    int n=processSize.length;
    firstfitt(blockSize,m,processSize,n);
}
}
