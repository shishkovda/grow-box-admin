package com.example.demo.controller.rest;

import com.example.demo.entity.GrowBoxRecord;
import com.example.demo.service.GrowBoxHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/history")
public class GrowBoxHistoryRestController {

    @Autowired
    GrowBoxHistoryService growBoxHistoryService;

    @PostMapping("")
    public void addRecord(@RequestBody GrowBoxRecord growBoxRecord){
        growBoxHistoryService.saveGrowBoxRecord(growBoxRecord);
    }
}
