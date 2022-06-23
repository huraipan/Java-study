select * from tab;
show user;

-- 테이블 스페이스 생성
create tablespace firstbank
datafile 'C:\app\oradata\orcl\first01.dbf' size 10M;

-- 테이블 스페이스 수정
alter tablespace firstbank
add DATAFILE 'C:\app\oradata\orcl\first02.dbf' size 1M;

-- 데이터 파일(database)의 크기를 변경

alter DATABASE
DATAFILE 'C:\app\oradata\orcl\first02.dbf' resize 10M;

-- 데이터 파일의 크기를 자동화 시키는 방법
alter database
datafile 'C:\app\oradata\orcl\first02.dbf'
AUTOEXTEND on
NEXT 1M
MAXSIZE 20M;

-- 테이블 스페이스 삭제
drop TABLESPACE firstbank;

drop tablespace firstbank INCLUDING CONTENTS and DATAFILES;

select tablespace_name, status, contents from dba_tablespaces;








