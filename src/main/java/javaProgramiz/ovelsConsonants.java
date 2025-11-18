package javaProgramiz;

public class ovelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="automation";
		int c=0, v=0;
		str=str.toLowerCase();
		for(char ch:str.toCharArray()) {

		if(ch>='a' && ch<='z') {
		if("aeiou".indexOf(ch)!=-1)v++;
		else c++;
		}
			
			
		}
		System.out.println("Vovels : " +v + " Consonents :" + c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
