package art.atualiz.mongoproject.controlllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/home")
public class homeController {

 @GetMapping("")
 public String getMethodName() {
     return "Seja bem vindo :D";
 }

 
 
 
}