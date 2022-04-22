package com.onlinestudy.lecture.webclient;

import com.onlinestudy.lecture.domain.Lecture;
import com.onlinestudy.lecture.domain.LectureContent;
import com.onlinestudy.lecture.domain.LectureScore;
import com.onlinestudy.lecture.domain.StudyInfo;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class LectureWebClient {

    private final WebClient client;
    public LectureWebClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8081").build();
    }

}
