package ToyProject.KoFestifo.domain.Information;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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


@Getter @Setter
public class EventInfo {

    private Long id;
    private String main_img;
    private String org_link;
    private String codename;
    private String title;
    private String place;
    private String use_fee;

    private String date;

    public EventInfo(Long id, String main_img, String org_link, String codename,
                     String title, String place, String use_fee, String date) {
        this.id = id;
        this.main_img = main_img;
        this.org_link = org_link;
        this.codename = codename;
        this.title = title;
        this.place = place;
        this.use_fee = use_fee;
        this.date = date;
    }
}
