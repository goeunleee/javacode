package customer;

import java.util.List;
import java.util.Scanner;

public class EmpManager {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
        int id=0, mgid=0, deptno=0;
        double sal, comm;
        String fname,lname,email,pnum,jid;
		/*
		 * IEmpDAO dao = new EmpDAO(); EmpVO emp = new EmpVO(); emp.setEmployeeId(401);
		 * emp.setFirstName("ȫ�浿"); emp.setLastName("Heo"); emp.setEmail("asdfgh");
		 * emp.setPhoneNumber("010-3402-7902"); emp.setHireDate(new java.sql.Date(new
		 * java.util.Date().getTime())); emp.setJobId("IT_PROG"); emp.setSalary(9000);
		 * emp.setCommissionPct(0.8); emp.setManagerId(100); emp.setDepartmentId(60);
		 */
		
		try {
			System.out.println("1 �Է� 2 ���� 3 ���� 4 ����Ʈ 5 ����");
			IEmpDAO dao = new EmpDAO();
			EmpVO emp = new EmpVO();
			
			
			emp.setPhoneNumber("010-3402-7902");
			emp.setHireDate(new java.sql.Date(new java.util.Date().getTime()));
			emp.setJobId("IT_PROG");
			
			
			emp.setManagerId(100);
			emp.setDepartmentId(60);
			menu = scan.nextInt();
			switch (menu) {

			case 1:

				dao.insertEmp(emp);
                
				System.out.println("�Է� ����!!!");
				break;
			case 2:
                System.out.println("������ ���̵� id : "); id = scan.nextInt(); emp.setEmployeeId(id);
                System.out.println("email : "); email = scan.next();  emp.setEmail(email);
                System.out.println("salary : "); sal = scan.nextDouble();  emp.setSalary(sal);
                System.out.println("commission : "); comm = scan.nextDouble();  emp.setCommissionPct(comm);
				dao.updateEmp(emp);
				System.out.println("���� ����");
				break;
			case 3:
                int del = scan.nextInt();
				dao.deleteEmp(del);
				System.out.println(del+"�� id ���� ����");
				break;
			case 4:
				System.out.println("����Ʈ���");
				EmpVO emp1 = dao.selectEmp(103);
				System.out.println(emp1);
				List<EmpVO> empList1 = dao.selectEmpByDeptno(60);
				List<EmpVO> empList = dao.selectAllEmp();
				for (EmpVO vo : empList) {
					System.out.println(vo);
				}
				break;
			case 5:
				System.out.println("�����մϴ�");
				break;

			}

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}