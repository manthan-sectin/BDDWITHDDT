package javaProgramiz;

public class MaxAndMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a []={-44,1,2,3,4,6,27};
	        int max=a[0];
	        int min=a[0];
	        for(int i=0;i<a.length;i++){
	            if(a[i]<min){
	                max=a[i];
	            }
	        }
	        System.out.println(min);
	}

}
