package com.ls.strategy.controller;

import com.ls.strategy.context.PayContextStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {
    @Autowired
    private PayContextStrategy payContextStrategy;
    @RequestMapping("/toPayHtml")
    public String toPayHtml(String payCode){
        return payContextStrategy.toPayHtml(payCode);
    }
}
