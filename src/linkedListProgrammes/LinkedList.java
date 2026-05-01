package linkedListProgrammes;

public class LinkedList {
	private int nodeCount;
	private Node head;

	private class Node{
		private int data;
		private Node next;

		public Node(int data) {
			this.data=data;
			this.next=null;
		}

		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}


		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}


	}

	public LinkedList() {
		 head=null;
		 nodeCount=0;

	}
	
	public void insert(int data) {
		
		Node tmp=new Node(data);
		nodeCount++;
		if(head==null) {
			head=tmp;
		}else {
			tmp.setNext(head);
			head=tmp;
		}
		
	}	
	
	public void append(int data) {

		Node tmp=new Node(data);
		Node newNode=head;

		if(head==null) {
			head=tmp;
		}else {
			while(newNode.getNext()!=null) {
				newNode=newNode.getNext();		
			}
			newNode.setNext(tmp);
		}
		nodeCount++;
	}
	
	public void delete(int data) {
		Node tmp=head;
		Node prev=null;
		if(head==null) {
			System.out.println("Linked List is empty!");
		}else if(head.getData()==data){
			if(head.getNext()==null) {
				head=null;
			}else {
			head=head.getNext();
			tmp.setNext(null);
			}
		}else{
			while(tmp.getNext()!=null) {
				if(tmp.getData()==data) {
					
					break;
				}
				prev=tmp;
				tmp=tmp.getNext();
				}
			prev.setNext(tmp.getNext());
			tmp.setNext(null);
			
		}
		nodeCount--;
		
	}
	
	public void insertByPos(int data,int pos) {
		Node tmp=new Node(data);
		Node it=head;
		if( pos==1) {
			insert(data);			
		}else if(pos==nodeCount+1){
			append(data);
		}else{
		int count=1;
		while(count < pos) {
			it=it.getNext();
			count++;
		}
		tmp.setNext(it.getNext());
		it.setNext(tmp);
		nodeCount++;
		}
	}
	
	public String toString() {
		String string="";
		Node tmp=head;
		while(tmp!=null) {
			string=string+ "--> "+tmp.getData();
			System.out.println(tmp.getData());

			tmp = tmp.getNext();

		}
		string+=" || Node Count ="+nodeCount;
		return string;
	}
}
