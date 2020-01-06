package thisispackagename;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import thisispackagename.Teacher;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Teacher objTeacherBean = (Teacher) context.getBean("teacherBean");
		objTeacherBean.showInformation();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}