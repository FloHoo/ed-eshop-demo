# European Dynamics - Code.hub E-Shop demo project
A sample project to demonstrate the capabilities of the **Spring Framework** and **Spring Boot**. This project will also act as the basis of upcoming coming labs covering areas such as **Spring Data** and **Spring REST**.

###  1st lab objectives
1. Spring Boot eshop sample project (org.acme:eshop:2018.1.0.SNAPSHOT).
2. Define domain model (User, Order, OrderItem, Category, Product).
3. Define Service Layer (Interfaces).
4. Define Repository (Interfaces and dummy implementation).
5. Define Service Layer (Implementation).
6. Declare DI.
7. Check Qualifier vs Primary.
8. Load Services with specific order (@see https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/annotation/Order.html), prefer using @DependsOn.
9. Test conditional loading using ConditionalOnClass, ConditionalOnMissingClass, @ConditionalOnProperty, ConditionalOnExpression.
10. Create a custom bean in prototype scope.
11. Create a custom bean in singleton scope.

###  2nd lab objectives
1. Externalize part of the application to properties(i.e. sequence initial values).
2. Load data to repositories (i.e. create bootstrap profile).
3. Specific logging level to service and repository layers.
4. Configure specific log appender and rotation policy.
5. Schedule methods to create entities of a given type and one method to retrieve them (i.e. create schedule profile).
6. Async sample implementation.

###  3rd lab objectives
1. Introduce Spring Data JPA and H2.
2. Annotate accordingly entities and define database schema.
3. Define relations among entities.
4. Introduce new repository layer substituting existing.
5. Load sample data.
6. Expose functionality as Rest Services.
7. Utilize RestTemplate to call public APis.

###  4th lab objectives
1. Add Swagger support.
2. Create a universal structure format for both answers and exceptions.
3. Define specific locales, enable header locale resolver and enable resource bundles.
4. Select specific controller methods, add a second version of these and then add filtering.

###  5th lab objectives
1. Add cache support.
2. Select one domain entity and introduce cache to respective methods.
3. Introduce conditional caching to one method.


##  Appendix A
### SpEL
- Official documentation can be found [here](https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#expressions).
- Articles [here](
...https://dzone.com/articles/learn-spring-expression-language-with) and [here](https://www.baeldung.com/spring-expression-language).

### Design Patterns
- List of patterns complete list can be found [here](https://java-design-patterns.com/patterns/) with capabilities of filtering/grouping patterns.
- Another list of design patterns can be found [here](https://www.javatpoint.com/design-patterns-in-java).

### S.O.L.I.D.
- Actual implementations in Java can be found [here](https://howtodoinjava.com/best-practices/5-class-design-principles-solid-in-java/).
