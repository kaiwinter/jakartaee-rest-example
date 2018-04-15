# jakartaee-rest-example

A simple Jakarta EE REST example which publishes a single REST URI at `<HOST>/rest-example/rest/hello/<id>`. Passed IDs are queried from the database.


A datasource (Hibernate dialect `MySQL5InnoDBDialect`) with the name `AppPU` has to exist (see `persistence.xml`), the database schema is initialized by Hibernate and two users are added: ID=1, username=Octocat, ID=2, username=Tanuki.
Error handling and architecture is out of focus.

This application serves as a demo application for an upcoming Docker article.