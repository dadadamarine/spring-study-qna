package codesquad.net.slipp.web.exception;

public class AnswerNotFoundException extends RuntimeException{

    public AnswerNotFoundException(){
        super("ERROR : 해당 번째 답변이 존재하지 않습니다.");
    }

    public AnswerNotFoundException(Long answerId){
        super("ERROR : "+ answerId + "번째 답변이 존재하지 않습니다.");
    }

}
