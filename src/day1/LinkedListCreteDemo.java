package day1;

class Node {
	Node adr;
	Integer data;

	public Node getAdr() {
		return adr;
	}

	public void setAdr(Node adr) {
		this.adr = adr;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [adr=" + adr + ", data=" + data + "]";
	}

	public Node(Node adr, Integer data) {
		super();
		this.adr = adr;
		this.data = data;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}

}

class LL {

}

public class LinkedListCreteDemo {

	public static void main(String[] args) {
		Node n1 = new Node();
		n1.setData(10);

		Node n2 = new Node();
		n2.setData(30);
		n1.setAdr(n2);

	}

}
