import java.util.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.quanlian.mapper.StudentMapper;
import com.quanlian.pojo.Student;

public class TestSpringMybatis {
	
	@Test
	public void springMybatis(){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentMapper studentMapper = classPathXmlApplicationContext.getBean(StudentMapper.class);
		List<Student> list =studentMapper.selectByExample(null);
		System.out.println(list.size());
		
		
		
	}
}
