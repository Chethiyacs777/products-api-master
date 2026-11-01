# Tutorial 5 — Polymorphism and Abstraction

This is the provided `products-api-master` project, updated in place for Tutorial 5. Existing Customer, Address, Person, HelloController, CustomerController, and all previous product endpoints remain in the project.

## Changes

- `Product` is abstract and declares abstract `getSummary()`.
- Both subclasses override `getSummary()` and implement `Discountable`.
- Digital discounts use the full rate; physical discounts are capped at 20%.
- `GET /products/summaries` returns the polymorphic summaries.
- `POST /products` now accepts `DigitalProduct` in accordance with Tutorial 5.
- UML sources are in `docs/uml/` as `.drawio` and `.puml`.

## Run

Open `pom.xml` in IntelliJ using Java 17 or newer, then run `ProductsApiApplication`. Alternatively run `./mvnw spring-boot:run` where the Maven wrapper can download its dependencies.

Try `GET /products`, `GET /products/summaries`, `GET /customers/1`, and `GET /hello`.

## Note

POST `/products` now creates digital products only, as requested by the tutorial. The previous JSON polymorphic annotations were removed because their abstract-class default implementation would no longer be suitable for this temporary API contract.
