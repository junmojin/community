package hello.community.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate; //LocalDateTime만 하니 2024-12-18T00:16:12.537212 이런 값 나와서 LocalDate로 바꿈
import java.time.LocalDateTime;

@Entity
public class Test {
    @Id @GeneratedValue
    private Long id;
    @Lob
    private String note;

    @CreationTimestamp
    private LocalDate createdAt;

    public Long getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedAt() {return createdAt; }
}
