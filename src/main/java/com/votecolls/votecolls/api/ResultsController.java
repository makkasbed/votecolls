package com.votecolls.votecolls.api;

import com.votecolls.votecolls.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/results")
@RestController
public class ResultsController {

    private ResultsService resultsService;

    @Autowired
    public ResultsController(ResultsService resultsService)
    {
        this.resultsService=resultsService;
    }
}
