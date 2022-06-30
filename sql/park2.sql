select * from dept;

-- �÷� �̸��� ����ؼ� Ư�� �÷��� ����
-- ex)dept ���̺��� �μ���ȣ�� �μ��� ���
select deptno, dname from dept;

select * from emp;

-- emp ���̺��� ����̸��� �޿��� �Ի��ϸ��� ����ϴ� �������� �ۼ��Ͻÿ�.
select ename, sal, hiredate from emp;

-- ��Ī: �÷��� ����� �ٷ� �ڿ� as��� �� �� ��Ī�� ���
-- ��Ī���� ���鹮��, Ư������($, _, #)�� ���ڸ� ǥ���ϰ� �Ͱų� ��ҹ��ڸ� �����ϰ� ���� ��
-- ""�� ����Ͽ� ����Ѵ�.
-- as �����ϰ� ""�� ����Ͽ� ��Ī�� ����ϴ� ���� �����ϴ�.

select ename as "����̸�", sal as "�޿�", hiredate as "�Ի���" from emp;
select ename  "����̸�", sal  "�޿�", hiredate  "�Ի���" from emp;

select deptno "DepartmentNo", dname "DepartmentName" from dept;

-- Distinct: �ߺ��� �����͸� �ѹ��� ����� �� ���
select distinct job from emp;
select distinct deptno from emp;

-- where ���ǰ� �񱳿�����
-- select column from table where ���ǹ�;
-- ex) �޿��� 3000�̻� �޴� ����� ������� �����ȣ, ����̸�, �޿��� ����Ͻÿ�.
-- �񱳿�����: =, >, <, >=, <= (<>, !=, ^=)

select empno, ename, sal from emp where sal>=3000;

-- ��1) ������̺��� �μ���ȣ�� 10�� ����� ���� ��� ������ ����϶�.
select * from emp where deptno=10;
-- ��2) ������̺��� �޿��� 2000�̸��� ����� ���Ͽ� �����ȣ, �̸�, �޿��� ����Ͻÿ�.
select empno, ename, sal from emp where sal<2000;

/*
���� ������ ��ȸ
 - ���� �����ʹ� �ݵ�� �̱����� �ȿ� ǥ���ϰ�, ��ҹ��ڸ� �����Ѵ�.
*/
select * from emp where ename='SCOTT';
-- ��) ����̸��� MILLER�� ����� ��ȣ�� �̸�, ������ ����Ͻÿ�.
select empno, ename, job from emp where ename='MILLER';

select * from emp;
/*
��¥ ������ ��ȸ
 - ��¥ �����ʹ� �ݵ�� �̱����� �ȿ� ǥ���ϰ�, ��/��/�� �������� ����Ѵ�.
 ��) �Ի����� 85�� ������ ����� ����(�̸�, �Ի���)�� ����Ͻÿ�
*/
select ename, hiredate from emp where hiredate>='85/01/01';

/*
�� ������
AND
 - �� ���� ������ ��� ������ �ؾ߸� �˻��� �� ����
OR
 - �� ���� ������ �� ������ �����ϴ��� �˻��� �� ����
NOT
 - ���ǿ� �������� ���ϴ� �͸� �˻���
BETWEEN AND
 - Ư�� ���� ���� ���ϴ� �����͸� �˻��ϰ��� �� �� �����
IN
 - ������ �÷��� ���� �� �� �� �ϳ����� �˾ƺ����� �� �� �����
*/
-- �μ���ȣ�� 10���̰�, ������ MANAGER�� ����� ������ ����Ͻÿ�.

select * from emp where deptno=10 and job='MANAGER';
-- �޿��� 1000 ~ 3000 ����
select * from emp where sal between 1000 and 3000;

-- �μ���ȣ�� 10���̰ų� ������ MANAGER�� ����� ������ ����Ͻÿ�.
select * from emp where deptno=10 or job='MANAGER';

-- �����ȣ�� 7844�̰ų� 7654�̰ų� 7521�� ����� ������ ����Ͻÿ�.
select * from emp where empno in(7844, 7654, 7521);


/*
like ������
 - �˻� �ϰ��� �ϴ� ���� ��Ȯ�� �� ��� ���ϵ� ī��� �԰� ����Ͽ�
   ���ϴ� ������ �˻��ϴ� ������
   
   ���ϵ� ī��
   %: ���ڰ� ���ų�, �ϳ� �̻��� ���ڰ� � ���� ���� �������
   _: �ϳ��� ���ڰ� � ���� ���� �������
*/

-- k�� �����ϴ� ����� �˻��Ͽ� ������ ����Ͻÿ�.
select * from emp where ename like 'K%';
-- %�� �� ���� ���ڰ� ���� �������.
select ename from emp;

-- �̸��� �ι�° ���ڰ� A�� ����� ������ ���
select ename from emp where ename like '_A%';
-- �̸��߿� A�� ������ ����� ������ ���
select ename from emp where ename like '%A%';
-- �̸��߿� A�� �������� �ʴ� ����� ������ ���
select ename from emp where ename not like '%A%';

select comm from emp where comm is null;
-- NULL�� ����Ǿ� �ִ� ��쿡�� = �����ڴ� ����� �� ����.


/*
NULL�� ���� ������
 ����Ŭ���� �÷��� null���� ����Ǵ� ���� �����
 null�� ��Ȯ��, �� �� ���� ���� �ǹ���
   0�� ������� �ƴ� � ���� �����ϱ�� ������ � ������ �˾Ƴ� ���� ����.
   
 null�� ����, �Ҵ�, �񱳰� �Ұ����ϴ�.
 
 is null�� is not null
  - Ư�� �÷� ������ ���� ��쿡�� �񱳿�����(=)�� ������� �ʰ� is null �����ڸ� �����
  - null ���� �ƴ����� �˾ƺ��� �� ���� �񱳿�����(<>)�� ������� �ʰ� is not null�� ���
  
    is null: null�̸� ����
    is not null: null�� �ƴϸ� ����
*/

select 100 + null from dual;
-- Ŀ�̼��� ���� �ʴ� ���
select ename, comm from emp where comm is null;
-- Ŀ�̼��� �޴� ���
select ename, comm from emp where comm is not null;

-- �ڽ��� ���ӻ���� ���� ����� �̸��� ���ް� ���� ����� ��� ��ȣ�� ����Ͻÿ�.
select ename, job, mgr from emp where mgr is null;
select * from emp;

/*
������ ���� order by ��

 order by ���� �ο�(��)�� �����ϴ� �� �����
  ������ �� �ڿ� ����ϸ� ������ ������ �Ǵ� �÷� �̸� �Ǵ� select������ ��õ� ��Ī�� ���
  
   ����            ��������(asc)               ��������(desc)
   ����          ���� ������ ����              ū �� ���� ����
   ����          ���� ������ ����            ���� �ݴ� ������ ����
   ��¥          ���� ��¥ �������           ���� ��¥ �������
   NULL         ���� �������� ����             ���� ���� ����
   
   �������� ��� �ҹ��ڸ� ���� ū ������, NULL���� ��� �� �� ���� ���� ������ �ν���
*/

-- �����ȣ�� �������� �������� �����Ͻÿ�.
select empno from emp order by empno desc;

-- ��) ����� �����ȣ, �̸�, �޿��� �޿��� ���� ������ ����Ͻÿ�.
select empno, ename, sal from emp order by sal desc;
-- ��) �Ի����� ���� �ֱ��� ��� ������ �����ȣ, �̸�, �Ի����� ����Ͻÿ�.
select empno, ename, hiredate from emp order by hiredate desc;

