package cn.smbms.controller;

import cn.smbms.beans.User;
import cn.smbms.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    private  final  static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("addUser")
    public ModelAndView addUser(){
        User user = new User();
        user.setUserName("哈利波特");
        userService.addUser(user);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addUser");
        return modelAndView;
    }
    @RequestMapping("deleteUser")
    public ModelAndView deleteUser() {
        userService.deleteUser(17);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("deleteUser");
        return modelAndView;
    }

    @RequestMapping("updateUser")
    public ModelAndView updateUser() {
        User user = new User();
        user.setId(14);
        user.setUserCode("dazhuzi");
        user.setUserName("大柱子");
        user.setUserPassword("12345678");

        userService.updateUser(user);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("updateUser");
        return modelAndView;
    }

    @RequestMapping("getUserList")
    public ModelAndView getUserList() {
        User user = new User();
        userService.getUserList(user);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("select");
        return modelAndView;
    }
}
