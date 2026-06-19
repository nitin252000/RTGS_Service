package com.loanflow.rtgsservice.model;

public class RTGSResponse {
    private String message;
    private String transactionId;

    public RTGSResponse(String message, String transactionId) {
        this.message = message;
        this.transactionId = transactionId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
