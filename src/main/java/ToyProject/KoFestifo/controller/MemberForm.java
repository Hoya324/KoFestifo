package ToyProject.KoFestifo.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {

  @NotEmpty(message = "회원 이름은 필수 입니다.")
  private String username;

  @NotEmpty(message = "비밀번호는 필수 입니다.")
  private String password;

  @NotEmpty(message = "이메일은 필수 입니다.")
  private String email;
}
