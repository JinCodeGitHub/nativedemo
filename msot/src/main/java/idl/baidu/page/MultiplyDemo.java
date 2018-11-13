package idl.baidu.page;/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */


import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.annotation.Platform;


@Platform(include= "idl/baidu/cpp/NativeLibrary.h",link="idl.baidu.cpp.idl.baidu.page.MultiplyDemo")
public class MultiplyDemo {

    static {
        Loader.load();
    }

    public static native int multiply(int a, int b);


}