public class prime{    
 public static void main(String args[]){    
  int i,m=0,flag=0;      
  int number=15;   
  m=number/2;      
  if(number==0||number==1){  
   System.out.println(number+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(number%i==0){      
     System.out.println(number+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { 
    System.out.println(number+" is prime number"); }  
  }
}    
}  