package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
//        return 값이 html 파일명을 지정 (브라우에 나타나는 뷰의 논리적인 이름)
//        cf. p45 (ThymeleafProperties.class)
        return "home";
    }
}
