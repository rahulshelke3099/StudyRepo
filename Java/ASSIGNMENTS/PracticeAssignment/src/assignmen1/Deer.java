package assignmen1;

public class Deer {
	public Deer() {
		System.out.println("Deer");
	}

	public Deer(int age) {
		System.out.println("DeerAge");
	}

	private boolean hasHorns() {
		System.out.println("deer hasHorns");
		return false;
	}

	public static void main(String[] args) {
		Deer deer = new Reindeer(5);
		System.out.println("," + deer.hasHorns());
		System.out.println("Deer complete");
//		Reindeer r = new Reindeer(6);
//		System.out.println("," + r.hasHorns());
//		System.out.println("ReinDeer complete");
//		deer = r;
//		System.out.println(deer.hasHorns());
//		System.out.println("usage complete");
		
	}
}

class Reindeer extends Deer {
	public Reindeer(int age) {
		System.out.println("in reindeer int age");
		System.out.println("Reindeer");
	}

	private boolean hasHorns() {
		System.out.println("reindeer hasHorns");
		return true;
	}
}