package Question3And4;

public class MainClass {
	
    public static void main(String[] args) {
        Storage st = new Storage();
        Counter c = new Counter(st);
        Printer p = new Printer(st);
        
        Thread t1 = new Thread(c,"Counter");  //start the counter
        Thread t2 = new Thread(p,"Printer");  //start the printer
        
//        t1.setPriority(1);
//        t2.setPriority(10);
       
        t1.start();
        t2.start();
        
  }
}