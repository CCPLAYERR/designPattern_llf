package com.seckill;

import cn.codingxiaxw.dao.SeckillDao;
import cn.codingxiaxw.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring/spring-dao.xml"})
public class T01 {

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void xxx(){
        Seckill seckill = seckillDao.queryById(1000);
        System.out.println("1111111111111111111"+seckill.getCreateTime());
    }
}
