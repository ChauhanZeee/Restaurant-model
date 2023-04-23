# Restaurant model Api Project 
## Frameworks and language used:
-  Spring Boot
-  Java

## Data Flow


* **Model** :
  There are One Model class in this application.
    1. Restauraunt Model Class.

* **Controller** :

  There are One Controller class in this application.
    1. Restauraunt Controller Class.

**Functions/Endpoints used in User Controller Class.**

- To add Restaurabt data :
- http://localhost:8080/api/v1/add/newRestaurant


- To get all Restauraunt's information:
- http://localhost:8080/api/v1/all/restaurantInfo


- To update User's details:
- http://localhost:8080/api/v1/user/restaurauntDetail


- To delete User by id:
- http://localhost:8080/api/v1/user/deleteUser_with_user_id?user_id=2


- To get User by id:
- http://localhost:8080/api/v1/user/getUser_By_Id/2


* **Service** :

    * In this application there are One service class .
        * Restauraunt Service Class

## Project Summary

In this application by using various RestApi we can add Restauraunt.
We can add multiple Restauraunt and can perform CRUD operations.
we can add Orders based on unique  User's user_id, Address's address_id and Product's produst_id.
