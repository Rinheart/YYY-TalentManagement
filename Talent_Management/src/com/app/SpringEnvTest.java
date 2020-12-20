package com.app;

import com.bean.*;
import com.event.EmailEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringEnvTest {
    public static void main(String[] args) {
        //创建 Spring 容器
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        //获取 CustomerDAO 实例
        /*ICustomerDAO userDao = (ICustomerDAO) ctx.getBean("userDAO");
        userDao.save();*/

        //获取 UserService 实例
        /*IUserService userService = (IUserService) ctx.getBean("userService");
        Customer cust = new Customer();
        cust.setAccount("SPRING");
        cust.setPassword("SPRING");
        userService.register(cust);
        System.out.println(userService);*/

        //Item实例
        /*IItem item1 = (IItem) ctx.getBean("item1");
        System.out.println(item1.getItemID());
        System.out.println(item1.getTitle());
        System.out.println(item1.getDescription());
        System.out.println(item1.getCost());
        IItem item2 = (IItem) ctx.getBean("item2");
        System.out.println(item2.getItemID());
        System.out.println(item2.getTitle());
        System.out.println(item2.getDescription());
        System.out.println(item2.getCost());*/


        /*IItemOrder itemorder1 = (IItemOrder) ctx.getBean("itemorder1");
        System.out.println("书名：" + itemorder1.getItem().getTitle());
        System.out.println("数量：" + itemorder1.getNumItems());
        IItemOrder itemorder2 = (IItemOrder) ctx.getBean("itemorder2");
        System.out.println("书名：" + itemorder2.getItem().getTitle());
        System.out.println("数量：" + itemorder2.getNumItems());*/

        /*对集合类型属性配置进行测试*/
        /*ShoppingCart shoppingcart = (ShoppingCart) ctx.getBean("shoppingcart");
        System.out.println(shoppingcart);*/

        /*测试set\map\properties*/
        /*TestSet testset= (TestSet) ctx.getBean("testset");
        TestMap testmap= (TestMap) ctx.getBean("testmap");
        TestProperties testprop= (TestProperties) ctx.getBean("testprop");
        System.out.println(testset);
        System.out.println(testmap);
        System.out.println(testprop);*/

        /*测试作用域属性*/
        /*System.out.println("getBean(item1)---1");
        IItem item11 = (IItem) ctx.getBean("item1");
        System.out.println("getBean(item1)---2");
        IItem item12 = (IItem) ctx.getBean("item1");
        System.out.println("getBean(item2)---1");
        IItem item21 = (IItem) ctx.getBean("item2");
        System.out.println("getBean(item2)---2");
        IItem item22 = (IItem) ctx.getBean("item2");*/

       /*测试bean初始化+销毁方式*/
        /*IItemOrder itemorder1 = (IItemOrder)ctx.getBean("itemorder1");

        ctx.close();*/

        /*静态工厂方法创建 bean*/
        /*IItemOrder itemorder2 = (IItemOrder)ctx.getBean("itemorder2");*/

        /*使用 XmlBeanFactory 创建 BeanFactory 实例*/
        /*FileSystemResource isr = new
                FileSystemResource("src/applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(isr);
        IItemOrder itemorder3 = (IItemOrder)
                factory.getBean("itemorder1");*/

        /*ClassPathResource res = new
                ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        IItemOrder itemorder3 = (IItemOrder)
                factory.getBean("itemorder1");*/

        /*ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        IItemOrder itemorder3 = (IItemOrder)ctx.getBean("itemorder1");*/

        /*ApplicationContext ctx = new FileSystemXmlApplicationContext(
                "src/applicationContext.xml");
        IItemOrder itemorder3 = (IItemOrder)ctx.getBean("itemorder1");*/

        /*测试国际化*/
        /*Object[] objects = new Object[]{"HelloWorld",new Date()};
        //String message= ctx.getMessage("HelloWorld",objects, Locale.CHINA);
        String message=ctx.getMessage("HelloWorld",objects,Locale.US);
        System.out.println(message);*/

        EmailEvent ele = new EmailEvent("hello",
                "spring_test@zjut.edu.cn", "this is a test");
        ctx.publishEvent(ele);

    }
}
