DROP TABLE IF EXISTS formula_1 CASCADE;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 1;

CREATE TABLE formula_1
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    rider_name VARCHAR NOT NULL,
    car_brand VARCHAR NOT NULL,
    points INTEGER NOT NULL,
    place INTEGER NOT NULL
);
