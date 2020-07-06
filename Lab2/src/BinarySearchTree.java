public class BinarySearchTree {
	private class BSTNode { // private class to hold a tree node

		private int value;
		private BSTNode leftChild; // left subtree
		private BSTNode rightChild; // right subtree

		public BSTNode(int v) {
			value = v;
			leftChild = null;
			rightChild = null;
		}

		public BSTNode getLeftChild() {
			return leftChild;
		}

		public BSTNode getRightChild() {
			return rightChild;
		}

		public void setLeftChild(BSTNode n) {
			leftChild = n;
		}

		public void setRightChild(BSTNode n) {
			rightChild = n;
		}

		public int getValue() {
			return value;
		}

		// Part 1: inserting nodes
		public void insertNode(BSTNode n) {
			// insert somewhere into the left subtree
			if (n.value < this.value) {
				if (this.getLeftChild() == null) {
					// TODO: add node n as left child
				} else {
					// TODO: otherwise recurse down the left subtree
				}
			}

			// insert somewhere into the right subtree
			else if (n.value > this.value) {
				if (this.getRightChild() == null) {
					// TODO: add node n as right child
				} else {
					// TODO: otherwise recurse down the right subtree
				}
			}

			// a duplicate which we don't allow (could also raise exception)
			else {
				return;
			}
		}

		// Part 2: lookup a node
		public boolean containsNodeWithValue(int v) {
			// lookup somewhere into the left subtree
			if (v < this.value) {
				if (this.getLeftChild() == null) {
					// value v cannot be in the tree 
					return false;
				} else {
					// TODO otherwise recurse down the left subtree
					return false;
				}
			} else if (v > this.value) {
				if (this.getRightChild() == null) {
					// value v cannot be in the tree 
					return false;
				} else {
					// TODO otherwise recurse down the right subtree
					return false;
				}
			}

			// otherwise this.value == v
			return true;
		}

		// useful for deleting a node
		public BSTNode getLargestValueNode() {
			// decend down the right subtree until we get the largest value.
			// i.e. until we cannot continue to go down the right subtree
			if (this.getRightChild() == null) {
				return this;
			} else {
				return this.getRightChild().getLargestValueNode();
			}
		}

		// Part 3
		public BSTNode deleteNodeWithValue(int v) {
			// this is not the node we want to remove
			if (v != this.value) {
				// go right?
				if (v > this.value && this.getRightChild() != null) {
					// we're going to update our right child reference
					this.rightChild = this.getRightChild().deleteNodeWithValue(v);
					return this;
				}
				
				// go left?
				else if (v < this.value && this.getLeftChild() != null) {
					// we're going to update our left child reference
					this.leftChild = this.getLeftChild().deleteNodeWithValue(v);
					return this;
				}
				
				// we are trying to delete a non-existent value
				else {
					return this;
				}
			}
			
			// this is the node we want to remove
			else {
				// difficult case: does it have two children?
				if (this.getLeftChild() != null && this.getRightChild() != null) {
					
					// TODO step 1: find the largest value in the left subtree
					BSTNode largestLeft = null;
					
					// TODO step 2: set this node's value to the value of the largest left node value
					// this.value = ...
					
					// step 3: remove the largest
					this.leftChild = this.getLeftChild().deleteNodeWithValue(largestLeft.value);
					
					return this;
				}
				
				// the easy cases
				
				// has only left subtree
				else if (this.getLeftChild() != null) {
					// TODO: return to the parent node what this node's left child is
					return null;
				}
				
				// has only right subtree
				else if (this.getRightChild() != null) {
					// TODO: return to the parent node what this node's right child is
					return null;
				}
				
				// has no subtrees (is a leaf node)
				else {
					System.out.println("Deleting Node with value " + this.value);
					return null;
				}
			}
		}

		public int numberOfNodes() {
			int valueToReturn = 1; // this is 1 to count this node
			if (leftChild != null)
				valueToReturn += leftChild.numberOfNodes(); // add the nodes in the left subtree
			if (rightChild != null)
				valueToReturn += rightChild.numberOfNodes(); // add the nodes in the right subtree
			return valueToReturn; // return the number of nodes
		}
	}

	private BSTNode rootNode = null;

	public void insert(int v) {
		if (rootNode == null) {
			rootNode = new BSTNode(v);
		} else {
			rootNode.insertNode(new BSTNode(v));
		}
	}

	public void remove(int v) {
		if (rootNode != null) {
			rootNode = rootNode.deleteNodeWithValue(v);
		}
	}

	public boolean contains(int v) {
		if (rootNode != null) {
			return rootNode.containsNodeWithValue(v);
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		return (rootNode == null);
	}

	public int size() {
		if (rootNode == null) {
			return 0;
		} else {
			return rootNode.numberOfNodes();
		}
	}
}
