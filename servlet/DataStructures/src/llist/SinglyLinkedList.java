package llist;

import java.util.Scanner;

public class SinglyLinkedList {
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
//--------insert at beginning of a sll--------------
	public void insertfirst(int value)
	{
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;    
	}
	
//--------insert at end of a sll--------------	
	public void insertEnd(int value) {
		ListNode newNode=new ListNode(value);
		if(head==null) {

			head=newNode;
			return;
		}
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
	}
	
//--------insert at Given position of a sll--------------	
        public void insertpos(int position,int data) {
        	     ListNode newNode=new ListNode(data);
        	     if(position==1) {
        	    	 newNode.next=head;
        	    	 head=newNode;
        	     }
        	     else {
        	    	 ListNode previous=head;
        	    	 int count=1;
        	    	 while(count<position-1) {
        	    		 previous=previous.next;
        	    		 count++;
        	    	 }
        	    	 ListNode current=previous.next;
        	    	 previous.next=newNode;
        	    	 newNode.next=current;
        	    	 }
        } 
        
	
//----------- Display sll--------------	
	public void Display() {
		ListNode current=head;
		int count=0;
		while(current!=null) {
			count++;
			System.out.print(current.data+" --> ");
			//System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
		System.out.print("the no of nodes is "+count);

	}
	
	
	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode fourth=new ListNode(11);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
//      //  Scanner sc =new Scanner(System.in);
        //String s=sc.next();
		
       // sll.insertfirst(9);
        sll.insertEnd(7);        
        //sll.insertpos(1,7);
        sll.Display();

//------------------------------------------------
        //sll.deleteBeg();
//System.out.println("The deleted element is "+sll.deleteBeg().data);
        //sll.deleteEnd();
        sll.display();
	}    


//-------------deletions of SLL----------------------
//..........Delete at beginning of a SLL...........
 public ListNode deleteBeg() {
	if(head==null) {
		return null;
	}
	ListNode temp=head;
	head=head.next;
	temp.next=null;
	return temp;
}
 //.................DeleteEnd.......................
 public ListNode deleteEnd() {
//	 if(head==null) {
	 //System.out.println("null");
//	 }
	 if(head==null || head.next==null) {
		 return head;
	 }
	 ListNode current=head;
	 ListNode previous=null;
	 while(current.next!=null) {
		 previous=current;
		 current=current.next;
	 }

	 previous.next=null;
	 return current;
 }
 public void display() {
	 if(head==null) {
		 System.out.println("empty linked list");
	 }
	 ListNode current=head;
	 while(current!=null) {
		 System.out.print(current.data+"-->");
		 current=current.next;
	 }
	 System.out.println("null");
		 
 }
}