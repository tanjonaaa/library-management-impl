CREATE TABLE IF NOT EXISTS "subscriber" (
  id varchar(255) primary key default gen_random_uuid(),
  name varchar(255) not null,
  ref varchar(255) not null
);

INSERT INTO "subscriber" (name, ref)
VALUES ('Tanjona', 'SBC22070'), ('James', 'SBC22000'), ('Jessie', 'SBS23000');