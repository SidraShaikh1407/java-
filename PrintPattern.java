//AIM:Write a program to print (/*/*/*/*/) using two child thread.
//Name:Sidra Shaikh
//Roll no:40
//UIN:231P064
//DIV:A*/
package skll_oop_B3_odd;

public class PrintPattern {
	private static final Object lock = new Object();
	private static volatile boolean isStarTurn = true;

	public static void main(String[] args) {
		Thread starThread = new Thread(new PrintStar());
		Thread slashThread = new Thread(new PrintSlash());
		starThread.start();
		slashThread.start();
		try {
			starThread.join();
			slashThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static class PrintStar implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				synchronized (lock) {
					while (!isStarTurn) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.print("*");
					isStarTurn = false;
					lock.notifyAll();
				}
			}
		}
	}

	static class PrintSlash implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				synchronized (lock) {
					while (isStarTurn) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.print("/");
					isStarTurn = true;
					lock.notifyAll();
				}
			}
		}
	}
}
