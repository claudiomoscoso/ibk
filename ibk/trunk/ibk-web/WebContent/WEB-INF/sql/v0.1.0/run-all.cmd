@echo off
IF "%1" == "" GOTO error
@echo on
	mysql -D%1 -t -u root -padmin --default-character-set=utf8 < erase-tables.sql.txt
	mysql -D%1 -t -u root -padmin --default-character-set=utf8 < erase-deprecated-object.sql.txt
	mysql -D%1 -t -u root -padmin --default-character-set=utf8 < create-ibk.sql.txt
		
	mysql -D%1 -t -u root -padmin --default-character-set=utf8 < data-ibk.sql.txt
	
	mysql -D%1 -t -u root -padmin --default-character-set=utf8 -t < data-test.sql.txt
	
@echo off
goto fin

:error
@echo off
echo No se indico nombre de la base de datos, ejecute: 
echo $ run-all <Data Base Name>

:fin
@echo off
echo *** FIN ***
