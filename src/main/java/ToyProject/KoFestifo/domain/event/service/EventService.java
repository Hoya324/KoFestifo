package ToyProject.KoFestifo.domain.event.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ToyProject.KoFestifo.domain.event.entity.Event;
import ToyProject.KoFestifo.domain.event.repository.EventRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventService {

	private final EventRepository eventRepository;

	@Transactional
	public Long join(Event event) {
		eventRepository.save(event);
		return event.getId();
	}

	public List<Event> findEvents() {
		return eventRepository.findAll();
	}
}
