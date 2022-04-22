# DDD설계 4팀 취합

## 1. 도메인 모델 그리기
![도메인](https://user-images.githubusercontent.com/53042885/164647974-3815559b-298f-44f7-b7ba-d67c26d89320.jpg)

## 2. MSA 설계하기
#### a) Entity&Value Object
![엔티티](https://user-images.githubusercontent.com/53042885/164648463-b47d5977-7357-4aad-b090-4bf4681bdd97.png)

#### b) 계획
- API Gateway→to 각 도메인별
- DB는 한 개, 스키마만 분리
- 한 도메인/서비스 당 스키마를 하나만 보게 최대한 분리
- 도메인 분리 기준은 유사 기능/같은 스키마를 볼 수 있는 기능끼리
- 로그인은 oauth2 서버를 두고 JWT토큰 발급


![설계](https://aboutyhs1.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fee7e6e63-803f-4ed8-88fc-a97f1f9c7589%2Fs.drawio.png?table=block&id=d6c82853-290d-491f-a40d-e0ce700a288c&spaceId=2d170995-884c-45e9-8e7b-86359b2e2ef9&width=1120&userId=&cache=v2)


#### c) 도메인
##### 도메인 정의
- 회원
  - 사이트 운영자: 사전 정의
  - 강사: 사이트 운영자가 정의
  - 학생: 직접 회원 가입 
- 강의
  - 생성 및 운영: 사이트 운영자
  - 컨텐츠 관리: 강사
  - 열람 및 별점: 학생
- 게시판
  - 작성 및 열람: 모두
  - 관리: 사이트 운영자


##### 도메인 분리
- 회원 관리
  - 사이트 운영자: 사전 정의
  - 강사: 사이트 운영자가 정의
  - 학생: 직접 회원 가입
- 강의 관리
  - 생성 및 운영: 사이트 운영자
  - 컨텐츠 관리: 강사
  - 열람 및 별점: 학생
- 게시판 관리
  - 작성 및 열람: 모두
  - 관리: 사이트 운영자




## 3. REST-API 설계
: https://aboutyhs1.notion.site/327bb472f2ca40978e30caf62f132be8

## 4. 각 Domain App의 Service Interface 정의하기

Lecture : https://github.com/immsee098/teamFourRep/tree/main/project/OnlineClass-Lecture

Member : https://github.com/immsee098/teamFourRep/tree/main/project/OnlineClass-Member

NoticeBoard : https://github.com/immsee098/teamFourRep/tree/main/project/OnlineClass-NoticeBoard
