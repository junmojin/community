package hello.community.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Test {
    @Id @GeneratedValue
    private Long id;
    private String note;


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
}
