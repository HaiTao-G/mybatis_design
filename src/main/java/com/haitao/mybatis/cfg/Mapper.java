package com.haitao.mybatis.cfg;

/**
 * @version 1.0.0
 * @ClassName Mapper
 * @Description TODO
 * @Author Tao
 * @Date 2020/2/20 16:14
 */
public class Mapper {

    private String queryString; // 要执行的sql语句
    private String resultType; // 实体类的全限定类名

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
