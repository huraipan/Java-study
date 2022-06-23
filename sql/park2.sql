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



-- CONCAT: 두 문자를 연결

select concat('Kim','HaeYoung') from dual;

-- LENGTH: 문자의 길이를 반환
-- LENGTHB: 문자의 길이를 반환

select length('KimHaeyoung'), length('김해영') from dual;
select lengthb('KimHaeyoung'), lengthb('김해영') from dual;

-- 문) 10번 부서 소속 사원들의 이름의 길이를 구하여 출력하시오.
select deptno, empno, ename, length(ename) from emp where deptno=10;
-- 문) 직원 중 이름이 4글자인 직원의 이름을 소문자로 출력하시오.
select empno, lower(ename) from emp where length(ename)=4;

/*
   INSTR:  특정문자의 위치 값을 반환
   INSTRB: 특정문자의 위치 값을 반환
*/

select instr('KimHaeYounga','a',5,2) from dual;
select instrb('김김해해영영','영',1,2) from dual;
-- instrb: 바이트 수 기준으로 문자의 위치를 알아내는 함수

/*
   SUBSTR: 문자를 잘라서 추출
           문자열 일부만 추출하는 함수
   SUBSTRB: 문자를 잘라서 추출
*/

select substr('KimHaeYoung',-4,3) from dual;
-- select substr('대상 문자열', 시작위치, 추출할 개수)

-- 사원 테이블에서 20번 부서 사원들 중 입사년도를 추출하시오
select deptno, ename, substr(hiredate,1,2) from emp where deptno=20;
-- 20번 부서에서 87년도에 입사한 사원의 정보를 출력하시오.
select * from emp where substr(hiredate,1,2)=87 and deptno=20;


select substrb('김김해해영영', 10, 6) from dual;

/*
  LPAD,RPAD: 입력받은 문자열과 기호를 정렬하여 특정 문자열의 길이를 반환함
  10    
*/
select lpad('KimHaeYoung', 20, '@') as lpad from dual; 
select rpad('KimHaeYoung', 20, '@') as rpad from dual; 


select ename from emp where ename='SMITH';
select ename, trim('S' from ename) as trim, trim('H' from ename) 
from emp where ename='SMITH';

select ename, trim('     Oracle llaaaa    ') as trim1, trim('H' from ename) as trim2
from emp where ename='SMITH';

-- 숫자함수: 숫자형 데이터를 조작하여 변환된 숫자 값을 변환하는 함수
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

-- 특정 자릿수에서 반올림하는 함수(round)
-- round(대상, 표시할 자릿수)
select 
round(35.12, 1),-- 소수점 이하 2번째 자리에서 반올림, 소수점이하 한자리까지 표시
round(21.125, 2),-- 소수점 이하 3번째 자리에서 반올림, 소수점이하 두자리까지 표시
round(47.51),-- 0번째 자리에서 반올림 소수이하 1자리 반올림 함
round(834.12,-1),-- 두번째 인자값이 음수이면 일의 자리에서 반올림함
round(653.53,-2)-- 십의 자리에서 반올림함
from dual;

select power(3,2) from dual;
select mod(34,2) from dual;

-- 문) 사번이 짝수인 사원들의 사원번호, 이름, 직급을 출려하시오.
select empno, ename, job from emp where mod(empno,2)=0;


-- 날짜함수: 날짜값을 다른 형태로 변환하여 나타냄
-- sysdate, months_between, add_months, next_day, last_day, round, trunc

select sysdate from dual;

-- 부서번호가 10인 사원을 대상으로 입사한 날로부터 오늘까지 며칠이 지났는가?
select ename, hiredate, months_between(sysdate,hiredate) from emp  where deptno=10;
select hiredate, add_months(hiredate, 3) as plus3 from emp;

select NEXT_DAY(SYSDATE, '수') from dual;
select NEXT_DAY(SYSDATE, 'MONDAY') from dual;

alter session set nls_language=korean; -- 한국어
alter session set nls_language=american;-- 영어


