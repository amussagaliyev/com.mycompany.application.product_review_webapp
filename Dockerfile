FROM a142857/mycompany.tomcat:1.0-SNAPSHOT

RUN apt-get update && apt-get -y upgrade
COPY target/product_review.war /usr/local/tomcat/webapps
