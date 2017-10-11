import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.w3c.dom.Node;
import java.util.*;

public class lowestcommonancestor {
static Random rand = new Random();

	public static void main(String[] args) {

		
	}
	//creates a random tree with head at object[0]
	public static Tree newRandomTree(Object object[]){
		int size = object.length;
		Tree tree = new Tree(object[0]);
		Node node;
		node = new Node();
		
		int pos = rand.nextInt(size);
		int added = 0;
		for(int i = 0;i<size;i++){
			pos = rand.nextInt(size);
		}
		
		return null;
	}
	public static DefaultMutableTreeNode newNode(Object object){
		DefaultMutableTreeNode Node = new DefaultMutableTreeNode(object);
		return Node;
	}
}
