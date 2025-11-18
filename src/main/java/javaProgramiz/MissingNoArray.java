package javaProgramiz;

public class MissingNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []={1,2,3,4,6,7};
        int sum1=0;
        int sum2=0;
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        for(int i=0;i<=7;i++){
            sum2=sum2+i;
        }
        System.out.println("missing no is: "+(sum2-sum1));
	}

}
