import java.util.*;
import java.lang.*;
import java.util.Arrays;

public class lowestcommonancestor {
	static Random rand = new Random();

	public static void main(String[] args) {
		Tree tree = new Tree("A");
		tree.addNode(tree.root, "B", "left");
		tree.addNode(tree.root, "C", "right");
		tree.pointer = tree.root.left;
		tree.addNode(tree.pointer, "D", "left");
		tree.addNode(tree.pointer, "E", "right");
		tree.pointer = tree.root.right;
		tree.addNode(tree.pointer, "F", "left");
		tree.addNode(tree.pointer, "G", "right");
		Node foundNode = tree.search("F", tree.root);
		Node foundNode2 = tree.search("H", tree.root);
		System.out.println(foundNode.data);
		System.out.println(foundNode2.data);

	}

	public static Node lowestCommonAncestor(String data, String data2, Tree tree) {
		Node root = tree.root;
		//Node foundNode = search(data, root);
		//Node foundNode2 = search(data2, root);

		return null;
	}

}
