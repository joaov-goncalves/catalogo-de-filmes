-- Table: public.filmes

-- DROP TABLE IF EXISTS public.filmes;

CREATE TABLE filmes
(
    id integer NOT NULL,
    nome "char"[] NOT NULL,
    descricao "char"[],
    imagem "char"[],
    nota double precision,
    CONSTRAINT filmes_pkey PRIMARY KEY (id)
);