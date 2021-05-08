package com.ls.strategy.impl;

import com.ls.strategy.PayStrategy;

public class AliPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "调用支付宝的接口...";
    }
}
