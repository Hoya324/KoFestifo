package ToyProject.KoFestifo.domain.member.entity;

import java.util.ArrayList;
import java.util.List;

import ToyProject.KoFestifo.domain.event.entity.RegisteredEvent;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id", nullable = false, unique = true)
	private Long id;

	@Column(unique = true)
	private String username;

	private String password;

	@Column(unique = true)
	private String email;

	@OneToMany(mappedBy = "member")
	private final List<RegisteredEvent> events = new ArrayList<>();

	public Member(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
}
