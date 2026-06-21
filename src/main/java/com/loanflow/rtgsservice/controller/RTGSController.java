package com.loanflow.rtgsservice.controller;

import com.loanflow.rtgsservice.model.RTGSRequest;
import com.loanflow.rtgsservice.model.RTGSResponse;
import com.loanflow.rtgsservice.service.RTGSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rtgs")
public class RTGSController {
    @Autowired
    private RTGSService rtgsService;
    @PostMapping("/transfer")
    public RTGSResponse transfer(@RequestBody RTGSRequest request){
        return rtgsService.transfer(request);
    }
    @GetMapping("/transfer")
    public String transfer(){
        return "RTGS transfer successfully";
    }
}
