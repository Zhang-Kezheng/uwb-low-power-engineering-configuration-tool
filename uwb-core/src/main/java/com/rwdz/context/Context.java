package com.rwdz.context;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * @author 章可政
 * @date 2021/6/10 20:48
 * 所有上下文的基类
 */
@JsonNaming(PropertyNamingStrategy.LowerCaseStrategy.class)
public abstract class Context {
    /**
     * id
     */
    protected int id;
    /**
     * 名称
     */
    protected String name;
}
