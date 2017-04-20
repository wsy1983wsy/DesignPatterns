package singleton;



/**
 * 懒汉模式
 * 优点：只在使用时初始化，节约资源
 * 缺点：第一次加载时才初始化，反应稍慢；每次调用getInstance都进行同步，造成不必要开销。
 */
public class Singleton_Lazy_SynMethod
{
	private static Singleton_Lazy_SynMethod singleton = null;
	
	
	// 限制产生多个对象
	private Singleton_Lazy_SynMethod()
	{

	}

	
	// 通过该方法获得实例对象
	public static synchronized Singleton_Lazy_SynMethod getSingleton()
	{
		if(singleton == null)
		{
			singleton = new Singleton_Lazy_SynMethod();
		}
		return singleton;
	}


	
	// 类中其他方法，尽量是static
	public static void doSomething()
	{

	}
	
	
}
