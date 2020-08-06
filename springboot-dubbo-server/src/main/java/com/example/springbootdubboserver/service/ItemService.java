package com.example.springbootdubboserver.service;

import java.util.List;
import java.util.Map;

public interface ItemService {
    //检查商品是否可售
    boolean checkItemStatus(String id);

    //获取全部日志信息
    List<Map<String,Object>> queryAllLogs();
}
