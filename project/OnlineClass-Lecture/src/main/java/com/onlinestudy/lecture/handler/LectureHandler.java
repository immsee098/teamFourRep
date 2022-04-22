package com.onlinestudy.lecture.handler;

import com.onlinestudy.lecture.domain.Lecture;
import com.onlinestudy.lecture.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.HashMap;
import java.util.Map;

@Component
public class LectureHandler {

    @Autowired
    LectureService lectureService;

    // 강의개설
    public Mono<ServerResponse> createLectureHandler(ServerRequest request) {
        Map<String, Object> result = new HashMap<>();
        //lectureService... 서비스로직
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, Map.class);
    }

    // 강사 매칭
    public Mono<ServerResponse> matchingLectureHandler(ServerRequest request) {
        Map<String, Object> result = new HashMap<>();
        //lectureService... 서비스로직
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, Map.class);
    }

    // 강의 노출, 강의 노출 종료
    public Mono<ServerResponse> showLectureYnHandler(ServerRequest request) {
        Map<String, Object> result = new HashMap<>();
        //lectureService... 서비스로직
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, Map.class);
    }

    // 매칭된 강의 목록조회
    public Mono<ServerResponse> getMatchingLectureHandler(ServerRequest request) {
        Map<String, Object> result = new HashMap<>();
        //lectureService... 서비스로직
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, Map.class);
    }

    // 컨텐츠 업로드 - 시험, 강의
    public Mono<ServerResponse> uploadContentHandler(ServerRequest request) {
        Map<String, Object> result = new HashMap<>();
        //lectureService... 서비스로직
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, Map.class);
    }

    // 성적 입력
    public Mono<ServerResponse> setTestScoreHandler(ServerRequest request) {
        Map<String, Object> result = new HashMap<>();
        //lectureService... 서비스로직
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, Map.class);
    }

    // 수강신청
    public Mono<ServerResponse> enrolmentHandler(ServerRequest request) {
        Map<String, Object> result = new HashMap<>();
        //lectureService... 서비스로직
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, Map.class);
    }

    // 수강 강의 목록조회
    public Mono<ServerResponse> getMyLectureHandler(ServerRequest request) {
        Map<String, Object> result = new HashMap<>();
        //lectureService... 서비스로직
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, Map.class);
    }

    // 강의열람
    public Mono<ServerResponse> viewLectureHandler(ServerRequest request) {
        Map<String, Object> result = new HashMap<>();
        //lectureService... 서비스로직
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, Map.class);
    }

    // 별점 평가
    public Mono<ServerResponse> setLectureScoreHandler(ServerRequest request) {
        Map<String, Object> result = new HashMap<>();
        //lectureService... 서비스로직
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, Map.class);
    }

    // 별점 열람
    public Mono<ServerResponse> getLectureScoreHandler(ServerRequest request) {
        Map<String, Object> result = new HashMap<>();
        //lectureService... 서비스로직
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, Map.class);
    }
}
