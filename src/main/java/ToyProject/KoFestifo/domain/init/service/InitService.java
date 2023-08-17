package ToyProject.KoFestifo.domain.init.service;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ToyProject.KoFestifo.domain.event.entity.Event;
import ToyProject.KoFestifo.domain.event.repository.EventRepository;
import ToyProject.KoFestifo.domain.init.util.DataManager;

@Service
public class InitService {

	private final EventRepository eventRepository;
	private final DataManager dataManager;

	public InitService(EventRepository eventRepository, DataManager dataManager) throws IOException, ParseException {
		this.eventRepository = eventRepository;
		this.dataManager = dataManager;
		dataManager.readJson();
	}

	public Page<Event> getPages(Pageable pageable) {
		int page = (pageable.getPageNumber() == 0) ? 0 : (pageable.getPageNumber() - 1);
		pageable = PageRequest.of(page, 40);

		return eventRepository.findAll(pageable);
	}
}
