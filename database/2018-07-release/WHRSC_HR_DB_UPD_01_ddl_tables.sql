SET DEFINE OFF;

ALTER TABLE APPLICANT_RATING ADD DATE_QUAL_SENT_DEU DATE;
ALTER TABLE APPLICANT_RATING ADD DATE_QUAL_APPROVED DATE;
ALTER TABLE APPLICANT_RATING ADD QUAL_REVIEW_NOTES CLOB;
ALTER TABLE RECRUITMENT ADD ANN_QUAL_REVIEWER VARCHAR2(100);
ALTER TABLE RECRUITMENT ADD DATE_REC_PCKG_SENT_DEU DATE;
ALTER TABLE RECRUITMENT ADD DATE_REC_PCKG_SENT_APPROVED DATE;
ALTER TABLE RECRUITMENT ADD REC_PCKG_NOTES CLOB;

ALTER TABLE MAIN MODIFY JOB_OPENING_ID VARCHAR2(30);


 CREATE OR REPLACE  VIEW VW_WHRSC_RECRUITMENT (TRANSACTION_ID, DATE_RECEIVED, ACTION_TYPE, DATE_SF52_RECEIVED, GLOBAL_RECRUITMENT, ADMIN_CODE, INSTITUTE, ORG_INITS, PROPOSED_EFF_DATE, BRANCH_CHIEF, TEAM_LEADER, HR_SPECIALIST, HR_ASSISTANT, HR_SPA, PCKG_COMPLETE, MISSING_DOCS, MISSING_DOCS_EMAIL_SENT_DATE, MISSING_DOCS_RECEIPT_DATE, PRIORITY, RYB_CODE, RYB_STATUS, RYB_DESCRIPTION, COMMENTS_STATUS, JOB_OPENING_ID, DATE_JOB_OPENING_APPROVED, CAN_NO, TK_NO, FTE_LIAISON_FIRST_NAME, FTE_LIAISON_LAST_NAME, FTE_LIAISON_EMAIL, PROGRAM_MGR_FIRST_NAME, PROGRAM_MGR_LAST_NAME, PROGRAM_MGR_EMAIL, SUPERVISOR_FIRST_NAME, SUPERVISOR_LAST_NAME, SUPERVISOR_EMAIL, DATE_PRERECRUIT_MEETING, DATE_PRERECRUIT_SHEET_SIGNED, RECRUITMENT_TYPE, DATE_NEED_VALIDATED, LEGISLATIVE_INIT_SUPPORTED, NUM_POSITIONS_TO_BE_ADV, IS_NEW_POSITION, IS_READVERTISEMENT, RDR_PD_USED, RDR_PD_KEY_NUMBER, RELATED_CLASSIFICATION_NUMBER, IS_TRANSITIONAL_RECRUIT, OTHER_RECRUIT_CONSIDERATIONS, PAID_AD, CLEARANCE_LEVEL_REQUIRED, PAID_AD_APPROVED_DATE, IS_RELOCATION_EXPENSES_PAID, INCENTIVES_OFFERED, ADDITIONAL_RECRUIT_CHANNELS, PRERECRUIT_COMMENTS, ANN_QUAL_REVIEWER, DATE_REC_PCKG_SENT_DEU, DATE_REC_PCKG_SENT_APPROVED, REC_PCKG_NOTES, ANN_NUMBER, DE_HR_SPECIALIST, DE_HR_SPECIALIST_ID, DE_QUALITY_REVIEWER, DE_QUALITY_REVIEWER_ID, QUALITY_REVIEWER, QUALITY_REVIEWER_ID, CASE_RETURNED_COMMENTS, SELECTIVE_PLACEMNT_FCTR_CMNTS, CASE_EXAMINING_REGISTER, DATE_SENT_TO_DEU, OPEN_CONTINUOUS_ANN, DATE_ANN_APPROVED_BY_DEU, EVALUATION_METHOD, RATER, DATE_MIN_QUALS_COMPLETED, DATE_APPS_TO_SME_QRB, DATE_APPS_RECD_SME_QRB, DATE_QUAL_SENT_DEU, DATE_QUAL_APPROVED, QUAL_REVIEW_NOTES, CERT_NUMBER, DATE_INTERNAL_REVIEW_COMPLETED, DATE_10PT_FILE_CHECKED, CERT_EXTENDED, DATE_NEW_CERT_EXPIRES, CERT_USED, CERT_RET_UNUSED_REASON, CERT_RET_UNUSED_REASON_OTHER, DT_CERT_RTN_TO_DEU_FNL_AUDIT) AS 
