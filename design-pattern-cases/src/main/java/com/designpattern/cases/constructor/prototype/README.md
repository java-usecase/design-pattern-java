## 原型模式（Prototype）

### Intent

使用原型实例指定待创建对象的类型，并且通过复制这个原型来创建新的对象。

- 通过clone的方式在获取大量对象的时候性能开销基本没有什么影响，而new的方式随着实例的对象越来越多，性能会急剧下降，所以原型模式是一种比较重要的获取实例的方式。
- 原型模式很少单独出现，一般是和工厂方法模式一起出现，通过clone的方法创建一个对象，然后由工厂方法提供给调用者。
- spring中bean的创建实际就是两种：单例模式和原型模式。（原型模式需要和工厂模式搭配起来）

### Class Diagram

原型模式要求对象实现一个可以“克隆”自身的接口，这样就可以通过复制一个实例对象本身来创建一个新的实例。这样一来，通过原型实例创建新的对象，就不再需要关心这个实例本身的类型，只要实现了克隆自身的方法，就可以通过这个方法来获取新的对象，而无须再去通过new来创建。

原型模式有两种表现形式：（1）简单形式、（2）登记形式，这两种表现形式仅仅是原型模式的不同实现。

### Implementation

NA

#### 简单形式的原型模式
这种形式涉及到三个角色：
（1）客户(Client)角色：客户类提出创建对象的请求。
（2）抽象原型(Prototype)角色：这是一个抽象角色，通常由一个Java接口或Java抽象类实现。此角色给出所有的具体原型类所需的接口。
（3）具体原型（Concrete Prototype）角色：被复制的对象。此角色需要实现抽象的原型角色所要求的接口。

#### 登记形式的原型模式
多了一个原型管理器(PrototypeManager)角色，该角色的作用是：创建具体原型类的对象，并记录每一个被创建的对象。

### JDK

- [java.lang.Object#clone()](http://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#clone%28%29)

