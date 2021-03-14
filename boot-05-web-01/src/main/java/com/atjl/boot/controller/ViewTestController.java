package com.atjl.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/3/9
 * @Time: 15:46
 **/

@Controller
public class ViewTestController {

    @RequestMapping("/atguigu")
    public  String atguigu(Model model){
        //model中的数据会被放在请求域中 request.setAttribute("a",aa)
        model.addAttribute("msg","你好");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
}
