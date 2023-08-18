
//public class SinglyLinkedList {
//
//}package llist;
//
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
//--------------------------------------------------------CREATE SLL----------------------------------------------
	public void createSLL() {
		head=new ListNode(1);
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(10);
		ListNode fourth=new ListNode(11);
		ListNode fifth=new ListNode(12);

        head.next=second;
        second.next=third;
        third.next=fourth;
       fourth.next=fifth;

	}
//--------------------------------------------------------INSERT AT STARTING OF A SLL------------------------
	public void insertfirst(int value)
	{
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;    
	}
	
//----------------------------------------------------------------------INSERT AT END OF A SLL-------------------------------------	
	public void insertEnd(int value) {
		ListNode newNode=new ListNode(value);
		if(head==null) {

			head=newNode;
			//return;
		}
		else {
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
		}
	}
	
//-------------------------------------------------------------------INSERTING AT A GIVEN POS IN SLL--------------	
        public void insertpos(int position,int data) {
        	     ListNode newNode=new ListNode(data);
        	     if(position==1) {
        	    	 newNode.next=head;
        	    	 head=newNode;
        	     }
        	     else {
        	    	 ListNode previous=head;
        	    	 ListNode current=head;
        	    	 int count=1;
        	    	 while(count<position) {
        	    		 previous=current;
        	    		 current=current.next;
        	    		 count++;
        	    	 }
//        	    	 ListNode current=previous.next;
        	    	 previous.next=newNode;
        	    	 newNode.next=current;
        	    	 }
        } 
//--------------------------------------------------------------DISPLAY SLL-------------------------------------	
	public void Display() {
		ListNode current=head;
		int count=0;
		while(current!=null) {
			count++;
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
		System.out.print("the no of nodes is "+count);

	}
	
	
	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
//        Scanner sc =new Scanner(System.in);
//        System.out.println("0.createSLL 1.insertbeg 2.insertEnd 3.insertpos4.exit");
//        int s=sc.nextInt();
//        switch(s) {
//        case 0:
//        	sll.createSLL();
//        case 1:
//            System.out.println("Enter element to insert");
//            int insert=sc.nextInt();
//    		sll.insertfirst(insert);
//    		sll.Display();
        //case 4:EXIT;
        //}
		sll.head=new ListNode(1);
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(10);
		ListNode fourth=new ListNode(1);
		ListNode fifth=new ListNode(12);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;
       fourth.next=fifth;

 //...............................................................................
//		SinglyLinkedList sl2=new SinglyLinkedList();
//		sll.head=new ListNode(2);
//		ListNode sec=new ListNode(6);
//		ListNode thi=new ListNode(7);
//		ListNode four=new ListNode(9);
//		ListNode fif=new ListNode(14);
//
//        sll.head.next=sec;
//        sec.next=thi;
//        thi.next=four;
//        four.next=fif;

//      //  Scanner sc =new Scanner(System.in);
        //String s=sc.next();
		//sll.createSLL();
		
        //sll.insertfirst(9);
        //sll.insertEnd(7);        
        //sll.insertpos(6,7);
       // sll.Display();

//------------------DELETIONS------------------------------
        //sll.deleteBeg();
//System.out.println("The deleted element is "+sll.deleteBeg().data);
        //sll.deleteEnd();
        //sll.DelPos(2);
        //sll.display();
//...................operations................................		
		//sll.search(12);
               //ListNode LLL= sll.ReverseSLL();      
               //sll.ResDisplay(LLL);
        //sll.midNode();
        //sll.lastNthNode(4);
               sll.Duplicate();
               sll.display();
                    //sll.insertSortSll(13);
                    //sll.display();
        //sll.deleteKey(1);
        //sll.display();
       //sll.findLoop();
        //sll.startingLoop();
        //sll.display();
        //sll.RemoveStartingLoop();
		//SinglyLinkedList merge=new SinglyLinkedList();
        //merge.head=mergeSortedLists(sll.head,sl2.head);
         //merge.display();
	
	}

                               //........................DELETIONS OF SLL............................................
	
//..................................................DELETE AT BEGINNING OF A SLL........................
 public void deleteBeg() {
	if(head==null) {
		//return null;
		System.out.println("SLL is empty List");
	}
	ListNode temp=head;
	head=head.next;
	temp.next=null;
	//return temp;
	System.out.println("The Deleted First node is "+temp.data);
}
 
 
//.................................................................DELETE AT END.......................
 public void deleteEnd() {          //LastNode--------->return
	 if(head==null) {
	 System.out.println("null");
	 }
	 else if(head.next==null) {
		// return head;
		 System.out.println("THe LAST Deleted element is "+head.data);               
		 head=null;

		 //System.out.println("SLL is empty List");
	 }
	 else {
	 ListNode current=head;
	 ListNode previous=null;
	 while(current.next!=null) {
		 previous=current;
		 current=current.next;
	 }

	 previous.next=null;
	 //return current;
	 System.out.println("THe LAST Deleted element is "+current.data);
	 }
 }
 
 
 //---------------------------------------------------DELETING NODE AT A PARTICULAR POSITION-------------
 public void DelPos(int pos) {
	 if(head==null) {
		 System.out.println("empty SLL");
	 }
	 else if(pos==1) {
		 head=head.next;	 
	 }
	 else {
		  ListNode current=head;
		  ListNode previous=head;
		  int count=1;
		  while(count<pos) {
			  previous=current;
			  current=current.next;
			  count++;
		  }
		  //current=previous.next;
		  previous.next=current.next;
		  System.out.println("the Deleted element is"+current.data);
		  
	 }
 }
 
 
