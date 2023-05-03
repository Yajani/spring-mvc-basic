package com.spring.mvc.chap06;

import com.spring.mvc.jdbc.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/rests")
public class RestApiController {

    @GetMapping("/hello")
    public String hello() {
        return "안녕하세요!";
    }

    @GetMapping("/foods")
    public List<String> foods() {
//        String[] foodList = {"탕수육", "족발", "마라탕"};
        List<String> foodList = List.of("탕수육", "족발", "마라탕");
        return foodList;
    }

    @GetMapping("/person")
    public Person person() {
        Person p = new Person(1L, "루피", 3);
        return p;
    }

    @GetMapping("/person-list")
    public List<Person> personList() {
        Person p = new Person(1L, "루피", 3);
        Person p2 = new Person(2L, "딸긔겅듀", 4);
        Person p3 = new Person(3L, "뽀롤로", 5);
        return List.of(p, p2, p3);
    }
}