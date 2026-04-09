package com.sky.service;


import com.sky.dto.ShoppingCartDTO;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/9 14:17
 */

public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
