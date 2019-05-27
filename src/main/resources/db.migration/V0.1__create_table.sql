CREATE TABLE IF NOT EXISTS pg_users (
    user_id SERIAL NOT NULL,
    first_name VARCHAR(128) NOT NULL,
    last_name VARCHAR(128) NOT NULL,
    createdAt TIMESTAMP DEFAULT current_timestamp,
    updatedAt TIMESTAMP,
    PRIMARY KEY (user_id)
);
CREATE TABLE IF NOT EXISTS pg_phones (
    phone_id SERIAL NOT NULL,
    phone VARCHAR(12) NOT NULL,
    user_id SERIAL NOT NULL,
    createdAt TIMESTAMP DEFAULT current_timestamp,
    updatedAt TIMESTAMP,
    PRIMARY KEY (phone_id),
    FOREIGN KEY (user_id) REFERENCES pg_users (user_id)
);