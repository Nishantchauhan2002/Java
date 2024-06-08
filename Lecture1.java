package Tree;
import java.util.*;

public class Lecture1 {
	class node{
		int data;
		node left;
		node right;
	}
	Scanner scn=new Scanner(System.in);
	node root =null;
	public Lecture1() {
		root=construct(null,true);
		display(root);
	}
	
	public node construct(node root,boolean lc) {
		if(root==null) {
			System.out.println("Enter the data for the root node");
		}else {
			if(lc==true) {
				System.out.println("Enter the value for the left child of "+root.data);
			}else {
				System.out.println("Enter the value for the right child of "+root.data);

			}
		}
		int val=scn.nextInt();
		node nn=new node();
		nn.data=val;
		System.out.println(nn.data+" has left chld ?");
		boolean hlc=scn.nextBoolean();
		if(hlc) {
			nn.left=construct(nn,true);
		}
		System.out.println(nn.data+" has right chld ?");
		boolean hrc=scn.nextBoolean();
		if(hrc==true) {
			nn.right=construct(nn,false);
		}
		return nn;
	}
	public void display(node root) {
		if(root==null) {
			return;
		}
		String str="";
		if(root.left!=null) {
			str+=root.left.data+" <- "; 
		}else {
			str+=" .<- ";
		}
		str+=root.data+" ->";
		if(root.right!=null) {
			str+=root.right.data;
		}else {
			str+=". ";
		}
		System.out.println(str);
		display(root.left);
		display(root.right);
	}
	
	public static void main(String[] args) {
		Lecture1 l1=new Lecture1();
		node root=l1.construct(null, false);
		System.out.println(root.data);
	}
}
