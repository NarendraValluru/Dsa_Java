import java.util.*;
public class LinkedList1 {
    Node head;
    class Node{  // node class
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node second=head;
        Node last=head.next; 
        while(last.next!=null){
            second=last; 
            last=last.next;
        }
        second.next=null;
    }

    public Node reverse(){
        Node curr=head,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
        // System.out.print(prev);
    }

    public void display(){
        ArrayList<Integer> l=new ArrayList<Integer>();
        if(head==null){
            System.out.print("List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            l.add(temp.data);
            temp=temp.next;
        }
        l.add(null);
        System.out.print(l);
        // System.out.print("null");
    }

    public int length(){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public Node removeNth(int n){
        if(head.next==null) return null;
        Node curr=head;
        int size=0;
        while(curr.next!=null){
            curr=curr.next;
            size++;
        }
        // if(size==n) return head.next;
        Node prev=head;
        int index=size-n,i=0;
        while(i<index){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }

    public static void main(String[] args){
        LinkedList1 list=new LinkedList1();
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        list.display();
        System.out.println();
        list.removeNth(2);
        // list.reverse();
        list.display();
        System.out.println();
        System.out.println("Length of the list: "+list.length());
    }
}
