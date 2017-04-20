package singleton;



public class Singleton_Static_Inner
{
	private static final Singleton_Static_Inner singleton = null;
	
	
	// 限制产生多个对象
	private Singleton_Static_Inner()
	{
	}

	
	// 通过该方法获得实例对象
	public static Singleton_Static_Inner getSingleton()
	{
		return SingletonHolder.singleton;
	}

	
	//静态内部类
	private static class SingletonHolder
	{
		private static final Singleton_Static_Inner singleton = new Singleton_Static_Inner();
	}
	
	
	
}
