package com.loanflow.rtgsservice.service;

import com.loanflow.rtgsservice.model.RTGSRequest;
import com.loanflow.rtgsservice.model.RTGSResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class RTGSService {
    public RTGSResponse transfer(RTGSRequest request){
        if(request.amount()<200000){
            return new RTGSResponse("RTGS amount should be >=2 Lakhs",null);
        }
        String txnid= UUID.randomUUID().toString();
        return new RTGSResponse("RTGS Transfer Succesffully",txnid);
    }
}
