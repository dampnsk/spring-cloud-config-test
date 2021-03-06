package my.spring.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class PropertiesTestController {
 
    @Value("${cloud: no server}")
    private String msg;
 
    @RequestMapping("/msg")
    String getMsg() {
        return msg;
    }
}