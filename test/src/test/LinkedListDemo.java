package test;

class Node4{
	 Node4 next;
	 int data;
}

public class LinkedListDemo {

	Node4 node;
	public void addNode(int data){
		Node4 newNode=new Node4();
		newNode.data=data;
		if(node==null){
			node=newNode;
		}
		else if(node.next==null){
			node.next=newNode;
		}
		else{
			insertNodeAtEnd(node.next,newNode);
		}

	}
	public void insertNodeAtEnd(Node4 nodeTest, Node4 newNode){
		if(nodeTest.next!=null)
			insertNodeAtEnd(nodeTest.next, newNode);
		else
			nodeTest.next=newNode;
	}
	
	public void deleteNode(int data){
		if(node==null){
			//node=newNode;
			System.out.println("No Node");
		}
		
		else{
			node=deleteNodeimpl(node,data);
		}
	}
	public Node4 deleteNodeimpl(Node4 node, int data){
		if(node.data==data){
			node=node.next;
			return node;
		}
		else{
			node.next=deleteNodeimpl(node.next, data);
		}
		return node;
	}
	
	public static void main(String[] args) {
		LinkedListDemo linkedListDemo=new LinkedListDemo();
		for(int i=-5;i<1;i++){
			linkedListDemo.addNode(i);
		}
		//System.out.println("a1");
		linkedListDemo.deleteNode(-3);
		//System.out.println("a");
	}

}
