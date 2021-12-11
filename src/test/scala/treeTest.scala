package treeKata

import myPackage._
import org.scalatest.FunSuite

class treeTest extends FunSuite {
	test("Tree has one node with held Value greater then 0"){
		val tree = new MyNode(5, null, null)
		assert(tree.heldValue > 0)
	}
}