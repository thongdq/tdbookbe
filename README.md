# tdbookbe
tdbookbe

# Run flyway
.\gradlew flywayMigrate -i

# Run app
- gradle bootrun

# Note
- Spring Boot Rest API Returns Empty JSON Used with Lombok
    + If running spring boot app using java -jar from cmd it works fine. But not with IDE so issue was with IDE configuration.

- the dependency to Hikari is now automatically included in spring-boot-starter-data-jpa and spring-boot-starter-jdbc
