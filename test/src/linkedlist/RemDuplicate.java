package linkedlist;

import java.util.ArrayList;
import java.util.Hashtable;

public class RemDuplicate {

	static Node node;
	public void addNode(int data){
		Node newNode=new Node();
		newNode.data=data;
		if(node==null){
			node=newNode;
			node.n++;
		}else if(node.next==null){
			node.next=newNode;
			node.next.n=node.n+1;
		}
		else{
			insertNodeAtEnd(node.next,newNode);
		}
		//System.out.println(node);
	}
	public void insertNodeAtEnd(Node nodeTest, Node newNode){
		if(nodeTest.next!=null)
			insertNodeAtEnd(nodeTest.next, newNode);
		else{
			nodeTest.next=newNode;
			nodeTest.next.n=nodeTest.n+1;
		}
	}
	
	/*public void removeDuplicate(){
		ArrayList<Integer> buffer=new ArrayList<>();
		Node n=node;
		Node n2=new Node();
		while(n != null){
			if(!buffer.contains(n.data)){
				buffer.add(n.data);
				n2=add(n,n2);
				n=n.next;
				
				
			}
			else{
				
				n=n.next;
			}
			System.out.println("");	
		}
	}
	
	public Node add(Node n, Node n2){
		if(n2.next!=null)
			n2=add(n, n2.next);
		else
			n2.next=n;
		return n2;
	}***/
	
	public static void deleteDups(Node n) {
			 Hashtable table = new Hashtable();
			 Node previous = null;
			 while (n != null) {
				 if (table.containsKey(n.data)){ 
					 previous.next = n.next;
					 break;
				 }
				 else {
					 table.put(n.data, true);
					 previous = n;
			 }
			 n = n.next;
		 }
		}
	
	
	public void findElementAt(int n){
		Node temp=node;
		while(temp!=null){
			if(temp.n==n){
				System.out.println("node at "+n+"th position is "+temp.data);
			}
			temp=temp.next;
		}
		System.out.println("not found");
	}
	
	public int findMidNode(){
		Node temp=node;
		int n=0;
		while(temp!=null){
			n=temp.n;
			temp=temp.next;
		}
		return n/2;
		
	}
	
	public void deleteNodeAt(int num, Node n){
		 
		 Node previous = null;
		 while (n != null) {
			 if (n.n==num){ 
				 previous.next = n.next;
				 //break;
			 }
			 else {
				 //table.put(n.data, true);
				 previous = n;
		 }
		 n = n.next;
	 }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemDuplicate remDuplicate=new RemDuplicate();
		remDuplicate.addNode(1);
		remDuplicate.addNode(4);
		remDuplicate.addNode(3);
		remDuplicate.addNode(4);
		remDuplicate.addNode(5);
		remDuplicate.addNode(3);
		//remDuplicate.deleteDups(node);
		remDuplicate.findElementAt(9);
		int mid=remDuplicate.findMidNode();
		remDuplicate.deleteNodeAt(mid, node);
		System.out.println(node);
	}

}
