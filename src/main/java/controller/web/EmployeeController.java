package controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import controller.model.Employees;
import controller.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("")
	public String showEmployees(Model model) {
		List<Employees> result = employeeService.getAll();
		model.addAttribute("result", result);
		return "show";
	}
}
