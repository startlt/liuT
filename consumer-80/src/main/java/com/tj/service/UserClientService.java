package com.tj.service;

import org.springframework.web.bind.annotation.RequestMapping;
import com.tj.pojo.HappysysUser;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("MICROSERVICE-HAPPYSYS")
public interface UserClientService {
    @RequestMapping("/add/user")
    public boolean addUser(HappysysUser user);
}
