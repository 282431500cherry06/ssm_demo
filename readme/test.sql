use test;    
DROP TABLE IF EXISTS t_user;    
create table t_user    
(    
 userId  int primary key auto_increment,    
 userName VARCHAR(50) not null,    
 userAge int not null    
);   

insert into t_user values(1,'小王',10);    
insert into t_user values(2,'红红',11);    
insert into t_user values(3,'明明',12);    
insert into t_user values(4,'天天',13);   