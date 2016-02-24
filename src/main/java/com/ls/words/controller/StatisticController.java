package com.ls.words.controller;

import javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Sergey_PC on 25.02.2016.
 */

@Controller
@RequestMapping(value = "/statistic")
public class StatisticController {
    @RequestMapping(value    = "/getFileStatistic", method = RequestMethod.GET,
            headers  = {"Accept=application/json"},
            produces = {"application/json"})
    public @ResponseBody String get() throws NotFoundException {
        return "Test";
    }
}
