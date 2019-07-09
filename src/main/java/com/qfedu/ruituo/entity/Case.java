package com.qfedu.ruituo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Case {
    private Integer cid;

    private String trade;

    private String pixel;

    private String area;

    private String local;

    private Date ctime;

    private String cpageurl;

    private String ctitle;

    private String ctext;

    private String curl;


}