-- LAST_DATE: 해당 달의 마지막 날짜를 반환함
select SYSDATE, last_day(sysdate) from dual;

-- trunc: 날짜도 잘라냄
select hiredate from emp where deptno=10;
select sysdate, trunc(hiredate, 'MONTH') from emp where deptno=10;

-- round: 함수에 형식(포멧) 모델을 지정하면 숫자 이외의 날짜에 대해서도 반올림을 적용할 수 있다.
-- round(date, 'MONTH');

-- 입사일을 월 기준으로 반올림
select hiredate, round(hiredate,'MONTH') from emp where deptno=10;

/*
 년: 7월 1일부터 반올림,    월: 16일을 기준으로 반올림
 일: 한 주가 시작되는 날짜,  시간: 분을 기준
*/

/*
 변환함수: 자료형을 변환시키고자 할 때 사용하는 함수
 
  TO_CHAR: 날짜형 또는 숫자형을 문자형으로 변환하고자 할 때
  TO_DATE: 문자형을 날짜형으로 변환하고자 할 때
  TO_NUMBER: 문자형을 숫자형으로 변환하고자 할 때
*/

-- TO_CHAR: 날짜형 또는 숫자형을 문자형으로 변환하고자 할 때
/*
TO_CHAR (날짜 데이터, '출력형식')

출력형식 종류
  YYYY: 년도 표시(4자리)
  YY: 년도 표시(2자리)
  MM: 월을 숫자로 표시
  MON: 월을 알파벳으로 표시
  DD: 일을 표시
  DAY: 요일 표시
  DY: 요일을 약어로 표시
*/

select hiredate, to_char(hiredate, 'YYYY/MON/DD/DY') from emp where deptno=20;
select sysdate, to_char(sysdate, 'yyyy-mm-dd-day') from dual;


/*
 시간 출력 형식의 종류
 
 AM 또는 PM    : 오전과 오후 시간 표시
 A.M 또는 P.M  : 오전과 오후 시간 표시
 HH 또는 HH12  : 시간(1 ~ 12)
 HH24         : 1~24 시간으로 표시 (0 ~ 23)
 MI           : 분
 SS           : 초
*/

select to_char(sysdate, 'yyyy/mon/dd hh24:mi:SS') from dual;

/*
   to_char(): 숫자형을 문자형으로 변환
   
   숫자 출력형식
     0: 자릿수를 나타내며 자릿수가 맞지 않을 경우 0으로 채운다.
     9: 자릿수를 나타내며 자릿수가 맞지 않아도 채우지 않는다.
     L: 각 지역별 통화 기호를 앞에 표시한다. $, ￦
     .: 소수점
     ,: 천 단위 자리 구분
     
   숫자             형식            결과
   
   12345.67     999,999,999      12,345.67
   12345.67     999999           12345
   12345.67     $999,999,999     $12,345,67
   12345.67     L999,999,999     ￦12,345,67
   12345.67     S999,999,999     +12,345,67
     
*/

select ename, sal from emp where deptno=10;
select ename, sal, to_char(sal,'$999,999') from emp where deptno=10;

-- 올해 며칠이 지났는지 날짜를 계산하여 출력하시오.
select sysdate-'2022/01/01' from dual;-- <- 오류발생
select trunc(sysdate-TO_DATE('2022/01/01', 'yyyy/mm/dd')) from dual;
select sysdate-to_date('2022/01/01', 'yyyy/mm/dd') from dual;

/*
 일반함수 (기타 함수)
 
 NVL    : 첫번째 인자로 받은 값이 NULL과 같으면 두 번째 인자 값으로 변경
 DECODE : 첫번째 인자로 받은 값을 조건에 맞춰 변경(if 조건문과 유사함)
 CASE   : 조건에 맞는 문장을 수행함(switch문과 유사함)
*/

-- NVL: NULL값을 다른 값으로 변환하는 함수
--      NULL을 0 또는 다른 값으로 변환하기 위해 사용하는 함수

