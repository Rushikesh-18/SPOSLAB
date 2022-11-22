import java.util.*;
public class call
{
 static
  {
     System.loadLibrary("Calculator");
  } 
  
private native double add(double a,double b);
private native double sub(double a,double b);
private native double mul(double a,double b);
private native double div(double a,double b);


 public static void main(String arg[]) throws Exception
{

Scanner sc=new Scanner(System.in);
  
  int choice=1;
  double num1,num2;
      while(choice!=5) 
      {  
                  System.out.println("\n Enter choice \n1.Add\n2.Subtract\n3.Multiply\n4.Division\n5.exit"); 
                  choice=sc.nextInt();      
                  
                 if(choice==5)
		  break; 
                  System.out.println("\n Number 1 : "); 
                  num1=sc.nextDouble();      
                  
                  System.out.println("\n Number 2 :"); 
                  num2=sc.nextDouble();      
                  
                  switch(choice)
                  {      
                  
                        case 1:              
                               System.out.println("Sum of Two Numbers is ="+new call().add(num1,num2)); 
                              break;
                        case 2:
                              System.out.println("Difference of Two Numbers is="+new call().sub(num1,num2));
                              break;                  
                        case 3:
                              System.out.println("Product of Two Numbers="+new call().mul(num1,num2));
                              break;                  
                        case 4:
                              System.out.println("Division of Numbers="+new call().div(num1,num2));
                              break;                  
                  }
      }
}
}
