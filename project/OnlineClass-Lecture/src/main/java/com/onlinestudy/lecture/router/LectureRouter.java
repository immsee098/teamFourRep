package com.onlinestudy.lecture.router;

import com.onlinestudy.lecture.handler.LectureHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

@Configuration(proxyBeanMethods = false)
public class LectureRouter {

    LectureHandler lectureHandler = new LectureHandler();

    @Bean
    public RouterFunction<ServerResponse> route() {
        return RouterFunctions
                .route(POST("/lecture/operator/create"), lectureHandler::createLectureHandler)              // 강의개설
                .andRoute(POST("/lecture/operator/matching"), lectureHandler::matchingLectureHandler)       // 강사 매칭
                .andRoute(POST("/lecture/operator/show"), lectureHandler::showLectureYnHandler)             // 강의 노출, 강의 노출 종료
                .andRoute(GET("/lecture/teacher/matching/get"), lectureHandler::getMatchingLectureHandler)  // 매칭된 강의 목록조회
                .andRoute(POST("/lecture/teacher/upload"), lectureHandler::uploadContentHandler)            // 컨텐츠 업로드 - 시험, 강의
                .andRoute(POST("/lecture/teacher/score/set"), lectureHandler::setTestScoreHandler)          // 성적 입력
                .andRoute(POST("/lecture/student/enrolment"), lectureHandler::enrolmentHandler)             // 수강신청
                .andRoute(POST("/lecture/student/study/list"), lectureHandler::getMyLectureHandler)         // 수강 강의 목록조회
                .andRoute(POST("/lecture/student/study/view"), lectureHandler::viewLectureHandler)          // 강의열람
                .andRoute(POST("/lecture/score/set"), lectureHandler::setLectureScoreHandler)               // 별점 평가
                .andRoute(POST("/lecture/score/get"), lectureHandler::getLectureScoreHandler)               // 별점 열람
                ;
    }
}
