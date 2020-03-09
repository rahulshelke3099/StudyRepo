
public class Pop implements Runnable {
	Stack<?> s;
	public Pop(Stack<?> s){
		this.s=s;
		new Thread(this).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<3 ; i++){
		synchronized(s){
			System.out.println(s.list.remove(s.list.size()-1));
			try {
				s.wait(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			s.notify();
		}
		}
	}

}
