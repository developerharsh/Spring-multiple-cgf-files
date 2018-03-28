package mypack;

import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;;


public class DemoClient 
{
	public static void main(String args[])
	{
		Resource resource = new FileSystemResource("Democfg.xml");
		Resource resource1 = new FileSystemResource("Democfg2.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		BeanFactory factory1 = new XmlBeanFactory(resource1,factory);
		
		Demo d=(Demo) factory1.getBean("db");
		d.showData();
	}
}
