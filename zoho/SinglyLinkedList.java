package zoho;

public class SinglyLinkedList {
	Node head;
	class Node
	{
		Node next;
		int data;
		Node(int num) 
		{
			data =  num;
		}	
	}
	public void SinglyLinkedList()
	{
		head=null;
	}
	public void InsertData(int i) 
	{
		Node a = new Node(i);
		if(head==null) 
		{
			head = a;
			a.next=null;
		}
		else 
		{
			a.next=head;
			head = a;
		}
	}
	public void display() 
	{
		Node temp = head;
		while(temp!=null) 
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.InsertData(5);
		sll.InsertData(6);
		sll.display();
	}
		
	
}
