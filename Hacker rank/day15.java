import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class day15 {
     public static  Node insert(Node head,int data) {
        //Complete this method
        Node temp = new Node(data);
        Node cur = head;
        if(cur == null){
            head = temp;
        }
        else if(cur.next == null){
            cur.next = temp;
        }
        else{
            while(cur.next != null){
            cur = cur.next;
            }
            cur.next = temp;
        }
        return head;

    }
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
