package com.ls.words.controller;


import com.ls.words.dto.TFileStatistic;
import com.ls.words.dto.TRowStatistic;
import com.ls.words.model.FileStatistic;
import com.ls.words.model.RowStatistic;
import com.ls.words.service.StatisticService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.Param;

import java.util.List;

/**
 * Created by Sergey_PC on 25.02.2016.
 */

@Controller
@RequestMapping(value = "/statistic")
public class StatisticController {

    @Autowired
    private StatisticService statisticService;

    @ResponseStatus(value= HttpStatus.OK)
    @RequestMapping(value    = "/getAllFileStatistic", method = RequestMethod.GET,
                    headers  = {"Accept=application/json"},
                    produces = {"application/json"})
    public @ResponseBody List<TFileStatistic> getAllFilesStatistic() {
        return statisticService.getAll();
    }

    @ResponseStatus(value= HttpStatus.OK)
    @RequestMapping(value    = "/getFileStatistic", method = RequestMethod.GET,
                    headers  = {"Accept=application/json"},
                    produces = {"application/json"})
    public @ResponseBody TFileStatistic getFileStatistic(@RequestParam("id") Long id) {
        return statisticService.getById(id);
    }


    @ResponseStatus(value= HttpStatus.OK)
    @RequestMapping(value    = "/getRowsStatistic", method = RequestMethod.GET,
            headers  = {"Accept=application/json"},
            produces = {"application/json"})
    public @ResponseBody List<TRowStatistic> getRowsStatistic(@RequestParam("id") Integer id) {
        return statisticService.getAllRowsFileStatistic(id);
    }
}
