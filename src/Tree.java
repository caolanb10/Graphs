import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tree {
	public Node root;
	public Node pointer;
	
	// initialises tree root node with given data
	public Tree(String rootData) {
		root = new Node(rootData, null);
	}
	
	// the empty (trivial) tree
	public Tree(){
		root = null;
	}
	
	//add Node to the right or left of a given node
	public void addNode(String rootData, String data, String direction) {
		Node pointer = search(rootData, root);
		if(pointer == null)
			return;
		if (direction.equals("left") || (direction.equals("right"))) {
			if (direction == "right") {
				Node newNode = new Node(data, pointer);
				pointer.right = newNode;
			} else {
				Node newNode = new Node(data, pointer);
				pointer.left = newNode;
			}
			return;
		} else {
			return;
		}
	}
	
	// finds the lowest common ancestor of two nodes
	public static Node lowestCommonAncestor(String data, String data2, Node root) {
		if(root == null)
			return null;
		Node found = search(data, root);
		Node found2 = search(data2, root);
		if (found == null | found2 == null)
			return null;
		ArrayList firstList = ancestors(found);
		ArrayList secondList = ancestors(found2);
		int greater = (firstList.size() > secondList.size()) ? firstList.size() : secondList.size();
		int lesser = (firstList.size() > secondList.size()) ? secondList.size() : firstList.size();
		for (int i = 0; i < greater; i++) {
			for (int i2 = 0; i2 < lesser; i2++) {
				if (firstList.get(i).equals(secondList.get(i2)))
					return (Node) firstList.get(i);
			}
		}
		return null;
	}
	
	//method to find all ancestors of a given node
	public static ArrayList ancestors(Node node) {

		boolean finished = false;
		ArrayList ancestors = new ArrayList();
		if(node.parent == null){
			ancestors.add(node);
			return ancestors;
		}
		while (finished == false) {
			ancestors.add(node);
			node = node.parent;
			if (node.parent == null)
				finished = true;
		}
		return ancestors;
	}
	
	// searches tree from a given root for node with data "data"
	public static Node search(String data, Node root) {
		if (root != null) {
			if (root.data.equals(data))
				return root;
			else {
				Node foundNode = search(data, root.left);
				if (foundNode == null)
					foundNode = search(data, root.right);
				return foundNode;
			}
		} else
			return null;
	}

}