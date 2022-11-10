package lec42;

public class Linked_list {
	
	public class Node{
		 int data;
		 Node next;
		 
		 public Node(int item) {
			// TODO Auto-generated constructor stub
			 this.data=item;
		}
		 
	}
		 private Node head;
		 private int size;
		 private Node tail;
		 
		 public void addfirst(int item) {
			 Node nn=new Node(item);
			 if(size==0) {
				 this.head=nn;
				 this.tail=nn;
				 this.size++;
			 }
			 else{
				 nn.next=this.head;
				 this.head=nn;
				 this.size++;
			 }
			 
		 }
		 
		 public void addlast(int item) {
			
			 if(size==0) {
				addfirst(item);
			 }
			 else{
				 Node nn=new Node(item);
				 this.tail.next=nn;
				 this.tail=nn;
				 this.size++;
			 }
			 
		 }
		 
		 public void addatindex(int item, int k) throws Exception {
			
			 if(k<0 || k>=this.size) {
				 throw new Exception("Pagal hai kya size toh dekh le");
			 }
			 
			 if(k==0) {
				 addfirst(item);
			 }else {
			 Node nn=new Node(item);
			 Node temp=getadd(k-1);
			// Node temp1=getadd(k);
			 nn.next=temp.next;
			 temp.next=nn;
			 this.size++;
			 }
		 }
		 
		 
		 public int getfirst() throws Exception {
			 if(head==null) {
				 throw new Exception("Pagal hai kya linked list khali hai ");
			 }
			 return this.head.data;
		 }
		 
		 public int getlast() throws Exception {
			 if(head==null) {
				 throw new Exception("Pagal hai kya linked list khali hai ");
			 }
			 return this.tail.data;
		 }
		 
		 public int getatindex(int k) throws Exception {
			 
			 return getadd(k).data;
		 }
		 
		 private Node getadd(int k) throws Exception {
			 if(k<0 || k>=this.size) {
				 throw new Exception("Pagal hai kya size toh dekh");
			 }
			 Node ans=this.head;
			 if(k==0) { 
				 return ans;
			 }
			 while(k!=0) {
				 ans=ans.next;
				 k--;
			 }
			 return ans;
		 }
		 
		 public int removeFirst() throws Exception {
			 if(head==null) {
				 throw new Exception("Pagal hai kya khali hai linked list");
			 }
			 Node k=this.head;
			 this.head=this.head.next;
			 k.next=null;
			 this.size--;
			 return k.data;
		 }
		 
		 public int removeLast() throws Exception {
			 if(head==null) {
				 throw new Exception("Pagal hai kya khali hai linked list");
			 }
			 if(this.size==1) {
				 return removeFirst();
			 }
			 Node k=getadd(size-2);
			 int rd=this.tail.data;
			 this.tail=k;
			 this.tail.next=null;
			 return rd;
		 }
		 
		 public int removeatIndex(int k) throws Exception {
			 if(k==0) {
				return removeFirst();
			 }
			 else {
			 Node temp=getadd(k-1);
			 Node temp1=getadd(k);
			 int rd=temp.next.data;
			 temp.next=temp1.next;
			 temp1.next=null;
			 this.size--;
			 return rd ;
			 }
			 
			 
		 }
		 public int size() {
			 return this.size;
		 }
		 
		 public void display() { 
			
			 Node temp=this.head;
			 while(temp!=null) {
				 
				 System.out.print(temp.data+"-->");
				 temp=temp.next;
			 }
			 System.out.println(".");
		 }
	
}
