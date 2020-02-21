package com.haitao.mybatis.sqlsession.defaults;

import com.haitao.mybatis.cfg.Configuration;
import com.haitao.mybatis.sqlsession.SqlSession;
import com.haitao.mybatis.utils.DataSourceUtil;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @version 1.0.0
 * @ClassName DefaultSqlSession
 * @Description TODO
 * @Author Tao
 * @Date 2020/2/20 18:02
 */
public class DefaultSqlSession implements SqlSession {
    private Configuration cfg;

    private Connection connection;

    public DefaultSqlSession(Configuration cfg) {
        this.cfg = cfg;
        connection = DataSourceUtil.getConnection(cfg);
    }

    /**
     * 用于创建代理对象
     *
     * @param daoInterfaceClass dao接口的字节码
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        return (T) Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(),
                new Class[]{daoInterfaceClass}, new MapperProxy(cfg.getMappers(), connection));
    }

    /**
     * 用于释放资源
     */
    public void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
