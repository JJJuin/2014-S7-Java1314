package com.qdu.juin1.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.qdu.juin1.bean.BeanClass03;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/service.xml");
        
        /*BeanClass01 bc01 = ac.getBean("bc01",BeanClass01.class);
        bc01.setMsg("This is bc01");
        bc01.showMsg();
        
        BeanClass01 bc0102 = ac.getBean("bc01",BeanClass01.class);
        bc0102.setMsg("This is bc01222222222222222");
        bc0102.showMsg();
        
        System.out.println("--------------第二次调用-------------");
        bc01.showMsg();
        System.out.println(bc01 == bc0102);*/
        
        /*BeanClass01 bcf01 = ac.getBean("bcf01",BeanClass01.class);
        bcf01.setMsg("This is bcf01");
        bcf01.showMsg();*/
        
        /*BeanClass02 bc02 = ac.getBean("bc02",BeanClass02.class);
        bc02.showInfo();*/
        
        BeanClass03 bc03 = ac.getBean("bc03",BeanClass03.class);
        bc03.show();
    }
}