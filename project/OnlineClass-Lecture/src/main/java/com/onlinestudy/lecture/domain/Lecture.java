package com.onlinestudy.lecture.domain;

import java.util.Date;

public class Lecture {

     String lecture_id;
     String lecture_name;
     String member_id;
     int lecture_show_yn;
     String lecture_total_score;
     Date insert_dt;
     Date update_dt;

    public Lecture(String lecture_id, String lecture_name, String member_id, int lecture_show_yn, String lecture_total_score, Date insert_dt, Date update_dt) {
        this.lecture_id = lecture_id;
        this.lecture_name = lecture_name;
        this.member_id = member_id;
        this.lecture_show_yn = lecture_show_yn;
        this.lecture_total_score = lecture_total_score;
        this.insert_dt = insert_dt;
        this.update_dt = update_dt;
    }

    public String getLecture_id() {
        return lecture_id;
    }

    public void setLecture_id(String lecture_id) {
        this.lecture_id = lecture_id;
    }

    public String getLecture_name() {
        return lecture_name;
    }

    public void setLecture_name(String lecture_name) {
        this.lecture_name = lecture_name;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public int getLecture_show_yn() {
        return lecture_show_yn;
    }

    public void setLecture_show_yn(int lecture_show_yn) {
        this.lecture_show_yn = lecture_show_yn;
    }

    public String getLecture_total_score() {
        return lecture_total_score;
    }

    public void setLecture_total_score(String lecture_total_score) {
        this.lecture_total_score = lecture_total_score;
    }

    public Date getInsert_dt() {
        return insert_dt;
    }

    public void setInsert_dt(Date insert_dt) {
        this.insert_dt = insert_dt;
    }

    public Date getUpdate_dt() {
        return update_dt;
    }

    public void setUpdate_dt(Date update_dt) {
        this.update_dt = update_dt;
    }
}
