package unidad5;

public class AppTree {

	static class Node{
		int value;
		
		Node left, right;
		
		Node(int value){
			this.value = value;
			left=null;
			right=null;
			
		}
	}	
	//metodos de insercicion y de recorrido
		//insert
		public void insert(Node node, int value) {
			if (value < node.value) {
				if(node.left != null)
				{
					insert(node.left,value);
				}
				else {
					System.out.println("insert "+ value+ " izquierdo "+node.value);
					
					node.left = new Node(value);
				}					
			}
			else if (value>node.value) {
				if (node.right != null) {
					insert(node.right, value);
				}else {
					System.out.println("insert "+value+" derecho "+node.value);
					node.right = new Node(value);
				}
			}
					
		}
		
		public void InOrder(Node node) {
			if (node != null) {
				InOrder(node.left);
				System.out.print(" "+node.value);
				InOrder(node.right);
			}
		}
		
		public void preOrder(Node node) {
			if (node != null) {
				System.out.print(" " + node.value);
				preOrder(node.left);
				preOrder(node.right);
			}
		}
		
		public void postOrder(Node node) {
			if(node != null) {
				postOrder(node.left);
				postOrder(node.right);
				System.out.print(" " + node.value);
			}
		}
		
		
	
	
	
	public static void main(String[] args) {

		AppTree tree = new AppTree();
		Node root = new Node(5);
		System.out.println("arbol binario");
		System.out.println("construccion de tree con valor raiz "+ root.value);
		tree.insert(root, 2);
		tree.insert(root, 4);
		tree.insert(root, 8);
		tree.insert(root, 6);
		tree.insert(root, 7);
		tree.insert(root, 3);
		tree.insert(root, 9);
		
		System.out.println("recorrido Inorden");
		tree.InOrder(root);
		
		System.out.println("recorrido preOrden");
		tree.preOrder(root);
		
		System.out.println("recorrido PostOrden");
		tree.postOrder(root);
		

	}

}
