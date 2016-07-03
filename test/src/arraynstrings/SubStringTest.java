package arraynstrings;

public class SubStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="waterbottle";
		String str2="terbottlewa";
		
		String str3=str+str2;
		for(int i=0;i<str3.length()-str.length();i++){
			if(str.equalsIgnoreCase(str3.substring(i,i+str.length()))){
				System.out.println("True");
				break;
			}
		}
		if((str.length() == str2.length()) && ((str+str).indexOf(str2) != -1))
			System.out.println("tue");
	}

}
