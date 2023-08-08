# 구현목록

## 회원

- [x] Member 객체
    - [x] id, username, password, email, 전체 리스트
- [x] MemberController
    - [x] 회원 생성 화면 연결 GET, POST
    - [x] 회원 목록 화면 연결 GET
- [x] MemberService
    - [x] 회원 저장
    - [x] 회원 조회
- [x] MemberRepository
    - [x] 회원 저장
    - [x] 회원 id로 단건조회
    - [x] 회원 name으로 다건조회
    - [x] 전체 조회


- date 확인 후 마감되었는지 판단
- 사용자가 로그인하면 event의 id 값으로 저장되어있는 이벤트의 Favorite 상태를 확인
- 무료인 것과 아닌것 상태 추가