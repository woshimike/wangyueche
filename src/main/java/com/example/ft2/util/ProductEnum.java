package com.example.ft2.util;

public enum ProductEnum {
    //上线的时候需要删除测试产品
    //PRODUCT_0(0L,"1",30,"产品1"),
    PRODUCT_1(1L,"600",60,"产品1"),
    PRODUCT_2(2L,"4500",600,"产品2"),
    PRODUCT_3(3L,"20000",3000,"产品3"),
    PRODUCT_4(4L,"29900",6000,"产品4");


    private Long id;
    private Integer minuteNum;
    private String priceAmount;
    private String desc;

    private ProductEnum(Long id, String priceAmount, Integer minuteNum,String desc){
        this.id = id;
        this.priceAmount = priceAmount;
        this.minuteNum = minuteNum;
        this.desc = desc;
    }

    public static ProductEnum getProductEnum(Long id) {
        for (ProductEnum eventEnum : ProductEnum.values()) {
            if (eventEnum.getId().equals(id)) {
                return eventEnum;
            }
        }
        return null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMinuteNum() {
        return minuteNum;
    }

    public void setMinuteNum(Integer minuteNum) {
        this.minuteNum = minuteNum;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(String priceAmount) {
        this.priceAmount = priceAmount;
    }
}
