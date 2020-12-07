package com.gz.design.flyweight;

import java.util.HashMap;

//网站工厂类,根据需求返回网站
public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    public void getCount() {
        System.out.println(pool.size());
    }
}
