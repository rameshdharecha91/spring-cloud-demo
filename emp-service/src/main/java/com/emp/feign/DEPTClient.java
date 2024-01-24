package com.emp.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "DEPT-SERVICE")
public interface DEPTClient {

    @GetMapping("/get-dept")
    public String getDept();
}
