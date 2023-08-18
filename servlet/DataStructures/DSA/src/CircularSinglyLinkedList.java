
public class CircularSinglyLinkedList {
	private ListNode last;
	private int length;
	private static class ListNode {
	private	ListNode next;
	private	int data ;
	
	public ListNode(int data) {
		this.data=data;
	}
	}
	public CircularSinglyLinkedList() {
		last=null;
		length=0;
	}
	public int length() {
		return length;
	}
	public void createCSLL() {
		ListNode first=new ListNode(2);
		ListNode second=new ListNode(4);
		ListNode third=new ListNode(5);
		ListNode fourth=new ListNode(7);
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		   last=fourth;
	}
//..................................................................INSERT AT BEGINNING...................................
	public void insertBeg(int value) {
		ListNode newNode=new ListNode(value);
		//ListNode first=last.next;
		if(last==null) {
			last=newNode;
		}
		else {
		//	newNode.next=last.next;
			newNode.next=last.next;
		}
		last.next=newNode;
	}
//..................................................................INSERT AT END...................................
public void insertEnd(int value) {
ListNode newNode=new ListNode(value);
if(last==null) {
	last=newNode;
	last.next=last;
}
else {
	newNode.next=last.next;
	last.next=newNode;
	last=last.next;
}
}
//..................................................................INSERT AT POSITION...................................
public void insertPos(int data,int pos) {
	ListNode newNode=new ListNode(data);
	if(pos==1 && last==null) {
		last=newNode;
	    last.next=last;
	}
	else if(pos==1) {
		newNode.next=last.next;
		last.next=newNode;
	}
	else {
		ListNode temp=last.next;
		ListNode prev=temp;
		int count=1;
		while(count<pos) {
			count++;
			prev=temp;
			temp=temp.next;
		}
		if(prev.next!=last.next) {
		prev.next=newNode;
        newNode.next=temp;
		}
        else {
        	newNode.next=prev.next;
        	last=newNode;
        	prev.next=newNode;
        }

	}
}
//..................................................................DELETE AT POSITION...................................
public void deletePos(int pos) {
	if(pos==1 && last.next==last) {
		last=null;
	}
	else if(pos==1) {
		last.next=last.next.next;
	}else {
		ListNode temp=last.next;
		ListNode prev=temp;
		int count=1;
		while(count<pos) {
			count++;
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
		
	}
}
//..................................................................DELETE AT BEGINNING...................................
public void deleteBeg() {
	if(last.next==last) {
		last=null;
	}else {
	   ListNode temp=last.next;
	   temp=temp.next;
	   last.next=temp; //last.next=temp.next;
	}
}
//..................................................................DELETE AT END...................................
public void deleteEnd() {
	if(last==last.next) {
		last=null;
	}
	else {
		ListNode first=last.next;
		while(first.next!=last) {
			first=first.next;
		}
		first.next=last.next;
			last=first;
			
	}
}
	
//..................................................................DISPLAY...................................
	public void display() {
		if(last==null) {
			System.out.println("empty circularsingularlinkedlist");
		}
		else {
		ListNode first=last.next;
		ListNode current=first;
		do {
			System.out.print(current.data+"-->");
			current=current.next;

		}
		while(current!=last.next);

		}
	}
	
	public static void main(String[] args) {
		CircularSinglyLinkedList cll=new CircularSinglyLinkedList();
		//cll.createCSLL();
		//cll.insertBeg(90);
		cll.insertEnd(80);
		cll.insertEnd(30);
//		cll.insertEnd(40);
//		cll.insertEnd(50);
		//cll.deleteBeg();
		cll.deletePos(1);
		//cll.insertPos(5, 1);
		//cll.deleteEnd();
		cll.display();
	}
	
}
