select * from EMP; -- alt + x

select empno, ename, job, sal, hiredate from emp where empno = 7499;

select empno, ename, job, sal, hiredate from emp where empno = 9999; -- 없는  empno -- 오류는 안나고 컬럼명이라도 나옴

--레코드 추가
insert into emp(empno,ename,job,sal,hiredate) values(9000,'hee','teacher',200,sysdate)

commit








