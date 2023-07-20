# KoFestifo

### application.yml 설정
```
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://127.0.0.1:3306/DB명?serverTimezone=UTC&characterEncoding=UTF-8
    username: 유저이름
    password: 비밀번호

  jpa:
    hibernate:
      ddl-auto: create
    properties:
      hibernate:
        show_sql: true
        format_sql: true
    database: mysql
    show-sql: true

logging.level:
  org.hibernate.SQL: debug
  org.hibernate.orm.jdbc.bind: trace
```

## 화면구성

<img width="628" alt="스크린샷 2023-05-23 오전 12 56 11" src="https://github.com/Hoya324/KoFestifo/assets/96857599/29acf379-4ec5-4ae2-8264-6b2b8d664a69">

### Welcome 페이지 추가

<img width="1454" alt="스크린샷 2023-05-25 오전 11 14 32" src="https://github.com/Hoya324/KoFestifo/assets/96857599/9983030e-520b-4402-82fa-762d5e2a7f14">


<img width="1451" alt="스크린샷 2023-05-25 오전 11 14 48" src="https://github.com/Hoya324/KoFestifo/assets/96857599/c411d063-ccfa-4d54-b58a-aa7e67ce81f7">




