import java.util.Stack;

//public class stack {
//       private ListNode top;
//       private int length;
//       public static class ListNode {
//           private ListNode next;
//           private int data;
//       public ListNode(int data) {
//            	this.data=data;
//            	this.next=null;
//       }
//       }
//       public stack() {
//    	   top=null;
//    	   length=0;
//       }
//       public int length() {
//    	   return length;
//       }
//       public boolean isEmpty() {
//    	   return length==0;
//       }
//public void push(int data) {
//	ListNode newnode=new ListNode(data);
//	newnode.next=top;
//	top=newnode;
//	length++;
//}
//public void pop() {
//	if(top==null) {
//		System.out.println("empty stack");
//	}
//	else {
//		System.out.println("the deleted stack node is"+top.data);
//		top=top.next;
//		length--;
//	}
//}
//public void peek() {
//	if(top==null) {
//		System.out.println("empty stack");
//	}
//	else
//	System.out.println(top.data);
//}
//public void display() {
//	ListNode current=top;
//	while(current!=null) {
//		System.out.print(current.data+"-->");
//		current=current.next;
//	}
//	System.out.println("null");
//}
//public static void main(String[] args) {
//	stack st=new stack();
//	st.push(2);
//	st.push(4);
//	st.push(6);
//	st.display();
//	st.pop();
//	st.display();
//	st.peek();
//}
//}
//.............................................
//............................................ STACK USING ARRAY.............
//public class stack {
//    static final int MAX = 1000;
//    int top;
//    int a[] = new int[MAX]; // Maximum size of Stack
// 
//    boolean isEmpty()
//    {
//        return (top < 0);
//    }
//    stack()
//    {
//        top = -1;
//    }
// 
//    void push(int x)
//    {
//        if (top >= (MAX - 1)) {
//            System.out.println("Stack Overflow");
////            return false;
//        }
//        else {
//            a[++top] = x;
//            System.out.println(x + " pushed into stack");
////            return true;
//        }
//    }
// 
//    int pop()
//    {
//        if (top < 0) {
//            System.out.println("Stack Underflow");
//            return 0;
//        }
//        else {
//            int x = a[top--];
//            return x;
//        }
//    }
// 
//    int peek()
//    {
//        if (top < 0) {
//            System.out.println("Stack Underflow");
//            return 0;
//        }
//        else {
//            int x = a[top];
//            return x;
//        }
//    }
//    
//    void display(){
//    for(int i = top;i>-1;i--){
//      System.out.print(" "+ a[i]);
//    }
//  }
//
// 
//// Driver code
////class Main {
//    public static void main(String args[])
//    {
//        stack s = new stack();
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        s.push(40);
//
//        System.out.println(s.pop() + " Popped from stack");
//        System.out.println("Top element is :" + s.peek());
//        System.out.print("Elements present in stack :");
//        s.display();
//    }
//}
//................................................TOWER OF HANOI..............
//class stack
//{
//    // Java recursive function to solve tower of hanoi puzzle
//    static void towerOfHanoi(int n, char from_rod, char aux_rod, char to_rod)
//    {
//        if (n == 1)
//        {
//            System.out.println("Move disk 1a from rod " +  from_rod + " to rod " + to_rod);
//            return;
//        }
//        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
//        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
//        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
//    }
//      
//    //  Driver method
//    public static void main(String args[])
//    {
//        int n = 4; // Number of disks
//        towerOfHanoi(n, 'A', 'B', 'C');  // A, B and C are names of rods
//    }
//}
//......................................................REVERSE A STRING USING STACK........................
public class stack{
	
public  String reverse(String str) {
Stack<Character> stack=new Stack<>();
char[] chars=str.toCharArray();
for(char c:chars) {
	stack.push(c);
}
for(int i=0;i<str.length();i++) {
	chars[i]=stack.pop();
}
return new String(chars);
}
public static void main(String args[]) {
	stack rev=new stack();
	String str=rev.reverse("ABCDE");
	System.out.println(str);
}
}
