package com.dvivasva.report.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AccountReport {

    private String id;
    private String type;
    private String number;
    private double availableBalance;
    private Date dateCreation;
    private String status;
    private String customerId;
}
