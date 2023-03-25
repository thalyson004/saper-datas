package com.saper.datas.datas.repository;

import com.saper.datas.datas.model.MinhasDatas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MinhasDatasRepository extends JpaRepository<MinhasDatas, Long> {
    List<MinhasDatas> findAllByMyData(LocalDate myDate);
}
