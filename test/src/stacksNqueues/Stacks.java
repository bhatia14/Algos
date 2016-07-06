package stacksNqueues;

public class Stacks {
	public static Node node;
	public void push(int data){
		Node old=node;
		node=new Node();
		node.data=data;
		node.n++;
		node.next=old;
	}
	
	public int pop(){
		//Node old=node.next;
		int val=node.data;
		node=node.next;
		return val;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacks stacks=new Stacks();
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		System.out.println(stacks.pop());
		System.out.println(node);
	}

}
