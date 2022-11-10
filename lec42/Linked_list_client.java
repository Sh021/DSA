package lec42;

public class Linked_list_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linked_list ll=new Linked_list();
		//System.out.println(ll.getfirst());
		ll.addfirst(10);
		ll.addlast(50);
		ll.addfirst(20);
		ll.addlast(5);
		ll.display();
//		System.out.println(ll.getfirst());
//		System.out.println(ll.getlast());
//		System.out.println(ll.getatindex(2));
//		System.out.println(ll.removeFirst());
		//ll.display();
	//	System.out.println(ll.removeLast());
		//ll.display();
//		System.out.println(ll.removeatIndex(1));
//		ll.display();
//		System.out.println(ll.size());
		ll.addatindex(500, 0);
		ll.display();
	}

}
