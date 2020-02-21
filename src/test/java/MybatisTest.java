import com.haitao.dao.IUserDao;
import com.haitao.mybatis.sqlsession.SqlSession;
import com.haitao.mybatis.sqlsession.SqlSessionFactory;
import com.haitao.mybatis.sqlsession.SqlSessionFactoryBuilder;
import com.haitao.pojo.User;

import javax.annotation.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @version 1.0.0
 * @ClassName MybatisTest
 * @Description TODO
 * @Author Tao
 * @Date 2020/2/21 14:27
 */
public class MybatisTest {

    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("Mybatis-configs.xml");
        //2.创建sqlsessionfactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //使用构建者模式,把对象的创建信息隐藏,使得调用方法的时候就可拿到对象
        SqlSessionFactory factory = builder.build(input);
        //3.使用工厂创建sqlsession对象(借助此对象与数据库交互)
        //使用工厂模式,解耦(降低类之间的依赖关系)
        SqlSession sqlSession = factory.openSession();
        //4.使用sqlsession对象创建dao接口的代理对象
        //使用代理模式,不修改源码的基础上对方法进行增强
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        //5.使用代理对象执行dao接口的方法
        List<User> list = userDao.findAll();
        for (User user:list){
            System.out.println(user);
        }
        //6.释放资源
        sqlSession.close();
        input.close();
    }
}
