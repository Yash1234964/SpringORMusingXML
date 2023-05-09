package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.StudentBO;
import in.ineuron.dao.IStudentDao;
import in.ineuron.dto.StudentDTO;


@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IStudentDao dao;
	
	@Override
	public int insert(StudentDTO dto) {
		StudentBO bo=new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		return dao.insert(bo);
	
	}

	@Override
	public void delete(int id) {
		
			dao.delete(id);
		

	}

	@Override
	public void delete(StudentDTO s) {
		
		StudentBO bo=new StudentBO();
		BeanUtils.copyProperties(s, bo);
		
		dao.delete(bo);

	}

	@Override
	public void update(StudentDTO s) {
		StudentBO bo=new StudentBO();
		BeanUtils.copyProperties(s, bo);
		dao.update(bo);

	}

	@Override
	public StudentDTO getStudent(int id) {
		StudentBO studentBO=dao.getStudent(id);
		StudentDTO dto=new StudentDTO();
		
		BeanUtils.copyProperties(studentBO,dto);
		
		return dto;
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		List<StudentBO> studentBO=dao.getAllStudent();
		List<StudentDTO> studentDTO=new ArrayList<StudentDTO>();
		
		studentBO.forEach(
			bo->{
				StudentDTO dto=new StudentDTO();
				BeanUtils.copyProperties(bo, dto);
				studentDTO.add(dto);
			
		});
		
		return studentDTO;
	}

}
