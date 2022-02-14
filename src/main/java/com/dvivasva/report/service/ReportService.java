package com.dvivasva.report.service;

import com.dvivasva.report.inter.AccountClient;
import com.dvivasva.report.model.AccountReport;
import com.dvivasva.report.webclient.AccountWebClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class ReportService  implements AccountClient {

    public final AccountWebClient accountWebClient;

    @Override
    public Flux<AccountReport> getAccountByCustomerId(String customerId) {
        return accountWebClient.getAccountByCustomerId(customerId);
    }

    // Transferencias


}
