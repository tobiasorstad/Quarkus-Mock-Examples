package org.example;

import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "api")
public interface EmployeeApi {

    @GET
    @Path("employee/{employeeNumber}")
    Employee getEmployee(@PathParam("employeeNumber") String employeeNumber);

    @POST
    @Path("employee")
    Employee addEmployee(Employee employee);

}
