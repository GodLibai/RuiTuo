package com.qfedu.ruituo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class News {
    private Integer nid;

    private String ntitle;

    private String news;

    private String npageurl;

    private String nurl;

    private Date ntime;

    private String nclass;

}