package by.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping(path = "/demo")
    public String showDemoPage(){
        return "demo";
    }

    @GetMapping(path = "/")
    public String showDemo(){
        return "demo";
    }
}
