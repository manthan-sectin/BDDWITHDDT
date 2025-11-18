package javaProgramiz;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbbcccc";
		int[] freq = new int[256];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch]++;

		}

		for (int i = 0; i < 256; i++) {
			if (freq[i] > 0) {
				System.out.println((char) i + " > " + freq[i]);
			}
		}

	}

}
