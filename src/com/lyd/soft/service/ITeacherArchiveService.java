package com.lyd.soft.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lyd.soft.entity.TeacherArchive;

public interface ITeacherArchiveService {

	public Serializable doAdd(TeacherArchive entity) throws Exception;
	
	public void doUpdate(TeacherArchive entity) throws Exception;
	
	public void doDelete(TeacherArchive entity) throws Exception;
	
	public List<TeacherArchive> toList() throws Exception;
	
	//public List<TeacherArchive> findByDept(Integer dept_id) throws Exception;
	
	public TeacherArchive findByName(String name) throws Exception;
	
	public TeacherArchive findById(String id) throws Exception;
	
	public TeacherArchive findByTeaId(String teacherId) throws Exception;
}
