package com.example.demo.service;

import com.example.demo.entity.GrowBoxRecord;
import com.example.demo.repository.GrowBoxHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface GrowBoxHistoryService {
    public void saveGrowBoxRecord(GrowBoxRecord growBoxRecord);
    public List<GrowBoxRecord> getHistory();
}
