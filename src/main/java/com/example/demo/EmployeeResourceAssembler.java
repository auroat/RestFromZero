package com.example.demo;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

@Component
class EmployeeResourceAssembler implements ResourceAssembler<Employee, Resource<Employee>> {

    @Override
    public Resource<Employee> toResource(Employee employee) {

	return new Resource<>(
		employee,
		    linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
		    linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }
}
