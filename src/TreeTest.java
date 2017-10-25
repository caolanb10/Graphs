import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTest {
	Tree tree1 = new Tree("A");	//a full (size>1) tree
	Tree tree2 = new Tree();	//the trivial tree
	Tree tree3 = new Tree("Z");	//a tree with size == 1 (the root)
	
	
	
	@Test
	public void addNodeTest() {
		tree1.addNode("A", "B", "left");
		tree1.addNode("A", "C", "right");
		tree1.addNode("B", "D", "left");
		tree1.addNode("B", "E", "right");
		tree1.addNode("C", "F", "left");
		tree1.addNode("C", "G", "right");
		tree1.addNode("D", "H", "left");
		tree1.addNode("D", "I", "right");
		tree1.addNode("E", "J", "left");
		tree1.addNode("F", "K", "left");
		tree1.addNode("K", "L", "right");
		tree1.addNode("G","M", "left");
		
		//the full tree
		assert(tree1.root.left.left.data.equals("D"));
		assert(tree1.root.right.left.data.equals("F"));
		
		//the empty tree
		tree2.addNode("A", "B", "left");
		assert(tree2.search("B", tree2.root) == null);
		
		tree3.addNode("Z", "Y", "right");
		assert(tree3.root.right.data.equals("Y"));
	}
	@Test
	public void searchTest(){
		tree1.addNode("A", "B", "left");
		tree1.addNode("A", "C", "right");
		tree1.addNode("B", "D", "left");
		tree1.addNode("B", "E", "right");
		tree1.addNode("C", "F", "left");
		tree1.addNode("C", "G", "right");
		tree1.addNode("D", "H", "left");
		tree1.addNode("D", "I", "right");
		tree1.addNode("E", "J", "left");
		tree1.addNode("F", "K", "left");
		tree1.addNode("K", "L", "right");
		tree1.addNode("G","M", "left");
		
		//searching tree 1
		Node found = tree1.search("G", tree1.root);
		System.out.println(found.data);
		boolean correct = false;
		if((found.data.equals("G"))&&(found.parent.data.equals("C")))
			correct = true;
		assert(correct);
		
		tree2.addNode("A", "B", "left");
		//searching tree 2
		Node found2 = tree2.search("B", tree2.root);
		assert(found2 == null);
		
		tree3.addNode("Z", "Y", "right");
		//searching tree 3
		Node found3 = tree3.search("Y", tree3.root);
		assert(found3.data.equals("Y")&&tree3.root.right == found3);
	}
	
	@Test
	public void lowestCommonAncestorTest(){
		tree1.addNode("A", "B", "left");
		tree1.addNode("A", "C", "right");
		tree1.addNode("B", "D", "left");
		tree1.addNode("B", "E", "right");
		tree1.addNode("C", "F", "left");
		tree1.addNode("C", "G", "right");
		tree1.addNode("D", "H", "left");
		tree1.addNode("D", "I", "right");
		tree1.addNode("E", "J", "left");
		tree1.addNode("F", "K", "left");
		tree1.addNode("K", "L", "right");
		tree1.addNode("G","M", "left");
		
		Node LCA = tree1.lowestCommonAncestor("I", "J", tree1.root);
		System.out.println(LCA.data);
		assert(LCA.data.equals("B"));
		
		Node sameNode = tree1.lowestCommonAncestor("B", "B", tree1.root);
		assert(sameNode.data.equals("B"));
		Node LCA2 = tree2.lowestCommonAncestor("B", "C", tree2.root);
		assert(LCA2 == null);
		
		Node LCA3 = tree3.lowestCommonAncestor("Z", "Z", tree3.root);
		assert(LCA3.data.equals("Z"));
		
		
	}
}
