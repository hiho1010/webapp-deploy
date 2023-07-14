package com.Joooooyoung.springboot.deploytest.webappdeploy.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("say-hello")
    public String sayHell() { return "Hello web"; }
}
