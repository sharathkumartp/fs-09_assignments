### Frameworks and language

---
* Framework : Spring,SpringBoot
* Language : java (Version 17)

### Data Flow

---
> Controller

* BookController
    * addBook
    * getBook
    * updateBook
    * deleteBook


* CourseController
    * addCourse
    * getCoursesById
    * getAllCourses
    * updateCourse
    * deleteCourse


* LaptopController
  * addLaptop
  * getLaptopById
  * getAlllaptops
  * updateLaptop
  * deleteLaptop


* StudentController
  * addStudent
  * getStudent
  * updateStudent
  * deleteStudent


> Service
* BookService
* CourseService
* LaptopService
* StudentService


> Repository

* BookRepo
* CourseRepo
* LaptopRepo
* StudentRepo



### Database used in project

* Mysql

### Project Summary

This is a __Database-relationship__ built with Java Spring Boot, using an Mysql database engine and Maven build tool. This app is built for the demonstration of various relationships of Hibernate . The project follows the Model-View-Controller (MVC) architecture pattern, with separate layers for controller, service, and repository.