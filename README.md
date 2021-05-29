# spring-boot-cassandra
SpringData Cassandra Repositories | SpringBoot

# Steps:
# 1.We can either download Cassandra locally or download docker image from docker hub
https://hub.docker.com/_/cassandra
# 2. Run the docker image by following the instructions in the docker hub
# 3.Open Cassandra CQL Shell to create Cassandra table & Schema
# 4. Create Cassandra keyspace with name hasanmk like below                      
create keyspace hasanmk with replication={'class':'SimpleStrategy', 'replication_factor':1}
# 5. Create table for hasanmk keyspace:
Use hasanmk; 
CREATE TABLE User(
   id int PRIMARY KEY,
   name text,
   address text,
   age int
);
We are done with Table creation and environment setup now follow above code for development

