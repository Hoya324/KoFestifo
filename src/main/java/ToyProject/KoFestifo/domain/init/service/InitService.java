package ToyProject.KoFestifo.domain.init.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ToyProject.KoFestifo.domain.event.entity.Event;
import ToyProject.KoFestifo.domain.event.repository.EventRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InitService {

	private final EventRepository eventRepository;

	public Page<Event> getInits(Pageable pageable) {
		int page = (pageable.getPageNumber() == 0) ? 0 : (pageable.getPageNumber() - 1);
		pageable = PageRequest.of(page, 40);

		return eventRepository.findAll(pageable);
	}
}
