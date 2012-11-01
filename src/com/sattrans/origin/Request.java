package com.sattrans.origin;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: yurec
 * Date: 01.11.12
 * Time: 7:57
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Request {
    private long id;

    @javax.persistence.Column(name = "id")
    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String type;

    @javax.persistence.Column(name = "type")
    @Basic
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String status;

    @javax.persistence.Column(name = "status")
    @Basic
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Timestamp createdTime;

    @javax.persistence.Column(name = "created_time")
    @Basic
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    private Timestamp statusChangedAt;

    @javax.persistence.Column(name = "status_changed_at")
    @Basic
    public Timestamp getStatusChangedAt() {
        return statusChangedAt;
    }

    public void setStatusChangedAt(Timestamp statusChangedAt) {
        this.statusChangedAt = statusChangedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Request request = (Request) o;

        if (id != request.id) return false;
        if (createdTime != null ? !createdTime.equals(request.createdTime) : request.createdTime != null) return false;
        if (status != null ? !status.equals(request.status) : request.status != null) return false;
        if (statusChangedAt != null ? !statusChangedAt.equals(request.statusChangedAt) : request.statusChangedAt != null)
            return false;
        if (type != null ? !type.equals(request.type) : request.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (statusChangedAt != null ? statusChangedAt.hashCode() : 0);
        return result;
    }
}
