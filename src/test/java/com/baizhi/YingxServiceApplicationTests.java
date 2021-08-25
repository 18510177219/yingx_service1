package com.baizhi;

import com.baizhi.dao.AdminDAO;
import com.baizhi.entity.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class YingxServiceApplicationTests {

    @Resource
    AdminDAO adminDAO;

    @Test
    void contextLoads() {
        Admin admin1 = adminDAO.queryByUsername("zzz");
        System.out.println(admin1);
    }

}
