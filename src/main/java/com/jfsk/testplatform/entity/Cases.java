package com.jfsk.testplatform.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cases {
    private Integer id;
    private String casename;
    private String url;
    private String method;
    private String data;
    private String expected;
    private String desc;
    private String isrunn;
    private Timestamp created_at;
    private Timestamp updated_at;
}
