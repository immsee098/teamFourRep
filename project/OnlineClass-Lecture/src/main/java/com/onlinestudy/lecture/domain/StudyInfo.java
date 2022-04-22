package com.onlinestudy.lecture.domain;

import java.util.Date;

public class StudyInfo {

     String lecture_id;
     String member_id;
     String test_score;
     String lecture_state;
     Date insert_dt;
     Date update_dt;

    public StudyInfo(String lecture_id, String member_id, String test_score, String lecture_state, Date insert_dt, Date update_dt) {
        this.lecture_id = lecture_id;
        this.member_id = member_id;
        this.test_score = test_score;
        this.lecture_state = lecture_state;
        this.insert_dt = insert_dt;
        this.update_dt = update_dt;
    }

    public String getLecture_id() {
        return lecture_id;
    }

    public void setLecture_id(String lecture_id) {
        this.lecture_id = lecture_id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getTest_score() {
        return test_score;
    }

    public void setTest_score(String test_score) {
        this.test_score = test_score;
    }

    public String getLecture_state() {
        return lecture_state;
    }

    public void setLecture_state(String lecture_state) {
        this.lecture_state = lecture_state;
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
