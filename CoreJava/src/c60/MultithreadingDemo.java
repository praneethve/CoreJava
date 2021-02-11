package c60;

class MultithreadingDemo extends Thread{  
	  public void run(){  
	    System.out.println("thread is in running state.");  
	  }   
	  public static void main(String args[]){  
	     MultithreadingDemo obj=new MultithreadingDemo();   
	     obj.start();  
	  }  
	}
