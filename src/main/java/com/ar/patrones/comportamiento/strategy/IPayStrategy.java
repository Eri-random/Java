package com.ar.patrones.comportamiento.strategy;

public interface IPayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
