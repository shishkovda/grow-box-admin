package com.example.demo.service;

import com.example.demo.entity.GrowBoxRecord;
import com.example.demo.repository.GrowBoxHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class GrowBoxHistoryServiceImpl implements GrowBoxHistoryService {

    @Autowired
    GrowBoxHistoryRepository growBoxHistoryRepository;

    @Transactional
    public void saveGrowBoxRecord(GrowBoxRecord growBoxRecord){
        growBoxHistoryRepository.save(growBoxRecord);
    }

    @Override
    public List<GrowBoxRecord> getHistory() {
        return (ArrayList)(growBoxHistoryRepository.findAll());
    }
}
