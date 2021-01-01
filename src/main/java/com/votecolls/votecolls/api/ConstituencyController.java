package com.votecolls.votecolls.api;

import com.votecolls.votecolls.service.ConstituencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/constituencies")
@RestController
public class ConstituencyController {
    private final ConstituencyService constituencyService;

    @Autowired
    public ConstituencyController(ConstituencyService constituencyService)
    {
        this.constituencyService=constituencyService;
    }
}
