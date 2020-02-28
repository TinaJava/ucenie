create table osoba (
meno varchar(50),
priezvisko varchar(50),
vek bigint,
vaha decimal,
muz boolean
);
delete from osoba;--vymaze vsetky riadky v tabulke ale tabulka zostava zachovana

insert into osoba (
meno, priezvisko, vek, vaha, muz
)values(
'Martin', 'Bublik',18,85,true
);
insert into osoba (
meno, priezvisko, vek, vaha, muz
)values(
'Michal', 'Stevlik',43,95,true
);
insert into osoba (
meno, priezvisko, vek, vaha, muz
)values(
'Vladimira', 'Ficekova',43,90,false
);
insert into osoba (
meno, priezvisko, vek, vaha, muz
)values(
'Lola', 'Ficekova',18,41,false
);

update osoba set
vek = 44,
vaha = 110
where (meno = 'Michal');

alter table osoba add column kto_je_kto varchar(20);
--prikazom alter mozem zmenit strukturu tabulky. rozsirit ju aj zuzit
--add column = pridaj stlpec
--drop column = vzmaz stlpec


update osoba set
kto_je_kto = 'mama'
where (meno = 'Vladimira');

update osoba set
kto_je_kto = 'buduci zat'
where (meno = 'Martin');

update osoba set
kto_je_kto = 'priatel'
where (meno = 'Michal');

update osoba set
kto_je_kto = 'dcera'
where (meno = 'Lola');

alter table osoba drop column vaha;
