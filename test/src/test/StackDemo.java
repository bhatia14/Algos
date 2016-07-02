package test;

import java.util.Stack;
class Node3{
	Node3 first;
	char a;
	int n;
}

public class StackDemo {
	
	Node3 node;
	public void push(char a){
		//System.out.println(a);
		Node3 old=node;
		node=new Node3();
		node.a=a;
		node.first=old;
		node.n++;
		
	}
	public char pop(){
		char a=node.a;
		node=node.first;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDemo stack=new StackDemo();
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
	
	}

}