SELECT 
M.TRANSACTION_ID,M.DATE_RECEIVED,M.ACTION_TYPE,M.DATE_SF52_RECEIVED,M.GLOBAL_RECRUITMENT,M.ADMIN_CODE,M.INSTITUTE,M.ORG_INITS,M.PROPOSED_EFF_DATE
,M.BRANCH_CHIEF,M.TEAM_LEADER,M.HR_SPECIALIST,M.HR_ASSISTANT,M.HR_SPA,M.PCKG_COMPLETE,M.MISSING_DOCS,M.MISSING_DOCS_EMAIL_SENT_DATE,M.MISSING_DOCS_RECEIPT_DATE
,M.PRIORITY,M.RYB_CODE,M.RYB_STATUS,M.RYB_DESCRIPTION,M.COMMENTS_STATUS,M.JOB_OPENING_ID,M.DATE_JOB_OPENING_APPROVED,M.CAN_NO,M.TK_NO
,IC.FTE_LIAISON_FIRST_NAME,IC.FTE_LIAISON_LAST_NAME,IC.FTE_LIAISON_EMAIL,IC.PROGRAM_MGR_FIRST_NAME,IC.PROGRAM_MGR_LAST_NAME,IC.PROGRAM_MGR_EMAIL
,IC.SUPERVISOR_FIRST_NAME,IC.SUPERVISOR_LAST_NAME,IC.SUPERVISOR_EMAIL
,R.DATE_PRERECRUIT_MEETING,R.DATE_PRERECRUIT_SHEET_SIGNED,R.RECRUITMENT_TYPE,R.DATE_NEED_VALIDATED,R.LEGISLATIVE_INIT_SUPPORTED,R.NUM_POSITIONS_TO_BE_ADV
,R.IS_NEW_POSITION,R.IS_READVERTISEMENT,R.RDR_PD_USED,R.RDR_PD_KEY_NUMBER,R.RELATED_CLASSIFICATION_NUMBER,R.IS_TRANSITIONAL_RECRUIT,R.OTHER_RECRUIT_CONSIDERATIONS
,R.PAID_AD,R.CLEARANCE_LEVEL_REQUIRED,R.PAID_AD_APPROVED_DATE,R.IS_RELOCATION_EXPENSES_PAID,R.INCENTIVES_OFFERED,R.ADDITIONAL_RECRUIT_CHANNELS,R.PRERECRUIT_COMMENTS
,R.ANN_QUAL_REVIEWER,R.DATE_REC_PCKG_SENT_DEU,R.DATE_REC_PCKG_SENT_APPROVED,R.REC_PCKG_NOTES
,AN.ANN_NUMBER,AN.DE_HR_SPECIALIST,AN. DE_HR_SPECIALIST_ID,AN. DE_QUALITY_REVIEWER,AN.DE_QUALITY_REVIEWER_ID,AN. QUALITY_REVIEWER,AN. QUALITY_REVIEWER_ID,AN.CASE_RETURNED_COMMENTS
,AN.SELECTIVE_PLACEMNT_FCTR_CMNTS,AN. CASE_EXAMINING_REGISTER,AN.DATE_SENT_TO_DEU,AN.OPEN_CONTINUOUS_ANN,AN.DATE_ANN_APPROVED_BY_DEU
,AR.EVALUATION_METHOD,AR.RATER,AR.DATE_MIN_QUALS_COMPLETED,AR.DATE_APPS_TO_SME_QRB,AR.DATE_APPS_RECD_SME_QRB
,AR.DATE_QUAL_SENT_DEU,AR.DATE_QUAL_APPROVED,AR.QUAL_REVIEW_NOTES
,C.CERT_NUMBER,C.DATE_INTERNAL_REVIEW_COMPLETED,C.DATE_10PT_FILE_CHECKED,C.CERT_EXTENDED,C.DATE_NEW_CERT_EXPIRES,C.CERT_USED,C.CERT_RET_UNUSED_REASON
,C.CERT_RET_UNUSED_REASON_OTHER,C.DT_CERT_RTN_TO_DEU_FNL_AUDIT
 FROM HHS_WHRSC_HR.MAIN M 
