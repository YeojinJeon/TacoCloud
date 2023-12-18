package tacos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Date;

/*
 * 타코 디자인을 정의하는 도메인 객체
 */
@Data
public class Taco {

    //퍼시스턴트를 고려한 도메인 객체 수정
    private Long id;
    private Date createdAt;

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<String> ingredients;
}
