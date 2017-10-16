import java.util.List;
import java.util.ArrayList;

public class Node {
	public int index;
	String data;
	Node parent;
	Node left, right;
	
	public Node(String data, Node parent){
		this.data = data;
		this.parent = parent;
		this.left = null;
		this.right = null;
	}
}