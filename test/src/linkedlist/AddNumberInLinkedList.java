package linkedlist;

public class AddNumberInLinkedList {
	//static Node node;
	public Node addNode(int data, Node node){
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
		return node;
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
	
	public Node addLinkedLists(Node node1, Node node2){
		Node node3=null;
		int d=0;
		int extra=0;
		while(node1!=null || node2!=null){
			d=node1.data+node2.data+extra;
			if(d>=10){
				node3=addNode(d%10, node3);
				d=d/10;
				extra=d%10;
			}
			else{
				node3=addNode(d, node3);
				extra=0;
			}
			
			node1=node1.next;
			node2=node2.next;
		}
		
		
		
		return node3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNumberInLinkedList obj=new AddNumberInLinkedList();
		int num1=513;
		int num2=295;
		int numArray1[]=new int[3];
		int numArray2[]=new int[3];
		int i=0;
		Node node1=null;
		Node node2=null;
		Node node3=null;
		while(num1>0 && num2>0){
			node1=obj.addNode(num1%10, node1);
			node2=obj.addNode(num2%10, node2);
			numArray1[i]=num1%10;
			num1=num1/10;
			numArray2[i]=num2%10;
			num2=num2/10;
			i++;
			
		}
		node3=obj.addLinkedLists(node1,node2);
		System.out.println(node3);
		//obj.addNode();
	}

}
