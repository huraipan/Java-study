select * from tab;
show user;

-- ���̺� �����̽� ����
create tablespace firstbank
datafile 'C:\app\oradata\orcl\first01.dbf' size 10M;

-- ���̺� �����̽� ����
alter tablespace firstbank
add DATAFILE 'C:\app\oradata\orcl\first02.dbf' size 1M;

-- ������ ����(database)�� ũ�⸦ ����

alter DATABASE
DATAFILE 'C:\app\oradata\orcl\first02.dbf' resize 10M;

-- ������ ������ ũ�⸦ �ڵ�ȭ ��Ű�� ���
alter database
datafile 'C:\app\oradata\orcl\first02.dbf'
AUTOEXTEND on
NEXT 1M
MAXSIZE 20M;

-- ���̺� �����̽� ����
drop TABLESPACE firstbank;

drop tablespace firstbank INCLUDING CONTENTS and DATAFILES;

select tablespace_name, status, contents from dba_tablespaces;








