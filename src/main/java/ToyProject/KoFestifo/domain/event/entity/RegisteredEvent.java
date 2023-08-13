package ToyProject.KoFestifo.domain.event.entity;

import ToyProject.KoFestifo.domain.member.entity.Member;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor
public class RegisteredEvent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "registeredEvent_id")
	private Long id;

	@Enumerated(EnumType.STRING)
	private EventStatus status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private Member member;

	private String main_img;
	private String org_link;
	private String title;
	private String place;
	private String use_fee;
	private String date;
	private String codename;

	public RegisteredEvent(Long id, String main_img, String org_link,
		String title, String place, String use_fee, String date, String codename) {
		this.id = id;
		this.main_img = main_img;
		this.org_link = org_link;
		this.title = title;
		this.place = place;
		this.use_fee = use_fee;
		this.date = date;
		this.codename = codename;
	}
}
