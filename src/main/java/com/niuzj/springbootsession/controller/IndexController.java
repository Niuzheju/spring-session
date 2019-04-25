package com.niuzj.springbootsession.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author niuzj
 * @date 2019/4/25 14:28
 */
@RestController
public class IndexController {

    /**
     * 往session中设置属性
     */
    @RequestMapping("/session/set")
    public String session(HttpSession session, String name) {
        session.setAttribute("name", name);
        return session.getId();
    }

    /**
     * 从session取出属性
     */
    @RequestMapping("/session/get")
    public String session(HttpSession session) {
        return session.getAttribute("name").toString();
    }
}
