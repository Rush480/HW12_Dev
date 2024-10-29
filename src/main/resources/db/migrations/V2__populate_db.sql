
INSERT INTO planet (id, name)
VALUES ('MARS', 'Mars'),
       ('VEN', 'Venus'),
       ('JUP', 'Jupiter'),
       ('SAT', 'Saturn'),
       ('NEP', 'Neptune');


INSERT INTO client (name)
VALUES ('Alice Smith'),
       ('Bob Johnson'),
       ('Charlie Brown'),
       ('Diana Prince'),
       ('Edward Norton'),
       ('Fiona Gallagher'),
       ('George Washington'),
       ('Hannah Montana'),
       ('Isabella Rossellini'),
       ('Jack Sparrow');


INSERT INTO ticket (client_id, from_planet_id, to_planet_id)
VALUES (1, 'MARS', 'VEN'),
       (2, 'VEN', 'JUP'),
       (3, 'JUP', 'SAT'),
       (4, 'SAT', 'NEP'),
       (5, 'MARS', 'JUP'),
       (6, 'VEN', 'SAT'),
       (7, 'JUP', 'MARS'),
       (8, 'SAT', 'VEN'),
       (9, 'NEP', 'MARS'),
       (10, 'VEN', 'NEP');
