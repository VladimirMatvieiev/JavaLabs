--
-- PostgreSQL database dump
--

-- Dumped from database version 15.2
-- Dumped by pg_dump version 15.2

-- Started on 2023-05-19 19:28:44

SET
statement_timeout = 0;
SET
lock_timeout = 0;
SET
idle_in_transaction_session_timeout = 0;
SET
client_encoding = 'UTF8';
SET
standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET
check_function_bodies = false;
SET
xmloption = content;
SET
client_min_messages = warning;
SET
row_security = off;

SET
default_tablespace = '';

SET
default_table_access_method = heap;

--
-- TOC entry 197 (class 1175 OID 16752)
-- Name: student; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.student
(
    id             integer NOT NULL,
    surname        character varying(32),
    name           character varying(32),
    patronymic     character varying(32),
    "recordBookId" integer,
    birthday       date
);


ALTER TABLE public.student OWNER TO postgres;

--
-- TOC entry 3318 (class 0 OID 16398)
-- Dependencies: 215
-- Data for Name: student; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.student (id, surname, name, patronymic, "recordBookId", birthday) FROM stdin;

1 Соколова Анна Іванівна  280455 1995-06-15
2 Петров Іван Сергійович  280454 1987-11-25
3 Сидорова Олена Петрівна  280453 1990-03-10
4 Іванова Марія Олександрівна  280452 1982-09-05
5 Козлов Дмитро Андрійович  280451 1998-12-30
6 Васильєва Ольга Сергіївна  280450 1989-07-20
7 Миколаєва Тетяна Олексіївна  280449 1993-04-18
8 Смирнов Сергій Ігорович  280448 1984-08-12
9 Кузнєцов Олександр Дмитрович  280447 1997-05-03
10 Михайлова Катерина Володимирівна  280446 1988-02-23
11 Воробйов Артем Миколайович  280445 1992-09-17
12 Морозова Євгенія Сергіївна  280444 1994-01-13
13 Ковалева Ольга Валеріївна  280443 1996-06-08
14 Матвєєв Володимир Євгенович 280442 2003-04-25
15 Соловєва Наталія Олексіївна  280441 1986-04-28
16 Андрєєва Марина Іванівна  280440 1999-03-24
17 Тимофєєва Олена Дмитріївна  280439 1992-08-19
18 Григорєва Анастасія Олександрівна  280438 1997-11-14
19 Бєлова Юлія Сергіївна  280437 1985-10-09
20 Зайцева Олена Павлівна  280436 1993-09-02
\.


--
-- TOC entry 3533 (class 2606 OID 16856)
-- Name: student recordBookId_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT "recordBookId_unique" UNIQUE ("recordBookId");


--
-- TOC entry 36741 (class 2606 OID 16911)
-- Name: student student_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_pkey PRIMARY KEY (id);


-- Completed on 2023-05-19 21:11:41

--
-- PostgreSQL database dump complete
--
