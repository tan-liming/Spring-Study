import com.hou.pojo.User;
import com.hou.pojo.UserL;
import com.hou.pojo.UsetT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    //因为是在创建context的时候创建user实例放到容器中，那个时候调用了构造方法。getbean是从容器中取得实例。那个时候user实例早就创建好了。
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UsetT user =(UsetT) classPathXmlApplicationContext.getBean("u2");
        System.out.println(user.toString());
        User user1 = (User) classPathXmlApplicationContext.getBean("user");
        System.out.println(user1.toString());
        UserL user2 = (UserL) classPathXmlApplicationContext.getBean("userl");
        System.out.println(user1.toString());
    }
}
