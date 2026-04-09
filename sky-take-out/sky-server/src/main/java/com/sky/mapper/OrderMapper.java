package com.sky.mapper;


import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/9 18:18
 */
@Mapper
public interface OrderMapper {

    /**
     * 插入订单数据
     * @param order
     */
    void insert(Orders order);
}
