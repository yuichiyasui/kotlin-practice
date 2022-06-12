CREATE TYPE gender AS ENUM ('Male', 'Female');

CREATE TABLE addresses (
    id SERIAL,
    first_name VARCHAR(10) NOT NULL,
    last_name  VARCHAR(10) NOT NULL,
    first_name_kana VARCHAR(10),
    last_name_kana VARCHAR(10),
    birthday DATE,
    gender gender,
    email VARCHAR(255) NOT NULL,
    prefecture_id INTEGER REFERENCES prefectures(id),
    city VARCHAR(255),
    block VARCHAR(255),
    building VARCHAR(255),
    phone_number VARCHAR(15),
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP,
    deleted BOOLEAN NOT NULL
);