package com.chen.controller;

import com.chen.domain.Users;
import com.chen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class UsersController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/list")
    public ModelAndView userList() {
        ModelAndView modelAndView = new ModelAndView();
        List<Users> all = iUserService.getAll();
        modelAndView.addObject("list", all);
        modelAndView.setViewName("userList");
        return modelAndView;
    }

    @RequestMapping("/del/{id}")
    public Map<String, Object> delete(@PathVariable("id")Long id) {
        HashMap<String, Object> res = new HashMap<>();
        int result = iUserService.deleteById(id);
        if (result == 1){
            res.put("msg", "删除成功！");
            return res;
        } else {
            res.put("msg", "删除失败！");
        }
        return res;
    }

}
