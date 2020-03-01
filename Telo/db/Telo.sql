-- vytvorenie db a pouzivatela
create database telo;
create user telo with encrypted password '0000';
grant all privileges on database telo to telo;

-- vyrobenie tabulky
create table ruka (
    dlzka decimal,
    pocet_prstov b igint,
    farba_koze varchar(20),
    datum_operacie timestamp
);
--drop table ruka; (sluzi na vymazanie celej tabulky)
--vlozenie dvoch ruk do tabulky s hodnotami
insert into ruka (
dlzka, pocet_prstov,farba_koze, datum_operacie
) values (
75.6, 5, 'biela', null
);
insert into ruka (
dlzka, pocet_prstov,farba_koze, datum_operacie
) values (
55.6, 5, 'hneda', null
);

--zmena udajov bielej ruky
update ruka set
dlzka = 45.2,
pocet_prstov = 4
where (farba_koze = 'biela');

--vymazanie hnedej ruky
delete from ruka
where (farba_koze = 'hneda');




create table pes(
meno varchar(10) not null,
fena boolean not null,
ockovany boolean
);

insert into pes(
meno, fena 
) values(
'Cartier', false
); 
--snaha o nastavenia null do mena psa co nam databaza zakazala kedze meno je  not null
update pes set
meno = null
where (meno = 'Cartier');

--zmena stlpca meno na 20 znakov z 10 znakov a povolenie  nevyplnenia mena u psa 
alter table pes alter column meno type varchar (20);

--zrusenie not null u mena psa  cize meno psa moze byt nevyplnene.
alter table pes alter column meno drop not null;

--nastavenie mena psa na null uz prejde kedze  meno psa uz nieje not null
update pes set
meno = null
where (meno = 'Cartier');

-- nastavenie mena psa na GG
update pes set
meno = 'GG'
where (meno is null);


--nastavenie not null  u mena psa cize meno psa musi by vyplnene
alter table pes alter column meno set not null;




--tabulka s primarnym klucom id 
--primarny kluc je stlpec ktory nemoze mat rovnaky id kluc  pre ineho adepta
create table zamestnanec (
id bigint, 
meno varchar(50) not null,
mzda bigint not null,
funkcia varchar (20),
primary key(id) -- tu je nastavene ze primarnym klucom bude stlpec s nazvom id 
);

insert into zamestnanec (
id, meno, mzda
)values(
1,'Jano',500 --kluc mozme nastavit ako ciselny alebo ako meno.v nasom pripade ide o cislo 1
);

insert into zamestnanec (
id, meno, mzda
)values(
2,'Peter',800
);

--zmena mzdy  zamestnanca s id = 1
update zamestnanec set mzda = 600
where (id = 1);

drop table ruka;