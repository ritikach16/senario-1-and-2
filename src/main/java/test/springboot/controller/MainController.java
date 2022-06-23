package test.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import test.springboot.entity.TestEntity;
import test.springboot.service.TestService;

@Controller
public class MainController {

    @Autowired
    private TestService testService;

    @GetMapping("/")
    public String showHome(Model model){
        TestEntity testEntity = new TestEntity();
        model.addAttribute("test_entity", testEntity);
        return "index";
    }
}
