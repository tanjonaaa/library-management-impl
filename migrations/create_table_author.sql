CREATE TABLE IF NOT EXISTS "author" (
  id varchar(255) primary key default gen_random_uuid(),
  name varchar(255) not null,
  sex sex not null
);

INSERT INTO "author" (name, sex)
VALUES ('Marc Levy', 'M'), ('J.R.R Tolkien', 'M'), ('Eichiro Oda', 'M');