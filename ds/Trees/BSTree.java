import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	root = null;
    }


    public void insert(int key){
       TreeNode newNode = new TreeNode(key);
       

       //if the tree is empty, manually insert the new node as the root
       if (root==null){
          root = newNode;
          return;
       } //end of if

        TreeNode front = root;
        TreeNode trailer;

        while (front != null){
            int frontValue = front.getData();
            if (frontValue == key){
              
              return;
            } else if (frontValue < key){
              trailer = front;
              front = front.getRight();
            } else {
              trailer = front;
                front = front.getLeft();
          }
        } //end of while loop
   
      if (key > front.getValue()){
        //insert on the getRight
        front.setRight(newNode);
      } else {
        //insert on getLeft
        front.setLeft(newNode);
      }




  public int search(int key){
	TreeNode current = root;

	while (current != null){
	    int currentValue = current.getData();
	    if (currentValue == key){
        return currentValue;
	    } else if (currentValue < key){
        current = current.getRight();
	    } else {
          current = current.getLeft();
		}
	}
throw new NullPointerException();
	//return -1;
    }
    
    public void seed(){
	TreeNode t;

	t = new TreeNode(10);
	root = t;
	t = new TreeNode(5);
	root.setLeft(t);
	t = new TreeNode(20);
	root.setRight(t);

	root.getLeft().setRight( new TreeNode(8));

	t = new TreeNode(15);
	root.getRight().setLeft(t);

	t = new TreeNode(22);
	root.getRight().setRight(t);
	
	}
    
    
}