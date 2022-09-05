begin
   execute immediate 'drop table "user"';
exception
   when others then null;
end;
/

CREATE  TABLE "user"(
id number(19) NOT NULL,
name VARCHAR2(45) NOT NULL,
contact_detail VARCHAR2(45) NOT NULL,
username VARCHAR2(45) NOT NULL,
password VARCHAR2(45) NOT NULL,
PRIMARY KEY (id));


INSERT INTO "user"(id, name, contact_detail, username, password) VALUES (1,'Dhoni', '7894561230', 'tonii', 'abc123');