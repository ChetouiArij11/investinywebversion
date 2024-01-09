--
-- PostgreSQL database dump
--

-- Dumped from database version 15.2
-- Dumped by pg_dump version 15.2

-- Started on 2024-01-01 15:19:57

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3357 (class 1262 OID 16556)
-- Name: investiny; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE investiny WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';


ALTER DATABASE investiny OWNER TO postgres;

\connect investiny

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 214 (class 1259 OID 16557)
-- Name: contributeurs; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.contributeurs (
    id integer NOT NULL,
    idutilisateur integer,
    idprojet integer,
    montantcontribution numeric(10,2),
    datecontribution date,
    num_carte integer
);


ALTER TABLE public.contributeurs OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 16613)
-- Name: contributeurs_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.contributeurs_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.contributeurs_seq OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16560)
-- Name: paiements; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.paiements (
    id integer NOT NULL,
    montantpaiement numeric(10,2),
    idutilisateur integer,
    idprojet integer,
    datepaiement date,
    num_carte integer
);


ALTER TABLE public.paiements OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 16612)
-- Name: paiements_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.paiements_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.paiements_seq OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 16563)
-- Name: projets; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.projets (
    id integer NOT NULL,
    titreduprojet character varying(100),
    description text,
    categorie character varying(50),
    statut character varying(20),
    montantcible numeric(10,2),
    montantactuel numeric(10,2),
    datededebut date,
    datedefin date,
    createur integer,
    imageduprojet character varying(255),
    prix numeric(10,2)
);


ALTER TABLE public.projets OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16609)
-- Name: projets_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.projets_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.projets_seq OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16568)
-- Name: utilisateurs; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.utilisateurs (
    id integer NOT NULL,
    nom character varying(50),
    prenom character varying(50),
    adresseemail character varying(100),
    motdepasse character varying(255),
    imagedeprofil character varying(255)
);


ALTER TABLE public.utilisateurs OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 16573)
-- Name: utilisateurs_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.utilisateurs_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.utilisateurs_seq OWNER TO postgres;

--
-- TOC entry 3344 (class 0 OID 16557)
-- Dependencies: 214
-- Data for Name: contributeurs; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3345 (class 0 OID 16560)
-- Dependencies: 215
-- Data for Name: paiements; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.paiements (id, montantpaiement, idutilisateur, idprojet, datepaiement, num_carte) VALUES (52, NULL, 502, 404, '2023-12-27', NULL);
INSERT INTO public.paiements (id, montantpaiement, idutilisateur, idprojet, datepaiement, num_carte) VALUES (53, 30.00, 502, 403, '2023-12-27', NULL);
INSERT INTO public.paiements (id, montantpaiement, idutilisateur, idprojet, datepaiement, num_carte) VALUES (54, 30.00, 502, 403, '2023-12-27', NULL);
INSERT INTO public.paiements (id, montantpaiement, idutilisateur, idprojet, datepaiement, num_carte) VALUES (55, 50.00, 502, 1, '2023-12-27', NULL);
INSERT INTO public.paiements (id, montantpaiement, idutilisateur, idprojet, datepaiement, num_carte) VALUES (56, 30.00, 502, 403, '2023-12-27', NULL);
INSERT INTO public.paiements (id, montantpaiement, idutilisateur, idprojet, datepaiement, num_carte) VALUES (102, 50.00, 502, 1, '2023-12-27', NULL);
INSERT INTO public.paiements (id, montantpaiement, idutilisateur, idprojet, datepaiement, num_carte) VALUES (154, 33.00, 502, 11, '2023-12-27', NULL);


--
-- TOC entry 3346 (class 0 OID 16563)
-- Dependencies: 216
-- Data for Name: projets; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.projets (id, titreduprojet, description, categorie, statut, montantcible, montantactuel, datededebut, datedefin, createur, imageduprojet, prix) VALUES (100, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 152, NULL, NULL);
INSERT INTO public.projets (id, titreduprojet, description, categorie, statut, montantcible, montantactuel, datededebut, datedefin, createur, imageduprojet, prix) VALUES (11, 'pc', 'khefbjrbfksbdfksz', 'shop', NULL, 15289.00, 2.00, '2023-11-09', '2023-11-29', 152, '', 33.00);
INSERT INTO public.projets (id, titreduprojet, description, categorie, statut, montantcible, montantactuel, datededebut, datedefin, createur, imageduprojet, prix) VALUES (3, 'bag', 'bag a shop', 'aeaeae', 'Funded', 20.00, 20.00, '2023-05-11', '2026-11-19', 152, '', NULL);
INSERT INTO public.projets (id, titreduprojet, description, categorie, statut, montantcible, montantactuel, datededebut, datedefin, createur, imageduprojet, prix) VALUES (452, 'hahaha', 'hahaha', 'hahaha', 'Funding', 500.00, 0.00, '2023-12-26', '2024-02-28', 502, NULL, 15.00);
INSERT INTO public.projets (id, titreduprojet, description, categorie, statut, montantcible, montantactuel, datededebut, datedefin, createur, imageduprojet, prix) VALUES (404, 'vv', 'vv', 'vv', 'Funded', 33.00, 10640.00, '2023-05-11', '2023-05-19', 652, '', NULL);
INSERT INTO public.projets (id, titreduprojet, description, categorie, statut, montantcible, montantactuel, datededebut, datedefin, createur, imageduprojet, prix) VALUES (403, 'sssppppp', 'sssppppp', 'sssppppp', 'Funding', 500.00, 10.00, '2023-12-08', '2023-12-27', 652, '', 30.00);
INSERT INTO public.projets (id, titreduprojet, description, categorie, statut, montantcible, montantactuel, datededebut, datedefin, createur, imageduprojet, prix) VALUES (1, 'bag', 'bag a shop', 'aeaeae', 'Funding', 20.00, 10.00, '2023-05-11', '2026-11-19', 152, '', 50.00);


