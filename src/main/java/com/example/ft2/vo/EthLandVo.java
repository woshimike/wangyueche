package com.example.ft2.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EthLandVo {
    @Excel(name = "token_id",width= 20,height = 30)
    private String id;
    @Excel(name = "owner",width= 30,height = 30)
    private String own;
    @Excel(name = "owner_link",width= 30,height = 30)
    private String ownAddress;
    @Excel(name = "listing_status",width= 20,height = 30)
    private String status;
    //当为FixedPrice  当前销售价格
    @Excel(name = "current_price",width= 20,height = 30)
    private String currentPrice;
    //当为HighestBid  起拍价
    @Excel(name = "minimum_bid",width= 20,height = 30)
    private String minimumBid;
    //出价
    @Excel(name = "offer_price",width= 20,height = 30)
    private String offerPrice;
    //出价人
    @Excel(name = "offer_from",width= 20,height = 30)
    private String offerFrom;
    //出价人地址
    @Excel(name = "offer_address",width= 30,height = 30)
    private String offerAddress;
    //出价人地址2
    @Excel(name = "offer_address",width= 30,height = 30)
    private String offerAddress2;
    //出价人地址3
    @Excel(name = "offer_address",width= 30,height = 30)
    private String offerAddress3;
    //出价人地址4
    @Excel(name = "offer_address",width= 30,height = 30)
    private String offerAddress4;

}
