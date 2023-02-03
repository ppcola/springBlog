package com.offcn.controller;

import com.offcn.bean.User;
import com.offcn.mapper.UserMapper;
import com.offcn.service.UserService;
import com.offcn.utils.ResultVo;
import com.offcn.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    public String login(String uname, String upass, HttpSession session){
        User user = userService.login(uname,upass);
        if(user !=null){
            //将用户信息保存到session中
            user.setUpass(null);//为保证信息安全清楚密码
            session.setAttribute("user",user);
            return "redirect:/index.jsp";
        }else {
            return "redirect:/login.jsp";
        }
    }

    /**
     * 登出功能
     * @param session
     * @return
     */
    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login.jsp";
    }

    @RequestMapping("queryAll")
    @ResponseBody
    public List<User> queryAll(){
        List<User> userList = userService.queryAll();
        return userList;
    }
    @RequestMapping("queryByCondition")
    @ResponseBody
    public List<User> queryByCondition(String uname){
        List<User> userList = userService.queryByCondition(uname);
        return userList;
    }

    @RequestMapping("queryByUid")
    @ResponseBody
    public UserVo queryByUid(int uid){
        return userService.queryByUid(uid);
    }

    @RequestMapping("del")
    @ResponseBody
    public ResultVo deleteUser(int uid){
        int i = userService.deleteUser(uid);
        if(i>0){
            return new ResultVo(true,"成功");
        }else {
            return new ResultVo(false,"成功");
        }
    }
}
