package com.ls.strategy.enumeration;

public enum PayEnumStrategy {
    /**
     * 支付宝支付
     */
    ALI_PAY("com.ls.strategy.impl.AliPayStrategy"),

    /**
     * 微信支付
      */
    WEIXIN_PAY("com.ls.strategy.impl.WeiXinStrategy");
    PayEnumStrategy(String className){this.setClassName(className);}

    public String getClassName(){return className;}

    public void setClassName(String className){this.className=className;}
    /**
     * class完整地址
     */
    private String className;
}
