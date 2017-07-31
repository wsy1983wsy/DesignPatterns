# 工厂方法分类
[代码地址：](https://github.com/18Gray/DesignPatterns/blob/master/src/simpleFactory/SimpleFactoryMain.java)

![类图：](https://github.com/18Gray/DesignPatterns/blob/master/img/Singleton_Lazy_SynMethod.jpg)
优点：内存只有一个实例，减少内存开销。
缺点：没有接口，不能扩展；与单一职责冲突，一个类只实现一个逻辑，单例模式把要单例和业务逻辑融合在一个类了。
适用场景：
（1）要求生成唯一序列号。
（2）项目需要一个共享访问点或共享数据，如全局计数器。
（3）创建一个对象需要消耗资源过多。

# 单例模式应用



