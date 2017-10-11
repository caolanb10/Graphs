import java.util.List;
import java.util.ArrayList;

public class Node<T> {
	public int index;
	T data;
	Node<T> parent;
	List<Node<T>> children;
}