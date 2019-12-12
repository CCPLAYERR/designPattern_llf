package cn.llftest.springboot.service;

import cn.llftest.springboot.DAO.CityRepository;
import cn.llftest.springboot.pojo.City;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityServiceImpl {

    @Autowired
    private CityRepository cityDAO;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public City findById(String id) {

        City city1 = null;
        Boolean flag = redisTemplate.hasKey(id);
        if (flag) {//存在
            String s = redisTemplate.opsForValue().get(id);
            city1 = JSON.parseObject(s, City.class);
            System.out.println("从redis中读取的数据");
        } else {//不存在
            Optional<City> city = cityDAO.findById(id);
            if (0 != city.hashCode()) {//查询结果不为空
                city1 = city.get();
                String s = JSON.toJSONString(city1);
                redisTemplate.opsForValue().set(id, s);
                System.out.println("从数据库中读取的数据");
            }
        }

        return city1;
    }
}
