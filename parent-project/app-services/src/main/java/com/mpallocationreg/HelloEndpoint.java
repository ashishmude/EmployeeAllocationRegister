package com.mpallocationreg;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Named
@Path("/")
public class HelloEndpoint {
   
    @GET
    @Produces("application/json")
    public Employee getEmployeeDetails() {
        Employee employee = new Employee();
        
        employee.setFirtName("Ashish");
        
        return employee;
    	
    }
   
}
