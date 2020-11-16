package h;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
	}
}

class Tree{
	String name;
	String type;
	boolean evergreen;
	double height;
	boolean fruitful;
	public Tree(String name, String type, boolean evergreen, double height, boolean fruitful) {
		super();
		this.name = name;
		this.type = type;
		this.evergreen = evergreen;
		this.height = height;
		this.fruitful = fruitful;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isEvergreen() {
		return evergreen;
	}
	public void setEvergreen(boolean evergreen) {
		this.evergreen = evergreen;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isFruitful() {
		return fruitful;
	}
	public void setFruitful(boolean fruitful) {
		this.fruitful = fruitful;
	}
	void print() {
		System.out.println("Tree [name=" + name + ", type=" + type + ", evergreen=" + evergreen + ", height=" + height
				+ ", fruitful=" + fruitful + "]");
	}
	boolean CutTree() {
		return evergreen;
		
	}
	
}
class Forest{
	String name;
	String country;
	ArrayList<Tree> a;
	
	public Forest(String name, String country, ArrayList<Tree> a) {
		super();
		this.name = name;
		this.country = country;
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public ArrayList<Tree> getA() {
		return a;
	}
	public void setA(ArrayList<Tree> a) {
		this.a = a;
	}
	void AddTree(Tree T) {
		
	}
	void FindTree(Tree T) {
		
	}
	void RemoveFruitfulTrees() {
		
	}
}