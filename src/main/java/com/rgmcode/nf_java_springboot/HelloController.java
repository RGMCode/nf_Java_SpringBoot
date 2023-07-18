package com.rgmcode.nf_java_springboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(@RequestParam String name){
        return "Hello " + name;
    }

    @PostMapping("/strlen")
    public int getStrlen(@RequestBody StrlenRequest strlenRequest){
        return strlenRequest.getText().length();
    }

}
