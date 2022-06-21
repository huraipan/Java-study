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





SELECT COUNT(*) AS Į���� FROM emp;
SELECT COUNT(ENAME) AS ROW�� FROM emp;

SELECT avg(sal) AS ��պ��� FROM emp;
SELECT max(sal) AS �ְ���� FROM emp;
SELECT min(sal) AS ���Ϻ��� FROM emp;
SELECT sum(sal) AS �����հ� FROM emp;

