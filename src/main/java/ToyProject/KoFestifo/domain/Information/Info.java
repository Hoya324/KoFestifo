package ToyProject.KoFestifo.domain.Information;

import lombok.Getter;
import lombok.Setter;

/**
 *          "org_name":null,
 *          "use_fee":"R 120,000 S 90,000 A 60,000 B 30,000 C 10,000",
 *          "player":"(지휘) 미하일 플레트뇨프, (협연) 선우예권",
 *          "org_link":"https://www.seoulphil.or.kr/perf/view?perfNo=5245&calendarDate=2023/06/29&langCd=ko&menuFlag=MFLG0001",
 *          "guname":"송파구",
 *          "main_img":"https://culture.seoul.go.kr/cmmn/file/getImage.do?atchFileId=0ca211044ff94618ac75427b299492f6&thumb=Y",
 *          "themecode":null,
 *          "date":"2023-06-29~2023-06-29",
 *          "etc_desc":null,
 *          "end_date":1687964400000,
 *          "title":"2023 서울시향 미하일 플레트뇨프와 선우예권 ①",
 *          "ticket":"기관",
 *          "codename":"클래식",
 *          "use_trgt":"홈페이지 참고",
 *          "program":null,
 *          "rgstdate":"2023-05-10",
 *          "strtdate":1687964400000,
 *          "place":"롯데콘서트홀"
 */


@Getter @Setter
public class Info {

    private String data;
    private String strtdate;
    private String end_date;
    private String title;
    private String codename;
    private String guname;
    private String main_img;
    private String org_link;
    private String use_fee;
    private String place;

    public Info(String data, String strtdate, String end_date,
                String title, String codename, String guname,
                String main_img, String org_link, String use_fee, String place) {
        this.data = data;
        this.strtdate = strtdate;
        this.end_date = end_date;
        this.title = title;
        this.codename = codename;
        this.guname = guname;
        this.main_img = main_img;
        this.org_link = org_link;
        this.use_fee = use_fee;
        this.place = place;
    }
}
