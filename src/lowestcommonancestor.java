import java.util.*;
import java.util.Arrays;

public class lowestcommonancestor {
	static Random rand = new Random();

	public static void main(String[] args) {
		Tree tree = new Tree("A");
		tree.addNode(tree.root,"B", "left");
		tree.addNode(tree.root, "C", "right");
		tree.pointer = tree.root.left;
		tree.addNode(tree.pointer, "D", "left");
		tree.addNode(tree.pointer, "E", "right");
		tree.pointer = tree.root.right;
		tree.addNode(tree.pointer, "F", "left");
		tree.addNode(tree.pointer, "G", "right");
		Node foundNode = search("F", tree.root);
		Node foundNode2 = search("H", tree.root);
		System.out.println(foundNode.data);
		System.out.println(foundNode2.data);
	}
	public static Node lowestCommonAncestor(String data, String data2, Tree tree){
		
		return null;
	}
	public static Node search(String data, Node root){
		if(root!=null)
		{
			String rootVal = root.data;
			if(data == rootVal)
				return root;
			Node left = root.left;
			Node right = root.right;
			if(left!=null){
				return search(data, left);
			}
			if(right!=null)
				return search(data, right);
		}
		return null;
		
		
	}
	
}
