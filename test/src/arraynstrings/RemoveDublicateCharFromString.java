package arraynstrings;

public class RemoveDublicateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ar[]= {'a','b','a', 'b','c', 'a', 'b','c'};
		//String s=null;
		//String ar1=s+"hello";
		//System.out.println(s);
		
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]==ar[j]){
					for(int k=j;k<ar.length;k++){
						if(k==ar.length-1){
							ar[k]='0';
						}
						else
							ar[k]=ar[k+1];
					}
				}
			}
		}
		System.out.println(ar);
		
		
		
		//removeDuplicates(ar);
		
	}
	
	public void removeDuplicates2(){
		
	}
	
	
	
	public static void removeDuplicates(char[] str) {
		 if (str == null) return;
		 int len = str.length;
		 if (len < 2) return;
		
		 int tail = 1;
		
		 for (int i = 1; i < len; ++i) {
		 int j;
		 for (j = 0; j < tail; ++j) {
		 if (str[i] == str[j]) break;
		 }
		 if (j == tail) {
		 str[tail] = str[i];
		 ++tail;
		 }
		 }
		 str[tail] = 0;
		 }
	
	

}
