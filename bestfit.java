import java.util.*;
public class bestfit {

    static void bestfitt(int blockSize[],int m,int processSize[],int n )
    {
        int allocation[]=new int[n];
        int flag=0;
        int i,j;
        for( i=0;i<n;i++)
        {
            int bestIndx=0;
            for( j=0;j<m;j++)
            {
                if(blockSize[j]>processSize[i])
                {
                    if(bestIndx==0)
                    {
                        bestIndx=j;
                    }
                    else if(blockSize[j]<blockSize[bestIndx])
                    {
                        bestIndx=j;
                        
                    }
                }

            }
            if(bestIndx!=0)
                {
                    //allocation[bestIndx]=processSize[i];
                    allocation[i]=bestIndx;
                    blockSize[bestIndx]=processSize[i];
                    flag=1;
                }
                else
                {
                    flag=0;
                }
                 if(flag==1)
            {
                System.out.println("Allocated"+processSize[i]);
            }
            else{
                System.out.println("NotAllocated"+processSize[i]);
            }

         
        }
            
    }

public static void main(String[] args)
{
    int blockSize[]={100,500,200,300,600};
    int processSize[]={212,312,417,112,826};
    int m=blockSize.length;
    int n=processSize.length;
    bestfitt(blockSize,m,processSize,n);
}
}
