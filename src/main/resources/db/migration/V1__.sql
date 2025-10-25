CREATE TABLE clubs
(
    id         UUID                        NOT NULL,
    name       VARCHAR(255)                NOT NULL,
    is_active  BOOLEAN                     NOT NULL,
    provider   VARCHAR(255)                NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    CONSTRAINT pk_clubs PRIMARY KEY (id)
);

ALTER TABLE clubs
    ADD CONSTRAINT uc_clubs_name UNIQUE (name);