# DesignPatterns
DesignPatterns以简洁之名，用最短的时间重温似曾相识的设计模式。它涵盖了23种设计模式的图文说明和相关代码，及其变种模式。另外，就设计模式的六大原则研究了各种设计模式之间的异同。
每种模式的说明过程是：场景问题（实际应用问题，通常解决方案，出现的问题），解决方案（模式的UML图和说明，使用某个模式来解决的实现代码），模式讲解（模式的通用代码与说明，模式优缺点及使用场景，模式的拓展形式）。

## 创建型模式
1. [单例模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/CreateDesign/Singleton.md)
2. [工厂方法](https://github.com/18Gray/DesignPatterns/blob/master/doc/CreateDesign/FactoryMethod.md)
3. [抽象工厂模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/CreateDesign/AbstractFactory.md)
4. [建造者模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/CreateDesign/FactoryMethod.md)
5. [原型模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/CreateDesign/Prototype.md)

## 行为模式
1. [策略模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/ActionDesign/Strategy.md)
2. [观察者模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/ActionDesign/Observer.md)
3. [状态模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/ActionDesign/State.md)
4. [模板方法](https://github.com/18Gray/DesignPatterns/blob/master/doc/ActionDesign/TemplateMethod.md)
5. [职责链模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/ActionDesign/ResponsibilityChain.md) 
6. [解释器模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/ActionDesign/Interpreter.md) 
7. [命令模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/ActionDesign/Command.md) 
8. [备忘录模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/ActionDesign/Memento.md) 
9. [迭代器模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/ActionDesign/Iterator.md) 
10. [访问者模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/ActionDesign/Visitor.md) 
11. [中介模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/ActionDesign/Mediation.md) 


## 结构型模式
1. [门面方法](https://github.com/18Gray/DesignPatterns/blob/master/doc/StructureDesign/FacadeMethod.md)
2. [适配器模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/StructureDesign/Adapter.md)
3. [装饰者模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/StructureDesign/Decorator.md)
4. [组合模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/StructureDesign/Combination.md)
5. [代理模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/StructureDesign/Proxy.md) 
6. [桥接模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/StructureDesign/Bridge.md)
7. [享元模式](https://github.com/18Gray/DesignPatterns/blob/master/doc/StructureDesign/Enjoyment.md) 




### 模式总结
1.工厂系列方法和外观模式
相同点：都是client可以直接调用工厂类和外观类，具体的实现交给他们去做。
不通电：工厂类实现是new来生成实现类，外观类是要把不同的类对象做处理。



