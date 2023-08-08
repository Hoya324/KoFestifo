package ToyProject.KoFestifo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id")
	private Long id;

	@Enumerated(EnumType.STRING)
	private EventStatus status;

	private String main_img;

	@Column(length = 1000)
	private String org_link;
	private String title;
	private String place;
	@Column(length = 500)
	private String use_fee;
	private String date;
	private String codename;

	public Event(String main_img, String org_link,
		String title, String place, String use_fee, String date, String codename) {
		this.main_img = main_img;
		this.org_link = org_link;
		this.title = title;
		this.place = place;
		this.use_fee = use_fee;
		this.date = date;
		this.codename = codename;
	}
}
