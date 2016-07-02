package test;

public class ExcelCol {

	public static void main(String[] args) {
		int val=676;
		int d=val%26;
		int i=0;
		
		char ar[]=new char[50];
		while(val>0){
			if(d==0){
				ar[i]='Z';
				val=(val/26)-1;
			}
			else{
				ar[i]=(char)('A'+(d-1));
				val=(val/26);
			}
			i++;
		}
		for(i=i-1;i>=0;i--){
			System.out.print(ar[i]);
		}
		//System.out.println("a");
	}

}
