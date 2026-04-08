package com.sky.service;


import com.sky.dto.DishDTO;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/8 8:01
 */

public interface DishService {

    /**
     * 新增菜品和对应的口味
     *
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
