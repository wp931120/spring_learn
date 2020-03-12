package MybatisTest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisTest {

    public static void main(String[] args) throws Exception{

        String resource = "tmp/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao userDao = new UseDaoImpl(sqlSession);

//        List<MybatisTest.User> userList = userDao.queryUserAll();
//        System.out.println(userList);

//        MybatisTest.User user = new MybatisTest.User();
//        user.setUsername("yy");
//        user.setPasswd("1234");
//        userDao.insertUser(user);
//        userDao.deletUserByid("1");





    }
}
