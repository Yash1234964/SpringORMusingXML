package in.ineuron.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.ineuron.bo.StudentBO;


@Repository
@Transactional
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public String toString() {
		return "StudentDaoImpl [hibernateTemplate=" + hibernateTemplate + "]";
	}

	@Override
	public int insert(StudentBO bo) {
		// TODO Auto-generated method stub
		int rowAffected=(int) hibernateTemplate.save(bo);
		return rowAffected;
	}

	@Override
	public void delete(int sid) {
		StudentBO bo=hibernateTemplate.get(StudentBO.class,sid);
		if(bo!=null) {
			hibernateTemplate.delete(bo);
		}else {
			System.out.println("Record not available :: "+sid);
		}
	}

	@Override
	public void delete(StudentBO s) {
		
		hibernateTemplate.delete(s);
		System.out.println("Record deleted successfully...");
	

	}

	@Override
	public void update(StudentBO bo) {
		hibernateTemplate.saveOrUpdate(bo);
		System.out.println("Record updated/inserted successfully");

	}

	@Override
	public StudentBO getStudent(int id) {
		StudentBO student=hibernateTemplate.get(StudentBO.class,id);
		return student;
	}

	@Override
	public List<StudentBO> getAllStudent() {
		   
	 List<StudentBO> student=	hibernateTemplate.loadAll(StudentBO.class);
		
		return student;
	}

}
