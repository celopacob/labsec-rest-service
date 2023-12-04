# LabSeq sequence Api

## - Tech Stack:

    - Java 17 (Quarkus) and Maven 3;

## - To run it locally (Based on MacOS and Linux machines):

    1 - Install Java 17 and Maven 3 in your machine;

    2 - Clone this repo;

    3 - On the root folder of the project, type:
    "mvn compile quarkus:dev" to build and run the app;

    4 - You should have the API running on "localhost:8080/api/labseq/{n}"

    5 - You should also have access to the Swagger UI documentation of the API on "localhost:8080/api/swagger"

    6 - The  the Swagger UI documentation of the API on "localhost:8080/api/openapi"

## - Endpoints (Also available on the swagger page):

    - (GET) http://localhost:8080/api/labseq/{n} : Returns the labsec number based on our call;