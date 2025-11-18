package javaProgramiz;

import java.util.Arrays;

public class EvenOddAndEqualArrays {
public static void main(String[] args) {
	int a[]={1,2,3,4,5,6,8};
    int b[]={1,2,4,5,6,8};
  for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
          System.out.println("even is: " +a[i]);
      }
      
  }
  System.out.println(Arrays.equals(a,b));
}
}
