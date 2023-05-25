package ToyProject.KoFestifo.Repository;

import ToyProject.KoFestifo.domain.Information.EventInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 사용자가 저장할 repository
@Repository @Slf4j
public class UserSetEventInfoRepository {

    private static final Map<Long, EventInfo> store = new HashMap<>();

    private static long sequence = 0l;

    public EventInfo save(EventInfo eventInfo) {
        sequence++;
        if (sequence > 99) {
            log.info("save 실패");
            return eventInfo;
        }
        eventInfo.setId(++sequence);
        store.put(eventInfo.getId(), eventInfo);
        return eventInfo;
    }

    public EventInfo findById(Long id) {
        return store.get(id);
    }

    public List<EventInfo> findAll() {
        return new ArrayList<>(store.values());
    }

//    수정 메서드(각 상품 id를 url 경로로 설정해서, 해당 상세정보에서 그 행사을 수정)
    public void update(Long EventInfoId, EventInfo updateParam) {
        EventInfo findEvent = findById(EventInfoId);
        findEvent.setTitle(updateParam.getTitle());
        findEvent.setCodename(updateParam.getCodename());
        findEvent.setPlace(updateParam.getPlace());
        findEvent.setOrg_link(updateParam.getOrg_link());
        findEvent.setUse_fee(updateParam.getUse_fee());
        findEvent.setMain_img(updateParam.getMain_img());
        findEvent.setDate(updateParam.getDate());
    }


//    테스트용 store 클리어

    public void clearStore() {
        store.clear();
    }


}
