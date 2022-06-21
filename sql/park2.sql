select * from dept;

-- 컬럼 이름을 명시해서 특정 컬럼만 보기
-- ex)dept 테이블에서 부서번호와 부서명만 출력
select deptno, dname from dept;

select * from emp;

-- emp 테이블에서 사원이름과 급여와 입사일만을 출력하는 쿼리문을 작성하시오.
select ename, sal, hiredate from emp;

-- 별칭: 컬럼을 기술한 바로 뒤에 as라고 쓴 후 별칭을 기술
-- 별칭에는 공백문자, 특수문자($, _, #)등 문자를 표현하고 싶거나 대소문자를 구별하고 싶을 때
-- ""을 사용하여 기술한다.
-- as 생략하고 ""를 사용하여 별칭을 기술하는 것이 가능하다.

select ename as "사원이름", sal as "급여", hiredate as "입사일" from emp;
select ename  "사원이름", sal  "급여", hiredate  "입사일" from emp;

select deptno "DepartmentNo", dname "DepartmentName" from dept;

-- Distinct: 중복된 데이터를 한번만 출력할 때 사용
select distinct job from emp;
select distinct deptno from emp;

-- where 조건과 비교연산자
-- select column from table where 조건문;
-- ex) 급여가 3000이상 받는 사원을 대상으로 사원번호, 사원이름, 급여를 출력하시오.
-- 비교연산자: =, >, <, >=, <= (<>, !=, ^=)

select empno, ename, sal from emp where sal>=3000;

-- 문1) 사원테이블에서 부서번호가 10인 사원에 대한 모든 정보를 출력하라.
select * from emp where deptno=10;
-- 문2) 사원테이블에서 급여가 2000미만인 사원에 대하여 사원번호, 이름, 급여를 출력하시오.
select empno, ename, sal from emp where sal<2000;

/*
문자 데이터 조회
 - 문자 데이터는 반드시 싱글쿼터 안에 표시하고, 대소문자를 구분한다.
*/
select * from emp where ename='SCOTT';
-- 문) 사원이름이 MILLER인 사원의 번호와 이름, 직급을 출력하시오.
select empno, ename, job from emp where ename='MILLER';

select * from emp;
/*
날짜 데이터 조회
 - 날짜 데이터는 반드시 싱글쿼터 안에 표시하고, 년/월/일 형식으로 기술한다.
 문) 입사일이 85년 이후인 사람을 정보(이름, 입사일)를 출력하시오
*/
select ename, hiredate from emp where hiredate>='85/01/01';

/*
논리 연산자
AND
 - 두 가지 조건이 모두 만족을 해야만 검색할 수 있음
OR
 - 두 가지 조건중 한 가지만 만족하더라도 검색할 수 있음
NOT
 - 조건에 만족하지 못하는 것만 검색함
BETWEEN AND
 - 특정 범위 내에 속하는 데이터를 검색하고자 할 때 사용함
IN
 - 동일한 컬럼이 여러 개 값 중 하나인지 알아보고자 할 때 사용함
*/
-- 부서번호가 10번이고, 직급이 MANAGER인 사원의 정보를 출력하시오.

select * from emp where deptno=10 and job='MANAGER';
-- 급여가 1000 ~ 3000 사이
select * from emp where sal between 1000 and 3000;

-- 부서번호가 10번이거나 직급이 MANAGER인 사원의 정보를 출력하시오.
select * from emp where deptno=10 or job='MANAGER';

-- 사원번호가 7844이거나 7654이거나 7521인 사원의 정보를 출력하시오.
select * from emp where empno in(7844, 7654, 7521);


/*
like 연산자
 - 검색 하고자 하는 값을 정확히 모를 경우 와일드 카드와 함게 사용하여
   원하는 내용을 검색하는 연산자
   
   와일드 카드
   %: 문자가 없거나, 하나 이상의 문자가 어떤 값이 오든 상관없음
   _: 하나의 문자가 어떤 값이 오든 상관없음
*/

-- k로 시작하는 사원을 검색하여 정보를 출력하시오.
select * from emp where ename like 'K%';
-- %는 몇 개의 문자가 오든 상관없다.
select ename from emp;

-- 이름의 두번째 글자가 A인 사원의 정보를 출력
select ename from emp where ename like '_A%';
-- 이름중에 A를 포함한 사원의 정보를 출력
select ename from emp where ename like '%A%';
-- 이름중에 A를 포함하지 않는 사원의 정보를 출력
select ename from emp where ename not like '%A%';

select comm from emp where comm is null;
-- NULL이 저장되어 있는 경우에는 = 연산자는 사용할 수 없다.


/*
NULL을 위한 연산자
 오라클에서 컬럼에 null값이 저장되는 것을 허용함
 null은 미확정, 알 수 없는 값을 의미함
   0도 빈공간도 아닌 어떤 값이 존재하시는 하지만 어떤 값인지 알아낼 수는 없다.
   
 null은 연산, 할당, 비교가 불가능하다.
 
 is null과 is not null
  - 특정 컬럼 값인지 비교할 경우에는 비교연산자(=)을 사용하지 않고 is null 연산자를 사용함
  - null 값이 아닌지를 알아보려 할 때는 비교연산자(<>)를 사용하지 않고 is not null을 사용
  
    is null: null이면 만족
    is not null: null이 아니면 만족
*/

