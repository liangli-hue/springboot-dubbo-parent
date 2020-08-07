package com.example.springbootdubboclient;

import com.example.springbootdubboserver.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ItemController {
    //注入服务提供方暴露的接口，通过@Reference注解，dubbo会在扫描的时候自动代理接口，然后通过rpc调用远程服务。
    //如果用xml配置方式，需要将@Reference换成@Autowired。
//    @Reference
    @Autowired
    ItemService itemService;

    @RequestMapping("/canbuy")
    public String canBuy(@RequestParam("id") String id){
        System.out.println(id);
        boolean flag = itemService.checkItemStatus(id);
        if (flag) {
            return "can buy!";
        } else {
            return "can not buy!";
        }
    }

    @RequestMapping("/queryAllLogs")
    public String queryAllLogs(){
        List<Map<String, Object>> maps = itemService.queryAllLogs();
        return maps.toString();
    }
}
