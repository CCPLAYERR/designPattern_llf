package cn.llftest.springboot.controller;

import cn.llftest.springboot.DAO.CityRepository;
import cn.llftest.springboot.pojo.City;
import cn.llftest.springboot.pojo.Student;
import cn.llftest.springboot.service.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;
import java.util.Optional;

@RestController
public class HelloController {

    @Autowired
    private Student student;

    @Autowired
    private CityRepository cityDAO;

    @Autowired
    private CityServiceImpl cityService;

    @Value("${P2_AUTOWIN.add.a}")
    private String a;

    @RequestMapping("/hello")
    public String index() {
        System.out.println(a);
        return a;
    }

    @RequestMapping("/findById")
    public City findById(@RequestParam(value = "id")String id) {
        City city = null;
        Optional<City> optional = cityDAO.findById(id);
        if (0 != optional.hashCode()) {
            city = optional.get();
        }
        return city;
    }

    @RequestMapping("/findByIds")
    public City findBuIdByservice(@RequestParam(value = "id")String id){
        return cityService.findById(id);
    }
}
