package com.ls.strategy.factory;

import com.ls.strategy.PayStrategy;
import com.ls.strategy.enumeration.PayEnumStrategy;

public class StrategyFactory {
    //使用策略工厂获取具体策略实现
    public static PayStrategy getPayStrategy(String strategyType){
        try {
            //1.获取具体的策略class地址
            String className = PayEnumStrategy.valueOf(strategyType).getClassName();
            return (PayStrategy)Class.forName(className).newInstance();
        }catch (Exception e){
            return null;
        }
    }
}
