package treeKata
import scala.collection.mutable.ArrayBuffer

class MyNode(var heldValue: Int, var left: MyNode, var right: MyNode)

class BalancedBinaryTree(){
	def basicAddNode(){

	}


	def InorderTraversal(tree: MyNode): ArrayBuffer[Int] = {
		val retList = new ArrayBuffer[Int]()
		if(tree.left != null){
			retList ++=  InorderTraversal(tree.left)
		}
		retList += tree.heldValue
		if(tree.right != null){
			retList ++= InorderTraversal(tree.right)
		}
		return retList
	}

}

