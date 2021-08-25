package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.util.Date;

@Table(name="yx_feedback")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feedback {

    private  String id;
    private  String title;
    private  String content;
    private  String userId;
    private Date createTime;

}
