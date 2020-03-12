package MybatisTest;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UseDaoImpl implements UserDao {
    public SqlSession sqlSession;

    public UseDaoImpl(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }


    @Override
    public User queryUserByid(String id) {
        return this.sqlSession.selectOne("UserMapper.selectUser",id);
    }

    @Override
    public List<User> queryUserAll() {
        return this.sqlSession.selectList("UserMapper.selectUserAll");
    }

    @Override
    public void insertUser(User user) {
        this.sqlSession.insert("UserMapper.insertUser", user);
        this.sqlSession.commit();

    }

    @Override
    public void deletUserByid(String id) {
        this.sqlSession.delete("UserMapper.deleteUser", id);
        this.sqlSession.commit();

    }



}
