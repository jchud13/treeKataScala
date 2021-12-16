package treeKata

import org.scalatest.FunSuite
import scala.collection.mutable.ArrayBuffer

class treeTest extends FunSuite {
	test("Tree has one node with held Value greater then 0"){
		//Arrange
		val tree = new MyNode(5, null, null)
		
		//Assert
		assert(tree.heldValue > 0)
	}

	test("Tree has one node, left and right are null"){
		//Arrange
		val tree = new MyNode(5, null, null)
		
		//Assert
		assert(tree.right == null)
		assert(tree.left == null)
	}

	test("Tree's left node has held Values greater then 0"){
		//Arrange
		val tree = new MyNode(5, null, null)
		tree.left = tree

		//Assert
		assert(tree.left.heldValue > 0)
	}

	test("Tree's right node has held Values greater then 0"){
		//Arrange
		val tree = new MyNode(5, null, null)
		tree.right = tree

		//Assert
		assert(tree.right.heldValue > 0)
	}

	test("Inorder Traversal Personal Test"){
		//Arrange 
		val root = new MyNode(5, null, null)
		root.left = new MyNode(6, new MyNode(5, null, null), null)
		root.right = new MyNode(7, null, null)

		val expectedData = ArrayBuffer(5, 6, 5, 7)

		//Act
		val act = new BalancedBinaryTree()
		val retData = act.InorderTraversal(root)

		//Assert
		assert(expectedData == retData)
	}

	test("Inorder Traversal Online Test"){
		//Arramnge
		val root = new MyNode(1, new MyNode(12, new MyNode(5, null, null), new MyNode(6, null, null)), new MyNode(9, null, null))

		val expectedData = ArrayBuffer(5, 12, 6, 1, 9)

		//Act 
		val act = new BalancedBinaryTree()
		val retData = act.InorderTraversal(root)

		assert(expectedData == retData)

	}
}