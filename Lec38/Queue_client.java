package Lec38;

public class Queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue qq=new Queue();
		qq.Enqueue(50);
		qq.Enqueue(30);
		qq.Enqueue(20);
		qq.display();
		qq.Dequeue();
		qq.display();
		qq.Enqueue(30);
		qq.Enqueue(310);
		qq.Enqueue(320);
		qq.display();
		qq.Dequeue();
		qq.Dequeue();
		qq.display();
	}

}
