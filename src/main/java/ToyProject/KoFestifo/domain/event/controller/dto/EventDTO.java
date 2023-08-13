package ToyProject.KoFestifo.domain.event.controller.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class EventDTO {

	private String main_img;
	private String org_link;
	private String title;
	private String place;
	private String use_fee;
	private String date;
	private String codename;
}
