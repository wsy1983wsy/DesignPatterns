# 单例模式分类
单例模式分为五种，懒汉模式、双重判断的懒汉模式、饿汉模式、Static内部类模式、Enum模式。

1. 懒汉模式
[代码地址：](https://github.com/18Gray/DesignPatterns/blob/master/src/singleton/Singleton_Lazy_SynMethod.java)

![类图：](https://github.com/18Gray/DesignPatterns/blob/master/img/Singleton_Lazy_SynMethod.jpg)
优点：内存只有一个实例，减少内存开销。
缺点：没有接口，不能扩展；与单一职责冲突，一个类只实现一个逻辑，单例模式把要单例和业务逻辑融合在一个类了。
适用场景：
（1）要求生成唯一序列号。
（2）项目需要一个共享访问点或共享数据，如全局计数器。
（3）创建一个对象需要消耗资源过多。



2. 双重判断的懒汉模式
[代码地址：](https://github.com/18Gray/DesignPatterns/blob/master/src/singleton/Singleton_Lazy_SynClass.java)

![类图：](https://github.com/18Gray/DesignPatterns/blob/master/img/Singleton_Lazy_SynMethod.jpg)




3. 饿汉模式
[代码地址：](https://github.com/18Gray/DesignPatterns/blob/master/src/singleton/Singleton_Badmash.java)

![类图：](https://github.com/18Gray/DesignPatterns/blob/master/img/Singleton_Lazy_SynMethod.jpg)





4. Static内部类模式
[代码地址：](https://github.com/18Gray/DesignPatterns/blob/master/src/singleton/Singleton_Static_Inner.java)

![类图：](https://github.com/18Gray/DesignPatterns/blob/master/img/Singleton_Lazy_SynMethod.jpg)






5. Enum模式
[代码地址：](https://github.com/18Gray/DesignPatterns/blob/master/src/singleton/SingletonEnum.java)

![类图：](https://github.com/18Gray/DesignPatterns/blob/master/img/Singleton_Lazy_SynMethod.jpg)




# 单例模式应用
1. Context、LayoutInflater、XXXManager中的单例模式