select ename, sal, nvl(comm,0) as comm, job from emp order by job;

-- 연봉을 계산하기 위해서 급여에 12를 곱한 수 커미션을 더해보면 어떻게?

select ename,
sal*12+nvl(comm,0) as sal,
nvl(comm,0) as comm, 
job from emp order by sal desc;

-- 유일하게 상관이 없는 사원이 있는 이 사람이 CEO
-- mgr의 NULL값을 CEO로 변환하여 출려하시오.
select ename,  nvl(to_char(mgr), 'CEO') as MGR from emp;
select ename,  NVL(TO_CHAR(MGR, '9999'),'CEO') as MGR from emp;
-- 숫자데이터를 문자열로 변환
-- NULL 값을 변경한다.

select deptno from emp;
select distinct(deptno) from emp;
select deptno, dname from dept;
select * from emp;

/*
  조건에 맞는 문을 선택하기 위한 함수
  SWITCH CASE문과 같이 여러가지 경우에 대해서 선택할 수 있는 함수
  DECODE(표현식, 조건, 결과1,
                조건2, 결과2,
                조건3, 결과3,
                기본결과 n)
*/
select empno,
ename,
decode(deptno, 10, 'ACCOUNTING', 20, 'RESEARCH', 30, 'SALES', 40, 'OPERATIONS') as deptname,
deptno
from emp
order by deptname;
/*
  CASE: 조건에 따라 서로 다른 처리가 가능한 함수
  
        CASE 표현식 WHEN 조건1 THEN 결과1
             표현식 WHEN 조건2 THEN 결과2
             표현식 WHEN 조건3 THEN 결과3
             ELSE 결과 n
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
 문) 직급에 따라 보너스를 지급하기 위해 직급이 'manager'인 사원은 15% 인상하고
     직급이 'clerk'인 사원은 5% 인상하도록 처리하시오. (decode 함수 사용)
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
 GROUP BY절
   특정 컬럼 값을 기중으로 테이블을 그룹별로 나누기 위해 사용함
   형식: select 컬럼명, 그룹함수 from 테이블명 where 조건식
   group by 컬럼명
*/
-- 사원들을 부서번호를 기준으로 3개
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
create table 테이블명(
     컬럼명 데이터자료형,
     컬럼명 데이터자료형,
     컬럼명 데이터자료형,
     컬럼명 데이터자료형
);

  char       : 고정길이 문자 데이터 최소 크기는 1, 최대 크기는 2000byte
  varchar2   : 가변길이 문자 데이터 실제입력된 문자열을 길이만큼 저장함 최소크기는 1, 최대크기는 4000byte
  number     : 숫자형 데이터 최대 40자리까지 저장할 수 있음, 소수점이나 부호는 길이에 포함시키지 않음
  number(w)  : 지정한 자리까지 수치로 최대 38자리까지 가능함
  number(w,d): w는 전체자리수, d는 소수점이하 자릿수이며 소수점은 자릿수에 포함되지 않음
  date       : 날짜 데이터를 저장(기원전, 기원후) 
  long       : 가변길이 문자형 데이터 타입, 최대길이: 2GByte
  lob        : 2GB까지의 가변길이 바이너리 데이터를 저장시킴
              (바이너리데이터: 이미지 파일, 실행파일 여러가지 문서파일)
  rowid      : 데이터베이스에 저장되어 있지 않으며 데이터베이스 데이터도 아니다.
  
*/


SELECT * FROM emp;

select rowid from emp where rownum <=5;

/*
 테이블과 컬럼명을 부여하기 위한 규칙
  - 반드시 문자로 시작해야한다.
  - 1 ~ 30자까지 가능하다.
  - A ~ z까지의 대소문자, 0 ~ 9까지의 숫자, 특수문자(_,$,#)만 가능함
  - 공백을 허용 하지 않음
  - 예약이나 테이블명 중복 불가
*/

create table emp01(
empno number(4),
ename varchar2(20),
sal number(7,2)
);

desc emp01;

