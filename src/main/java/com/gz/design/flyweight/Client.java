package com.gz.design.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite web1 = webSiteFactory.getWebSiteCategory("新闻");
        web1.use(new User("A"));
        WebSite web2 = webSiteFactory.getWebSiteCategory("博客");
        web1.use(new User("A"));
        WebSite web3 = webSiteFactory.getWebSiteCategory("博客");
        web1.use(new User("C"));
        WebSite web4 = webSiteFactory.getWebSiteCategory("博客");
        web1.use(new User("D"));
        webSiteFactory.getCount();
    }
}
