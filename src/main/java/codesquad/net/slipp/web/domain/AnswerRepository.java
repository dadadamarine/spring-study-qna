package codesquad.net.slipp.web.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AnswerRepository extends CrudRepository<Answer, Long> {

    List<Answer> findByQuestionId(long questionId);

    Optional<Answer> findById(long id);
}

