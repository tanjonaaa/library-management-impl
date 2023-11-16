CREATE TABLE IF NOT EXISTS "book" (
  id varchar(255) primary key default gen_random_uuid(),
  name varchar(255) not null,
  pageNumber integer not null,
  topic topic not null,
  authorId varchar(255),
  borrowerId varchar(255),
  CONSTRAINT fk_author
    FOREIGN KEY(authorId)
        REFERENCES "author"(id)
  ,
  CONSTRAINT fk_subscriber
      FOREIGN KEY(borrowerId)
          REFERENCES "subscriber"(id)
);

INSERT INTO "book" (name, pageNumber, topic, authorId, borrowerId)
VALUES
    ('Où es-tu', 200, 'Romance', 'a021f77b-0d94-4d70-947f-1fb3e308cc53', null),
    ('One Piece', 100000000, 'Other', '1877c607-31a4-4503-9a99-457853cba415', '8aee7fc9-5e1c-44de-bde9-a103ba5182f4'),
    ('Le Seigneur des anneaux: Les deux tours', 500, 'Other', 'ae194496-85d2-4b43-b0c0-6854ba1662bd', null)
;