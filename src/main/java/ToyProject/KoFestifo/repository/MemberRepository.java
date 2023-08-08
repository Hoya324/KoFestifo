package ToyProject.KoFestifo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import ToyProject.KoFestifo.domain.Member;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

	private final EntityManager em;

	public void save(Member member) {
		em.persist(member);
	}

	public Member findOne(Long id) {
		return em.find(Member.class, id);
	}

	public List<Member> findByElement(String username) {
		return em.createQuery("SELECT m FROM Member m "
				+ "where m.username = :username", Member.class)
			.setParameter("username", username)
			.getResultList();
	}

	public List<Member> findAll() {
		return em.createQuery("SELECT m FROM Member m", Member.class)
			.getResultList();
	}
}
