package tree;

import java.util.ArrayList;
import java.util.HashMap;

public class TreeStructure {
	Node start;
	Node end;
	ArrayList<Node> nodes=new ArrayList<>();
	HashMap<String,Path> paths=new HashMap<>();
	
	public TreeStructure getTree(){
		TreeStructure treeStructure=new TreeStructure();
		
		
		
		return treeStructure;
	}
	public TreeStructure(){
		setEnd();
		setStart();
		setNodes();
		setPaths();
	}
	
	
	public Node getStart() {
		return start;
	}
	public void setStart() {
		this.start=new Node("A");
	}
	public Node getEnd() {
		return end;
	}
	public void setEnd() {
		this.end = new Node("E");
	}
	public ArrayList<Node> getNodes() {
		return nodes;
	}
	public void setNodes() {
		this.nodes = nodes;
		this.nodes.add(new Node("B"));
		this.nodes.add(new Node("C"));
		this.nodes.add(new Node("D"));
		this.nodes.add(new Node("F"));
		this.nodes.add(new Node("G"));
		this.nodes.add(new Node("H"));
	}
	public HashMap<String,Path> getPaths() {
		return paths;
	}
	public void setPaths() {
		HashMap<String,Path> paths=new HashMap<>();
		Node b=new Node("B");
		Node c=new Node("C");
		Node d=new Node("D");
		Node f=new Node("F");
		Node g=new Node("G");
		Node h=new Node("H");
		paths.put("AB", new Path(getStart(), b, 4));
		paths.put("AF", new Path(getStart(), f, 8));
		paths.put("BC", new Path(b, c, 8));
		paths.put("BF", new Path(b, f, 11));
		paths.put("CD", new Path(c, d, 7));
		paths.put("CH", new Path(c, h, 4));
		paths.put("CG", new Path(c, g, 8));
		paths.put("CF", new Path(c, f, 9));
		paths.put("DE", new Path(d, getEnd(), 9));
		paths.put("DH", new Path(d, h, 14));
		paths.put("EH", new Path(getEnd(), h, 10));
		paths.put("GH", new Path(g, h, 6));
		paths.put("GF", new Path(g, f, 7));
		this.paths = paths;
	}
	

}