JOIN HHS_WHRSC_HR.IC_REQUEST_INFO IC ON IC.TRANSACTION_ID = M.TRANSACTION_ID
JOIN HHS_WHRSC_HR.RECRUITMENT R ON R.TRANSACTION_ID = M.TRANSACTION_ID
LEFT OUTER JOIN HHS_WHRSC_HR.ANNOUNCEMENT AN ON AN.TRANSACTION_ID = M.TRANSACTION_ID
LEFT OUTER JOIN HHS_WHRSC_HR.APPLICANT_RATING AR ON AR.TRANSACTION_ID = M.TRANSACTION_ID
LEFT OUTER JOIN HHS_WHRSC_HR.CERTIFICATE C ON C.TRANSACTION_ID = M.TRANSACTION_ID
WHERE M.ACTION_TYPE='Recruitment';
/

--------------------------------------------------------
--  DDL for Table RECRUITMENT_ACTION_STATUS
--------------------------------------------------------

/*
DROP TABLE RECRUITMENT_ACTION_STATUS;
DROP SEQUENCE RECRUITMENT_ACTION_STATUS_SEQ;
*/

CREATE TABLE RECRUITMENT_ACTION_STATUS 
(ID					NUMBER(20)     NOT NULL, 
TRANSACTION_ID		NUMBER(10), 
REQUEST_NUMBER	VARCHAR2(30), 
POSITION_TITLE		VARCHAR2(100), 
PAY_PLAN			VARCHAR2(100), 
SERIES				VARCHAR2(30), 
GRADE				VARCHAR2(30),
ANN_OPENED			VARCHAR2(1) DEFAULT 'F'
) ;

ALTER TABLE RECRUITMENT_ACTION_STATUS ADD CONSTRAINT RECRUITMENT_ACTION_STATUS_PK PRIMARY KEY (ID);

--DROP INDEX RECRUITMENT_ACTION_STATUS_NK1;
CREATE INDEX RECRUITMENT_ACTION_STATUS_NK1 ON RECRUITMENT_ACTION_STATUS (TRANSACTION_ID);

CREATE SEQUENCE RECRUITMENT_ACTION_STATUS_SEQ
	INCREMENT BY 1
	START WITH 1
	NOMAXVALUE
	NOCYCLE
	NOCACHE;

/

CREATE OR REPLACE TRIGGER RECRUITMENT_ACTION_STATUS_BIR
BEFORE INSERT ON RECRUITMENT_ACTION_STATUS
FOR EACH ROW
BEGIN
	SELECT RECRUITMENT_ACTION_STATUS_SEQ.NEXTVAL
	INTO :NEW.ID
	FROM DUAL
	;
END
;

/

--------------------------------------------------------
--  DDL for Table RECRUITMENT_ACTION_HISTORY
--------------------------------------------------------


-- DROP TABLE RECRUITMENT_ACTION_HISTORY;
-- DROP SEQUENCE RECRUITMENT_ACTION_HISTORY_SEQ;


CREATE TABLE RECRUITMENT_ACTION_HISTORY
(
	HISTORYID			NUMBER(20),
	 ID					NUMBER(20),
	TRANSACTION_ID		NUMBER(10),
	ACTION_STATUS		VARCHAR2(50),
	ACTION_CODE		VARCHAR2(20) ,
	DATE_CERTIFIED		DATE,
	HR_SPECIALIST_ID		VARCHAR2(10),
	HR_SPECIALIST		VARCHAR2(100),
	COMMENTS 			VARCHAR2(100)
);

ALTER TABLE RECRUITMENT_ACTION_HISTORY ADD CONSTRAINT RECRUITMENT_ACTION_HISTORY_PK PRIMARY KEY (HISTORYID);

--DROP INDEX RECRUITMENT_ACTION_HISTORY_NK1;
CREATE INDEX RECRUITMENT_ACTION_HISTORY_NK1 ON RECRUITMENT_ACTION_HISTORY (ID);

--DROP INDEX RECRUITMENT_ACTION_HISTORY_NK2;
CREATE INDEX RECRUITMENT_ACTION_HISTORY_NK2 ON RECRUITMENT_ACTION_HISTORY (TRANSACTION_ID);


CREATE SEQUENCE RECRUITMENT_ACTION_HISTORY_SEQ
	INCREMENT BY 1
	START WITH 1
	NOMAXVALUE
	NOCYCLE
	NOCACHE;
/


CREATE OR REPLACE TRIGGER RECRUITMENT_ACTION_HISTORY_BIR
BEFORE INSERT ON RECRUITMENT_ACTION_HISTORY
FOR EACH ROW
BEGIN
	SELECT RECRUITMENT_ACTION_HISTORY_SEQ.NEXTVAL
	INTO :NEW.HISTORYID
	FROM DUAL;
END;

/