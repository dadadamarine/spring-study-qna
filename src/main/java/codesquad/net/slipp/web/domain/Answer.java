package codesquad.net.slipp.web.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    @GeneratedValue
    @Getter
    private Long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_answer_to_question"))
    @Getter @Setter
    private Question question;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_answer_to_user"))
    @Getter @Setter
    private User writer;

    @Column(nullable = false, columnDefinition = "VARCHAR(200)")
    @Getter @Setter
    private String content;

    public boolean match(Answer answer) {
        return this.id == answer.id;
    }

    public void setInfo(Question question, User user) {
        this.setQuestion(question);
        this.setWriter(user);
    }
}