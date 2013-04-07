package com.dianping.abtest;

import java.util.List;
import java.util.concurrent.locks.Condition;

public class ABTest {

    private int id;
    private String name;
    private String desc;
    private List<Condition> conditions;
    private List<TrafficDistributionStrategy> strategys;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public List<TrafficDistributionStrategy> getStrategys() {
        return strategys;
    }

    public void setStrategys(List<TrafficDistributionStrategy> strategys) {
        this.strategys = strategys;
    }

}
