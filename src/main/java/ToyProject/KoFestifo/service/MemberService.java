package ToyProject.KoFestifo.service;

import ToyProject.KoFestifo.domain.Member;
import ToyProject.KoFestifo.repository.MemberRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

  private final MemberRepository memberRepository;

  @Transactional
  public Long join(Member member) {
    validate(member);
    memberRepository.save(member);
    return member.getId();
  }

  public List<Member> findMembers() {
    return memberRepository.findAll();
  }

  private void validate(Member member) {
    validateDuplicateMember(member);
  }

  private void validateDuplicateMember(Member member) {
    List<Member> findMembers = memberRepository.findByName(member.getUsername());
    if (isDuplicated(findMembers)) {
      throw new IllegalStateException("[Error] 이미 존재하는 회원입니다.");
    }
  }

  private static boolean isDuplicated(List<Member> findMembers) {
    return !findMembers.isEmpty();
  }

}
