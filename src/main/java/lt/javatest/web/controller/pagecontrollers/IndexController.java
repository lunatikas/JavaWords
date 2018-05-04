package lt.javatest.web.controller.pagecontrollers;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@ImportAutoConfiguration
@Controller
public class IndexController {
    @GetMapping(value = "/")
    String index(Model model) {
        return "index";
    }
}
