package ToyProject.KoFestifo.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class MemberDTO {

	@NotEmpty(message = "회원 이름은 필수 입니다.")
	private String username;

	@NotEmpty(message = "비밀번호는 필수 입니다.")
	private String password;

	@NotEmpty(message = "이메일은 필수 입니다.")
	private String email;
}
