package singleton;



/**
 * 懒汉模式，双重判断
 * 优点：只在使用时初始化，节约资源
 * 缺点：第一次加载稍慢，由于内存模型的原因偶尔失败。
 */
public class Singleton_Lazy_SynClass
{
	private static Singleton_Lazy_SynClass singleton = null;
	
	
	// 限制产生多个对象
	private Singleton_Lazy_SynClass()
	{

	}

	
	// 通过该方法获得实例对象，第一次判空为了避免不必要的同步，第二次判空为了创建实例。
	public static Singleton_Lazy_SynClass getSingleton()
	{
		if(singleton == null)
		{
			synchronized (Singleton_Lazy_SynMethod.class)
			{
				if(singleton == null)
				{
					singleton = new Singleton_Lazy_SynClass();
				}
			}
		}
		
		return singleton;
	}


	
	// 类中其他方法，尽量是static
	public static void doSomething()
	{

	}
	
	
}
