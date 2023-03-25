package com.saper.datas.datas.service;

import com.saper.datas.datas.dto.MinhasDatasDTO;
import com.saper.datas.datas.model.MinhasDatas;
import com.saper.datas.datas.repository.MinhasDatasRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Service
public class MinhasDatasService {
    @Autowired
    MinhasDatasRepository minhasDatasRepository;
    public ResponseEntity<Object> create(MinhasDatasDTO minhasDatasDTO){
        MinhasDatas minhasDatas = new MinhasDatas();
        BeanUtils.copyProperties(minhasDatasDTO, minhasDatas);

        minhasDatas.setMyCreatedTime(OffsetDateTime.now());

        return ResponseEntity.status(HttpStatus.CREATED).body(minhasDatasRepository.save(minhasDatas));
    }

    public ResponseEntity<Object> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(minhasDatasRepository.findAll());
    }

    public ResponseEntity<Object> findAllByData(LocalDate myDate) {

        return ResponseEntity.status(HttpStatus.OK).body(minhasDatasRepository.findAllByMyData(myDate));
    }
}
