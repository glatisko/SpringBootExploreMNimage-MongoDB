SpringBoot RESTful microservices MongoDB project to allow users to
- upload images to server
- list all images by filename and unique ids
- fetch an image using unique id


1) start.spring.io
<br>spring web, spring data mongodb, actuator, lombok, docker compose, openAPI


2) import into eclipse and run
mvn clean install spring-boot:run
http://localhost:8080/swagger-ui/index.html

3) create MongoDB documents/JPA entities/Repositories/Services/Controllers
<br>model/Image.java
<br>model/IdName.java
<br>repo/ImageRepository.java extends MongoRepository
<br>web/ImageController.java
<br>business/ImageService.java
