package com.example.demo;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JackJun
 * @date 2024/5/4 01:14
 */
@RestController
public class TestController {

    @GetMapping("test")
    @ApiOperation("test")
    private TestResp<TestData> testResp() {
        return new TestResp<>(new TestData("test"));
    }
}
