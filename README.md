# Simple Yatra Application - Backend Service



## Database Diagram

![db-diagram](docs/images/db-diagram-001.png)

## API Endpoints

[Swagger UI](http://localhost:9091/swagger-ui/index.html)

### Requester Management

- [x] `GET /requester/hello`: Test endpoint for Spring Security.
- [ ] `GET /requester/{id}`: Retrieve requester details by id.
- [x] `GET /requesters`: Retrieve a list of all requesters.
- [ ] `GET /requester?email={email}`: Retrieve requester details by email.
- [ ] `POST /requester`: Register a new requester.
- [ ] `PATCH /requester`: Update requester details.
- [ ] `PATCH /requester/password`: Update requester login password.
- [ ] `DELETE /requester/{id}`: Delete a requester by id.
