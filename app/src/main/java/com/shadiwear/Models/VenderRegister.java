package com.shadiwear.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VenderRegister {

    @SerializedName("data")
    @Expose
    private Boolean data;
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("msg")
    @Expose
    private String msg;

    /**
     * No args constructor for use in serialization
     */
    public VenderRegister() {
    }

    public VenderRegister(Boolean data, Boolean status, String msg) {
        super();
        this.data = data;
        this.status = status;
        this.msg = msg;
    }

    public Boolean getData() {
        return data;
    }

    public void setData(Boolean data) {
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }



    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "VenderRegisterResponse{" +
                "data=" + data +
                ", status=" + status +
                ", msg='" + msg + '\'' +
                '}';
    }
}