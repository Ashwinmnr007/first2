package javaapp.sumeven;


public class Main {

  public static void main(String[] args) {
	  int num = 10;
      int even[] = new int[num];
      int sum = 0,j = 0;
      String evennums = "";
      //Insert your code here
      
      for(int i=0;i<num;++i)
      {	even[i]=i+1;}
      
      for(j=0;j<num;++j)
      {
        if(even[j]%2==0)
        {
      	  evennums=evennums+even[j];
      	  sum=sum+even[j];
      	  
      	  if(j<num-1)
      		  evennums=evennums+',';
  }
}
      System.out.println(evennums);
      System.out.println(sum);
}
}