/*
 sql                              sqlplus
 ���� ǥ�� DB���                   ����Ŭ������ ����ϴ� ���
 DB�� �����͸� ������ �� ����        DB�� �����͸� ������ �� ����.
 ��� ��ɾ��� ���� ����Ŭ��          ��� ��ɾ�� ����Ű�� ���� ����(;���� ������)
   ���� ����                        ��ɶ����� ��� �̾��� ��� ������ ���� -�� �߰���
 �� ����� �� ����               ��� ��� ����  
*/
select * from emp where deptno = 10;
/*
������ �Լ�
   - �ึ�� �Լ��� ����Ǿ� ����� �ݿ��ϴ� �Լ�
   
   �����Լ�: ���ڿ��� �ٸ� ���·� ��ȯ�Ͽ� ��Ÿ��
   �����Լ�: ���ڰ��� �ٸ� ���·� ��ȯ�Ͽ� ��Ÿ��
   ��¥�Լ�: ��¥���� �ٸ� ���·� ��ȯ�Ͽ� ��Ÿ��
   ��ȯ�Լ�: ����, ����, ��¥ ���� ���� �ٸ� Ÿ������ ��ȯ�Ͽ� ��Ÿ��
   �Ϲ��Լ�: ��Ÿ�Լ�
   
�׷� �Լ�
  - �ϳ� �̻��� ���� �׷����� ���� �����Ͽ� �ϳ��� ����� ��Ÿ��
  
  SUM: �׷��� ���� �հ踦 ����
  AVG: �׷��� ����� ����
  COUNT: �׷��� �� ������ ����
  MAX: �׷��� �ּҰ��� ����
  MIN: �׷��� �ּҰ��� ����
  STDDEV: �׷��� ǥ�������� ����
  VARIANCE: �׷��� �л��� ����
*/

/*
 �����Լ�: ���ڿ��� �ٸ� ���·� ��ȯ�Ͽ� ��Ÿ��
          �������� ���� �����Ͽ� ��ȯ�� ���� ���� ��ȯ��
   
    LOWER: �ҹ��ڷ� ��ȯ
    UPPER: �빮�ڷ� ��ȯ
    INITCAP: ù ���ڸ� �빮�ڷ� ��ȯ
    CONCAT: ������ ���� ����
    SUBSTR: ���ڸ� �߶� ����
    SUBSTRB: ���ڸ� �߶� ����
    LENGTH: ������ ���̸� ��ȯ
    LENGTHB: ������ ���̸� ��ȯ
    INSTR: Ư�������� ��ġ ���� ��ȯ
    INSTRB: Ư�������� ��ġ ���� ��ȯ
    LPAD,RPAD: �Է¹��� ���ڿ��� ��ȣ�� �����Ͽ� Ư�� ���ڿ��� ���̸� ��ȯ��
    TRIM: �߶󳻰� ���� ���ڸ� ǥ����
    CONVERT: ���� SET�� ��ȯ��
    CHR: ASCII �ڵ� ������ ��ȯ
    ASCII: ASCII �ڵ� ���� ���ڷ� ��ȯ
    REPLACE: ���ڿ����� Ư�� ���ڸ� ������
*/
select 'DataBase' , LOWER('DataBase') from dual;
select ename, LOWER(ename) from emp;
select 'DataBase' , UPPER('DataBase') from dual;
-- ������ manager�� ����� �˻��Ͻÿ�.
select EMPNO, ENAME, JOB from emp where LOWER(job)='manager';


-- ù ���ڸ� �빮�ڷ� ��ȯ
select INITCAP('DATA BASE PROGRAMMING') from dual;

-- ������̺��� 10�� �μ� �Ҽ��� ����� �̸��� ù ���ڸ� �빮�ڷ� ��ȯ�Ͻÿ�.
select INITCAP(ENAME), DEPTNO from emp where deptno =10;

-- 'smith'�� �̸��� ���� ����� ���, �̸�, �޿��� Ŀ�̼��� ����Ͻÿ�.
select empno, ename, sal, comm from emp where ename=upper('smith');

select empno, ename, sal, comm from emp where lower(ename)='smith';



-- CONCAT: �� ���ڸ� ����

select concat('Kim',' HaeYoung') from dual;

-- LENGTH: ������ ���̸� ��ȯ
-- LENGTHB: ������ ���̸� ��ȯ

select length('KimHaeyoung'), length('���ؿ�') from dual;
select lengthb('KimHaeyoung'), lengthb('���ؿ�') from dual;

-- ��) 10�� �μ� �Ҽ� ������� �̸��� ���̸� ���Ͽ� ����Ͻÿ�.
select deptno, empno, ename, length(ename) from emp where deptno=10;
-- ��) ���� �� �̸��� 4������ ������ �̸��� �ҹ��ڷ� ����Ͻÿ�.
select empno, lower(ename) from emp where length(ename)=4;

/*
   INSTR:  Ư�������� ��ġ ���� ��ȯ
   INSTRB: Ư�������� ��ġ ���� ��ȯ
*/

select instr('KimHaeYounga','a',5,2) from dual;
select instrb('������ؿ���','��',1,2) from dual;
-- instrb: ����Ʈ �� �������� ������ ��ġ�� �˾Ƴ��� �Լ�

/*
   SUBSTR: ���ڸ� �߶� ����
           ���ڿ� �Ϻθ� �����ϴ� �Լ�
   SUBSTRB: ���ڸ� �߶� ����
*/

select substr('KimHaeYoung',-4,3) from dual;
-- select substr('��� ���ڿ�', ������ġ, ������ ����)

-- ��� ���̺��� 20�� �μ� ����� �� �Ի�⵵�� �����Ͻÿ�
select deptno, ename, substr(hiredate,1,2) from emp where deptno=20;
-- 20�� �μ����� 87�⵵�� �Ի��� ����� ������ ����Ͻÿ�.
select * from emp where substr(hiredate,1,2)=87 and deptno=20;


select substrb('������ؿ���', 10, 6) from dual;

/*
  LPAD,RPAD: �Է¹��� ���ڿ��� ��ȣ�� �����Ͽ� Ư�� ���ڿ��� ���̸� ��ȯ��
  10    
*/
select lpad('KimHaeYoung', 20, '@') as lpad from dual; 
select rpad('KimHaeYoung', 20, '@') as rpad from dual; 


select ename from emp where ename='SMITH';
select ename, trim('S' from ename) as trim, trim('H' from ename) 
from emp where ename='SMITH';

select ename, trim('     Oracle llaaaa    ') as trim1, trim('H' from ename) as trim2
from emp where ename='SMITH';

-- �����Լ�: ������ �����͸� �����Ͽ� ��ȯ�� ���� ���� ��ȯ�ϴ� �Լ�
/*
 abs, cos, exp, floor, log, power, sign, sin, tan, 
 round, trunc, mod(%)
*/
select abs(-15) from dual;
select cos(1) from dual;
select sin(60) from dual;
select tan(1) from dual;
select floor(34.567) from dual;
select trunc(123.345, 2) from dual;

-- Ư�� �ڸ������� �ݿø��ϴ� �Լ�(round)
-- round(���, ǥ���� �ڸ���)
select 
round(35.12, 1),-- �Ҽ��� ���� 2��° �ڸ����� �ݿø�, �Ҽ������� ���ڸ����� ǥ��
round(21.125, 2),-- �Ҽ��� ���� 3��° �ڸ����� �ݿø�, �Ҽ������� ���ڸ����� ǥ��
round(47.51),-- 0��° �ڸ����� �ݿø� �Ҽ����� 1�ڸ� �ݿø� ��
round(834.12,-1),-- �ι�° ���ڰ��� �����̸� ���� �ڸ����� �ݿø���
round(653.53,-2)-- ���� �ڸ����� �ݿø���
from dual;


select power(3,2) from dual;
select mod(34,2) from dual;

-- ��) ����� ¦���� ������� �����ȣ, �̸�, ������ ����Ͻÿ�.
select empno, ename, job from emp where mod(empno,2)=0;


-- ��¥�Լ�: ��¥���� �ٸ� ���·� ��ȯ�Ͽ� ��Ÿ��
-- sysdate, months_between, add_months, next_day, last_day, round, trunc

select sysdate from dual;

-- �μ���ȣ�� 10�� ����� ������� �Ի��� ���κ��� ���ñ��� ��ĥ�� �����°�?
select ename, hiredate, months_between(sysdate,hiredate) from emp  where deptno=10;
select hiredate, add_months(hiredate, 3) as plus3 from emp;

