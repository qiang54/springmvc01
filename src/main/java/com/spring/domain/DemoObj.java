package com.spring.domain;

/**
 * Created with IntelliJ IDEA.
 * User qiang
 * Date 2018/7/24 17:20
 * To change this template use File | Settings | File Templates.
 */
public class DemoObj {

    private int id;
    private String name;

    /**
     jackson和json转换时，必须有以下构造函数
     *
     */
    public DemoObj() {
        super();
    }

    public DemoObj(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "DemoObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
