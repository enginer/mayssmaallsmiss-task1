package com.sattrans.origin;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: yurec
 * Date: 01.11.12
 * Time: 7:57
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "request_tag", schema = "", catalog = "origin-test")
@Entity
public class RequestTag {
    private long id;

    @javax.persistence.Column(name = "id")
    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String name;

    @javax.persistence.Column(name = "name")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String value;

    @javax.persistence.Column(name = "value")
    @Basic
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private long requestId;

    @javax.persistence.Column(name = "request_id")
    @Basic
    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    private int internal;

    @javax.persistence.Column(name = "internal")
    @Basic
    public int getInternal() {
        return internal;
    }

    public void setInternal(int internal) {
        this.internal = internal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestTag that = (RequestTag) o;

        if (id != that.id) return false;
        if (internal != that.internal) return false;
        if (requestId != that.requestId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (int) (requestId ^ (requestId >>> 32));
        result = 31 * result + internal;
        return result;
    }
}