select NEXT_DAY(SYSDATE, '��') from dual;
select NEXT_DAY(SYSDATE, 'MONDAY') from dual;

alter session set nls_language=korean; -- �ѱ���
alter session set nls_language=american;-- ����


-- LAST_DATE: �ش� ���� ������ ��¥�� ��ȯ��
select SYSDATE, last_day(sysdate) from dual;

-- trunc: ��¥�� �߶�
select hiredate from emp where deptno=10;
select sysdate, trunc(hiredate, 'MONTH') from emp where deptno=10;

-- round: �Լ��� ����(����) ���� �����ϸ� ���� �̿��� ��¥�� ���ؼ��� �ݿø��� ������ �� �ִ�.
-- round(date, 'MONTH');

-- �Ի����� �� �������� �ݿø�
select hiredate, round(hiredate,'MONTH') from emp where deptno=10;

/*
 ��: 7�� 1�Ϻ��� �ݿø�,    ��: 16���� �������� �ݿø�
 ��: �� �ְ� ���۵Ǵ� ��¥,  �ð�: ���� ����
*/

/*
 ��ȯ�Լ�: �ڷ����� ��ȯ��Ű���� �� �� ����ϴ� �Լ�
 
  TO_CHAR: ��¥�� �Ǵ� �������� ���������� ��ȯ�ϰ��� �� ��
  TO_DATE: �������� ��¥������ ��ȯ�ϰ��� �� ��
  TO_NUMBER: �������� ���������� ��ȯ�ϰ��� �� ��
*/

-- TO_CHAR: ��¥�� �Ǵ� �������� ���������� ��ȯ�ϰ��� �� ��
/*
TO_CHAR (��¥ ������, '�������')

������� ����
  YYYY: �⵵ ǥ��(4�ڸ�)
  YY: �⵵ ǥ��(2�ڸ�)
  MM: ���� ���ڷ� ǥ��
  MON: ���� ���ĺ����� ǥ��
  DD: ���� ǥ��
  DAY: ���� ǥ��
  DY: ������ ���� ǥ��
*/

select hiredate, to_char(hiredate, 'YYYY/MON/DD/DY') from emp where deptno=20;
select sysdate, to_char(sysdate, 'yyyy-mm-dd-day') from dual;


/*
 �ð� ��� ������ ����
 
 AM �Ǵ� PM    : ������ ���� �ð� ǥ��
 A.M �Ǵ� P.M  : ������ ���� �ð� ǥ��
 HH �Ǵ� HH12  : �ð�(1 ~ 12)
 HH24         : 1~24 �ð����� ǥ�� (0 ~ 23)
 MI           : ��
 SS           : ��
*/

select to_char(sysdate, 'yyyy/mon/dd hh24:mi:SS') from dual;

/*
   to_char(): �������� ���������� ��ȯ
   
   ���� �������
     0: �ڸ����� ��Ÿ���� �ڸ����� ���� ���� ��� 0���� ä���.
     9: �ڸ����� ��Ÿ���� �ڸ����� ���� �ʾƵ� ä���� �ʴ´�.
     L: �� ������ ��ȭ ��ȣ�� �տ� ǥ���Ѵ�. $, ��
     .: �Ҽ���
     ,: õ ���� �ڸ� ����
     
   ����             ����            ���
   
   12345.67     999,999,999      12,345.67
   12345.67     999999           12345
   12345.67     $999,999,999     $12,345,67
   12345.67     L999,999,999     ��12,345,67
   12345.67     S999,999,999     +12,345,67
     
*/

select ename, sal from emp where deptno=10;
select ename, sal, to_char(sal,'$999,999') from emp where deptno=10;

-- ���� ��ĥ�� �������� ��¥�� ����Ͽ� ����Ͻÿ�.
select sysdate-'2022/01/01' from dual;-- <- �����߻�
select trunc(sysdate-TO_DATE('2022/01/01', 'yyyy/mm/dd')) from dual;
select sysdate-to_date('2022/01/01', 'yyyy/mm/dd') from dual;

/*
 �Ϲ��Լ� (��Ÿ �Լ�)
 
 NVL    : ù��° ���ڷ� ���� ���� NULL�� ������ �� ��° ���� ������ ����
 DECODE : ù��° ���ڷ� ���� ���� ���ǿ� ���� ����(if ���ǹ��� ������)
 CASE   : ���ǿ� �´� ������ ������(switch���� ������)
*/

-- NVL: NULL���� �ٸ� ������ ��ȯ�ϴ� �Լ�
--      NULL�� 0 �Ǵ� �ٸ� ������ ��ȯ�ϱ� ���� ����ϴ� �Լ�

select ename, sal, nvl(comm,0) as comm, job from emp order by job;

-- ������ ����ϱ� ���ؼ� �޿��� 12�� ���� �� Ŀ�̼��� ���غ��� ���?

select ename,
sal*12+nvl(comm,0) as sal,
nvl(comm,0) as comm, 
job from emp order by sal desc;

-- �����ϰ� ����� ���� ����� �ִ� �� ����� CEO
-- mgr�� NULL���� CEO�� ��ȯ�Ͽ� ����Ͻÿ�.
select ename,  nvl(to_char(mgr), 'CEO') as MGR from emp;
select ename,  NVL(TO_CHAR(MGR, '9999'),'CEO') as MGR from emp;
-- ���ڵ����͸� ���ڿ��� ��ȯ
-- NULL ���� �����Ѵ�.

select deptno from emp;
select distinct(deptno) from emp;
select deptno, dname from dept;
select * from emp;

/*
  ���ǿ� �´� ���� �����ϱ� ���� �Լ�
  SWITCH CASE���� ���� �������� ��쿡 ���ؼ� ������ �� �ִ� �Լ�
  DECODE(ǥ����, ����, ���1,
                ����2, ���2,
                ����3, ���3,
                �⺻��� n)
*/
select empno,
ename,
decode(deptno, 10, 'ACCOUNTING', 20, 'RESEARCH', 30, 'SALES', 40, 'OPERATIONS') as deptname,
deptno
from emp
order by deptname;
/*
  CASE: ���ǿ� ���� ���� �ٸ� ó���� ������ �Լ�
  
        CASE ǥ���� WHEN ����1 THEN ���1
             ǥ���� WHEN ����2 THEN ���2
             ǥ���� WHEN ����3 THEN ���3
             ELSE ��� n
        END
*/


select empno,
ename,
case when deptno = 10 then 'ACCOUNTING'
     when deptno = 20 then 'RESEARCH'
     when deptno = 30 then 'SALES'
     when deptno = 40 then 'OPERATIONS'
END  deptname,
deptno
from emp
order by deptname;

select sal from emp;
select * from emp order by sal desc;

/*
 ��) ���޿� ���� ���ʽ��� �����ϱ� ���� ������ 'manager'�� ����� 15% �λ��ϰ�
     ������ 'clerk'�� ����� 5% �λ��ϵ��� ó���Ͻÿ�. (decode �Լ� ���)
*/



select empno,
ename,
job,
decode (job, 'MANAGER', trunc(SAL+(SAL*0.15)), 'CLERK', SAL+(SAL*0.5), sal) sal
from emp
order by sal desc;


select empno,
ename,
job,
case when job = 'MANAGER' then trunc(sal*1.15)
     when job = 'CLERK'   then trunc(sal*1.5)
     else sal
     end sal
     from emp
     order by sal desc;

select * from emp;
select sum(sal) from emp;
select trunc(avg(sal)) from emp;
select max(sal), min(sal) from emp;
select count(*),count(comm) from emp;
select count(comm) from emp where deptno=30;
select * from emp where deptno=10;
select count(*) from emp where deptno=10;
select count(distinct(job)) from emp;

/*
 GROUP BY��
   Ư�� �÷� ���� �������� ���̺��� �׷캰�� ������ ���� �����
   ����: select �÷���, �׷��Լ� from ���̺�� where ���ǽ�
   group by �÷���
*/
-- ������� �μ���ȣ�� �������� 3��
select deptno, sum(sal), round(avg(sal)) avg, 
max(sal), min(sal) 
from emp 
group by deptno;


