package com.jmd.spring2nd;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyFirstController {

    @PostMapping("/sayHello")
    public String sayHello(@RequestBody String name) {
        return "Hi " + name;
    }

    @PostMapping("/get_users")
    public String getUsers(@RequestBody User user) {
        return user.toString();
    }

    // Path variable tutorial
    @GetMapping("/get_users_name/{name}")
    public String get_users_name(@PathVariable("name") String name) {
        return "I am "+ name;
    }

// request params part
    //curl --location 'http://localhost:8080/req_params?name=Shivansh%20Kumar%20Srivastava&age=90' \
//--header 'Content-Type: application/json' 
    @GetMapping("/req_params")
    public String req_params(@RequestParam("name") String name, @RequestParam("age") int age) {
        return "I am "+ name+" age"+ age;
    }
}
