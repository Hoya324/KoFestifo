package ToyProject.KoFestifo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public interface KofestifoService<T> {

	Long join(T element);

	List<T> findMembers();
}
