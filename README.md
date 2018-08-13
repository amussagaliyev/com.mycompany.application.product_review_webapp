# com.mycompany.product_review_webapp
RESTful Web Service for Product Reviews

To build and run

1. mvn clean package
2. docker build -t mycompany.product_review_webapp .
3. docker run -p 8080:8080 --link mycompany.db:mycompany.db --link mycompany.redis:mycompany.redis --name mycompany.product_review_webapp mycompany.product_review_webapp

To build and push

1. docker build -t mycompany.product_review_webapp .
2. docker tag mycompany.product_review_webapp a142857/mycompany.product_review_webapp
3. docker push a142857/mycompany.product_review_webapp
