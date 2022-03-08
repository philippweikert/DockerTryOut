package de.neuefische.tryitout.dockertryout;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
public class TryOutController {

    @GetMapping ("/{name}")
    public String greetPeople (@PathVariable String name){
        return "Moinsen " + name;
    }
}
