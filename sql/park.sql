-- ���̺��� �˻��ϴ� ��ɾ�
select * from tab;

-- ���̺� ���� Ȯ�� ���
DESC emp;

/*
����Ŭ �ڷ���
 ������ ������
 NUMBER(ũ������): �⺻ ũ��� 4byte
 
 ������
 DATE ��¥��: ��, ��, ��, ��, ��, ��, ����
 
  ������
 VARCHAR2(ũ������): 
 CHAR(ũ������)
*/

select * from tab;

-- select: �����ͺ��̽� ���� �ִ� �����͸� ��ȸ�ϱ� ���� ����̴�.
-- *: ��� �÷�(��)�� �ǹ���
--  Ư�� �÷�(�̸�, ��ȣ) empno, ename
select empno, ename, sal from emp;
-- from: ���̺� ������ �� from�������� ���̺���� ������
select * from dept;
select * from emp;
-- emp ���̺��� ������ �޿��� �Ի����� ����ϴ� �������� �ۼ��Ͻÿ�.
select ename, sal, hiredate from emp;

-- ��� ������: +, -, *, /
select ename, sal*12 from emp;
select max(sal*12) from emp;
select ename, sal, sal*12 from emp;

 
/*
 null�� �������̴�.
 null�� �ǹ�
  1. 0�� �ƴϰ�
  2. �� ������ �ƴϰ�
  3. ��Ȯ�� ���� �ǹ���
  4. � ������ �� �� ������ � ���� �����ϰ� �ִ�.
  5. ? Ȥ�� ���� �ǹ̵� ����
  6. ����, �Ҵ�, �񱳰� �Ұ����ϴ�.
*/




select 100+? from dual;

desc dual;
/*
dual ���̺�
- �� ������ ����� ����ϱ� ���� ���̺�
  DUMMY �÷����� �� ���� ���ڸ��� ������ �� �ִ� X��� ���� ����
        �� �ϳ��� �ุ�� ������
*/



select * from dept;
select 24*60*60 from dept;

desc dual;
desc dept;




