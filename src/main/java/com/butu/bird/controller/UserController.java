package com.butu.bird.controller;


import com.butu.bird.entity.User;
import com.butu.bird.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author BUTUbird
 * @since 2021-12-07
 */
@RestController
@RequestMapping("/bird/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public Boolean add(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return userService.removeById(id);
    }

    @PostMapping("/update")
    public Boolean update(@RequestBody User user) {
        return userService.updateById(user);
    }

    @GetMapping("/get/{id}")
    public User get(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

}