select job,
count(*) cnt
from emp
where deptno in(10, 20, 30)
group by job
having count(*) > 3;


select deptno, round(avg(sal)) 
from emp group by deptno 
having round(avg(sal))>2000;

select deptno, max(sal), min(sal) 
from emp group by deptno
having max(sal) >2900;


/*
create table ���̺��(
     �÷��� �������ڷ���,
     �÷��� �������ڷ���,
     �÷��� �������ڷ���,
     �÷��� �������ڷ���
);

  char       : �������� ���� ������ �ּ� ũ��� 1, �ִ� ũ��� 2000byte
  varchar2   : �������� ���� ������ �����Էµ� ���ڿ��� ���̸�ŭ ������ �ּ�ũ��� 1, �ִ�ũ��� 4000byte
  number     : ������ ������ �ִ� 40�ڸ����� ������ �� ����, �Ҽ����̳� ��ȣ�� ���̿� ���Խ�Ű�� ����
  number(w)  : ������ �ڸ����� ��ġ�� �ִ� 38�ڸ����� ������
  number(w,d): w�� ��ü�ڸ���, d�� �Ҽ������� �ڸ����̸� �Ҽ����� �ڸ����� ���Ե��� ����
  date       : ��¥ �����͸� ����(�����, �����) 
  long       : �������� ������ ������ Ÿ��, �ִ����: 2GByte
  lob        : 2GB������ �������� ���̳ʸ� �����͸� �����Ŵ
              (���̳ʸ�������: �̹��� ����, �������� �������� ��������)
  rowid      : �����ͺ��̽��� ����Ǿ� ���� ������ �����ͺ��̽� �����͵� �ƴϴ�.
  
*/


SELECT * FROM emp;

select rowid from emp where rownum <=5;

/*
 ���̺�� �÷����� �ο��ϱ� ���� ��Ģ
  - �ݵ�� ���ڷ� �����ؾ��Ѵ�.
  - 1 ~ 30�ڱ��� �����ϴ�.
  - A ~ z������ ��ҹ���, 0 ~ 9������ ����, Ư������(_,$,#)�� ������
  - ������ ��� ���� ����
  - �����̳� ���̺�� �ߺ� �Ұ�
*/

create table emp02(
empno number(4),
ename varchar2(20),
sal number(7,2)
);

desc emp01;

select empno from emp01;
insert into emp01 values(1111, 'haeyoung', 5000, 'CEO');


select * from emp02;
create table emp02 as
select * from emp;
desc emp02;

select * from dept;

/*

 alter table�� ���̺� ���� ����
   - ���̺��� �÷��� �߰�, ����, ����(�ڷ���, ����)�� �� ����Ѵ�.
   - ADD COLUMN���� ����Ͽ� ���ο� �÷� �߰�
   - MODIFY COLUMN���� ����Ͽ� ���� �÷��� �����Ѵ�.
   - DROP COLUMN���� ����Ͽ� ���� �÷��� �����Ѵ�.
   
*/
desc emp01;

-- alter table ���̺�� add(�÷��� ������Ÿ��);

alter table emp01 add(job varchar2(9));
select * from emp01;

DELETE FROM emp01 WHERE empno=1111;

/*
 alter table ���̺�� modify(�÷���, �������ڷ���)
    - �ش� �÷��� �ڷᰡ ���� ���
       �÷��� ������ Ÿ���� ������ �� �ִ�.
       �÷��� ũ�⸦ ������ �� �ִ�.
    - �÷��� ������ Ÿ���� ������ �� ����.
      ũ�⸦ �ø����� ������ ���� ������ �ִ� ������ ũ�⺸�� ���� ũ��� ������ �� ����.
*/

insert into emp01(empno, ename, sal, job) values(1112, 'jinwoo', 3000, 'MANAGER');
select * from emp01;
-- alter table ���̺�� modify(�÷��� ������Ÿ��);

-- emp01���̺��� job ������ Ÿ���� ũ�⸦ 30���� �����Ͻÿ�.
alter table emp01 modify(job varchar2(30));

-- alter table ���̺�� drop column �÷���;
alter table emp01 drop column job;

/*
 DROP table
    drop table ��ɹ��� ���� ���̺��� �����Ѵ�.
    ���̺��� �����ϸ� ���̺� ����Ǿ� �ִ� �����͵� �Բ� �����ȴ�.
    ���ŵ� �����ʹ� ������ �� ����.
*/

-- drop table ���̺��
drop table emp01;
select * from tab;

desc recyclebin;
select * from recyclebin;

purge recyclebin;
FLASHBACK table "BIN$jPlgsF+WSDqHWRCA1Aq10g=$0" to BEFORE drop;

-- ���̺� �̸� ���� rename��
-- ����: rename ���� ���̺�� to ���ο� ���̺��
rename emp01 to emp04;

select * from emp01;

delete from emp03;
rollback;


create table dept01(
 deptno number(2),
 dname varchar2(14),
 loc varchar2(13)
 );
