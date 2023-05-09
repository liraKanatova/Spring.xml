package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ZooShop zooShop = applicationContext.getBean("ZooShop", ZooShop.class);
        zooShop.getBirdInfo();

        applicationContext.close();
    }
}
