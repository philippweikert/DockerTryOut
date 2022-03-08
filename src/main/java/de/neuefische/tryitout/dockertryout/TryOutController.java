package de.neuefische.tryitout.dockertryout;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greetings")
public class TryOutController {

    @GetMapping ("/{name}")
    public String greetPeople (@PathVariable String name){
        return "Moinsen " + name;
    }

    @PostMapping("morePeople")
    public String morePeople(@RequestBody String input){
        return input;
    }
}
