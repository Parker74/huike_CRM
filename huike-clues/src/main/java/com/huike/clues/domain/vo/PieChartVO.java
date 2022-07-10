package com.huike.clues.domain.vo;

/**
 * @author HaoXiaoLong
 * @version 1.0
 * @date 2022/7/7 19:27
 */
public class PieChartVO {

    private String subject;
    private Integer num;

    public PieChartVO() {
    }

    public PieChartVO(String subject, Integer num) {
        this.subject = subject;
        this.num = num;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }



}
