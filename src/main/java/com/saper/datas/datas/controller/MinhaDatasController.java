package com.saper.datas.datas.controller;

import com.saper.datas.datas.dto.MinhasDatasDTO;
import com.saper.datas.datas.model.MinhasDatas;
import com.saper.datas.datas.service.MinhasDatasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;

@RestController
@RequestMapping("/datas")
public class MinhaDatasController {

    @Autowired
    MinhasDatasService minhasDatasService;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody MinhasDatasDTO minhasDatasDTO){
        return minhasDatasService.create(minhasDatasDTO);
    }

    @GetMapping
    public ResponseEntity<Object> findAll(){
        return minhasDatasService.findAll();
    }

    @GetMapping("/{data}")
    public ResponseEntity<Object> findAllByData(
            @PathVariable(name = "data") LocalDate myDate
    ){
        return minhasDatasService.findAllByData(myDate);
    }

}
