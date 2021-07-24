
public class BSTImp<T> {
	
  
	Node<T> root;
	int size =0;
	 public BSTImp() {
	        this.root = null;
	    }
	 
	 
	public static void main(String[] args) {
		int [] num = {56,30,70};
		Node root = null;
}
	  
	public void insertNewNode(int data) {

        // create new Node
		Node<T> newNode = new Node<>(data);

        // Check if BST is empty or not
        if (root == null) {

            root = newNode;
            size ++;
            return;

        } else {

        	Node<T> current = root, parent = null;
            while (true) {

                //parent keep track of the parent node of current node.
                parent = current;

                //If data is less than current's data, node will be inserted to the left of tree
                if (data < current.data) {

                    current = current.left;

                    if (current == null) {

                        parent.left = newNode;
                        size++;
                        return;

                    }
                }

                //If data is greater than current's data, node will be inserted to the right of tree
                else {

                    current = current.right;

                    if (current == null) {

                        parent.right = newNode;
                        size++;
                        return;

                    }

                }
            }

        }
    }

}
