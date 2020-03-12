package SpringMybatis.controller;


import SpringMybatis.entity.User;
import SpringMybatis.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUser/{id}")
    public String GetUser(@PathVariable String id){
        return  userService.selectUser(id).toString();
    }

    @GetMapping("/getUsers")
    public List<User> getall(){
        return userService.selectUserAll();
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){

        userService.insertUser(user);
    }

}
