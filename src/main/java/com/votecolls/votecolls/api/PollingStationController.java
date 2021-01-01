package com.votecolls.votecolls.api;

import com.votecolls.votecolls.service.PollingStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/pollingstations")
@RestController
public class PollingStationController {
    private PollingStationService pollingStationService;

    @Autowired
    public PollingStationController(PollingStationService pollingStationService)
    {
        this.pollingStationService=pollingStationService;
    }
}
