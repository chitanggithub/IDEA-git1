package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    /**
     * 测试dao
     */
    @Test
    public void testFindById1(){
        //获取spring容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中拿到所需的dao的代理对象
        ItemsDao dao = ac.getBean(ItemsDao.class);
        //调用方法
        Items items = dao.findById(1);
        System.out.println(items);
    }

    /**
     * 测试service
     */
    @Test
    public void testFindById2(){
        //获取spring容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService = ac.getBean(ItemsService.class);
        //调用方法
        Items items = itemsService.findById(1);
        System.out.println(items);
    }

}
