package com.quancheng.saluki.monitor;

import java.io.Serializable;

public class SalukiInvokeStatistics implements Serializable {

    private static final long serialVersionUID = -3469058277385014626L;

    private Long              invokeDate;

    private Double            tps;

    private Double            kbps;

    public Long getInvokeDate() {
        return invokeDate;
    }

    public void setInvokeDate(Long invokeDate) {
        this.invokeDate = invokeDate;
    }

    public Double getTps() {
        return tps;
    }

    public void setTps(Double tps) {
        this.tps = tps;
    }

    public Double getKbps() {
        return kbps;
    }

    public void setKbps(Double kbps) {
        this.kbps = kbps;
    }

}
