package com.example.springbootdubboserver.modul;

import java.util.Date;

public class Log {
    private String id;
    private String value;
    private String type;
    private Date time;
    private String ip;
    private String usetime;
    private String port;

    public Log() {
    }

    public Log(String id, String value, String type, Date time, String ip, String usetime, String port) {
        this.id = id;
        this.value = value;
        this.type = type;
        this.time = time;
        this.ip = ip;
        this.usetime = usetime;
        this.port = port;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUsetime() {
        return usetime;
    }

    public void setUsetime(String usetime) {
        this.usetime = usetime;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                ", time=" + time +
                ", ip='" + ip + '\'' +
                ", usetime='" + usetime + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
