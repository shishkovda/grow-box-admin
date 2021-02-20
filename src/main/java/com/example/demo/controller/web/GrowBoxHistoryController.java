package com.example.demo.controller.web;

import com.example.demo.service.GrowBoxHistoryService;
import com.example.demo.service.GrowBoxHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GrowBoxHistoryController {
    @Autowired
    GrowBoxHistoryService growBoxHistoryService;

    @GetMapping("/")
    public String getHistory(Model model){
        model.addAttribute("growBoxHistory",growBoxHistoryService.getHistory());
        return "index";
    }

}
