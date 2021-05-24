java设计模式:<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学习地址:https://www.runoob.com/design-pattern/factory-pattern.html<br/>
    设计模式的六大原则<br/>
    1、开闭原则（Open Close Principle）<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;开闭原则的意思是：对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。
    <br/>2、里氏代换原则（Liskov Substitution Principle）<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;里氏代换原则是面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。LSP 是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。
    <br/>3、依赖倒转原则（Dependence Inversion Principle）<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。
    <br/>4、接口隔离原则（Interface Segregation Principle）<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。
    <br/>5、迪米特法则，又称最少知道原则（Demeter Principle）<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;最少知道原则是指：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。
    <br/>6、合成复用原则（Composite Reuse Principle）<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合成复用原则是指：尽量使用合成/聚合的方式，而不是使用继承。
<br/>
<br/>
二十三种设计模式个人练习:<br/>
    主要看各个模式的*Main方法的运行事例.<br/>
    <br/>1.工厂模式:com.test.example.factory.FactoryMain 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;优点： 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、一个调用者想创建一个对象，只要知道其名称就可以了。 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3、屏蔽产品的具体实现，调用者只关心产品的接口。
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;缺点：每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
    <br/>2.单例模式:com.design.example.singleton.Singleton 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;优点：
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例（比如管理学院首页页面缓存）。
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、避免对资源的多重占用（比如写文件操作）。
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;缺点：没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。
    <br/>3.抽象工厂:com.design.example.abstractfactory.AbstractFactoryMain 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
    <br/>4.建造者模式:com.design.example.builder.BuilderMain 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;优点： 1、建造者独立，易扩展。 2、便于控制细节风险。
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。
    <br/>5.原型模式: <br/>
    <br/>6.装饰模式:com.design.example.decorator.DecoratorMain 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;缺点：多层装饰比较复杂。
    <br/>7.适配器模式:com.design.example.adapter.AdapterMain
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;优点：1、可以让任何两个没有关联的类一起运行。 2、提高了类的复用。 3、增加了类的透明度。 4、灵活性好。
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;缺点：1、过多地使用适配器，会让系统非常零乱，不易整体进行把握。
        比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。
    <br/>8.组合模式:com.design.example.composite.CompositeMain
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;优点：1、高层模块调用简单。 2、节点自由增加。
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;缺点：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
    <br/>9.外观模式:com.design.example.facade.FacadeMain
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;优点：1、减少系统相互依赖。 2、提高灵活性。 3、提高了安全性。
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;缺点：不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。
    <br/>10.责任链模式:com.design.example.chain.ChainMain
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;优点：
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、降低耦合度。它将请求的发送者和接收者解耦。 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、简化了对象。使得对象不需要知道链的结构。 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4、增加新的请求处理类很方便。
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;缺点：
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、不能保证请求一定被接收。 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。 
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3、可能不容易观察运行时的特征，有碍于除错。
    <br/>11.策略模式:com.design.example.strategy.StrategyMain
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;优点：1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。
        <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;缺点：1、策略类会增多。 2、所有策略类都需要对外暴露。
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    