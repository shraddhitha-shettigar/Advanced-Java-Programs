use test;
CREATE TABLE IF NOT EXISTS `coffee` (`id` int(5) NOT NULL
AUTO_INCREMENT,`coffee_name` varchar(100) NOT NULL,`priced` int(5), PRIMARY KEY (`id`)
);
INSERT INTO coffee values (101,'Febary',120);
INSERT INTO coffee values (102,'Royal',140);
INSERT INTO coffee values (103,'Diamond',180);