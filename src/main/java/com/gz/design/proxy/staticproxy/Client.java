package com.gz.design.proxy.staticproxy;

import com.gz.design.proxy.staticproxy.Teacher;

public class Client {
    public static void main(String[] args) {
        ITeacher teacher=new Teacher();
        TeacherProxy teacherProxy=new TeacherProxy(teacher);
        teacherProxy.teach();
    }
}
