import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class UserTest {

    @Test
    public  void  add(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Object obj = context.getBean("userDAO");
        UserDAO dao = (UserDAO)obj;
        User user = new User("eweq", "fdsf", "fdsfd", "fdsfd");
        dao.insert(user);

    }
}
