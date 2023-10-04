
# Employee Address Application

A spring boot application to integrated with H2 Database for CRUD operations and maintain data in local database.


## Data Flow

1. EmpAddress Main Application File
2. Employee & Address Controller class which is Autowired
3. Employee & Address Model class with entities
4. Employee & Address Service class extending Repo class
5. Employee & Address Repo class extend JPA Repository 
6. Employee & Address Mapiing of 1 to 1

## Data Structure

List structure to show data

## Summary

Whole Project is built in spring boot application with IDE of Intellij Idea. Which contains controller class configured with model class to provide data source and Service which has actual logic to API's which can be tested on localhost of your own PC.
And also Repo class extends CrudRepository for to simplify database operations
