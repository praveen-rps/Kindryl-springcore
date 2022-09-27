package annotationbased;

import org.springframework.stereotype.Component;

@Component(value="temporary")
public class TemporaryEmployeeServiceImpl implements EmployeeService{

	@Override
	public String getEmployeeType() {
		// TODO Auto-generated method stub
		return "Employee is temporary";
	}

}
