package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {


    private static List<Event> events = new ArrayList();
    static{
        events.add(new Event("Mia's Birthday", "bday bsh"));
        events.add(new Event("Erica's Birthday", "bday bs"));
        events. add(new Event("Kev's Birthday", "bday bs"));
    }

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
       model.addAttribute("events", events);
        return "events/index";
    }
@GetMapping("create")
    public String renderCreateEventFrom(){

        return "events/create";
}
@PostMapping("create")
public String createEvent(@RequestParam String eventName, @RequestParam String eventDescription){
        events.add(new Event(eventName, eventDescription));;
        return "redirect:/events";
    }


}
