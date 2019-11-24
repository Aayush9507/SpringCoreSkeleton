package controller;

import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

import java.util.List;

@CrossOrigin("*")
@Component
@ResponseBody
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @RequestMapping(method = RequestMethod.GET, value = "/employees")
    public List<Employee> findAll() {
//        return service.findAll();
        return null;
    }

    @RequestMapping(method = RequestMethod.GET,  value = "/employees{id}")

    public Employee findOne(@PathVariable("id") String id) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public Employee create(@RequestBody Employee employee){
        return employee;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employees{id}")
    public Employee update(@PathVariable("id") String id, @RequestBody Employee employee){
        return employee;
    }
    @RequestMapping(method = RequestMethod.DELETE , value = "/employees{id}")
    public void delete(@PathVariable("id") String id){

    }


}
