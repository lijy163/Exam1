package com.hand.dto;

/**
 * @author shuai.wang02@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/7/18 16:18
 */
public abstract class IdEntity {
    protected long id;

    public IdEntity() {
    }

    public IdEntity(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
