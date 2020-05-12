package top.seven.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tes")
@Api(tags = "Test")
public class TestController {

    @GetMapping
    public String getStr() {
        return "S";
    }
}
