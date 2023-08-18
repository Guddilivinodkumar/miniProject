
public class DoublyLinkedList {   
	    private ListNode head;
	    private ListNode tail;
	    private int length;
   public static class ListNode {
	    	private int data;
	    	private ListNode next;
	    	private ListNode previous;
   public ListNode(int data) {
	    	this.data=data;
	    }
	    }    
   public DoublyLinkedList() {
    	   this.head=null;
    	   this.tail=null;
    	   this.length=0;   
       }
  public boolean isEmpty(){
	   return length==0; 
   }
  public int length() {
	  return length;
  }
//--------------------------------------------------------CREATE DLL--------------------------------------------------
public void createDLL() {
	   head=new ListNode(1);
	  // tail=head;
	   ListNode second=new ListNode(4);
	   ListNode third=new ListNode(6);
	   ListNode fourth=new ListNode(8);
	   ListNode fifth=new ListNode(10);
	   head.next=second;
	   second.next=third;
	   third.next=fourth;
	   fourth.next=fifth;
	   tail=fifth;
	   
	   fifth.previous=fourth;
	   fourth.previous=third;
	   third.previous=second;
	   second.previous=head;
}
 //..........................................................INSERT AT BEGINNING...............................................
   public void insertBeg(int value) {
	   ListNode newNode= new ListNode(value);
	   if(head==null) {
		   tail=newNode;		   
	   }
	   else {
		   head.previous=newNode;
	   }
		   newNode.next=head;
		   head=newNode;  
   }
//..........................................................INSERT AT END...............................................
public void insertEnd(int value) {
	ListNode newNode=new ListNode(value);
	if(head==null) {
		head=newNode;
	}
	else {
		tail.next=newNode;
	}
	newNode.previous=tail;
	tail=newNode;
			
}
//..........................................................INSERT AT PARTICULAR POSITION...............................................
public void insertPos(int value,int pos) {
	ListNode newNode=new ListNode(value);
	if(pos==1) {
		head.previous=newNode;
		newNode.next=head;
		head=newNode;
	}
	else {
		int count=1;
		ListNode temp=head;
		while(count<pos-1) {
			count++;
			temp=temp.next;		
			}
		newNode.next=temp.next;
		newNode.previous=temp;
		temp.next=newNode;
		if(newNode.next!=null)
		newNode.next.previous=newNode;
		else
			tail=newNode;
	}
	
}
//..........................................................DELETE AT BEGINNING...............................................
public void deleteFirst() {
	if(head==tail) {
		head=tail=null;
	}
	else {
		ListNode temp=head;
		head=head.next;
		head.previous=null;
		temp.next=null;
	}
}
//..........................................................DELETE AT END...............................................
public void deleteEnd() {
	if(head==tail) {
		head=tail=null;
	}
	else {
		ListNode temp=tail;
		tail=tail.previous;
		tail.next=null;
		temp.previous=null;
	}
}
//..........................................................DELETE AT ANY POSITION...............................................
public void deletePos(int pos) {
	if(pos==1) {
		head=head.next;
		head.previous=null;
	}
	else {
		int count=1;
		ListNode temp=head;
		ListNode prev=head;
		while(count<pos) {
			count++;
			prev=temp;
			temp=temp.next;		
			}
		if(temp.next!=null) {
		prev.next=temp.next.previous;
		temp.next.previous=prev.next;
		}
		else
			tail=tail.previous;
		tail.next=null;
	}
}
//..........................................................FORWARD DISPLAY...............................................
   public void fwDisplay() {
	   ListNode current=head;
	   System.out.print("Null-->");
	   while(current!=null) {
		   System.out.print(current.data+"-->");
		   current=current.next;
	   }
	   System.out.println("Null");
   }
 //..........................................................BACKWARD DISPLAY...............................................
   public void bwDisplay() {
	   ListNode current=tail;
	   System.out.print("Null<--");
	   while(current!=null) {
		   System.out.print(current.data+"<--");
		   current=current.previous;
	   }
	   System.out.println("Null");
   }
   public static void main(String[] args) {
	   DoublyLinkedList dll=new DoublyLinkedList();
	   //dll.head=new ListNode(1);
	  // dll.tail=dll.head;
//	   ListNode second=new ListNode(4);
//	   ListNode third=new ListNode(6);
//	   ListNode fourth=new ListNode(8);
//	   ListNode fifth=new ListNode(10);
//	   dll.head.next=second;
//	   second.next=third;
//	   third.next=fourth;
//	   fourth.next=fifth;
//	   
//	   dll.tail=fifth;
//	   fifth.previous=fourth;
//	   fourth.previous=third;
//	   third.previous=second;
//	   second.previous=dll.head;
//	  // dll.tail=dll.head;



	  //dll.createDLL(); 
	   dll.insertBeg(2);
	   dll.insertBeg(4);
//	   dll.insertBeg(6);
//	   dll.insertBeg(7);
//	   dll.insertBeg(9);
   
//	   dll.insertEnd(8);
//	   dll.insertEnd(18);
//	   dll.insertEnd(58);
//	   dll.insertEnd(88);
	  //dll.insertPos(5, 1);
	   dll.deletePos(2);
	  
       //dll.deleteFirst();
	   //dll.deleteEnd();
	   
	   dll.fwDisplay();
	   dll.bwDisplay();
	   
   }
  
}
