### Frameworks and language

---
* Framework : Spring,SpringBoot
* Language : java (Version 17)

### Data Flow

---
> Controller

* EmployeeController
    * getAllEmployees
    * getById
    * addEmployee
    * deleteEmployee


* AddressController
    * getAllAddress
    * getAddressById
    * addAddress
    * updateAddress
    * deleteAddress

> Service

* EmployeeService
* AddressService

> Repository

* IEmployeeRepo
* IAddressRepo


### Database used in project

* Mysql 

### Project Summary

This is a __Employee-Address__ built with Java Spring Boot, using an Mysql database engine and Maven build tool. The system supports adding, getting, updating, and deleting Employees and Address. The project follows the Model-View-Controller (MVC) architecture pattern, with separate layers for controller, service, and repository.