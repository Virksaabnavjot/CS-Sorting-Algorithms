import java.io.*;
import java.util.*;

class BinaryTree {
  Node root;
  public void addNode(int key, String name){
    Node newNode = new Node(key,name);
    if(root == null){
      root = newNode;
    }else{
      Node focusNode = root;
      Node parent;

      while(true){
        parent = focusNode;
        if(key < focusNode.key){
          focusNode = focusNode.leftChild;
          if(focusNode == null){
            parent.leftChild = newNode;
            return;
          }
        }else{
          focusNode = focusNode.rightChild;
          if(focusNode == null){
            parent.rightChild = newNode;
            return;
          }
        }

      }

    }
  }

  public void inOrderTraverse(Node focusNode){
    if(focusNode != null){
      inOrderTraverse(focusNode.leftChild);
      System.out.println(focusNode);
      inOrderTraverse(focusNode.rightChild);
    }
  }


  public static void main(String[] args){
    BinaryTree tree = new BinaryTree();
    tree.addNode(35, "I am Root Node");
    tree.addNode(1,"Nav");
    tree.addNode(3,"Jot");
    tree.addNode(2,"Ran");
    tree.addNode(0,"Bir");
    tree.addNode(36,"Har");
    tree.addNode(25,"Dit");
    tree.addNode(24,"Jas");
    tree.addNode(23,"Han");
    tree.addNode(22,"Yuv");
    tree.addNode(40,"Raj");
    tree.addNode(39,"Gur");
    tree.addNode(45,"Man");


    tree.inOrderTraverse(tree.root);

  }

}

class Node{
  int key;
  String name;

  Node  leftChild;
  Node rightChild;

  Node(int key, String name){
    this.key = key;
    this.name = name;
  }

  public String toString(){
    return "Name: " +name+ "    ,    Key: " +key;
  }

}
