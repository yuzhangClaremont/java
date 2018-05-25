package first_java_project;
import java.util.*;


public class LinkedList {
	private ListNode myHead;
	private int mySize;
	
	// List constructor
	public LinkedList() {
		myHead = null;
		mySize = 0;
	}
	private class ListNode{
		private String myData;
		private ListNode myNext;
		
		// new born constructor
		private ListNode(String data, ListNode next) {
			myData = data;
			myNext = next;
		}
		
		//inheirate constructor
		private ListNode(String data) {
			this(data,null); // use this to construct
		}
	}
	
	public void addToEndhelp(String data, ListNode curNode) {
		ListNode newNode = new ListNode(data);
		if (curNode == null) {
			curNode = newNode;
			System.out.println(this.myHead.myData);
			
		}
		else {
			addToEndhelp(data, curNode.myNext);
		}
	}
	
	public void addToEnd(String data) {
		addToEndhelp(data, this.myHead);
		mySize++;
	}
	
	public void addToFront(String data) {
		ListNode newNode =  new ListNode(data);
		newNode.myNext = myHead;
		myHead = newNode;
		mySize++;
	}
	// to print listNodes
	public String toString() {
		String res = "(";
		for (ListNode iter = myHead; iter != null; iter = iter.myNext) {
			res += (iter.myData +")-(");
		}
		res +=")";
		return res;
	}
	
	public static void main(String[] args) {
		LinkedList mylist = new LinkedList();
		mylist.addToFront("tail");
		System.out.println(mylist.mySize);
		mylist.addToFront("body");
		mylist.addToFront("body");
		mylist.addToFront("head");
		System.out.println(mylist.mySize);
		
		System.out.println(mylist.toString());
		
		Stack<String> s = new Stack<String>();
		s.push("1");
		s.push("2");
		s.pop();
		System.out.println(s);
		
		Queue<String> q = new PriorityQueue<String>();
		q.add("1");
		q.add("2");
		q.remove();
		System.out.println(q);
		
		
		

		
	}
}
