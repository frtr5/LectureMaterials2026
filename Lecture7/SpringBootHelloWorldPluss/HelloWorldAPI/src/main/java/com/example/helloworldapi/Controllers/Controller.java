package com.example.helloworldapi.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/hello")
public class Controller {

    // http://localhost:8080/api/hello
    @GetMapping()
    public String hello(){
        return "Hello World!" ;
    }
    // http://localhost:8080/api/hello/deluxe
    @GetMapping("deluxe")
    public String deluxe(){
        return """
                Hello, World!
                Thank you for choosing Hello™ Deluxe.
                By receiving this greeting, the world agrees to our terms of friendliness.""";
    }

    // http://localhost:8080/api/hello/personal?name=tom
    @GetMapping("personal")
    public String personalQueryParam(@RequestParam() String name){
        return "Hello " + name;
    }


    // http://localhost:8080/api/hello/personal/tom
    @GetMapping("personal/{name}")
    public String personalPathParam(@PathVariable String name){
        return "Hello " + name;
    }
}
