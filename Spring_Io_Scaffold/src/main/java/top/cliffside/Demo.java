package top.cliffside;

/**
 * @author cliffside
 * @date 2021-05-14 14:11
 * 简单的说就是,创建对象的权利,或者是控制的位置,
 * 由JAVA代码转移到spring容器,
 * 由spring的容器控制对象的创建,
 * 就是控制反转,spring创建对象时,
 * 会读取配置文件中的信息,然后使用反射给我们创建好对象之后在容器中存储起来,
 * 当我们需要某个对象时,通过id获取对象即可,不需要我们自己去new.
 * 一句话:创建对象交给容器
 */
public class Demo {

}
/**
 * spring中 bean的管理
 * 管理的内容是什么
 *
 * 1 对象的创建   IOC
 * IOC 叫做控制反转,就是Spring给我们创建对象,
 * 然后我们直接用,不用自己NEW,前面已经解释过
 * IOC处理的是对象如何创建的问题
 *
 * 2 属性的赋值 DI
 * DI  Dependency Injection，
 * 即“依赖注入” 就是创建属性时给对象属性赋值
 * 对象功能的实现往往要依赖属性的值,
 * 那么给对象属性赋值就可以说成是依赖注入
 * 由于对象属性不仅仅是基本数据类型,还可能是其他类,或者引用类型
 * 那么依赖注入将会把更多的对象之间的关系整理到一起,可以行程一个庞大的依赖关系
 * DI处理的是对象的属性赋值和互相依赖的关系
 * 比如一个类中依赖到另一个Javabean，比如controller中依赖service的一个类
 */