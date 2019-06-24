insert into t_board values(
1,0,'테스트','테스트',null,sysdate,'hong');
insert into t_board values(
2,0,'안녕','안녕',null,sysdate,'hong');
insert into t_board values(
3,2,'답변','답변',null,sysdate,'hong');
insert into t_board values(
4,0,'김유신','김유신',null,sysdate,'kim');
insert into t_board values(
5,3,'답변2','답변2',null,sysdate,'lee');
insert into t_board values(
6,2,'후기','후기',null,sysdate,'lee');

commit;

create table t_board(
	articleNo number(10) primary key
	,parentNo number(10) default 0
	,title varchar2(500) not null
	,content varchar2(4000)
	,imageFileName varchar2(30)
	,writedate date default sysdate not null
	,id varchar2(10)
	,constraint fk_id foreign key(id)
	references t_member(id)
);
