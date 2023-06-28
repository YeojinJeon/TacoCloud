package tacos;

import lombok.Data;

import java.util.List;

/*
 * 타코 디자인을 정의하는 도메인 객체
 */
@Data
public class Taco {
    private String name;
    private List<String> ingredients;
}
