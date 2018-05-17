package cn.hkxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FirstFuckingController {
    @RequestMapping("/fuck")
    public String fuckingRoute(){
        return"hello";
    }

}
