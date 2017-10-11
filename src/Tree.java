import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Tree<T> {
	Node<T> root;
	int size = 0;
	
	public Tree(T rootData) {
		root = new Node<T>();
		root.data = rootData;
		root.children = new ArrayList<Node<T>>();
		root.index = size;
	}
	public void AddRandomly(T data){
		size++;
		Node<T> node = new Node<T>();
		node.index = size;
		node.data = data;
		node.children = new ArrayList<Node<T>>();
		Random rand = new Random();
		int place = rand.nextInt(size+1);
		
		
	}
}