package com.loanflow.rtgsservice.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record RTGSRequest(@NotBlank String fromAccount, @NotBlank String toAccount, @Min(200000) double amount) {
}