--
-- TOC entry 3347 (class 0 OID 16568)
-- Dependencies: 217
-- Data for Name: utilisateurs; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.utilisateurs (id, nom, prenom, adresseemail, motdepasse, imagedeprofil) VALUES (152, 'jhbuj', 'aloui', 'dgechhjjnjjhj@gmail.com', 'lksqjdlqskd', 'qmlskdlmqsdksqd');
INSERT INTO public.utilisateurs (id, nom, prenom, adresseemail, motdepasse, imagedeprofil) VALUES (402, 'mohamed', 'tababi', NULL, '132qsd21azdqsd', NULL);
INSERT INTO public.utilisateurs (id, nom, prenom, adresseemail, motdepasse, imagedeprofil) VALUES (403, 'qsdqsdqsd', 'sqdqsdqsd', NULL, '132qsd21azdqsd', NULL);
INSERT INTO public.utilisateurs (id, nom, prenom, adresseemail, motdepasse, imagedeprofil) VALUES (404, 'sdsds', 'qsdqsd qsd ', 'moasmlqs@gmailc.com', '132qsd21azdqsd', NULL);
INSERT INTO public.utilisateurs (id, nom, prenom, adresseemail, motdepasse, imagedeprofil) VALUES (452, 'arij', 'chetoui', 'arij@gmail.com', 'q3s1d56qsdqsd', 'C:\fakepath\IMG_2 (2).jpg');
INSERT INTO public.utilisateurs (id, nom, prenom, adresseemail, motdepasse, imagedeprofil) VALUES (502, 'mohamed', 'mohamed', 'mohamed@gmail.com', '0000', NULL);
INSERT INTO public.utilisateurs (id, nom, prenom, adresseemail, motdepasse, imagedeprofil) VALUES (602, '715', '715', '715@xn--ga-oka', '0000', NULL);


--
-- TOC entry 3358 (class 0 OID 0)
-- Dependencies: 221
-- Name: contributeurs_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.contributeurs_seq', 251, true);


--
-- TOC entry 3359 (class 0 OID 0)
-- Dependencies: 220
-- Name: paiements_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.paiements_seq', 201, true);


--
-- TOC entry 3360 (class 0 OID 0)
-- Dependencies: 219
-- Name: projets_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.projets_seq', 501, true);


--
-- TOC entry 3361 (class 0 OID 0)
-- Dependencies: 218
-- Name: utilisateurs_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.utilisateurs_seq', 701, true);


--
-- TOC entry 3189 (class 2606 OID 16575)
-- Name: contributeurs contributeurs_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contributeurs
    ADD CONSTRAINT contributeurs_pkey PRIMARY KEY (id);


--
-- TOC entry 3191 (class 2606 OID 16577)
-- Name: paiements paiements_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.paiements
    ADD CONSTRAINT paiements_pkey PRIMARY KEY (id);


--
-- TOC entry 3193 (class 2606 OID 16579)
-- Name: projets projets_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.projets
    ADD CONSTRAINT projets_pkey PRIMARY KEY (id);


--
-- TOC entry 3195 (class 2606 OID 16581)
-- Name: utilisateurs utilisateurs_adresseemail_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.utilisateurs
    ADD CONSTRAINT utilisateurs_adresseemail_key UNIQUE (adresseemail);


--
-- TOC entry 3197 (class 2606 OID 16583)
-- Name: utilisateurs utilisateurs_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.utilisateurs
    ADD CONSTRAINT utilisateurs_pkey PRIMARY KEY (id);


--
-- TOC entry 3198 (class 2606 OID 16584)
-- Name: contributeurs contributeurs_idprojet_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contributeurs
    ADD CONSTRAINT contributeurs_idprojet_fkey FOREIGN KEY (idprojet) REFERENCES public.projets(id);


--
-- TOC entry 3199 (class 2606 OID 16589)
-- Name: contributeurs contributeurs_idutilisateur_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contributeurs
    ADD CONSTRAINT contributeurs_idutilisateur_fkey FOREIGN KEY (idutilisateur) REFERENCES public.utilisateurs(id);


--
-- TOC entry 3200 (class 2606 OID 16594)
-- Name: paiements paiements_idprojet_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.paiements
    ADD CONSTRAINT paiements_idprojet_fkey FOREIGN KEY (idprojet) REFERENCES public.projets(id);


--
-- TOC entry 3201 (class 2606 OID 16599)
-- Name: paiements paiements_idutilisateur_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.paiements
    ADD CONSTRAINT paiements_idutilisateur_fkey FOREIGN KEY (idutilisateur) REFERENCES public.utilisateurs(id);


-- Completed on 2024-01-01 15:19:58

--
-- PostgreSQL database dump complete
--

