-- vytvorenie novej databazy s nazvom 'zvierata_db'
create database zvierata_db;

-- vytvorenie noveho pouzivatela, ktorym budeme pristupovat do databazy 'zvierata_db'
-- bude mat meno 'zvierata_pouz' a heslo 'tajneheslo'
create user zvierata_pouz with encrypted password 'tajneheslo';

-- pridelenie vsetkych prav pouzivatelovi 'zvierata_pouz', aby mohol pracovat s databazou 'zvierata_db'
grant all privileges on database zvierata_db to zvierata_pouz;


-- uplne odstranenie databazy 'zvierata_db'
drop database zvierata_db;

-- uplne odstranenie pouzivatela 'zvierata_pouz'
drop user zvierata_pouz;