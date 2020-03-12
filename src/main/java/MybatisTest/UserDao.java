package MybatisTest;

import java.util.List;

public interface UserDao {

    /**
     * 根据用户id 查询用户
     * @param id
     * @return
     */
    public User queryUserByid(String id);


    /**
     * 查询所有用户
     * @return
     */
    public List<User> queryUserAll();


    /**
     *插入一个用户
     * @param user
     */
    public void insertUser(User user);


    /**
     * 通过id删除用户
     * @param id
     */
    public void deletUserByid(String id);

}
