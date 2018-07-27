package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SortestPathMine {
	static HashMap<String,Path> paths;
	static TreeStructure treeStructure;
	static ArrayList<String> possiblePaths=new ArrayList<>();
	public static void main(String[] args) {
		treeStructure=new TreeStructure();
		System.out.println(treeStructure);
		paths= treeStructure.getPaths();
		getAllPaths();
		for (String string :paths.keySet()) {
			
		}
		
	}
	public static ArrayList<String> getAllPaths(){
		ArrayList<String> allPaths=new ArrayList<>(treeStructure.getPaths().keySet());
		
		Collections.sort(allPaths);
		for (String string : allPaths) {
			if(string.contains("A")){
				System.out.println("----------a---------"+string);
				//possiblePaths.add(string);
				for (String string1 : allPaths) {
					
				}
			}
		}
		return null;
	}

}
