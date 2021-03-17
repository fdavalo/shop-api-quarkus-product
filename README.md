

To run the code in dev mode:
    `mvn clean compile quarkus:dev`

To run the code in prod mode:
    `mvn clean`
    `mvn package`
    `java -jar target/shop-api-quarkus-product-1.0-SNAPSHOT-runner.jar`

To create the postgres DB : 

`oc new-app --name=postgresql --template=postgresql-ephemeral --param=POSTGRESQL_USER=postgres --param=POSTGRESQL_PASSWORD=postgres --param=POSTGRESQL_DATABASE=product`
