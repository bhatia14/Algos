package test;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack=new Stack<>();
		String s="[()]{}{[()()]()}";
		char ar[]=s.toCharArray();
		boolean flag=false;
		for(int i=0;i<s.length();i++){
			if(ar[i]=='}' || ar[i]==')' || ar[i]==']'){
				char x=stack.pop();
				if(x=='{' && ar[i]=='}')
					flag=true;
				else if(x=='[' && ar[i]==']')
					flag=true;
				else if(x=='(' && ar[i]==')')
					flag=true;
				else{
					flag=false;
					break;
				}
			}
			else
				stack.push(ar[i]);
			
		}
		System.out.println(flag);
		//stack.push(item)
	}

}
