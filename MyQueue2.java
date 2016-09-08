import java.util.Stack;

public class MyQueue2<T> {
	
	//we need enqueue and dequeue
	//enqueue: always push value to the new stack
	//dequeue: pop from the old stack, if old stack is empty, push all the elements from new,then pop 
	
	Stack<T> n,o;
	
	public MyQueue2(){
		n=new Stack<T>();
		o=new Stack<T>();
	}
	
	public void enqueue(T x){
		n.push(x);
		
	}
	
	public T dequeue(){
		
		if(o.isEmpty()){
			while(!n.isEmpty()){
				o.push(n.pop());
			}
		}
		if(o.isEmpty()) return null;
		T x=o.pop();
		return x;
	}
	
	

}
