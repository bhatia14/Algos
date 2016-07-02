package test;

import java.util.NoSuchElementException;

class Node2{
	Node2 first;
	Node2 last;
	int data;
	int n=0;
}

public class QueueImplement {

	Node2 node2;
	
	public int enQueue(Node2 item){
		Node2 oldNode2;
		if(node2==null && node2== null){
			node2=new Node2();
			node2.first=item;
			node2.n++;
			//return true;
		}
		/*else if(node2.first!=null && node2.last== null){
			//oldNode2=item;
			node2.last=item;
			node2.n++;
			//return true;
			
		}*/
		else if (node2.first!=null){
			oldNode2=node2.first;
			//node2.oldNode2;
			node2.n++;
		}
		return node2.n;
		//return false;
	}
	

	
	public void print(){
		int z=0;
		Node2 current=node2.first;
		while(z!=-1){
	        if (!(current != null)) throw new NoSuchElementException();
	        int item = current.data;
	        System.out.println(item);
	        if(current.first!=null)
	        	current = current.first; 
	        else
	        	z=-1;
		}
	}
	
	public static void main(String[] args) {
		QueueImplement queueImplement=new QueueImplement();
		int data=10;
		Node2 node2_1=new Node2();
		Node2 node2_2=new Node2();
		node2_1.data=10;
		node2_2.data=11;
		System.out.println(queueImplement.enQueue(node2_1));
		System.out.println(queueImplement.enQueue(node2_2));
		queueImplement.print();
	}

}
