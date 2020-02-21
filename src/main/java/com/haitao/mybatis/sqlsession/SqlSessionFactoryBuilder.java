package com.haitao.mybatis.sqlsession;

import com.haitao.mybatis.cfg.Configuration;
import com.haitao.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.haitao.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @version 1.0.0
 * @ClassName SqlSessionFactoryBuilder
 * @Description TODO
 * @Author Tao
 * @Date 2020/2/20 16:15
 */
public class SqlSessionFactoryBuilder {

    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     *
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }
}
