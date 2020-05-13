package com.hotstrip.my.guacamole.model;

import com.hotstrip.my.guacamole.commom.Const;

import java.util.HashMap;

public class R extends HashMap<String, Object> {
    public static R error(int code, String msg) {
        R r = new R();
        r.put(Const.CODE, code);
        r.put(Const.MSG, msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put(Const.CODE, 0);
        r.put(Const.MSG, msg);
        return r;
    }

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
