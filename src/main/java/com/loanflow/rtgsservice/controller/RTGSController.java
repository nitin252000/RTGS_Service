package com.loanflow.rtgsservice.controller;

import com.loanflow.rtgsservice.model.RTGSRequest;
import com.loanflow.rtgsservice.model.RTGSResponse;
import com.loanflow.rtgsservice.service.RTGSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rtgs")
public class RTGSController {
    @Autowired
    private RTGSService rtgsService;
    @PostMapping("/transfer")
    public RTGSResponse transfer(@RequestBody RTGSRequest request){
        return rtgsService.transfer(request);
    }
}
