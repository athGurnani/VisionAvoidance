package com.visiondetector.cppmath;

public class NativeLib {

    // Used to load the 'cppmath' library on application startup.
    static {
        System.loadLibrary("cppmath");
    }

    /**
     * A native method that is implemented by the 'cppmath' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}