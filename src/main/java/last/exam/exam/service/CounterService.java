package last.exam.exam.service;

import last.exam.exam.entity.Counter;

import java.time.LocalDateTime;
import java.util.List;

public interface CounterService {
    Integer getCounterNumber();
    Counter create(Counter counter);
    List<Counter> getAll();
}
