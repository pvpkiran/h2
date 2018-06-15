**In Memory H2 Databasse**

 This is a sample project to demonstrate in memory h2 database with springboot.
 
 1. Start the application and  reach _/country_ it will list all the countries in database.
 2. Springboot understands data.sql and schema.sql and inserts data automatically without any code.
 3. Remove these two sql files and make ``spring.jpa.hibernate.ddl-auto=create`` in properties file.
 4. Reach /country/initialize. This will initialize database
 5. Reach /country/add this will try to add new entry with same ranking which is a unique column.
     This will give you an error.
     
 6. UniqueConstraints in code doesn't create anything on the database per se. And this will work 
 only if the database is created by spring-data-jpa and not for pre existing database or the ones 
 which got created at startup using sql files.