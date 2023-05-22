package ToyProject.KoFestifo.Repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InfoRepository {

    private static final Map<Long, String> store = new HashMap<>();

    private static long sequence = 0l;


}
