package ToyProject.KoFestifo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import ToyProject.KoFestifo.domain.Event;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class EventRepository {

	private final EntityManager em;

	public void save(Event event) {
		em.persist(event);
	}

	public Event findOne(Long id) {
		return em.find(Event.class, id);
	}

	public List<Event> findByElement(String title) {
		return em.createQuery("SELECT e FROM Event e "
				+ "where e.title = :title", Event.class)
			.setParameter("title", title)
			.getResultList();
	}

	public List<Event> findAll() {
		return em.createQuery("SELECT e FROM Event e", Event.class)
			.getResultList();
	}
}
