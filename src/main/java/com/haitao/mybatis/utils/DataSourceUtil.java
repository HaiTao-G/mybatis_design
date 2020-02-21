package com.haitao.mybatis.utils;

import com.haitao.mybatis.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @version 1.0.0
 * @ClassName DataSourceUtil
 * @Description TODO
 * @Author Tao
 * @Date 2020/2/20 16:17
 */
public class DataSourceUtil {

    /**
     * 用来获取连接
     *
     * @param cfg
     * @return
     */
    public static Connection getConnection(Configuration cfg) {
        try {
            Class.forName(cfg.getDriver());
            return DriverManager.getConnection(cfg.getUrl(), cfg.getUsername(), cfg.getPassword());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
