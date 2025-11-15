package com.aashay.foodapp.service;

import com.aashay.foodapp.io.CartRequest;
import com.aashay.foodapp.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
