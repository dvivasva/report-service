package com.dvivasva.report.inter;

import com.dvivasva.report.model.AccountReport;
import reactor.core.publisher.Flux;

public interface AccountClient {

   // @GetMapping("listByCustomer/{id}")
    Flux<AccountReport> getAccountByCustomerId(String customerId);
}
