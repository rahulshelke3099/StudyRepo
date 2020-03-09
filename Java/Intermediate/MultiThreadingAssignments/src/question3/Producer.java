package question3;
import java.util.Random;


public class Producer implements Runnable{
	FruitsMarket fr;
	public Producer(FruitsMarket fr){
		this.fr=fr;
	}
	@Override
	public void run() {
		
		Random r = new Random();
		for(int i =0;i<3;i++){
		synchronized(fr){
			fr.setApple(r.nextInt(10));
			fr.setGrape(r.nextInt(10));
			fr.setOrange(r.nextInt(10));
			fr.setWatermelon(r.nextInt(10));
			
			fr.notify();
			try {
				fr.wait(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
	

}
