## 방탈출 어드민 애플리케이션

### 요구사항

- [x] 페이지 응답
    - [x] `/`에 GET 요청을 보내면 어드민 메인 페이지를 응답한다.
    - [x] `/reservation`에 GET 요청을 보내면 예약 페이지를 응답한다.
- [x] API 구현
    - [x] 예약 목록을 조회할 수 있다.
    - [x] 예약을 추가할 수 있다.
        - [x] 예약을 추가할 때 빈 값인 인자가 포함되어 있으면 상태코드 400을 반환한다.
    - [x] 예약을 삭제할 수 있다.
        - [x] 삭제하려는 id의 예약이 존재하지 않으면 상태코드 400을 반환한다.리