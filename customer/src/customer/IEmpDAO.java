package customer;
import java.util.List;
//인터페이스만듦
public interface IEmpDAO {
	int insertEmp(EmpVO emp);
	int updateEmp(EmpVO emp);
	int deleteEmp(int employeeId);
	EmpVO selectEmp(int employeeId);
	List<EmpVO> selectEmpByDeptno(int departmentId);
	List<EmpVO> selectAllEmp();
}