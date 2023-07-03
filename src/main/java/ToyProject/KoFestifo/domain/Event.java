package ToyProject.KoFestifo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Event {

    @Id @GeneratedValue
    @Column(name = "event_id")
    private Long id;

    private String main_img;
    private String org_link;
    private String title;
    private String place;
    private String use_fee;
    private String date;
    private String codename;

    @Enumerated(EnumType.STRING)
    private EventStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    /**
     * date를 이용해서 D-day 만들기
     */


}
