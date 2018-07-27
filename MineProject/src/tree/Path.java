package tree;

public class Path {
	Node n1,n2;
	int weight;
	
	public Path(Node n1, Node n2, int weight) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.weight = weight;
	}
	public Node getN1() {
		return n1;
	}
	public void setN1(Node n1) {
		this.n1 = n1;
	}
	public Node getN2() {
		return n2;
	}
	public void setN2(Node n2) {
		this.n2 = n2;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
