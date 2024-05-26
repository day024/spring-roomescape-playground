# Spring JDBC 

<h3>5단계 요구사항</h3>

h2 데이터베이스를 활용하여 데이터를 저장하도록 수정
- [x] gradle 의존성 추가
- [x] 테이블 스키마 정의
- [x] 데이터베이스 설정
- [x] 요구 사항 테스트 진행

<h3>6단계 요구사항</h3>

예약 조회 API 처리 로직에서 저장된 예약을 조회할 때 데이터베이스를 활용하도록 수정
- [x] 데이터를 조회하는 기능을 구현
  - SQL - SELECT 쿼리 
  - JdbcTemplate
- [x] 요구 사항 테스트 추가

<h3>7단계 요구사항</h3>
데이터 추가/삭제하기

- [x] 예약 추가/취소 API 처리 로직에서 데이터베이스를 활용하도록 수정 
  - 기존에 사용하던 List 및 AtomicLong 제거
- [x] 요구 사항 테스트 추가
