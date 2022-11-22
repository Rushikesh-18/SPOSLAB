import java.util.*;
public class worstfit {

    static void worstfitt(int blockSize[],int m,int processSize[],int n )
    {
        int allocation[]=new int[n];
        int flag=0;
        int i,j;
        for( i=0;i<n;i++)
        {
            int worstIndx=0;
            for( j=0;j<m;j++)
            {
                if(blockSize[j]>=processSize[i])
                {
                    if(worstIndx==0)
                    {
                        worstIndx=j;
                    }
                    else if(blockSize[worstIndx]<blockSize[j])
                    {
                        worstIndx=j;
                        
                    }
                }

              
            }
            if(worstIndx!=0)
            {
                allocation[i]=j;
                blockSize[worstIndx]=processSize[i];
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
    worstfitt(blockSize,m,processSize,n);
}
}
