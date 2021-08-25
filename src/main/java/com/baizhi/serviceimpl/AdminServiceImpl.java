package com.baizhi.serviceimpl;

import com.baizhi.dao.AdminDAO;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.apache.catalina.core.StandardContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Transactional
@Service
public class AdminServiceImpl implements AdminService {


    private static final Logger log = LoggerFactory.getLogger(AdminServiceImpl.class);
    @Resource
    AdminDAO adminDAO;

    @Resource
    HttpServletRequest request;

    @Override
    public HashMap<String, Object> login(Admin admin, String enCode) {

        //1.获取验证码
        String code = (String) request.getServletContext().getAttribute("code");

        log.info("用户输入的验证码: {}",enCode);
        log.info("用户存储的验证码: {}",code);

        HashMap<String, Object> map = new HashMap<>();

        //2.判断验证码是否一致
        if(code.equals(enCode)){
            //3.判断用户是否存在
            Admin admin1 = adminDAO.queryByUsername(admin.getUsername());

            if(admin1!=null){
                //4.判断用户是否正常
                if(admin1.getStatus().equals("1")){

                    //5.判断密码是否正确
                    if(admin1.getPassword().equals(admin.getPassword())){

                        //存储用户标记
                        request.getServletContext().setAttribute("admin",admin1);

                        map.put("message",admin1);
                        map.put("status",200);
                    }else {
                        map.put("message","密码错误");
                        map.put("status","400");
                    }
                }else {
                    map.put("message","该用户已被冻结请联系超管");
                    map.put("status",400);
                }
            }else{
                map.put("message","该用户不存在");
                map.put("status",400);
            }
        }else{
            map.put("message","验证码不正确");
            map.put("status",400);
        }
        return map;
    }
}