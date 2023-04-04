public class Linked_ListQs
{
	static class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}

	Node head;
	Node tail;
	int size;
	void insertAtHead(int val)
	{
		Node newNode = new Node(val);

		if(head==null)
		{
			head = tail = newNode;
			size++;
			return;
		}
		newNode.next = head;
		head = newNode;
		size++;
		return;
	}

	void insertAtTail(int val)
	{
		Node newNode = new Node(val);
		if(head==null)
		{
			insertAtHead(val);
			return;
		}

		tail.next = newNode;
		tail = newNode;
		size++;
	}
	void intersection(Node head1, Node head2, int pos)
	{
		Node temp = head1;
		Node temp2 = head2;
		int count = 0;
		while(temp!=null && count!=pos)
		{
			temp = temp.next;
			count++;
		}
		while(temp2.next!=null)
		{
			temp2 = temp2.next;
		}
		temp2.next = temp;
	}

	int lengthll(Node head)
	{
		int len = 0;
		while(head!=null)
		{
			head = head.next;
			len++;
		}
		return len;
	}
	int intersectPoint(Node head1, Node head2)
	{
		int m = lengthll(head1);
		int n = lengthll(head2);
		Node ptr1;
		Node ptr2;
		int point;
		if(m>n)
		{
			ptr1 = head1;
			ptr2 = head2;
			point = m-n;
		}
		else
		{
			ptr1 = head2;
			ptr2 = head1;
			point= n-m;
		}

		while(point>0)
		{
			if(ptr1==null)
				return -1;
			ptr1 = ptr1.next;
			point--;
		}

		while(ptr1.next!=null && ptr2.next!=null)
		{
			if(ptr1==ptr2)
			{
				return ptr1.data;
			}
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		return -1;
	}

	void printLL(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+"->");
			head = head.next;
		}
		System.out.println("NULL");
	}

	void dltNnodeAfterMnodes(Node head,int M,int N)
	{
		Node temp1 = head;
		Node temp2 = head;

		while(temp2.next!=null && temp1.next!=null)
		{
			int m = M;
			while(temp1.next!=null && m>=0)
			{
				if(m==0){
					int n = N;
					temp2 = temp1;
					while(temp2.next!=null && n>=0)
					{
						temp2 = temp2.next;
						n--;
					}
					temp1.next = temp2;
				}
				if(m!=1)
					temp1 = temp1.next;
				m--;
			}
		}
	}
	public static void main(String args[])
	{
		Linked_ListQs obj = new Linked_ListQs();
		// Linked_ListQs obj2 = new Linked_ListQs();

		obj.insertAtHead(3);
		obj.insertAtHead(2);
		obj.insertAtHead(1);
		obj.insertAtTail(4);
		obj.insertAtTail(5);		
		obj.insertAtTail(6);
		obj.insertAtTail(7);
		obj.insertAtTail(8);
		obj.printLL(obj.head);

		obj.dltNnodeAfterMnodes(obj.head,2,2);
		obj.printLL(obj.head);

		obj2.insertAtTail(4);
		// obj2.insertAtTail(5);

		obj2.printLL(obj2.head);
		obj.intersection(obj.head,obj2.head,3);
		// obj2.printLL(obj2.head);
		// System.out.println(obj.intersectPoint(obj.head,obj2.head));

	}
}