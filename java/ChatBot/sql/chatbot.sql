-- Create the Database --
CREATE DATABASE chatbot_db
DEFAULT CHARACTER SET utf8
DEFAULT COLLATE utf8_general_ci;

-- Create the vocabulary table --
CREATE TABLE chatbot_db.vocabulary (
word        VARCHAR(63) NOT NULL,
type        VARCHAR(31) NOT NULL,
definition  VARCHAR(255),
PRIMARY KEY (word)
);
