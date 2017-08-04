//producer produces the data and  notifies by calling notify method to the consumer 
//consumer consumes the data and so that producer notify the data 
//if we use multiple threads there we use synchronize method .

package assignment15;//created package assignment15


  public class ProcessData{ //created a simple class as ProcessData
	  int  number;             //creating a variable 
	synchronized  void put (int number ) {   //created a synchronized method called put where  producer can get some data 
		
		this.number = number;  //used by the producer 
		  System.out.println("put the data : "+number); //producer puts the data 
		
		  notify();//producer notify the data and wait method is called otherwise  it will be lose the running process
		 try{
		  wait(); //here to notify the producer wait method is called 
		 } catch(InterruptedException ex){  //and to handle the exception which occurs in wait method
			
		 }
		  
	  }//when ever we use a synchronization we use the notify method and for sharing the same object using multiple threads we use sync.
	  
	synchronized  void get(){               //used by the consumer
		  System.out.println("get the data : "+number);
		 
		  notify();//if we don't call the notify method it never come inside and it will be in wait
		  try {
			wait(); //here to some data by the producer will the consumer will be in wait method which is waiting
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
		  
		  
	  }
  }












