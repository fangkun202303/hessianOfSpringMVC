package controller;

import com.modules.hessianDemo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: demo
 * @Description: TODOd
 * @Author: FangKun
 * @Date: Created in 2019/1/22 10:51
 * @Version: 1.0
 */
public class HessianTest {
    public static void main(String[] args) {
        ApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获得客户端的Hessian代理工厂bean
        UserService i = (UserService) contex.getBean("hessianClient");
        System.out.println(i.getDataFromServer("masongchao"));  }
    }
