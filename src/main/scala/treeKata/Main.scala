package treeKata
import scala.collection.mutable.ArrayBuffer

class MyNode(var heldValue: Int, var left: MyNode, var right: MyNode)

class BalancedBinaryTree(){
	def basicAddNode(){

	}


	def InorderTraversal(tree: MyNode): ArrayBuffer[Int] = {
		val retList = new ArrayBuffer[Int]()
		if(tree.left != null){
			val temp = InorderTraversal(tree.left)
			retList.insertAll(0, temp)
		}
		retList += tree.heldValue
		if(tree.right != null){
			retList.insertAll(0, InorderTraversal(tree.right))
		}
		return retList
	}

}

