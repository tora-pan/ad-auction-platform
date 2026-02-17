CREATE TABLE auctions (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    starting_price NUMERIC(12,2) NOT NULL,
    current_price NUMERIC(12,2),
    created_at TIMESTAMP NOT NULL DEFAULT NOW(),
    ends_at TIMESTAMP NOT NULL
);
