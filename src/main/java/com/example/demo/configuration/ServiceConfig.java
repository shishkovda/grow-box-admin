package com.example.demo.configuration;

import com.example.demo.repository.GrowBoxHistoryRepository;
import com.example.demo.service.GrowBoxHistoryService;
import com.example.demo.service.GrowBoxHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
public class ServiceConfig {

//    @Bean
//    @Autowired
//    public GrowBoxHistoryService growBoxHistoryService(){
//        return new GrowBoxHistoryServiceImpl();
//    }

//    @Bean
//    @Autowired
//    public GrowBoxHistoryRepository growBoxHistoryRepository(){
//        return new GrowBoxHistoryRepositoryImpl();
//    }
}
