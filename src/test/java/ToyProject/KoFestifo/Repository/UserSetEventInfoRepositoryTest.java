package ToyProject.KoFestifo.Repository;

import ToyProject.KoFestifo.domain.Information.EventInfo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class UserSetEventInfoRepositoryTest {

    UserSetEventInfoRepository userSetEventRepository = new UserSetEventInfoRepository();

//  테스트마다 정보 초기화
    @AfterEach
    void afterEach() {
        userSetEventRepository.clearStore();
    }


    /**
     *          "org_name":null,
     *          "org_link":"https://www.seoulphil.or.kr/perf/view?perfNo=5245&calendarDate=2023/06/29&langCd=ko&menuFlag=MFLG0001",
     *          "use_fee":"R 120,000 S 90,000 A 60,000 B 30,000 C 10,000",
     *          "main_img":"https://culture.seoul.go.kr/cmmn/file/getImage.do?atchFileId=0ca211044ff94618ac75427b299492f6&thumb=Y",
     *          "date":"2023-06-29~2023-06-29",
     *          "title":"2023 서울시향 미하일 플레트뇨프와 선우예권 ①",
     *          "codename":"클래식",
     *          "place":"롯데콘서트홀"
     */
    @Test
    void save() {
//        given
        EventInfo eventInfo = new EventInfo(0L, "https://culture.seoul.go.kr/cmmn/file/getImage.do?atchFileId=0ca211044ff94618ac75427b299492f6&thumb=Y,",
                "https://www.seoulphil.or.kr/perf/view?perfNo=5245&calendarDate=2023/06/29&langCd=ko&menuFlag=MFLG0001",
                "클래식", "2023 서울시향 미하일 플레트뇨프와 선우예권 ①","롯데콘서트홀", "R 120,000 S 90,000 A 60,000 B 30,000 C 10,000", "2023-06-29~2023-06-29");
//        when
        EventInfo savedEvent = userSetEventRepository.save(eventInfo);
//        then

        Assertions.assertThat(userSetEventRepository.findById(eventInfo.getId())).isEqualTo(savedEvent);
    }



}
