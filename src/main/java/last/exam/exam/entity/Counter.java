package last.exam.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "counter")
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "local_date_time", nullable = false)
    private LocalDateTime localDateTime;
    @PrePersist
    public void persistCreate(){
        this.localDateTime = LocalDateTime.now();
    }
}