-- �μ���ȣ 10, �μ��� ACCOUNTING, ���� NEW YORK�� �߰��Ͻÿ�.
INSERT INTO DEPT01(deptno, dname, loc) values(10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT01(deptno, dname, loc) values(20, 'RESEARCH', 'DALLAS');
INSERT INTO DEPT01(deptno, dname) values(30, 'SALES');

select * from dept01;

desc dept;

INSERT INTO DEPT(deptno) values(null);

create table emp01(
deptno number(2) not null,
dname varchar2(14),
loc varchar2(13)
);
desc dept02;
select * from dept01;
insert into dept02 values(10, null, null);
insert into dept02 values(20, '', '');
SELECT * from dept02;
select * from emp01;

drop table dept01;


create table emp01 as select * from emp;

/*
 �������� �����ϴ� UPDATE SET (U)
 ����
   UPDATE ���̺�� SET �÷���1=��1, �÷���2=��2 where ���ǽ�
   
   � ���� �����͸� �����ϴ��� where���� �̿��Ͽ� ������ ����
   where ���� ������� ������ ���̺� �ִ� ��� ���� ������
   
*/
-- ��� ����� �μ���ȣ�� 30������ ����
update emp01 set deptno=30;
rollback;
select * from emp01;

-- ��� ����� �޿��� 10% �λ�
update emp01 set sal= sal*1.1;

-- ��� ����� �Ի����� ���÷� ����
update emp01 set hiredate=sysdate;

rollback;

-- 1987�⿡ �Ի��� ����� �Ի����� ���÷� ����
update emp01 set hiredate=sysdate where substr(hiredate,1,2)='87';
rollback;

-- SCOTT ����� �μ���ȣ�� 10, ������ MANAGER�� �����Ͻÿ�.

select deptno, job from emp01 where ename='SCOTT';

update emp01 set deptno=10, job='MANAGER' where ename='SCOTT';

/*
 DELETE
  ���̺� Ư�� ���� ������ ��
  
  ����
    DELETE FROM ���̺�� WHERE ����
*/
select * from dept01;
create table dept01 (
deptno number(2),
dname varchar(13)
);
delete from dept01 where deptno=30;

/*
  savepoint
   - ���� Ʈ������� �۰� ���� �� �� �ִ�.
     ����� savepoint�� rollback to savepoint���� ����Ͽ� ǥ���� �� ���� rollback �� �� ����
     
  ����
     Ư�� ��ġ�� �����ϴ� ����
     savepoint ���̺��
     
     ������ ���� Ư����ġ�� �ǵ��ư��� ����
     rollback to label_name;
*/

select * from emp01;
drop table dept01;
create table dept01 as select * from dept;
select * from dept01;

-- �μ���ȣ 40�� ����
delete from dept01 where deptno=40;
commit;

delete from dept01 where deptno=30;
savepoint c1;
delete from dept01 where deptno=20;
savepoint c2;
delete from dept01 where deptno=10;
select * from dept01;

rollback to c2;

rollback;

select * from user_cons_columns where table_name='EMP';
select * from user_cons_columns where table_name='DEPT';

/*

���Ἲ ��������
  - �����͸� �߰�, ����, �����ϴ� �������� ���Ἲ�� ������ �� �ֵ��� ������ �ִ� ���� �ǹ���
  - ���Ἲ: �����ͺ��̽� ���� �������� Ȯ�强�� �����ϴ� ���� �ǹ��ϰ�, ���� �����̶�
    ��������: �ٶ������� ���� �����Ͱ� ����Ǵ� ���� �����ϱ� ����
    
    ���Ἲ ���� ����
    NOT NULL    : NULL�� ������� �ʴ´�.
    UNIQUE      : �ߺ��� ���� ������� �ʴ´�. �׻� ������ ���� ������ ��
    PRIMARY KEY : NOT NULL + UNIQUE ������ ������ ���¸� �ǹ���
    FOREIGN KEY : �����Ǵ� ���̺��� �÷����� �����ϸ� ����
    CHECK       : ���� ������ ������ ���� ������ ������ �����Ͽ� ������ ������ �����
*/

select * from emp01;
create table emp01(
empno number(4),
ename varchar(10),
job varchar2(9),
depno number(4));

insert into emp01 values(null,null,'salesman',30);
select * from emp01;
-- NOT NULL ���������� �ش� �÷��� null���� �߰��ϰų� null������ �����ϴ� ���� ����
-- ���������� �÷���� �ڷ����� ����� �Ŀ� �̾ not null�� ����ϸ� ��

create table emp02(
empno number(4) not null,
ename varchar(10) not null,
job varchar2(9),
depno number(4));
insert into emp02 values(null,null,'salesman',30);

-- UNIQUE: �ߺ��� ���� ������� �ʴ´�. �׻� ������ ���� ������ ��

create table emp03(
empno number(4) UNIQUE,
ename varchar(10) not null,
job varchar2(9),
depno number(4));
insert into emp03 values(7499,'ALLEN','salesman',30);
insert into emp03 values(NULL,'HAEYOUNG','manager',20);
insert into emp03 values(null,'ALLEN','salesman',10);

/*
 unique: null���� ���ܷ� ������, ���� null�� ������ �Էµ��� �ʰ� ���� �Ϸ���
         ���̺� ������ empno number(4) unique not nulló�� �� ���� ����������
         ����ؾ���
*/
desc user_tables;

show user;

/*
���� ���� Ȯ�� �ϱ�
  ���������� ���� �޽����� ���� ��Ȯ�� ������ �˱� ���� ����Ŭ���� ������ �ִ� user_constraints ������ ��ųʸ�
  
    user_constraint ������ ��ųʸ�
      - ���������� ������ ���ؼ� ���� �÷����� �����Ǿ� ������
        �������Ǹ�, ���� ��������, ���� ������ ���� ���̺��� �˾ƺ�
*/

select constraint_name, constraint_type, table_name from user_constraints where table_name='EMP03';

/*
constraint_type�� P, R, U, C 4������ ����

         P: PRIMARY KEY
         R: FOREIGN KEY
         U: UNIQUE
         C: CHECK NOT NULL
*/


/*
 PRIMARY KEY ���� ����
  - �ĺ� ����� ���� �÷��� �����ϸ鼭�� NULL���� ������� �ʴ´�.
    ��, unique�� not null ���� ���� ��θ� ���� ���� �⺻Ű(PRIMARY KEY) ����������
*/


create table emp04(
empno number(4) PRIMARY KEY,
ename varchar(10) not null,
job varchar2(9),
depno number(4));

insert into emp04 values(7499, 'ALLEN', 'SALESMAN', 30);
insert into emp04 values(7499, 'HAEYOUNG', 'MANAGER', 20);

select constraint_name, constraint_type, table_name from user_constraints where table_name='EMP04';

select * from emp04;
insert into emp04 values(7566, 'HAEYOUNG', 'MANAGER', 50);
delete from emp04 where depno=20;


create table emp05(
empno number(4) PRIMARY KEY,
ename varchar(10) not null,
job varchar2(9),
deptno number(4) REFERENCES DEPT01(deptno)
);

select * from dept;

drop table EMP05;

create table dept01 (
deptno number(2) primary key,
dname varchar2(14),
loc varchar2(13)
);
select * from emp05;
select * from dept01;
insert into dept01 values(40, 'OPERATIONS', 'BOSTON');

select constraint_name, constraint_type, table_name from user_constraints where table_name='EMP05';
insert into emp05 values(7499, 'HAEYOUNG', 'SALESMAN', 30);
insert into emp05 values(7566, 'JINWOO', 'MANAGER', 50);
drop table dept01;

-- SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'EMP05';

/*
 check ���� ����
   - �ԷµǴ� ���� üũ�Ͽ� ������ �� �̿��� ���� ������ ���� �޽����� �Բ� ����� ������� ���ϰ� �ϴ� ���� �ǹ���
*/

/*
 emp06 ������̺� GENDER(����) �÷��� �߰��ϵ� 
 GENDER �÷����� 'M' or 'F'�� �� ���� ������ �� �ִ� check ���� ���� ����
*/

create table emp06 (
empno number(4) primary key,
ename varchar2(10) not null,
gender varchar2(1) check(gender in('M', 'F'))
);

insert into emp06 values(7566, 'HAEYOUNG', 'F');
select constraint_name, constraint_type, table_name, search_condition from user_constraints where table_name='EMP06';

/*
���� ���Ǹ� �����ϱ�
 - ����ڰ� �ǹ��ְ� ���� ���Ǹ��� ����Ͽ� ���� ���Ǹ����� � ���������� ���� �ߴ��� �� �� �ְ� �ϴ� ���
    �������: column_name data_type CONSTRAINT constraint_name constraint_type
    
   ���� ���Ǹ� ��� ��Ģ
     ���̺��_�÷���_�������� ����
     
   �⺻Ű ���� ���Ǹ��� EMP06_EMPNO_PK�� ������
       EMP05_EMPNO_PK
*/

drop table emp05;

create table emp05(
empno number(4) constraint emo05_empno_pk primary key,
ename varchar2(10) constraint emp05_ename_nn not null,
job varchar2(9) constraint emp05_job_uk unique,
deptno number(4) constraint emp05_deptno_fk references dept01(deptno)
);
select constraint_name, constraint_type, table_name, search_condition from user_constraints where table_name='EMP05';

insert into emp05 values(7499, 'HAEYOUNG', 'SALESMAN', 30);
insert into emp05 values(7499, NULL, 'SALESMAN', 50);

/*
���̺� ���� ������� �������� �����ϱ�

  ����Ű�� �⺻Ű�� ������ ���
   - ����Ű ���·� ���������� ������ ��쿡�� �÷� ���� �������δ� 
     �Ұ����ϰ� �ݵ�� ���̺� ���� ����� �����
 
 
  ALTER TABLE�� ���� ������ �߰��� ���
   - ���̺��� ���ǰ� �Ϸ�Ǿ ���� ���̺��� ������ ������ �Ŀ� ���߿� ���̺�
     ���� ������ �߰��ϰ��� �� ������ ���̺� ���� ������� ���������� ������
     
     ����
      create table ���̺��(
      �÷���1  ������ Ÿ��1,
      �÷���2  ������ Ÿ��2,
      ...
      
      CONSTRAINT constraint_name  constraint_type(column_name)
      );
*/

-- ���̺� ������ ���������� �����ϴ� ���
select * from tab;
drop table emp04;

create table emp04(
empno number(4),
ename varchar2(10) not null,
job varchar2(9),
deptno number(4),
primary key(empno),
unique(job),
foreign key(deptno) references dept01(deptno)
);

drop table emp03;
-- ���̺� �������� �÷��� ���� ���Ǹ��� ��������� ������ �� ��� constraint Ű���带 �����
create table emp03(
empno number(4),
ename varchar2(10) constraint emp03_ename_nn not null,
job varchar2(9),
deptno number(4),
constraint emp03_empno_pk primary key(empno),
constraint emp03_job_uk unique(job),
constraint emp03_dpetno_fk foreign key(deptno) references dept01(deptno)
);

select constraint_name, constraint_type, table_name, search_condition from user_constraints where table_name='EMP03';


------------------------- end �������� ������� ---------------------------

---------------------- ���� ���� ���� ----------------------------
/*
 1. ���� ���� �߰��ϱ�
     ���̺� ������ ���� �Ŀ� ���� ������ �߰��ϱ� ���� alter table�� �߰���
     ����
       alter table ���̺��
       add constraint constraint_name  constraint_type(column_name);
*/


-- 2. ���� ���� �����ϱ�
drop table emp01;
create table emp01(
empno number(4),
ename varchar2(10),
job varchar2(9),
deptno number(4)
);
select constraint_name, constraint_type, table_name, search_condition from user_constraints where table_name='EMP05';

-- emp01 ���̺��� empno �÷��� �⺻Ű �����ϰ�, deptno �÷��� �ܷ�Ű ����
alter table emp01
add primary key(empno);

alter table emp01
add constraint emp01_deptno_fk foreign key(deptno) references dept01(deptno);

/*
���� ���� �����ϱ�
 - ���� ������ �����ϱ� ���ؼ��� drop constraint ������ �����ϰ����ϴ� ���� ���Ǹ��� �����
 alter table ���̺��
 drop constraint ���� ���Ǹ�;
 
*/
select * from emp05;
insert into emp05 values(7498,'HAEYOUNG', 'MASTER', 50);

alter table emp05
drop constraint emp05_deptno_fk;


/*
 ���������� ��Ȱ��ȭ cascade;
   - ���������� ��Ȱ��ȭ�� ������ ���� ������ ��� ������� �ʰ� �ϴ� ����
   
   disable: ���� ������ �Ͻ� ��Ȱ��ȭ
   enable: ��Ȱ��ȭ�� ���������� �����Ͽ� �ٽ� Ȱ��ȭ��
*/

select constraint_name, constraint_type, table_name, search_condition from user_constraints where table_name='EMP01';
select * from DEPT01;


drop table emp01;
create table emp01(
empno number(4) constraint emp01_empno_pk primary key,
ename varchar2(10) constraint emp01_ename_nn not null,
job varchar2(9),
deptno number(4) constraint emp01_deptno_fk references dept01(deptno)
);

insert into emp01 values(7499, 'HAEYOUNG', 'SALESMAN', 10);
insert into emp01 values(7369, 'JINWOO', 'CLERK', 20);

delete from dept01 where deptno=10;

/*
  �������� Ȱ��ȭ�� ��Ȱ��ȭ
    
    - ���������� �����Ǹ� �׻� �� ��Ģ�� ���� ������ ���Ἲ�� �����
      ����Ŭ������ ���������� ��Ȱ��ȭ��Ŵ���ν� ���������� �������� �ʰ� ����� ���
      ������ �� ������ ��Ȱ��ȭ�� ���������� ���ϴ� �۾��� �� �� �ٽ� Ȱ��ȭ ���·�
      ����� �־����.
  
   Ȱ��ȭ ���
     alter table ���̺��
     enable constraint �������Ǹ�;
  
   ��Ȱ��ȭ ���
     alter table ���̺��
     disable constraint �������Ǹ�;
*/
-- ��Ȱ��ȭ
alter table EMP01
 disable constraint EMP01_DEPTNO_FK;
-- ����Ȯ��
select constraint_name, constraint_type, table_name, search_condition, STATUS from user_constraints where table_name='EMP01';

DELETE FROM DEPT01 WHERE DEPTNO=10;
ROLLBACK;
-- Ȱ��ȭ
-- �ڽ����̺�
alter table EMP01
 enable constraint EMP01_DEPTNO_FK;
 
/*
cascade
  - cascade �ɼ��� �θ����̺�(dept01)�� �ڽ����̺�(emp01)���� ���� ������ �Ǿ� ���� ��
    �θ� ���̺��� ���� ������ ��Ȱ��ȭ �ϸ� �̸� �����ϰ� �ִ� �ڽ����̺��� ���� ���Ǳ���
    ���� ��Ȱ��ȭ �����ִ� �ɼ��̴�.
*/
alter table dept01
disable primary key cascade;

select constraint_name, constraint_type, table_name, search_condition, STATUS 
from user_constraints where table_name IN ('DEPT01', 'EMP01');

alter table dept01
drop primary key cascade;

/*
 cascade �ɼ��� �����Ͽ� �⺻Ű ���� ������ �����ϸ� �̸� �����ϴ� �ܷ�Ű ���� ���ǵ� ���������� �����Ѵ�.
*/

 
 select * from emp e, dept d where e.deptno=d.deptno;
 
 
 /*
  ���� : �Ѱ� �̻��� ���̺��� �����͸� ��ȸ�ϱ� ���� ���Ǵ°�
  
  ����
    Equi join : ������ �÷��� �������� ����
    Nonqui join : ������ �÷��� ���� �ٸ� ������ ����Ͽ� ����
    Outer join : ���� ���ǿ� �������� �ʴ� �൵ ��Ÿ��
    Self join : �� ���̺� ������ ����
 
 */
 
 -- equi join: ������ �÷��� �������� ����
 -- �� ���̺��� ���������� �����ϴ� �÷��� ���� ��ġ�Ǵ� ���� �����Ͽ� ����� �����ϴ� ����
 select ename, dname from emp e, dept d where e.deptno=d.deptno;
 
 
 -- nonequi join: ������ �÷��� ���� �ٸ� ������ ����Ͽ� ����
 -- ������ ���̺� ���̿� �÷��� ���� ���������� ��ġ���� ���� �� ����ϴ� ����
 select * from salgrade;
 select * from emp;
 
 select e.ename, e.sal, s.grade from emp e, salgrade s where e.sal between s.losal and s.hisal;
 select e.ename, e.sal, s.grade from emp e, salgrade s where e.sal >= s.losal and e.sal <= s.hisal;
 
 /*
  outer join: ���� ���ǿ� �������� �ʴ� �൵ ��Ÿ��
              ���� ���� ���ǿ� �������� ���� ��� �� ���� ����� ��Ÿ���� �ʰ� ��
              �̶� ���� ���ǿ� �������� �ʴ� ��鵵 ��Ÿ���� ���� outer join�� �����
 */
 
 select e.ename, d.deptno, d.dname from emp e, dept d where e.deptno=d.deptno order by d.deptno;
 
 /*
  �μ� ���̺��� 40�� �μ��� �����Ѵ�.
  ������, ���ΰ���� ���ԵǸ� 10 ~ 30�� �μ���ȣ�� ��µǰ� 40���� ��µ��� �ʴ´�.
  �̴� ��� ���̺��� �μ���ȣ���� 40���� �������� �ʱ� �����̴�.
  
  �μ����̺��� 40�� �μ��� ������ ������̺��� �μ���ȣ�� ������, 40�� �μ��� ��µǵ��� �Ϸ��� outer join
  �� ����ϸ� �ذ� ��
  outer join�� ����Ϸ��� ��ȣ(+)�� ����Ͽ� ���� ���ǿ��� ������ ������ �÷� �� �ڿ� ��ġ�ϰ� �ϸ� ��
  
  ��, ������̺� �μ���ȣ 40���� ���� ������ e.deptno(+)�ʿ� + ��ȣ�� �����̸� ��
 */
 
 -- self join: �� ���̺� ������ ����
 
 /*
   self join�̶� �� �״�� �ڱ� �ڽŰ� ������ �δ� ���� �ǹ���
   from�� ������ ������ ���̺���� 2�� ����ϰ� where������ ���� ������ �־���ϴµ�
   �̶� ���� �ٸ� ���̺��� ��ó�� �ν��� �� �ֵ��� �ϱ� ���ؼ� ��Ī�� ����Ѵ�.
   emp e, emp p
 */
 
 select ename, mgr from emp;
 
 -- emp ���̺� ��Ī�� ����Ͽ� �ϳ��� ���̺��� �ΰ��� ���̺��� ��ó�� ����Ϸ��� 
 -- work(������̺�), manager(�Ŵ��� ���̺�)�� ��Ī�� �ο��Ѵ�.
 
 
 select work.ename, manager.ename from emp work, emp manager where work.mgr=manager.empno;
 
 /*
 ��]
    ����� �̸��� ���� �Ŵ��� �̸��� ����ϴ� �������� �ۼ��Ͻÿ�.
    
    ��� ���: ford�� �Ŵ����� jones�̴�.
    
 */
 
 select work.ename ||'�� �Ŵ�����'||   manager.ename ||'�̴�.' 
 from emp work, emp manager where work.mgr=manager.empno;
 
 /*
  ���� ����
  
   ���� ������ �ϳ��� select ������ �� �ȿ� ���� �� �ϳ��� select �����̴�.
   �׷��⿡ ���� ������ �����ϰ� �ִ� �������� ��������,
   ���Ե� �� �ϳ��� ������ ���� ���� �����
   ���������� ������ ������ ��������, ������ ���������� ����
   ���������� �̿��ؼ� ���̺� ������ ������
   ���� �������� �̿��ؼ� ���̺� �����͸� �߰�, ����, ������ �� ����
 */
 
 /*
 ex) ����̸��� SCOTT�� ����� � �μ� �Ҽ����� �Ҽ� �μ����� �˾Ƴ����� ������ ����ؼ�
     �ذ� ������, ������ �ƴ� ���������� �̿��ؼ��� �ذ��� �����ϴ�.
 */
 
 -- ���� SCOTT�� �μ����� �˾Ƽ� �μ���ȣ�� �˾� �����Ѵ�.
 select deptno from emp where ename='SCOTT';
 select dname from dept where deptno=20;
 
 select dname from dept where deptno=(select deptno from emp where ename='SCOTT');
 -- ���������� �񱳿������� �����ʿ� ����ؾ��ϰ� �ݵ�� ��ȣ()�� �ѷ��ξ��Ѵ�.
 -- ���������� ���� ������ ����Ǳ� ���� �ѹ��� ������
 
 /*
 ������ ��������
   - ������ ���������� ���� select �������κ��� ���� �ϳ��� �ุ�� ��ȯ������,
     ������ �񱳿�����(=, >, >=, <, <=, <>)�� �����
     
 ������ ��������
   - ������������ ��ȯ�Ǵ� ����� �ϳ� �̻��� ���� �� ����ϴ� ���������̴�.
   
     ������ ������
     IN           : ���������� �� ����('=' �����ڷ� ���� ���)�� ���������� ��� �߿��� �ϳ��� ��ġ�ϸ� ��
     ANY, SOME    : ���������� �� ������ ���������� �˻� ����� �ϳ� �̻��� ��ġ�ϸ� ��
     ALL          : ���������� �� ������ ���������� �˻� ����� ��� ���� ��ġ�ϸ� ��
     EXIST        : ���������� �� ������ ���������� ��� �߿��� �����ϴ� ���� �ϳ��� �����ϸ� ��
 */

-- ������ ��������
-- SMITH�� ���� �μ����� �ٹ��ϴ� ����� ������ ����Ͻÿ�.(���������� �ۼ�: ������)
SELECT DEPTNO from emp where ename='SMITH';
select * from emp where deptno=20;

select * from emp where deptno=(select deptno from emp where ename='SMITH');

-- ������̺��� ��� �޿����� �� ���� �޿��� �޴� ����� �˻��Ͽ� ����Ͻÿ�.

-- �޿��� ����� ���Ѵ�.
select sal from emp;
select * from emp where sal > (select avg(sal) from emp);

-- IN ������
--   ����� 2�� �̻� �������� �������� ���������� ����� ��쿡�� ������ �����ڿ� �Բ� ����ؾ���

-- �޿��� 3000�̻� �޴� ����� �Ҽӵ� �μ��� ������ �μ����� �ٹ��ϴ� ����� ����Ͻÿ�.

select distinct(deptno) from emp where sal >= 3000;
select ename, sal, deptno from emp where deptno in (select Deptno from emp where sal >=3000);


/*
ANY
  - ���������� �� ������ ���������� �˻� ����� �ϳ� �̻� ��ġ�ϸ� ���̴�.
    ã���� ������ ���� ���� �� ��, �ּҰ� ���� ũ�� ���� ��
    
    ������ any�� ã���� ���� ���ؼ� �ϳ��� ũ�� ���� �ȴ�.
*/

-- �μ� ��ȣ�� 30���� ������� �޿� �� ���� ���� ��(950) ���� ���� �޿��� �޴�
-- ����� �̸�, �޿��� ����Ͻÿ�.

select sal from emp where deptno=30;
select ename, sal, deptno from emp where  deptno=30 and sal> any (select sal from emp where deptno=30);

-- ALL: ���� ������ �� ������ ���������� �˻� ����� ��� ���� ��ġ�ϸ� ��
--  EX) 30�� �Ҽӻ���� �߿��� �޿��� ���� ���� �޴� ������� �� ���� �޿��� �޴�
--         ����� �̸�, �޿��� ����Ͻÿ�.
--   30�� �μ� ��� �޿��� ��ο� ���Ͽ� Ŀ����

