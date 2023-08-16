public class GarbageCollection {
    public void garbageCollection() throws Exception {
        Runtime rs = Runtime.getRuntime();
        System.out.println("Free memory in JVM before Garbage Collection = " + rs.freeMemory());
        rs.gc();
        System.out.println("Free memory in JVM after Garbage Collection = " + rs.freeMemory());
    }
}


/*  Every Java application has a single instance of class Runtime that allows the application to interface with the environment in which the application is running. The current runtime can be obtained from the getRuntime method.

An application cannot create its own instance of this class. */


/* getRuntime() method Returns the runtime object associated with the current Java application. Most of the methods of class Runtime are instance methods and must be invoked with respect to the current runtime object.

Returns:
    the Runtime object associated with the current Java application. */


/* gc() method Runs the garbage collector. Calling this method suggests that the Java virtual machine expend effort toward recycling unused objects in order to make the memory they currently occupy available for quick reuse. When control returns from the method call, the virtual machine has made its best effort to recycle all discarded objects.

The name gc stands for "garbage collector". The virtual machine performs this recycling process automatically as needed, in a separate thread, even if the gc method is not invoked explicitly.

The method System.gc() is the conventional and convenient means of invoking this method. */