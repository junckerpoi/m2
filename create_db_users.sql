CREATE DATABASE m2;

CREATE USER 'm2_root'@'localhost' IDENTIFIED BY '1234';

GRANT ALL PRIVILEGES ON m2.* TO 'm2_root'@'localhost';

FLUSH PRIVILEGES;
