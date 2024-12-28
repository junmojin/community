package hello.community.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate; //LocalDateTime만 하니 2024-12-18T00:16:12.537212 이런 값 나와서 LocalDate로 바꿈


@Entity
public class Board {
    @Id @GeneratedValue
    private Long id;
    private String title; //제목 추가

    @Lob
    private String note;

    @CreationTimestamp
    private LocalDate createdAt;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getCreatedAt() {return createdAt; }
}
