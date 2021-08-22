package com.example.android.data;

import org.reactivestreams.Subscription;

import java.math.BigDecimal;
import java.util.ArrayList;

public class UserWallet {

    // 개인 계좌 정보
    private String address;

    // 개인 계좌 잔액
    private BigDecimal ether;

    // 개인 거래 내역
    private Subscription history;

    public UserWallet() {
    }

    public UserWallet(String address, BigDecimal ether, Subscription history) {
        this.address = address;
        this.ether = ether;
        this.history = history;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getEther() {
        return ether;
    }

    public void setEther(BigDecimal ether) {
        this.ether = ether;
    }

    public Subscription getHistory() {
        return history;
    }

    public void setHistory(Subscription history) {
        this.history = history;
    }
}
