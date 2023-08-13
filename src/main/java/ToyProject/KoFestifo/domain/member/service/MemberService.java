package ToyProject.KoFestifo.domain.member.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ToyProject.KoFestifo.domain.member.entity.Member;
import ToyProject.KoFestifo.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;

	@Transactional
	public Long join(Member member) {
		// validate(member);
		memberRepository.save(member);
		return member.getId();
	}

	public List<Member> findMembers() {
		return memberRepository.findAll();
	}

	// private void validate(Member member) {
	// 	validateDuplicateMember(member);
	// }
	//
	// private void validateDuplicateMember(Member member) {
	// 	Optional<Member> findMembers = memberRepository.findById(member.getId());
	// 	if (isDuplicated(findMembers)) {
	// 		throw new IllegalStateException("[Error] 이미 존재하는 회원입니다.");
	// 	}
	// }
	//
	// private static boolean isDuplicated(Optional<Member> findMembers) {
	// 	return findMembers.isEmpty();
	// }

}