select ename, sal, deptno from emp where sal> ALL (select sal from emp where deptno=30);

-- �������� �̿��ؼ� ���̺� �ۼ�
create table emp07
as select * from emp where i=0;

create table emp08
as select empno, ename from emp where 1=0;

select * from dept02;
create table dept02
as select * from dept where 1=0;

-- ���������� �̿��� ������ �߰�
insert into dept02 select * from dept;


-- ���� ������ �̿��ؼ� ������ ����
-- 10�� �μ��� �������� 40�� �μ��� ���������� �����Ͻÿ�.
update dept02 set loc = (select loc from dept02 where deptno=40) where deptno=10;
/*
   �÷��� 2�� �̻��� ���
    �������� ���� �� ����
    1. update ���̺��
    set �÷���=(��������), �÷���2=(��������) where ����
    
    2. update ���̺��
    set (�÷���1, �÷���2)=(��������1, ��������2) where ����
*/

-- ex) 20�� �μ��� �μ���� �������� 30�� �μ��� �μ���� ���������� �����Ͻÿ�.
  update dept02 set dname=(select dname from dept02 where deptno=30), 
  loc=(select loc from dept02 where deptno=30) where deptno=20;
  select * from dept02;
-- �� ��° ���
update dept02 set (dname, loc) = (select dname, loc from dept02 where deptno=30)
where deptno = 20;

