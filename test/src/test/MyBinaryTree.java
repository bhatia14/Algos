package test;

class NodeTree{
	int data;
	NodeTree left;
	NodeTree right;
}

public class MyBinaryTree {

	private static NodeTree node;
	public void addNode(int data ){
		NodeTree newNode=new NodeTree();
		newNode.data=data;
		if(node==null){
			node=newNode;
		}
		else{
			NodeTree focusNode= node;
			NodeTree parent;
			while(true){
				parent=focusNode;
				if(data<focusNode.data){
					focusNode=focusNode.left;
					if(focusNode==null){
						parent.left=newNode;
						return;
					}
				} else{
					focusNode=focusNode.right;
					if(focusNode==null){
						parent.right=newNode;
						return;
					}
				}
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBinaryTree binaryTree=new MyBinaryTree();
		binaryTree.addNode(5);
		binaryTree.addNode(2);
		binaryTree.addNode(1);
		binaryTree.addNode(3);
		binaryTree.addNode(6);
		System.out.println(node);
	}

}