//-----------------------------------------------------------DISPLAY()------------------------------------------------------ 
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

            //...............................OPERATIONS.............................
 
//............................................................SEARCH AN ELEMENT......................................
public void search(int search) {
	ListNode current=head;
	ListNode r=current;
	int index=0;
	while(current!=null) {
		 r=current;
		if(current.data==search) {
			
			System.out.printf("the  element %s found at position %d\n",search,index+1);
	        break;  
		}
		index++;
		// r=current;
        current=current.next;
	}
	if(r.data!=search)
	System.out.println("search element not found");
	}
//..................................................................REVERSE SLL..............................
public ListNode ReverseSLL() {
	ListNode current=head;
	ListNode previous=null;
	ListNode Next=null;
	while(current!=null) {
	    Next=current.next;
		current.next=previous;
		previous=current;
		current=Next;
	}
	return previous;	
}
public void RevDisplay(ListNode head) {
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
//..............................................................MIDDLE NODE............................
public void midNode() {
ListNode slowptr=head;
ListNode fastptr=head;
while(fastptr!=null && fastptr.next!=null) {
	slowptr=slowptr.next;
	fastptr=fastptr.next.next;
}
System.out.println("The middle node is"+slowptr.data);
}
//.............................................................LAST Nth NODE................................
public void lastNthNode(int n) {
	ListNode refptr=head;
	ListNode mainptr=head;
	int count=1;
	while(count<=n) {
		refptr=refptr.next;
		count++;
	}
	while(refptr!=null) {
		mainptr=mainptr.next;
		refptr=refptr.next;
	}
	System.out.println("last nth node is "+mainptr.data);
}
//...............................................................DUPLICATE ELEMENTS.................................
public void Duplicate() {
	ListNode current=head;
	while(current!=null && current.next!=null) {
		ListNode temp=current;
		while(temp.next!=null) {
		if(current.data==temp.next.data) {
			temp.next=temp.next.next;
			System.out.println("The Duplicate value is"+current.data);
		}
		else {
		temp=temp.next;
		}}
		current=current.next;
	}
}
//......................................................INSERTING NODE IN A SORTED SLL...................................
public void insertSortSll(int data) {
    ListNode newNode=new ListNode(data);	
	ListNode current=head;
	ListNode temp=head;
	while(current!=null && current.data<newNode.data) {
		temp=current;
		current=current.next;
	}
	newNode.next=current;
	temp.next=newNode;
}
//............................................................DELETE KEY.............................
public void deleteKey(int key) {
	ListNode current=head;
	ListNode temp=head;
	if(current!=null && current.data==key) {
		head=current.next;
	System.out.println("the deleted node is "+current.data);

	}
	else {
	while(current!=null && current.data!=key) {
		temp=current;
		current=current.next;
	}
	if(current!=null) 
	temp.next=current.next;
	System.out.println("the deleted node is"+current.data);
	}
}
//.......................................................FIND LOOP IN A SLL.................................
public void findLoop() {
	ListNode fastptr=head;
	ListNode slowptr=head;
	while(fastptr!=null && fastptr.next!=null) {
		slowptr=slowptr.next;
		fastptr=fastptr.next.next;
		if(slowptr==fastptr) {
			System.out.println("Loop Exists");
			break;
		}
	}
	if(fastptr.next==null)
		System.out.println("Loop doesnot exists");	
}
//..................................................FIND STARTING POINT OF A LOOP............................................
public void startingLoop() {
	ListNode fastptr=head;
	ListNode slowptr=head;
	while(fastptr!=null && fastptr.next!=null) {
		slowptr=slowptr.next;
		fastptr=fastptr.next.next;
		if(slowptr==fastptr) {
			ListNode aa=startLoopNode(slowptr);
			System.out.println("loop starts at "+aa.data);
			break;
		}
}
	if(fastptr.next==null) {
		System.out.println("loop does not exists");
	}
}
	public ListNode startLoopNode(ListNode slowptr) {
		   ListNode temp=head;
		   while(temp!=slowptr) {
			   temp=temp.next;
		       slowptr=slowptr.next;
	}
          return temp;
	}
//................................................................REMOVING LOOP IN SLL...........................
	public void RemoveStartingLoop() {
		ListNode fastptr=head;
		ListNode slowptr=head;
		while(fastptr!=null && fastptr.next!=null) {
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
			if(slowptr==fastptr) {
				ListNode aa=RemoveLoopExists(slowptr);
				System.out.println("the loop ends  ");
				break;
			}
	}
		if(fastptr.next==null) {
			System.out.println("loop does not exists");
		}
	}
		public ListNode RemoveLoopExists(ListNode slowptr) {
			   ListNode temp=head;
			   while(temp.next!=slowptr.next) {
				   temp=temp.next;
			       slowptr=slowptr.next;
		}
			   return slowptr.next=null;
		}
//..................................................................MERGE TWO SORTED LISTS.................		
		
	public static ListNode mergeSortedLists(ListNode a,ListNode b) {
		ListNode dummy=new ListNode( 0);
		ListNode tail=dummy;
		while(a!=null && b!=null) {
			if(a.data<=b.data) {
				tail.next=a;
				a=a.next;
			}
			else {
				tail.next=b;
				b=b.next;
			}
			tail=tail.next;
		}
		if(a==null)
		   tail.next=b;
		else
			tail.next=a;
		return dummy.next;
	}
	

}