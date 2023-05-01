### Frameworks and language

---
* Framework : Spring,SpringBoot
* Language : java (Version 17)

### Data Flow

---
> Controller

* EventController
    * addEvents
    * updateEvent
    * deleteEvent
    * getAllEvents
   

* StudentController
    * addStudent
    * updateDepartment
    * deleteStudent
    * getStudents
    * getStudentById

> Service

* EventService
* StudentService

> Repository

* IEventDao
* IStudentDao


### Database used in project

* H2 database

### Project Summary

This is a __University event management App__ built with Java Spring Boot, using an H2 database engine and Maven build tool.Validation is implemented to ensure data integrity. The system supports adding, getting, updating, and deleting jobs. The project follows the Model-View-Controller (MVC) architecture pattern, with separate layers for controller, service, and repository.