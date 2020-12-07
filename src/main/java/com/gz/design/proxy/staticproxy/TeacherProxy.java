package com.gz.design.proxy.staticproxy;

public class TeacherProxy implements ITeacher {
    private ITeacher teacher;

    public TeacherProxy(ITeacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        teacher.teach();
    }
}
