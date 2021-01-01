package com.votecolls.votecolls.api;

import com.votecolls.votecolls.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/candidates")
@RestController
public class CandidateController {
    private final CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService)
    {
        this.candidateService=candidateService;
    }
}
