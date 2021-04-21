package week1.day2;


public class CharacterOccurance {

	public static void main(String[] args) {
		String company="testleaf";
		char c='t';
		int count =0;
		char[] charArray = company.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]==c) {
				count++;
			}
			
		}
		System.out.println(count);
	}
	}
