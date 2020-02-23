package com.java.basics;

public class ExtendBasic {

    public ExtendBasic(){
        init();
    }

    private void init() {
        System.out.println("初始化构造器");
    }


}

class Sun extends ExtendBasic {

    /**
     * 默认会调用父类的构造函数，用于初始化子类初始化工作
     */
//    public Sun() {
//        super();
//    }

    public static void main(String[] args) {
        new Sun();
    }
}
