package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private Greeter greeter1;

    @Autowired
    private FriendlyGreeter friendlyGreeter1;

    @Autowired
    private Greeter greeter2;

    @Autowired
    private FriendlyGreeter friendlyGreeter2;

    @Autowired
    private GreetInterface greetAgain;

    @Autowired(required = false)
    private NotActuallyABean notABean;

    @RequestMapping("/hello1")
    public String hello1() {
        return greeter1.greet();
    }

    @RequestMapping("/hellofriendly1")
    public String helloFriendly1() {
        return friendlyGreeter1.greet();
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return greeter2.greet();
    }

    @RequestMapping("/hellofriendly2")
    public String helloFriendly2() {
        return friendlyGreeter2.greet();
    }

    @RequestMapping("/helloagain")
    public String helloAgain() { return greetAgain.greet(); }

}
