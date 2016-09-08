import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MyQueue2<Integer> q=new MyQueue2<>();
		q.enqueue(3);
		System.out.println(q.dequeue());
		q.enqueue(5);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		

	}

}
