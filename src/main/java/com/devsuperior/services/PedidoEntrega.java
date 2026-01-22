package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class PedidoEntrega {
    public double taxa( double amount) {
        return amount * 0.2;
    }
}