rollback;

sElect deptno from dept where dname='SALES';
delete from emp01 where deptno=(select deptno from dept where dname='SALES');
rollback;

-- ��] ������ 'SALESMAN'�� ����� �޴� �޿����� �ּ� �޿����� ���� �޴� ������� �̸��� �޿��� ����ϵ�
--     �μ���ȣ�� 20���� ����� ���ܽ�Ű�� ����Ͻÿ�.
select min(sal) from emp where job='SALESMAN';
select ename, sal, deptno from emp where deptno != 20 and sal > (select min(sal) from emp where job='SALESMAN');

-- ����� ����
-- CREATE USER ������ IDENTIFIED BY ��й�ȣ
-- ������: JAVAUSER, ��й�ȣ: JAVA



---------------------- �� ---------------------
/*
   ���� ����
     ��(view)�� '����'�� �ǹ̸� ���� �ִ� ���� ������ ���� �� �� �ֵ��� ���� ���̺�
     ����� �����͸� �並 ���ؼ� �� �� �ֵ��� �Ѵ�.
     
     �並 ���� ���� ���̺��̶�� �θ��µ� �̴� ���̺�� ���� �����ϰ� ���Ǳ� �����̴�.
     
     ��� �������� ������ ���̺�� �޸� ������ ���� ������ ����.
     ��� ���� �������� �����ϰ� �ִ� ��ü��� ǥ���� �� �ִ�.
*/
select * from emp01;

