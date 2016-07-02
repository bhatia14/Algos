package test;

class Node{
	int key;
	String value;
	Node leftNode;
	Node rightNode;
	Node(int key, String value){
		this.key=key;
		this.value=value;
	}
	public String toString(){
		return key +" key is & value is "+value;
	}
}

public class BinaryTree {
	
	Node root;
	
	public void addNode(int key, String name){
		Node newNode=new Node(key, name);
		if(root==null){
			root=newNode;
		}
		else{
			Node focusNode= root;
			Node parent;
			while(true){
				parent=focusNode;
				if(key<focusNode.key){
					focusNode=focusNode.leftNode;
					if(focusNode==null){
						parent.leftNode=newNode;
						return;
					}
				} else{
					focusNode=focusNode.rightNode;
					if(focusNode==null){
						parent.rightNode=newNode;
						return;
					}
				}
			}
		}
	}

	public void inOrderTraverseTree(Node focusNode){
		if(focusNode!=null){
			inOrderTraverseTree(focusNode.leftNode);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightNode);
		}
		
	}
	
	public void preOrderTraverseTree(Node focusNode){
		if(focusNode!=null){
			System.out.println(focusNode);
			preOrderTraverseTree(focusNode.leftNode);
			preOrderTraverseTree(focusNode.rightNode);
		}
		
	}
	
	public void postOrderTraverseTree(Node focusNode){
		if(focusNode!=null){
			postOrderTraverseTree(focusNode.leftNode);
			postOrderTraverseTree(focusNode.rightNode);
			System.out.println(focusNode);
		}
		
	}
	
	public void findNode(int key){
		Node focusNode=root;
		while(true){
			
			if(focusNode==null){
				System.out.println("Not Found");
				break;
			}
			else if(key==focusNode.key){
				System.out.println(focusNode.value);
				break;
			}
			else if(key<focusNode.key){
				focusNode=focusNode.leftNode;
			}
			else
				focusNode=focusNode.rightNode;
		}
	}
	
	public void deleteNode(int key){
		Node focusNode=root;
		while(true){
			
			if(focusNode==null){
				System.out.println("Not Found");
				break;
			}
			else if(key==focusNode.key){
				//System.out.println(focusNode.value);
				if(focusNode.rightNode!=null){
					focusNode.rightNode.leftNode=focusNode.leftNode;
					focusNode=focusNode.rightNode;
				}
				else if(focusNode.leftNode!=null){
					focusNode=focusNode.leftNode;
				}
				else
					focusNode=null;
				
				break;
			}
			else if(key<focusNode.key){
				focusNode=focusNode.leftNode;
			}
			else
				focusNode=focusNode.rightNode;
		}
	}
	
	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.addNode(50, "first");
		binaryTree.addNode(25, "Second");
		binaryTree.addNode(30, "third");
		binaryTree.addNode(75, "forth");
		binaryTree.addNode(15, "fifth");
		
		System.out.println("In order:");
		binaryTree.inOrderTraverseTree(binaryTree.root);
		System.out.println("Pre order:");
		binaryTree.preOrderTraverseTree(binaryTree.root);
		System.out.println("Post order:");
		binaryTree.postOrderTraverseTree(binaryTree.root);
		System.out.println("Search node");
		binaryTree.findNode(75);
		
		System.out.println("Delete node");
		binaryTree.deleteNode(50);
		binaryTree.inOrderTraverseTree(binaryTree.root);

	}

}
