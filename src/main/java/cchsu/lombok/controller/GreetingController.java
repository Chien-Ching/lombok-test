package cchsu.lombok.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cchsu on 2017/8/5.
 */

@RestController
public class GreetingController {
    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello, world";
    }
}
