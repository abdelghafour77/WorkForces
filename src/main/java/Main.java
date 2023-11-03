import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmployeeService;

public class Main {
    ApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
    EmployeeService employeeService = appContext.getBean("employeeService", EmployeeService.class);


}
