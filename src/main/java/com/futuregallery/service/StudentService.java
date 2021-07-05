package com.futuregallery.service;

import com.futuregallery.model.Student;
import com.futuregallery.model.User;
import com.futuregallery.vo.PaginationVO;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<User> getAllUser();

    boolean addStudent(Student student);

    PaginationVO pageList(Map<String, Object> map);

    Boolean deleteStudent(String[] ids);

    Map<String, Object> editStudent(String id);

    boolean updateStudent(Student student);

    Student getStudent(String id);
}
