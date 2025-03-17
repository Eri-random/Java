package com.ar.patrones_guru.comportamiento.strategy;

public interface IPayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
