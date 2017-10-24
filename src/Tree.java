import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tree {
	public Node root;
	public Node pointer;

	public Tree(String rootData) {
		root = new Node(rootData, null);
	}

	public void addNode(Node pointer, String data, String direction) {
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