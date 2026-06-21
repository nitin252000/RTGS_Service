package com.loanflow.rtgsservice.service;

import com.loanflow.rtgsservice.model.RTGSRequest;
import com.loanflow.rtgsservice.model.RTGSResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RTGSServiceTest {
    private final static RTGSService service=new RTGSService();
    @Test
    void transferSuccessTest(){
        RTGSRequest request=new RTGSRequest("1111111","2222222",500000);
        RTGSResponse response=service.transfer(request);
        assertEquals("RTGS Transfer Successfully",response.message());
    assertNotNull(response.transactionId());
    }

}
