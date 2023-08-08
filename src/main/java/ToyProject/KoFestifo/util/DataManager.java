package ToyProject.KoFestifo.util;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

import ToyProject.KoFestifo.domain.Event;
import ToyProject.KoFestifo.service.KofestifoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequiredArgsConstructor
public class DataManager {

	private static final String FILENAME = "/Users/gangho/Desktop/projects/KoFestifo/src/main/resources/templates/data/seoulCulture.json";

	private final KofestifoService<Event> eventService;

	public void readJson() throws IOException, ParseException {
		log.info("home 페이지 진입");
		JSONParser jsonParser = new JSONParser();

		Reader reader = new FileReader(FILENAME);
		JSONObject culturalEventInfo = (JSONObject)jsonParser.parse(reader);

		JSONArray infoArray = (JSONArray)culturalEventInfo.get("DATA");
		int infoArraySize = infoArray.size();

		for (Object jsonObject : infoArray) {
			JSONObject currentJsonObject = (JSONObject)jsonObject;
			Event event = new Event((String)currentJsonObject.get("main_img"),
				(String)currentJsonObject.get("org_link"),
				(String)currentJsonObject.get("title"),
				(String)currentJsonObject.get("place"),
				(String)currentJsonObject.get("use_fee"),
				(String)currentJsonObject.get("date"),
				(String)currentJsonObject.get("codename"));
			eventService.join(event);
		}
	}
}
