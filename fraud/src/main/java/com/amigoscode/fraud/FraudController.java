package com.amigoscode.fraud;

import org.springframework.web.bind.annotation.*;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@RestController
@RequestMapping("api/v1/fraud-check")
public record FraudController(FraudCheckService fraudCheckService) {

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster( @PathVariable(name = "customerId") Integer customerId ) {
        boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