select 100 + null from dual;
-- 커미션을 받지 않는 사원
select ename, comm from emp where comm is null;
-- 커미션을 받는 사원
select ename, comm from emp where comm is not null;

-- 자신의 직속상관이 없는 사원의 이름과 직급과 직속 상관의 사원 번호를 출력하시오.
select ename, job, mgr from emp where mgr is null;
select * from emp;

/*
정렬을 위한 order by 절

 order by 절은 로우(행)를 정렬하는데 사용함
  쿼리문 맨 뒤에 기술하며 정렬의 기준이 되는 컬럼 이름 또는 select절에서 명시된 별칭을 사용
  
   기준            오름차순(asc)               내림차순(desc)
   숫자          작은 값부터 정렬              큰 값 부터 정렬
   문자          사전 순서로 정렬            사전 반대 순서로 정렬
   날짜          빠른 날짜 순서대로           늦은 날짜 순서대로
   NULL         가장 마지막에 나옴             가장 먼저 나옴
   
   영문자인 경우 소문자를 가장 큰 값으로, NULL값은 모든 값 중 가장 작은 값으로 인식함
*/

-- 사원번호를 기준으로 오름차순 정렬하시오.
select empno from emp order by empno desc;

-- 문) 사원의 사원번호, 이름, 급여를 급여가 높은 순으로 출력하시오.
select empno, ename, sal from emp order by sal desc;
-- 문) 입사일이 가장 최근인 사원 순으로 사원번호, 이름, 입사일을 출력하시오.
select empno, ename, hiredate from emp order by hiredate desc;

/*
 sql                              sqlplus
 국제 표준 DB언어                   오라클에서만 사용하는 명령
 DB의 데이터를 조작할 수 있음        DB의 데이터를 조작할 수 없다.
 모든 명령어의 끝은 세미클론          모든 명령어는 엔터키에 의해 끝남(;으로 가능함)
   으로 끝남                        명령라인이 계속 이어질 경우 라인의 끝에 -을 추가함
 약어를 사용할 수 없음               약어 사용 가능  
*/
select * from emp where deptno = 10;
/*
단일행 함수
   - 행마다 함수가 적용되어 결과를 반영하는 함수
   
   문자함수: 문자열을 다른 형태로 변환하여 나타냄
   숫자함수: 숫자값을 다른 형태로 변환하여 나타냄
   날짜함수: 날짜값을 다른 형태로 변환하여 나타냄
   변환함수: 문자, 숫자, 날짜 값을 서로 다른 타입으로 변환하여 나타냄
   일반함수: 기타함수
   
그룹 함수
  - 하나 이상의 행을 그룹으로 묶어 연산하여 하나의 결과로 나타냄
  
  SUM: 그룹의 누적 합계를 구함
  AVG: 그룹의 평균을 구함
  COUNT: 그룹의 총 개수를 구함
  MAX: 그룹의 최소값을 구함
  MIN: 그룹의 최소값을 구함
  STDDEV: 그룹의 표준편차를 구함
  VARIANCE: 그룹의 분산을 구함
*/

/*
 문자함수: 문자열을 다른 형태로 변환하여 나타냄
          문자형의 값을 조작하여 변환된 문자 값을 반환함
   
    LOWER: 소문자로 변환
    UPPER: 대문자로 변환
    INITCAP: 첫 글자만 대문자로 변환
    CONCAT: 문자의 값을 연결
    SUBSTR: 문자를 잘라서 추출
    SUBSTRB: 문자를 잘라서 추출
    LENGTH: 문자의 길이를 반환
    LENGTHB: 문자의 길이를 반환
    INSTR: 특정문자의 위치 값을 반환
    INSTRB: 특정문자의 위치 값을 반환
    LPAD,RPAD: 입력받은 문자열과 기호를 정렬하여 특정 문자열의 길이를 반환함
    TRIM: 잘라내고 남은 문자를 표시함
    CONVERT: 문자 SET을 변환함
    CHR: ASCII 코드 값으로 변환
    ASCII: ASCII 코드 값을 문자로 변환
    REPLACE: 문자열에서 특정 문자를 변경함
*/
select 'DataBase' , LOWER('DataBase') from dual;
select ename, LOWER(ename) from emp;
select 'DataBase' , UPPER('DataBase') from dual;
-- 직급이 manager인 사원을 검색하시오.
select EMPNO, ENAME, JOB from emp where LOWER(job)='manager';


-- 첫 글짜만 대문자로 변환
select INITCAP('DATA BASE PROGRAMMING') from dual;

-- 사원테이블의 10번 부서 소속의 사원의 이름을 첫 글자만 대문자로 변환하시오.
select INITCAP(ENAME), DEPTNO from emp where deptno =10;

-- 'smith'란 이름을 갖는 사원의 사번, 이름, 급여와 커미션을 출력하시오.
select empno, ename, sal, comm from emp where ename=upper('smith');

select empno, ename, sal, comm from emp where lower(ename)='smith';





SELECT COUNT(*) AS 칼럼수 FROM emp;
SELECT COUNT(ENAME) AS ROW수 FROM emp;

SELECT avg(sal) AS 평균봉급 FROM emp;
SELECT max(sal) AS 최고봉급 FROM emp;
SELECT min(sal) AS 최하봉급 FROM emp;
SELECT sum(sal) AS 봉급합계 FROM emp;

