
import java.util.*;
public class test
{
	public static void main(String args[])
	{
		 queue queue = new queue(1000); 
         
	        queue.enqueue(10); 
	        queue.enqueue(20); 
	        queue.enqueue(30); 
	        queue.enqueue(40); 
	        
	 
	      System.out.println(queue.deque());
	        System.out.println(queue.head()); 
	           
	        System.out.println(queue.tail()); 
	    } 
	
}

class queue
{
	int arr[];
	int head;
	int tail;
	int capacity;
	int count;
	queue(int size)
	{
	arr=new int[size];
	head=0;
	tail=-1;
	capacity=size;
	count=0;
	}
 int size()
	{
		return count;
	}
 boolean isEmpty()
 {
	 return(size()==0);
 }
 boolean isFull()
 {
	 return(size()==capacity);
 }
  void enqueue(int data)
  {
	  if(isFull())
	  {
		  System.out.print("Queue Overflow");
	  }
	 tail=(tail+1)%capacity;
	 arr[tail]=data;
	 count++;
System.out.println(data);
  }
  int deque()
  {
	  if(isEmpty())
	  {
		  System.out.print("Empty queue");
	  }
	  int item = arr[head]; 
        head = (head + 1)%capacity; 
        count =count - 1; 
        return item; 
  }
int head()
{
return arr[head];
}
int tail()
{
return arr[tail];
}
}