CREATE TABLE IF NOT EXISTS USERS (
    ID SERIAL PRIMARY KEY
    , FIRSTNAME VARCHAR(100)
    , LASTNAME  VARCHAR(100)
    , EMAIL     VARCHAR(255) UNIQUE NOT NULL
    , PASSWORD  VARCHAR(100) NOT NULL
    , CREATED   TIMESTAMP DEFAULT NOW()
);
INSERT INTO USERS (FIRSTNAME, LASTNAME, EMAIL, PASSWORD) VALUES ('thong', 'do', 'thongquocdo@gmail.com', 'root');