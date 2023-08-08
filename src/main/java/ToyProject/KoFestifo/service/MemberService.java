package ToyProject.KoFestifo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ToyProject.KoFestifo.domain.Member;
import ToyProject.KoFestifo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService implements KofestifoService<Member> {

	private final MemberRepository memberRepository;

	@Override
	@Transactional
	public Long join(Member member) {
		validate(member);
		memberRepository.save(member);
		return member.getId();
	}

	@Override
	public List<Member> findMembers() {
		return memberRepository.findAll();
	}

	private void validate(Member member) {
		validateDuplicateMember(member);
	}

	private void validateDuplicateMember(Member member) {
		List<Member> findMembers = memberRepository.findByElement(member.getUsername());
		if (isDuplicated(findMembers)) {
			throw new IllegalStateException("[Error] 이미 존재하는 회원입니다.");
		}
	}

	private static boolean isDuplicated(List<Member> findMembers) {
		return !findMembers.isEmpty();
	}

}
