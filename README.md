Spring Boot Blog API
- 
This project is a simple RESTful API for managing blog pots using Spring Boot. The main purpose of this API is to handle CRUD (Create, Read, Update, Delete) operations on blog post. The key components and features of this api are:
- Model
  - The BlogPost class represents the blog post entity, which contains properties such as id, title, content, and author. This class defines the structure and attributes of a blog post.
- Repository
  - The BlogPostRepository interface extends the JpaRepository interface provided by Spring Data JPA. This interface provides the basic CRUD operations (Create, Read, Update, Delete) for the BlogPost entity. It allows you to interact with the database and perform operations on the blog posts.
- Service 
  - The BlogPostService class encapsulates the business logic for handling the CRUD operations on the blog posts. It utilizes the BlogPostRepository to perform the database operations and provides a layer of abstraction between the controller and the repository.
- Controller
  - The BlogPostController class acts as the entry point for HTTP requests related to blog posts. It defines various endpoints (URLs) that clients can access to perform operations on the blog posts. The controller calls the appropriate methods from the BlogPostService to handle the requests and return the appropriate responses.
- Endpoint
  - The API exposes several endpoints that clients can use to interact with the blog posts. 
  - These endpoints include:
    - GET /: Retrieves a list of all blog posts.
    - POST /: Creates a new blog post.
    - GET /{id}: Retrieves a specific blog post by its ID.
    - PUT /{id}: Updates a specific blog post by its ID.
    - DELETE /{id}: Deletes a specific blog post by its ID.
    
Setup:
- Clone the repository to your local machine.
- Open the project in your preferred IDE
- Run the SvBLogApplication java class to start the Spring Boot application
- When Spring Boot application is running, open your preferred browser and go to http://localhost:8080/

Endpoints:
- Get All Blog Post
  - URL: http://localhost:8080/
  - Method: GET
  - Description: Returns a list of all blog posts.
  - Response: JSON array containing blog posts.
  
- Create a Blog Post
  - URL: http://localhost:8080/
  - Method: POST
  - Description: Creates a new blog posts.
  - Request Body: JSON Object containing 'title', 'content', and 'author'.
  - Response: JSON Object representing the blog post.
  
- Update a Blog Post
  - http://localhost:8080/{id}
  - Method: PUT
  - Description: Updates a specific blog post with the given 'id'.
  - Request Body: JSON Object containing updated 'title', 'content', and 'author'.
  - Response: JSON Object representing the blog post.
  
- Delete a Blog Post
  - http://localhost:8080/{id}
  - Method: DELETE
  - Description: Deletes a specific blog post with the given 'id'.
  - Response: Content is no longer on http://localhost:8080

Testing
1) All API endpoints can be tested using your preferred REST client like POSTMAN.
   - Download POSTMAN here: https://www.postman.com/downloads/
   - Run the SVBlogApplication on your IDE
   - Open up POSTMAN and go to MY Workspace.
   - ##### Get all Post
     - Click on the "+" and select the "GET" Method and enter http://localhost:8080/ in the text box.
     - Press Send and the "response" box will populate all the current blog post. 
   - ##### Create a BLOG
     - Change the method to "POST", click on "body", then "raw" and finally change the blue "text" to JSON.
     - In the empty box. Use this template to create a post:  
     - {
       "title": "SAMPLE TITLE",
       "content": "SAMPLE CONTENT",
       "author": "SAMPLE AUTHOR"
       }
     - Click send, and it will populate both on the local server (refresh it) and on POSTMAN.
   -  ##### Get a Post by ID
     - Change the Method to "GET" and URL to http://localhost:8080/{id}
     - Click send, and POSTMAN will display the post by "id" number.
   - ##### Update a Blog Post
     - Change the Method to "PUT" and URL to http://localhost:8080/{id}
     - Use this template to update the post:
     - {
     "title": "SAMPLE Update",
     "content": "SAMPLE UPDATED POST",
     "author": "SAMMPLE UPDATED AUTHOR" }
     - Click send, and it will populate both on the local server and on Postman
   - #### Delete a Blog Post
     - Change the Method to "DELETE" and URL to http://localhost:8080/{id} 
     - Click send, and Blog post with matching ID will be removed.
                                                              

2) All Methods can be tested individually in the BlogPostController java class
   - Go to the controller class.
   - Test any method (Get, Create, Update, Delete) individually by going to the annotation for each method and "generate request in HTTP Client" 
   - Based on which method is being tested, the correct method (GET, POST, PUT, DELETE) along with the URL will generate. 
   - Make changes or modification accordingly. Click on the green play button and any changes will populate on the local server http://localhost:8080/.    
     - Sample template to post:
     
       
   POST http://localhost:8080
   
Content-Type: application/json 
   
{
  "title": "New Blog Post",
  "content": "This is the content of my new blog post.",
  "author": "SV"
}
 