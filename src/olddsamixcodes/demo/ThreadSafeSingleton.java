package olddsamixcodes.demo;

public class ThreadSafeSingleton {

	private static volatile ThreadSafeSingleton instance;

	private static Object obj = new Object();

	private ThreadSafeSingleton() {

	}

	public static ThreadSafeSingleton getInstance() {
		ThreadSafeSingleton result = instance;
		if (result == null) {
			synchronized (obj) {
				result = instance;
				if (result == null) {
					instance = result = new ThreadSafeSingleton();
				}
			}
		}
		return result;

	}

	public static void main(String[] args) {
		ThreadSafeSingleton t1 = new ThreadSafeSingleton().getInstance();
		ThreadSafeSingleton t2 = new ThreadSafeSingleton().getInstance();
		ThreadSafeSingleton t3 = new ThreadSafeSingleton().getInstance();

		if (t1.hashCode() == t2.hashCode() && t1.hashCode() == t3.hashCode()) {
			System.out.println("Singleton Implemented with thread!");
		}

	}

}
