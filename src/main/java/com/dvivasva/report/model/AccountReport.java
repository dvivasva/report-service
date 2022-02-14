package com.dvivasva.report.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountReport {

    private String id;
    private String typeAccount;
    private String numberAccount;
    private int keyAccount;
    private double availableBalanceAccount;
    private String dateCreationAccount;
    private String statusAccount;
    private int idClerkCreation;
    private String customerId;
}
