package com.haitao.mybatis.sqlsession.defaults;

import com.haitao.mybatis.cfg.Configuration;
import com.haitao.mybatis.sqlsession.SqlSession;
import com.haitao.mybatis.sqlsession.SqlSessionFactory;

/**
 * @version 1.0.0
 * @ClassName DefaultSqlSessionFactory
 * @Description TODO
 * @Author Tao
 * @Date 2020/2/20 17:57
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }

    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
