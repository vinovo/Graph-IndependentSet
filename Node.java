package graphTest;

class Node implements Comparable<Node> {
	int id;
	int neighborSize;
	boolean[] neighbors;

	Node(int id, int size) {
		this.id = id;
		neighbors = new boolean[size];
		neighborSize = 0;
	}

	@Override
	public int compareTo(Node node) {
		if (this.neighborSize > node.neighborSize)
			return 1;
		else if (this.neighborSize < node.neighborSize)
			return -1;
		else
			return 0;
	}
}
