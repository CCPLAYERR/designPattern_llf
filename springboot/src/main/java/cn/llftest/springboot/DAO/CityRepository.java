package cn.llftest.springboot.DAO;

import cn.llftest.springboot.pojo.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CityRepository extends JpaRepository<City, String> {

    @Override
    Optional<City> findById(String id);
}
