package javaProgramiz;

public class StringCompressed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String com="a2b3c4";
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<com.length();i+=2) {
    	char c=com.charAt(i);
       int n=com.charAt(i+1)-'0';
       for(int j=0;j<n;j++) {
    	   sb.append(c);
       }
      
       }
       
	System.out.println(sb);	
		
		
		
		
	}

}
