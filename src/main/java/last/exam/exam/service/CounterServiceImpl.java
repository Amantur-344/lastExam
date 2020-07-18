package last.exam.exam.service;

import last.exam.exam.entity.Counter;
import last.exam.exam.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CounterServiceImpl implements CounterService {
    @Autowired
    private CounterRepository counterRepository;
    @Override
    public Integer getCounterNumber() {
        List<Counter> counterList = counterRepository.findAll();
        Integer count = counterList.size();
        return count;
    }

    @Override
    public Counter create(Counter counter) {
        return counterRepository.save(counter);
    }

    @Override
    public List<Counter> getAll() {
        return counterRepository.findAll();
    }
}
