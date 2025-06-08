package org.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/test")
    public String someMethod()
    {
        return "testowyugabuga";
    }
    @GetMapping("/GetUserData")
    public UserData metoda1()
    {
        return new UserData(1, "Jan", "Kowalski");
    }

}
