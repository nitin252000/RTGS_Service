package com.loanflow.rtgsservice.controller;

import com.loanflow.rtgsservice.model.RTGSRequest;
import com.loanflow.rtgsservice.model.RTGSResponse;
import com.loanflow.rtgsservice.service.RTGSService;
import org.hibernate.validator.constraints.Mod10Check;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RTGSControllerTest {
    @Mock
    private RTGSService service;
    @InjectMocks
    private RTGSController controller;
    RTGSControllerTest(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void transferRequest(){
        RTGSRequest request=new RTGSRequest("1111111","2222222",500000);
        RTGSResponse mockresponse=new RTGSResponse("RTGS Transfer Successfully","TXN123");
        when(service.transfer(request)).thenReturn(mockresponse);
        RTGSResponse response=controller.transfer(request);
        assertEquals("TXN123",response.transactionId());
        verify(service,times(1)).transfer(request);
    }
}
