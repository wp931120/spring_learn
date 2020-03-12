import MybatisTest.UseDaoImpl;
import MybatisTest.User;
import MybatisTest.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;



public class UserDaotest {

    public UserDao userDao;


    @Before
    public void setUp() throws Exception{

        String resource = "tmp/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        this.userDao = new UseDaoImpl(sqlSession);

    }

    @Test
    public void queryUserById (){
        System.out.println(this.userDao.queryUserByid("3"));
    }

    @Test
    public void queryUserall (){
        List<User> userList = this.userDao.queryUserAll();
        for (User user:userList){
            System.out.println(user);
        }
    }
}

