package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {


    private static HashMap<String,String> events = new HashMap();

    static {
        events.put("Mia's birthday", "Mia's 5th birthday bash");
        events.put("Erica's birthday", "Erica's 42nd birthday bash ");
        events.put("Kevin's birthday", "Kevin's 28th birthday bash");
    }
    @GetMapping
    public String displayAllEvents(Model model) {
       model.addAttribute("events", events);
        return "events/index";
    }
@GetMapping("create")
    public String renderCreateEventFrom(){

        return "events/create";
}
@PostMapping("create")
public String createEvent(@RequestParam String eventName, String descriptionName){
        events.put(eventName,descriptionName);
        return "redirect:/events";
    }


}
