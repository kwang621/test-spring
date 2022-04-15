package test.testspring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    private Logger log = LoggerFactory.getLogger(getClass());
//    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("test")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        log.info("test3");
        return "test";
    }
}
