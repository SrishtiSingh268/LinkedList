package LinkedList;

import java.util.LinkedList;

public class SinglyLinkedList {
    private static class Node {
        int val;
        Node next;
        
        Node(int va) {
            val = va;
            next = null;
        }
    }
    
    private static Node reverse(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node prev = head;
        Node curr = head.next;
        Node nex = head.next.next;
        prev.next = null;
        while(nex != null) {
            curr.next = prev;
            prev = curr;
            curr = nex;
            nex = nex.next;
            curr.next = prev;
        }
        return curr;
    }
    
    private static void display(Node a) {
        while(a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = new Node(4);
        display(a);
        a = reverse(a);
        display(a);
    }

}
