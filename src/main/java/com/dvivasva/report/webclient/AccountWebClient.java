package com.dvivasva.report.webclient;

import com.dvivasva.report.model.AccountReport;
import com.dvivasva.report.util.UriAccess;
import com.dvivasva.report.util.UriBase;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.Collections;

@Service
public class AccountWebClient {

    WebClient client = WebClient.builder()
            .baseUrl(UriBase.LOCALHOST_8889)
            .defaultCookie("cookieKey", "cookieValue")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .defaultUriVariables(Collections.singletonMap("url", UriBase.LOCALHOST_8889))
            .build();

    public Flux<AccountReport> getAccountByCustomerId(String customerId){
        Flux<AccountReport> alerts = client.get()
                .uri(UriBase.LOCALHOST_8889+ UriAccess.ACCOUNT +"listByCustomer/"+customerId)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux( AccountReport.class )
                .log();
        return alerts;
    }
}
