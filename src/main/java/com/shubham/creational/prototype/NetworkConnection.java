package com.shubham.creational.prototype;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String data;

    public NetworkConnection(String ip, String data) {
        this.ip = ip;
        this.data = data;
    }

    public NetworkConnection() {
        this.ip = "default_ip";
        this.data = "default_data";
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public void loadData(){
        this.data="Very important data";
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