create view view_emp10
as
select empno, ename, deptno from emp01 where deptno=10;


/*
���� ��� ����
   �������� ���̺� ������ �����ϱ� ���� ����Ѵ�.
   ������ ���Ǹ� ���� ����� ���ؼ� ����Ѵ�.
   
���� Ư¡
   ��� ���̺� ���� ������ ������ ���̺��� ������ �κи� ���� �� �ִ� ���� ���̺��̴�.
   ��� ���� �ڷḦ ������ ������, �並 ���� ���̺��� ������ �� �ִ�.
   �ϳ��� ���̺� ���� ������ ������ ����.
   
�� ������ ��ȸ
   �並 �����ϱ� ���ؼ��� ���̺� ������ ���� DDL(create, select)�� ����Ѵ�.
   
�⺻ ���̺�
   �信 ���� ���������� �����ؼ� ����ϴ� ���������� �����͸� �����ϰ� �ִ�
   �������� ���̺��� �ǹ���
*/

select * from emp01;
drop table emp01;
create table emp01
as select * from emp;
 
 select empno, ename, sal, deptno from emp01 where deptno=10;
 
 select * from view_emp10;
 
 /*
 �� ����
  - ��� ���̺�ó�� �ϳ��� ��ü�μ� ���̺� ������ ���� �����ϰ� create view ������� �����Ѵ�.
  
   ���� ����
   
   create [or replace] [force] [noforce] view view_name
   [ (alias, alias, ...) ]
   as subquery
   [with check option]
   [with read only];
   �ش� �並 ���ؼ��� select�� �����ϸ� insert/update/delete�� ����� �� ����.
   
   or replace view
     - ���ο� �並 ���� �� ���� �Ӹ� �ƴ϶� ������ �䰡 �����ϴ��� �������� �ʰ�
       ���ο� ������ ��� ������ �� �ִ�.
       
   force
     - ���� ���̺��� ���� ���ο� ������� �並 ������
     
   with check option
     - �ش� �並 ���ؼ� �� �� �ִ� ���� �������� update or insert�� �����ϴ�.
     
   ���� ���� ����
     - ����ڰ� �信 ���ؼ� ���Ǹ� �ϸ� user_views���� �信 ���� ���Ǹ� ��ȸ��
     - �⺻ ���̺� ���� ���� ������ ����
     - �信 ���� ���Ǹ� �⺻ ���̺� ���� ���Ƿ� �����Ѵ�.
     - �⺻ ���̺� ���� ���Ǹ� ���� �����͸� �˻���
     - �˻��� ����� ���
     
   ���� ����
     - �⺻ ���̺��� ���� ���� �ܼ� ��, ���� ��� ����
     
     �ܼ� ��                             ���� ��
      - �ϳ��� ���̺�� ����               - �������� ���̺�� ����
      - �׷��Լ��� ����� �Ұ���           - �׷� �Լ��� ����� ����
      - DISTINCT ����� �Ұ���            - DISTINCT ����� ����
      - DML() ��밡��                      - DML ����� �Ұ���
 */
 
 insert into view_emp10 values(8000, 'ANGEL', 10);
 -- �ܼ� �信���� DML��ɹ� ó�� ����� �並 ������ �� ����� �⺻ ���̺��� ������ ��ģ��.
 select * from view_emp10;
 
 -- �ܼ� ���� �÷��� ��Ī �ο�
 -- �����ȣ, �����, �޿�, �μ���ȣ�� ������ �並 �ۼ��ϵ� 
 -- �⺻ ���̺��� emp01�� �ϰ� �÷����� �ѱ۷� �ۼ��Ͻÿ�.
desc view_emp10;

create or replace
view view_emp10(�����ȣ, �����, �޿�, �μ���ȣ)
as
select empno, ename, sal, deptno from emp01;
select * from view_emp10 where deptno=10;

/*
  ���� ����: �÷��� ��Ī�� ����ؼ� �並 �����ϸ� view_emp10�� �÷� �̸��� ��Ī����
            ������ ������ �ݿ��ǰ�, �⺻ ���̺��� �÷��̸����� ���� ������ ��ġ�� ���ϱ� ������ ���� �߻�
*/

-- �׷��Լ��� ����� �ܼ� ��
-- �μ��� �޿� �Ѿװ� ����� ���ϴ� �۾��� ���� �Ѵٸ� �̸� ��� ������ ���Ҵٰ� ����ϸ� ���ϴ�.
create or replace view view_sal
as
select deptno, sum(sal) as "salsum", round(avg(sal)) as "salavg"
from emp01
group by deptno;
select * from view_sal;
 
 /*
  �信 ���õ� ������ ��ųʸ�
    - ������ ��ųʸ� user_views�� ����ڰ� ������ ��� �信 ���� ���ǰ� ����Ǿ� ����
      ���� �̸��� ���� view_name�̶� �÷��� �並 �ۼ��� �� ����� ���������� ����Ǿ� �ִ�
      text �÷��� ����
      
      �˻�: select view_name, text from user_views;
 
 
�� ����
  - ��� ������ ���� ���� ���̺��̱� ������ �並 �����Ѵٴ� ���� 
    user_views ������ ��ųʸ��� ����Ǿ� �ִ� ���� ���Ǹ� �����ϴ� ����
 */
select view_name, text from user_views;
drop view view_sal;

create or replace
view view_emp10(�����ȣ, �����, �޿�, �μ���ȣ)
as
select empno, ename, sal, deptno from emp01;


create or replace
view view_emp10
as
select empno, ename, sal, comm, deptno from emp01 where deptno=10;

select * from emp01;

select * from view_emp10;

-- �⺻ ���̺� ���� �並 �����ϱ� ���� force �ɼ�
-- �⺻ ���̺��� �������� �ʴ��� �並 ������
create force view view_notable
as
select empno, ename, deptno from emp09
where deptno=10;

drop view view_notable;
select * from view_notable;
select * from emp02;

/*
with check option
   - �並 ������ �������� ������ �÷� ���� �������� ���ϵ��� �ϴ� ���� �ǹ���
*/

create or replace
view view_chk20
as
select empno, ename, sal, comm, deptno from emp01
where deptno=20 with check option;

select * from view_chk20;
-- �޿��� 5000 �̻��� ����� 10�� �μ��� �̵��ϴ� �������� �ۼ�
update view_chk20 set deptno=10 where sal >= 5000;
-- ����: �μ���ȣ�� �ɼ��� ���� �Ͽ����Ƿ� �� �並 ���ؼ��� �μ���ȣ�� ������ �� ����.

/*
  with read only: �並 ���ؼ��� �⺻ ���̺��� � �÷��� ���ؼ��� ������ ������ �� ����.
  
  with check option�� with read only�� ������
  
  with  check option�� ���ǿ� ����� �÷��� ���� �������� ���ϰ� �ϴ� ���̰�,
  with read only�� �⺻ ���̺��� ��θ� �������� ���ϰ� �ϴ� ���� �ǹ���
*/

create or replace view view_read30
as
select empno, ename, sal, comm, deptno
from emp01
where deptno=30 with read only;

select * from view_read30;
update view_read30 set comm=1000;

/*
 �� Ȱ���ϱ�
 
  ����߿��� �Ի����� ���� ��� 5��(TOP-5)���� ��� ���ǹ��� �ۼ�
  ROWNUM �÷��� �̿�
   - ROWNUM �÷��� ����Ŭ���� ���������� �ο��Ǵµ� insert���� ���� �Է���
   ������ ���� 1�� �����Ǹ鼭 ���� ������
*/

create or replace view view_hire
as
select empno, ename, hiredate from emp01
order by hiredate;
select rownum, empno, ename, hiredate from view_hire;



create table department (
deptno number(3) not null,
dname varchar2(30) not null,
college number(3) not null,
loc varchar2(15) not null,
constraint department_pk primary key(deptno)
);
commit;
select * from department;





 
 