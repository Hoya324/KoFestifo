package ToyProject.KoFestifo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ToyProject.KoFestifo.domain.Event;
import ToyProject.KoFestifo.repository.EventRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventService implements KofestifoService<Event> {

	private final EventRepository eventRepository;

	@Override
	@Transactional
	public Long join(Event event) {
		eventRepository.save(event);
		return event.getId();
	}

	@Override
	public List<Event> findMembers() {
		return eventRepository.findAll();
	}
}
