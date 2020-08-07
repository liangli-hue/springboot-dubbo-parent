package com.example.springbootdubboserver.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class ItemServiceImpl implements ItemService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean checkItemStatus(String id) {
        if (id.contains("111")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 查询所有日志
     * @return
     */
    @Override
    public List<Map<String, Object>> queryAllLogs() {
        String sql = "select log.c_id 编号,log.c_value 名称,log.c_type 类型,log.c_time 时间,log.c_ip 地址,log.c_usetime 用时,log.c_port 端口 from t_log log";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }
}
