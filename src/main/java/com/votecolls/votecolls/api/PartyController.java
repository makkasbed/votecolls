package com.votecolls.votecolls.api;

import com.votecolls.votecolls.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/parties")
@RestController
public class PartyController {
    private final PartyService partyService;

    @Autowired
    public PartyController(PartyService partyService)
    {
        this.partyService=partyService;
    }
}
