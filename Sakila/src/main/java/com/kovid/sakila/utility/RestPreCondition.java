package com.kovid.sakila.utility;

public class RestPreCondition {
    public static <T> T checkFound(T resource) throws Exception {
        if (resource == null) {
            throw new Exception();
        }
        return resource;
    }
}
