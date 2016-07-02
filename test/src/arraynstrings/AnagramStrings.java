package arraynstrings;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abba";
		String s2="abab";
		int count1=0, count2=0;
		for(int i=0;i<s1.length();i++){
			count1+=s1.charAt(i);
			count2+=s2.charAt(i);
		}
		if(count1==count2)
			System.out.println("Anagram String");
		else
			System.out.println("Not Anagram");
	}

}
