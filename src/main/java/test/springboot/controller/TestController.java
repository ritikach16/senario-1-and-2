package test.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import test.springboot.entity.TestEntity;
import test.springboot.service.TestService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/test", method = RequestMethod.GET)  // ---------> changed
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/valid")  // -------> changed
    public TestEntity validityTest(@Valid @RequestParam TestEntity testEntity) {
        return testService.save(testEntity);
    }

    @PostMapping(path="/{mapping}", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})  // -----------> changed
    public TestEntity funTest(@Valid @RequestParam long number) {
        TestEntity testEntity = new TestEntity();
        testEntity.setNumber(number);
        System.out.println(testService.save(testEntity));
        return testService.save(testEntity);
    }


    @GetMapping
    public List<TestEntity> showTest() {
        return testService.get();
    }
}