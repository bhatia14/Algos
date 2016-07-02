package test;

public class ReverseLinkedListGivenIndex {
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
			System.out.print(node.data+"-> ");
			listIterate(node.next);
		}
		else
			System.out.print("null ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedListGivenIndex givenIndex=new ReverseLinkedListGivenIndex();
		for(int i=-1;i<=5;i++)
			givenIndex.addNode(i);
		//System.out.println("ss");
		givenIndex.listIterate(givenIndex.node);
		//givenIndex.reverse();
		System.out.println();
		givenIndex.listIterate(givenIndex.node);
	}

}
