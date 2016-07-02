package test;


class Node6{
	Node6 next;
	int data;
}


public class ReverseLinkedList {

	public Node6 node;
	public void addNode(int data){
		Node6 newNode=new Node6();
		newNode.data=data;
		if(node==null){
			node=newNode;
		}else if(node.next==null){
			node.next=newNode;
		}
		else{
			insertNodeAtEnd(node.next,newNode);
		}
	}
	public void insertNodeAtEnd(Node6 nodeTest, Node6 newNode){
		if(nodeTest.next!=null)
			insertNodeAtEnd(nodeTest.next, newNode);
		else
			nodeTest.next=newNode;
	}
	
	public void listIterate(Node6 node){
		if(node!=null){
			System.out.print(node.data+" ");
			listIterate(node.next);
		}
	}
	/*logic: Iterate trough the linked list. In loop, change next to prev, prev to current and current to next*/
	public void reverse() {
        Node6 prev = null;
        Node6 current = node;
        Node6 next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        //return node;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList reverseLinkedList=new ReverseLinkedList();
		for(int i=-1;i<=5;i++)
			reverseLinkedList.addNode(i);
		//System.out.println("ss");
		reverseLinkedList.listIterate(reverseLinkedList.node);
		reverseLinkedList.reverse();
		System.out.println("ss");
		reverseLinkedList.listIterate(reverseLinkedList.node);
	}

}
