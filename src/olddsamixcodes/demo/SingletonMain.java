package olddsamixcodes.demo;

class SingletonImpl {

	private static SingletonImpl singleton_instance=null;
	
	public String s;
	
	private SingletonImpl()
	{
		s="Singleton Impl";
	}
	
	public static SingletonImpl getInstance()
	{
		if(singleton_instance==null)
		{
			singleton_instance=new SingletonImpl();
		}
		return singleton_instance;
	}
}

public class SingletonMain {

	public static void main(String[] args) {
		SingletonImpl x = SingletonImpl.getInstance();
		SingletonImpl y = SingletonImpl.getInstance();
		SingletonImpl z = SingletonImpl.getInstance();

		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());

		if (x == y && y == z) {
			System.out.println("Same Hashcode");
		} else {
			System.out.println("Not Same Hashcode");
		}

	}

}
