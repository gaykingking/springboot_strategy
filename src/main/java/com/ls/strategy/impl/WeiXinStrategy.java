package com.ls.strategy.impl;

import com.ls.strategy.PayStrategy;

public class WeiXinStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "调用微信支付接口...";
    }
}
