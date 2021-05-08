package com.ls.strategy.context;

import com.ls.strategy.PayStrategy;
import com.ls.strategy.factory.StrategyFactory;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class PayContextStrategy{

    public String toPayHtml(String payCode){
        if(StringUtils.isEmpty(payCode)){
            return "payCode不能为空!...";
        }
        //1.使用策略工厂获取具体的策略实现
        PayStrategy payStrategy = StrategyFactory.getPayStrategy(payCode);
        if (payStrategy==null){
            return "没有找到具体策略的实现...";
        }
        return  payStrategy.toPayHtml();
    }
}
