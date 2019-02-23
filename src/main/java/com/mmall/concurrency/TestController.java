package com.mmall.concurrency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency
 * @ClassName: TestController
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-02-23 13:56
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@Slf4j
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }
}
