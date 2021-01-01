package com.votecolls.votecolls.api;

import com.votecolls.votecolls.service.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/elections")
@RestController
public class ElectionController {
    private  final ElectionService electionService;

    @Autowired
    public ElectionController(ElectionService electionService)
    {
        this.electionService=electionService;
    }
}
