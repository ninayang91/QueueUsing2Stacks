import java.util.Stack;

public class MyQueue {
	
	Stack<Integer> s1, s2;
	
	public MyQueue(){
		s1=new Stack<>();
		s2=new Stack<>();
	}
	
	public void enqueue(int x){
		s1.push(x);
	}
	
	public int dequeue(){
		int x=-1;
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		if(!s2.isEmpty()){
		   x=(int)s2.pop();
		}
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		return x;
	}
	
	

}
