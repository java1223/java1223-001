package com.offcn.cart.service;

import com.offcn.group.Cart;

import java.util.List;
//****************************java很好************

public interface CartService {
//**********hadjknga哈哈**********


    /**
     *添加商品到购物车
     * @param cartList 购物车集合
     * @param itemId 添加购物车的商品编号
     * @param num 添加到购物车商品数量
     * @return
     */
    public List<Cart> addGoodsToCartList(List<Cart> cartList, Long itemId, Integer num );


    /**
     * //从redis读取指定用户的购物车集合数据
     * @param username
     * @return
     */
    public List<Cart> findCartListFromRedis(String username);


    /**
     * //写入指定用户购物车集合数据到redis
     * @param username
     * @param cartList
     */
        public void saveCartListToRedis(String username,List<Cart> cartList);

        //合并购物车集合

    /**
     *
     * @param cookieCartlist
     * @param redisCartList
     * @return
     */
        public List<Cart> mergeCartList(List<Cart> cookieCartlist,List<Cart> redisCartList);


}

