package SpringMybatis.service;


import SpringMybatis.entity.User;
import SpringMybatis.mapper.db1.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class UserService {

    @PostConstruct
    public void init(){
        System.out.println("---------");
    }

    @Autowired
    UserMapper userMapper;

    public User selectUser(String id){
        return userMapper.selectUser(id);

    }

    public List<User> selectUserAll(){
        return userMapper.selectUserAll();
    }

    public void insertUser(User user){
        userMapper.insertUser(user);
    }

    public void deleteUser(String id){
        userMapper.deleteUser(id);
    }
}
