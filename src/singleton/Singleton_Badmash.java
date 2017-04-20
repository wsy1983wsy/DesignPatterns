package singleton;


public class Singleton_Badmash
{
	private static final Singleton_Badmash singleton = new Singleton_Badmash();
	
	
	// 限制产生多个对象
	private Singleton_Badmash()
	{

	}

	
	// 通过该方法获得实例对象
	public static Singleton_Badmash getSingleton()
	{
		return singleton;
	}


	
	// 类中其他方法，尽量是static
	public static void doSomething()
	{

	}
	
	
}
