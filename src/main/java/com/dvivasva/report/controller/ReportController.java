package com.dvivasva.report.controller;

import com.dvivasva.report.model.AccountReport;
import com.dvivasva.report.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("/report")
public class ReportController {

    private  final ReportService reportService;

    @GetMapping
    public String message(){
        return "Hello developer";
    }

    @GetMapping("/listByCustomer/{id}")
    public ResponseEntity<Flux<AccountReport>> getAccountByCustomerId(@PathVariable("id") String id){
        Flux<AccountReport> accountReportFlux=reportService.getAccountByCustomerId(id);
        return new ResponseEntity<>(accountReportFlux, HttpStatus.OK);
    }
}
