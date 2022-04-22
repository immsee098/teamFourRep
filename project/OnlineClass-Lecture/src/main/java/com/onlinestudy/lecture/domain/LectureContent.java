package com.onlinestudy.lecture.domain;

import java.util.Date;

public class LectureContent {

    String content_id;
    String content_name;
    String content;
    String lecture_id;
    String content_type;
    Date insert_dt;
    Date update_dt;

    public LectureContent(String content_id, String content_name, String content, String lecture_id, String content_type, Date insert_dt, Date update_dt) {
        this.content_id = content_id;
        this.content_name = content_name;
        this.content = content;
        this.lecture_id = lecture_id;
        this.content_type = content_type;
        this.insert_dt = insert_dt;
        this.update_dt = update_dt;
    }

    public String getContent_id() {
        return content_id;
    }

    public void setContent_id(String content_id) {
        this.content_id = content_id;
    }

    public String getContent_name() {
        return content_name;
    }

    public void setContent_name(String content_name) {
        this.content_name = content_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLecture_id() {
        return lecture_id;
    }

    public void setLecture_id(String lecture_id) {
        this.lecture_id = lecture_id;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
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
