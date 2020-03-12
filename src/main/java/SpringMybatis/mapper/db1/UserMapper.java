package SpringMybatis.mapper.db1;

import SpringMybatis.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {

    User selectUser(String id);

    List<User> selectUserAll();

    void insertUser(User user);

    void deleteUser(String id);
}
