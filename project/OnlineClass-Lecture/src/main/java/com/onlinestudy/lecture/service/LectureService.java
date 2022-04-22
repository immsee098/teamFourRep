package com.onlinestudy.lecture.service;

import com.onlinestudy.lecture.domain.Lecture;
import com.onlinestudy.lecture.domain.LectureContent;
import com.onlinestudy.lecture.domain.LectureScore;
import com.onlinestudy.lecture.domain.StudyInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface LectureService {

    // 강의개설
    public Lecture createLecture(Map<String, String> param);

    // 강사 매칭
    public Map<String, String> matchingLecture(Map<String, String> param);

    // 강의 노출, 강의 노출 종료
    public Map<String, String> showLectureYn(String lecture_id);

    // 매칭된 강의 목록조회
    public List<Lecture> getMatchingLecture(Map<String, String> param);

    // 컨텐츠 업로드 - 시험, 강의
    public LectureContent uploadContent(Map<String, String> param);

    // 성적 입력
    public StudyInfo setTestScore(Map<String, String> param);

    // 수강신청
    public StudyInfo enrolment(Map<String, String> param);

    // 수강 강의 목록조회
    public List<StudyInfo> getMyLecture(String member_id);

    // 강의열람
    public Lecture viewLecture(Map<String, String> param);

    // 별점 평가
    public Map<String, String> setLectureScore(Map<String, String> param);

    // 별점 열람
    public LectureScore getLectureScore(Map<String, String> param);

}