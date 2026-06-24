package com.example.git_test.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TitanicControl {

    @Autowired JdbcTemplate jt;

    // URL : EndPoint
    @GetMapping("/titanic")
    @ResponseBody
    public List<Map<String, Object>> titanic(@RequestParam String search,
                                             @RequestParam int page) {
        int startNum = page * 10 - 10;
        // List<Map<String, Object>> list = jt.queryForList("select * from titanic where name like '%" + search + "%':");
        // List<Map<String, Object>> list = jt.queryForList("select * from titanic where name like '%?%'", search);
        List<Map<String, Object>> list =
            jt.queryForList("select * " +
                            "from titanic " +
                            "where name like concat ('%', ?, '%')" +
                            "limit ?, 10", search, startNum);
        return list;
    }

//    @GetMapping("/titanic")
//    @ResponseBody
//    public List<Map<String, Object>> titanic(@RequestParam String search) {
//            String sql = "select * from titanic where name like ?";
//        return jt.queryForList(sql, "%" + search + "%");
//    }
    
}
