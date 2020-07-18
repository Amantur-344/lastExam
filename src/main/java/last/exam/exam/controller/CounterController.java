package last.exam.exam.controller;

import last.exam.exam.entity.Counter;
import last.exam.exam.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class CounterController {
    @Autowired
    private CounterService counterService;

    @PostMapping("/counter")
    public Counter create(Counter counter){
        Counter counter1 = new Counter();
        return new ResponseEntity<>("Post request accepted", HttpStatus.OK);//тот кусок кода не работает но должно было быть как так
    }

    @GetMapping("/counter")
    public Integer getCounterNumber(){
        Integer counter = counterService.getCounterNumber();
        return counter;
    }
    @GetMapping(" /report ")
    public List<Counter> getAll(){
        counterService.getAll();
    }
}
