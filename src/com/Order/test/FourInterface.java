package com.Order.test;

import java.util.List;

public class FourInterface {

    //实现一个接口，用来对四个管理进行操作
    public interface DAO<T>{
        //四个管理
        //增加
        void insert(T t);
        //通过ID查找
        T findById(String id);
        //全局查找
        List<T> findAll();
        //通过ID删除
        void delete(String id);
    }
}
