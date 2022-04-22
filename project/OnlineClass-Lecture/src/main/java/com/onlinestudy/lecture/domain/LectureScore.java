package com.onlinestudy.lecture.domain;

import java.util.Date;

public class LectureScore {

     String lecture_id;
     String member_id;
     String lecture_score;
     Date insert_dt;
     Date update_dt;

    public LectureScore(String lecture_id, String member_id, String lecture_score, Date insert_dt, Date update_dt) {
        this.lecture_id = lecture_id;
        this.member_id = member_id;
        this.lecture_score = lecture_score;
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

    public String getLecture_score() {
        return lecture_score;
    }

    public void setLecture_score(String lecture_score) {
        this.lecture_score = lecture_score;
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
