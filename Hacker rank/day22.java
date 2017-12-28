import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class day22{
    public static int getHeight(Node root){
      //Write your code here
        Node temp = root;
        int count1 = 0, count2 = 0, count = 0 ;

        if(temp.right != null && temp.left != null){
            count1 = 1 + getHeight(temp.left);
            count2 = 1 + getHeight(temp.right);
        }
        else if(temp.right == null && temp.left != null){
            count1 = 1 + getHeight(temp.left);
        }
        else if(temp.left == null && temp.right != null){
            count2 = 1 + getHeight(temp.right);
        }

        if(count1 > count2){
            count = count1;
        }
        else if(count1 < count2){
           count = count2;
        }
        else{
            count = count1;
        }
        return count;
   }
   public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
        }
}