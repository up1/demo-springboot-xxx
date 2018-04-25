DROP TABLE IF EXISTS user;
CREATE TABLE IF NOT EXISTS user (id INTEGER PRIMARY KEY, firstname VARCHAR(100), lastname VARCHAR(100));

INSERT INTO user values(1, 'Somkiat Test', 'Pui Test');