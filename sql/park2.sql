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
   0�� ������� �ƴ� � ���� �����Ͻô� ������ � ������ �˾Ƴ� ���� ����.
   
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

 order by ���� �ο�(��)�� �����ϴµ� �����
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


-- ù ��¥�� �빮�ڷ� ��ȯ
select INITCAP('DATA BASE PROGRAMMING') from dual;

-- ������̺��� 10�� �μ� �Ҽ��� ����� �̸��� ù ���ڸ� �빮�ڷ� ��ȯ�Ͻÿ�.
select INITCAP(ENAME), DEPTNO from emp where deptno =10;

-- 'smith'�� �̸��� ���� ����� ���, �̸�, �޿��� Ŀ�̼��� ����Ͻÿ�.
select empno, ename, sal, comm from emp where ename=upper('smith');

select empno, ename, sal, comm from emp where lower(ename)='smith';



-- CONCAT: �� ���ڸ� ����

select concat('Kim','HaeYoung') from dual;

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

-- ������ �������� 

select months_between(sysdate, '2022/01/01') from dual;
select to_date(sysdate) - to_date('2022/01/01') from dual;



