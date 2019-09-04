// Generated from org/apache/shardingsphere/core/parse/autogen/MySQLStatement.g4 by ANTLR 4.7.1
package org.apache.shardingsphere.core.parse.autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		AND_=10, OR_=11, NOT_=12, TILDE_=13, VERTICAL_BAR_=14, AMPERSAND_=15, 
		SIGNED_LEFT_SHIFT_=16, SIGNED_RIGHT_SHIFT_=17, CARET_=18, MOD_=19, COLON_=20, 
		PLUS_=21, MINUS_=22, ASTERISK_=23, SLASH_=24, BACKSLASH_=25, DOT_=26, 
		DOT_ASTERISK_=27, SAFE_EQ_=28, DEQ_=29, EQ_=30, NEQ_=31, GT_=32, GTE_=33, 
		LT_=34, LTE_=35, POUND_=36, LP_=37, RP_=38, LBE_=39, RBE_=40, LBT_=41, 
		RBT_=42, COMMA_=43, DQ_=44, SQ_=45, BQ_=46, QUESTION_=47, AT_=48, SEMI_=49, 
		BLOCK_COMMENT=50, INLINE_COMMENT=51, WS=52, SELECT=53, INSERT=54, UPDATE=55, 
		DELETE=56, CREATE=57, ALTER=58, DROP=59, TRUNCATE=60, SCHEMA=61, GRANT=62, 
		REVOKE=63, ADD=64, SET=65, TABLE=66, COLUMN=67, INDEX=68, CONSTRAINT=69, 
		PRIMARY=70, UNIQUE=71, FOREIGN=72, KEY=73, POSITION=74, PRECISION=75, 
		FUNCTION=76, TRIGGER=77, PROCEDURE=78, VIEW=79, INTO=80, VALUES=81, WITH=82, 
		UNION=83, DISTINCT=84, CASE=85, WHEN=86, CAST=87, TRIM=88, SUBSTRING=89, 
		FROM=90, NATURAL=91, JOIN=92, FULL=93, INNER=94, OUTER=95, LEFT=96, RIGHT=97, 
		CROSS=98, USING=99, WHERE=100, AS=101, ON=102, IF=103, ELSE=104, THEN=105, 
		FOR=106, TO=107, AND=108, OR=109, IS=110, NOT=111, NULL=112, TRUE=113, 
		FALSE=114, EXISTS=115, BETWEEN=116, IN=117, ALL=118, ANY=119, LIKE=120, 
		ORDER=121, GROUP=122, BY=123, ASC=124, DESC=125, HAVING=126, LIMIT=127, 
		OFFSET=128, BEGIN=129, COMMIT=130, ROLLBACK=131, SAVEPOINT=132, BOOLEAN=133, 
		DOUBLE=134, CHAR=135, CHARACTER=136, ARRAY=137, INTERVAL=138, DATE=139, 
		TIME=140, TIMESTAMP=141, LOCALTIME=142, LOCALTIMESTAMP=143, YEAR=144, 
		QUARTER=145, MONTH=146, WEEK=147, DAY=148, HOUR=149, MINUTE=150, SECOND=151, 
		MICROSECOND=152, MAX=153, MIN=154, SUM=155, COUNT=156, AVG=157, DEFAULT=158, 
		CURRENT=159, ENABLE=160, DISABLE=161, CALL=162, INSTANCE=163, PRESERVE=164, 
		DO=165, DEFINER=166, CURRENT_USER=167, SQL=168, CASCADED=169, LOCAL=170, 
		CLOSE=171, OPEN=172, NEXT=173, NAME=174, FOR_GENERATOR=175, USE=176, DESCRIBE=177, 
		SHOW=178, DATABASES=179, DATABASE=180, SCHEMAS=181, TABLES=182, TABLESPACE=183, 
		COLUMNS=184, FIELDS=185, INDEXES=186, STATUS=187, REPLACE=188, MODIFY=189, 
		DISTINCTROW=190, VALUE=191, DUPLICATE=192, FIRST=193, LAST=194, AFTER=195, 
		OJ=196, WINDOW=197, MOD=198, DIV=199, XOR=200, REGEXP=201, RLIKE=202, 
		ACCOUNT=203, USER=204, ROLE=205, START=206, TRANSACTION=207, ROW=208, 
		ROWS=209, WITHOUT=210, BINARY=211, ESCAPE=212, GENERATED=213, PARTITION=214, 
		SUBPARTITION=215, STORAGE=216, STORED=217, SUPER=218, SUBSTR=219, TEMPORARY=220, 
		THAN=221, TRAILING=222, UNBOUNDED=223, UNLOCK=224, UNSIGNED=225, UPGRADE=226, 
		USAGE=227, VALIDATION=228, VIRTUAL=229, ROLLUP=230, SOUNDS=231, UNKNOWN=232, 
		OFF=233, ALWAYS=234, CASCADE=235, CHECK=236, COMMITTED=237, LEVEL=238, 
		NO=239, OPTION=240, PASSWORD=241, PRIVILEGES=242, READ=243, WRITE=244, 
		REFERENCES=245, ACTION=246, ALGORITHM=247, ANALYZE=248, AUTOCOMMIT=249, 
		MAXVALUE=250, BOTH=251, BTREE=252, CHAIN=253, CHANGE=254, CHARSET=255, 
		CHECKSUM=256, CIPHER=257, CLIENT=258, COALESCE=259, COLLATE=260, COMMENT=261, 
		COMPACT=262, COMPRESSED=263, COMPRESSION=264, CONNECTION=265, CONSISTENT=266, 
		CONVERT=267, COPY=268, DATA=269, DELAYED=270, DIRECTORY=271, DISCARD=272, 
		DISK=273, DYNAMIC=274, ENCRYPTION=275, END=276, ENGINE=277, EVENT=278, 
		EXCEPT=279, EXCHANGE=280, EXCLUSIVE=281, EXECUTE=282, EXTRACT=283, FILE=284, 
		FIXED=285, FOLLOWING=286, FORCE=287, FULLTEXT=288, GLOBAL=289, HASH=290, 
		IDENTIFIED=291, IGNORE=292, IMPORT_=293, INPLACE=294, KEYS=295, LEADING=296, 
		LESS=297, LINEAR=298, LOCK=299, MATCH=300, MEMORY=301, NONE=302, NOW=303, 
		OFFLINE=304, ONLINE=305, OPTIMIZE=306, OVER=307, PARSER=308, PARTIAL=309, 
		PARTITIONING=310, PERSIST=311, PRECEDING=312, PROCESS=313, PROXY=314, 
		QUICK=315, RANGE=316, REBUILD=317, RECURSIVE=318, REDUNDANT=319, RELEASE=320, 
		RELOAD=321, REMOVE=322, RENAME=323, REORGANIZE=324, REPAIR=325, REPLICATION=326, 
		REQUIRE=327, RESTRICT=328, REVERSE=329, ROUTINE=330, SEPARATOR=331, SESSION=332, 
		SHARED=333, SHUTDOWN=334, SIMPLE=335, SLAVE=336, SPATIAL=337, ZEROFILL=338, 
		VISIBLE=339, INVISIBLE=340, INSTANT=341, ENFORCED=342, AGAINST=343, LANGUAGE=344, 
		MODE=345, QUERY=346, EXTENDED=347, EXPANSION=348, VARIANCE=349, MAX_ROWS=350, 
		MIN_ROWS=351, HIGH_PRIORITY=352, LOW_PRIORITY=353, SQL_BIG_RESULT=354, 
		SQL_BUFFER_RESULT=355, SQL_CACHE=356, SQL_CALC_FOUND_ROWS=357, SQL_NO_CACHE=358, 
		SQL_SMALL_RESULT=359, STATS_AUTO_RECALC=360, STATS_PERSISTENT=361, STATS_SAMPLE_PAGES=362, 
		ROLE_ADMIN=363, ROW_FORMAT=364, SET_USER_ID=365, REPLICATION_SLAVE_ADMIN=366, 
		GROUP_REPLICATION_ADMIN=367, STRAIGHT_JOIN=368, WEIGHT_STRING=369, COLUMN_FORMAT=370, 
		CONNECTION_ADMIN=371, FIREWALL_ADMIN=372, FIREWALL_USER=373, INSERT_METHOD=374, 
		KEY_BLOCK_SIZE=375, PACK_KEYS=376, PERSIST_ONLY=377, BIT_AND=378, BIT_OR=379, 
		BIT_XOR=380, GROUP_CONCAT=381, JSON_ARRAYAGG=382, JSON_OBJECTAGG=383, 
		STD=384, STDDEV=385, STDDEV_POP=386, STDDEV_SAMP=387, VAR_POP=388, VAR_SAMP=389, 
		AUDIT_ADMIN=390, AUTO_INCREMENT=391, AVG_ROW_LENGTH=392, BINLOG_ADMIN=393, 
		DELAY_KEY_WRITE=394, ENCRYPTION_KEY_ADMIN=395, SYSTEM_VARIABLES_ADMIN=396, 
		VERSION_TOKEN_ADMIN=397, CURRENT_TIMESTAMP=398, YEAR_MONTH=399, DAY_HOUR=400, 
		DAY_MINUTE=401, DAY_SECOND=402, DAY_MICROSECOND=403, HOUR_MINUTE=404, 
		HOUR_SECOND=405, HOUR_MICROSECOND=406, MINUTE_SECOND=407, MINUTE_MICROSECOND=408, 
		SECOND_MICROSECOND=409, UL_BINARY=410, ROTATE=411, MASTER=412, BINLOG=413, 
		ERROR=414, SCHEDULE=415, COMPLETION=416, EVERY=417, STARTS=418, ENDS=419, 
		HOST=420, SOCKET=421, PORT=422, SERVER=423, WRAPPER=424, OPTIONS=425, 
		OWNER=426, DETERMINISTIC=427, RETURNS=428, CONTAINS=429, READS=430, MODIFIES=431, 
		SECURITY=432, INVOKER=433, OUT=434, INOUT=435, TEMPTABLE=436, MERGE=437, 
		UNDEFINED=438, DATAFILE=439, FILE_BLOCK_SIZE=440, EXTENT_SIZE=441, INITIAL_SIZE=442, 
		AUTOEXTEND_SIZE=443, MAX_SIZE=444, NODEGROUP=445, WAIT=446, LOGFILE=447, 
		UNDOFILE=448, UNDO_BUFFER_SIZE=449, REDO_BUFFER_SIZE=450, HANDLER=451, 
		PREV=452, ORGANIZATION=453, DEFINITION=454, DESCRIPTION=455, REFERENCE=456, 
		FOLLOWS=457, PRECEDES=458, IMPORT=459, LOAD=460, CONCURRENT=461, INFILE=462, 
		LINES=463, STARTING=464, TERMINATED=465, OPTIONALLY=466, ENCLOSED=467, 
		ESCAPED=468, XML=469, UNDO=470, DUMPFILE=471, OUTFILE=472, SHARE=473, 
		IDENTIFIER_=474, STRING_=475, NUMBER_=476, HEX_DIGIT_=477, BIT_NUM_=478;
	public static final int
		RULE_execute = 0, RULE_insert = 1, RULE_insertSpecification_ = 2, RULE_insertValuesClause = 3, 
		RULE_insertSelectClause = 4, RULE_onDuplicateKeyClause = 5, RULE_replace = 6, 
		RULE_replaceSpecification_ = 7, RULE_update = 8, RULE_updateSpecification_ = 9, 
		RULE_assignment = 10, RULE_setAssignmentsClause = 11, RULE_assignmentValues = 12, 
		RULE_assignmentValue = 13, RULE_blobValue = 14, RULE_delete = 15, RULE_deleteSpecification_ = 16, 
		RULE_singleTableClause_ = 17, RULE_multipleTablesClause_ = 18, RULE_multipleTableNames_ = 19, 
		RULE_select = 20, RULE_callStatement = 21, RULE_doStatement = 22, RULE_handlerStatement = 23, 
		RULE_handlerOpenStatement = 24, RULE_handlerReadIndexStatement = 25, RULE_handlerReadStatement = 26, 
		RULE_handlerCloseStatement = 27, RULE_importStatement = 28, RULE_loadDataStatement = 29, 
		RULE_loadXmlStatement = 30, RULE_withClause_ = 31, RULE_cteClause_ = 32, 
		RULE_unionClause_ = 33, RULE_selectClause = 34, RULE_selectSpecification_ = 35, 
		RULE_duplicateSpecification = 36, RULE_selectItems = 37, RULE_selectItem = 38, 
		RULE_alias = 39, RULE_unqualifiedShorthand = 40, RULE_qualifiedShorthand = 41, 
		RULE_fromClause = 42, RULE_tableReferences = 43, RULE_escapedTableReference_ = 44, 
		RULE_tableReference = 45, RULE_tableFactor = 46, RULE_partitionNames_ = 47, 
		RULE_indexHintList_ = 48, RULE_indexHint_ = 49, RULE_joinedTable = 50, 
		RULE_joinSpecification = 51, RULE_whereClause = 52, RULE_groupByClause = 53, 
		RULE_havingClause = 54, RULE_limitClause = 55, RULE_limitRowCount = 56, 
		RULE_limitOffset = 57, RULE_windowClause_ = 58, RULE_windowItem_ = 59, 
		RULE_subquery = 60, RULE_selectLinesInto_ = 61, RULE_selectFieldsInto_ = 62, 
		RULE_selectIntoExpression_ = 63, RULE_lockClause = 64, RULE_parameterMarker = 65, 
		RULE_literals = 66, RULE_stringLiterals = 67, RULE_numberLiterals = 68, 
		RULE_dateTimeLiterals = 69, RULE_hexadecimalLiterals = 70, RULE_bitValueLiterals = 71, 
		RULE_booleanLiterals = 72, RULE_nullValueLiterals = 73, RULE_identifier_ = 74, 
		RULE_variable_ = 75, RULE_scope_ = 76, RULE_unreservedWord_ = 77, RULE_schemaName = 78, 
		RULE_tableName = 79, RULE_columnName = 80, RULE_userName = 81, RULE_eventName = 82, 
		RULE_serverName = 83, RULE_wrapperName = 84, RULE_functionName = 85, RULE_viewName = 86, 
		RULE_owner = 87, RULE_name = 88, RULE_columnNames = 89, RULE_tableNames = 90, 
		RULE_indexName = 91, RULE_characterSetName_ = 92, RULE_collationName_ = 93, 
		RULE_expr = 94, RULE_logicalOperator = 95, RULE_notOperator_ = 96, RULE_booleanPrimary_ = 97, 
		RULE_comparisonOperator = 98, RULE_predicate = 99, RULE_bitExpr = 100, 
		RULE_simpleExpr = 101, RULE_functionCall = 102, RULE_aggregationFunction = 103, 
		RULE_aggregationFunctionName_ = 104, RULE_distinct = 105, RULE_overClause_ = 106, 
		RULE_windowSpecification_ = 107, RULE_partitionClause_ = 108, RULE_frameClause_ = 109, 
		RULE_frameStart_ = 110, RULE_frameEnd_ = 111, RULE_frameBetween_ = 112, 
		RULE_specialFunction_ = 113, RULE_groupConcatFunction_ = 114, RULE_windowFunction_ = 115, 
		RULE_castFunction_ = 116, RULE_convertFunction_ = 117, RULE_positionFunction_ = 118, 
		RULE_substringFunction_ = 119, RULE_extractFunction_ = 120, RULE_charFunction_ = 121, 
		RULE_trimFunction_ = 122, RULE_weightStringFunction_ = 123, RULE_levelClause_ = 124, 
		RULE_levelInWeightListElement_ = 125, RULE_regularFunction_ = 126, RULE_regularFunctionName_ = 127, 
		RULE_matchExpression_ = 128, RULE_matchSearchModifier_ = 129, RULE_caseExpression_ = 130, 
		RULE_caseWhen_ = 131, RULE_caseElse_ = 132, RULE_intervalExpression_ = 133, 
		RULE_intervalUnit_ = 134, RULE_orderByClause = 135, RULE_orderByItem = 136, 
		RULE_dataType = 137, RULE_dataTypeName_ = 138, RULE_dataTypeLength = 139, 
		RULE_characterSet_ = 140, RULE_collateClause_ = 141, RULE_ignoredIdentifier_ = 142, 
		RULE_ignoredIdentifiers_ = 143, RULE_createTable = 144, RULE_createIndex = 145, 
		RULE_alterTable = 146, RULE_dropTable = 147, RULE_dropIndex = 148, RULE_truncateTable = 149, 
		RULE_createDatabase = 150, RULE_alterDatabase = 151, RULE_dropDatabse = 152, 
		RULE_alterInstance = 153, RULE_instanceAction = 154, RULE_createEvent = 155, 
		RULE_alterEvent = 156, RULE_dropEvent = 157, RULE_createFunction = 158, 
		RULE_alterFunction = 159, RULE_dropFunction = 160, RULE_createProcedure = 161, 
		RULE_alterProcedure = 162, RULE_dropProcedure = 163, RULE_createServer = 164, 
		RULE_alterServer = 165, RULE_dropServer = 166, RULE_createView = 167, 
		RULE_alterView = 168, RULE_dropView = 169, RULE_createTablespaceInnodb = 170, 
		RULE_createTablespaceNdb = 171, RULE_alterTablespace = 172, RULE_dropTablespace = 173, 
		RULE_createLogfileGroup = 174, RULE_alterLogfileGroup = 175, RULE_dropLogfileGroup = 176, 
		RULE_createTableSpecification_ = 177, RULE_tableNotExistClause_ = 178, 
		RULE_createDefinitionClause_ = 179, RULE_createDatabaseSpecification_ = 180, 
		RULE_createDefinitions_ = 181, RULE_createDefinition_ = 182, RULE_columnDefinition = 183, 
		RULE_inlineDataType_ = 184, RULE_commonDataTypeOption_ = 185, RULE_checkConstraintDefinition_ = 186, 
		RULE_referenceDefinition_ = 187, RULE_referenceOption_ = 188, RULE_generatedDataType_ = 189, 
		RULE_indexDefinition_ = 190, RULE_indexType_ = 191, RULE_keyParts_ = 192, 
		RULE_keyPart_ = 193, RULE_indexOption_ = 194, RULE_constraintDefinition_ = 195, 
		RULE_primaryKeyOption_ = 196, RULE_primaryKey = 197, RULE_uniqueOption_ = 198, 
		RULE_foreignKeyOption_ = 199, RULE_createLikeClause_ = 200, RULE_createIndexSpecification_ = 201, 
		RULE_alterDefinitionClause_ = 202, RULE_alterSpecification_ = 203, RULE_tableOptions_ = 204, 
		RULE_tableOption_ = 205, RULE_addColumnSpecification = 206, RULE_firstOrAfterColumn = 207, 
		RULE_addIndexSpecification = 208, RULE_addConstraintSpecification = 209, 
		RULE_changeColumnSpecification = 210, RULE_dropColumnSpecification = 211, 
		RULE_dropIndexSpecification = 212, RULE_dropPrimaryKeySpecification = 213, 
		RULE_modifyColumnSpecification = 214, RULE_renameColumnSpecification = 215, 
		RULE_renameIndexSpecification = 216, RULE_renameTableSpecification_ = 217, 
		RULE_partitionDefinitions_ = 218, RULE_partitionDefinition_ = 219, RULE_partitionLessThanValue_ = 220, 
		RULE_partitionValueList_ = 221, RULE_partitionDefinitionOption_ = 222, 
		RULE_subpartitionDefinition_ = 223, RULE_dropTableSpecification_ = 224, 
		RULE_tableExistClause_ = 225, RULE_dropIndexSpecification_ = 226, RULE_ownerStatement = 227, 
		RULE_scheduleExpression_ = 228, RULE_timestampValue = 229, RULE_routineBody = 230, 
		RULE_serverOption_ = 231, RULE_routineOption_ = 232, RULE_procedureParameter_ = 233, 
		RULE_fileSizeLiteral_ = 234, RULE_setTransaction = 235, RULE_setAutoCommit = 236, 
		RULE_autoCommitValue = 237, RULE_beginTransaction = 238, RULE_commit = 239, 
		RULE_rollback = 240, RULE_savepoint = 241, RULE_grant = 242, RULE_revoke = 243, 
		RULE_proxyClause_ = 244, RULE_privilegeClause_ = 245, RULE_roleClause_ = 246, 
		RULE_allClause_ = 247, RULE_privileges_ = 248, RULE_privilegeType_ = 249, 
		RULE_onObjectClause_ = 250, RULE_objectType_ = 251, RULE_privilegeLevel_ = 252, 
		RULE_createUser = 253, RULE_dropUser = 254, RULE_alterUser = 255, RULE_renameUser = 256, 
		RULE_createRole = 257, RULE_dropRole = 258, RULE_setRole = 259, RULE_setPassword = 260, 
		RULE_use = 261, RULE_desc = 262, RULE_showDatabases = 263, RULE_showTables = 264, 
		RULE_showTableStatus = 265, RULE_showColumns = 266, RULE_showIndex = 267, 
		RULE_showCreateTable = 268, RULE_showOther = 269, RULE_fromSchema = 270, 
		RULE_fromTable_ = 271, RULE_showLike = 272, RULE_showWhereClause_ = 273, 
		RULE_setVariable = 274, RULE_call = 275;
	public static final String[] ruleNames = {
		"execute", "insert", "insertSpecification_", "insertValuesClause", "insertSelectClause", 
		"onDuplicateKeyClause", "replace", "replaceSpecification_", "update", 
		"updateSpecification_", "assignment", "setAssignmentsClause", "assignmentValues", 
		"assignmentValue", "blobValue", "delete", "deleteSpecification_", "singleTableClause_", 
		"multipleTablesClause_", "multipleTableNames_", "select", "callStatement", 
		"doStatement", "handlerStatement", "handlerOpenStatement", "handlerReadIndexStatement", 
		"handlerReadStatement", "handlerCloseStatement", "importStatement", "loadDataStatement", 
		"loadXmlStatement", "withClause_", "cteClause_", "unionClause_", "selectClause", 
		"selectSpecification_", "duplicateSpecification", "selectItems", "selectItem", 
		"alias", "unqualifiedShorthand", "qualifiedShorthand", "fromClause", "tableReferences", 
		"escapedTableReference_", "tableReference", "tableFactor", "partitionNames_", 
		"indexHintList_", "indexHint_", "joinedTable", "joinSpecification", "whereClause", 
		"groupByClause", "havingClause", "limitClause", "limitRowCount", "limitOffset", 
		"windowClause_", "windowItem_", "subquery", "selectLinesInto_", "selectFieldsInto_", 
		"selectIntoExpression_", "lockClause", "parameterMarker", "literals", 
		"stringLiterals", "numberLiterals", "dateTimeLiterals", "hexadecimalLiterals", 
		"bitValueLiterals", "booleanLiterals", "nullValueLiterals", "identifier_", 
		"variable_", "scope_", "unreservedWord_", "schemaName", "tableName", "columnName", 
		"userName", "eventName", "serverName", "wrapperName", "functionName", 
		"viewName", "owner", "name", "columnNames", "tableNames", "indexName", 
		"characterSetName_", "collationName_", "expr", "logicalOperator", "notOperator_", 
		"booleanPrimary_", "comparisonOperator", "predicate", "bitExpr", "simpleExpr", 
		"functionCall", "aggregationFunction", "aggregationFunctionName_", "distinct", 
		"overClause_", "windowSpecification_", "partitionClause_", "frameClause_", 
		"frameStart_", "frameEnd_", "frameBetween_", "specialFunction_", "groupConcatFunction_", 
		"windowFunction_", "castFunction_", "convertFunction_", "positionFunction_", 
		"substringFunction_", "extractFunction_", "charFunction_", "trimFunction_", 
		"weightStringFunction_", "levelClause_", "levelInWeightListElement_", 
		"regularFunction_", "regularFunctionName_", "matchExpression_", "matchSearchModifier_", 
		"caseExpression_", "caseWhen_", "caseElse_", "intervalExpression_", "intervalUnit_", 
		"orderByClause", "orderByItem", "dataType", "dataTypeName_", "dataTypeLength", 
		"characterSet_", "collateClause_", "ignoredIdentifier_", "ignoredIdentifiers_", 
		"createTable", "createIndex", "alterTable", "dropTable", "dropIndex", 
		"truncateTable", "createDatabase", "alterDatabase", "dropDatabse", "alterInstance", 
		"instanceAction", "createEvent", "alterEvent", "dropEvent", "createFunction", 
		"alterFunction", "dropFunction", "createProcedure", "alterProcedure", 
		"dropProcedure", "createServer", "alterServer", "dropServer", "createView", 
		"alterView", "dropView", "createTablespaceInnodb", "createTablespaceNdb", 
		"alterTablespace", "dropTablespace", "createLogfileGroup", "alterLogfileGroup", 
		"dropLogfileGroup", "createTableSpecification_", "tableNotExistClause_", 
		"createDefinitionClause_", "createDatabaseSpecification_", "createDefinitions_", 
		"createDefinition_", "columnDefinition", "inlineDataType_", "commonDataTypeOption_", 
		"checkConstraintDefinition_", "referenceDefinition_", "referenceOption_", 
		"generatedDataType_", "indexDefinition_", "indexType_", "keyParts_", "keyPart_", 
		"indexOption_", "constraintDefinition_", "primaryKeyOption_", "primaryKey", 
		"uniqueOption_", "foreignKeyOption_", "createLikeClause_", "createIndexSpecification_", 
		"alterDefinitionClause_", "alterSpecification_", "tableOptions_", "tableOption_", 
		"addColumnSpecification", "firstOrAfterColumn", "addIndexSpecification", 
		"addConstraintSpecification", "changeColumnSpecification", "dropColumnSpecification", 
		"dropIndexSpecification", "dropPrimaryKeySpecification", "modifyColumnSpecification", 
		"renameColumnSpecification", "renameIndexSpecification", "renameTableSpecification_", 
		"partitionDefinitions_", "partitionDefinition_", "partitionLessThanValue_", 
		"partitionValueList_", "partitionDefinitionOption_", "subpartitionDefinition_", 
		"dropTableSpecification_", "tableExistClause_", "dropIndexSpecification_", 
		"ownerStatement", "scheduleExpression_", "timestampValue", "routineBody", 
		"serverOption_", "routineOption_", "procedureParameter_", "fileSizeLiteral_", 
		"setTransaction", "setAutoCommit", "autoCommitValue", "beginTransaction", 
		"commit", "rollback", "savepoint", "grant", "revoke", "proxyClause_", 
		"privilegeClause_", "roleClause_", "allClause_", "privileges_", "privilegeType_", 
		"onObjectClause_", "objectType_", "privilegeLevel_", "createUser", "dropUser", 
		"alterUser", "renameUser", "createRole", "dropRole", "setRole", "setPassword", 
		"use", "desc", "showDatabases", "showTables", "showTableStatus", "showColumns", 
		"showIndex", "showCreateTable", "showOther", "fromSchema", "fromTable_", 
		"showLike", "showWhereClause_", "setVariable", "call"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'INNODB'", "'TLS'", "'Y'", "'N'", "'not support'", "'K'", "'M'", 
		"'G'", "'T'", "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", 
		"'^'", "'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", 
		"'<=>'", "'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", 
		"'@'", "';'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "AND_", "OR_", 
		"NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", "SIGNED_LEFT_SHIFT_", 
		"SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", "PLUS_", "MINUS_", 
		"ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", "SAFE_EQ_", 
		"DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", "LP_", 
		"RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", "BQ_", 
		"QUESTION_", "AT_", "SEMI_", "BLOCK_COMMENT", "INLINE_COMMENT", "WS", 
		"SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "ALTER", "DROP", "TRUNCATE", 
		"SCHEMA", "GRANT", "REVOKE", "ADD", "SET", "TABLE", "COLUMN", "INDEX", 
		"CONSTRAINT", "PRIMARY", "UNIQUE", "FOREIGN", "KEY", "POSITION", "PRECISION", 
		"FUNCTION", "TRIGGER", "PROCEDURE", "VIEW", "INTO", "VALUES", "WITH", 
		"UNION", "DISTINCT", "CASE", "WHEN", "CAST", "TRIM", "SUBSTRING", "FROM", 
		"NATURAL", "JOIN", "FULL", "INNER", "OUTER", "LEFT", "RIGHT", "CROSS", 
		"USING", "WHERE", "AS", "ON", "IF", "ELSE", "THEN", "FOR", "TO", "AND", 
		"OR", "IS", "NOT", "NULL", "TRUE", "FALSE", "EXISTS", "BETWEEN", "IN", 
		"ALL", "ANY", "LIKE", "ORDER", "GROUP", "BY", "ASC", "DESC", "HAVING", 
		"LIMIT", "OFFSET", "BEGIN", "COMMIT", "ROLLBACK", "SAVEPOINT", "BOOLEAN", 
		"DOUBLE", "CHAR", "CHARACTER", "ARRAY", "INTERVAL", "DATE", "TIME", "TIMESTAMP", 
		"LOCALTIME", "LOCALTIMESTAMP", "YEAR", "QUARTER", "MONTH", "WEEK", "DAY", 
		"HOUR", "MINUTE", "SECOND", "MICROSECOND", "MAX", "MIN", "SUM", "COUNT", 
		"AVG", "DEFAULT", "CURRENT", "ENABLE", "DISABLE", "CALL", "INSTANCE", 
		"PRESERVE", "DO", "DEFINER", "CURRENT_USER", "SQL", "CASCADED", "LOCAL", 
		"CLOSE", "OPEN", "NEXT", "NAME", "FOR_GENERATOR", "USE", "DESCRIBE", "SHOW", 
		"DATABASES", "DATABASE", "SCHEMAS", "TABLES", "TABLESPACE", "COLUMNS", 
		"FIELDS", "INDEXES", "STATUS", "REPLACE", "MODIFY", "DISTINCTROW", "VALUE", 
		"DUPLICATE", "FIRST", "LAST", "AFTER", "OJ", "WINDOW", "MOD", "DIV", "XOR", 
		"REGEXP", "RLIKE", "ACCOUNT", "USER", "ROLE", "START", "TRANSACTION", 
		"ROW", "ROWS", "WITHOUT", "BINARY", "ESCAPE", "GENERATED", "PARTITION", 
		"SUBPARTITION", "STORAGE", "STORED", "SUPER", "SUBSTR", "TEMPORARY", "THAN", 
		"TRAILING", "UNBOUNDED", "UNLOCK", "UNSIGNED", "UPGRADE", "USAGE", "VALIDATION", 
		"VIRTUAL", "ROLLUP", "SOUNDS", "UNKNOWN", "OFF", "ALWAYS", "CASCADE", 
		"CHECK", "COMMITTED", "LEVEL", "NO", "OPTION", "PASSWORD", "PRIVILEGES", 
		"READ", "WRITE", "REFERENCES", "ACTION", "ALGORITHM", "ANALYZE", "AUTOCOMMIT", 
		"MAXVALUE", "BOTH", "BTREE", "CHAIN", "CHANGE", "CHARSET", "CHECKSUM", 
		"CIPHER", "CLIENT", "COALESCE", "COLLATE", "COMMENT", "COMPACT", "COMPRESSED", 
		"COMPRESSION", "CONNECTION", "CONSISTENT", "CONVERT", "COPY", "DATA", 
		"DELAYED", "DIRECTORY", "DISCARD", "DISK", "DYNAMIC", "ENCRYPTION", "END", 
		"ENGINE", "EVENT", "EXCEPT", "EXCHANGE", "EXCLUSIVE", "EXECUTE", "EXTRACT", 
		"FILE", "FIXED", "FOLLOWING", "FORCE", "FULLTEXT", "GLOBAL", "HASH", "IDENTIFIED", 
		"IGNORE", "IMPORT_", "INPLACE", "KEYS", "LEADING", "LESS", "LINEAR", "LOCK", 
		"MATCH", "MEMORY", "NONE", "NOW", "OFFLINE", "ONLINE", "OPTIMIZE", "OVER", 
		"PARSER", "PARTIAL", "PARTITIONING", "PERSIST", "PRECEDING", "PROCESS", 
		"PROXY", "QUICK", "RANGE", "REBUILD", "RECURSIVE", "REDUNDANT", "RELEASE", 
		"RELOAD", "REMOVE", "RENAME", "REORGANIZE", "REPAIR", "REPLICATION", "REQUIRE", 
		"RESTRICT", "REVERSE", "ROUTINE", "SEPARATOR", "SESSION", "SHARED", "SHUTDOWN", 
		"SIMPLE", "SLAVE", "SPATIAL", "ZEROFILL", "VISIBLE", "INVISIBLE", "INSTANT", 
		"ENFORCED", "AGAINST", "LANGUAGE", "MODE", "QUERY", "EXTENDED", "EXPANSION", 
		"VARIANCE", "MAX_ROWS", "MIN_ROWS", "HIGH_PRIORITY", "LOW_PRIORITY", "SQL_BIG_RESULT", 
		"SQL_BUFFER_RESULT", "SQL_CACHE", "SQL_CALC_FOUND_ROWS", "SQL_NO_CACHE", 
		"SQL_SMALL_RESULT", "STATS_AUTO_RECALC", "STATS_PERSISTENT", "STATS_SAMPLE_PAGES", 
		"ROLE_ADMIN", "ROW_FORMAT", "SET_USER_ID", "REPLICATION_SLAVE_ADMIN", 
		"GROUP_REPLICATION_ADMIN", "STRAIGHT_JOIN", "WEIGHT_STRING", "COLUMN_FORMAT", 
		"CONNECTION_ADMIN", "FIREWALL_ADMIN", "FIREWALL_USER", "INSERT_METHOD", 
		"KEY_BLOCK_SIZE", "PACK_KEYS", "PERSIST_ONLY", "BIT_AND", "BIT_OR", "BIT_XOR", 
		"GROUP_CONCAT", "JSON_ARRAYAGG", "JSON_OBJECTAGG", "STD", "STDDEV", "STDDEV_POP", 
		"STDDEV_SAMP", "VAR_POP", "VAR_SAMP", "AUDIT_ADMIN", "AUTO_INCREMENT", 
		"AVG_ROW_LENGTH", "BINLOG_ADMIN", "DELAY_KEY_WRITE", "ENCRYPTION_KEY_ADMIN", 
		"SYSTEM_VARIABLES_ADMIN", "VERSION_TOKEN_ADMIN", "CURRENT_TIMESTAMP", 
		"YEAR_MONTH", "DAY_HOUR", "DAY_MINUTE", "DAY_SECOND", "DAY_MICROSECOND", 
		"HOUR_MINUTE", "HOUR_SECOND", "HOUR_MICROSECOND", "MINUTE_SECOND", "MINUTE_MICROSECOND", 
		"SECOND_MICROSECOND", "UL_BINARY", "ROTATE", "MASTER", "BINLOG", "ERROR", 
		"SCHEDULE", "COMPLETION", "EVERY", "STARTS", "ENDS", "HOST", "SOCKET", 
		"PORT", "SERVER", "WRAPPER", "OPTIONS", "OWNER", "DETERMINISTIC", "RETURNS", 
		"CONTAINS", "READS", "MODIFIES", "SECURITY", "INVOKER", "OUT", "INOUT", 
		"TEMPTABLE", "MERGE", "UNDEFINED", "DATAFILE", "FILE_BLOCK_SIZE", "EXTENT_SIZE", 
		"INITIAL_SIZE", "AUTOEXTEND_SIZE", "MAX_SIZE", "NODEGROUP", "WAIT", "LOGFILE", 
		"UNDOFILE", "UNDO_BUFFER_SIZE", "REDO_BUFFER_SIZE", "HANDLER", "PREV", 
		"ORGANIZATION", "DEFINITION", "DESCRIPTION", "REFERENCE", "FOLLOWS", "PRECEDES", 
		"IMPORT", "LOAD", "CONCURRENT", "INFILE", "LINES", "STARTING", "TERMINATED", 
		"OPTIONALLY", "ENCLOSED", "ESCAPED", "XML", "UNDO", "DUMPFILE", "OUTFILE", 
		"SHARE", "IDENTIFIER_", "STRING_", "NUMBER_", "HEX_DIGIT_", "BIT_NUM_"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MySQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExecuteContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public ReplaceContext replace() {
			return getRuleContext(ReplaceContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public TruncateTableContext truncateTable() {
			return getRuleContext(TruncateTableContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
		}
		public BeginTransactionContext beginTransaction() {
			return getRuleContext(BeginTransactionContext.class,0);
		}
		public SetAutoCommitContext setAutoCommit() {
			return getRuleContext(SetAutoCommitContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public SavepointContext savepoint() {
			return getRuleContext(SavepointContext.class,0);
		}
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public DropUserContext dropUser() {
			return getRuleContext(DropUserContext.class,0);
		}
		public AlterUserContext alterUser() {
			return getRuleContext(AlterUserContext.class,0);
		}
		public RenameUserContext renameUser() {
			return getRuleContext(RenameUserContext.class,0);
		}
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public SetRoleContext setRole() {
			return getRuleContext(SetRoleContext.class,0);
		}
		public SetPasswordContext setPassword() {
			return getRuleContext(SetPasswordContext.class,0);
		}
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public ShowDatabasesContext showDatabases() {
			return getRuleContext(ShowDatabasesContext.class,0);
		}
		public ShowTablesContext showTables() {
			return getRuleContext(ShowTablesContext.class,0);
		}
		public ShowTableStatusContext showTableStatus() {
			return getRuleContext(ShowTableStatusContext.class,0);
		}
		public ShowColumnsContext showColumns() {
			return getRuleContext(ShowColumnsContext.class,0);
		}
		public ShowIndexContext showIndex() {
			return getRuleContext(ShowIndexContext.class,0);
		}
		public ShowCreateTableContext showCreateTable() {
			return getRuleContext(ShowCreateTableContext.class,0);
		}
		public ShowOtherContext showOther() {
			return getRuleContext(ShowOtherContext.class,0);
		}
		public SetVariableContext setVariable() {
			return getRuleContext(SetVariableContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(MySQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(552);
				select();
				}
				break;
			case 2:
				{
				setState(553);
				insert();
				}
				break;
			case 3:
				{
				setState(554);
				update();
				}
				break;
			case 4:
				{
				setState(555);
				delete();
				}
				break;
			case 5:
				{
				setState(556);
				replace();
				}
				break;
			case 6:
				{
				setState(557);
				createTable();
				}
				break;
			case 7:
				{
				setState(558);
				alterTable();
				}
				break;
			case 8:
				{
				setState(559);
				dropTable();
				}
				break;
			case 9:
				{
				setState(560);
				truncateTable();
				}
				break;
			case 10:
				{
				setState(561);
				createIndex();
				}
				break;
			case 11:
				{
				setState(562);
				dropIndex();
				}
				break;
			case 12:
				{
				setState(563);
				setTransaction();
				}
				break;
			case 13:
				{
				setState(564);
				beginTransaction();
				}
				break;
			case 14:
				{
				setState(565);
				setAutoCommit();
				}
				break;
			case 15:
				{
				setState(566);
				commit();
				}
				break;
			case 16:
				{
				setState(567);
				rollback();
				}
				break;
			case 17:
				{
				setState(568);
				savepoint();
				}
				break;
			case 18:
				{
				setState(569);
				grant();
				}
				break;
			case 19:
				{
				setState(570);
				revoke();
				}
				break;
			case 20:
				{
				setState(571);
				createUser();
				}
				break;
			case 21:
				{
				setState(572);
				dropUser();
				}
				break;
			case 22:
				{
				setState(573);
				alterUser();
				}
				break;
			case 23:
				{
				setState(574);
				renameUser();
				}
				break;
			case 24:
				{
				setState(575);
				createRole();
				}
				break;
			case 25:
				{
				setState(576);
				dropRole();
				}
				break;
			case 26:
				{
				setState(577);
				setRole();
				}
				break;
			case 27:
				{
				setState(578);
				setPassword();
				}
				break;
			case 28:
				{
				setState(579);
				use();
				}
				break;
			case 29:
				{
				setState(580);
				desc();
				}
				break;
			case 30:
				{
				setState(581);
				showDatabases();
				}
				break;
			case 31:
				{
				setState(582);
				showTables();
				}
				break;
			case 32:
				{
				setState(583);
				showTableStatus();
				}
				break;
			case 33:
				{
				setState(584);
				showColumns();
				}
				break;
			case 34:
				{
				setState(585);
				showIndex();
				}
				break;
			case 35:
				{
				setState(586);
				showCreateTable();
				}
				break;
			case 36:
				{
				setState(587);
				showOther();
				}
				break;
			case 37:
				{
				setState(588);
				setVariable();
				}
				break;
			case 38:
				{
				setState(589);
				call();
				}
				break;
			}
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(592);
				match(SEMI_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(MySQLStatementParser.INSERT, 0); }
		public InsertSpecification_Context insertSpecification_() {
			return getRuleContext(InsertSpecification_Context.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public InsertSelectClauseContext insertSelectClause() {
			return getRuleContext(InsertSelectClauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public PartitionNames_Context partitionNames_() {
			return getRuleContext(PartitionNames_Context.class,0);
		}
		public OnDuplicateKeyClauseContext onDuplicateKeyClause() {
			return getRuleContext(OnDuplicateKeyClauseContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(INSERT);
			setState(596);
			insertSpecification_();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(597);
				match(INTO);
				}
			}

			setState(600);
			tableName();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(601);
				partitionNames_();
				}
			}

			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(604);
				insertValuesClause();
				}
				break;
			case 2:
				{
				setState(605);
				setAssignmentsClause();
				}
				break;
			case 3:
				{
				setState(606);
				insertSelectClause();
				}
				break;
			}
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(609);
				onDuplicateKeyClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertSpecification_Context extends ParserRuleContext {
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode DELAYED() { return getToken(MySQLStatementParser.DELAYED, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(MySQLStatementParser.HIGH_PRIORITY, 0); }
		public InsertSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSpecification_; }
	}

	public final InsertSpecification_Context insertSpecification_() throws RecognitionException {
		InsertSpecification_Context _localctx = new InsertSpecification_Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DELAYED || _la==HIGH_PRIORITY || _la==LOW_PRIORITY) {
				{
				setState(612);
				_la = _input.LA(1);
				if ( !(_la==DELAYED || _la==HIGH_PRIORITY || _la==LOW_PRIORITY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(615);
				match(IGNORE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValuesClauseContext extends ParserRuleContext {
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(MySQLStatementParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(MySQLStatementParser.VALUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
	}

	public final InsertValuesClauseContext insertValuesClause() throws RecognitionException {
		InsertValuesClauseContext _localctx = new InsertValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_insertValuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(618);
				columnNames();
				}
				break;
			}
			setState(621);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(622);
			assignmentValues();
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(623);
				match(COMMA_);
				setState(624);
				assignmentValues();
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertSelectClauseContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public InsertSelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSelectClause; }
	}

	public final InsertSelectClauseContext insertSelectClause() throws RecognitionException {
		InsertSelectClauseContext _localctx = new InsertSelectClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insertSelectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_ || _la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0)) {
				{
				setState(630);
				columnNames();
				}
			}

			setState(633);
			select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnDuplicateKeyClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TerminalNode DUPLICATE() { return getToken(MySQLStatementParser.DUPLICATE, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public OnDuplicateKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDuplicateKeyClause; }
	}

	public final OnDuplicateKeyClauseContext onDuplicateKeyClause() throws RecognitionException {
		OnDuplicateKeyClauseContext _localctx = new OnDuplicateKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_onDuplicateKeyClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(ON);
			setState(636);
			match(DUPLICATE);
			setState(637);
			match(KEY);
			setState(638);
			match(UPDATE);
			setState(639);
			assignment();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(640);
				match(COMMA_);
				setState(641);
				assignment();
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(MySQLStatementParser.REPLACE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public InsertSelectClauseContext insertSelectClause() {
			return getRuleContext(InsertSelectClauseContext.class,0);
		}
		public ReplaceSpecification_Context replaceSpecification_() {
			return getRuleContext(ReplaceSpecification_Context.class,0);
		}
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public PartitionNames_Context partitionNames_() {
			return getRuleContext(PartitionNames_Context.class,0);
		}
		public ReplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replace; }
	}

	public final ReplaceContext replace() throws RecognitionException {
		ReplaceContext _localctx = new ReplaceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_replace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(REPLACE);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DELAYED || _la==LOW_PRIORITY) {
				{
				setState(648);
				replaceSpecification_();
				}
			}

			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(651);
				match(INTO);
				}
			}

			setState(654);
			tableName();
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(655);
				partitionNames_();
				}
			}

			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(658);
				insertValuesClause();
				}
				break;
			case 2:
				{
				setState(659);
				setAssignmentsClause();
				}
				break;
			case 3:
				{
				setState(660);
				insertSelectClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceSpecification_Context extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode DELAYED() { return getToken(MySQLStatementParser.DELAYED, 0); }
		public ReplaceSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceSpecification_; }
	}

	public final ReplaceSpecification_Context replaceSpecification_() throws RecognitionException {
		ReplaceSpecification_Context _localctx = new ReplaceSpecification_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_replaceSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_la = _input.LA(1);
			if ( !(_la==DELAYED || _la==LOW_PRIORITY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public UpdateSpecification_Context updateSpecification_() {
			return getRuleContext(UpdateSpecification_Context.class,0);
		}
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(UPDATE);
			setState(666);
			updateSpecification_();
			setState(667);
			tableReferences();
			setState(668);
			setAssignmentsClause();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(669);
				whereClause();
				}
			}

			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(672);
				orderByClause();
				}
			}

			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(675);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateSpecification_Context extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public UpdateSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSpecification_; }
	}

	public final UpdateSpecification_Context updateSpecification_() throws RecognitionException {
		UpdateSpecification_Context _localctx = new UpdateSpecification_Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_updateSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(678);
				match(LOW_PRIORITY);
				}
			}

			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(681);
				match(IGNORE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(MySQLStatementParser.VALUES, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			columnName();
			setState(685);
			match(EQ_);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUES) {
				{
				setState(686);
				match(VALUES);
				}
			}

			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(689);
				match(LP_);
				}
				break;
			}
			setState(692);
			assignmentValue();
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(693);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetAssignmentsClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
	}

	public final SetAssignmentsClauseContext setAssignmentsClause() throws RecognitionException {
		SetAssignmentsClauseContext _localctx = new SetAssignmentsClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setAssignmentsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(SET);
			setState(697);
			assignment();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(698);
				match(COMMA_);
				setState(699);
				assignment();
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentValuesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentValues);
		int _la;
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(LP_);
				setState(706);
				assignmentValue();
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(707);
					match(COMMA_);
					setState(708);
					assignmentValue();
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(714);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				match(LP_);
				setState(717);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public BlobValueContext blobValue() {
			return getRuleContext(BlobValueContext.class,0);
		}
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentValue);
		try {
			setState(723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case CASE:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case REPLACE:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case ROW:
			case WITHOUT:
			case BINARY:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case SUBSTR:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MATCH:
			case MEMORY:
			case NONE:
			case NOW:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case CURRENT_TIMESTAMP:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				expr(0);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(DEFAULT);
				}
				break;
			case UL_BINARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				blobValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlobValueContext extends ParserRuleContext {
		public TerminalNode UL_BINARY() { return getToken(MySQLStatementParser.UL_BINARY, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public BlobValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blobValue; }
	}

	public final BlobValueContext blobValue() throws RecognitionException {
		BlobValueContext _localctx = new BlobValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blobValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(UL_BINARY);
			setState(726);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(MySQLStatementParser.DELETE, 0); }
		public DeleteSpecification_Context deleteSpecification_() {
			return getRuleContext(DeleteSpecification_Context.class,0);
		}
		public SingleTableClause_Context singleTableClause_() {
			return getRuleContext(SingleTableClause_Context.class,0);
		}
		public MultipleTablesClause_Context multipleTablesClause_() {
			return getRuleContext(MultipleTablesClause_Context.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(DELETE);
			setState(729);
			deleteSpecification_();
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(730);
				singleTableClause_();
				}
				break;
			case 2:
				{
				setState(731);
				multipleTablesClause_();
				}
				break;
			}
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(734);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteSpecification_Context extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode QUICK() { return getToken(MySQLStatementParser.QUICK, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public DeleteSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSpecification_; }
	}

	public final DeleteSpecification_Context deleteSpecification_() throws RecognitionException {
		DeleteSpecification_Context _localctx = new DeleteSpecification_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_deleteSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(737);
				match(LOW_PRIORITY);
				}
			}

			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(740);
				match(QUICK);
				}
				break;
			}
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(743);
				match(IGNORE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableClause_Context extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public PartitionNames_Context partitionNames_() {
			return getRuleContext(PartitionNames_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public SingleTableClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableClause_; }
	}

	public final SingleTableClause_Context singleTableClause_() throws RecognitionException {
		SingleTableClause_Context _localctx = new SingleTableClause_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_singleTableClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(FROM);
			setState(747);
			tableName();
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (TRUNCATE - 60)) | (1L << (POSITION - 60)) | (1L << (VIEW - 60)) | (1L << (AS - 60)) | (1L << (ANY - 60)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OFFSET - 128)) | (1L << (BEGIN - 128)) | (1L << (COMMIT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAVEPOINT - 128)) | (1L << (BOOLEAN - 128)) | (1L << (DATE - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (YEAR - 128)) | (1L << (QUARTER - 128)) | (1L << (MONTH - 128)) | (1L << (WEEK - 128)) | (1L << (DAY - 128)) | (1L << (HOUR - 128)) | (1L << (MINUTE - 128)) | (1L << (SECOND - 128)) | (1L << (MICROSECOND - 128)) | (1L << (MAX - 128)) | (1L << (MIN - 128)) | (1L << (SUM - 128)) | (1L << (COUNT - 128)) | (1L << (AVG - 128)) | (1L << (CURRENT - 128)) | (1L << (ENABLE - 128)) | (1L << (DISABLE - 128)) | (1L << (INSTANCE - 128)) | (1L << (DO - 128)) | (1L << (DEFINER - 128)) | (1L << (CASCADED - 128)) | (1L << (LOCAL - 128)) | (1L << (CLOSE - 128)) | (1L << (OPEN - 128)) | (1L << (NEXT - 128)) | (1L << (NAME - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESPACE - 128)) | (1L << (COLUMNS - 128)) | (1L << (FIELDS - 128)) | (1L << (INDEXES - 128)) | (1L << (STATUS - 128)) | (1L << (MODIFY - 128)) | (1L << (VALUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (DUPLICATE - 192)) | (1L << (FIRST - 192)) | (1L << (LAST - 192)) | (1L << (AFTER - 192)) | (1L << (OJ - 192)) | (1L << (ACCOUNT - 192)) | (1L << (USER - 192)) | (1L << (ROLE - 192)) | (1L << (START - 192)) | (1L << (TRANSACTION - 192)) | (1L << (WITHOUT - 192)) | (1L << (ESCAPE - 192)) | (1L << (SUBPARTITION - 192)) | (1L << (STORAGE - 192)) | (1L << (SUPER - 192)) | (1L << (TEMPORARY - 192)) | (1L << (THAN - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (ROLLUP - 192)) | (1L << (SOUNDS - 192)) | (1L << (UNKNOWN - 192)) | (1L << (OFF - 192)) | (1L << (ALWAYS - 192)) | (1L << (COMMITTED - 192)) | (1L << (LEVEL - 192)) | (1L << (NO - 192)) | (1L << (PASSWORD - 192)) | (1L << (PRIVILEGES - 192)) | (1L << (ACTION - 192)) | (1L << (ALGORITHM - 192)) | (1L << (AUTOCOMMIT - 192)) | (1L << (BTREE - 192)) | (1L << (CHAIN - 192)) | (1L << (CHARSET - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (CHECKSUM - 256)) | (1L << (CIPHER - 256)) | (1L << (CLIENT - 256)) | (1L << (COALESCE - 256)) | (1L << (COMMENT - 256)) | (1L << (COMPACT - 256)) | (1L << (COMPRESSED - 256)) | (1L << (COMPRESSION - 256)) | (1L << (CONNECTION - 256)) | (1L << (CONSISTENT - 256)) | (1L << (DATA - 256)) | (1L << (DISCARD - 256)) | (1L << (DISK - 256)) | (1L << (ENCRYPTION - 256)) | (1L << (END - 256)) | (1L << (ENGINE - 256)) | (1L << (EVENT - 256)) | (1L << (EXCHANGE - 256)) | (1L << (EXECUTE - 256)) | (1L << (FILE - 256)) | (1L << (FIXED - 256)) | (1L << (FOLLOWING - 256)) | (1L << (GLOBAL - 256)) | (1L << (HASH - 256)) | (1L << (IMPORT_ - 256)) | (1L << (LESS - 256)) | (1L << (MEMORY - 256)) | (1L << (NONE - 256)) | (1L << (PARSER - 256)) | (1L << (PARTIAL - 256)) | (1L << (PARTITIONING - 256)) | (1L << (PERSIST - 256)) | (1L << (PRECEDING - 256)) | (1L << (PROCESS - 256)) | (1L << (PROXY - 256)) | (1L << (QUICK - 256)) | (1L << (REBUILD - 256)) | (1L << (REDUNDANT - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (RELOAD - 321)) | (1L << (REMOVE - 321)) | (1L << (REORGANIZE - 321)) | (1L << (REPAIR - 321)) | (1L << (REVERSE - 321)) | (1L << (SESSION - 321)) | (1L << (SHUTDOWN - 321)) | (1L << (SIMPLE - 321)) | (1L << (SLAVE - 321)) | (1L << (VISIBLE - 321)) | (1L << (INVISIBLE - 321)) | (1L << (ENFORCED - 321)) | (1L << (AGAINST - 321)) | (1L << (LANGUAGE - 321)) | (1L << (MODE - 321)) | (1L << (QUERY - 321)) | (1L << (EXTENDED - 321)) | (1L << (EXPANSION - 321)) | (1L << (VARIANCE - 321)) | (1L << (MAX_ROWS - 321)) | (1L << (MIN_ROWS - 321)) | (1L << (SQL_BIG_RESULT - 321)) | (1L << (SQL_BUFFER_RESULT - 321)) | (1L << (SQL_CACHE - 321)) | (1L << (SQL_NO_CACHE - 321)) | (1L << (STATS_AUTO_RECALC - 321)) | (1L << (STATS_PERSISTENT - 321)) | (1L << (STATS_SAMPLE_PAGES - 321)) | (1L << (ROW_FORMAT - 321)) | (1L << (WEIGHT_STRING - 321)) | (1L << (COLUMN_FORMAT - 321)) | (1L << (INSERT_METHOD - 321)) | (1L << (KEY_BLOCK_SIZE - 321)) | (1L << (PACK_KEYS - 321)) | (1L << (PERSIST_ONLY - 321)) | (1L << (BIT_AND - 321)) | (1L << (BIT_OR - 321)) | (1L << (BIT_XOR - 321)) | (1L << (GROUP_CONCAT - 321)) | (1L << (JSON_ARRAYAGG - 321)) | (1L << (JSON_OBJECTAGG - 321)) | (1L << (STD - 321)))) != 0) || ((((_la - 385)) & ~0x3f) == 0 && ((1L << (_la - 385)) & ((1L << (STDDEV - 385)) | (1L << (STDDEV_POP - 385)) | (1L << (STDDEV_SAMP - 385)) | (1L << (VAR_POP - 385)) | (1L << (VAR_SAMP - 385)) | (1L << (AUTO_INCREMENT - 385)) | (1L << (AVG_ROW_LENGTH - 385)) | (1L << (DELAY_KEY_WRITE - 385)) | (1L << (ROTATE - 385)) | (1L << (MASTER - 385)) | (1L << (BINLOG - 385)) | (1L << (ERROR - 385)) | (1L << (SCHEDULE - 385)) | (1L << (COMPLETION - 385)) | (1L << (EVERY - 385)) | (1L << (HOST - 385)) | (1L << (SOCKET - 385)) | (1L << (PORT - 385)) | (1L << (SERVER - 385)) | (1L << (WRAPPER - 385)) | (1L << (OPTIONS - 385)) | (1L << (OWNER - 385)) | (1L << (RETURNS - 385)) | (1L << (CONTAINS - 385)) | (1L << (SECURITY - 385)) | (1L << (INVOKER - 385)) | (1L << (TEMPTABLE - 385)) | (1L << (MERGE - 385)) | (1L << (UNDEFINED - 385)) | (1L << (DATAFILE - 385)) | (1L << (FILE_BLOCK_SIZE - 385)) | (1L << (EXTENT_SIZE - 385)) | (1L << (INITIAL_SIZE - 385)) | (1L << (AUTOEXTEND_SIZE - 385)) | (1L << (MAX_SIZE - 385)) | (1L << (NODEGROUP - 385)) | (1L << (WAIT - 385)) | (1L << (LOGFILE - 385)) | (1L << (UNDOFILE - 385)))) != 0) || ((((_la - 449)) & ~0x3f) == 0 && ((1L << (_la - 449)) & ((1L << (UNDO_BUFFER_SIZE - 449)) | (1L << (REDO_BUFFER_SIZE - 449)) | (1L << (HANDLER - 449)) | (1L << (PREV - 449)) | (1L << (ORGANIZATION - 449)) | (1L << (DEFINITION - 449)) | (1L << (DESCRIPTION - 449)) | (1L << (REFERENCE - 449)) | (1L << (FOLLOWS - 449)) | (1L << (PRECEDES - 449)) | (1L << (IMPORT - 449)) | (1L << (CONCURRENT - 449)) | (1L << (XML - 449)) | (1L << (DUMPFILE - 449)) | (1L << (SHARE - 449)) | (1L << (IDENTIFIER_ - 449)) | (1L << (STRING_ - 449)))) != 0)) {
				{
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(748);
					match(AS);
					}
				}

				setState(751);
				alias();
				}
			}

			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(754);
				partitionNames_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipleTablesClause_Context extends ParserRuleContext {
		public MultipleTableNames_Context multipleTableNames_() {
			return getRuleContext(MultipleTableNames_Context.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public MultipleTablesClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTablesClause_; }
	}

	public final MultipleTablesClause_Context multipleTablesClause_() throws RecognitionException {
		MultipleTablesClause_Context _localctx = new MultipleTablesClause_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_multipleTablesClause_);
		try {
			setState(766);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case WITHOUT:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MEMORY:
			case NONE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				multipleTableNames_();
				setState(758);
				match(FROM);
				setState(759);
				tableReferences();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				match(FROM);
				setState(762);
				multipleTableNames_();
				setState(763);
				match(USING);
				setState(764);
				tableReferences();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipleTableNames_Context extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<TerminalNode> DOT_ASTERISK_() { return getTokens(MySQLStatementParser.DOT_ASTERISK_); }
		public TerminalNode DOT_ASTERISK_(int i) {
			return getToken(MySQLStatementParser.DOT_ASTERISK_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public MultipleTableNames_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTableNames_; }
	}

	public final MultipleTableNames_Context multipleTableNames_() throws RecognitionException {
		MultipleTableNames_Context _localctx = new MultipleTableNames_Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_multipleTableNames_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			tableName();
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_ASTERISK_) {
				{
				setState(769);
				match(DOT_ASTERISK_);
				}
			}

			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(772);
				match(COMMA_);
				setState(773);
				tableName();
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_ASTERISK_) {
					{
					setState(774);
					match(DOT_ASTERISK_);
					}
				}

				}
				}
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public UnionClause_Context unionClause_() {
			return getRuleContext(UnionClause_Context.class,0);
		}
		public WithClause_Context withClause_() {
			return getRuleContext(WithClause_Context.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(782);
				withClause_();
				}
			}

			setState(785);
			unionClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallStatementContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(MySQLStatementParser.CALL, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStatement; }
	}

	public final CallStatementContext callStatement() throws RecognitionException {
		CallStatementContext _localctx = new CallStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_callStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(CALL);
			setState(788);
			identifier_();
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(789);
				match(LP_);
				setState(792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(790);
					identifier_();
					}
					break;
				case 2:
					{
					setState(791);
					expr(0);
					}
					break;
				}
				setState(794);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(MySQLStatementParser.DO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_doStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(DO);
			setState(798);
			expr(0);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(799);
				match(COMMA_);
				setState(800);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerStatementContext extends ParserRuleContext {
		public HandlerOpenStatementContext handlerOpenStatement() {
			return getRuleContext(HandlerOpenStatementContext.class,0);
		}
		public HandlerReadIndexStatementContext handlerReadIndexStatement() {
			return getRuleContext(HandlerReadIndexStatementContext.class,0);
		}
		public HandlerReadStatementContext handlerReadStatement() {
			return getRuleContext(HandlerReadStatementContext.class,0);
		}
		public HandlerCloseStatementContext handlerCloseStatement() {
			return getRuleContext(HandlerCloseStatementContext.class,0);
		}
		public HandlerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerStatement; }
	}

	public final HandlerStatementContext handlerStatement() throws RecognitionException {
		HandlerStatementContext _localctx = new HandlerStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_handlerStatement);
		try {
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				handlerOpenStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				handlerReadIndexStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				handlerReadStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(806);
				handlerCloseStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerOpenStatementContext extends ParserRuleContext {
		public TerminalNode HANDLER() { return getToken(MySQLStatementParser.HANDLER, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(MySQLStatementParser.OPEN, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public HandlerOpenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerOpenStatement; }
	}

	public final HandlerOpenStatementContext handlerOpenStatement() throws RecognitionException {
		HandlerOpenStatementContext _localctx = new HandlerOpenStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_handlerOpenStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(HANDLER);
			setState(810);
			tableName();
			setState(811);
			match(OPEN);
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (AS - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0)) {
				{
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(812);
					match(AS);
					}
				}

				setState(815);
				identifier_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerReadIndexStatementContext extends ParserRuleContext {
		public TerminalNode HANDLER() { return getToken(MySQLStatementParser.HANDLER, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode READ() { return getToken(MySQLStatementParser.READ, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(MySQLStatementParser.NEXT, 0); }
		public TerminalNode PREV() { return getToken(MySQLStatementParser.PREV, 0); }
		public TerminalNode LAST() { return getToken(MySQLStatementParser.LAST, 0); }
		public TerminalNode WHERE() { return getToken(MySQLStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(MySQLStatementParser.LIMIT, 0); }
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public HandlerReadIndexStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerReadIndexStatement; }
	}

	public final HandlerReadIndexStatementContext handlerReadIndexStatement() throws RecognitionException {
		HandlerReadIndexStatementContext _localctx = new HandlerReadIndexStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_handlerReadIndexStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(HANDLER);
			setState(819);
			tableName();
			setState(820);
			match(READ);
			setState(821);
			identifier_();
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ_:
			case NEQ_:
			case GT_:
			case GTE_:
			case LT_:
			case LTE_:
				{
				setState(822);
				comparisonOperator();
				setState(823);
				match(LP_);
				setState(824);
				identifier_();
				setState(825);
				match(RP_);
				}
				break;
			case NEXT:
			case FIRST:
			case LAST:
			case PREV:
				{
				setState(827);
				_la = _input.LA(1);
				if ( !(((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & ((1L << (NEXT - 173)) | (1L << (FIRST - 173)) | (1L << (LAST - 173)))) != 0) || _la==PREV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(830);
				match(WHERE);
				setState(831);
				expr(0);
				}
			}

			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(834);
				match(LIMIT);
				setState(835);
				numberLiterals();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerReadStatementContext extends ParserRuleContext {
		public TerminalNode HANDLER() { return getToken(MySQLStatementParser.HANDLER, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode READ() { return getToken(MySQLStatementParser.READ, 0); }
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(MySQLStatementParser.NEXT, 0); }
		public TerminalNode WHERE() { return getToken(MySQLStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(MySQLStatementParser.LIMIT, 0); }
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public HandlerReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerReadStatement; }
	}

	public final HandlerReadStatementContext handlerReadStatement() throws RecognitionException {
		HandlerReadStatementContext _localctx = new HandlerReadStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_handlerReadStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(HANDLER);
			setState(839);
			tableName();
			setState(840);
			match(READ);
			setState(841);
			_la = _input.LA(1);
			if ( !(_la==NEXT || _la==FIRST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(842);
				match(WHERE);
				setState(843);
				expr(0);
				}
			}

			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(846);
				match(LIMIT);
				setState(847);
				numberLiterals();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerCloseStatementContext extends ParserRuleContext {
		public TerminalNode HANDLER() { return getToken(MySQLStatementParser.HANDLER, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(MySQLStatementParser.CLOSE, 0); }
		public HandlerCloseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerCloseStatement; }
	}

	public final HandlerCloseStatementContext handlerCloseStatement() throws RecognitionException {
		HandlerCloseStatementContext _localctx = new HandlerCloseStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_handlerCloseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(HANDLER);
			setState(851);
			tableName();
			setState(852);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(MySQLStatementParser.IMPORT, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(IMPORT);
			setState(855);
			match(TABLE);
			setState(856);
			match(FROM);
			setState(857);
			match(STRING_);
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(858);
				match(COMMA_);
				setState(859);
				match(STRING_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadDataStatementContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(MySQLStatementParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode INFILE() { return getToken(MySQLStatementParser.INFILE, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(MySQLStatementParser.LOCAL, 0); }
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public List<TerminalNode> LP_() { return getTokens(MySQLStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(MySQLStatementParser.LP_, i);
		}
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(MySQLStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(MySQLStatementParser.RP_, i);
		}
		public TerminalNode CHARACTER() { return getToken(MySQLStatementParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public List<TerminalNode> LINES() { return getTokens(MySQLStatementParser.LINES); }
		public TerminalNode LINES(int i) {
			return getToken(MySQLStatementParser.LINES, i);
		}
		public List<TerminalNode> IGNORE() { return getTokens(MySQLStatementParser.IGNORE); }
		public TerminalNode IGNORE(int i) {
			return getToken(MySQLStatementParser.IGNORE, i);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode CONCURRENT() { return getToken(MySQLStatementParser.CONCURRENT, 0); }
		public TerminalNode REPLACE() { return getToken(MySQLStatementParser.REPLACE, 0); }
		public TerminalNode FIELDS() { return getToken(MySQLStatementParser.FIELDS, 0); }
		public TerminalNode COLUMNS() { return getToken(MySQLStatementParser.COLUMNS, 0); }
		public TerminalNode ROWS() { return getToken(MySQLStatementParser.ROWS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public List<SelectFieldsInto_Context> selectFieldsInto_() {
			return getRuleContexts(SelectFieldsInto_Context.class);
		}
		public SelectFieldsInto_Context selectFieldsInto_(int i) {
			return getRuleContext(SelectFieldsInto_Context.class,i);
		}
		public List<SelectLinesInto_Context> selectLinesInto_() {
			return getRuleContexts(SelectLinesInto_Context.class);
		}
		public SelectLinesInto_Context selectLinesInto_(int i) {
			return getRuleContext(SelectLinesInto_Context.class,i);
		}
		public LoadDataStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadDataStatement; }
	}

	public final LoadDataStatementContext loadDataStatement() throws RecognitionException {
		LoadDataStatementContext _localctx = new LoadDataStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loadDataStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(LOAD);
			setState(863);
			match(DATA);
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY || _la==CONCURRENT) {
				{
				setState(864);
				_la = _input.LA(1);
				if ( !(_la==LOW_PRIORITY || _la==CONCURRENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(867);
				match(LOCAL);
				}
			}

			setState(870);
			match(INFILE);
			setState(871);
			match(STRING_);
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPLACE || _la==IGNORE) {
				{
				setState(872);
				_la = _input.LA(1);
				if ( !(_la==REPLACE || _la==IGNORE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(875);
			match(INTO);
			setState(876);
			match(TABLE);
			setState(877);
			tableName();
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(878);
				match(PARTITION);
				setState(879);
				match(LP_);
				setState(880);
				identifier_();
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(881);
					match(COMMA_);
					setState(882);
					identifier_();
					}
					}
					setState(887);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(888);
				match(RP_);
				}
			}

			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTER) {
				{
				setState(892);
				match(CHARACTER);
				setState(893);
				match(SET);
				setState(894);
				identifier_();
				}
			}

			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMNS || _la==FIELDS) {
				{
				setState(897);
				_la = _input.LA(1);
				if ( !(_la==COLUMNS || _la==FIELDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(899); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(898);
					selectFieldsInto_();
					}
					}
					setState(901); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 465)) & ~0x3f) == 0 && ((1L << (_la - 465)) & ((1L << (TERMINATED - 465)) | (1L << (OPTIONALLY - 465)) | (1L << (ENCLOSED - 465)) | (1L << (ESCAPED - 465)))) != 0) );
				}
			}

			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINES) {
				{
				setState(905);
				match(LINES);
				setState(907); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(906);
					selectLinesInto_();
					}
					}
					setState(909); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STARTING || _la==TERMINATED );
				}
			}

			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(913);
				match(IGNORE);
				setState(914);
				numberLiterals();
				setState(915);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==LINES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(919);
				match(LP_);
				setState(920);
				identifier_();
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(921);
					match(COMMA_);
					setState(922);
					identifier_();
					}
					}
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(928);
				match(RP_);
				}
			}

			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET) {
				{
				setState(932);
				setAssignmentsClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadXmlStatementContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(MySQLStatementParser.LOAD, 0); }
		public TerminalNode XML() { return getToken(MySQLStatementParser.XML, 0); }
		public TerminalNode INFILE() { return getToken(MySQLStatementParser.INFILE, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(MySQLStatementParser.LOCAL, 0); }
		public TerminalNode CHARACTER() { return getToken(MySQLStatementParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public List<TerminalNode> ROWS() { return getTokens(MySQLStatementParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(MySQLStatementParser.ROWS, i);
		}
		public TerminalNode IDENTIFIED() { return getToken(MySQLStatementParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public TerminalNode LT_() { return getToken(MySQLStatementParser.LT_, 0); }
		public TerminalNode GT_() { return getToken(MySQLStatementParser.GT_, 0); }
		public List<TerminalNode> IGNORE() { return getTokens(MySQLStatementParser.IGNORE); }
		public TerminalNode IGNORE(int i) {
			return getToken(MySQLStatementParser.IGNORE, i);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode CONCURRENT() { return getToken(MySQLStatementParser.CONCURRENT, 0); }
		public TerminalNode REPLACE() { return getToken(MySQLStatementParser.REPLACE, 0); }
		public TerminalNode LINES() { return getToken(MySQLStatementParser.LINES, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public LoadXmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadXmlStatement; }
	}

	public final LoadXmlStatementContext loadXmlStatement() throws RecognitionException {
		LoadXmlStatementContext _localctx = new LoadXmlStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_loadXmlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(LOAD);
			setState(936);
			match(XML);
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY || _la==CONCURRENT) {
				{
				setState(937);
				_la = _input.LA(1);
				if ( !(_la==LOW_PRIORITY || _la==CONCURRENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(940);
				match(LOCAL);
				}
			}

			setState(943);
			match(INFILE);
			setState(944);
			match(STRING_);
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPLACE || _la==IGNORE) {
				{
				setState(945);
				_la = _input.LA(1);
				if ( !(_la==REPLACE || _la==IGNORE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(948);
			match(INTO);
			setState(949);
			match(TABLE);
			setState(950);
			tableName();
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTER) {
				{
				setState(951);
				match(CHARACTER);
				setState(952);
				match(SET);
				setState(953);
				identifier_();
				}
			}

			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROWS) {
				{
				setState(956);
				match(ROWS);
				setState(957);
				match(IDENTIFIED);
				setState(958);
				match(BY);
				setState(959);
				match(LT_);
				setState(960);
				match(STRING_);
				setState(961);
				match(GT_);
				}
			}

			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(964);
				match(IGNORE);
				setState(965);
				numberLiterals();
				setState(966);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==LINES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(970);
				match(LP_);
				setState(971);
				identifier_();
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(972);
					match(COMMA_);
					setState(973);
					identifier_();
					}
					}
					setState(978);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(979);
				match(RP_);
				}
			}

			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET) {
				{
				setState(983);
				setAssignmentsClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClause_Context extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public List<CteClause_Context> cteClause_() {
			return getRuleContexts(CteClause_Context.class);
		}
		public CteClause_Context cteClause_(int i) {
			return getRuleContext(CteClause_Context.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(MySQLStatementParser.RECURSIVE, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public WithClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause_; }
	}

	public final WithClause_Context withClause_() throws RecognitionException {
		WithClause_Context _localctx = new WithClause_Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_withClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(WITH);
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(987);
				match(RECURSIVE);
				}
			}

			setState(990);
			cteClause_();
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(991);
				match(COMMA_);
				setState(992);
				cteClause_();
				}
				}
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CteClause_Context extends ParserRuleContext {
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public CteClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteClause_; }
	}

	public final CteClause_Context cteClause_() throws RecognitionException {
		CteClause_Context _localctx = new CteClause_Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_cteClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			ignoredIdentifier_();
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_ || _la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0)) {
				{
				setState(999);
				columnNames();
				}
			}

			setState(1002);
			match(AS);
			setState(1003);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionClause_Context extends ParserRuleContext {
		public List<SelectClauseContext> selectClause() {
			return getRuleContexts(SelectClauseContext.class);
		}
		public SelectClauseContext selectClause(int i) {
			return getRuleContext(SelectClauseContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(MySQLStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(MySQLStatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(MySQLStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(MySQLStatementParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(MySQLStatementParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(MySQLStatementParser.DISTINCT, i);
		}
		public UnionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionClause_; }
	}

	public final UnionClause_Context unionClause_() throws RecognitionException {
		UnionClause_Context _localctx = new UnionClause_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_unionClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			selectClause();
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(1006);
				match(UNION);
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==ALL) {
					{
					setState(1007);
					_la = _input.LA(1);
					if ( !(_la==DISTINCT || _la==ALL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1010);
				selectClause();
				}
				}
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLStatementParser.SELECT, 0); }
		public SelectItemsContext selectItems() {
			return getRuleContext(SelectItemsContext.class,0);
		}
		public List<SelectSpecification_Context> selectSpecification_() {
			return getRuleContexts(SelectSpecification_Context.class);
		}
		public SelectSpecification_Context selectSpecification_(int i) {
			return getRuleContext(SelectSpecification_Context.class,i);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClause_Context windowClause_() {
			return getRuleContext(WindowClause_Context.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectIntoExpression_Context selectIntoExpression_() {
			return getRuleContext(SelectIntoExpression_Context.class,0);
		}
		public LockClauseContext lockClause() {
			return getRuleContext(LockClauseContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selectClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(SELECT);
			setState(1020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1017);
					selectSpecification_();
					}
					} 
				}
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(1023);
			selectItems();
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1024);
				fromClause();
				}
			}

			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1027);
				whereClause();
				}
			}

			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1030);
				groupByClause();
				}
			}

			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1033);
				havingClause();
				}
			}

			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1036);
				windowClause_();
				}
			}

			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1039);
				orderByClause();
				}
			}

			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1042);
				limitClause();
				}
			}

			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1045);
				selectIntoExpression_();
				}
			}

			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR || _la==LOCK) {
				{
				setState(1048);
				lockClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectSpecification_Context extends ParserRuleContext {
		public DuplicateSpecificationContext duplicateSpecification() {
			return getRuleContext(DuplicateSpecificationContext.class,0);
		}
		public TerminalNode HIGH_PRIORITY() { return getToken(MySQLStatementParser.HIGH_PRIORITY, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLStatementParser.STRAIGHT_JOIN, 0); }
		public TerminalNode SQL_SMALL_RESULT() { return getToken(MySQLStatementParser.SQL_SMALL_RESULT, 0); }
		public TerminalNode SQL_BIG_RESULT() { return getToken(MySQLStatementParser.SQL_BIG_RESULT, 0); }
		public TerminalNode SQL_BUFFER_RESULT() { return getToken(MySQLStatementParser.SQL_BUFFER_RESULT, 0); }
		public TerminalNode SQL_CACHE() { return getToken(MySQLStatementParser.SQL_CACHE, 0); }
		public TerminalNode SQL_NO_CACHE() { return getToken(MySQLStatementParser.SQL_NO_CACHE, 0); }
		public TerminalNode SQL_CALC_FOUND_ROWS() { return getToken(MySQLStatementParser.SQL_CALC_FOUND_ROWS, 0); }
		public SelectSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSpecification_; }
	}

	public final SelectSpecification_Context selectSpecification_() throws RecognitionException {
		SelectSpecification_Context _localctx = new SelectSpecification_Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_selectSpecification_);
		int _la;
		try {
			setState(1059);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISTINCT:
			case ALL:
			case DISTINCTROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				duplicateSpecification();
				}
				break;
			case HIGH_PRIORITY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				match(HIGH_PRIORITY);
				}
				break;
			case STRAIGHT_JOIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1053);
				match(STRAIGHT_JOIN);
				}
				break;
			case SQL_SMALL_RESULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1054);
				match(SQL_SMALL_RESULT);
				}
				break;
			case SQL_BIG_RESULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1055);
				match(SQL_BIG_RESULT);
				}
				break;
			case SQL_BUFFER_RESULT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1056);
				match(SQL_BUFFER_RESULT);
				}
				break;
			case SQL_CACHE:
			case SQL_NO_CACHE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1057);
				_la = _input.LA(1);
				if ( !(_la==SQL_CACHE || _la==SQL_NO_CACHE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SQL_CALC_FOUND_ROWS:
				enterOuterAlt(_localctx, 8);
				{
				setState(1058);
				match(SQL_CALC_FOUND_ROWS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DuplicateSpecificationContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(MySQLStatementParser.DISTINCT, 0); }
		public TerminalNode DISTINCTROW() { return getToken(MySQLStatementParser.DISTINCTROW, 0); }
		public DuplicateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplicateSpecification; }
	}

	public final DuplicateSpecificationContext duplicateSpecification() throws RecognitionException {
		DuplicateSpecificationContext _localctx = new DuplicateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_duplicateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==ALL || _la==DISTINCTROW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemsContext extends ParserRuleContext {
		public UnqualifiedShorthandContext unqualifiedShorthand() {
			return getRuleContext(UnqualifiedShorthandContext.class,0);
		}
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public SelectItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItems; }
	}

	public final SelectItemsContext selectItems() throws RecognitionException {
		SelectItemsContext _localctx = new SelectItemsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_selectItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(1063);
				unqualifiedShorthand();
				}
				break;
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case CASE:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case REPLACE:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case ROW:
			case WITHOUT:
			case BINARY:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case SUBSTR:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MATCH:
			case MEMORY:
			case NONE:
			case NOW:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case CURRENT_TIMESTAMP:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1064);
				selectItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1067);
				match(COMMA_);
				setState(1068);
				selectItem();
				}
				}
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public QualifiedShorthandContext qualifiedShorthand() {
			return getRuleContext(QualifiedShorthandContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_selectItem);
		int _la;
		try {
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(1074);
					columnName();
					}
					break;
				case 2:
					{
					setState(1075);
					expr(0);
					}
					break;
				}
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (TRUNCATE - 60)) | (1L << (POSITION - 60)) | (1L << (VIEW - 60)) | (1L << (AS - 60)) | (1L << (ANY - 60)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OFFSET - 128)) | (1L << (BEGIN - 128)) | (1L << (COMMIT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAVEPOINT - 128)) | (1L << (BOOLEAN - 128)) | (1L << (DATE - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (YEAR - 128)) | (1L << (QUARTER - 128)) | (1L << (MONTH - 128)) | (1L << (WEEK - 128)) | (1L << (DAY - 128)) | (1L << (HOUR - 128)) | (1L << (MINUTE - 128)) | (1L << (SECOND - 128)) | (1L << (MICROSECOND - 128)) | (1L << (MAX - 128)) | (1L << (MIN - 128)) | (1L << (SUM - 128)) | (1L << (COUNT - 128)) | (1L << (AVG - 128)) | (1L << (CURRENT - 128)) | (1L << (ENABLE - 128)) | (1L << (DISABLE - 128)) | (1L << (INSTANCE - 128)) | (1L << (DO - 128)) | (1L << (DEFINER - 128)) | (1L << (CASCADED - 128)) | (1L << (LOCAL - 128)) | (1L << (CLOSE - 128)) | (1L << (OPEN - 128)) | (1L << (NEXT - 128)) | (1L << (NAME - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESPACE - 128)) | (1L << (COLUMNS - 128)) | (1L << (FIELDS - 128)) | (1L << (INDEXES - 128)) | (1L << (STATUS - 128)) | (1L << (MODIFY - 128)) | (1L << (VALUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (DUPLICATE - 192)) | (1L << (FIRST - 192)) | (1L << (LAST - 192)) | (1L << (AFTER - 192)) | (1L << (OJ - 192)) | (1L << (ACCOUNT - 192)) | (1L << (USER - 192)) | (1L << (ROLE - 192)) | (1L << (START - 192)) | (1L << (TRANSACTION - 192)) | (1L << (WITHOUT - 192)) | (1L << (ESCAPE - 192)) | (1L << (SUBPARTITION - 192)) | (1L << (STORAGE - 192)) | (1L << (SUPER - 192)) | (1L << (TEMPORARY - 192)) | (1L << (THAN - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (ROLLUP - 192)) | (1L << (SOUNDS - 192)) | (1L << (UNKNOWN - 192)) | (1L << (OFF - 192)) | (1L << (ALWAYS - 192)) | (1L << (COMMITTED - 192)) | (1L << (LEVEL - 192)) | (1L << (NO - 192)) | (1L << (PASSWORD - 192)) | (1L << (PRIVILEGES - 192)) | (1L << (ACTION - 192)) | (1L << (ALGORITHM - 192)) | (1L << (AUTOCOMMIT - 192)) | (1L << (BTREE - 192)) | (1L << (CHAIN - 192)) | (1L << (CHARSET - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (CHECKSUM - 256)) | (1L << (CIPHER - 256)) | (1L << (CLIENT - 256)) | (1L << (COALESCE - 256)) | (1L << (COMMENT - 256)) | (1L << (COMPACT - 256)) | (1L << (COMPRESSED - 256)) | (1L << (COMPRESSION - 256)) | (1L << (CONNECTION - 256)) | (1L << (CONSISTENT - 256)) | (1L << (DATA - 256)) | (1L << (DISCARD - 256)) | (1L << (DISK - 256)) | (1L << (ENCRYPTION - 256)) | (1L << (END - 256)) | (1L << (ENGINE - 256)) | (1L << (EVENT - 256)) | (1L << (EXCHANGE - 256)) | (1L << (EXECUTE - 256)) | (1L << (FILE - 256)) | (1L << (FIXED - 256)) | (1L << (FOLLOWING - 256)) | (1L << (GLOBAL - 256)) | (1L << (HASH - 256)) | (1L << (IMPORT_ - 256)) | (1L << (LESS - 256)) | (1L << (MEMORY - 256)) | (1L << (NONE - 256)) | (1L << (PARSER - 256)) | (1L << (PARTIAL - 256)) | (1L << (PARTITIONING - 256)) | (1L << (PERSIST - 256)) | (1L << (PRECEDING - 256)) | (1L << (PROCESS - 256)) | (1L << (PROXY - 256)) | (1L << (QUICK - 256)) | (1L << (REBUILD - 256)) | (1L << (REDUNDANT - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (RELOAD - 321)) | (1L << (REMOVE - 321)) | (1L << (REORGANIZE - 321)) | (1L << (REPAIR - 321)) | (1L << (REVERSE - 321)) | (1L << (SESSION - 321)) | (1L << (SHUTDOWN - 321)) | (1L << (SIMPLE - 321)) | (1L << (SLAVE - 321)) | (1L << (VISIBLE - 321)) | (1L << (INVISIBLE - 321)) | (1L << (ENFORCED - 321)) | (1L << (AGAINST - 321)) | (1L << (LANGUAGE - 321)) | (1L << (MODE - 321)) | (1L << (QUERY - 321)) | (1L << (EXTENDED - 321)) | (1L << (EXPANSION - 321)) | (1L << (VARIANCE - 321)) | (1L << (MAX_ROWS - 321)) | (1L << (MIN_ROWS - 321)) | (1L << (SQL_BIG_RESULT - 321)) | (1L << (SQL_BUFFER_RESULT - 321)) | (1L << (SQL_CACHE - 321)) | (1L << (SQL_NO_CACHE - 321)) | (1L << (STATS_AUTO_RECALC - 321)) | (1L << (STATS_PERSISTENT - 321)) | (1L << (STATS_SAMPLE_PAGES - 321)) | (1L << (ROW_FORMAT - 321)) | (1L << (WEIGHT_STRING - 321)) | (1L << (COLUMN_FORMAT - 321)) | (1L << (INSERT_METHOD - 321)) | (1L << (KEY_BLOCK_SIZE - 321)) | (1L << (PACK_KEYS - 321)) | (1L << (PERSIST_ONLY - 321)) | (1L << (BIT_AND - 321)) | (1L << (BIT_OR - 321)) | (1L << (BIT_XOR - 321)) | (1L << (GROUP_CONCAT - 321)) | (1L << (JSON_ARRAYAGG - 321)) | (1L << (JSON_OBJECTAGG - 321)) | (1L << (STD - 321)))) != 0) || ((((_la - 385)) & ~0x3f) == 0 && ((1L << (_la - 385)) & ((1L << (STDDEV - 385)) | (1L << (STDDEV_POP - 385)) | (1L << (STDDEV_SAMP - 385)) | (1L << (VAR_POP - 385)) | (1L << (VAR_SAMP - 385)) | (1L << (AUTO_INCREMENT - 385)) | (1L << (AVG_ROW_LENGTH - 385)) | (1L << (DELAY_KEY_WRITE - 385)) | (1L << (ROTATE - 385)) | (1L << (MASTER - 385)) | (1L << (BINLOG - 385)) | (1L << (ERROR - 385)) | (1L << (SCHEDULE - 385)) | (1L << (COMPLETION - 385)) | (1L << (EVERY - 385)) | (1L << (HOST - 385)) | (1L << (SOCKET - 385)) | (1L << (PORT - 385)) | (1L << (SERVER - 385)) | (1L << (WRAPPER - 385)) | (1L << (OPTIONS - 385)) | (1L << (OWNER - 385)) | (1L << (RETURNS - 385)) | (1L << (CONTAINS - 385)) | (1L << (SECURITY - 385)) | (1L << (INVOKER - 385)) | (1L << (TEMPTABLE - 385)) | (1L << (MERGE - 385)) | (1L << (UNDEFINED - 385)) | (1L << (DATAFILE - 385)) | (1L << (FILE_BLOCK_SIZE - 385)) | (1L << (EXTENT_SIZE - 385)) | (1L << (INITIAL_SIZE - 385)) | (1L << (AUTOEXTEND_SIZE - 385)) | (1L << (MAX_SIZE - 385)) | (1L << (NODEGROUP - 385)) | (1L << (WAIT - 385)) | (1L << (LOGFILE - 385)) | (1L << (UNDOFILE - 385)))) != 0) || ((((_la - 449)) & ~0x3f) == 0 && ((1L << (_la - 449)) & ((1L << (UNDO_BUFFER_SIZE - 449)) | (1L << (REDO_BUFFER_SIZE - 449)) | (1L << (HANDLER - 449)) | (1L << (PREV - 449)) | (1L << (ORGANIZATION - 449)) | (1L << (DEFINITION - 449)) | (1L << (DESCRIPTION - 449)) | (1L << (REFERENCE - 449)) | (1L << (FOLLOWS - 449)) | (1L << (PRECEDES - 449)) | (1L << (IMPORT - 449)) | (1L << (CONCURRENT - 449)) | (1L << (XML - 449)) | (1L << (DUMPFILE - 449)) | (1L << (SHARE - 449)) | (1L << (IDENTIFIER_ - 449)) | (1L << (STRING_ - 449)))) != 0)) {
					{
					setState(1079);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1078);
						match(AS);
						}
					}

					setState(1081);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				qualifiedShorthand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_alias);
		try {
			setState(1089);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case WITHOUT:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MEMORY:
			case NONE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1087);
				identifier_();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1088);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedShorthandContext extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedShorthandContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode DOT_ASTERISK_() { return getToken(MySQLStatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			identifier_();
			setState(1094);
			match(DOT_ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			match(FROM);
			setState(1097);
			tableReferences();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableReferencesContext extends ParserRuleContext {
		public List<EscapedTableReference_Context> escapedTableReference_() {
			return getRuleContexts(EscapedTableReference_Context.class);
		}
		public EscapedTableReference_Context escapedTableReference_(int i) {
			return getRuleContext(EscapedTableReference_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			escapedTableReference_();
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1100);
				match(COMMA_);
				setState(1101);
				escapedTableReference_();
				}
				}
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscapedTableReference_Context extends ParserRuleContext {
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public TerminalNode LBE_() { return getToken(MySQLStatementParser.LBE_, 0); }
		public TerminalNode OJ() { return getToken(MySQLStatementParser.OJ, 0); }
		public TerminalNode RBE_() { return getToken(MySQLStatementParser.RBE_, 0); }
		public EscapedTableReference_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedTableReference_; }
	}

	public final EscapedTableReference_Context escapedTableReference_() throws RecognitionException {
		EscapedTableReference_Context _localctx = new EscapedTableReference_Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_escapedTableReference_);
		try {
			setState(1113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case WITHOUT:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MEMORY:
			case NONE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				tableReference();
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1108);
				match(LBE_);
				setState(1109);
				match(OJ);
				setState(1110);
				tableReference();
				setState(1111);
				match(RBE_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableReferenceContext extends ParserRuleContext {
		public List<TableFactorContext> tableFactor() {
			return getRuleContexts(TableFactorContext.class);
		}
		public TableFactorContext tableFactor(int i) {
			return getRuleContext(TableFactorContext.class,i);
		}
		public List<JoinedTableContext> joinedTable() {
			return getRuleContexts(JoinedTableContext.class);
		}
		public JoinedTableContext joinedTable(int i) {
			return getRuleContext(JoinedTableContext.class,i);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tableReference);
		int _la;
		try {
			setState(1129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1115);
					tableFactor();
					setState(1116);
					joinedTable();
					}
					}
					setState(1120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LP_ || _la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				tableFactor();
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NATURAL - 91)) | (1L << (JOIN - 91)) | (1L << (INNER - 91)) | (1L << (LEFT - 91)) | (1L << (RIGHT - 91)) | (1L << (CROSS - 91)))) != 0) || _la==STRAIGHT_JOIN) {
					{
					{
					setState(1123);
					joinedTable();
					}
					}
					setState(1128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableFactorContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PartitionNames_Context partitionNames_() {
			return getRuleContext(PartitionNames_Context.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public IndexHintList_Context indexHintList_() {
			return getRuleContext(IndexHintList_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tableFactor);
		int _la;
		try {
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				tableName();
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1132);
					partitionNames_();
					}
				}

				setState(1139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1135);
						match(AS);
						}
					}

					setState(1138);
					alias();
					}
					break;
				}
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USE || _la==FORCE || _la==IGNORE) {
					{
					setState(1141);
					indexHintList_();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				subquery();
				setState(1146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1145);
					columnNames();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1148);
				match(LP_);
				setState(1149);
				tableReferences();
				setState(1150);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionNames_Context extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionNames_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionNames_; }
	}

	public final PartitionNames_Context partitionNames_() throws RecognitionException {
		PartitionNames_Context _localctx = new PartitionNames_Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_partitionNames_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			match(PARTITION);
			setState(1155);
			match(LP_);
			setState(1156);
			identifier_();
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1157);
				match(COMMA_);
				setState(1158);
				identifier_();
				}
				}
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1164);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexHintList_Context extends ParserRuleContext {
		public List<IndexHint_Context> indexHint_() {
			return getRuleContexts(IndexHint_Context.class);
		}
		public IndexHint_Context indexHint_(int i) {
			return getRuleContext(IndexHint_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public IndexHintList_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHintList_; }
	}

	public final IndexHintList_Context indexHintList_() throws RecognitionException {
		IndexHintList_Context _localctx = new IndexHintList_Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_indexHintList_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			indexHint_();
			setState(1171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1167);
					match(COMMA_);
					setState(1168);
					indexHint_();
					}
					} 
				}
				setState(1173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexHint_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode USE() { return getToken(MySQLStatementParser.USE, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public TerminalNode FORCE() { return getToken(MySQLStatementParser.FORCE, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode FOR() { return getToken(MySQLStatementParser.FOR, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode JOIN() { return getToken(MySQLStatementParser.JOIN, 0); }
		public TerminalNode ORDER() { return getToken(MySQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public TerminalNode GROUP() { return getToken(MySQLStatementParser.GROUP, 0); }
		public IndexHint_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHint_; }
	}

	public final IndexHint_Context indexHint_() throws RecognitionException {
		IndexHint_Context _localctx = new IndexHint_Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_indexHint_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			_la = _input.LA(1);
			if ( !(_la==USE || _la==FORCE || _la==IGNORE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1175);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1176);
				match(FOR);
				setState(1182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JOIN:
					{
					setState(1177);
					match(JOIN);
					}
					break;
				case ORDER:
					{
					setState(1178);
					match(ORDER);
					setState(1179);
					match(BY);
					}
					break;
				case GROUP:
					{
					setState(1180);
					match(GROUP);
					setState(1181);
					match(BY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1186);
			match(LP_);
			setState(1187);
			indexName();
			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1188);
				match(COMMA_);
				setState(1189);
				indexName();
				}
				}
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1195);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinedTableContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(MySQLStatementParser.JOIN, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLStatementParser.STRAIGHT_JOIN, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(MySQLStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLStatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(MySQLStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLStatementParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLStatementParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(MySQLStatementParser.NATURAL, 0); }
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_joinedTable);
		int _la;
		try {
			setState(1224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
			case CROSS:
			case STRAIGHT_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JOIN:
				case INNER:
				case CROSS:
					{
					setState(1198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INNER || _la==CROSS) {
						{
						setState(1197);
						_la = _input.LA(1);
						if ( !(_la==INNER || _la==CROSS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1200);
					match(JOIN);
					}
					break;
				case STRAIGHT_JOIN:
					{
					setState(1201);
					match(STRAIGHT_JOIN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1204);
				tableFactor();
				setState(1206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1205);
					joinSpecification();
					}
					break;
				}
				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1209);
					match(OUTER);
					}
				}

				setState(1212);
				match(JOIN);
				setState(1213);
				tableFactor();
				setState(1214);
				joinSpecification();
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1216);
				match(NATURAL);
				setState(1220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
					{
					setState(1217);
					match(INNER);
					}
					break;
				case LEFT:
				case RIGHT:
					{
					setState(1218);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					{
					setState(1219);
					match(OUTER);
					}
					}
					break;
				case JOIN:
					break;
				default:
					break;
				}
				setState(1222);
				match(JOIN);
				setState(1223);
				tableFactor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinSpecificationContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_joinSpecification);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1226);
				match(ON);
				setState(1227);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
				match(USING);
				setState(1229);
				columnNames();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MySQLStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(WHERE);
			setState(1233);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(MySQLStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode ROLLUP() { return getToken(MySQLStatementParser.ROLLUP, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(GROUP);
			setState(1236);
			match(BY);
			setState(1237);
			orderByItem();
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1238);
				match(COMMA_);
				setState(1239);
				orderByItem();
				}
				}
				setState(1244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1245);
				match(WITH);
				setState(1246);
				match(ROLLUP);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(MySQLStatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(HAVING);
			setState(1250);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(MySQLStatementParser.LIMIT, 0); }
		public LimitRowCountContext limitRowCount() {
			return getRuleContext(LimitRowCountContext.class,0);
		}
		public TerminalNode OFFSET() { return getToken(MySQLStatementParser.OFFSET, 0); }
		public LimitOffsetContext limitOffset() {
			return getRuleContext(LimitOffsetContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(LIMIT);
			setState(1263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1253);
					limitOffset();
					setState(1254);
					match(COMMA_);
					}
					break;
				}
				setState(1258);
				limitRowCount();
				}
				break;
			case 2:
				{
				setState(1259);
				limitRowCount();
				setState(1260);
				match(OFFSET);
				setState(1261);
				limitOffset();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitRowCountContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LimitRowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitRowCount; }
	}

	public final LimitRowCountContext limitRowCount() throws RecognitionException {
		LimitRowCountContext _localctx = new LimitRowCountContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_limitRowCount);
		try {
			setState(1267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1265);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266);
				parameterMarker();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitOffsetContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LimitOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOffset; }
	}

	public final LimitOffsetContext limitOffset() throws RecognitionException {
		LimitOffsetContext _localctx = new LimitOffsetContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_limitOffset);
		try {
			setState(1271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1269);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270);
				parameterMarker();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClause_Context extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(MySQLStatementParser.WINDOW, 0); }
		public List<WindowItem_Context> windowItem_() {
			return getRuleContexts(WindowItem_Context.class);
		}
		public WindowItem_Context windowItem_(int i) {
			return getRuleContext(WindowItem_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public WindowClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause_; }
	}

	public final WindowClause_Context windowClause_() throws RecognitionException {
		WindowClause_Context _localctx = new WindowClause_Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_windowClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(WINDOW);
			setState(1274);
			windowItem_();
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1275);
				match(COMMA_);
				setState(1276);
				windowItem_();
				}
				}
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowItem_Context extends ParserRuleContext {
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public WindowSpecification_Context windowSpecification_() {
			return getRuleContext(WindowSpecification_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public WindowItem_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowItem_; }
	}

	public final WindowItem_Context windowItem_() throws RecognitionException {
		WindowItem_Context _localctx = new WindowItem_Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_windowItem_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			ignoredIdentifier_();
			setState(1283);
			match(AS);
			setState(1284);
			match(LP_);
			setState(1285);
			windowSpecification_();
			setState(1286);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public UnionClause_Context unionClause_() {
			return getRuleContext(UnionClause_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(LP_);
			setState(1289);
			unionClause_();
			setState(1290);
			match(RP_);
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1291);
				match(AS);
				}
				break;
			}
			setState(1295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1294);
				alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectLinesInto_Context extends ParserRuleContext {
		public TerminalNode STARTING() { return getToken(MySQLStatementParser.STARTING, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode TERMINATED() { return getToken(MySQLStatementParser.TERMINATED, 0); }
		public SelectLinesInto_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectLinesInto_; }
	}

	public final SelectLinesInto_Context selectLinesInto_() throws RecognitionException {
		SelectLinesInto_Context _localctx = new SelectLinesInto_Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_selectLinesInto_);
		try {
			setState(1303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STARTING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				match(STARTING);
				setState(1298);
				match(BY);
				setState(1299);
				match(STRING_);
				}
				break;
			case TERMINATED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1300);
				match(TERMINATED);
				setState(1301);
				match(BY);
				setState(1302);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectFieldsInto_Context extends ParserRuleContext {
		public TerminalNode TERMINATED() { return getToken(MySQLStatementParser.TERMINATED, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode ENCLOSED() { return getToken(MySQLStatementParser.ENCLOSED, 0); }
		public TerminalNode OPTIONALLY() { return getToken(MySQLStatementParser.OPTIONALLY, 0); }
		public TerminalNode ESCAPED() { return getToken(MySQLStatementParser.ESCAPED, 0); }
		public SelectFieldsInto_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectFieldsInto_; }
	}

	public final SelectFieldsInto_Context selectFieldsInto_() throws RecognitionException {
		SelectFieldsInto_Context _localctx = new SelectFieldsInto_Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_selectFieldsInto_);
		int _la;
		try {
			setState(1317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERMINATED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305);
				match(TERMINATED);
				setState(1306);
				match(BY);
				setState(1307);
				match(STRING_);
				}
				break;
			case OPTIONALLY:
			case ENCLOSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONALLY) {
					{
					setState(1308);
					match(OPTIONALLY);
					}
				}

				setState(1311);
				match(ENCLOSED);
				setState(1312);
				match(BY);
				setState(1313);
				match(STRING_);
				}
				break;
			case ESCAPED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1314);
				match(ESCAPED);
				setState(1315);
				match(BY);
				setState(1316);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectIntoExpression_Context extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode DUMPFILE() { return getToken(MySQLStatementParser.DUMPFILE, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode OUTFILE() { return getToken(MySQLStatementParser.OUTFILE, 0); }
		public TerminalNode CHARACTER() { return getToken(MySQLStatementParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(MySQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode LINES() { return getToken(MySQLStatementParser.LINES, 0); }
		public TerminalNode FIELDS() { return getToken(MySQLStatementParser.FIELDS, 0); }
		public TerminalNode COLUMNS() { return getToken(MySQLStatementParser.COLUMNS, 0); }
		public List<SelectFieldsInto_Context> selectFieldsInto_() {
			return getRuleContexts(SelectFieldsInto_Context.class);
		}
		public SelectFieldsInto_Context selectFieldsInto_(int i) {
			return getRuleContext(SelectFieldsInto_Context.class,i);
		}
		public List<SelectLinesInto_Context> selectLinesInto_() {
			return getRuleContexts(SelectLinesInto_Context.class);
		}
		public SelectLinesInto_Context selectLinesInto_(int i) {
			return getRuleContext(SelectLinesInto_Context.class,i);
		}
		public SelectIntoExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectIntoExpression_; }
	}

	public final SelectIntoExpression_Context selectIntoExpression_() throws RecognitionException {
		SelectIntoExpression_Context _localctx = new SelectIntoExpression_Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_selectIntoExpression_);
		int _la;
		try {
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1319);
				match(INTO);
				setState(1320);
				identifier_();
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1321);
					match(COMMA_);
					setState(1322);
					identifier_();
					}
					}
					setState(1327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				match(INTO);
				setState(1329);
				match(DUMPFILE);
				setState(1330);
				match(STRING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1331);
				match(INTO);
				setState(1332);
				match(OUTFILE);
				setState(1333);
				match(STRING_);
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(1334);
					match(CHARACTER);
					setState(1335);
					match(SET);
					setState(1336);
					match(IDENTIFIER_);
					}
				}

				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMNS || _la==FIELDS) {
					{
					setState(1339);
					_la = _input.LA(1);
					if ( !(_la==COLUMNS || _la==FIELDS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1341); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1340);
						selectFieldsInto_();
						}
						}
						setState(1343); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 465)) & ~0x3f) == 0 && ((1L << (_la - 465)) & ((1L << (TERMINATED - 465)) | (1L << (OPTIONALLY - 465)) | (1L << (ENCLOSED - 465)) | (1L << (ESCAPED - 465)))) != 0) );
					}
				}

				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(1347);
					match(LINES);
					setState(1349); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1348);
						selectLinesInto_();
						}
						}
						setState(1351); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==STARTING || _la==TERMINATED );
					}
				}

				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MySQLStatementParser.FOR, 0); }
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public TerminalNode LOCK() { return getToken(MySQLStatementParser.LOCK, 0); }
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public TerminalNode SHARE() { return getToken(MySQLStatementParser.SHARE, 0); }
		public TerminalNode MODE() { return getToken(MySQLStatementParser.MODE, 0); }
		public LockClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockClause; }
	}

	public final LockClauseContext lockClause() throws RecognitionException {
		LockClauseContext _localctx = new LockClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_lockClause);
		try {
			setState(1363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				match(FOR);
				setState(1358);
				match(UPDATE);
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359);
				match(LOCK);
				setState(1360);
				match(IN);
				setState(1361);
				match(SHARE);
				setState(1362);
				match(MODE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterMarkerContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(MySQLStatementParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			match(QUESTION_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralsContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public DateTimeLiteralsContext dateTimeLiterals() {
			return getRuleContext(DateTimeLiteralsContext.class,0);
		}
		public HexadecimalLiteralsContext hexadecimalLiterals() {
			return getRuleContext(HexadecimalLiteralsContext.class,0);
		}
		public BitValueLiteralsContext bitValueLiterals() {
			return getRuleContext(BitValueLiteralsContext.class,0);
		}
		public BooleanLiteralsContext booleanLiterals() {
			return getRuleContext(BooleanLiteralsContext.class,0);
		}
		public NullValueLiteralsContext nullValueLiterals() {
			return getRuleContext(NullValueLiteralsContext.class,0);
		}
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_literals);
		try {
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
				stringLiterals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1368);
				numberLiterals();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1369);
				dateTimeLiterals();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1370);
				hexadecimalLiterals();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1371);
				bitValueLiterals();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1372);
				booleanLiterals();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1373);
				nullValueLiterals();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public CharacterSetName_Context characterSetName_() {
			return getRuleContext(CharacterSetName_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_stringLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(1376);
				characterSetName_();
				}
			}

			setState(1379);
			match(STRING_);
			setState(1381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1380);
				collateClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralsContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode MINUS_() { return getToken(MySQLStatementParser.MINUS_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_) {
				{
				setState(1383);
				match(MINUS_);
				}
			}

			setState(1386);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateTimeLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(MySQLStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(MySQLStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(MySQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode LBE_() { return getToken(MySQLStatementParser.LBE_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode RBE_() { return getToken(MySQLStatementParser.RBE_, 0); }
		public DateTimeLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiterals; }
	}

	public final DateTimeLiteralsContext dateTimeLiterals() throws RecognitionException {
		DateTimeLiteralsContext _localctx = new DateTimeLiteralsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_dateTimeLiterals);
		int _la;
		try {
			setState(1395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1388);
				_la = _input.LA(1);
				if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1389);
				match(STRING_);
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1390);
				match(LBE_);
				setState(1391);
				identifier_();
				setState(1392);
				match(STRING_);
				setState(1393);
				match(RBE_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexadecimalLiteralsContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT_() { return getToken(MySQLStatementParser.HEX_DIGIT_, 0); }
		public CharacterSetName_Context characterSetName_() {
			return getRuleContext(CharacterSetName_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_hexadecimalLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(1397);
				characterSetName_();
				}
			}

			setState(1400);
			match(HEX_DIGIT_);
			setState(1402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1401);
				collateClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitValueLiteralsContext extends ParserRuleContext {
		public TerminalNode BIT_NUM_() { return getToken(MySQLStatementParser.BIT_NUM_, 0); }
		public CharacterSetName_Context characterSetName_() {
			return getRuleContext(CharacterSetName_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_bitValueLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(1404);
				characterSetName_();
				}
			}

			setState(1407);
			match(BIT_NUM_);
			setState(1409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1408);
				collateClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralsContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MySQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLStatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullValueLiteralsContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(MySQLStatementParser.IDENTIFIER_, 0); }
		public UnreservedWord_Context unreservedWord_() {
			return getRuleContext(UnreservedWord_Context.class,0);
		}
		public Identifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_; }
	}

	public final Identifier_Context identifier_() throws RecognitionException {
		Identifier_Context _localctx = new Identifier_Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_identifier_);
		try {
			setState(1417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1415);
				match(IDENTIFIER_);
				}
				break;
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case WITHOUT:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MEMORY:
			case NONE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1416);
				unreservedWord_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_Context extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public List<TerminalNode> AT_() { return getTokens(MySQLStatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(MySQLStatementParser.AT_, i);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public TerminalNode GLOBAL() { return getToken(MySQLStatementParser.GLOBAL, 0); }
		public TerminalNode PERSIST() { return getToken(MySQLStatementParser.PERSIST, 0); }
		public TerminalNode PERSIST_ONLY() { return getToken(MySQLStatementParser.PERSIST_ONLY, 0); }
		public TerminalNode SESSION() { return getToken(MySQLStatementParser.SESSION, 0); }
		public Variable_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_; }
	}

	public final Variable_Context variable_() throws RecognitionException {
		Variable_Context _localctx = new Variable_Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_variable_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(1420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1419);
					match(AT_);
					}
					break;
				}
				setState(1422);
				match(AT_);
				}
			}

			setState(1426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1425);
				_la = _input.LA(1);
				if ( !(((((_la - 289)) & ~0x3f) == 0 && ((1L << (_la - 289)) & ((1L << (GLOBAL - 289)) | (1L << (PERSIST - 289)) | (1L << (SESSION - 289)))) != 0) || _la==PERSIST_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(1428);
				match(DOT_);
				}
			}

			setState(1431);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scope_Context extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(MySQLStatementParser.GLOBAL, 0); }
		public TerminalNode PERSIST() { return getToken(MySQLStatementParser.PERSIST, 0); }
		public TerminalNode PERSIST_ONLY() { return getToken(MySQLStatementParser.PERSIST_ONLY, 0); }
		public TerminalNode SESSION() { return getToken(MySQLStatementParser.SESSION, 0); }
		public List<TerminalNode> AT_() { return getTokens(MySQLStatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(MySQLStatementParser.AT_, i);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public Scope_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_; }
	}

	public final Scope_Context scope_() throws RecognitionException {
		Scope_Context _localctx = new Scope_Context(_ctx, getState());
		enterRule(_localctx, 152, RULE_scope_);
		int _la;
		try {
			setState(1438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case PERSIST:
			case SESSION:
			case PERSIST_ONLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1433);
				_la = _input.LA(1);
				if ( !(((((_la - 289)) & ~0x3f) == 0 && ((1L << (_la - 289)) & ((1L << (GLOBAL - 289)) | (1L << (PERSIST - 289)) | (1L << (SESSION - 289)))) != 0) || _la==PERSIST_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case AT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1434);
				match(AT_);
				setState(1435);
				match(AT_);
				setState(1436);
				_la = _input.LA(1);
				if ( !(((((_la - 289)) & ~0x3f) == 0 && ((1L << (_la - 289)) & ((1L << (GLOBAL - 289)) | (1L << (PERSIST - 289)) | (1L << (SESSION - 289)))) != 0) || _la==PERSIST_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1437);
				match(DOT_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnreservedWord_Context extends ParserRuleContext {
		public TerminalNode ACCOUNT() { return getToken(MySQLStatementParser.ACCOUNT, 0); }
		public TerminalNode ACTION() { return getToken(MySQLStatementParser.ACTION, 0); }
		public TerminalNode AFTER() { return getToken(MySQLStatementParser.AFTER, 0); }
		public TerminalNode ALGORITHM() { return getToken(MySQLStatementParser.ALGORITHM, 0); }
		public TerminalNode ALWAYS() { return getToken(MySQLStatementParser.ALWAYS, 0); }
		public TerminalNode ANY() { return getToken(MySQLStatementParser.ANY, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(MySQLStatementParser.AUTO_INCREMENT, 0); }
		public TerminalNode AVG_ROW_LENGTH() { return getToken(MySQLStatementParser.AVG_ROW_LENGTH, 0); }
		public TerminalNode BEGIN() { return getToken(MySQLStatementParser.BEGIN, 0); }
		public TerminalNode BTREE() { return getToken(MySQLStatementParser.BTREE, 0); }
		public TerminalNode CHAIN() { return getToken(MySQLStatementParser.CHAIN, 0); }
		public TerminalNode CHARSET() { return getToken(MySQLStatementParser.CHARSET, 0); }
		public TerminalNode CHECKSUM() { return getToken(MySQLStatementParser.CHECKSUM, 0); }
		public TerminalNode CIPHER() { return getToken(MySQLStatementParser.CIPHER, 0); }
		public TerminalNode CLIENT() { return getToken(MySQLStatementParser.CLIENT, 0); }
		public TerminalNode COALESCE() { return getToken(MySQLStatementParser.COALESCE, 0); }
		public TerminalNode COLUMNS() { return getToken(MySQLStatementParser.COLUMNS, 0); }
		public TerminalNode COLUMN_FORMAT() { return getToken(MySQLStatementParser.COLUMN_FORMAT, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(MySQLStatementParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(MySQLStatementParser.COMMITTED, 0); }
		public TerminalNode COMPACT() { return getToken(MySQLStatementParser.COMPACT, 0); }
		public TerminalNode COMPRESSED() { return getToken(MySQLStatementParser.COMPRESSED, 0); }
		public TerminalNode COMPRESSION() { return getToken(MySQLStatementParser.COMPRESSION, 0); }
		public TerminalNode CONNECTION() { return getToken(MySQLStatementParser.CONNECTION, 0); }
		public TerminalNode CONSISTENT() { return getToken(MySQLStatementParser.CONSISTENT, 0); }
		public TerminalNode CURRENT() { return getToken(MySQLStatementParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(MySQLStatementParser.DATE, 0); }
		public TerminalNode DELAY_KEY_WRITE() { return getToken(MySQLStatementParser.DELAY_KEY_WRITE, 0); }
		public TerminalNode DISABLE() { return getToken(MySQLStatementParser.DISABLE, 0); }
		public TerminalNode DISCARD() { return getToken(MySQLStatementParser.DISCARD, 0); }
		public TerminalNode DISK() { return getToken(MySQLStatementParser.DISK, 0); }
		public TerminalNode DUPLICATE() { return getToken(MySQLStatementParser.DUPLICATE, 0); }
		public TerminalNode ENABLE() { return getToken(MySQLStatementParser.ENABLE, 0); }
		public TerminalNode ENCRYPTION() { return getToken(MySQLStatementParser.ENCRYPTION, 0); }
		public TerminalNode ENFORCED() { return getToken(MySQLStatementParser.ENFORCED, 0); }
		public TerminalNode END() { return getToken(MySQLStatementParser.END, 0); }
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public TerminalNode ESCAPE() { return getToken(MySQLStatementParser.ESCAPE, 0); }
		public TerminalNode EVENT() { return getToken(MySQLStatementParser.EVENT, 0); }
		public TerminalNode EXCHANGE() { return getToken(MySQLStatementParser.EXCHANGE, 0); }
		public TerminalNode EXECUTE() { return getToken(MySQLStatementParser.EXECUTE, 0); }
		public TerminalNode FILE() { return getToken(MySQLStatementParser.FILE, 0); }
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode FIXED() { return getToken(MySQLStatementParser.FIXED, 0); }
		public TerminalNode FOLLOWING() { return getToken(MySQLStatementParser.FOLLOWING, 0); }
		public TerminalNode GLOBAL() { return getToken(MySQLStatementParser.GLOBAL, 0); }
		public TerminalNode HASH() { return getToken(MySQLStatementParser.HASH, 0); }
		public TerminalNode IMPORT_() { return getToken(MySQLStatementParser.IMPORT_, 0); }
		public TerminalNode INSERT_METHOD() { return getToken(MySQLStatementParser.INSERT_METHOD, 0); }
		public TerminalNode INVISIBLE() { return getToken(MySQLStatementParser.INVISIBLE, 0); }
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(MySQLStatementParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode LAST() { return getToken(MySQLStatementParser.LAST, 0); }
		public TerminalNode LESS() { return getToken(MySQLStatementParser.LESS, 0); }
		public TerminalNode LEVEL() { return getToken(MySQLStatementParser.LEVEL, 0); }
		public TerminalNode MAX_ROWS() { return getToken(MySQLStatementParser.MAX_ROWS, 0); }
		public TerminalNode MEMORY() { return getToken(MySQLStatementParser.MEMORY, 0); }
		public TerminalNode MIN_ROWS() { return getToken(MySQLStatementParser.MIN_ROWS, 0); }
		public TerminalNode MODIFY() { return getToken(MySQLStatementParser.MODIFY, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode NONE() { return getToken(MySQLStatementParser.NONE, 0); }
		public TerminalNode OFFSET() { return getToken(MySQLStatementParser.OFFSET, 0); }
		public TerminalNode PACK_KEYS() { return getToken(MySQLStatementParser.PACK_KEYS, 0); }
		public TerminalNode PARSER() { return getToken(MySQLStatementParser.PARSER, 0); }
		public TerminalNode PARTIAL() { return getToken(MySQLStatementParser.PARTIAL, 0); }
		public TerminalNode PARTITIONING() { return getToken(MySQLStatementParser.PARTITIONING, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public TerminalNode PERSIST() { return getToken(MySQLStatementParser.PERSIST, 0); }
		public TerminalNode PERSIST_ONLY() { return getToken(MySQLStatementParser.PERSIST_ONLY, 0); }
		public TerminalNode PRECEDING() { return getToken(MySQLStatementParser.PRECEDING, 0); }
		public TerminalNode PRIVILEGES() { return getToken(MySQLStatementParser.PRIVILEGES, 0); }
		public TerminalNode PROCESS() { return getToken(MySQLStatementParser.PROCESS, 0); }
		public TerminalNode PROXY() { return getToken(MySQLStatementParser.PROXY, 0); }
		public TerminalNode QUICK() { return getToken(MySQLStatementParser.QUICK, 0); }
		public TerminalNode REBUILD() { return getToken(MySQLStatementParser.REBUILD, 0); }
		public TerminalNode REDUNDANT() { return getToken(MySQLStatementParser.REDUNDANT, 0); }
		public TerminalNode RELOAD() { return getToken(MySQLStatementParser.RELOAD, 0); }
		public TerminalNode REMOVE() { return getToken(MySQLStatementParser.REMOVE, 0); }
		public TerminalNode REORGANIZE() { return getToken(MySQLStatementParser.REORGANIZE, 0); }
		public TerminalNode REPAIR() { return getToken(MySQLStatementParser.REPAIR, 0); }
		public TerminalNode REVERSE() { return getToken(MySQLStatementParser.REVERSE, 0); }
		public TerminalNode ROLLBACK() { return getToken(MySQLStatementParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(MySQLStatementParser.ROLLUP, 0); }
		public TerminalNode ROW_FORMAT() { return getToken(MySQLStatementParser.ROW_FORMAT, 0); }
		public TerminalNode SAVEPOINT() { return getToken(MySQLStatementParser.SAVEPOINT, 0); }
		public TerminalNode SESSION() { return getToken(MySQLStatementParser.SESSION, 0); }
		public TerminalNode SHUTDOWN() { return getToken(MySQLStatementParser.SHUTDOWN, 0); }
		public TerminalNode SIMPLE() { return getToken(MySQLStatementParser.SIMPLE, 0); }
		public TerminalNode SLAVE() { return getToken(MySQLStatementParser.SLAVE, 0); }
		public TerminalNode SOUNDS() { return getToken(MySQLStatementParser.SOUNDS, 0); }
		public TerminalNode SQL_BIG_RESULT() { return getToken(MySQLStatementParser.SQL_BIG_RESULT, 0); }
		public TerminalNode SQL_BUFFER_RESULT() { return getToken(MySQLStatementParser.SQL_BUFFER_RESULT, 0); }
		public TerminalNode SQL_CACHE() { return getToken(MySQLStatementParser.SQL_CACHE, 0); }
		public TerminalNode SQL_NO_CACHE() { return getToken(MySQLStatementParser.SQL_NO_CACHE, 0); }
		public TerminalNode START() { return getToken(MySQLStatementParser.START, 0); }
		public TerminalNode STATS_AUTO_RECALC() { return getToken(MySQLStatementParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode STATS_PERSISTENT() { return getToken(MySQLStatementParser.STATS_PERSISTENT, 0); }
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(MySQLStatementParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode SUBPARTITION() { return getToken(MySQLStatementParser.SUBPARTITION, 0); }
		public TerminalNode SUPER() { return getToken(MySQLStatementParser.SUPER, 0); }
		public TerminalNode TABLES() { return getToken(MySQLStatementParser.TABLES, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode THAN() { return getToken(MySQLStatementParser.THAN, 0); }
		public TerminalNode TIME() { return getToken(MySQLStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(MySQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode TRANSACTION() { return getToken(MySQLStatementParser.TRANSACTION, 0); }
		public TerminalNode TRUNCATE() { return getToken(MySQLStatementParser.TRUNCATE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(MySQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode UNKNOWN() { return getToken(MySQLStatementParser.UNKNOWN, 0); }
		public TerminalNode UPGRADE() { return getToken(MySQLStatementParser.UPGRADE, 0); }
		public TerminalNode VALIDATION() { return getToken(MySQLStatementParser.VALIDATION, 0); }
		public TerminalNode VALUE() { return getToken(MySQLStatementParser.VALUE, 0); }
		public TerminalNode VIEW() { return getToken(MySQLStatementParser.VIEW, 0); }
		public TerminalNode VISIBLE() { return getToken(MySQLStatementParser.VISIBLE, 0); }
		public TerminalNode WEIGHT_STRING() { return getToken(MySQLStatementParser.WEIGHT_STRING, 0); }
		public TerminalNode WITHOUT() { return getToken(MySQLStatementParser.WITHOUT, 0); }
		public TerminalNode MICROSECOND() { return getToken(MySQLStatementParser.MICROSECOND, 0); }
		public TerminalNode SECOND() { return getToken(MySQLStatementParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(MySQLStatementParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(MySQLStatementParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(MySQLStatementParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(MySQLStatementParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(MySQLStatementParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(MySQLStatementParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(MySQLStatementParser.YEAR, 0); }
		public TerminalNode AGAINST() { return getToken(MySQLStatementParser.AGAINST, 0); }
		public TerminalNode LANGUAGE() { return getToken(MySQLStatementParser.LANGUAGE, 0); }
		public TerminalNode MODE() { return getToken(MySQLStatementParser.MODE, 0); }
		public TerminalNode QUERY() { return getToken(MySQLStatementParser.QUERY, 0); }
		public TerminalNode EXPANSION() { return getToken(MySQLStatementParser.EXPANSION, 0); }
		public TerminalNode BOOLEAN() { return getToken(MySQLStatementParser.BOOLEAN, 0); }
		public TerminalNode MAX() { return getToken(MySQLStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(MySQLStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(MySQLStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(MySQLStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(MySQLStatementParser.AVG, 0); }
		public TerminalNode BIT_AND() { return getToken(MySQLStatementParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(MySQLStatementParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(MySQLStatementParser.BIT_XOR, 0); }
		public TerminalNode GROUP_CONCAT() { return getToken(MySQLStatementParser.GROUP_CONCAT, 0); }
		public TerminalNode JSON_ARRAYAGG() { return getToken(MySQLStatementParser.JSON_ARRAYAGG, 0); }
		public TerminalNode JSON_OBJECTAGG() { return getToken(MySQLStatementParser.JSON_OBJECTAGG, 0); }
		public TerminalNode STD() { return getToken(MySQLStatementParser.STD, 0); }
		public TerminalNode STDDEV() { return getToken(MySQLStatementParser.STDDEV, 0); }
		public TerminalNode STDDEV_POP() { return getToken(MySQLStatementParser.STDDEV_POP, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(MySQLStatementParser.STDDEV_SAMP, 0); }
		public TerminalNode VAR_POP() { return getToken(MySQLStatementParser.VAR_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(MySQLStatementParser.VAR_SAMP, 0); }
		public TerminalNode VARIANCE() { return getToken(MySQLStatementParser.VARIANCE, 0); }
		public TerminalNode EXTENDED() { return getToken(MySQLStatementParser.EXTENDED, 0); }
		public TerminalNode STATUS() { return getToken(MySQLStatementParser.STATUS, 0); }
		public TerminalNode FIELDS() { return getToken(MySQLStatementParser.FIELDS, 0); }
		public TerminalNode INDEXES() { return getToken(MySQLStatementParser.INDEXES, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public TerminalNode OJ() { return getToken(MySQLStatementParser.OJ, 0); }
		public TerminalNode AUTOCOMMIT() { return getToken(MySQLStatementParser.AUTOCOMMIT, 0); }
		public TerminalNode OFF() { return getToken(MySQLStatementParser.OFF, 0); }
		public TerminalNode ROTATE() { return getToken(MySQLStatementParser.ROTATE, 0); }
		public TerminalNode INSTANCE() { return getToken(MySQLStatementParser.INSTANCE, 0); }
		public TerminalNode MASTER() { return getToken(MySQLStatementParser.MASTER, 0); }
		public TerminalNode BINLOG() { return getToken(MySQLStatementParser.BINLOG, 0); }
		public TerminalNode ERROR() { return getToken(MySQLStatementParser.ERROR, 0); }
		public TerminalNode SCHEDULE() { return getToken(MySQLStatementParser.SCHEDULE, 0); }
		public TerminalNode COMPLETION() { return getToken(MySQLStatementParser.COMPLETION, 0); }
		public TerminalNode DO() { return getToken(MySQLStatementParser.DO, 0); }
		public TerminalNode DEFINER() { return getToken(MySQLStatementParser.DEFINER, 0); }
		public TerminalNode EVERY() { return getToken(MySQLStatementParser.EVERY, 0); }
		public TerminalNode HOST() { return getToken(MySQLStatementParser.HOST, 0); }
		public TerminalNode SOCKET() { return getToken(MySQLStatementParser.SOCKET, 0); }
		public TerminalNode OWNER() { return getToken(MySQLStatementParser.OWNER, 0); }
		public TerminalNode PORT() { return getToken(MySQLStatementParser.PORT, 0); }
		public TerminalNode RETURNS() { return getToken(MySQLStatementParser.RETURNS, 0); }
		public TerminalNode CONTAINS() { return getToken(MySQLStatementParser.CONTAINS, 0); }
		public TerminalNode SECURITY() { return getToken(MySQLStatementParser.SECURITY, 0); }
		public TerminalNode INVOKER() { return getToken(MySQLStatementParser.INVOKER, 0); }
		public TerminalNode UNDEFINED() { return getToken(MySQLStatementParser.UNDEFINED, 0); }
		public TerminalNode MERGE() { return getToken(MySQLStatementParser.MERGE, 0); }
		public TerminalNode TEMPTABLE() { return getToken(MySQLStatementParser.TEMPTABLE, 0); }
		public TerminalNode CASCADED() { return getToken(MySQLStatementParser.CASCADED, 0); }
		public TerminalNode LOCAL() { return getToken(MySQLStatementParser.LOCAL, 0); }
		public TerminalNode SERVER() { return getToken(MySQLStatementParser.SERVER, 0); }
		public TerminalNode WRAPPER() { return getToken(MySQLStatementParser.WRAPPER, 0); }
		public TerminalNode OPTIONS() { return getToken(MySQLStatementParser.OPTIONS, 0); }
		public TerminalNode DATAFILE() { return getToken(MySQLStatementParser.DATAFILE, 0); }
		public TerminalNode FILE_BLOCK_SIZE() { return getToken(MySQLStatementParser.FILE_BLOCK_SIZE, 0); }
		public TerminalNode EXTENT_SIZE() { return getToken(MySQLStatementParser.EXTENT_SIZE, 0); }
		public TerminalNode INITIAL_SIZE() { return getToken(MySQLStatementParser.INITIAL_SIZE, 0); }
		public TerminalNode AUTOEXTEND_SIZE() { return getToken(MySQLStatementParser.AUTOEXTEND_SIZE, 0); }
		public TerminalNode MAX_SIZE() { return getToken(MySQLStatementParser.MAX_SIZE, 0); }
		public TerminalNode NODEGROUP() { return getToken(MySQLStatementParser.NODEGROUP, 0); }
		public TerminalNode WAIT() { return getToken(MySQLStatementParser.WAIT, 0); }
		public TerminalNode LOGFILE() { return getToken(MySQLStatementParser.LOGFILE, 0); }
		public TerminalNode UNDOFILE() { return getToken(MySQLStatementParser.UNDOFILE, 0); }
		public TerminalNode UNDO_BUFFER_SIZE() { return getToken(MySQLStatementParser.UNDO_BUFFER_SIZE, 0); }
		public TerminalNode REDO_BUFFER_SIZE() { return getToken(MySQLStatementParser.REDO_BUFFER_SIZE, 0); }
		public TerminalNode DEFINITION() { return getToken(MySQLStatementParser.DEFINITION, 0); }
		public TerminalNode ORGANIZATION() { return getToken(MySQLStatementParser.ORGANIZATION, 0); }
		public TerminalNode DESCRIPTION() { return getToken(MySQLStatementParser.DESCRIPTION, 0); }
		public TerminalNode REFERENCE() { return getToken(MySQLStatementParser.REFERENCE, 0); }
		public TerminalNode FOLLOWS() { return getToken(MySQLStatementParser.FOLLOWS, 0); }
		public TerminalNode PRECEDES() { return getToken(MySQLStatementParser.PRECEDES, 0); }
		public TerminalNode NAME() { return getToken(MySQLStatementParser.NAME, 0); }
		public TerminalNode CLOSE() { return getToken(MySQLStatementParser.CLOSE, 0); }
		public TerminalNode OPEN() { return getToken(MySQLStatementParser.OPEN, 0); }
		public TerminalNode NEXT() { return getToken(MySQLStatementParser.NEXT, 0); }
		public TerminalNode HANDLER() { return getToken(MySQLStatementParser.HANDLER, 0); }
		public TerminalNode PREV() { return getToken(MySQLStatementParser.PREV, 0); }
		public TerminalNode IMPORT() { return getToken(MySQLStatementParser.IMPORT, 0); }
		public TerminalNode CONCURRENT() { return getToken(MySQLStatementParser.CONCURRENT, 0); }
		public TerminalNode XML() { return getToken(MySQLStatementParser.XML, 0); }
		public TerminalNode POSITION() { return getToken(MySQLStatementParser.POSITION, 0); }
		public TerminalNode SHARE() { return getToken(MySQLStatementParser.SHARE, 0); }
		public TerminalNode DUMPFILE() { return getToken(MySQLStatementParser.DUMPFILE, 0); }
		public UnreservedWord_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord_; }
	}

	public final UnreservedWord_Context unreservedWord_() throws RecognitionException {
		UnreservedWord_Context _localctx = new UnreservedWord_Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_unreservedWord_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			_la = _input.LA(1);
			if ( !(_la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaNameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1444);
				owner();
				setState(1445);
				match(DOT_);
				}
				break;
			}
			setState(1449);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1451);
				owner();
				setState(1452);
				match(DOT_);
				}
				break;
			}
			setState(1456);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserNameContext extends ParserRuleContext {
		public TerminalNode AT_() { return getToken(MySQLStatementParser.AT_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public List<TerminalNode> IDENTIFIER_() { return getTokens(MySQLStatementParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(MySQLStatementParser.IDENTIFIER_, i);
		}
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public UserNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userName; }
	}

	public final UserNameContext userName() throws RecognitionException {
		UserNameContext _localctx = new UserNameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_userName);
		int _la;
		try {
			setState(1464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1458);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER_ || _la==STRING_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1459);
				match(AT_);
				{
				setState(1460);
				match(STRING_);
				setState(1461);
				match(IDENTIFIER_);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1462);
				identifier_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1463);
				match(STRING_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventNameContext extends ParserRuleContext {
		public TerminalNode AT_() { return getToken(MySQLStatementParser.AT_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public List<TerminalNode> IDENTIFIER_() { return getTokens(MySQLStatementParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(MySQLStatementParser.IDENTIFIER_, i);
		}
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public EventNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventName; }
	}

	public final EventNameContext eventName() throws RecognitionException {
		EventNameContext _localctx = new EventNameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_eventName);
		int _la;
		try {
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER_ || _la==STRING_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1467);
				match(AT_);
				{
				setState(1468);
				match(STRING_);
				setState(1469);
				match(IDENTIFIER_);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470);
				identifier_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1471);
				match(STRING_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServerNameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public ServerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverName; }
	}

	public final ServerNameContext serverName() throws RecognitionException {
		ServerNameContext _localctx = new ServerNameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_serverName);
		try {
			setState(1476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case WITHOUT:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MEMORY:
			case NONE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1474);
				identifier_();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1475);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WrapperNameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public WrapperNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrapperName; }
	}

	public final WrapperNameContext wrapperName() throws RecognitionException {
		WrapperNameContext _localctx = new WrapperNameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_wrapperName);
		try {
			setState(1480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case WITHOUT:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MEMORY:
			case NONE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1478);
				identifier_();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1479);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_functionName);
		try {
			setState(1489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1482);
				identifier_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1483);
					owner();
					setState(1484);
					match(DOT_);
					}
					break;
				}
				setState(1488);
				identifier_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ViewNameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public ViewNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewName; }
	}

	public final ViewNameContext viewName() throws RecognitionException {
		ViewNameContext _localctx = new ViewNameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_viewName);
		try {
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1491);
				identifier_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1492);
					owner();
					setState(1493);
					match(DOT_);
					}
					break;
				}
				setState(1497);
				identifier_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OwnerContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public OwnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owner; }
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNamesContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_columnNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1504);
				match(LP_);
				}
			}

			setState(1507);
			columnName();
			setState(1512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1508);
					match(COMMA_);
					setState(1509);
					columnName();
					}
					} 
				}
				setState(1514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1515);
				match(RP_);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1518);
				match(LP_);
				}
			}

			setState(1521);
			tableName();
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1522);
				match(COMMA_);
				setState(1523);
				tableName();
				}
				}
				setState(1528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(1529);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexNameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterSetName_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(MySQLStatementParser.IDENTIFIER_, 0); }
		public CharacterSetName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSetName_; }
	}

	public final CharacterSetName_Context characterSetName_() throws RecognitionException {
		CharacterSetName_Context _localctx = new CharacterSetName_Context(_ctx, getState());
		enterRule(_localctx, 184, RULE_characterSetName_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			match(IDENTIFIER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollationName_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(MySQLStatementParser.IDENTIFIER_, 0); }
		public CollationName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName_; }
	}

	public final CollationName_Context collationName_() throws RecognitionException {
		CollationName_Context _localctx = new CollationName_Context(_ctx, getState());
		enterRule(_localctx, 186, RULE_collationName_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(IDENTIFIER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public NotOperator_Context notOperator_() {
			return getRuleContext(NotOperator_Context.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public BooleanPrimary_Context booleanPrimary_() {
			return getRuleContext(BooleanPrimary_Context.class,0);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public TerminalNode XOR() { return getToken(MySQLStatementParser.XOR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1539);
				notOperator_();
				setState(1540);
				expr(3);
				}
				break;
			case 2:
				{
				setState(1542);
				match(LP_);
				setState(1543);
				expr(0);
				setState(1544);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(1546);
				booleanPrimary_(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1556);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1549);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1550);
						logicalOperator();
						setState(1551);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1553);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1554);
						match(XOR);
						setState(1555);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(1560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(MySQLStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(MySQLStatementParser.OR_, 0); }
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(MySQLStatementParser.AND_, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			_la = _input.LA(1);
			if ( !(_la==AND_ || _la==OR_ || _la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotOperator_Context extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(MySQLStatementParser.NOT_, 0); }
		public NotOperator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator_; }
	}

	public final NotOperator_Context notOperator_() throws RecognitionException {
		NotOperator_Context _localctx = new NotOperator_Context(_ctx, getState());
		enterRule(_localctx, 192, RULE_notOperator_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			_la = _input.LA(1);
			if ( !(_la==NOT_ || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanPrimary_Context extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimary_Context booleanPrimary_() {
			return getRuleContext(BooleanPrimary_Context.class,0);
		}
		public TerminalNode IS() { return getToken(MySQLStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(MySQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(MySQLStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(MySQLStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(MySQLStatementParser.ANY, 0); }
		public BooleanPrimary_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary_; }
	}

	public final BooleanPrimary_Context booleanPrimary_() throws RecognitionException {
		return booleanPrimary_(0);
	}

	private BooleanPrimary_Context booleanPrimary_(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimary_Context _localctx = new BooleanPrimary_Context(_ctx, _parentState);
		BooleanPrimary_Context _prevctx = _localctx;
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_booleanPrimary_, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1566);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(1588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1586);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(1568);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1569);
						match(IS);
						setState(1571);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1570);
							match(NOT);
							}
						}

						setState(1573);
						_la = _input.LA(1);
						if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (NULL - 112)) | (1L << (TRUE - 112)) | (1L << (FALSE - 112)))) != 0) || _la==UNKNOWN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(1574);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1575);
						match(SAFE_EQ_);
						setState(1576);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(1577);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1578);
						comparisonOperator();
						setState(1579);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(1581);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1582);
						comparisonOperator();
						setState(1583);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1584);
						subquery();
						}
						break;
					}
					} 
				}
				setState(1590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(MySQLStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(MySQLStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(MySQLStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(MySQLStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(MySQLStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_) | (1L << NEQ_) | (1L << GT_) | (1L << GTE_) | (1L << LT_) | (1L << LTE_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(MySQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(MySQLStatementParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(MySQLStatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(MySQLStatementParser.ESCAPE, 0); }
		public TerminalNode REGEXP() { return getToken(MySQLStatementParser.REGEXP, 0); }
		public TerminalNode RLIKE() { return getToken(MySQLStatementParser.RLIKE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_predicate);
		int _la;
		try {
			setState(1648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				bitExpr(0);
				setState(1595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1594);
					match(NOT);
					}
				}

				setState(1597);
				match(IN);
				setState(1598);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1600);
				bitExpr(0);
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1601);
					match(NOT);
					}
				}

				setState(1604);
				match(IN);
				setState(1605);
				match(LP_);
				setState(1606);
				expr(0);
				setState(1611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1607);
					match(COMMA_);
					setState(1608);
					expr(0);
					}
					}
					setState(1613);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1614);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1616);
				bitExpr(0);
				setState(1618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1617);
					match(NOT);
					}
				}

				setState(1620);
				match(BETWEEN);
				setState(1621);
				bitExpr(0);
				setState(1622);
				match(AND);
				setState(1623);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1625);
				bitExpr(0);
				setState(1626);
				match(SOUNDS);
				setState(1627);
				match(LIKE);
				setState(1628);
				bitExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1630);
				bitExpr(0);
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1631);
					match(NOT);
					}
				}

				setState(1634);
				match(LIKE);
				setState(1635);
				simpleExpr(0);
				setState(1638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1636);
					match(ESCAPE);
					setState(1637);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1640);
				bitExpr(0);
				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1641);
					match(NOT);
					}
				}

				setState(1644);
				_la = _input.LA(1);
				if ( !(_la==REGEXP || _la==RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1645);
				bitExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1647);
				bitExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode VERTICAL_BAR_() { return getToken(MySQLStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(MySQLStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(MySQLStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(MySQLStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(MySQLStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(MySQLStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(MySQLStatementParser.SLASH_, 0); }
		public TerminalNode DIV() { return getToken(MySQLStatementParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MySQLStatementParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(MySQLStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(MySQLStatementParser.CARET_, 0); }
		public IntervalExpression_Context intervalExpression_() {
			return getRuleContext(IntervalExpression_Context.class,0);
		}
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1651);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1695);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1653);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1654);
						match(VERTICAL_BAR_);
						setState(1655);
						bitExpr(16);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1656);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1657);
						match(AMPERSAND_);
						setState(1658);
						bitExpr(15);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1659);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1660);
						match(SIGNED_LEFT_SHIFT_);
						setState(1661);
						bitExpr(14);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1662);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1663);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1664);
						bitExpr(13);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1665);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1666);
						match(PLUS_);
						setState(1667);
						bitExpr(12);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1668);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1669);
						match(MINUS_);
						setState(1670);
						bitExpr(11);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1671);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1672);
						match(ASTERISK_);
						setState(1673);
						bitExpr(10);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1674);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1675);
						match(SLASH_);
						setState(1676);
						bitExpr(9);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1677);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1678);
						match(DIV);
						setState(1679);
						bitExpr(8);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1680);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1681);
						match(MOD);
						setState(1682);
						bitExpr(7);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1683);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1684);
						match(MOD_);
						setState(1685);
						bitExpr(6);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1686);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1687);
						match(CARET_);
						setState(1688);
						bitExpr(5);
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1689);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1690);
						match(PLUS_);
						setState(1691);
						intervalExpression_();
						}
						break;
					case 14:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1692);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1693);
						match(MINUS_);
						setState(1694);
						intervalExpression_();
						}
						break;
					}
					} 
				}
				setState(1699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public Variable_Context variable_() {
			return getRuleContext(Variable_Context.class,0);
		}
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode PLUS_() { return getToken(MySQLStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(MySQLStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(MySQLStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(MySQLStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(MySQLStatementParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(MySQLStatementParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(MySQLStatementParser.LBE_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode RBE_() { return getToken(MySQLStatementParser.RBE_, 0); }
		public MatchExpression_Context matchExpression_() {
			return getRuleContext(MatchExpression_Context.class,0);
		}
		public CaseExpression_Context caseExpression_() {
			return getRuleContext(CaseExpression_Context.class,0);
		}
		public IntervalExpression_Context intervalExpression_() {
			return getRuleContext(IntervalExpression_Context.class,0);
		}
		public TerminalNode OR_() { return getToken(MySQLStatementParser.OR_, 0); }
		public TerminalNode COLLATE() { return getToken(MySQLStatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1701);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1702);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(1703);
				literals();
				}
				break;
			case 4:
				{
				setState(1704);
				columnName();
				}
				break;
			case 5:
				{
				setState(1705);
				variable_();
				}
				break;
			case 6:
				{
				setState(1706);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_))) != 0) || _la==BINARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1707);
				simpleExpr(7);
				}
				break;
			case 7:
				{
				setState(1709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1708);
					match(ROW);
					}
				}

				setState(1711);
				match(LP_);
				setState(1712);
				expr(0);
				setState(1717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1713);
					match(COMMA_);
					setState(1714);
					expr(0);
					}
					}
					setState(1719);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1720);
				match(RP_);
				}
				break;
			case 8:
				{
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(1722);
					match(EXISTS);
					}
				}

				setState(1725);
				subquery();
				}
				break;
			case 9:
				{
				setState(1726);
				match(LBE_);
				setState(1727);
				identifier_();
				setState(1728);
				expr(0);
				setState(1729);
				match(RBE_);
				}
				break;
			case 10:
				{
				setState(1731);
				matchExpression_();
				}
				break;
			case 11:
				{
				setState(1732);
				caseExpression_();
				}
				break;
			case 12:
				{
				setState(1733);
				intervalExpression_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1745);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1736);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1737);
						match(OR_);
						setState(1738);
						simpleExpr(9);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1739);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1740);
						match(COLLATE);
						setState(1743);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STRING_:
							{
							setState(1741);
							match(STRING_);
							}
							break;
						case TRUNCATE:
						case POSITION:
						case VIEW:
						case ANY:
						case OFFSET:
						case BEGIN:
						case COMMIT:
						case ROLLBACK:
						case SAVEPOINT:
						case BOOLEAN:
						case DATE:
						case TIME:
						case TIMESTAMP:
						case YEAR:
						case QUARTER:
						case MONTH:
						case WEEK:
						case DAY:
						case HOUR:
						case MINUTE:
						case SECOND:
						case MICROSECOND:
						case MAX:
						case MIN:
						case SUM:
						case COUNT:
						case AVG:
						case CURRENT:
						case ENABLE:
						case DISABLE:
						case INSTANCE:
						case DO:
						case DEFINER:
						case CASCADED:
						case LOCAL:
						case CLOSE:
						case OPEN:
						case NEXT:
						case NAME:
						case TABLES:
						case TABLESPACE:
						case COLUMNS:
						case FIELDS:
						case INDEXES:
						case STATUS:
						case MODIFY:
						case VALUE:
						case DUPLICATE:
						case FIRST:
						case LAST:
						case AFTER:
						case OJ:
						case ACCOUNT:
						case USER:
						case ROLE:
						case START:
						case TRANSACTION:
						case WITHOUT:
						case ESCAPE:
						case SUBPARTITION:
						case STORAGE:
						case SUPER:
						case TEMPORARY:
						case THAN:
						case UNBOUNDED:
						case UPGRADE:
						case VALIDATION:
						case ROLLUP:
						case SOUNDS:
						case UNKNOWN:
						case OFF:
						case ALWAYS:
						case COMMITTED:
						case LEVEL:
						case NO:
						case PASSWORD:
						case PRIVILEGES:
						case ACTION:
						case ALGORITHM:
						case AUTOCOMMIT:
						case BTREE:
						case CHAIN:
						case CHARSET:
						case CHECKSUM:
						case CIPHER:
						case CLIENT:
						case COALESCE:
						case COMMENT:
						case COMPACT:
						case COMPRESSED:
						case COMPRESSION:
						case CONNECTION:
						case CONSISTENT:
						case DATA:
						case DISCARD:
						case DISK:
						case ENCRYPTION:
						case END:
						case ENGINE:
						case EVENT:
						case EXCHANGE:
						case EXECUTE:
						case FILE:
						case FIXED:
						case FOLLOWING:
						case GLOBAL:
						case HASH:
						case IMPORT_:
						case LESS:
						case MEMORY:
						case NONE:
						case PARSER:
						case PARTIAL:
						case PARTITIONING:
						case PERSIST:
						case PRECEDING:
						case PROCESS:
						case PROXY:
						case QUICK:
						case REBUILD:
						case REDUNDANT:
						case RELOAD:
						case REMOVE:
						case REORGANIZE:
						case REPAIR:
						case REVERSE:
						case SESSION:
						case SHUTDOWN:
						case SIMPLE:
						case SLAVE:
						case VISIBLE:
						case INVISIBLE:
						case ENFORCED:
						case AGAINST:
						case LANGUAGE:
						case MODE:
						case QUERY:
						case EXTENDED:
						case EXPANSION:
						case VARIANCE:
						case MAX_ROWS:
						case MIN_ROWS:
						case SQL_BIG_RESULT:
						case SQL_BUFFER_RESULT:
						case SQL_CACHE:
						case SQL_NO_CACHE:
						case STATS_AUTO_RECALC:
						case STATS_PERSISTENT:
						case STATS_SAMPLE_PAGES:
						case ROW_FORMAT:
						case WEIGHT_STRING:
						case COLUMN_FORMAT:
						case INSERT_METHOD:
						case KEY_BLOCK_SIZE:
						case PACK_KEYS:
						case PERSIST_ONLY:
						case BIT_AND:
						case BIT_OR:
						case BIT_XOR:
						case GROUP_CONCAT:
						case JSON_ARRAYAGG:
						case JSON_OBJECTAGG:
						case STD:
						case STDDEV:
						case STDDEV_POP:
						case STDDEV_SAMP:
						case VAR_POP:
						case VAR_SAMP:
						case AUTO_INCREMENT:
						case AVG_ROW_LENGTH:
						case DELAY_KEY_WRITE:
						case ROTATE:
						case MASTER:
						case BINLOG:
						case ERROR:
						case SCHEDULE:
						case COMPLETION:
						case EVERY:
						case HOST:
						case SOCKET:
						case PORT:
						case SERVER:
						case WRAPPER:
						case OPTIONS:
						case OWNER:
						case RETURNS:
						case CONTAINS:
						case SECURITY:
						case INVOKER:
						case TEMPTABLE:
						case MERGE:
						case UNDEFINED:
						case DATAFILE:
						case FILE_BLOCK_SIZE:
						case EXTENT_SIZE:
						case INITIAL_SIZE:
						case AUTOEXTEND_SIZE:
						case MAX_SIZE:
						case NODEGROUP:
						case WAIT:
						case LOGFILE:
						case UNDOFILE:
						case UNDO_BUFFER_SIZE:
						case REDO_BUFFER_SIZE:
						case HANDLER:
						case PREV:
						case ORGANIZATION:
						case DEFINITION:
						case DESCRIPTION:
						case REFERENCE:
						case FOLLOWS:
						case PRECEDES:
						case IMPORT:
						case CONCURRENT:
						case XML:
						case DUMPFILE:
						case SHARE:
						case IDENTIFIER_:
							{
							setState(1742);
							identifier_();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public SpecialFunction_Context specialFunction_() {
			return getRuleContext(SpecialFunction_Context.class,0);
		}
		public RegularFunction_Context regularFunction_() {
			return getRuleContext(RegularFunction_Context.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_functionCall);
		try {
			setState(1753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1750);
				aggregationFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1751);
				specialFunction_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1752);
				regularFunction_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationFunctionContext extends ParserRuleContext {
		public AggregationFunctionName_Context aggregationFunctionName_() {
			return getRuleContext(AggregationFunctionName_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public OverClause_Context overClause_() {
			return getRuleContext(OverClause_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			aggregationFunctionName_();
			setState(1756);
			match(LP_);
			setState(1758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1757);
				distinct();
				}
			}

			setState(1769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case CASE:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case REPLACE:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case ROW:
			case WITHOUT:
			case BINARY:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case SUBSTR:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MATCH:
			case MEMORY:
			case NONE:
			case NOW:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case CURRENT_TIMESTAMP:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1760);
				expr(0);
				setState(1765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1761);
					match(COMMA_);
					setState(1762);
					expr(0);
					}
					}
					setState(1767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1768);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1771);
			match(RP_);
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1772);
				overClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationFunctionName_Context extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(MySQLStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(MySQLStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(MySQLStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(MySQLStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(MySQLStatementParser.AVG, 0); }
		public TerminalNode BIT_AND() { return getToken(MySQLStatementParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(MySQLStatementParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(MySQLStatementParser.BIT_XOR, 0); }
		public TerminalNode JSON_ARRAYAGG() { return getToken(MySQLStatementParser.JSON_ARRAYAGG, 0); }
		public TerminalNode JSON_OBJECTAGG() { return getToken(MySQLStatementParser.JSON_OBJECTAGG, 0); }
		public TerminalNode STD() { return getToken(MySQLStatementParser.STD, 0); }
		public TerminalNode STDDEV() { return getToken(MySQLStatementParser.STDDEV, 0); }
		public TerminalNode STDDEV_POP() { return getToken(MySQLStatementParser.STDDEV_POP, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(MySQLStatementParser.STDDEV_SAMP, 0); }
		public TerminalNode VAR_POP() { return getToken(MySQLStatementParser.VAR_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(MySQLStatementParser.VAR_SAMP, 0); }
		public TerminalNode VARIANCE() { return getToken(MySQLStatementParser.VARIANCE, 0); }
		public AggregationFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName_; }
	}

	public final AggregationFunctionName_Context aggregationFunctionName_() throws RecognitionException {
		AggregationFunctionName_Context _localctx = new AggregationFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 208, RULE_aggregationFunctionName_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			_la = _input.LA(1);
			if ( !(((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (MAX - 153)) | (1L << (MIN - 153)) | (1L << (SUM - 153)) | (1L << (COUNT - 153)) | (1L << (AVG - 153)))) != 0) || ((((_la - 349)) & ~0x3f) == 0 && ((1L << (_la - 349)) & ((1L << (VARIANCE - 349)) | (1L << (BIT_AND - 349)) | (1L << (BIT_OR - 349)) | (1L << (BIT_XOR - 349)) | (1L << (JSON_ARRAYAGG - 349)) | (1L << (JSON_OBJECTAGG - 349)) | (1L << (STD - 349)) | (1L << (STDDEV - 349)) | (1L << (STDDEV_POP - 349)) | (1L << (STDDEV_SAMP - 349)) | (1L << (VAR_POP - 349)) | (1L << (VAR_SAMP - 349)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(MySQLStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			match(DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverClause_Context extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(MySQLStatementParser.OVER, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public WindowSpecification_Context windowSpecification_() {
			return getRuleContext(WindowSpecification_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public OverClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClause_; }
	}

	public final OverClause_Context overClause_() throws RecognitionException {
		OverClause_Context _localctx = new OverClause_Context(_ctx, getState());
		enterRule(_localctx, 212, RULE_overClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			match(OVER);
			setState(1785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1780);
				match(LP_);
				setState(1781);
				windowSpecification_();
				setState(1782);
				match(RP_);
				}
				break;
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case WITHOUT:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MEMORY:
			case NONE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
				{
				setState(1784);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecification_Context extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public PartitionClause_Context partitionClause_() {
			return getRuleContext(PartitionClause_Context.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public FrameClause_Context frameClause_() {
			return getRuleContext(FrameClause_Context.class,0);
		}
		public WindowSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpecification_; }
	}

	public final WindowSpecification_Context windowSpecification_() throws RecognitionException {
		WindowSpecification_Context _localctx = new WindowSpecification_Context(_ctx, getState());
		enterRule(_localctx, 214, RULE_windowSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0)) {
				{
				setState(1787);
				identifier_();
				}
			}

			setState(1791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1790);
				partitionClause_();
				}
			}

			setState(1794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1793);
				orderByClause();
				}
			}

			setState(1797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROWS || _la==RANGE) {
				{
				setState(1796);
				frameClause_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionClause_Context extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause_; }
	}

	public final PartitionClause_Context partitionClause_() throws RecognitionException {
		PartitionClause_Context _localctx = new PartitionClause_Context(_ctx, getState());
		enterRule(_localctx, 216, RULE_partitionClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			match(PARTITION);
			setState(1800);
			match(BY);
			setState(1801);
			expr(0);
			setState(1806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1802);
				match(COMMA_);
				setState(1803);
				expr(0);
				}
				}
				setState(1808);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameClause_Context extends ParserRuleContext {
		public TerminalNode ROWS() { return getToken(MySQLStatementParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(MySQLStatementParser.RANGE, 0); }
		public FrameStart_Context frameStart_() {
			return getRuleContext(FrameStart_Context.class,0);
		}
		public FrameBetween_Context frameBetween_() {
			return getRuleContext(FrameBetween_Context.class,0);
		}
		public FrameClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameClause_; }
	}

	public final FrameClause_Context frameClause_() throws RecognitionException {
		FrameClause_Context _localctx = new FrameClause_Context(_ctx, getState());
		enterRule(_localctx, 218, RULE_frameClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==RANGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case CASE:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case REPLACE:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case ROW:
			case WITHOUT:
			case BINARY:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case SUBSTR:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MATCH:
			case MEMORY:
			case NONE:
			case NOW:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case CURRENT_TIMESTAMP:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1810);
				frameStart_();
				}
				break;
			case BETWEEN:
				{
				setState(1811);
				frameBetween_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameStart_Context extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(MySQLStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(MySQLStatementParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(MySQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(MySQLStatementParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(MySQLStatementParser.FOLLOWING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FrameStart_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameStart_; }
	}

	public final FrameStart_Context frameStart_() throws RecognitionException {
		FrameStart_Context _localctx = new FrameStart_Context(_ctx, getState());
		enterRule(_localctx, 220, RULE_frameStart_);
		try {
			setState(1826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1814);
				match(CURRENT);
				setState(1815);
				match(ROW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1816);
				match(UNBOUNDED);
				setState(1817);
				match(PRECEDING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1818);
				match(UNBOUNDED);
				setState(1819);
				match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1820);
				expr(0);
				setState(1821);
				match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1823);
				expr(0);
				setState(1824);
				match(FOLLOWING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameEnd_Context extends ParserRuleContext {
		public FrameStart_Context frameStart_() {
			return getRuleContext(FrameStart_Context.class,0);
		}
		public FrameEnd_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameEnd_; }
	}

	public final FrameEnd_Context frameEnd_() throws RecognitionException {
		FrameEnd_Context _localctx = new FrameEnd_Context(_ctx, getState());
		enterRule(_localctx, 222, RULE_frameEnd_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			frameStart_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBetween_Context extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(MySQLStatementParser.BETWEEN, 0); }
		public FrameStart_Context frameStart_() {
			return getRuleContext(FrameStart_Context.class,0);
		}
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public FrameEnd_Context frameEnd_() {
			return getRuleContext(FrameEnd_Context.class,0);
		}
		public FrameBetween_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBetween_; }
	}

	public final FrameBetween_Context frameBetween_() throws RecognitionException {
		FrameBetween_Context _localctx = new FrameBetween_Context(_ctx, getState());
		enterRule(_localctx, 224, RULE_frameBetween_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			match(BETWEEN);
			setState(1831);
			frameStart_();
			setState(1832);
			match(AND);
			setState(1833);
			frameEnd_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialFunction_Context extends ParserRuleContext {
		public GroupConcatFunction_Context groupConcatFunction_() {
			return getRuleContext(GroupConcatFunction_Context.class,0);
		}
		public WindowFunction_Context windowFunction_() {
			return getRuleContext(WindowFunction_Context.class,0);
		}
		public CastFunction_Context castFunction_() {
			return getRuleContext(CastFunction_Context.class,0);
		}
		public ConvertFunction_Context convertFunction_() {
			return getRuleContext(ConvertFunction_Context.class,0);
		}
		public PositionFunction_Context positionFunction_() {
			return getRuleContext(PositionFunction_Context.class,0);
		}
		public SubstringFunction_Context substringFunction_() {
			return getRuleContext(SubstringFunction_Context.class,0);
		}
		public ExtractFunction_Context extractFunction_() {
			return getRuleContext(ExtractFunction_Context.class,0);
		}
		public CharFunction_Context charFunction_() {
			return getRuleContext(CharFunction_Context.class,0);
		}
		public TrimFunction_Context trimFunction_() {
			return getRuleContext(TrimFunction_Context.class,0);
		}
		public WeightStringFunction_Context weightStringFunction_() {
			return getRuleContext(WeightStringFunction_Context.class,0);
		}
		public SpecialFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction_; }
	}

	public final SpecialFunction_Context specialFunction_() throws RecognitionException {
		SpecialFunction_Context _localctx = new SpecialFunction_Context(_ctx, getState());
		enterRule(_localctx, 226, RULE_specialFunction_);
		try {
			setState(1845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1835);
				groupConcatFunction_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1836);
				windowFunction_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1837);
				castFunction_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1838);
				convertFunction_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1839);
				positionFunction_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1840);
				substringFunction_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1841);
				extractFunction_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1842);
				charFunction_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1843);
				trimFunction_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1844);
				weightStringFunction_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupConcatFunction_Context extends ParserRuleContext {
		public TerminalNode GROUP_CONCAT() { return getToken(MySQLStatementParser.GROUP_CONCAT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(MySQLStatementParser.SEPARATOR, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public GroupConcatFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupConcatFunction_; }
	}

	public final GroupConcatFunction_Context groupConcatFunction_() throws RecognitionException {
		GroupConcatFunction_Context _localctx = new GroupConcatFunction_Context(_ctx, getState());
		enterRule(_localctx, 228, RULE_groupConcatFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			match(GROUP_CONCAT);
			setState(1848);
			match(LP_);
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1849);
				distinct();
				}
			}

			setState(1861);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case CASE:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case REPLACE:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case ROW:
			case WITHOUT:
			case BINARY:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case SUBSTR:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MATCH:
			case MEMORY:
			case NONE:
			case NOW:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case CURRENT_TIMESTAMP:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1852);
				expr(0);
				setState(1857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1853);
					match(COMMA_);
					setState(1854);
					expr(0);
					}
					}
					setState(1859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1860);
				match(ASTERISK_);
				}
				break;
			case RP_:
			case ORDER:
			case SEPARATOR:
				break;
			default:
				break;
			}
			setState(1864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1863);
				orderByClause();
				}
			}

			setState(1868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR) {
				{
				setState(1866);
				match(SEPARATOR);
				setState(1867);
				expr(0);
				}
			}

			setState(1870);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFunction_Context extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public OverClause_Context overClause_() {
			return getRuleContext(OverClause_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public WindowFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction_; }
	}

	public final WindowFunction_Context windowFunction_() throws RecognitionException {
		WindowFunction_Context _localctx = new WindowFunction_Context(_ctx, getState());
		enterRule(_localctx, 230, RULE_windowFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			identifier_();
			setState(1873);
			match(LP_);
			setState(1874);
			expr(0);
			setState(1879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1875);
				match(COMMA_);
				setState(1876);
				expr(0);
				}
				}
				setState(1881);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1882);
			match(RP_);
			setState(1883);
			overClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastFunction_Context extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(MySQLStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public CastFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction_; }
	}

	public final CastFunction_Context castFunction_() throws RecognitionException {
		CastFunction_Context _localctx = new CastFunction_Context(_ctx, getState());
		enterRule(_localctx, 232, RULE_castFunction_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			match(CAST);
			setState(1886);
			match(LP_);
			setState(1887);
			expr(0);
			setState(1888);
			match(AS);
			setState(1889);
			dataType();
			setState(1890);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConvertFunction_Context extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(MySQLStatementParser.CONVERT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public ConvertFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertFunction_; }
	}

	public final ConvertFunction_Context convertFunction_() throws RecognitionException {
		ConvertFunction_Context _localctx = new ConvertFunction_Context(_ctx, getState());
		enterRule(_localctx, 234, RULE_convertFunction_);
		try {
			setState(1906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1892);
				match(CONVERT);
				setState(1893);
				match(LP_);
				setState(1894);
				expr(0);
				setState(1895);
				match(COMMA_);
				setState(1896);
				dataType();
				setState(1897);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1899);
				match(CONVERT);
				setState(1900);
				match(LP_);
				setState(1901);
				expr(0);
				setState(1902);
				match(USING);
				setState(1903);
				identifier_();
				setState(1904);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionFunction_Context extends ParserRuleContext {
		public TerminalNode POSITION() { return getToken(MySQLStatementParser.POSITION, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public PositionFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionFunction_; }
	}

	public final PositionFunction_Context positionFunction_() throws RecognitionException {
		PositionFunction_Context _localctx = new PositionFunction_Context(_ctx, getState());
		enterRule(_localctx, 236, RULE_positionFunction_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			match(POSITION);
			setState(1909);
			match(LP_);
			setState(1910);
			expr(0);
			setState(1911);
			match(IN);
			setState(1912);
			expr(0);
			setState(1913);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubstringFunction_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(MySQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(MySQLStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode SUBSTRING() { return getToken(MySQLStatementParser.SUBSTRING, 0); }
		public TerminalNode SUBSTR() { return getToken(MySQLStatementParser.SUBSTR, 0); }
		public TerminalNode FOR() { return getToken(MySQLStatementParser.FOR, 0); }
		public SubstringFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substringFunction_; }
	}

	public final SubstringFunction_Context substringFunction_() throws RecognitionException {
		SubstringFunction_Context _localctx = new SubstringFunction_Context(_ctx, getState());
		enterRule(_localctx, 238, RULE_substringFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			_la = _input.LA(1);
			if ( !(_la==SUBSTRING || _la==SUBSTR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1916);
			match(LP_);
			setState(1917);
			expr(0);
			setState(1918);
			match(FROM);
			setState(1919);
			match(NUMBER_);
			setState(1922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1920);
				match(FOR);
				setState(1921);
				match(NUMBER_);
				}
			}

			setState(1924);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractFunction_Context extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(MySQLStatementParser.EXTRACT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public ExtractFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractFunction_; }
	}

	public final ExtractFunction_Context extractFunction_() throws RecognitionException {
		ExtractFunction_Context _localctx = new ExtractFunction_Context(_ctx, getState());
		enterRule(_localctx, 240, RULE_extractFunction_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
			match(EXTRACT);
			setState(1927);
			match(LP_);
			setState(1928);
			identifier_();
			setState(1929);
			match(FROM);
			setState(1930);
			expr(0);
			setState(1931);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharFunction_Context extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(MySQLStatementParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public CharFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction_; }
	}

	public final CharFunction_Context charFunction_() throws RecognitionException {
		CharFunction_Context _localctx = new CharFunction_Context(_ctx, getState());
		enterRule(_localctx, 242, RULE_charFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			match(CHAR);
			setState(1934);
			match(LP_);
			setState(1935);
			expr(0);
			setState(1940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1936);
				match(COMMA_);
				setState(1937);
				expr(0);
				}
				}
				setState(1942);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1943);
				match(USING);
				setState(1944);
				ignoredIdentifier_();
				}
			}

			setState(1947);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrimFunction_Context extends ParserRuleContext {
		public TerminalNode TRIM() { return getToken(MySQLStatementParser.TRIM, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode LEADING() { return getToken(MySQLStatementParser.LEADING, 0); }
		public TerminalNode BOTH() { return getToken(MySQLStatementParser.BOTH, 0); }
		public TerminalNode TRAILING() { return getToken(MySQLStatementParser.TRAILING, 0); }
		public TrimFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trimFunction_; }
	}

	public final TrimFunction_Context trimFunction_() throws RecognitionException {
		TrimFunction_Context _localctx = new TrimFunction_Context(_ctx, getState());
		enterRule(_localctx, 244, RULE_trimFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			match(TRIM);
			setState(1950);
			match(LP_);
			setState(1951);
			_la = _input.LA(1);
			if ( !(_la==TRAILING || _la==BOTH || _la==LEADING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1952);
			match(STRING_);
			setState(1953);
			match(FROM);
			setState(1954);
			match(STRING_);
			setState(1955);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeightStringFunction_Context extends ParserRuleContext {
		public TerminalNode WEIGHT_STRING() { return getToken(MySQLStatementParser.WEIGHT_STRING, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public LevelClause_Context levelClause_() {
			return getRuleContext(LevelClause_Context.class,0);
		}
		public WeightStringFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weightStringFunction_; }
	}

	public final WeightStringFunction_Context weightStringFunction_() throws RecognitionException {
		WeightStringFunction_Context _localctx = new WeightStringFunction_Context(_ctx, getState());
		enterRule(_localctx, 246, RULE_weightStringFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			match(WEIGHT_STRING);
			setState(1958);
			match(LP_);
			setState(1959);
			expr(0);
			setState(1962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1960);
				match(AS);
				setState(1961);
				dataType();
				}
			}

			setState(1965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEVEL) {
				{
				setState(1964);
				levelClause_();
				}
			}

			setState(1967);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelClause_Context extends ParserRuleContext {
		public TerminalNode LEVEL() { return getToken(MySQLStatementParser.LEVEL, 0); }
		public List<LevelInWeightListElement_Context> levelInWeightListElement_() {
			return getRuleContexts(LevelInWeightListElement_Context.class);
		}
		public LevelInWeightListElement_Context levelInWeightListElement_(int i) {
			return getRuleContext(LevelInWeightListElement_Context.class,i);
		}
		public List<TerminalNode> NUMBER_() { return getTokens(MySQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(MySQLStatementParser.NUMBER_, i);
		}
		public TerminalNode MINUS_() { return getToken(MySQLStatementParser.MINUS_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public LevelClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelClause_; }
	}

	public final LevelClause_Context levelClause_() throws RecognitionException {
		LevelClause_Context _localctx = new LevelClause_Context(_ctx, getState());
		enterRule(_localctx, 248, RULE_levelClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			match(LEVEL);
			setState(1981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1970);
				levelInWeightListElement_();
				setState(1975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1971);
					match(COMMA_);
					setState(1972);
					levelInWeightListElement_();
					}
					}
					setState(1977);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1978);
				match(NUMBER_);
				setState(1979);
				match(MINUS_);
				setState(1980);
				match(NUMBER_);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelInWeightListElement_Context extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode REVERSE() { return getToken(MySQLStatementParser.REVERSE, 0); }
		public TerminalNode ASC() { return getToken(MySQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLStatementParser.DESC, 0); }
		public LevelInWeightListElement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelInWeightListElement_; }
	}

	public final LevelInWeightListElement_Context levelInWeightListElement_() throws RecognitionException {
		LevelInWeightListElement_Context _localctx = new LevelInWeightListElement_Context(_ctx, getState());
		enterRule(_localctx, 250, RULE_levelInWeightListElement_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			match(NUMBER_);
			setState(1985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1984);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REVERSE) {
				{
				setState(1987);
				match(REVERSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularFunction_Context extends ParserRuleContext {
		public RegularFunctionName_Context regularFunctionName_() {
			return getRuleContext(RegularFunctionName_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public RegularFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction_; }
	}

	public final RegularFunction_Context regularFunction_() throws RecognitionException {
		RegularFunction_Context _localctx = new RegularFunction_Context(_ctx, getState());
		enterRule(_localctx, 252, RULE_regularFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			regularFunctionName_();
			setState(1991);
			match(LP_);
			setState(2001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case CASE:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case REPLACE:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case ROW:
			case WITHOUT:
			case BINARY:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case SUBSTR:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MATCH:
			case MEMORY:
			case NONE:
			case NOW:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case CURRENT_TIMESTAMP:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1992);
				expr(0);
				setState(1997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1993);
					match(COMMA_);
					setState(1994);
					expr(0);
					}
					}
					setState(1999);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(2000);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(2003);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularFunctionName_Context extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(MySQLStatementParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(MySQLStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(MySQLStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode NOW() { return getToken(MySQLStatementParser.NOW, 0); }
		public TerminalNode REPLACE() { return getToken(MySQLStatementParser.REPLACE, 0); }
		public TerminalNode INTERVAL() { return getToken(MySQLStatementParser.INTERVAL, 0); }
		public TerminalNode SUBSTRING() { return getToken(MySQLStatementParser.SUBSTRING, 0); }
		public RegularFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName_; }
	}

	public final RegularFunctionName_Context regularFunctionName_() throws RecognitionException {
		RegularFunctionName_Context _localctx = new RegularFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 254, RULE_regularFunctionName_);
		try {
			setState(2014);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case WITHOUT:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MEMORY:
			case NONE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(2005);
				identifier_();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(2006);
				match(IF);
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(2007);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case LOCALTIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(2008);
				match(LOCALTIME);
				}
				break;
			case LOCALTIMESTAMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(2009);
				match(LOCALTIMESTAMP);
				}
				break;
			case NOW:
				enterOuterAlt(_localctx, 6);
				{
				setState(2010);
				match(NOW);
				}
				break;
			case REPLACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(2011);
				match(REPLACE);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2012);
				match(INTERVAL);
				}
				break;
			case SUBSTRING:
				enterOuterAlt(_localctx, 9);
				{
				setState(2013);
				match(SUBSTRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchExpression_Context extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(MySQLStatementParser.MATCH, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode AGAINST() { return getToken(MySQLStatementParser.AGAINST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MatchSearchModifier_Context matchSearchModifier_() {
			return getRuleContext(MatchSearchModifier_Context.class,0);
		}
		public MatchExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpression_; }
	}

	public final MatchExpression_Context matchExpression_() throws RecognitionException {
		MatchExpression_Context _localctx = new MatchExpression_Context(_ctx, getState());
		enterRule(_localctx, 256, RULE_matchExpression_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			match(MATCH);
			setState(2017);
			columnNames();
			setState(2018);
			match(AGAINST);
			{
			setState(2019);
			expr(0);
			setState(2021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(2020);
				matchSearchModifier_();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchSearchModifier_Context extends ParserRuleContext {
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public TerminalNode NATURAL() { return getToken(MySQLStatementParser.NATURAL, 0); }
		public TerminalNode LANGUAGE() { return getToken(MySQLStatementParser.LANGUAGE, 0); }
		public TerminalNode MODE() { return getToken(MySQLStatementParser.MODE, 0); }
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode QUERY() { return getToken(MySQLStatementParser.QUERY, 0); }
		public TerminalNode EXPANSION() { return getToken(MySQLStatementParser.EXPANSION, 0); }
		public TerminalNode BOOLEAN() { return getToken(MySQLStatementParser.BOOLEAN, 0); }
		public MatchSearchModifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchSearchModifier_; }
	}

	public final MatchSearchModifier_Context matchSearchModifier_() throws RecognitionException {
		MatchSearchModifier_Context _localctx = new MatchSearchModifier_Context(_ctx, getState());
		enterRule(_localctx, 258, RULE_matchSearchModifier_);
		try {
			setState(2040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2023);
				match(IN);
				setState(2024);
				match(NATURAL);
				setState(2025);
				match(LANGUAGE);
				setState(2026);
				match(MODE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2027);
				match(IN);
				setState(2028);
				match(NATURAL);
				setState(2029);
				match(LANGUAGE);
				setState(2030);
				match(MODE);
				setState(2031);
				match(WITH);
				setState(2032);
				match(QUERY);
				setState(2033);
				match(EXPANSION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2034);
				match(IN);
				setState(2035);
				match(BOOLEAN);
				setState(2036);
				match(MODE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2037);
				match(WITH);
				setState(2038);
				match(QUERY);
				setState(2039);
				match(EXPANSION);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpression_Context extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MySQLStatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(MySQLStatementParser.END, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<CaseWhen_Context> caseWhen_() {
			return getRuleContexts(CaseWhen_Context.class);
		}
		public CaseWhen_Context caseWhen_(int i) {
			return getRuleContext(CaseWhen_Context.class,i);
		}
		public CaseElse_Context caseElse_() {
			return getRuleContext(CaseElse_Context.class,0);
		}
		public CaseExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression_; }
	}

	public final CaseExpression_Context caseExpression_() throws RecognitionException {
		CaseExpression_Context _localctx = new CaseExpression_Context(_ctx, getState());
		enterRule(_localctx, 260, RULE_caseExpression_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			match(CASE);
			setState(2044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_) | (1L << DOT_) | (1L << LP_) | (1L << LBE_) | (1L << QUESTION_) | (1L << AT_) | (1L << TRUNCATE))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (CASE - 74)) | (1L << (CAST - 74)) | (1L << (TRIM - 74)) | (1L << (SUBSTRING - 74)) | (1L << (IF - 74)) | (1L << (NULL - 74)) | (1L << (TRUE - 74)) | (1L << (FALSE - 74)) | (1L << (EXISTS - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)) | (1L << (CHAR - 74)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (INTERVAL - 138)) | (1L << (DATE - 138)) | (1L << (TIME - 138)) | (1L << (TIMESTAMP - 138)) | (1L << (LOCALTIME - 138)) | (1L << (LOCALTIMESTAMP - 138)) | (1L << (YEAR - 138)) | (1L << (QUARTER - 138)) | (1L << (MONTH - 138)) | (1L << (WEEK - 138)) | (1L << (DAY - 138)) | (1L << (HOUR - 138)) | (1L << (MINUTE - 138)) | (1L << (SECOND - 138)) | (1L << (MICROSECOND - 138)) | (1L << (MAX - 138)) | (1L << (MIN - 138)) | (1L << (SUM - 138)) | (1L << (COUNT - 138)) | (1L << (AVG - 138)) | (1L << (CURRENT - 138)) | (1L << (ENABLE - 138)) | (1L << (DISABLE - 138)) | (1L << (INSTANCE - 138)) | (1L << (DO - 138)) | (1L << (DEFINER - 138)) | (1L << (CASCADED - 138)) | (1L << (LOCAL - 138)) | (1L << (CLOSE - 138)) | (1L << (OPEN - 138)) | (1L << (NEXT - 138)) | (1L << (NAME - 138)) | (1L << (TABLES - 138)) | (1L << (TABLESPACE - 138)) | (1L << (COLUMNS - 138)) | (1L << (FIELDS - 138)) | (1L << (INDEXES - 138)) | (1L << (STATUS - 138)) | (1L << (REPLACE - 138)) | (1L << (MODIFY - 138)) | (1L << (VALUE - 138)) | (1L << (DUPLICATE - 138)) | (1L << (FIRST - 138)) | (1L << (LAST - 138)) | (1L << (AFTER - 138)) | (1L << (OJ - 138)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (ROW - 203)) | (1L << (WITHOUT - 203)) | (1L << (BINARY - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (SUBSTR - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (CONVERT - 267)) | (1L << (DATA - 267)) | (1L << (DISCARD - 267)) | (1L << (DISK - 267)) | (1L << (ENCRYPTION - 267)) | (1L << (END - 267)) | (1L << (ENGINE - 267)) | (1L << (EVENT - 267)) | (1L << (EXCHANGE - 267)) | (1L << (EXECUTE - 267)) | (1L << (EXTRACT - 267)) | (1L << (FILE - 267)) | (1L << (FIXED - 267)) | (1L << (FOLLOWING - 267)) | (1L << (GLOBAL - 267)) | (1L << (HASH - 267)) | (1L << (IMPORT_ - 267)) | (1L << (LESS - 267)) | (1L << (MATCH - 267)) | (1L << (MEMORY - 267)) | (1L << (NONE - 267)) | (1L << (NOW - 267)) | (1L << (PARSER - 267)) | (1L << (PARTIAL - 267)) | (1L << (PARTITIONING - 267)) | (1L << (PERSIST - 267)) | (1L << (PRECEDING - 267)) | (1L << (PROCESS - 267)) | (1L << (PROXY - 267)) | (1L << (QUICK - 267)) | (1L << (REBUILD - 267)) | (1L << (REDUNDANT - 267)) | (1L << (RELOAD - 267)) | (1L << (REMOVE - 267)) | (1L << (REORGANIZE - 267)) | (1L << (REPAIR - 267)) | (1L << (REVERSE - 267)))) != 0) || ((((_la - 332)) & ~0x3f) == 0 && ((1L << (_la - 332)) & ((1L << (SESSION - 332)) | (1L << (SHUTDOWN - 332)) | (1L << (SIMPLE - 332)) | (1L << (SLAVE - 332)) | (1L << (VISIBLE - 332)) | (1L << (INVISIBLE - 332)) | (1L << (ENFORCED - 332)) | (1L << (AGAINST - 332)) | (1L << (LANGUAGE - 332)) | (1L << (MODE - 332)) | (1L << (QUERY - 332)) | (1L << (EXTENDED - 332)) | (1L << (EXPANSION - 332)) | (1L << (VARIANCE - 332)) | (1L << (MAX_ROWS - 332)) | (1L << (MIN_ROWS - 332)) | (1L << (SQL_BIG_RESULT - 332)) | (1L << (SQL_BUFFER_RESULT - 332)) | (1L << (SQL_CACHE - 332)) | (1L << (SQL_NO_CACHE - 332)) | (1L << (STATS_AUTO_RECALC - 332)) | (1L << (STATS_PERSISTENT - 332)) | (1L << (STATS_SAMPLE_PAGES - 332)) | (1L << (ROW_FORMAT - 332)) | (1L << (WEIGHT_STRING - 332)) | (1L << (COLUMN_FORMAT - 332)) | (1L << (INSERT_METHOD - 332)) | (1L << (KEY_BLOCK_SIZE - 332)) | (1L << (PACK_KEYS - 332)) | (1L << (PERSIST_ONLY - 332)) | (1L << (BIT_AND - 332)) | (1L << (BIT_OR - 332)) | (1L << (BIT_XOR - 332)) | (1L << (GROUP_CONCAT - 332)) | (1L << (JSON_ARRAYAGG - 332)) | (1L << (JSON_OBJECTAGG - 332)) | (1L << (STD - 332)) | (1L << (STDDEV - 332)) | (1L << (STDDEV_POP - 332)) | (1L << (STDDEV_SAMP - 332)) | (1L << (VAR_POP - 332)) | (1L << (VAR_SAMP - 332)) | (1L << (AUTO_INCREMENT - 332)) | (1L << (AVG_ROW_LENGTH - 332)) | (1L << (DELAY_KEY_WRITE - 332)))) != 0) || ((((_la - 398)) & ~0x3f) == 0 && ((1L << (_la - 398)) & ((1L << (CURRENT_TIMESTAMP - 398)) | (1L << (ROTATE - 398)) | (1L << (MASTER - 398)) | (1L << (BINLOG - 398)) | (1L << (ERROR - 398)) | (1L << (SCHEDULE - 398)) | (1L << (COMPLETION - 398)) | (1L << (EVERY - 398)) | (1L << (HOST - 398)) | (1L << (SOCKET - 398)) | (1L << (PORT - 398)) | (1L << (SERVER - 398)) | (1L << (WRAPPER - 398)) | (1L << (OPTIONS - 398)) | (1L << (OWNER - 398)) | (1L << (RETURNS - 398)) | (1L << (CONTAINS - 398)) | (1L << (SECURITY - 398)) | (1L << (INVOKER - 398)) | (1L << (TEMPTABLE - 398)) | (1L << (MERGE - 398)) | (1L << (UNDEFINED - 398)) | (1L << (DATAFILE - 398)) | (1L << (FILE_BLOCK_SIZE - 398)) | (1L << (EXTENT_SIZE - 398)) | (1L << (INITIAL_SIZE - 398)) | (1L << (AUTOEXTEND_SIZE - 398)) | (1L << (MAX_SIZE - 398)) | (1L << (NODEGROUP - 398)) | (1L << (WAIT - 398)) | (1L << (LOGFILE - 398)) | (1L << (UNDOFILE - 398)) | (1L << (UNDO_BUFFER_SIZE - 398)) | (1L << (REDO_BUFFER_SIZE - 398)) | (1L << (HANDLER - 398)) | (1L << (PREV - 398)) | (1L << (ORGANIZATION - 398)) | (1L << (DEFINITION - 398)) | (1L << (DESCRIPTION - 398)) | (1L << (REFERENCE - 398)) | (1L << (FOLLOWS - 398)) | (1L << (PRECEDES - 398)) | (1L << (IMPORT - 398)) | (1L << (CONCURRENT - 398)))) != 0) || ((((_la - 469)) & ~0x3f) == 0 && ((1L << (_la - 469)) & ((1L << (XML - 469)) | (1L << (DUMPFILE - 469)) | (1L << (SHARE - 469)) | (1L << (IDENTIFIER_ - 469)) | (1L << (STRING_ - 469)) | (1L << (NUMBER_ - 469)) | (1L << (HEX_DIGIT_ - 469)) | (1L << (BIT_NUM_ - 469)))) != 0)) {
				{
				setState(2043);
				simpleExpr(0);
				}
			}

			setState(2047); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2046);
				caseWhen_();
				}
				}
				setState(2049); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(2052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(2051);
				caseElse_();
				}
			}

			setState(2054);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseWhen_Context extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(MySQLStatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(MySQLStatementParser.THEN, 0); }
		public CaseWhen_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen_; }
	}

	public final CaseWhen_Context caseWhen_() throws RecognitionException {
		CaseWhen_Context _localctx = new CaseWhen_Context(_ctx, getState());
		enterRule(_localctx, 262, RULE_caseWhen_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			match(WHEN);
			setState(2057);
			expr(0);
			setState(2058);
			match(THEN);
			setState(2059);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseElse_Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MySQLStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElse_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse_; }
	}

	public final CaseElse_Context caseElse_() throws RecognitionException {
		CaseElse_Context _localctx = new CaseElse_Context(_ctx, getState());
		enterRule(_localctx, 264, RULE_caseElse_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			match(ELSE);
			setState(2062);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalExpression_Context extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(MySQLStatementParser.INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntervalUnit_Context intervalUnit_() {
			return getRuleContext(IntervalUnit_Context.class,0);
		}
		public IntervalExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression_; }
	}

	public final IntervalExpression_Context intervalExpression_() throws RecognitionException {
		IntervalExpression_Context _localctx = new IntervalExpression_Context(_ctx, getState());
		enterRule(_localctx, 266, RULE_intervalExpression_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			match(INTERVAL);
			setState(2065);
			expr(0);
			setState(2066);
			intervalUnit_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalUnit_Context extends ParserRuleContext {
		public TerminalNode MICROSECOND() { return getToken(MySQLStatementParser.MICROSECOND, 0); }
		public TerminalNode SECOND() { return getToken(MySQLStatementParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(MySQLStatementParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(MySQLStatementParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(MySQLStatementParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(MySQLStatementParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(MySQLStatementParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(MySQLStatementParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(MySQLStatementParser.YEAR, 0); }
		public TerminalNode SECOND_MICROSECOND() { return getToken(MySQLStatementParser.SECOND_MICROSECOND, 0); }
		public TerminalNode MINUTE_MICROSECOND() { return getToken(MySQLStatementParser.MINUTE_MICROSECOND, 0); }
		public TerminalNode MINUTE_SECOND() { return getToken(MySQLStatementParser.MINUTE_SECOND, 0); }
		public TerminalNode HOUR_MICROSECOND() { return getToken(MySQLStatementParser.HOUR_MICROSECOND, 0); }
		public TerminalNode HOUR_SECOND() { return getToken(MySQLStatementParser.HOUR_SECOND, 0); }
		public TerminalNode HOUR_MINUTE() { return getToken(MySQLStatementParser.HOUR_MINUTE, 0); }
		public TerminalNode DAY_MICROSECOND() { return getToken(MySQLStatementParser.DAY_MICROSECOND, 0); }
		public TerminalNode DAY_SECOND() { return getToken(MySQLStatementParser.DAY_SECOND, 0); }
		public TerminalNode DAY_MINUTE() { return getToken(MySQLStatementParser.DAY_MINUTE, 0); }
		public TerminalNode DAY_HOUR() { return getToken(MySQLStatementParser.DAY_HOUR, 0); }
		public TerminalNode YEAR_MONTH() { return getToken(MySQLStatementParser.YEAR_MONTH, 0); }
		public IntervalUnit_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalUnit_; }
	}

	public final IntervalUnit_Context intervalUnit_() throws RecognitionException {
		IntervalUnit_Context _localctx = new IntervalUnit_Context(_ctx, getState());
		enterRule(_localctx, 268, RULE_intervalUnit_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2068);
			_la = _input.LA(1);
			if ( !(((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (YEAR - 144)) | (1L << (QUARTER - 144)) | (1L << (MONTH - 144)) | (1L << (WEEK - 144)) | (1L << (DAY - 144)) | (1L << (HOUR - 144)) | (1L << (MINUTE - 144)) | (1L << (SECOND - 144)) | (1L << (MICROSECOND - 144)))) != 0) || ((((_la - 399)) & ~0x3f) == 0 && ((1L << (_la - 399)) & ((1L << (YEAR_MONTH - 399)) | (1L << (DAY_HOUR - 399)) | (1L << (DAY_MINUTE - 399)) | (1L << (DAY_SECOND - 399)) | (1L << (DAY_MICROSECOND - 399)) | (1L << (HOUR_MINUTE - 399)) | (1L << (HOUR_SECOND - 399)) | (1L << (HOUR_MICROSECOND - 399)) | (1L << (MINUTE_SECOND - 399)) | (1L << (MINUTE_MICROSECOND - 399)) | (1L << (SECOND_MICROSECOND - 399)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(MySQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2070);
			match(ORDER);
			setState(2071);
			match(BY);
			setState(2072);
			orderByItem();
			setState(2077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2073);
				match(COMMA_);
				setState(2074);
				orderByItem();
				}
				}
				setState(2079);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MySQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(2080);
				columnName();
				}
				break;
			case 2:
				{
				setState(2081);
				numberLiterals();
				}
				break;
			case 3:
				{
				setState(2082);
				expr(0);
				}
				break;
			}
			setState(2086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2085);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode UNSIGNED() { return getToken(MySQLStatementParser.UNSIGNED, 0); }
		public TerminalNode ZEROFILL() { return getToken(MySQLStatementParser.ZEROFILL, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_dataType);
		int _la;
		try {
			setState(2121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2088);
				dataTypeName_();
				setState(2090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2089);
					dataTypeLength();
					}
				}

				setState(2093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR || _la==CHARACTER) {
					{
					setState(2092);
					characterSet_();
					}
				}

				setState(2096);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2095);
					collateClause_();
					}
					break;
				}
				setState(2099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(2098);
					match(UNSIGNED);
					}
				}

				setState(2102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(2101);
					match(ZEROFILL);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2104);
				dataTypeName_();
				setState(2105);
				match(LP_);
				setState(2106);
				match(STRING_);
				setState(2111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2107);
					match(COMMA_);
					setState(2108);
					match(STRING_);
					}
					}
					setState(2113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2114);
				match(RP_);
				setState(2116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR || _la==CHARACTER) {
					{
					setState(2115);
					characterSet_();
					}
				}

				setState(2119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2118);
					collateClause_();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeName_Context extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public DataTypeName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName_; }
	}

	public final DataTypeName_Context dataTypeName_() throws RecognitionException {
		DataTypeName_Context _localctx = new DataTypeName_Context(_ctx, getState());
		enterRule(_localctx, 276, RULE_dataTypeName_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			identifier_();
			setState(2125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2124);
				identifier_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(MySQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(MySQLStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127);
			match(LP_);
			setState(2128);
			match(NUMBER_);
			setState(2131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(2129);
				match(COMMA_);
				setState(2130);
				match(NUMBER_);
				}
			}

			setState(2133);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterSet_Context extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(MySQLStatementParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(MySQLStatementParser.CHAR, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public CharacterSet_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSet_; }
	}

	public final CharacterSet_Context characterSet_() throws RecognitionException {
		CharacterSet_Context _localctx = new CharacterSet_Context(_ctx, getState());
		enterRule(_localctx, 280, RULE_characterSet_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==CHARACTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2136);
			match(SET);
			setState(2138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(2137);
				match(EQ_);
				}
			}

			setState(2140);
			ignoredIdentifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollateClause_Context extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(MySQLStatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public CollateClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause_; }
	}

	public final CollateClause_Context collateClause_() throws RecognitionException {
		CollateClause_Context _localctx = new CollateClause_Context(_ctx, getState());
		enterRule(_localctx, 282, RULE_collateClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2142);
			match(COLLATE);
			setState(2144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(2143);
				match(EQ_);
				}
			}

			setState(2148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				{
				setState(2146);
				match(STRING_);
				}
				break;
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case WITHOUT:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MEMORY:
			case NONE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
				{
				setState(2147);
				ignoredIdentifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoredIdentifier_Context extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 284, RULE_ignoredIdentifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2150);
			identifier_();
			setState(2153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(2151);
				match(DOT_);
				setState(2152);
				identifier_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoredIdentifiers_Context extends ParserRuleContext {
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 286, RULE_ignoredIdentifiers_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
			ignoredIdentifier_();
			setState(2160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2156);
					match(COMMA_);
					setState(2157);
					ignoredIdentifier_();
					}
					} 
				}
				setState(2162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNotExistClause_Context tableNotExistClause_() {
			return getRuleContext(TableNotExistClause_Context.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateDefinitionClause_Context createDefinitionClause_() {
			return getRuleContext(CreateDefinitionClause_Context.class,0);
		}
		public CreateLikeClause_Context createLikeClause_() {
			return getRuleContext(CreateLikeClause_Context.class,0);
		}
		public CreateTableSpecification_Context createTableSpecification_() {
			return getRuleContext(CreateTableSpecification_Context.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			match(CREATE);
			setState(2165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(2164);
				createTableSpecification_();
				}
			}

			setState(2167);
			match(TABLE);
			setState(2168);
			tableNotExistClause_();
			setState(2169);
			tableName();
			setState(2172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2170);
				createDefinitionClause_();
				}
				break;
			case 2:
				{
				setState(2171);
				createLikeClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public CreateIndexSpecification_Context createIndexSpecification_() {
			return getRuleContext(CreateIndexSpecification_Context.class,0);
		}
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public KeyParts_Context keyParts_() {
			return getRuleContext(KeyParts_Context.class,0);
		}
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public IndexOption_Context indexOption_() {
			return getRuleContext(IndexOption_Context.class,0);
		}
		public List<TerminalNode> ALGORITHM() { return getTokens(MySQLStatementParser.ALGORITHM); }
		public TerminalNode ALGORITHM(int i) {
			return getToken(MySQLStatementParser.ALGORITHM, i);
		}
		public List<TerminalNode> LOCK() { return getTokens(MySQLStatementParser.LOCK); }
		public TerminalNode LOCK(int i) {
			return getToken(MySQLStatementParser.LOCK, i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(MySQLStatementParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(MySQLStatementParser.DEFAULT, i);
		}
		public List<TerminalNode> INPLACE() { return getTokens(MySQLStatementParser.INPLACE); }
		public TerminalNode INPLACE(int i) {
			return getToken(MySQLStatementParser.INPLACE, i);
		}
		public List<TerminalNode> COPY() { return getTokens(MySQLStatementParser.COPY); }
		public TerminalNode COPY(int i) {
			return getToken(MySQLStatementParser.COPY, i);
		}
		public List<TerminalNode> NONE() { return getTokens(MySQLStatementParser.NONE); }
		public TerminalNode NONE(int i) {
			return getToken(MySQLStatementParser.NONE, i);
		}
		public List<TerminalNode> SHARED() { return getTokens(MySQLStatementParser.SHARED); }
		public TerminalNode SHARED(int i) {
			return getToken(MySQLStatementParser.SHARED, i);
		}
		public List<TerminalNode> EXCLUSIVE() { return getTokens(MySQLStatementParser.EXCLUSIVE); }
		public TerminalNode EXCLUSIVE(int i) {
			return getToken(MySQLStatementParser.EXCLUSIVE, i);
		}
		public List<TerminalNode> EQ_() { return getTokens(MySQLStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(MySQLStatementParser.EQ_, i);
		}
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			match(CREATE);
			setState(2175);
			createIndexSpecification_();
			setState(2176);
			match(INDEX);
			setState(2177);
			indexName();
			setState(2179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(2178);
				indexType_();
				}
			}

			setState(2181);
			match(ON);
			setState(2182);
			tableName();
			setState(2183);
			keyParts_();
			setState(2185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH || _la==USING || _la==COMMENT || ((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & ((1L << (VISIBLE - 339)) | (1L << (INVISIBLE - 339)) | (1L << (KEY_BLOCK_SIZE - 339)))) != 0)) {
				{
				setState(2184);
				indexOption_();
				}
			}

			setState(2199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALGORITHM || _la==LOCK) {
				{
				setState(2197);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALGORITHM:
					{
					setState(2187);
					match(ALGORITHM);
					setState(2189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQ_) {
						{
						setState(2188);
						match(EQ_);
						}
					}

					setState(2191);
					_la = _input.LA(1);
					if ( !(_la==DEFAULT || _la==COPY || _la==INPLACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LOCK:
					{
					setState(2192);
					match(LOCK);
					setState(2194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQ_) {
						{
						setState(2193);
						match(EQ_);
						}
					}

					setState(2196);
					_la = _input.LA(1);
					if ( !(_la==DEFAULT || ((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & ((1L << (EXCLUSIVE - 281)) | (1L << (NONE - 281)) | (1L << (SHARED - 281)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterDefinitionClause_Context alterDefinitionClause_() {
			return getRuleContext(AlterDefinitionClause_Context.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_alterTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
			match(ALTER);
			setState(2203);
			match(TABLE);
			setState(2204);
			tableName();
			setState(2206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALTER - 58)) | (1L << (DROP - 58)) | (1L << (TRUNCATE - 58)) | (1L << (ADD - 58)) | (1L << (INDEX - 58)) | (1L << (WITH - 58)) | (1L << (UNION - 58)) | (1L << (ORDER - 58)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (CHAR - 135)) | (1L << (CHARACTER - 135)) | (1L << (DEFAULT - 135)) | (1L << (ENABLE - 135)) | (1L << (DISABLE - 135)) | (1L << (TABLESPACE - 135)) | (1L << (MODIFY - 135)))) != 0) || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (WITHOUT - 210)) | (1L << (UPGRADE - 210)) | (1L << (CHECK - 210)) | (1L << (PASSWORD - 210)) | (1L << (ALGORITHM - 210)) | (1L << (ANALYZE - 210)) | (1L << (CHANGE - 210)) | (1L << (CHECKSUM - 210)) | (1L << (COALESCE - 210)) | (1L << (COLLATE - 210)) | (1L << (COMMENT - 210)) | (1L << (COMPRESSION - 210)) | (1L << (CONNECTION - 210)) | (1L << (CONVERT - 210)) | (1L << (DATA - 210)) | (1L << (DISCARD - 210)))) != 0) || ((((_la - 275)) & ~0x3f) == 0 && ((1L << (_la - 275)) & ((1L << (ENCRYPTION - 275)) | (1L << (ENGINE - 275)) | (1L << (EXCHANGE - 275)) | (1L << (FORCE - 275)) | (1L << (IMPORT_ - 275)) | (1L << (LOCK - 275)) | (1L << (OPTIMIZE - 275)) | (1L << (REBUILD - 275)) | (1L << (REMOVE - 275)) | (1L << (RENAME - 275)) | (1L << (REORGANIZE - 275)) | (1L << (REPAIR - 275)))) != 0) || ((((_la - 350)) & ~0x3f) == 0 && ((1L << (_la - 350)) & ((1L << (MAX_ROWS - 350)) | (1L << (MIN_ROWS - 350)) | (1L << (STATS_AUTO_RECALC - 350)) | (1L << (STATS_PERSISTENT - 350)) | (1L << (STATS_SAMPLE_PAGES - 350)) | (1L << (ROW_FORMAT - 350)) | (1L << (INSERT_METHOD - 350)) | (1L << (KEY_BLOCK_SIZE - 350)) | (1L << (PACK_KEYS - 350)) | (1L << (AUTO_INCREMENT - 350)) | (1L << (AVG_ROW_LENGTH - 350)) | (1L << (DELAY_KEY_WRITE - 350)))) != 0)) {
				{
				setState(2205);
				alterDefinitionClause_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public DropTableSpecification_Context dropTableSpecification_() {
			return getRuleContext(DropTableSpecification_Context.class,0);
		}
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableExistClause_Context tableExistClause_() {
			return getRuleContext(TableExistClause_Context.class,0);
		}
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			match(DROP);
			setState(2209);
			dropTableSpecification_();
			setState(2210);
			match(TABLE);
			setState(2211);
			tableExistClause_();
			setState(2212);
			tableNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public DropIndexSpecification_Context dropIndexSpecification_() {
			return getRuleContext(DropIndexSpecification_Context.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> ALGORITHM() { return getTokens(MySQLStatementParser.ALGORITHM); }
		public TerminalNode ALGORITHM(int i) {
			return getToken(MySQLStatementParser.ALGORITHM, i);
		}
		public List<TerminalNode> LOCK() { return getTokens(MySQLStatementParser.LOCK); }
		public TerminalNode LOCK(int i) {
			return getToken(MySQLStatementParser.LOCK, i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(MySQLStatementParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(MySQLStatementParser.DEFAULT, i);
		}
		public List<TerminalNode> INPLACE() { return getTokens(MySQLStatementParser.INPLACE); }
		public TerminalNode INPLACE(int i) {
			return getToken(MySQLStatementParser.INPLACE, i);
		}
		public List<TerminalNode> COPY() { return getTokens(MySQLStatementParser.COPY); }
		public TerminalNode COPY(int i) {
			return getToken(MySQLStatementParser.COPY, i);
		}
		public List<TerminalNode> NONE() { return getTokens(MySQLStatementParser.NONE); }
		public TerminalNode NONE(int i) {
			return getToken(MySQLStatementParser.NONE, i);
		}
		public List<TerminalNode> SHARED() { return getTokens(MySQLStatementParser.SHARED); }
		public TerminalNode SHARED(int i) {
			return getToken(MySQLStatementParser.SHARED, i);
		}
		public List<TerminalNode> EXCLUSIVE() { return getTokens(MySQLStatementParser.EXCLUSIVE); }
		public TerminalNode EXCLUSIVE(int i) {
			return getToken(MySQLStatementParser.EXCLUSIVE, i);
		}
		public List<TerminalNode> EQ_() { return getTokens(MySQLStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(MySQLStatementParser.EQ_, i);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2214);
			match(DROP);
			setState(2215);
			match(INDEX);
			setState(2217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFLINE || _la==ONLINE) {
				{
				setState(2216);
				dropIndexSpecification_();
				}
			}

			setState(2219);
			indexName();
			setState(2222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2220);
				match(ON);
				setState(2221);
				tableName();
				}
			}

			setState(2236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALGORITHM || _la==LOCK) {
				{
				setState(2234);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALGORITHM:
					{
					setState(2224);
					match(ALGORITHM);
					setState(2226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQ_) {
						{
						setState(2225);
						match(EQ_);
						}
					}

					setState(2228);
					_la = _input.LA(1);
					if ( !(_la==DEFAULT || _la==COPY || _la==INPLACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LOCK:
					{
					setState(2229);
					match(LOCK);
					setState(2231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQ_) {
						{
						setState(2230);
						match(EQ_);
						}
					}

					setState(2233);
					_la = _input.LA(1);
					if ( !(_la==DEFAULT || ((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & ((1L << (EXCLUSIVE - 281)) | (1L << (NONE - 281)) | (1L << (SHARED - 281)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(MySQLStatementParser.TRUNCATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_truncateTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			match(TRUNCATE);
			setState(2241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(2240);
				match(TABLE);
				}
			}

			setState(2243);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDatabaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(MySQLStatementParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(MySQLStatementParser.SCHEMA, 0); }
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public List<CreateDatabaseSpecification_Context> createDatabaseSpecification_() {
			return getRuleContexts(CreateDatabaseSpecification_Context.class);
		}
		public CreateDatabaseSpecification_Context createDatabaseSpecification_(int i) {
			return getRuleContext(CreateDatabaseSpecification_Context.class,i);
		}
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_createDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2245);
			match(CREATE);
			setState(2246);
			_la = _input.LA(1);
			if ( !(_la==SCHEMA || _la==DATABASE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2247);
				match(IF);
				setState(2248);
				match(NOT);
				setState(2249);
				match(EXISTS);
				}
			}

			setState(2252);
			schemaName();
			setState(2256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTER || _la==DEFAULT || _la==CHARSET || _la==COLLATE) {
				{
				{
				setState(2253);
				createDatabaseSpecification_();
				}
				}
				setState(2258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterDatabaseContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(MySQLStatementParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(MySQLStatementParser.SCHEMA, 0); }
		public List<CreateDatabaseSpecification_Context> createDatabaseSpecification_() {
			return getRuleContexts(CreateDatabaseSpecification_Context.class);
		}
		public CreateDatabaseSpecification_Context createDatabaseSpecification_(int i) {
			return getRuleContext(CreateDatabaseSpecification_Context.class,i);
		}
		public AlterDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabase; }
	}

	public final AlterDatabaseContext alterDatabase() throws RecognitionException {
		AlterDatabaseContext _localctx = new AlterDatabaseContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_alterDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2259);
			match(ALTER);
			setState(2260);
			_la = _input.LA(1);
			if ( !(_la==SCHEMA || _la==DATABASE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2261);
			schemaName();
			setState(2265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTER || _la==DEFAULT || _la==CHARSET || _la==COLLATE) {
				{
				{
				setState(2262);
				createDatabaseSpecification_();
				}
				}
				setState(2267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropDatabseContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(MySQLStatementParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(MySQLStatementParser.SCHEMA, 0); }
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public DropDatabseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabse; }
	}

	public final DropDatabseContext dropDatabse() throws RecognitionException {
		DropDatabseContext _localctx = new DropDatabseContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_dropDatabse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2268);
			match(DROP);
			setState(2269);
			_la = _input.LA(1);
			if ( !(_la==SCHEMA || _la==DATABASE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2270);
				match(IF);
				setState(2271);
				match(EXISTS);
				}
			}

			setState(2274);
			schemaName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterInstanceContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode INSTANCE() { return getToken(MySQLStatementParser.INSTANCE, 0); }
		public InstanceActionContext instanceAction() {
			return getRuleContext(InstanceActionContext.class,0);
		}
		public AlterInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterInstance; }
	}

	public final AlterInstanceContext alterInstance() throws RecognitionException {
		AlterInstanceContext _localctx = new AlterInstanceContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_alterInstance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2276);
			match(ALTER);
			setState(2277);
			match(INSTANCE);
			setState(2278);
			instanceAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceActionContext extends ParserRuleContext {
		public TerminalNode ROTATE() { return getToken(MySQLStatementParser.ROTATE, 0); }
		public TerminalNode MASTER() { return getToken(MySQLStatementParser.MASTER, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode BINLOG() { return getToken(MySQLStatementParser.BINLOG, 0); }
		public TerminalNode RELOAD() { return getToken(MySQLStatementParser.RELOAD, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode ROLLBACK() { return getToken(MySQLStatementParser.ROLLBACK, 0); }
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TerminalNode ERROR() { return getToken(MySQLStatementParser.ERROR, 0); }
		public InstanceActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceAction; }
	}

	public final InstanceActionContext instanceAction() throws RecognitionException {
		InstanceActionContext _localctx = new InstanceActionContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_instanceAction);
		int _la;
		try {
			setState(2296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2280);
				match(ROTATE);
				setState(2281);
				match(T__0);
				setState(2282);
				match(MASTER);
				setState(2283);
				match(KEY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2284);
				match(ROTATE);
				setState(2285);
				match(BINLOG);
				setState(2286);
				match(MASTER);
				setState(2287);
				match(KEY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2288);
				match(RELOAD);
				setState(2289);
				match(T__1);
				setState(2294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(2290);
					match(NO);
					setState(2291);
					match(ROLLBACK);
					setState(2292);
					match(ON);
					setState(2293);
					match(ERROR);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateEventContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode EVENT() { return getToken(MySQLStatementParser.EVENT, 0); }
		public EventNameContext eventName() {
			return getRuleContext(EventNameContext.class,0);
		}
		public List<TerminalNode> ON() { return getTokens(MySQLStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(MySQLStatementParser.ON, i);
		}
		public TerminalNode SCHEDULE() { return getToken(MySQLStatementParser.SCHEDULE, 0); }
		public ScheduleExpression_Context scheduleExpression_() {
			return getRuleContext(ScheduleExpression_Context.class,0);
		}
		public TerminalNode DO() { return getToken(MySQLStatementParser.DO, 0); }
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public OwnerStatementContext ownerStatement() {
			return getRuleContext(OwnerStatementContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public List<TerminalNode> NOT() { return getTokens(MySQLStatementParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(MySQLStatementParser.NOT, i);
		}
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public TerminalNode COMPLETION() { return getToken(MySQLStatementParser.COMPLETION, 0); }
		public TerminalNode PRESERVE() { return getToken(MySQLStatementParser.PRESERVE, 0); }
		public TerminalNode ENABLE() { return getToken(MySQLStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(MySQLStatementParser.DISABLE, 0); }
		public TerminalNode SLAVE() { return getToken(MySQLStatementParser.SLAVE, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public CreateEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createEvent; }
	}

	public final CreateEventContext createEvent() throws RecognitionException {
		CreateEventContext _localctx = new CreateEventContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_createEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2298);
			match(CREATE);
			setState(2300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINER) {
				{
				setState(2299);
				ownerStatement();
				}
			}

			setState(2302);
			match(EVENT);
			setState(2306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2303);
				match(IF);
				setState(2304);
				match(NOT);
				setState(2305);
				match(EXISTS);
				}
			}

			setState(2308);
			eventName();
			setState(2309);
			match(ON);
			setState(2310);
			match(SCHEDULE);
			setState(2311);
			scheduleExpression_();
			setState(2318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2312);
				match(ON);
				setState(2313);
				match(COMPLETION);
				setState(2315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2314);
					match(NOT);
					}
				}

				setState(2317);
				match(PRESERVE);
				}
			}

			setState(2325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2320);
				match(ENABLE);
				}
				break;
			case 2:
				{
				setState(2321);
				match(DISABLE);
				}
				break;
			case 3:
				{
				setState(2322);
				match(DISABLE);
				setState(2323);
				match(ON);
				setState(2324);
				match(SLAVE);
				}
				break;
			}
			setState(2329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2327);
				match(COMMENT);
				setState(2328);
				match(STRING_);
				}
			}

			setState(2331);
			match(DO);
			setState(2332);
			routineBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterEventContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode EVENT() { return getToken(MySQLStatementParser.EVENT, 0); }
		public List<EventNameContext> eventName() {
			return getRuleContexts(EventNameContext.class);
		}
		public EventNameContext eventName(int i) {
			return getRuleContext(EventNameContext.class,i);
		}
		public OwnerStatementContext ownerStatement() {
			return getRuleContext(OwnerStatementContext.class,0);
		}
		public List<TerminalNode> ON() { return getTokens(MySQLStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(MySQLStatementParser.ON, i);
		}
		public TerminalNode SCHEDULE() { return getToken(MySQLStatementParser.SCHEDULE, 0); }
		public ScheduleExpression_Context scheduleExpression_() {
			return getRuleContext(ScheduleExpression_Context.class,0);
		}
		public TerminalNode COMPLETION() { return getToken(MySQLStatementParser.COMPLETION, 0); }
		public TerminalNode PRESERVE() { return getToken(MySQLStatementParser.PRESERVE, 0); }
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode ENABLE() { return getToken(MySQLStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(MySQLStatementParser.DISABLE, 0); }
		public TerminalNode SLAVE() { return getToken(MySQLStatementParser.SLAVE, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode DO() { return getToken(MySQLStatementParser.DO, 0); }
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public AlterEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterEvent; }
	}

	public final AlterEventContext alterEvent() throws RecognitionException {
		AlterEventContext _localctx = new AlterEventContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_alterEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2334);
			match(ALTER);
			setState(2336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINER) {
				{
				setState(2335);
				ownerStatement();
				}
			}

			setState(2338);
			match(EVENT);
			setState(2339);
			eventName();
			setState(2343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2340);
				match(ON);
				setState(2341);
				match(SCHEDULE);
				setState(2342);
				scheduleExpression_();
				}
				break;
			}
			setState(2351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2345);
				match(ON);
				setState(2346);
				match(COMPLETION);
				setState(2348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2347);
					match(NOT);
					}
				}

				setState(2350);
				match(PRESERVE);
				}
			}

			setState(2356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RENAME) {
				{
				setState(2353);
				match(RENAME);
				setState(2354);
				match(TO);
				setState(2355);
				eventName();
				}
			}

			setState(2363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2358);
				match(ENABLE);
				}
				break;
			case 2:
				{
				setState(2359);
				match(DISABLE);
				}
				break;
			case 3:
				{
				setState(2360);
				match(DISABLE);
				setState(2361);
				match(ON);
				setState(2362);
				match(SLAVE);
				}
				break;
			}
			setState(2367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2365);
				match(COMMENT);
				setState(2366);
				match(STRING_);
				}
			}

			setState(2371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DO) {
				{
				setState(2369);
				match(DO);
				setState(2370);
				routineBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropEventContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode EVENT() { return getToken(MySQLStatementParser.EVENT, 0); }
		public EventNameContext eventName() {
			return getRuleContext(EventNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public DropEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropEvent; }
	}

	public final DropEventContext dropEvent() throws RecognitionException {
		DropEventContext _localctx = new DropEventContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_dropEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
			match(DROP);
			setState(2374);
			match(EVENT);
			setState(2377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2375);
				match(IF);
				setState(2376);
				match(EXISTS);
				}
			}

			setState(2379);
			eventName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFunctionContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(MySQLStatementParser.FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode RETURNS() { return getToken(MySQLStatementParser.RETURNS, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public OwnerStatementContext ownerStatement() {
			return getRuleContext(OwnerStatementContext.class,0);
		}
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public List<RoutineOption_Context> routineOption_() {
			return getRuleContexts(RoutineOption_Context.class);
		}
		public RoutineOption_Context routineOption_(int i) {
			return getRuleContext(RoutineOption_Context.class,i);
		}
		public CreateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunction; }
	}

	public final CreateFunctionContext createFunction() throws RecognitionException {
		CreateFunctionContext _localctx = new CreateFunctionContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_createFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			match(CREATE);
			setState(2383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINER) {
				{
				setState(2382);
				ownerStatement();
				}
			}

			setState(2385);
			match(FUNCTION);
			setState(2386);
			functionName();
			setState(2387);
			match(LP_);
			setState(2391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0)) {
				{
				setState(2388);
				identifier_();
				setState(2389);
				dataType();
				}
			}

			setState(2399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2393);
				match(COMMA_);
				setState(2394);
				identifier_();
				setState(2395);
				dataType();
				}
				}
				setState(2401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2402);
			match(RP_);
			setState(2403);
			match(RETURNS);
			setState(2404);
			dataType();
			setState(2408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT || _la==SQL || _la==NO || _la==COMMENT || _la==LANGUAGE || ((((_la - 427)) & ~0x3f) == 0 && ((1L << (_la - 427)) & ((1L << (DETERMINISTIC - 427)) | (1L << (CONTAINS - 427)) | (1L << (READS - 427)) | (1L << (MODIFIES - 427)))) != 0)) {
				{
				{
				setState(2405);
				routineOption_();
				}
				}
				setState(2410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2411);
			routineBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterFunctionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode FUNCTION() { return getToken(MySQLStatementParser.FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<RoutineOption_Context> routineOption_() {
			return getRuleContexts(RoutineOption_Context.class);
		}
		public RoutineOption_Context routineOption_(int i) {
			return getRuleContext(RoutineOption_Context.class,i);
		}
		public AlterFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterFunction; }
	}

	public final AlterFunctionContext alterFunction() throws RecognitionException {
		AlterFunctionContext _localctx = new AlterFunctionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_alterFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			match(ALTER);
			setState(2414);
			match(FUNCTION);
			setState(2415);
			functionName();
			setState(2419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT || _la==SQL || _la==NO || _la==COMMENT || _la==LANGUAGE || ((((_la - 427)) & ~0x3f) == 0 && ((1L << (_la - 427)) & ((1L << (DETERMINISTIC - 427)) | (1L << (CONTAINS - 427)) | (1L << (READS - 427)) | (1L << (MODIFIES - 427)))) != 0)) {
				{
				{
				setState(2416);
				routineOption_();
				}
				}
				setState(2421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropFunctionContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(MySQLStatementParser.FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public DropFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropFunction; }
	}

	public final DropFunctionContext dropFunction() throws RecognitionException {
		DropFunctionContext _localctx = new DropFunctionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_dropFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2422);
			match(DROP);
			setState(2423);
			match(FUNCTION);
			{
			setState(2424);
			match(IF);
			setState(2425);
			match(EXISTS);
			}
			setState(2427);
			functionName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateProcedureContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(MySQLStatementParser.PROCEDURE, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public OwnerStatementContext ownerStatement() {
			return getRuleContext(OwnerStatementContext.class,0);
		}
		public List<ProcedureParameter_Context> procedureParameter_() {
			return getRuleContexts(ProcedureParameter_Context.class);
		}
		public ProcedureParameter_Context procedureParameter_(int i) {
			return getRuleContext(ProcedureParameter_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public List<RoutineOption_Context> routineOption_() {
			return getRuleContexts(RoutineOption_Context.class);
		}
		public RoutineOption_Context routineOption_(int i) {
			return getRuleContext(RoutineOption_Context.class,i);
		}
		public CreateProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createProcedure; }
	}

	public final CreateProcedureContext createProcedure() throws RecognitionException {
		CreateProcedureContext _localctx = new CreateProcedureContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_createProcedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2429);
			match(CREATE);
			setState(2431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINER) {
				{
				setState(2430);
				ownerStatement();
				}
			}

			setState(2433);
			match(PROCEDURE);
			setState(2434);
			functionName();
			setState(2435);
			match(LP_);
			setState(2437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==OUT || _la==INOUT) {
				{
				setState(2436);
				procedureParameter_();
				}
			}

			setState(2443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2439);
				match(COMMA_);
				setState(2440);
				procedureParameter_();
				}
				}
				setState(2445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2446);
			match(RP_);
			setState(2450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT || _la==SQL || _la==NO || _la==COMMENT || _la==LANGUAGE || ((((_la - 427)) & ~0x3f) == 0 && ((1L << (_la - 427)) & ((1L << (DETERMINISTIC - 427)) | (1L << (CONTAINS - 427)) | (1L << (READS - 427)) | (1L << (MODIFIES - 427)))) != 0)) {
				{
				{
				setState(2447);
				routineOption_();
				}
				}
				setState(2452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2453);
			routineBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterProcedureContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode PROCEDURE() { return getToken(MySQLStatementParser.PROCEDURE, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<RoutineOption_Context> routineOption_() {
			return getRuleContexts(RoutineOption_Context.class);
		}
		public RoutineOption_Context routineOption_(int i) {
			return getRuleContext(RoutineOption_Context.class,i);
		}
		public AlterProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterProcedure; }
	}

	public final AlterProcedureContext alterProcedure() throws RecognitionException {
		AlterProcedureContext _localctx = new AlterProcedureContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_alterProcedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2455);
			match(ALTER);
			setState(2456);
			match(PROCEDURE);
			setState(2457);
			functionName();
			setState(2461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT || _la==SQL || _la==NO || _la==COMMENT || _la==LANGUAGE || ((((_la - 427)) & ~0x3f) == 0 && ((1L << (_la - 427)) & ((1L << (DETERMINISTIC - 427)) | (1L << (CONTAINS - 427)) | (1L << (READS - 427)) | (1L << (MODIFIES - 427)))) != 0)) {
				{
				{
				setState(2458);
				routineOption_();
				}
				}
				setState(2463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropProcedureContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode PROCEDURE() { return getToken(MySQLStatementParser.PROCEDURE, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public DropProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropProcedure; }
	}

	public final DropProcedureContext dropProcedure() throws RecognitionException {
		DropProcedureContext _localctx = new DropProcedureContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_dropProcedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2464);
			match(DROP);
			setState(2465);
			match(PROCEDURE);
			setState(2468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2466);
				match(IF);
				setState(2467);
				match(EXISTS);
				}
			}

			setState(2470);
			functionName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateServerContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode SERVER() { return getToken(MySQLStatementParser.SERVER, 0); }
		public ServerNameContext serverName() {
			return getRuleContext(ServerNameContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(MySQLStatementParser.FOREIGN, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode WRAPPER() { return getToken(MySQLStatementParser.WRAPPER, 0); }
		public WrapperNameContext wrapperName() {
			return getRuleContext(WrapperNameContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(MySQLStatementParser.OPTIONS, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ServerOption_Context> serverOption_() {
			return getRuleContexts(ServerOption_Context.class);
		}
		public ServerOption_Context serverOption_(int i) {
			return getRuleContext(ServerOption_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public CreateServerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createServer; }
	}

	public final CreateServerContext createServer() throws RecognitionException {
		CreateServerContext _localctx = new CreateServerContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_createServer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2472);
			match(CREATE);
			setState(2473);
			match(SERVER);
			setState(2474);
			serverName();
			setState(2475);
			match(FOREIGN);
			setState(2476);
			match(DATA);
			setState(2477);
			match(WRAPPER);
			setState(2478);
			wrapperName();
			setState(2479);
			match(OPTIONS);
			setState(2480);
			match(LP_);
			setState(2481);
			serverOption_();
			setState(2486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2482);
				match(COMMA_);
				setState(2483);
				serverOption_();
				}
				}
				setState(2488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2489);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterServerContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode SERVER() { return getToken(MySQLStatementParser.SERVER, 0); }
		public ServerNameContext serverName() {
			return getRuleContext(ServerNameContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(MySQLStatementParser.OPTIONS, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ServerOption_Context> serverOption_() {
			return getRuleContexts(ServerOption_Context.class);
		}
		public ServerOption_Context serverOption_(int i) {
			return getRuleContext(ServerOption_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AlterServerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterServer; }
	}

	public final AlterServerContext alterServer() throws RecognitionException {
		AlterServerContext _localctx = new AlterServerContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_alterServer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2491);
			match(ALTER);
			setState(2492);
			match(SERVER);
			setState(2493);
			serverName();
			setState(2494);
			match(OPTIONS);
			setState(2495);
			match(LP_);
			setState(2496);
			serverOption_();
			setState(2501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2497);
				match(COMMA_);
				setState(2498);
				serverOption_();
				}
				}
				setState(2503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2504);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropServerContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode SERVER() { return getToken(MySQLStatementParser.SERVER, 0); }
		public ServerNameContext serverName() {
			return getRuleContext(ServerNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public DropServerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropServer; }
	}

	public final DropServerContext dropServer() throws RecognitionException {
		DropServerContext _localctx = new DropServerContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_dropServer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2506);
			match(DROP);
			setState(2507);
			match(SERVER);
			setState(2510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2508);
				match(IF);
				setState(2509);
				match(EXISTS);
				}
			}

			setState(2512);
			serverName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateViewContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(MySQLStatementParser.VIEW, 0); }
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode OR() { return getToken(MySQLStatementParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(MySQLStatementParser.REPLACE, 0); }
		public TerminalNode ALGORITHM() { return getToken(MySQLStatementParser.ALGORITHM, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public OwnerStatementContext ownerStatement() {
			return getRuleContext(OwnerStatementContext.class,0);
		}
		public TerminalNode SQL() { return getToken(MySQLStatementParser.SQL, 0); }
		public TerminalNode SECURITY() { return getToken(MySQLStatementParser.SECURITY, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(MySQLStatementParser.CHECK, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public TerminalNode UNDEFINED() { return getToken(MySQLStatementParser.UNDEFINED, 0); }
		public TerminalNode MERGE() { return getToken(MySQLStatementParser.MERGE, 0); }
		public TerminalNode TEMPTABLE() { return getToken(MySQLStatementParser.TEMPTABLE, 0); }
		public TerminalNode DEFINER() { return getToken(MySQLStatementParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(MySQLStatementParser.INVOKER, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode CASCADED() { return getToken(MySQLStatementParser.CASCADED, 0); }
		public TerminalNode LOCAL() { return getToken(MySQLStatementParser.LOCAL, 0); }
		public CreateViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createView; }
	}

	public final CreateViewContext createView() throws RecognitionException {
		CreateViewContext _localctx = new CreateViewContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_createView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2514);
			match(CREATE);
			setState(2517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(2515);
				match(OR);
				setState(2516);
				match(REPLACE);
				}
			}

			setState(2522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALGORITHM) {
				{
				setState(2519);
				match(ALGORITHM);
				setState(2520);
				match(EQ_);
				setState(2521);
				_la = _input.LA(1);
				if ( !(((((_la - 436)) & ~0x3f) == 0 && ((1L << (_la - 436)) & ((1L << (TEMPTABLE - 436)) | (1L << (MERGE - 436)) | (1L << (UNDEFINED - 436)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINER) {
				{
				setState(2524);
				ownerStatement();
				}
			}

			setState(2530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQL) {
				{
				setState(2527);
				match(SQL);
				setState(2528);
				match(SECURITY);
				setState(2529);
				_la = _input.LA(1);
				if ( !(_la==DEFINER || _la==INVOKER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2532);
			match(VIEW);
			setState(2533);
			viewName();
			setState(2545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2534);
				match(LP_);
				setState(2535);
				identifier_();
				setState(2540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2536);
					match(COMMA_);
					setState(2537);
					identifier_();
					}
					}
					setState(2542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2543);
				match(RP_);
				}
			}

			setState(2547);
			match(AS);
			setState(2548);
			select();
			setState(2555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2549);
				match(WITH);
				setState(2551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADED || _la==LOCAL) {
					{
					setState(2550);
					_la = _input.LA(1);
					if ( !(_la==CASCADED || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2553);
				match(CHECK);
				setState(2554);
				match(OPTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterViewContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(MySQLStatementParser.VIEW, 0); }
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode ALGORITHM() { return getToken(MySQLStatementParser.ALGORITHM, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public OwnerStatementContext ownerStatement() {
			return getRuleContext(OwnerStatementContext.class,0);
		}
		public TerminalNode SQL() { return getToken(MySQLStatementParser.SQL, 0); }
		public TerminalNode SECURITY() { return getToken(MySQLStatementParser.SECURITY, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(MySQLStatementParser.CHECK, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public TerminalNode UNDEFINED() { return getToken(MySQLStatementParser.UNDEFINED, 0); }
		public TerminalNode MERGE() { return getToken(MySQLStatementParser.MERGE, 0); }
		public TerminalNode TEMPTABLE() { return getToken(MySQLStatementParser.TEMPTABLE, 0); }
		public TerminalNode DEFINER() { return getToken(MySQLStatementParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(MySQLStatementParser.INVOKER, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode CASCADED() { return getToken(MySQLStatementParser.CASCADED, 0); }
		public TerminalNode LOCAL() { return getToken(MySQLStatementParser.LOCAL, 0); }
		public AlterViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterView; }
	}

	public final AlterViewContext alterView() throws RecognitionException {
		AlterViewContext _localctx = new AlterViewContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_alterView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2557);
			match(ALTER);
			setState(2561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALGORITHM) {
				{
				setState(2558);
				match(ALGORITHM);
				setState(2559);
				match(EQ_);
				setState(2560);
				_la = _input.LA(1);
				if ( !(((((_la - 436)) & ~0x3f) == 0 && ((1L << (_la - 436)) & ((1L << (TEMPTABLE - 436)) | (1L << (MERGE - 436)) | (1L << (UNDEFINED - 436)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINER) {
				{
				setState(2563);
				ownerStatement();
				}
			}

			setState(2569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQL) {
				{
				setState(2566);
				match(SQL);
				setState(2567);
				match(SECURITY);
				setState(2568);
				_la = _input.LA(1);
				if ( !(_la==DEFINER || _la==INVOKER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2571);
			match(VIEW);
			setState(2572);
			viewName();
			setState(2584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2573);
				match(LP_);
				setState(2574);
				identifier_();
				setState(2579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2575);
					match(COMMA_);
					setState(2576);
					identifier_();
					}
					}
					setState(2581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2582);
				match(RP_);
				}
			}

			setState(2586);
			match(AS);
			setState(2587);
			select();
			setState(2594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2588);
				match(WITH);
				setState(2590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADED || _la==LOCAL) {
					{
					setState(2589);
					_la = _input.LA(1);
					if ( !(_la==CASCADED || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2592);
				match(CHECK);
				setState(2593);
				match(OPTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropViewContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(MySQLStatementParser.VIEW, 0); }
		public List<ViewNameContext> viewName() {
			return getRuleContexts(ViewNameContext.class);
		}
		public ViewNameContext viewName(int i) {
			return getRuleContext(ViewNameContext.class,i);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode RESTRICT() { return getToken(MySQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(MySQLStatementParser.CASCADE, 0); }
		public DropViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropView; }
	}

	public final DropViewContext dropView() throws RecognitionException {
		DropViewContext _localctx = new DropViewContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_dropView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2596);
			match(DROP);
			setState(2597);
			match(VIEW);
			setState(2600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2598);
				match(IF);
				setState(2599);
				match(EXISTS);
				}
			}

			setState(2602);
			viewName();
			setState(2607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2603);
				match(COMMA_);
				setState(2604);
				viewName();
				}
				}
				setState(2609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(2610);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTablespaceInnodbContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public TerminalNode DATAFILE() { return getToken(MySQLStatementParser.DATAFILE, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public TerminalNode UNDO() { return getToken(MySQLStatementParser.UNDO, 0); }
		public TerminalNode FILE_BLOCK_SIZE() { return getToken(MySQLStatementParser.FILE_BLOCK_SIZE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(MySQLStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(MySQLStatementParser.EQ_, i);
		}
		public FileSizeLiteral_Context fileSizeLiteral_() {
			return getRuleContext(FileSizeLiteral_Context.class,0);
		}
		public TerminalNode ENCRYPTION() { return getToken(MySQLStatementParser.ENCRYPTION, 0); }
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public CreateTablespaceInnodbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTablespaceInnodb; }
	}

	public final CreateTablespaceInnodbContext createTablespaceInnodb() throws RecognitionException {
		CreateTablespaceInnodbContext _localctx = new CreateTablespaceInnodbContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_createTablespaceInnodb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2613);
			match(CREATE);
			setState(2615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDO) {
				{
				setState(2614);
				match(UNDO);
				}
			}

			setState(2617);
			match(TABLESPACE);
			setState(2618);
			identifier_();
			setState(2619);
			match(ADD);
			setState(2620);
			match(DATAFILE);
			setState(2621);
			match(STRING_);
			setState(2625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE_BLOCK_SIZE) {
				{
				setState(2622);
				match(FILE_BLOCK_SIZE);
				setState(2623);
				match(EQ_);
				setState(2624);
				fileSizeLiteral_();
				}
			}

			setState(2630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENCRYPTION) {
				{
				setState(2627);
				match(ENCRYPTION);
				setState(2628);
				match(EQ_);
				setState(2629);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENGINE) {
				{
				setState(2632);
				match(ENGINE);
				setState(2634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2633);
					match(EQ_);
					}
				}

				setState(2636);
				match(STRING_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTablespaceNdbContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public TerminalNode DATAFILE() { return getToken(MySQLStatementParser.DATAFILE, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public TerminalNode USE() { return getToken(MySQLStatementParser.USE, 0); }
		public TerminalNode LOGFILE() { return getToken(MySQLStatementParser.LOGFILE, 0); }
		public TerminalNode GROUP() { return getToken(MySQLStatementParser.GROUP, 0); }
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public TerminalNode UNDO() { return getToken(MySQLStatementParser.UNDO, 0); }
		public TerminalNode EXTENT_SIZE() { return getToken(MySQLStatementParser.EXTENT_SIZE, 0); }
		public List<FileSizeLiteral_Context> fileSizeLiteral_() {
			return getRuleContexts(FileSizeLiteral_Context.class);
		}
		public FileSizeLiteral_Context fileSizeLiteral_(int i) {
			return getRuleContext(FileSizeLiteral_Context.class,i);
		}
		public TerminalNode INITIAL_SIZE() { return getToken(MySQLStatementParser.INITIAL_SIZE, 0); }
		public TerminalNode AUTOEXTEND_SIZE() { return getToken(MySQLStatementParser.AUTOEXTEND_SIZE, 0); }
		public TerminalNode MAX_SIZE() { return getToken(MySQLStatementParser.MAX_SIZE, 0); }
		public TerminalNode NODEGROUP() { return getToken(MySQLStatementParser.NODEGROUP, 0); }
		public TerminalNode WAIT() { return getToken(MySQLStatementParser.WAIT, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public List<TerminalNode> EQ_() { return getTokens(MySQLStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(MySQLStatementParser.EQ_, i);
		}
		public CreateTablespaceNdbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTablespaceNdb; }
	}

	public final CreateTablespaceNdbContext createTablespaceNdb() throws RecognitionException {
		CreateTablespaceNdbContext _localctx = new CreateTablespaceNdbContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_createTablespaceNdb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2639);
			match(CREATE);
			setState(2641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDO) {
				{
				setState(2640);
				match(UNDO);
				}
			}

			setState(2643);
			match(TABLESPACE);
			setState(2644);
			identifier_();
			setState(2645);
			match(ADD);
			setState(2646);
			match(DATAFILE);
			setState(2647);
			match(STRING_);
			setState(2648);
			match(USE);
			setState(2649);
			match(LOGFILE);
			setState(2650);
			match(GROUP);
			setState(2651);
			identifier_();
			setState(2657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENT_SIZE) {
				{
				setState(2652);
				match(EXTENT_SIZE);
				setState(2654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2653);
					match(EQ_);
					}
				}

				setState(2656);
				fileSizeLiteral_();
				}
			}

			setState(2664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL_SIZE) {
				{
				setState(2659);
				match(INITIAL_SIZE);
				setState(2661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2660);
					match(EQ_);
					}
				}

				setState(2663);
				fileSizeLiteral_();
				}
			}

			setState(2671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTOEXTEND_SIZE) {
				{
				setState(2666);
				match(AUTOEXTEND_SIZE);
				setState(2668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2667);
					match(EQ_);
					}
				}

				setState(2670);
				fileSizeLiteral_();
				}
			}

			setState(2678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAX_SIZE) {
				{
				setState(2673);
				match(MAX_SIZE);
				setState(2675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2674);
					match(EQ_);
					}
				}

				setState(2677);
				fileSizeLiteral_();
				}
			}

			setState(2685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NODEGROUP) {
				{
				setState(2680);
				match(NODEGROUP);
				setState(2682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2681);
					match(EQ_);
					}
				}

				setState(2684);
				identifier_();
				}
			}

			setState(2688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WAIT) {
				{
				setState(2687);
				match(WAIT);
				}
			}

			setState(2695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2690);
				match(COMMENT);
				setState(2692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2691);
					match(EQ_);
					}
				}

				setState(2694);
				match(STRING_);
				}
			}

			setState(2697);
			match(ENGINE);
			setState(2699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(2698);
				match(EQ_);
				}
			}

			setState(2701);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTablespaceContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode DATAFILE() { return getToken(MySQLStatementParser.DATAFILE, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode INITIAL_SIZE() { return getToken(MySQLStatementParser.INITIAL_SIZE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(MySQLStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(MySQLStatementParser.EQ_, i);
		}
		public FileSizeLiteral_Context fileSizeLiteral_() {
			return getRuleContext(FileSizeLiteral_Context.class,0);
		}
		public TerminalNode WAIT() { return getToken(MySQLStatementParser.WAIT, 0); }
		public AlterTablespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTablespace; }
	}

	public final AlterTablespaceContext alterTablespace() throws RecognitionException {
		AlterTablespaceContext _localctx = new AlterTablespaceContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_alterTablespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2703);
			match(ALTER);
			setState(2704);
			match(TABLESPACE);
			setState(2705);
			identifier_();
			setState(2706);
			_la = _input.LA(1);
			if ( !(_la==DROP || _la==ADD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2707);
			match(DATAFILE);
			setState(2708);
			match(STRING_);
			setState(2712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL_SIZE) {
				{
				setState(2709);
				match(INITIAL_SIZE);
				setState(2710);
				match(EQ_);
				setState(2711);
				fileSizeLiteral_();
				}
			}

			setState(2715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WAIT) {
				{
				setState(2714);
				match(WAIT);
				}
			}

			setState(2717);
			match(ENGINE);
			setState(2719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(2718);
				match(EQ_);
				}
			}

			setState(2721);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTablespaceContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public DropTablespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTablespace; }
	}

	public final DropTablespaceContext dropTablespace() throws RecognitionException {
		DropTablespaceContext _localctx = new DropTablespaceContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_dropTablespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2723);
			match(DROP);
			setState(2724);
			match(TABLESPACE);
			setState(2725);
			identifier_();
			setState(2731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENGINE) {
				{
				setState(2726);
				match(ENGINE);
				setState(2728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2727);
					match(EQ_);
					}
				}

				setState(2730);
				identifier_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateLogfileGroupContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode LOGFILE() { return getToken(MySQLStatementParser.LOGFILE, 0); }
		public TerminalNode GROUP() { return getToken(MySQLStatementParser.GROUP, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public TerminalNode UNDOFILE() { return getToken(MySQLStatementParser.UNDOFILE, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public TerminalNode INITIAL_SIZE() { return getToken(MySQLStatementParser.INITIAL_SIZE, 0); }
		public List<FileSizeLiteral_Context> fileSizeLiteral_() {
			return getRuleContexts(FileSizeLiteral_Context.class);
		}
		public FileSizeLiteral_Context fileSizeLiteral_(int i) {
			return getRuleContext(FileSizeLiteral_Context.class,i);
		}
		public TerminalNode UNDO_BUFFER_SIZE() { return getToken(MySQLStatementParser.UNDO_BUFFER_SIZE, 0); }
		public TerminalNode REDO_BUFFER_SIZE() { return getToken(MySQLStatementParser.REDO_BUFFER_SIZE, 0); }
		public TerminalNode NODEGROUP() { return getToken(MySQLStatementParser.NODEGROUP, 0); }
		public TerminalNode WAIT() { return getToken(MySQLStatementParser.WAIT, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public List<TerminalNode> EQ_() { return getTokens(MySQLStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(MySQLStatementParser.EQ_, i);
		}
		public CreateLogfileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLogfileGroup; }
	}

	public final CreateLogfileGroupContext createLogfileGroup() throws RecognitionException {
		CreateLogfileGroupContext _localctx = new CreateLogfileGroupContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_createLogfileGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2733);
			match(CREATE);
			setState(2734);
			match(LOGFILE);
			setState(2735);
			match(GROUP);
			setState(2736);
			identifier_();
			setState(2737);
			match(ADD);
			setState(2738);
			match(UNDOFILE);
			setState(2739);
			match(STRING_);
			setState(2745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL_SIZE) {
				{
				setState(2740);
				match(INITIAL_SIZE);
				setState(2742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2741);
					match(EQ_);
					}
				}

				setState(2744);
				fileSizeLiteral_();
				}
			}

			setState(2752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDO_BUFFER_SIZE) {
				{
				setState(2747);
				match(UNDO_BUFFER_SIZE);
				setState(2749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2748);
					match(EQ_);
					}
				}

				setState(2751);
				fileSizeLiteral_();
				}
			}

			setState(2759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REDO_BUFFER_SIZE) {
				{
				setState(2754);
				match(REDO_BUFFER_SIZE);
				setState(2756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2755);
					match(EQ_);
					}
				}

				setState(2758);
				fileSizeLiteral_();
				}
			}

			setState(2766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NODEGROUP) {
				{
				setState(2761);
				match(NODEGROUP);
				setState(2763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2762);
					match(EQ_);
					}
				}

				setState(2765);
				identifier_();
				}
			}

			setState(2769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WAIT) {
				{
				setState(2768);
				match(WAIT);
				}
			}

			setState(2776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2771);
				match(COMMENT);
				setState(2773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2772);
					match(EQ_);
					}
				}

				setState(2775);
				match(STRING_);
				}
			}

			setState(2778);
			match(ENGINE);
			setState(2780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(2779);
				match(EQ_);
				}
			}

			setState(2782);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterLogfileGroupContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode LOGFILE() { return getToken(MySQLStatementParser.LOGFILE, 0); }
		public TerminalNode GROUP() { return getToken(MySQLStatementParser.GROUP, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public TerminalNode UNDOFILE() { return getToken(MySQLStatementParser.UNDOFILE, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public TerminalNode INITIAL_SIZE() { return getToken(MySQLStatementParser.INITIAL_SIZE, 0); }
		public FileSizeLiteral_Context fileSizeLiteral_() {
			return getRuleContext(FileSizeLiteral_Context.class,0);
		}
		public TerminalNode WAIT() { return getToken(MySQLStatementParser.WAIT, 0); }
		public List<TerminalNode> EQ_() { return getTokens(MySQLStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(MySQLStatementParser.EQ_, i);
		}
		public AlterLogfileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterLogfileGroup; }
	}

	public final AlterLogfileGroupContext alterLogfileGroup() throws RecognitionException {
		AlterLogfileGroupContext _localctx = new AlterLogfileGroupContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_alterLogfileGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2784);
			match(ALTER);
			setState(2785);
			match(LOGFILE);
			setState(2786);
			match(GROUP);
			setState(2787);
			identifier_();
			setState(2788);
			match(ADD);
			setState(2789);
			match(UNDOFILE);
			setState(2790);
			match(STRING_);
			setState(2796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL_SIZE) {
				{
				setState(2791);
				match(INITIAL_SIZE);
				setState(2793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2792);
					match(EQ_);
					}
				}

				setState(2795);
				fileSizeLiteral_();
				}
			}

			setState(2799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WAIT) {
				{
				setState(2798);
				match(WAIT);
				}
			}

			setState(2801);
			match(ENGINE);
			setState(2803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(2802);
				match(EQ_);
				}
			}

			setState(2805);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropLogfileGroupContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode LOGFILE() { return getToken(MySQLStatementParser.LOGFILE, 0); }
		public TerminalNode GROUP() { return getToken(MySQLStatementParser.GROUP, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public DropLogfileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropLogfileGroup; }
	}

	public final DropLogfileGroupContext dropLogfileGroup() throws RecognitionException {
		DropLogfileGroupContext _localctx = new DropLogfileGroupContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_dropLogfileGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2807);
			match(DROP);
			setState(2808);
			match(LOGFILE);
			setState(2809);
			match(GROUP);
			setState(2810);
			identifier_();
			setState(2811);
			match(ENGINE);
			setState(2812);
			match(EQ_);
			setState(2813);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableSpecification_Context extends ParserRuleContext {
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public CreateTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSpecification_; }
	}

	public final CreateTableSpecification_Context createTableSpecification_() throws RecognitionException {
		CreateTableSpecification_Context _localctx = new CreateTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 354, RULE_createTableSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2815);
			match(TEMPORARY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNotExistClause_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public TableNotExistClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNotExistClause_; }
	}

	public final TableNotExistClause_Context tableNotExistClause_() throws RecognitionException {
		TableNotExistClause_Context _localctx = new TableNotExistClause_Context(_ctx, getState());
		enterRule(_localctx, 356, RULE_tableNotExistClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2817);
				match(IF);
				setState(2818);
				match(NOT);
				setState(2819);
				match(EXISTS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDefinitionClause_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public CreateDefinitions_Context createDefinitions_() {
			return getRuleContext(CreateDefinitions_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public CreateDefinitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionClause_; }
	}

	public final CreateDefinitionClause_Context createDefinitionClause_() throws RecognitionException {
		CreateDefinitionClause_Context _localctx = new CreateDefinitionClause_Context(_ctx, getState());
		enterRule(_localctx, 358, RULE_createDefinitionClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2822);
			match(LP_);
			setState(2823);
			createDefinitions_();
			setState(2824);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDatabaseSpecification_Context extends ParserRuleContext {
		public CharacterSetName_Context characterSetName_() {
			return getRuleContext(CharacterSetName_Context.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(MySQLStatementParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode CHARSET() { return getToken(MySQLStatementParser.CHARSET, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode COLLATE() { return getToken(MySQLStatementParser.COLLATE, 0); }
		public CollationName_Context collationName_() {
			return getRuleContext(CollationName_Context.class,0);
		}
		public TerminalNode ENCRYPTION() { return getToken(MySQLStatementParser.ENCRYPTION, 0); }
		public CreateDatabaseSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabaseSpecification_; }
	}

	public final CreateDatabaseSpecification_Context createDatabaseSpecification_() throws RecognitionException {
		CreateDatabaseSpecification_Context _localctx = new CreateDatabaseSpecification_Context(_ctx, getState());
		enterRule(_localctx, 360, RULE_createDatabaseSpecification_);
		int _la;
		try {
			setState(2850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2826);
					match(DEFAULT);
					}
				}

				setState(2832);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHARACTER:
					{
					setState(2829);
					match(CHARACTER);
					setState(2830);
					match(SET);
					}
					break;
				case CHARSET:
					{
					setState(2831);
					match(CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2834);
					match(EQ_);
					}
				}

				setState(2837);
				characterSetName_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2838);
					match(DEFAULT);
					}
				}

				setState(2841);
				match(COLLATE);
				setState(2843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2842);
					match(EQ_);
					}
				}

				setState(2845);
				collationName_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2846);
				match(DEFAULT);
				setState(2847);
				match(ENCRYPTION);
				setState(2848);
				match(EQ_);
				setState(2849);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDefinitions_Context extends ParserRuleContext {
		public List<CreateDefinition_Context> createDefinition_() {
			return getRuleContexts(CreateDefinition_Context.class);
		}
		public CreateDefinition_Context createDefinition_(int i) {
			return getRuleContext(CreateDefinition_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public CreateDefinitions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitions_; }
	}

	public final CreateDefinitions_Context createDefinitions_() throws RecognitionException {
		CreateDefinitions_Context _localctx = new CreateDefinitions_Context(_ctx, getState());
		enterRule(_localctx, 362, RULE_createDefinitions_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2852);
			createDefinition_();
			setState(2857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2853);
				match(COMMA_);
				setState(2854);
				createDefinition_();
				}
				}
				setState(2859);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDefinition_Context extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public IndexDefinition_Context indexDefinition_() {
			return getRuleContext(IndexDefinition_Context.class,0);
		}
		public ConstraintDefinition_Context constraintDefinition_() {
			return getRuleContext(ConstraintDefinition_Context.class,0);
		}
		public CheckConstraintDefinition_Context checkConstraintDefinition_() {
			return getRuleContext(CheckConstraintDefinition_Context.class,0);
		}
		public CreateDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition_; }
	}

	public final CreateDefinition_Context createDefinition_() throws RecognitionException {
		CreateDefinition_Context _localctx = new CreateDefinition_Context(_ctx, getState());
		enterRule(_localctx, 364, RULE_createDefinition_);
		try {
			setState(2864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2860);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2861);
				indexDefinition_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2862);
				constraintDefinition_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2863);
				checkConstraintDefinition_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<InlineDataType_Context> inlineDataType_() {
			return getRuleContexts(InlineDataType_Context.class);
		}
		public InlineDataType_Context inlineDataType_(int i) {
			return getRuleContext(InlineDataType_Context.class,i);
		}
		public List<GeneratedDataType_Context> generatedDataType_() {
			return getRuleContexts(GeneratedDataType_Context.class);
		}
		public GeneratedDataType_Context generatedDataType_(int i) {
			return getRuleContext(GeneratedDataType_Context.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2866);
			columnName();
			setState(2867);
			dataType();
			setState(2880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				{
				setState(2871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CONSTRAINT - 69)) | (1L << (PRIMARY - 69)) | (1L << (UNIQUE - 69)) | (1L << (KEY - 69)) | (1L << (NOT - 69)) | (1L << (NULL - 69)))) != 0) || _la==DEFAULT || _la==STORAGE || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & ((1L << (CHECK - 236)) | (1L << (REFERENCES - 236)) | (1L << (COLLATE - 236)) | (1L << (COMMENT - 236)))) != 0) || _la==COLUMN_FORMAT || _la==AUTO_INCREMENT) {
					{
					{
					setState(2868);
					inlineDataType_();
					}
					}
					setState(2873);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(2877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CONSTRAINT - 69)) | (1L << (PRIMARY - 69)) | (1L << (UNIQUE - 69)) | (1L << (KEY - 69)) | (1L << (AS - 69)) | (1L << (NOT - 69)) | (1L << (NULL - 69)))) != 0) || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (GENERATED - 213)) | (1L << (STORED - 213)) | (1L << (VIRTUAL - 213)) | (1L << (CHECK - 213)) | (1L << (REFERENCES - 213)) | (1L << (COLLATE - 213)) | (1L << (COMMENT - 213)))) != 0)) {
					{
					{
					setState(2874);
					generatedDataType_();
					}
					}
					setState(2879);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineDataType_Context extends ParserRuleContext {
		public CommonDataTypeOption_Context commonDataTypeOption_() {
			return getRuleContext(CommonDataTypeOption_Context.class,0);
		}
		public TerminalNode AUTO_INCREMENT() { return getToken(MySQLStatementParser.AUTO_INCREMENT, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLUMN_FORMAT() { return getToken(MySQLStatementParser.COLUMN_FORMAT, 0); }
		public TerminalNode FIXED() { return getToken(MySQLStatementParser.FIXED, 0); }
		public TerminalNode DYNAMIC() { return getToken(MySQLStatementParser.DYNAMIC, 0); }
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode DISK() { return getToken(MySQLStatementParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(MySQLStatementParser.MEMORY, 0); }
		public InlineDataType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineDataType_; }
	}

	public final InlineDataType_Context inlineDataType_() throws RecognitionException {
		InlineDataType_Context _localctx = new InlineDataType_Context(_ctx, getState());
		enterRule(_localctx, 368, RULE_inlineDataType_);
		int _la;
		try {
			setState(2893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
			case KEY:
			case NOT:
			case NULL:
			case CHECK:
			case REFERENCES:
			case COLLATE:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2882);
				commonDataTypeOption_();
				}
				break;
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2883);
				match(AUTO_INCREMENT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2884);
				match(DEFAULT);
				setState(2887);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
				case 1:
					{
					setState(2885);
					literals();
					}
					break;
				case 2:
					{
					setState(2886);
					expr(0);
					}
					break;
				}
				}
				break;
			case COLUMN_FORMAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2889);
				match(COLUMN_FORMAT);
				setState(2890);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==DYNAMIC || _la==FIXED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2891);
				match(STORAGE);
				setState(2892);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==DISK || _la==MEMORY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonDataTypeOption_Context extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(MySQLStatementParser.UNIQUE, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public CheckConstraintDefinition_Context checkConstraintDefinition_() {
			return getRuleContext(CheckConstraintDefinition_Context.class,0);
		}
		public ReferenceDefinition_Context referenceDefinition_() {
			return getRuleContext(ReferenceDefinition_Context.class,0);
		}
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public CommonDataTypeOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonDataTypeOption_; }
	}

	public final CommonDataTypeOption_Context commonDataTypeOption_() throws RecognitionException {
		CommonDataTypeOption_Context _localctx = new CommonDataTypeOption_Context(_ctx, getState());
		enterRule(_localctx, 370, RULE_commonDataTypeOption_);
		int _la;
		try {
			setState(2909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2895);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2896);
				match(UNIQUE);
				setState(2898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
				case 1:
					{
					setState(2897);
					match(KEY);
					}
					break;
				}
				}
				break;
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2900);
					match(NOT);
					}
				}

				setState(2903);
				match(NULL);
				}
				break;
			case COLLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2904);
				collateClause_();
				}
				break;
			case CONSTRAINT:
			case CHECK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2905);
				checkConstraintDefinition_();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 6);
				{
				setState(2906);
				referenceDefinition_();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2907);
				match(COMMENT);
				setState(2908);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckConstraintDefinition_Context extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(MySQLStatementParser.CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(MySQLStatementParser.CONSTRAINT, 0); }
		public TerminalNode ENFORCED() { return getToken(MySQLStatementParser.ENFORCED, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public CheckConstraintDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConstraintDefinition_; }
	}

	public final CheckConstraintDefinition_Context checkConstraintDefinition_() throws RecognitionException {
		CheckConstraintDefinition_Context _localctx = new CheckConstraintDefinition_Context(_ctx, getState());
		enterRule(_localctx, 372, RULE_checkConstraintDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(2911);
				match(CONSTRAINT);
				setState(2913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0)) {
					{
					setState(2912);
					ignoredIdentifier_();
					}
				}

				}
			}

			setState(2917);
			match(CHECK);
			setState(2918);
			expr(0);
			setState(2923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
			case 1:
				{
				setState(2920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2919);
					match(NOT);
					}
				}

				setState(2922);
				match(ENFORCED);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceDefinition_Context extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(MySQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public KeyParts_Context keyParts_() {
			return getRuleContext(KeyParts_Context.class,0);
		}
		public TerminalNode MATCH() { return getToken(MySQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(MySQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(MySQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(MySQLStatementParser.SIMPLE, 0); }
		public List<TerminalNode> ON() { return getTokens(MySQLStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(MySQLStatementParser.ON, i);
		}
		public List<ReferenceOption_Context> referenceOption_() {
			return getRuleContexts(ReferenceOption_Context.class);
		}
		public ReferenceOption_Context referenceOption_(int i) {
			return getRuleContext(ReferenceOption_Context.class,i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(MySQLStatementParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(MySQLStatementParser.UPDATE, i);
		}
		public List<TerminalNode> DELETE() { return getTokens(MySQLStatementParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(MySQLStatementParser.DELETE, i);
		}
		public ReferenceDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceDefinition_; }
	}

	public final ReferenceDefinition_Context referenceDefinition_() throws RecognitionException {
		ReferenceDefinition_Context _localctx = new ReferenceDefinition_Context(_ctx, getState());
		enterRule(_localctx, 374, RULE_referenceDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2925);
			match(REFERENCES);
			setState(2926);
			tableName();
			setState(2927);
			keyParts_();
			setState(2934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
			case 1:
				{
				setState(2928);
				match(MATCH);
				setState(2929);
				match(FULL);
				}
				break;
			case 2:
				{
				setState(2930);
				match(MATCH);
				setState(2931);
				match(PARTIAL);
				}
				break;
			case 3:
				{
				setState(2932);
				match(MATCH);
				setState(2933);
				match(SIMPLE);
				}
				break;
			}
			setState(2941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				{
				setState(2936);
				match(ON);
				setState(2937);
				_la = _input.LA(1);
				if ( !(_la==UPDATE || _la==DELETE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2938);
				referenceOption_();
				}
				}
				setState(2943);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceOption_Context extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(MySQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(MySQLStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(MySQLStatementParser.ACTION, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public ReferenceOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceOption_; }
	}

	public final ReferenceOption_Context referenceOption_() throws RecognitionException {
		ReferenceOption_Context _localctx = new ReferenceOption_Context(_ctx, getState());
		enterRule(_localctx, 376, RULE_referenceOption_);
		try {
			setState(2952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2944);
				match(RESTRICT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2945);
				match(CASCADE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2946);
				match(SET);
				setState(2947);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2948);
				match(NO);
				setState(2949);
				match(ACTION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2950);
				match(SET);
				setState(2951);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratedDataType_Context extends ParserRuleContext {
		public CommonDataTypeOption_Context commonDataTypeOption_() {
			return getRuleContext(CommonDataTypeOption_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(MySQLStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(MySQLStatementParser.ALWAYS, 0); }
		public TerminalNode VIRTUAL() { return getToken(MySQLStatementParser.VIRTUAL, 0); }
		public TerminalNode STORED() { return getToken(MySQLStatementParser.STORED, 0); }
		public GeneratedDataType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedDataType_; }
	}

	public final GeneratedDataType_Context generatedDataType_() throws RecognitionException {
		GeneratedDataType_Context _localctx = new GeneratedDataType_Context(_ctx, getState());
		enterRule(_localctx, 378, RULE_generatedDataType_);
		int _la;
		try {
			setState(2962);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
			case KEY:
			case NOT:
			case NULL:
			case CHECK:
			case REFERENCES:
			case COLLATE:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2954);
				commonDataTypeOption_();
				}
				break;
			case AS:
			case GENERATED:
				enterOuterAlt(_localctx, 2);
				{
				setState(2957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GENERATED) {
					{
					setState(2955);
					match(GENERATED);
					setState(2956);
					match(ALWAYS);
					}
				}

				setState(2959);
				match(AS);
				setState(2960);
				expr(0);
				}
				break;
			case STORED:
			case VIRTUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2961);
				_la = _input.LA(1);
				if ( !(_la==STORED || _la==VIRTUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexDefinition_Context extends ParserRuleContext {
		public KeyParts_Context keyParts_() {
			return getRuleContext(KeyParts_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public List<IndexOption_Context> indexOption_() {
			return getRuleContexts(IndexOption_Context.class);
		}
		public IndexOption_Context indexOption_(int i) {
			return getRuleContext(IndexOption_Context.class,i);
		}
		public TerminalNode FULLTEXT() { return getToken(MySQLStatementParser.FULLTEXT, 0); }
		public TerminalNode SPATIAL() { return getToken(MySQLStatementParser.SPATIAL, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public IndexDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexDefinition_; }
	}

	public final IndexDefinition_Context indexDefinition_() throws RecognitionException {
		IndexDefinition_Context _localctx = new IndexDefinition_Context(_ctx, getState());
		enterRule(_localctx, 380, RULE_indexDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FULLTEXT || _la==SPATIAL) {
				{
				setState(2964);
				_la = _input.LA(1);
				if ( !(_la==FULLTEXT || _la==SPATIAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX || _la==KEY) {
				{
				setState(2967);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0)) {
				{
				setState(2970);
				indexName();
				}
			}

			setState(2974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(2973);
				indexType_();
				}
			}

			setState(2976);
			keyParts_();
			setState(2980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || _la==USING || _la==COMMENT || ((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & ((1L << (VISIBLE - 339)) | (1L << (INVISIBLE - 339)) | (1L << (KEY_BLOCK_SIZE - 339)))) != 0)) {
				{
				{
				setState(2977);
				indexOption_();
				}
				}
				setState(2982);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexType_Context extends ParserRuleContext {
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public TerminalNode BTREE() { return getToken(MySQLStatementParser.BTREE, 0); }
		public TerminalNode HASH() { return getToken(MySQLStatementParser.HASH, 0); }
		public IndexType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType_; }
	}

	public final IndexType_Context indexType_() throws RecognitionException {
		IndexType_Context _localctx = new IndexType_Context(_ctx, getState());
		enterRule(_localctx, 382, RULE_indexType_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2983);
			match(USING);
			setState(2984);
			_la = _input.LA(1);
			if ( !(_la==BTREE || _la==HASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyParts_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<KeyPart_Context> keyPart_() {
			return getRuleContexts(KeyPart_Context.class);
		}
		public KeyPart_Context keyPart_(int i) {
			return getRuleContext(KeyPart_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public KeyParts_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyParts_; }
	}

	public final KeyParts_Context keyParts_() throws RecognitionException {
		KeyParts_Context _localctx = new KeyParts_Context(_ctx, getState());
		enterRule(_localctx, 384, RULE_keyParts_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2986);
			match(LP_);
			setState(2987);
			keyPart_();
			setState(2992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2988);
				match(COMMA_);
				setState(2989);
				keyPart_();
				}
				}
				setState(2994);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2995);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyPart_Context extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MySQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLStatementParser.DESC, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public KeyPart_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPart_; }
	}

	public final KeyPart_Context keyPart_() throws RecognitionException {
		KeyPart_Context _localctx = new KeyPart_Context(_ctx, getState());
		enterRule(_localctx, 386, RULE_keyPart_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
			case 1:
				{
				setState(2997);
				columnName();
				setState(3001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2998);
					match(LP_);
					setState(2999);
					match(NUMBER_);
					setState(3000);
					match(RP_);
					}
				}

				}
				break;
			case 2:
				{
				setState(3003);
				expr(0);
				}
				break;
			}
			setState(3007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(3006);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexOption_Context extends ParserRuleContext {
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(MySQLStatementParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode PARSER() { return getToken(MySQLStatementParser.PARSER, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode VISIBLE() { return getToken(MySQLStatementParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(MySQLStatementParser.INVISIBLE, 0); }
		public IndexOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOption_; }
	}

	public final IndexOption_Context indexOption_() throws RecognitionException {
		IndexOption_Context _localctx = new IndexOption_Context(_ctx, getState());
		enterRule(_localctx, 388, RULE_indexOption_);
		int _la;
		try {
			setState(3021);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3009);
				match(KEY_BLOCK_SIZE);
				setState(3011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3010);
					match(EQ_);
					}
				}

				setState(3013);
				match(NUMBER_);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(3014);
				indexType_();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(3015);
				match(WITH);
				setState(3016);
				match(PARSER);
				setState(3017);
				identifier_();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(3018);
				match(COMMENT);
				setState(3019);
				match(STRING_);
				}
				break;
			case VISIBLE:
			case INVISIBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(3020);
				_la = _input.LA(1);
				if ( !(_la==VISIBLE || _la==INVISIBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintDefinition_Context extends ParserRuleContext {
		public PrimaryKeyOption_Context primaryKeyOption_() {
			return getRuleContext(PrimaryKeyOption_Context.class,0);
		}
		public UniqueOption_Context uniqueOption_() {
			return getRuleContext(UniqueOption_Context.class,0);
		}
		public ForeignKeyOption_Context foreignKeyOption_() {
			return getRuleContext(ForeignKeyOption_Context.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(MySQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDefinition_; }
	}

	public final ConstraintDefinition_Context constraintDefinition_() throws RecognitionException {
		ConstraintDefinition_Context _localctx = new ConstraintDefinition_Context(_ctx, getState());
		enterRule(_localctx, 390, RULE_constraintDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(3023);
				match(CONSTRAINT);
				setState(3025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0)) {
					{
					setState(3024);
					ignoredIdentifier_();
					}
				}

				}
			}

			setState(3032);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case KEY:
				{
				setState(3029);
				primaryKeyOption_();
				}
				break;
			case UNIQUE:
				{
				setState(3030);
				uniqueOption_();
				}
				break;
			case FOREIGN:
				{
				setState(3031);
				foreignKeyOption_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyOption_Context extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public List<IndexOption_Context> indexOption_() {
			return getRuleContexts(IndexOption_Context.class);
		}
		public IndexOption_Context indexOption_(int i) {
			return getRuleContext(IndexOption_Context.class,i);
		}
		public PrimaryKeyOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOption_; }
	}

	public final PrimaryKeyOption_Context primaryKeyOption_() throws RecognitionException {
		PrimaryKeyOption_Context _localctx = new PrimaryKeyOption_Context(_ctx, getState());
		enterRule(_localctx, 392, RULE_primaryKeyOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3034);
			primaryKey();
			setState(3036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(3035);
				indexType_();
				}
			}

			setState(3038);
			columnNames();
			setState(3042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || _la==USING || _la==COMMENT || ((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & ((1L << (VISIBLE - 339)) | (1L << (INVISIBLE - 339)) | (1L << (KEY_BLOCK_SIZE - 339)))) != 0)) {
				{
				{
				setState(3039);
				indexOption_();
				}
				}
				setState(3044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(MySQLStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(3045);
				match(PRIMARY);
				}
			}

			setState(3048);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniqueOption_Context extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(MySQLStatementParser.UNIQUE, 0); }
		public KeyParts_Context keyParts_() {
			return getRuleContext(KeyParts_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public List<IndexOption_Context> indexOption_() {
			return getRuleContexts(IndexOption_Context.class);
		}
		public IndexOption_Context indexOption_(int i) {
			return getRuleContext(IndexOption_Context.class,i);
		}
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public UniqueOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueOption_; }
	}

	public final UniqueOption_Context uniqueOption_() throws RecognitionException {
		UniqueOption_Context _localctx = new UniqueOption_Context(_ctx, getState());
		enterRule(_localctx, 396, RULE_uniqueOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3050);
			match(UNIQUE);
			setState(3052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX || _la==KEY) {
				{
				setState(3051);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(3055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0)) {
				{
				setState(3054);
				indexName();
				}
			}

			setState(3058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(3057);
				indexType_();
				}
			}

			setState(3060);
			keyParts_();
			setState(3064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || _la==USING || _la==COMMENT || ((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & ((1L << (VISIBLE - 339)) | (1L << (INVISIBLE - 339)) | (1L << (KEY_BLOCK_SIZE - 339)))) != 0)) {
				{
				{
				setState(3061);
				indexOption_();
				}
				}
				setState(3066);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignKeyOption_Context extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(MySQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ReferenceDefinition_Context referenceDefinition_() {
			return getRuleContext(ReferenceDefinition_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ForeignKeyOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOption_; }
	}

	public final ForeignKeyOption_Context foreignKeyOption_() throws RecognitionException {
		ForeignKeyOption_Context _localctx = new ForeignKeyOption_Context(_ctx, getState());
		enterRule(_localctx, 398, RULE_foreignKeyOption_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3067);
			match(FOREIGN);
			setState(3068);
			match(KEY);
			setState(3070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,410,_ctx) ) {
			case 1:
				{
				setState(3069);
				indexName();
				}
				break;
			}
			setState(3072);
			columnNames();
			setState(3073);
			referenceDefinition_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateLikeClause_Context extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(MySQLStatementParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public CreateLikeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLikeClause_; }
	}

	public final CreateLikeClause_Context createLikeClause_() throws RecognitionException {
		CreateLikeClause_Context _localctx = new CreateLikeClause_Context(_ctx, getState());
		enterRule(_localctx, 400, RULE_createLikeClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(3075);
				match(LP_);
				}
			}

			setState(3078);
			match(LIKE);
			setState(3079);
			tableName();
			setState(3081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(3080);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateIndexSpecification_Context extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(MySQLStatementParser.UNIQUE, 0); }
		public TerminalNode FULLTEXT() { return getToken(MySQLStatementParser.FULLTEXT, 0); }
		public TerminalNode SPATIAL() { return getToken(MySQLStatementParser.SPATIAL, 0); }
		public CreateIndexSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexSpecification_; }
	}

	public final CreateIndexSpecification_Context createIndexSpecification_() throws RecognitionException {
		CreateIndexSpecification_Context _localctx = new CreateIndexSpecification_Context(_ctx, getState());
		enterRule(_localctx, 402, RULE_createIndexSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE || _la==FULLTEXT || _la==SPATIAL) {
				{
				setState(3083);
				_la = _input.LA(1);
				if ( !(_la==UNIQUE || _la==FULLTEXT || _la==SPATIAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterDefinitionClause_Context extends ParserRuleContext {
		public List<AlterSpecification_Context> alterSpecification_() {
			return getRuleContexts(AlterSpecification_Context.class);
		}
		public AlterSpecification_Context alterSpecification_(int i) {
			return getRuleContext(AlterSpecification_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AlterDefinitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefinitionClause_; }
	}

	public final AlterDefinitionClause_Context alterDefinitionClause_() throws RecognitionException {
		AlterDefinitionClause_Context _localctx = new AlterDefinitionClause_Context(_ctx, getState());
		enterRule(_localctx, 404, RULE_alterDefinitionClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3086);
			alterSpecification_();
			setState(3091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(3087);
				match(COMMA_);
				setState(3088);
				alterSpecification_();
				}
				}
				setState(3093);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterSpecification_Context extends ParserRuleContext {
		public TableOptions_Context tableOptions_() {
			return getRuleContext(TableOptions_Context.class,0);
		}
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public AddIndexSpecificationContext addIndexSpecification() {
			return getRuleContext(AddIndexSpecificationContext.class,0);
		}
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public CheckConstraintDefinition_Context checkConstraintDefinition_() {
			return getRuleContext(CheckConstraintDefinition_Context.class,0);
		}
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode CHECK() { return getToken(MySQLStatementParser.CHECK, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode ENFORCED() { return getToken(MySQLStatementParser.ENFORCED, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode ALGORITHM() { return getToken(MySQLStatementParser.ALGORITHM, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode INSTANT() { return getToken(MySQLStatementParser.INSTANT, 0); }
		public TerminalNode INPLACE() { return getToken(MySQLStatementParser.INPLACE, 0); }
		public TerminalNode COPY() { return getToken(MySQLStatementParser.COPY, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode VISIBLE() { return getToken(MySQLStatementParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(MySQLStatementParser.INVISIBLE, 0); }
		public ChangeColumnSpecificationContext changeColumnSpecification() {
			return getRuleContext(ChangeColumnSpecificationContext.class,0);
		}
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode CONVERT() { return getToken(MySQLStatementParser.CONVERT, 0); }
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode KEYS() { return getToken(MySQLStatementParser.KEYS, 0); }
		public TerminalNode DISABLE() { return getToken(MySQLStatementParser.DISABLE, 0); }
		public TerminalNode ENABLE() { return getToken(MySQLStatementParser.ENABLE, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode DISCARD() { return getToken(MySQLStatementParser.DISCARD, 0); }
		public TerminalNode IMPORT_() { return getToken(MySQLStatementParser.IMPORT_, 0); }
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public DropIndexSpecificationContext dropIndexSpecification() {
			return getRuleContext(DropIndexSpecificationContext.class,0);
		}
		public DropPrimaryKeySpecificationContext dropPrimaryKeySpecification() {
			return getRuleContext(DropPrimaryKeySpecificationContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(MySQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode FORCE() { return getToken(MySQLStatementParser.FORCE, 0); }
		public TerminalNode LOCK() { return getToken(MySQLStatementParser.LOCK, 0); }
		public TerminalNode NONE() { return getToken(MySQLStatementParser.NONE, 0); }
		public TerminalNode SHARED() { return getToken(MySQLStatementParser.SHARED, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(MySQLStatementParser.EXCLUSIVE, 0); }
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(MySQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public RenameColumnSpecificationContext renameColumnSpecification() {
			return getRuleContext(RenameColumnSpecificationContext.class,0);
		}
		public RenameIndexSpecificationContext renameIndexSpecification() {
			return getRuleContext(RenameIndexSpecificationContext.class,0);
		}
		public RenameTableSpecification_Context renameTableSpecification_() {
			return getRuleContext(RenameTableSpecification_Context.class,0);
		}
		public TerminalNode VALIDATION() { return getToken(MySQLStatementParser.VALIDATION, 0); }
		public TerminalNode WITHOUT() { return getToken(MySQLStatementParser.WITHOUT, 0); }
		public List<TerminalNode> WITH() { return getTokens(MySQLStatementParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(MySQLStatementParser.WITH, i);
		}
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public PartitionDefinition_Context partitionDefinition_() {
			return getRuleContext(PartitionDefinition_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode TRUNCATE() { return getToken(MySQLStatementParser.TRUNCATE, 0); }
		public TerminalNode COALESCE() { return getToken(MySQLStatementParser.COALESCE, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode REORGANIZE() { return getToken(MySQLStatementParser.REORGANIZE, 0); }
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public PartitionDefinitions_Context partitionDefinitions_() {
			return getRuleContext(PartitionDefinitions_Context.class,0);
		}
		public TerminalNode EXCHANGE() { return getToken(MySQLStatementParser.EXCHANGE, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(MySQLStatementParser.ANALYZE, 0); }
		public TerminalNode OPTIMIZE() { return getToken(MySQLStatementParser.OPTIMIZE, 0); }
		public TerminalNode REBUILD() { return getToken(MySQLStatementParser.REBUILD, 0); }
		public TerminalNode REPAIR() { return getToken(MySQLStatementParser.REPAIR, 0); }
		public TerminalNode REMOVE() { return getToken(MySQLStatementParser.REMOVE, 0); }
		public TerminalNode PARTITIONING() { return getToken(MySQLStatementParser.PARTITIONING, 0); }
		public TerminalNode UPGRADE() { return getToken(MySQLStatementParser.UPGRADE, 0); }
		public AlterSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSpecification_; }
	}

	public final AlterSpecification_Context alterSpecification_() throws RecognitionException {
		AlterSpecification_Context _localctx = new AlterSpecification_Context(_ctx, getState());
		enterRule(_localctx, 406, RULE_alterSpecification_);
		int _la;
		try {
			setState(3255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3094);
				tableOptions_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3095);
				addColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3096);
				addIndexSpecification();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3097);
				addConstraintSpecification();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3098);
				match(ADD);
				setState(3099);
				checkConstraintDefinition_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3100);
				match(DROP);
				setState(3101);
				match(CHECK);
				setState(3102);
				ignoredIdentifier_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3103);
				match(ALTER);
				setState(3104);
				match(CHECK);
				setState(3105);
				ignoredIdentifier_();
				setState(3107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(3106);
					match(NOT);
					}
				}

				setState(3109);
				match(ENFORCED);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3111);
				match(ALGORITHM);
				setState(3113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3112);
					match(EQ_);
					}
				}

				setState(3115);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==COPY || _la==INPLACE || _la==INSTANT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3116);
				match(ALTER);
				setState(3118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(3117);
					match(COLUMN);
					}
				}

				setState(3120);
				columnName();
				setState(3126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SET:
					{
					setState(3121);
					match(SET);
					setState(3122);
					match(DEFAULT);
					setState(3123);
					literals();
					}
					break;
				case DROP:
					{
					setState(3124);
					match(DROP);
					setState(3125);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3128);
				match(ALTER);
				setState(3129);
				match(INDEX);
				setState(3130);
				indexName();
				setState(3131);
				_la = _input.LA(1);
				if ( !(_la==VISIBLE || _la==INVISIBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3133);
				changeColumnSpecification();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(3134);
					match(DEFAULT);
					}
				}

				setState(3137);
				characterSet_();
				setState(3139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(3138);
					collateClause_();
					}
				}

				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3141);
				match(CONVERT);
				setState(3142);
				match(TO);
				setState(3143);
				characterSet_();
				setState(3145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(3144);
					collateClause_();
					}
				}

				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3147);
				_la = _input.LA(1);
				if ( !(_la==ENABLE || _la==DISABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3148);
				match(KEYS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3149);
				_la = _input.LA(1);
				if ( !(_la==DISCARD || _la==IMPORT_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3150);
				match(TABLESPACE);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3151);
				dropColumnSpecification();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3152);
				dropIndexSpecification();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3153);
				dropPrimaryKeySpecification();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3154);
				match(DROP);
				setState(3155);
				match(FOREIGN);
				setState(3156);
				match(KEY);
				setState(3157);
				ignoredIdentifier_();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3158);
				match(FORCE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(3159);
				match(LOCK);
				setState(3161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3160);
					match(EQ_);
					}
				}

				setState(3163);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || ((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & ((1L << (EXCLUSIVE - 281)) | (1L << (NONE - 281)) | (1L << (SHARED - 281)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(3164);
				modifyColumnSpecification();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(3165);
				match(ORDER);
				setState(3166);
				match(BY);
				setState(3167);
				columnNames();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(3168);
				renameColumnSpecification();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(3169);
				renameIndexSpecification();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(3170);
				renameTableSpecification_();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(3171);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3172);
				match(VALIDATION);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(3173);
				match(ADD);
				setState(3174);
				match(PARTITION);
				setState(3175);
				match(LP_);
				setState(3176);
				partitionDefinition_();
				setState(3177);
				match(RP_);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(3179);
				match(DROP);
				setState(3180);
				match(PARTITION);
				setState(3181);
				ignoredIdentifiers_();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(3182);
				match(DISCARD);
				setState(3183);
				match(PARTITION);
				setState(3186);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUNCATE:
				case POSITION:
				case VIEW:
				case ANY:
				case OFFSET:
				case BEGIN:
				case COMMIT:
				case ROLLBACK:
				case SAVEPOINT:
				case BOOLEAN:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case YEAR:
				case QUARTER:
				case MONTH:
				case WEEK:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case MICROSECOND:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case CURRENT:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case DO:
				case DEFINER:
				case CASCADED:
				case LOCAL:
				case CLOSE:
				case OPEN:
				case NEXT:
				case NAME:
				case TABLES:
				case TABLESPACE:
				case COLUMNS:
				case FIELDS:
				case INDEXES:
				case STATUS:
				case MODIFY:
				case VALUE:
				case DUPLICATE:
				case FIRST:
				case LAST:
				case AFTER:
				case OJ:
				case ACCOUNT:
				case USER:
				case ROLE:
				case START:
				case TRANSACTION:
				case WITHOUT:
				case ESCAPE:
				case SUBPARTITION:
				case STORAGE:
				case SUPER:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case ROLLUP:
				case SOUNDS:
				case UNKNOWN:
				case OFF:
				case ALWAYS:
				case COMMITTED:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ACTION:
				case ALGORITHM:
				case AUTOCOMMIT:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DISCARD:
				case DISK:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case LESS:
				case MEMORY:
				case NONE:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXTENDED:
				case EXPANSION:
				case VARIANCE:
				case MAX_ROWS:
				case MIN_ROWS:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case ROW_FORMAT:
				case WEIGHT_STRING:
				case COLUMN_FORMAT:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case PACK_KEYS:
				case PERSIST_ONLY:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case DELAY_KEY_WRITE:
				case ROTATE:
				case MASTER:
				case BINLOG:
				case ERROR:
				case SCHEDULE:
				case COMPLETION:
				case EVERY:
				case HOST:
				case SOCKET:
				case PORT:
				case SERVER:
				case WRAPPER:
				case OPTIONS:
				case OWNER:
				case RETURNS:
				case CONTAINS:
				case SECURITY:
				case INVOKER:
				case TEMPTABLE:
				case MERGE:
				case UNDEFINED:
				case DATAFILE:
				case FILE_BLOCK_SIZE:
				case EXTENT_SIZE:
				case INITIAL_SIZE:
				case AUTOEXTEND_SIZE:
				case MAX_SIZE:
				case NODEGROUP:
				case WAIT:
				case LOGFILE:
				case UNDOFILE:
				case UNDO_BUFFER_SIZE:
				case REDO_BUFFER_SIZE:
				case HANDLER:
				case PREV:
				case ORGANIZATION:
				case DEFINITION:
				case DESCRIPTION:
				case REFERENCE:
				case FOLLOWS:
				case PRECEDES:
				case IMPORT:
				case CONCURRENT:
				case XML:
				case DUMPFILE:
				case SHARE:
				case IDENTIFIER_:
					{
					setState(3184);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(3185);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3188);
				match(TABLESPACE);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(3189);
				match(IMPORT_);
				setState(3190);
				match(PARTITION);
				setState(3193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUNCATE:
				case POSITION:
				case VIEW:
				case ANY:
				case OFFSET:
				case BEGIN:
				case COMMIT:
				case ROLLBACK:
				case SAVEPOINT:
				case BOOLEAN:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case YEAR:
				case QUARTER:
				case MONTH:
				case WEEK:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case MICROSECOND:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case CURRENT:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case DO:
				case DEFINER:
				case CASCADED:
				case LOCAL:
				case CLOSE:
				case OPEN:
				case NEXT:
				case NAME:
				case TABLES:
				case TABLESPACE:
				case COLUMNS:
				case FIELDS:
				case INDEXES:
				case STATUS:
				case MODIFY:
				case VALUE:
				case DUPLICATE:
				case FIRST:
				case LAST:
				case AFTER:
				case OJ:
				case ACCOUNT:
				case USER:
				case ROLE:
				case START:
				case TRANSACTION:
				case WITHOUT:
				case ESCAPE:
				case SUBPARTITION:
				case STORAGE:
				case SUPER:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case ROLLUP:
				case SOUNDS:
				case UNKNOWN:
				case OFF:
				case ALWAYS:
				case COMMITTED:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ACTION:
				case ALGORITHM:
				case AUTOCOMMIT:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DISCARD:
				case DISK:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case LESS:
				case MEMORY:
				case NONE:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXTENDED:
				case EXPANSION:
				case VARIANCE:
				case MAX_ROWS:
				case MIN_ROWS:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case ROW_FORMAT:
				case WEIGHT_STRING:
				case COLUMN_FORMAT:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case PACK_KEYS:
				case PERSIST_ONLY:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case DELAY_KEY_WRITE:
				case ROTATE:
				case MASTER:
				case BINLOG:
				case ERROR:
				case SCHEDULE:
				case COMPLETION:
				case EVERY:
				case HOST:
				case SOCKET:
				case PORT:
				case SERVER:
				case WRAPPER:
				case OPTIONS:
				case OWNER:
				case RETURNS:
				case CONTAINS:
				case SECURITY:
				case INVOKER:
				case TEMPTABLE:
				case MERGE:
				case UNDEFINED:
				case DATAFILE:
				case FILE_BLOCK_SIZE:
				case EXTENT_SIZE:
				case INITIAL_SIZE:
				case AUTOEXTEND_SIZE:
				case MAX_SIZE:
				case NODEGROUP:
				case WAIT:
				case LOGFILE:
				case UNDOFILE:
				case UNDO_BUFFER_SIZE:
				case REDO_BUFFER_SIZE:
				case HANDLER:
				case PREV:
				case ORGANIZATION:
				case DEFINITION:
				case DESCRIPTION:
				case REFERENCE:
				case FOLLOWS:
				case PRECEDES:
				case IMPORT:
				case CONCURRENT:
				case XML:
				case DUMPFILE:
				case SHARE:
				case IDENTIFIER_:
					{
					setState(3191);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(3192);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3195);
				match(TABLESPACE);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(3196);
				match(TRUNCATE);
				setState(3197);
				match(PARTITION);
				setState(3200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUNCATE:
				case POSITION:
				case VIEW:
				case ANY:
				case OFFSET:
				case BEGIN:
				case COMMIT:
				case ROLLBACK:
				case SAVEPOINT:
				case BOOLEAN:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case YEAR:
				case QUARTER:
				case MONTH:
				case WEEK:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case MICROSECOND:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case CURRENT:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case DO:
				case DEFINER:
				case CASCADED:
				case LOCAL:
				case CLOSE:
				case OPEN:
				case NEXT:
				case NAME:
				case TABLES:
				case TABLESPACE:
				case COLUMNS:
				case FIELDS:
				case INDEXES:
				case STATUS:
				case MODIFY:
				case VALUE:
				case DUPLICATE:
				case FIRST:
				case LAST:
				case AFTER:
				case OJ:
				case ACCOUNT:
				case USER:
				case ROLE:
				case START:
				case TRANSACTION:
				case WITHOUT:
				case ESCAPE:
				case SUBPARTITION:
				case STORAGE:
				case SUPER:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case ROLLUP:
				case SOUNDS:
				case UNKNOWN:
				case OFF:
				case ALWAYS:
				case COMMITTED:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ACTION:
				case ALGORITHM:
				case AUTOCOMMIT:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DISCARD:
				case DISK:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case LESS:
				case MEMORY:
				case NONE:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXTENDED:
				case EXPANSION:
				case VARIANCE:
				case MAX_ROWS:
				case MIN_ROWS:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case ROW_FORMAT:
				case WEIGHT_STRING:
				case COLUMN_FORMAT:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case PACK_KEYS:
				case PERSIST_ONLY:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case DELAY_KEY_WRITE:
				case ROTATE:
				case MASTER:
				case BINLOG:
				case ERROR:
				case SCHEDULE:
				case COMPLETION:
				case EVERY:
				case HOST:
				case SOCKET:
				case PORT:
				case SERVER:
				case WRAPPER:
				case OPTIONS:
				case OWNER:
				case RETURNS:
				case CONTAINS:
				case SECURITY:
				case INVOKER:
				case TEMPTABLE:
				case MERGE:
				case UNDEFINED:
				case DATAFILE:
				case FILE_BLOCK_SIZE:
				case EXTENT_SIZE:
				case INITIAL_SIZE:
				case AUTOEXTEND_SIZE:
				case MAX_SIZE:
				case NODEGROUP:
				case WAIT:
				case LOGFILE:
				case UNDOFILE:
				case UNDO_BUFFER_SIZE:
				case REDO_BUFFER_SIZE:
				case HANDLER:
				case PREV:
				case ORGANIZATION:
				case DEFINITION:
				case DESCRIPTION:
				case REFERENCE:
				case FOLLOWS:
				case PRECEDES:
				case IMPORT:
				case CONCURRENT:
				case XML:
				case DUMPFILE:
				case SHARE:
				case IDENTIFIER_:
					{
					setState(3198);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(3199);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(3202);
				match(COALESCE);
				setState(3203);
				match(PARTITION);
				setState(3204);
				match(NUMBER_);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(3205);
				match(REORGANIZE);
				setState(3206);
				match(PARTITION);
				setState(3207);
				ignoredIdentifiers_();
				setState(3208);
				match(INTO);
				setState(3209);
				partitionDefinitions_();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(3211);
				match(EXCHANGE);
				setState(3212);
				match(PARTITION);
				setState(3213);
				ignoredIdentifier_();
				setState(3214);
				match(WITH);
				setState(3215);
				match(TABLE);
				setState(3216);
				tableName();
				setState(3219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH || _la==WITHOUT) {
					{
					setState(3217);
					_la = _input.LA(1);
					if ( !(_la==WITH || _la==WITHOUT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3218);
					match(VALIDATION);
					}
				}

				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(3221);
				match(ANALYZE);
				setState(3222);
				match(PARTITION);
				setState(3225);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUNCATE:
				case POSITION:
				case VIEW:
				case ANY:
				case OFFSET:
				case BEGIN:
				case COMMIT:
				case ROLLBACK:
				case SAVEPOINT:
				case BOOLEAN:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case YEAR:
				case QUARTER:
				case MONTH:
				case WEEK:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case MICROSECOND:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case CURRENT:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case DO:
				case DEFINER:
				case CASCADED:
				case LOCAL:
				case CLOSE:
				case OPEN:
				case NEXT:
				case NAME:
				case TABLES:
				case TABLESPACE:
				case COLUMNS:
				case FIELDS:
				case INDEXES:
				case STATUS:
				case MODIFY:
				case VALUE:
				case DUPLICATE:
				case FIRST:
				case LAST:
				case AFTER:
				case OJ:
				case ACCOUNT:
				case USER:
				case ROLE:
				case START:
				case TRANSACTION:
				case WITHOUT:
				case ESCAPE:
				case SUBPARTITION:
				case STORAGE:
				case SUPER:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case ROLLUP:
				case SOUNDS:
				case UNKNOWN:
				case OFF:
				case ALWAYS:
				case COMMITTED:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ACTION:
				case ALGORITHM:
				case AUTOCOMMIT:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DISCARD:
				case DISK:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case LESS:
				case MEMORY:
				case NONE:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXTENDED:
				case EXPANSION:
				case VARIANCE:
				case MAX_ROWS:
				case MIN_ROWS:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case ROW_FORMAT:
				case WEIGHT_STRING:
				case COLUMN_FORMAT:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case PACK_KEYS:
				case PERSIST_ONLY:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case DELAY_KEY_WRITE:
				case ROTATE:
				case MASTER:
				case BINLOG:
				case ERROR:
				case SCHEDULE:
				case COMPLETION:
				case EVERY:
				case HOST:
				case SOCKET:
				case PORT:
				case SERVER:
				case WRAPPER:
				case OPTIONS:
				case OWNER:
				case RETURNS:
				case CONTAINS:
				case SECURITY:
				case INVOKER:
				case TEMPTABLE:
				case MERGE:
				case UNDEFINED:
				case DATAFILE:
				case FILE_BLOCK_SIZE:
				case EXTENT_SIZE:
				case INITIAL_SIZE:
				case AUTOEXTEND_SIZE:
				case MAX_SIZE:
				case NODEGROUP:
				case WAIT:
				case LOGFILE:
				case UNDOFILE:
				case UNDO_BUFFER_SIZE:
				case REDO_BUFFER_SIZE:
				case HANDLER:
				case PREV:
				case ORGANIZATION:
				case DEFINITION:
				case DESCRIPTION:
				case REFERENCE:
				case FOLLOWS:
				case PRECEDES:
				case IMPORT:
				case CONCURRENT:
				case XML:
				case DUMPFILE:
				case SHARE:
				case IDENTIFIER_:
					{
					setState(3223);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(3224);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(3227);
				match(CHECK);
				setState(3228);
				match(PARTITION);
				setState(3231);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUNCATE:
				case POSITION:
				case VIEW:
				case ANY:
				case OFFSET:
				case BEGIN:
				case COMMIT:
				case ROLLBACK:
				case SAVEPOINT:
				case BOOLEAN:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case YEAR:
				case QUARTER:
				case MONTH:
				case WEEK:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case MICROSECOND:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case CURRENT:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case DO:
				case DEFINER:
				case CASCADED:
				case LOCAL:
				case CLOSE:
				case OPEN:
				case NEXT:
				case NAME:
				case TABLES:
				case TABLESPACE:
				case COLUMNS:
				case FIELDS:
				case INDEXES:
				case STATUS:
				case MODIFY:
				case VALUE:
				case DUPLICATE:
				case FIRST:
				case LAST:
				case AFTER:
				case OJ:
				case ACCOUNT:
				case USER:
				case ROLE:
				case START:
				case TRANSACTION:
				case WITHOUT:
				case ESCAPE:
				case SUBPARTITION:
				case STORAGE:
				case SUPER:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case ROLLUP:
				case SOUNDS:
				case UNKNOWN:
				case OFF:
				case ALWAYS:
				case COMMITTED:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ACTION:
				case ALGORITHM:
				case AUTOCOMMIT:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DISCARD:
				case DISK:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case LESS:
				case MEMORY:
				case NONE:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXTENDED:
				case EXPANSION:
				case VARIANCE:
				case MAX_ROWS:
				case MIN_ROWS:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case ROW_FORMAT:
				case WEIGHT_STRING:
				case COLUMN_FORMAT:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case PACK_KEYS:
				case PERSIST_ONLY:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case DELAY_KEY_WRITE:
				case ROTATE:
				case MASTER:
				case BINLOG:
				case ERROR:
				case SCHEDULE:
				case COMPLETION:
				case EVERY:
				case HOST:
				case SOCKET:
				case PORT:
				case SERVER:
				case WRAPPER:
				case OPTIONS:
				case OWNER:
				case RETURNS:
				case CONTAINS:
				case SECURITY:
				case INVOKER:
				case TEMPTABLE:
				case MERGE:
				case UNDEFINED:
				case DATAFILE:
				case FILE_BLOCK_SIZE:
				case EXTENT_SIZE:
				case INITIAL_SIZE:
				case AUTOEXTEND_SIZE:
				case MAX_SIZE:
				case NODEGROUP:
				case WAIT:
				case LOGFILE:
				case UNDOFILE:
				case UNDO_BUFFER_SIZE:
				case REDO_BUFFER_SIZE:
				case HANDLER:
				case PREV:
				case ORGANIZATION:
				case DEFINITION:
				case DESCRIPTION:
				case REFERENCE:
				case FOLLOWS:
				case PRECEDES:
				case IMPORT:
				case CONCURRENT:
				case XML:
				case DUMPFILE:
				case SHARE:
				case IDENTIFIER_:
					{
					setState(3229);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(3230);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(3233);
				match(OPTIMIZE);
				setState(3234);
				match(PARTITION);
				setState(3237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUNCATE:
				case POSITION:
				case VIEW:
				case ANY:
				case OFFSET:
				case BEGIN:
				case COMMIT:
				case ROLLBACK:
				case SAVEPOINT:
				case BOOLEAN:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case YEAR:
				case QUARTER:
				case MONTH:
				case WEEK:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case MICROSECOND:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case CURRENT:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case DO:
				case DEFINER:
				case CASCADED:
				case LOCAL:
				case CLOSE:
				case OPEN:
				case NEXT:
				case NAME:
				case TABLES:
				case TABLESPACE:
				case COLUMNS:
				case FIELDS:
				case INDEXES:
				case STATUS:
				case MODIFY:
				case VALUE:
				case DUPLICATE:
				case FIRST:
				case LAST:
				case AFTER:
				case OJ:
				case ACCOUNT:
				case USER:
				case ROLE:
				case START:
				case TRANSACTION:
				case WITHOUT:
				case ESCAPE:
				case SUBPARTITION:
				case STORAGE:
				case SUPER:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case ROLLUP:
				case SOUNDS:
				case UNKNOWN:
				case OFF:
				case ALWAYS:
				case COMMITTED:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ACTION:
				case ALGORITHM:
				case AUTOCOMMIT:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DISCARD:
				case DISK:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case LESS:
				case MEMORY:
				case NONE:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXTENDED:
				case EXPANSION:
				case VARIANCE:
				case MAX_ROWS:
				case MIN_ROWS:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case ROW_FORMAT:
				case WEIGHT_STRING:
				case COLUMN_FORMAT:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case PACK_KEYS:
				case PERSIST_ONLY:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case DELAY_KEY_WRITE:
				case ROTATE:
				case MASTER:
				case BINLOG:
				case ERROR:
				case SCHEDULE:
				case COMPLETION:
				case EVERY:
				case HOST:
				case SOCKET:
				case PORT:
				case SERVER:
				case WRAPPER:
				case OPTIONS:
				case OWNER:
				case RETURNS:
				case CONTAINS:
				case SECURITY:
				case INVOKER:
				case TEMPTABLE:
				case MERGE:
				case UNDEFINED:
				case DATAFILE:
				case FILE_BLOCK_SIZE:
				case EXTENT_SIZE:
				case INITIAL_SIZE:
				case AUTOEXTEND_SIZE:
				case MAX_SIZE:
				case NODEGROUP:
				case WAIT:
				case LOGFILE:
				case UNDOFILE:
				case UNDO_BUFFER_SIZE:
				case REDO_BUFFER_SIZE:
				case HANDLER:
				case PREV:
				case ORGANIZATION:
				case DEFINITION:
				case DESCRIPTION:
				case REFERENCE:
				case FOLLOWS:
				case PRECEDES:
				case IMPORT:
				case CONCURRENT:
				case XML:
				case DUMPFILE:
				case SHARE:
				case IDENTIFIER_:
					{
					setState(3235);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(3236);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(3239);
				match(REBUILD);
				setState(3240);
				match(PARTITION);
				setState(3243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUNCATE:
				case POSITION:
				case VIEW:
				case ANY:
				case OFFSET:
				case BEGIN:
				case COMMIT:
				case ROLLBACK:
				case SAVEPOINT:
				case BOOLEAN:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case YEAR:
				case QUARTER:
				case MONTH:
				case WEEK:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case MICROSECOND:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case CURRENT:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case DO:
				case DEFINER:
				case CASCADED:
				case LOCAL:
				case CLOSE:
				case OPEN:
				case NEXT:
				case NAME:
				case TABLES:
				case TABLESPACE:
				case COLUMNS:
				case FIELDS:
				case INDEXES:
				case STATUS:
				case MODIFY:
				case VALUE:
				case DUPLICATE:
				case FIRST:
				case LAST:
				case AFTER:
				case OJ:
				case ACCOUNT:
				case USER:
				case ROLE:
				case START:
				case TRANSACTION:
				case WITHOUT:
				case ESCAPE:
				case SUBPARTITION:
				case STORAGE:
				case SUPER:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case ROLLUP:
				case SOUNDS:
				case UNKNOWN:
				case OFF:
				case ALWAYS:
				case COMMITTED:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ACTION:
				case ALGORITHM:
				case AUTOCOMMIT:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DISCARD:
				case DISK:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case LESS:
				case MEMORY:
				case NONE:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXTENDED:
				case EXPANSION:
				case VARIANCE:
				case MAX_ROWS:
				case MIN_ROWS:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case ROW_FORMAT:
				case WEIGHT_STRING:
				case COLUMN_FORMAT:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case PACK_KEYS:
				case PERSIST_ONLY:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case DELAY_KEY_WRITE:
				case ROTATE:
				case MASTER:
				case BINLOG:
				case ERROR:
				case SCHEDULE:
				case COMPLETION:
				case EVERY:
				case HOST:
				case SOCKET:
				case PORT:
				case SERVER:
				case WRAPPER:
				case OPTIONS:
				case OWNER:
				case RETURNS:
				case CONTAINS:
				case SECURITY:
				case INVOKER:
				case TEMPTABLE:
				case MERGE:
				case UNDEFINED:
				case DATAFILE:
				case FILE_BLOCK_SIZE:
				case EXTENT_SIZE:
				case INITIAL_SIZE:
				case AUTOEXTEND_SIZE:
				case MAX_SIZE:
				case NODEGROUP:
				case WAIT:
				case LOGFILE:
				case UNDOFILE:
				case UNDO_BUFFER_SIZE:
				case REDO_BUFFER_SIZE:
				case HANDLER:
				case PREV:
				case ORGANIZATION:
				case DEFINITION:
				case DESCRIPTION:
				case REFERENCE:
				case FOLLOWS:
				case PRECEDES:
				case IMPORT:
				case CONCURRENT:
				case XML:
				case DUMPFILE:
				case SHARE:
				case IDENTIFIER_:
					{
					setState(3241);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(3242);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(3245);
				match(REPAIR);
				setState(3246);
				match(PARTITION);
				setState(3249);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUNCATE:
				case POSITION:
				case VIEW:
				case ANY:
				case OFFSET:
				case BEGIN:
				case COMMIT:
				case ROLLBACK:
				case SAVEPOINT:
				case BOOLEAN:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case YEAR:
				case QUARTER:
				case MONTH:
				case WEEK:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case MICROSECOND:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case CURRENT:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case DO:
				case DEFINER:
				case CASCADED:
				case LOCAL:
				case CLOSE:
				case OPEN:
				case NEXT:
				case NAME:
				case TABLES:
				case TABLESPACE:
				case COLUMNS:
				case FIELDS:
				case INDEXES:
				case STATUS:
				case MODIFY:
				case VALUE:
				case DUPLICATE:
				case FIRST:
				case LAST:
				case AFTER:
				case OJ:
				case ACCOUNT:
				case USER:
				case ROLE:
				case START:
				case TRANSACTION:
				case WITHOUT:
				case ESCAPE:
				case SUBPARTITION:
				case STORAGE:
				case SUPER:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case ROLLUP:
				case SOUNDS:
				case UNKNOWN:
				case OFF:
				case ALWAYS:
				case COMMITTED:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ACTION:
				case ALGORITHM:
				case AUTOCOMMIT:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DISCARD:
				case DISK:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case LESS:
				case MEMORY:
				case NONE:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXTENDED:
				case EXPANSION:
				case VARIANCE:
				case MAX_ROWS:
				case MIN_ROWS:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case ROW_FORMAT:
				case WEIGHT_STRING:
				case COLUMN_FORMAT:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case PACK_KEYS:
				case PERSIST_ONLY:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case DELAY_KEY_WRITE:
				case ROTATE:
				case MASTER:
				case BINLOG:
				case ERROR:
				case SCHEDULE:
				case COMPLETION:
				case EVERY:
				case HOST:
				case SOCKET:
				case PORT:
				case SERVER:
				case WRAPPER:
				case OPTIONS:
				case OWNER:
				case RETURNS:
				case CONTAINS:
				case SECURITY:
				case INVOKER:
				case TEMPTABLE:
				case MERGE:
				case UNDEFINED:
				case DATAFILE:
				case FILE_BLOCK_SIZE:
				case EXTENT_SIZE:
				case INITIAL_SIZE:
				case AUTOEXTEND_SIZE:
				case MAX_SIZE:
				case NODEGROUP:
				case WAIT:
				case LOGFILE:
				case UNDOFILE:
				case UNDO_BUFFER_SIZE:
				case REDO_BUFFER_SIZE:
				case HANDLER:
				case PREV:
				case ORGANIZATION:
				case DEFINITION:
				case DESCRIPTION:
				case REFERENCE:
				case FOLLOWS:
				case PRECEDES:
				case IMPORT:
				case CONCURRENT:
				case XML:
				case DUMPFILE:
				case SHARE:
				case IDENTIFIER_:
					{
					setState(3247);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(3248);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(3251);
				match(REMOVE);
				setState(3252);
				match(PARTITIONING);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(3253);
				match(UPGRADE);
				setState(3254);
				match(PARTITIONING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOptions_Context extends ParserRuleContext {
		public List<TableOption_Context> tableOption_() {
			return getRuleContexts(TableOption_Context.class);
		}
		public TableOption_Context tableOption_(int i) {
			return getRuleContext(TableOption_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TableOptions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptions_; }
	}

	public final TableOptions_Context tableOptions_() throws RecognitionException {
		TableOptions_Context _localctx = new TableOptions_Context(_ctx, getState());
		enterRule(_localctx, 408, RULE_tableOptions_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3257);
			tableOption_();
			setState(3264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,434,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA_) {
						{
						setState(3258);
						match(COMMA_);
						}
					}

					setState(3261);
					tableOption_();
					}
					} 
				}
				setState(3266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,434,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOption_Context extends ParserRuleContext {
		public TerminalNode AUTO_INCREMENT() { return getToken(MySQLStatementParser.AUTO_INCREMENT, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode AVG_ROW_LENGTH() { return getToken(MySQLStatementParser.AVG_ROW_LENGTH, 0); }
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode CHECKSUM() { return getToken(MySQLStatementParser.CHECKSUM, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode COMPRESSION() { return getToken(MySQLStatementParser.COMPRESSION, 0); }
		public TerminalNode CONNECTION() { return getToken(MySQLStatementParser.CONNECTION, 0); }
		public TerminalNode DIRECTORY() { return getToken(MySQLStatementParser.DIRECTORY, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode DELAY_KEY_WRITE() { return getToken(MySQLStatementParser.DELAY_KEY_WRITE, 0); }
		public TerminalNode ENCRYPTION() { return getToken(MySQLStatementParser.ENCRYPTION, 0); }
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode INSERT_METHOD() { return getToken(MySQLStatementParser.INSERT_METHOD, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(MySQLStatementParser.LAST, 0); }
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(MySQLStatementParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode MAX_ROWS() { return getToken(MySQLStatementParser.MAX_ROWS, 0); }
		public TerminalNode MIN_ROWS() { return getToken(MySQLStatementParser.MIN_ROWS, 0); }
		public TerminalNode PACK_KEYS() { return getToken(MySQLStatementParser.PACK_KEYS, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public TerminalNode ROW_FORMAT() { return getToken(MySQLStatementParser.ROW_FORMAT, 0); }
		public TerminalNode DYNAMIC() { return getToken(MySQLStatementParser.DYNAMIC, 0); }
		public TerminalNode FIXED() { return getToken(MySQLStatementParser.FIXED, 0); }
		public TerminalNode COMPRESSED() { return getToken(MySQLStatementParser.COMPRESSED, 0); }
		public TerminalNode REDUNDANT() { return getToken(MySQLStatementParser.REDUNDANT, 0); }
		public TerminalNode COMPACT() { return getToken(MySQLStatementParser.COMPACT, 0); }
		public TerminalNode STATS_AUTO_RECALC() { return getToken(MySQLStatementParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode STATS_PERSISTENT() { return getToken(MySQLStatementParser.STATS_PERSISTENT, 0); }
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(MySQLStatementParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode DISK() { return getToken(MySQLStatementParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(MySQLStatementParser.MEMORY, 0); }
		public TerminalNode UNION() { return getToken(MySQLStatementParser.UNION, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TableOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOption_; }
	}

	public final TableOption_Context tableOption_() throws RecognitionException {
		TableOption_Context _localctx = new TableOption_Context(_ctx, getState());
		enterRule(_localctx, 410, RULE_tableOption_);
		int _la;
		try {
			setState(3396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3267);
				match(AUTO_INCREMENT);
				setState(3269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3268);
					match(EQ_);
					}
				}

				setState(3271);
				match(NUMBER_);
				}
				break;
			case AVG_ROW_LENGTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(3272);
				match(AVG_ROW_LENGTH);
				setState(3274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3273);
					match(EQ_);
					}
				}

				setState(3276);
				match(NUMBER_);
				}
				break;
			case CHAR:
			case CHARACTER:
			case DEFAULT:
			case COLLATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(3278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(3277);
					match(DEFAULT);
					}
				}

				setState(3282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
				case CHARACTER:
					{
					setState(3280);
					characterSet_();
					}
					break;
				case COLLATE:
					{
					setState(3281);
					collateClause_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(3284);
				match(CHECKSUM);
				setState(3286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3285);
					match(EQ_);
					}
				}

				setState(3288);
				match(NUMBER_);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(3289);
				match(COMMENT);
				setState(3291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3290);
					match(EQ_);
					}
				}

				setState(3293);
				match(STRING_);
				}
				break;
			case COMPRESSION:
				enterOuterAlt(_localctx, 6);
				{
				setState(3294);
				match(COMPRESSION);
				setState(3296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3295);
					match(EQ_);
					}
				}

				setState(3298);
				match(STRING_);
				}
				break;
			case CONNECTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(3299);
				match(CONNECTION);
				setState(3301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3300);
					match(EQ_);
					}
				}

				setState(3303);
				match(STRING_);
				}
				break;
			case INDEX:
			case DATA:
				enterOuterAlt(_localctx, 8);
				{
				setState(3304);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==DATA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3305);
				match(DIRECTORY);
				setState(3307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3306);
					match(EQ_);
					}
				}

				setState(3309);
				match(STRING_);
				}
				break;
			case DELAY_KEY_WRITE:
				enterOuterAlt(_localctx, 9);
				{
				setState(3310);
				match(DELAY_KEY_WRITE);
				setState(3312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3311);
					match(EQ_);
					}
				}

				setState(3314);
				match(NUMBER_);
				}
				break;
			case ENCRYPTION:
				enterOuterAlt(_localctx, 10);
				{
				setState(3315);
				match(ENCRYPTION);
				setState(3317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3316);
					match(EQ_);
					}
				}

				setState(3319);
				match(STRING_);
				}
				break;
			case ENGINE:
				enterOuterAlt(_localctx, 11);
				{
				setState(3320);
				match(ENGINE);
				setState(3322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3321);
					match(EQ_);
					}
				}

				setState(3324);
				ignoredIdentifier_();
				}
				break;
			case INSERT_METHOD:
				enterOuterAlt(_localctx, 12);
				{
				setState(3325);
				match(INSERT_METHOD);
				setState(3327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3326);
					match(EQ_);
					}
				}

				setState(3329);
				_la = _input.LA(1);
				if ( !(((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (FIRST - 193)) | (1L << (LAST - 193)) | (1L << (NO - 193)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 13);
				{
				setState(3330);
				match(KEY_BLOCK_SIZE);
				setState(3332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3331);
					match(EQ_);
					}
				}

				setState(3334);
				match(NUMBER_);
				}
				break;
			case MAX_ROWS:
				enterOuterAlt(_localctx, 14);
				{
				setState(3335);
				match(MAX_ROWS);
				setState(3337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3336);
					match(EQ_);
					}
				}

				setState(3339);
				match(NUMBER_);
				}
				break;
			case MIN_ROWS:
				enterOuterAlt(_localctx, 15);
				{
				setState(3340);
				match(MIN_ROWS);
				setState(3342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3341);
					match(EQ_);
					}
				}

				setState(3344);
				match(NUMBER_);
				}
				break;
			case PACK_KEYS:
				enterOuterAlt(_localctx, 16);
				{
				setState(3345);
				match(PACK_KEYS);
				setState(3347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3346);
					match(EQ_);
					}
				}

				setState(3349);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case PASSWORD:
				enterOuterAlt(_localctx, 17);
				{
				setState(3350);
				match(PASSWORD);
				setState(3352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3351);
					match(EQ_);
					}
				}

				setState(3354);
				match(STRING_);
				}
				break;
			case ROW_FORMAT:
				enterOuterAlt(_localctx, 18);
				{
				setState(3355);
				match(ROW_FORMAT);
				setState(3357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3356);
					match(EQ_);
					}
				}

				setState(3359);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (COMPACT - 262)) | (1L << (COMPRESSED - 262)) | (1L << (DYNAMIC - 262)) | (1L << (FIXED - 262)) | (1L << (REDUNDANT - 262)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STATS_AUTO_RECALC:
				enterOuterAlt(_localctx, 19);
				{
				setState(3360);
				match(STATS_AUTO_RECALC);
				setState(3362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3361);
					match(EQ_);
					}
				}

				setState(3364);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STATS_PERSISTENT:
				enterOuterAlt(_localctx, 20);
				{
				setState(3365);
				match(STATS_PERSISTENT);
				setState(3367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3366);
					match(EQ_);
					}
				}

				setState(3369);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STATS_SAMPLE_PAGES:
				enterOuterAlt(_localctx, 21);
				{
				setState(3370);
				match(STATS_SAMPLE_PAGES);
				setState(3372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3371);
					match(EQ_);
					}
				}

				setState(3374);
				match(NUMBER_);
				}
				break;
			case TABLESPACE:
				enterOuterAlt(_localctx, 22);
				{
				setState(3375);
				match(TABLESPACE);
				setState(3376);
				ignoredIdentifier_();
				setState(3379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORAGE) {
					{
					setState(3377);
					match(STORAGE);
					setState(3378);
					_la = _input.LA(1);
					if ( !(_la==DEFAULT || _la==DISK || _la==MEMORY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 23);
				{
				setState(3381);
				match(UNION);
				setState(3383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3382);
					match(EQ_);
					}
				}

				setState(3385);
				match(LP_);
				setState(3386);
				tableName();
				setState(3391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(3387);
					match(COMMA_);
					setState(3388);
					tableName();
					}
					}
					setState(3393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3394);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public FirstOrAfterColumnContext firstOrAfterColumn() {
			return getRuleContext(FirstOrAfterColumnContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3398);
			match(ADD);
			setState(3400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(3399);
				match(COLUMN);
				}
			}

			setState(3417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case WITHOUT:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MEMORY:
			case NONE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
				{
				setState(3402);
				columnDefinition();
				setState(3404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(3403);
					firstOrAfterColumn();
					}
				}

				}
				break;
			case LP_:
				{
				setState(3406);
				match(LP_);
				setState(3407);
				columnDefinition();
				setState(3412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(3408);
					match(COMMA_);
					setState(3409);
					columnDefinition();
					}
					}
					setState(3414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3415);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstOrAfterColumnContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(MySQLStatementParser.AFTER, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public FirstOrAfterColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstOrAfterColumn; }
	}

	public final FirstOrAfterColumnContext firstOrAfterColumn() throws RecognitionException {
		FirstOrAfterColumnContext _localctx = new FirstOrAfterColumnContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_firstOrAfterColumn);
		try {
			setState(3422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(3419);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(3420);
				match(AFTER);
				setState(3421);
				columnName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public IndexDefinition_Context indexDefinition_() {
			return getRuleContext(IndexDefinition_Context.class,0);
		}
		public AddIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addIndexSpecification; }
	}

	public final AddIndexSpecificationContext addIndexSpecification() throws RecognitionException {
		AddIndexSpecificationContext _localctx = new AddIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_addIndexSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3424);
			match(ADD);
			setState(3425);
			indexDefinition_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public ConstraintDefinition_Context constraintDefinition_() {
			return getRuleContext(ConstraintDefinition_Context.class,0);
		}
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_addConstraintSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3427);
			match(ADD);
			setState(3428);
			constraintDefinition_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode CHANGE() { return getToken(MySQLStatementParser.CHANGE, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public FirstOrAfterColumnContext firstOrAfterColumn() {
			return getRuleContext(FirstOrAfterColumnContext.class,0);
		}
		public ChangeColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeColumnSpecification; }
	}

	public final ChangeColumnSpecificationContext changeColumnSpecification() throws RecognitionException {
		ChangeColumnSpecificationContext _localctx = new ChangeColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_changeColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3430);
			match(CHANGE);
			setState(3432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(3431);
				match(COLUMN);
				}
			}

			setState(3434);
			columnName();
			setState(3435);
			columnDefinition();
			setState(3437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FIRST || _la==AFTER) {
				{
				setState(3436);
				firstOrAfterColumn();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3439);
			match(DROP);
			setState(3441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(3440);
				match(COLUMN);
				}
			}

			setState(3443);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public DropIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexSpecification; }
	}

	public final DropIndexSpecificationContext dropIndexSpecification() throws RecognitionException {
		DropIndexSpecificationContext _localctx = new DropIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_dropIndexSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3445);
			match(DROP);
			setState(3446);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3447);
			indexName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropPrimaryKeySpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public DropPrimaryKeySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropPrimaryKeySpecification; }
	}

	public final DropPrimaryKeySpecificationContext dropPrimaryKeySpecification() throws RecognitionException {
		DropPrimaryKeySpecificationContext _localctx = new DropPrimaryKeySpecificationContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_dropPrimaryKeySpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3449);
			match(DROP);
			setState(3450);
			primaryKey();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(MySQLStatementParser.MODIFY, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public FirstOrAfterColumnContext firstOrAfterColumn() {
			return getRuleContext(FirstOrAfterColumnContext.class,0);
		}
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3452);
			match(MODIFY);
			setState(3454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(3453);
				match(COLUMN);
				}
			}

			setState(3456);
			columnDefinition();
			setState(3458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FIRST || _la==AFTER) {
				{
				setState(3457);
				firstOrAfterColumn();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public RenameColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumnSpecification; }
	}

	public final RenameColumnSpecificationContext renameColumnSpecification() throws RecognitionException {
		RenameColumnSpecificationContext _localctx = new RenameColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_renameColumnSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3460);
			match(RENAME);
			setState(3461);
			match(COLUMN);
			setState(3462);
			columnName();
			setState(3463);
			match(TO);
			setState(3464);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public RenameIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameIndexSpecification; }
	}

	public final RenameIndexSpecificationContext renameIndexSpecification() throws RecognitionException {
		RenameIndexSpecificationContext _localctx = new RenameIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_renameIndexSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3466);
			match(RENAME);
			setState(3467);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3468);
			indexName();
			setState(3469);
			match(TO);
			setState(3470);
			indexName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameTableSpecification_Context extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public RenameTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTableSpecification_; }
	}

	public final RenameTableSpecification_Context renameTableSpecification_() throws RecognitionException {
		RenameTableSpecification_Context _localctx = new RenameTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 434, RULE_renameTableSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3472);
			match(RENAME);
			setState(3474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==TO) {
				{
				setState(3473);
				_la = _input.LA(1);
				if ( !(_la==AS || _la==TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(3476);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionDefinitions_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<PartitionDefinition_Context> partitionDefinition_() {
			return getRuleContexts(PartitionDefinition_Context.class);
		}
		public PartitionDefinition_Context partitionDefinition_(int i) {
			return getRuleContext(PartitionDefinition_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionDefinitions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinitions_; }
	}

	public final PartitionDefinitions_Context partitionDefinitions_() throws RecognitionException {
		PartitionDefinitions_Context _localctx = new PartitionDefinitions_Context(_ctx, getState());
		enterRule(_localctx, 436, RULE_partitionDefinitions_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3478);
			match(LP_);
			setState(3479);
			partitionDefinition_();
			setState(3484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(3480);
				match(COMMA_);
				setState(3481);
				partitionDefinition_();
				}
				}
				setState(3486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3487);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionDefinition_Context extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode VALUES() { return getToken(MySQLStatementParser.VALUES, 0); }
		public List<PartitionDefinitionOption_Context> partitionDefinitionOption_() {
			return getRuleContexts(PartitionDefinitionOption_Context.class);
		}
		public PartitionDefinitionOption_Context partitionDefinitionOption_(int i) {
			return getRuleContext(PartitionDefinitionOption_Context.class,i);
		}
		public List<TerminalNode> LP_() { return getTokens(MySQLStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(MySQLStatementParser.LP_, i);
		}
		public List<SubpartitionDefinition_Context> subpartitionDefinition_() {
			return getRuleContexts(SubpartitionDefinition_Context.class);
		}
		public SubpartitionDefinition_Context subpartitionDefinition_(int i) {
			return getRuleContext(SubpartitionDefinition_Context.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(MySQLStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(MySQLStatementParser.RP_, i);
		}
		public TerminalNode LESS() { return getToken(MySQLStatementParser.LESS, 0); }
		public TerminalNode THAN() { return getToken(MySQLStatementParser.THAN, 0); }
		public PartitionLessThanValue_Context partitionLessThanValue_() {
			return getRuleContext(PartitionLessThanValue_Context.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public PartitionValueList_Context partitionValueList_() {
			return getRuleContext(PartitionValueList_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinition_; }
	}

	public final PartitionDefinition_Context partitionDefinition_() throws RecognitionException {
		PartitionDefinition_Context _localctx = new PartitionDefinition_Context(_ctx, getState());
		enterRule(_localctx, 438, RULE_partitionDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3489);
			match(PARTITION);
			setState(3490);
			identifier_();
			setState(3502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUES) {
				{
				setState(3491);
				match(VALUES);
				setState(3500);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS:
					{
					setState(3492);
					match(LESS);
					setState(3493);
					match(THAN);
					setState(3494);
					partitionLessThanValue_();
					}
					break;
				case IN:
					{
					setState(3495);
					match(IN);
					setState(3496);
					match(LP_);
					setState(3497);
					partitionValueList_();
					setState(3498);
					match(RP_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(3507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDEX || _la==TABLESPACE || _la==STORAGE || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (COMMENT - 261)) | (1L << (DATA - 261)) | (1L << (ENGINE - 261)))) != 0) || _la==MAX_ROWS || _la==MIN_ROWS) {
				{
				{
				setState(3504);
				partitionDefinitionOption_();
				}
				}
				setState(3509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(3510);
				match(LP_);
				setState(3511);
				subpartitionDefinition_();
				setState(3516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(3512);
					match(COMMA_);
					setState(3513);
					subpartitionDefinition_();
					}
					}
					setState(3518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3519);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionLessThanValue_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PartitionValueList_Context partitionValueList_() {
			return getRuleContext(PartitionValueList_Context.class,0);
		}
		public TerminalNode MAXVALUE() { return getToken(MySQLStatementParser.MAXVALUE, 0); }
		public PartitionLessThanValue_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionLessThanValue_; }
	}

	public final PartitionLessThanValue_Context partitionLessThanValue_() throws RecognitionException {
		PartitionLessThanValue_Context _localctx = new PartitionLessThanValue_Context(_ctx, getState());
		enterRule(_localctx, 440, RULE_partitionLessThanValue_);
		try {
			setState(3531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				enterOuterAlt(_localctx, 1);
				{
				setState(3523);
				match(LP_);
				setState(3526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,478,_ctx) ) {
				case 1:
					{
					setState(3524);
					expr(0);
					}
					break;
				case 2:
					{
					setState(3525);
					partitionValueList_();
					}
					break;
				}
				setState(3528);
				match(RP_);
				}
				break;
			case MAXVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3530);
				match(MAXVALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValueList_Context extends ParserRuleContext {
		public List<LiteralsContext> literals() {
			return getRuleContexts(LiteralsContext.class);
		}
		public LiteralsContext literals(int i) {
			return getRuleContext(LiteralsContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionValueList_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionValueList_; }
	}

	public final PartitionValueList_Context partitionValueList_() throws RecognitionException {
		PartitionValueList_Context _localctx = new PartitionValueList_Context(_ctx, getState());
		enterRule(_localctx, 442, RULE_partitionValueList_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3533);
			literals();
			setState(3538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(3534);
				match(COMMA_);
				setState(3535);
				literals();
				}
				}
				setState(3540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionDefinitionOption_Context extends ParserRuleContext {
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode DIRECTORY() { return getToken(MySQLStatementParser.DIRECTORY, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode MAX_ROWS() { return getToken(MySQLStatementParser.MAX_ROWS, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode MIN_ROWS() { return getToken(MySQLStatementParser.MIN_ROWS, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public PartitionDefinitionOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinitionOption_; }
	}

	public final PartitionDefinitionOption_Context partitionDefinitionOption_() throws RecognitionException {
		PartitionDefinitionOption_Context _localctx = new PartitionDefinitionOption_Context(_ctx, getState());
		enterRule(_localctx, 444, RULE_partitionDefinitionOption_);
		int _la;
		try {
			setState(3581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STORAGE:
			case ENGINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORAGE) {
					{
					setState(3541);
					match(STORAGE);
					}
				}

				setState(3544);
				match(ENGINE);
				setState(3546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3545);
					match(EQ_);
					}
				}

				setState(3548);
				identifier_();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3549);
				match(COMMENT);
				setState(3551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3550);
					match(EQ_);
					}
				}

				setState(3553);
				match(STRING_);
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 3);
				{
				setState(3554);
				match(DATA);
				setState(3555);
				match(DIRECTORY);
				setState(3557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3556);
					match(EQ_);
					}
				}

				setState(3559);
				match(STRING_);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 4);
				{
				setState(3560);
				match(INDEX);
				setState(3561);
				match(DIRECTORY);
				setState(3563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3562);
					match(EQ_);
					}
				}

				setState(3565);
				match(STRING_);
				}
				break;
			case MAX_ROWS:
				enterOuterAlt(_localctx, 5);
				{
				setState(3566);
				match(MAX_ROWS);
				setState(3568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3567);
					match(EQ_);
					}
				}

				setState(3570);
				match(NUMBER_);
				}
				break;
			case MIN_ROWS:
				enterOuterAlt(_localctx, 6);
				{
				setState(3571);
				match(MIN_ROWS);
				setState(3573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3572);
					match(EQ_);
					}
				}

				setState(3575);
				match(NUMBER_);
				}
				break;
			case TABLESPACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(3576);
				match(TABLESPACE);
				setState(3578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(3577);
					match(EQ_);
					}
				}

				setState(3580);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubpartitionDefinition_Context extends ParserRuleContext {
		public TerminalNode SUBPARTITION() { return getToken(MySQLStatementParser.SUBPARTITION, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public List<PartitionDefinitionOption_Context> partitionDefinitionOption_() {
			return getRuleContexts(PartitionDefinitionOption_Context.class);
		}
		public PartitionDefinitionOption_Context partitionDefinitionOption_(int i) {
			return getRuleContext(PartitionDefinitionOption_Context.class,i);
		}
		public SubpartitionDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpartitionDefinition_; }
	}

	public final SubpartitionDefinition_Context subpartitionDefinition_() throws RecognitionException {
		SubpartitionDefinition_Context _localctx = new SubpartitionDefinition_Context(_ctx, getState());
		enterRule(_localctx, 446, RULE_subpartitionDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3583);
			match(SUBPARTITION);
			setState(3584);
			identifier_();
			setState(3588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDEX || _la==TABLESPACE || _la==STORAGE || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (COMMENT - 261)) | (1L << (DATA - 261)) | (1L << (ENGINE - 261)))) != 0) || _la==MAX_ROWS || _la==MIN_ROWS) {
				{
				{
				setState(3585);
				partitionDefinitionOption_();
				}
				}
				setState(3590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableSpecification_Context extends ParserRuleContext {
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public DropTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTableSpecification_; }
	}

	public final DropTableSpecification_Context dropTableSpecification_() throws RecognitionException {
		DropTableSpecification_Context _localctx = new DropTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 448, RULE_dropTableSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(3591);
				match(TEMPORARY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableExistClause_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public TableExistClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExistClause_; }
	}

	public final TableExistClause_Context tableExistClause_() throws RecognitionException {
		TableExistClause_Context _localctx = new TableExistClause_Context(_ctx, getState());
		enterRule(_localctx, 450, RULE_tableExistClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3594);
				match(IF);
				setState(3595);
				match(EXISTS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexSpecification_Context extends ParserRuleContext {
		public TerminalNode ONLINE() { return getToken(MySQLStatementParser.ONLINE, 0); }
		public TerminalNode OFFLINE() { return getToken(MySQLStatementParser.OFFLINE, 0); }
		public DropIndexSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexSpecification_; }
	}

	public final DropIndexSpecification_Context dropIndexSpecification_() throws RecognitionException {
		DropIndexSpecification_Context _localctx = new DropIndexSpecification_Context(_ctx, getState());
		enterRule(_localctx, 452, RULE_dropIndexSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3598);
			_la = _input.LA(1);
			if ( !(_la==OFFLINE || _la==ONLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OwnerStatementContext extends ParserRuleContext {
		public TerminalNode DEFINER() { return getToken(MySQLStatementParser.DEFINER, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public TerminalNode CURRENT_USER() { return getToken(MySQLStatementParser.CURRENT_USER, 0); }
		public OwnerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownerStatement; }
	}

	public final OwnerStatementContext ownerStatement() throws RecognitionException {
		OwnerStatementContext _localctx = new OwnerStatementContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_ownerStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3600);
			match(DEFINER);
			setState(3601);
			match(EQ_);
			setState(3608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case POSITION:
			case VIEW:
			case ANY:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case TABLES:
			case TABLESPACE:
			case COLUMNS:
			case FIELDS:
			case INDEXES:
			case STATUS:
			case MODIFY:
			case VALUE:
			case DUPLICATE:
			case FIRST:
			case LAST:
			case AFTER:
			case OJ:
			case ACCOUNT:
			case USER:
			case ROLE:
			case START:
			case TRANSACTION:
			case WITHOUT:
			case ESCAPE:
			case SUBPARTITION:
			case STORAGE:
			case SUPER:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case ROLLUP:
			case SOUNDS:
			case UNKNOWN:
			case OFF:
			case ALWAYS:
			case COMMITTED:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ACTION:
			case ALGORITHM:
			case AUTOCOMMIT:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DISCARD:
			case DISK:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case LESS:
			case MEMORY:
			case NONE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXTENDED:
			case EXPANSION:
			case VARIANCE:
			case MAX_ROWS:
			case MIN_ROWS:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case ROW_FORMAT:
			case WEIGHT_STRING:
			case COLUMN_FORMAT:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case PACK_KEYS:
			case PERSIST_ONLY:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case DELAY_KEY_WRITE:
			case ROTATE:
			case MASTER:
			case BINLOG:
			case ERROR:
			case SCHEDULE:
			case COMPLETION:
			case EVERY:
			case HOST:
			case SOCKET:
			case PORT:
			case SERVER:
			case WRAPPER:
			case OPTIONS:
			case OWNER:
			case RETURNS:
			case CONTAINS:
			case SECURITY:
			case INVOKER:
			case TEMPTABLE:
			case MERGE:
			case UNDEFINED:
			case DATAFILE:
			case FILE_BLOCK_SIZE:
			case EXTENT_SIZE:
			case INITIAL_SIZE:
			case AUTOEXTEND_SIZE:
			case MAX_SIZE:
			case NODEGROUP:
			case WAIT:
			case LOGFILE:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case REDO_BUFFER_SIZE:
			case HANDLER:
			case PREV:
			case ORGANIZATION:
			case DEFINITION:
			case DESCRIPTION:
			case REFERENCE:
			case FOLLOWS:
			case PRECEDES:
			case IMPORT:
			case CONCURRENT:
			case XML:
			case DUMPFILE:
			case SHARE:
			case IDENTIFIER_:
			case STRING_:
				{
				setState(3602);
				userName();
				}
				break;
			case CURRENT_USER:
				{
				setState(3603);
				match(CURRENT_USER);
				setState(3606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(3604);
					match(LP_);
					setState(3605);
					match(RP_);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScheduleExpression_Context extends ParserRuleContext {
		public TerminalNode AT_() { return getToken(MySQLStatementParser.AT_, 0); }
		public List<TimestampValueContext> timestampValue() {
			return getRuleContexts(TimestampValueContext.class);
		}
		public TimestampValueContext timestampValue(int i) {
			return getRuleContext(TimestampValueContext.class,i);
		}
		public List<TerminalNode> PLUS_() { return getTokens(MySQLStatementParser.PLUS_); }
		public TerminalNode PLUS_(int i) {
			return getToken(MySQLStatementParser.PLUS_, i);
		}
		public List<IntervalExpression_Context> intervalExpression_() {
			return getRuleContexts(IntervalExpression_Context.class);
		}
		public IntervalExpression_Context intervalExpression_(int i) {
			return getRuleContext(IntervalExpression_Context.class,i);
		}
		public TerminalNode EVERY() { return getToken(MySQLStatementParser.EVERY, 0); }
		public TerminalNode STARTS() { return getToken(MySQLStatementParser.STARTS, 0); }
		public TerminalNode ENDS() { return getToken(MySQLStatementParser.ENDS, 0); }
		public ScheduleExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheduleExpression_; }
	}

	public final ScheduleExpression_Context scheduleExpression_() throws RecognitionException {
		ScheduleExpression_Context _localctx = new ScheduleExpression_Context(_ctx, getState());
		enterRule(_localctx, 456, RULE_scheduleExpression_);
		int _la;
		try {
			setState(3643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_:
				enterOuterAlt(_localctx, 1);
				{
				setState(3610);
				match(AT_);
				setState(3611);
				timestampValue();
				setState(3616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS_) {
					{
					{
					setState(3612);
					match(PLUS_);
					setState(3613);
					intervalExpression_();
					}
					}
					setState(3618);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EVERY:
				enterOuterAlt(_localctx, 2);
				{
				setState(3619);
				match(EVERY);
				setState(3620);
				intervalExpression_();
				setState(3630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STARTS) {
					{
					setState(3621);
					match(STARTS);
					setState(3622);
					timestampValue();
					setState(3627);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==PLUS_) {
						{
						{
						setState(3623);
						match(PLUS_);
						setState(3624);
						intervalExpression_();
						}
						}
						setState(3629);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENDS) {
					{
					setState(3632);
					match(ENDS);
					setState(3633);
					timestampValue();
					setState(3638);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==PLUS_) {
						{
						{
						setState(3634);
						match(PLUS_);
						setState(3635);
						intervalExpression_();
						}
						}
						setState(3640);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimestampValueContext extends ParserRuleContext {
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(MySQLStatementParser.CURRENT_TIMESTAMP, 0); }
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TimestampValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestampValue; }
	}

	public final TimestampValueContext timestampValue() throws RecognitionException {
		TimestampValueContext _localctx = new TimestampValueContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_timestampValue);
		try {
			setState(3649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,501,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3645);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3646);
				stringLiterals();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3647);
				numberLiterals();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3648);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineBodyContext extends ParserRuleContext {
		public RoutineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineBody; }
	}

	public final RoutineBodyContext routineBody() throws RecognitionException {
		RoutineBodyContext _localctx = new RoutineBodyContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_routineBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3651);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServerOption_Context extends ParserRuleContext {
		public TerminalNode HOST() { return getToken(MySQLStatementParser.HOST, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode DATABASE() { return getToken(MySQLStatementParser.DATABASE, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public TerminalNode SOCKET() { return getToken(MySQLStatementParser.SOCKET, 0); }
		public TerminalNode OWNER() { return getToken(MySQLStatementParser.OWNER, 0); }
		public TerminalNode PORT() { return getToken(MySQLStatementParser.PORT, 0); }
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ServerOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverOption_; }
	}

	public final ServerOption_Context serverOption_() throws RecognitionException {
		ServerOption_Context _localctx = new ServerOption_Context(_ctx, getState());
		enterRule(_localctx, 462, RULE_serverOption_);
		try {
			setState(3667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HOST:
				enterOuterAlt(_localctx, 1);
				{
				setState(3653);
				match(HOST);
				setState(3654);
				match(STRING_);
				}
				break;
			case DATABASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3655);
				match(DATABASE);
				setState(3656);
				match(STRING_);
				}
				break;
			case USER:
				enterOuterAlt(_localctx, 3);
				{
				setState(3657);
				match(USER);
				setState(3658);
				match(STRING_);
				}
				break;
			case PASSWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(3659);
				match(PASSWORD);
				setState(3660);
				match(STRING_);
				}
				break;
			case SOCKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(3661);
				match(SOCKET);
				setState(3662);
				match(STRING_);
				}
				break;
			case OWNER:
				enterOuterAlt(_localctx, 6);
				{
				setState(3663);
				match(OWNER);
				setState(3664);
				match(STRING_);
				}
				break;
			case PORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(3665);
				match(PORT);
				setState(3666);
				numberLiterals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineOption_Context extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode LANGUAGE() { return getToken(MySQLStatementParser.LANGUAGE, 0); }
		public TerminalNode SQL() { return getToken(MySQLStatementParser.SQL, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(MySQLStatementParser.DETERMINISTIC, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(MySQLStatementParser.CONTAINS, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode READS() { return getToken(MySQLStatementParser.READS, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode MODIFIES() { return getToken(MySQLStatementParser.MODIFIES, 0); }
		public TerminalNode SECURITY() { return getToken(MySQLStatementParser.SECURITY, 0); }
		public TerminalNode DEFINER() { return getToken(MySQLStatementParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(MySQLStatementParser.INVOKER, 0); }
		public RoutineOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineOption_; }
	}

	public final RoutineOption_Context routineOption_() throws RecognitionException {
		RoutineOption_Context _localctx = new RoutineOption_Context(_ctx, getState());
		enterRule(_localctx, 464, RULE_routineOption_);
		int _la;
		try {
			setState(3692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3669);
				match(COMMENT);
				setState(3670);
				match(STRING_);
				}
				break;
			case LANGUAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3671);
				match(LANGUAGE);
				setState(3672);
				match(SQL);
				}
				break;
			case NOT:
			case DETERMINISTIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(3674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(3673);
					match(NOT);
					}
				}

				setState(3676);
				match(DETERMINISTIC);
				}
				break;
			case NO:
			case CONTAINS:
			case READS:
			case MODIFIES:
				enterOuterAlt(_localctx, 4);
				{
				setState(3687);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTAINS:
					{
					setState(3677);
					match(CONTAINS);
					setState(3678);
					match(SQL);
					}
					break;
				case NO:
					{
					setState(3679);
					match(NO);
					setState(3680);
					match(SQL);
					}
					break;
				case READS:
					{
					setState(3681);
					match(READS);
					setState(3682);
					match(SQL);
					setState(3683);
					match(DATA);
					}
					break;
				case MODIFIES:
					{
					setState(3684);
					match(MODIFIES);
					setState(3685);
					match(SQL);
					setState(3686);
					match(DATA);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SQL:
				enterOuterAlt(_localctx, 5);
				{
				setState(3689);
				match(SQL);
				setState(3690);
				match(SECURITY);
				setState(3691);
				_la = _input.LA(1);
				if ( !(_la==DEFINER || _la==INVOKER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureParameter_Context extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public TerminalNode OUT() { return getToken(MySQLStatementParser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(MySQLStatementParser.INOUT, 0); }
		public ProcedureParameter_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureParameter_; }
	}

	public final ProcedureParameter_Context procedureParameter_() throws RecognitionException {
		ProcedureParameter_Context _localctx = new ProcedureParameter_Context(_ctx, getState());
		enterRule(_localctx, 466, RULE_procedureParameter_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3694);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OUT || _la==INOUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3695);
			identifier_();
			setState(3696);
			dataType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileSizeLiteral_Context extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public FileSizeLiteral_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileSizeLiteral_; }
	}

	public final FileSizeLiteral_Context fileSizeLiteral_() throws RecognitionException {
		FileSizeLiteral_Context _localctx = new FileSizeLiteral_Context(_ctx, getState());
		enterRule(_localctx, 468, RULE_fileSizeLiteral_);
		int _la;
		try {
			setState(3702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,506,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3698);
				numberLiterals();
				setState(3699);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3701);
				numberLiterals();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(MySQLStatementParser.TRANSACTION, 0); }
		public Scope_Context scope_() {
			return getRuleContext(Scope_Context.class,0);
		}
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_setTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3704);
			match(SET);
			setState(3706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_ || ((((_la - 289)) & ~0x3f) == 0 && ((1L << (_la - 289)) & ((1L << (GLOBAL - 289)) | (1L << (PERSIST - 289)) | (1L << (SESSION - 289)))) != 0) || _la==PERSIST_ONLY) {
				{
				setState(3705);
				scope_();
				}
			}

			setState(3708);
			match(TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetAutoCommitContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode AUTOCOMMIT() { return getToken(MySQLStatementParser.AUTOCOMMIT, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public AutoCommitValueContext autoCommitValue() {
			return getRuleContext(AutoCommitValueContext.class,0);
		}
		public Scope_Context scope_() {
			return getRuleContext(Scope_Context.class,0);
		}
		public SetAutoCommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAutoCommit; }
	}

	public final SetAutoCommitContext setAutoCommit() throws RecognitionException {
		SetAutoCommitContext _localctx = new SetAutoCommitContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_setAutoCommit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3710);
			match(SET);
			setState(3712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_ || ((((_la - 289)) & ~0x3f) == 0 && ((1L << (_la - 289)) & ((1L << (GLOBAL - 289)) | (1L << (PERSIST - 289)) | (1L << (SESSION - 289)))) != 0) || _la==PERSIST_ONLY) {
				{
				setState(3711);
				scope_();
				}
			}

			setState(3714);
			match(AUTOCOMMIT);
			setState(3715);
			match(EQ_);
			setState(3716);
			autoCommitValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutoCommitValueContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(MySQLStatementParser.OFF, 0); }
		public AutoCommitValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoCommitValue; }
	}

	public final AutoCommitValueContext autoCommitValue() throws RecognitionException {
		AutoCommitValueContext _localctx = new AutoCommitValueContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_autoCommitValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3718);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF || _la==NUMBER_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MySQLStatementParser.BEGIN, 0); }
		public TerminalNode START() { return getToken(MySQLStatementParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(MySQLStatementParser.TRANSACTION, 0); }
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_beginTransaction);
		try {
			setState(3723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(3720);
				match(BEGIN);
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				setState(3721);
				match(START);
				setState(3722);
				match(TRANSACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(MySQLStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3725);
			match(COMMIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(MySQLStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3727);
			match(ROLLBACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SavepointContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT() { return getToken(MySQLStatementParser.SAVEPOINT, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3729);
			match(SAVEPOINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(MySQLStatementParser.GRANT, 0); }
		public ProxyClause_Context proxyClause_() {
			return getRuleContext(ProxyClause_Context.class,0);
		}
		public PrivilegeClause_Context privilegeClause_() {
			return getRuleContext(PrivilegeClause_Context.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3731);
			match(GRANT);
			setState(3735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,510,_ctx) ) {
			case 1:
				{
				setState(3732);
				proxyClause_();
				}
				break;
			case 2:
				{
				setState(3733);
				privilegeClause_();
				}
				break;
			case 3:
				{
				setState(3734);
				roleClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(MySQLStatementParser.REVOKE, 0); }
		public ProxyClause_Context proxyClause_() {
			return getRuleContext(ProxyClause_Context.class,0);
		}
		public PrivilegeClause_Context privilegeClause_() {
			return getRuleContext(PrivilegeClause_Context.class,0);
		}
		public AllClause_Context allClause_() {
			return getRuleContext(AllClause_Context.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_revoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3737);
			match(REVOKE);
			setState(3742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,511,_ctx) ) {
			case 1:
				{
				setState(3738);
				proxyClause_();
				}
				break;
			case 2:
				{
				setState(3739);
				privilegeClause_();
				}
				break;
			case 3:
				{
				setState(3740);
				allClause_();
				}
				break;
			case 4:
				{
				setState(3741);
				roleClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProxyClause_Context extends ParserRuleContext {
		public TerminalNode PROXY() { return getToken(MySQLStatementParser.PROXY, 0); }
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public ProxyClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proxyClause_; }
	}

	public final ProxyClause_Context proxyClause_() throws RecognitionException {
		ProxyClause_Context _localctx = new ProxyClause_Context(_ctx, getState());
		enterRule(_localctx, 488, RULE_proxyClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3744);
			match(PROXY);
			setState(3745);
			match(ON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeClause_Context extends ParserRuleContext {
		public Privileges_Context privileges_() {
			return getRuleContext(Privileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public OnObjectClause_Context onObjectClause_() {
			return getRuleContext(OnObjectClause_Context.class,0);
		}
		public PrivilegeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeClause_; }
	}

	public final PrivilegeClause_Context privilegeClause_() throws RecognitionException {
		PrivilegeClause_Context _localctx = new PrivilegeClause_Context(_ctx, getState());
		enterRule(_localctx, 490, RULE_privilegeClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3747);
			privileges_();
			setState(3748);
			match(ON);
			setState(3749);
			onObjectClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleClause_Context extends ParserRuleContext {
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public RoleClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleClause_; }
	}

	public final RoleClause_Context roleClause_() throws RecognitionException {
		RoleClause_Context _localctx = new RoleClause_Context(_ctx, getState());
		enterRule(_localctx, 492, RULE_roleClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3751);
			ignoredIdentifiers_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllClause_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public TerminalNode GRANT() { return getToken(MySQLStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public TerminalNode PRIVILEGES() { return getToken(MySQLStatementParser.PRIVILEGES, 0); }
		public AllClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allClause_; }
	}

	public final AllClause_Context allClause_() throws RecognitionException {
		AllClause_Context _localctx = new AllClause_Context(_ctx, getState());
		enterRule(_localctx, 494, RULE_allClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3753);
			match(ALL);
			setState(3755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVILEGES) {
				{
				setState(3754);
				match(PRIVILEGES);
				}
			}

			setState(3757);
			match(COMMA_);
			setState(3758);
			match(GRANT);
			setState(3759);
			match(OPTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Privileges_Context extends ParserRuleContext {
		public List<PrivilegeType_Context> privilegeType_() {
			return getRuleContexts(PrivilegeType_Context.class);
		}
		public PrivilegeType_Context privilegeType_(int i) {
			return getRuleContext(PrivilegeType_Context.class,i);
		}
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public Privileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privileges_; }
	}

	public final Privileges_Context privileges_() throws RecognitionException {
		Privileges_Context _localctx = new Privileges_Context(_ctx, getState());
		enterRule(_localctx, 496, RULE_privileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3761);
			privilegeType_();
			setState(3763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_ || _la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0)) {
				{
				setState(3762);
				columnNames();
				}
			}

			setState(3772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(3765);
				match(COMMA_);
				setState(3766);
				privilegeType_();
				setState(3768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_ || _la==TRUNCATE || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0)) {
					{
					setState(3767);
					columnNames();
					}
				}

				}
				}
				setState(3774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeType_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(MySQLStatementParser.PRIVILEGES, 0); }
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode ROUTINE() { return getToken(MySQLStatementParser.ROUTINE, 0); }
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TABLES() { return getToken(MySQLStatementParser.TABLES, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public TerminalNode VIEW() { return getToken(MySQLStatementParser.VIEW, 0); }
		public TerminalNode DELETE() { return getToken(MySQLStatementParser.DELETE, 0); }
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode EVENT() { return getToken(MySQLStatementParser.EVENT, 0); }
		public TerminalNode EXECUTE() { return getToken(MySQLStatementParser.EXECUTE, 0); }
		public TerminalNode FILE() { return getToken(MySQLStatementParser.FILE, 0); }
		public TerminalNode GRANT() { return getToken(MySQLStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode INSERT() { return getToken(MySQLStatementParser.INSERT, 0); }
		public TerminalNode LOCK() { return getToken(MySQLStatementParser.LOCK, 0); }
		public TerminalNode PROCESS() { return getToken(MySQLStatementParser.PROCESS, 0); }
		public TerminalNode PROXY() { return getToken(MySQLStatementParser.PROXY, 0); }
		public TerminalNode REFERENCES() { return getToken(MySQLStatementParser.REFERENCES, 0); }
		public TerminalNode RELOAD() { return getToken(MySQLStatementParser.RELOAD, 0); }
		public TerminalNode REPLICATION() { return getToken(MySQLStatementParser.REPLICATION, 0); }
		public TerminalNode CLIENT() { return getToken(MySQLStatementParser.CLIENT, 0); }
		public TerminalNode SLAVE() { return getToken(MySQLStatementParser.SLAVE, 0); }
		public TerminalNode SELECT() { return getToken(MySQLStatementParser.SELECT, 0); }
		public TerminalNode SHOW() { return getToken(MySQLStatementParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(MySQLStatementParser.DATABASES, 0); }
		public TerminalNode SHUTDOWN() { return getToken(MySQLStatementParser.SHUTDOWN, 0); }
		public TerminalNode SUPER() { return getToken(MySQLStatementParser.SUPER, 0); }
		public TerminalNode TRIGGER() { return getToken(MySQLStatementParser.TRIGGER, 0); }
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public TerminalNode USAGE() { return getToken(MySQLStatementParser.USAGE, 0); }
		public TerminalNode AUDIT_ADMIN() { return getToken(MySQLStatementParser.AUDIT_ADMIN, 0); }
		public TerminalNode BINLOG_ADMIN() { return getToken(MySQLStatementParser.BINLOG_ADMIN, 0); }
		public TerminalNode CONNECTION_ADMIN() { return getToken(MySQLStatementParser.CONNECTION_ADMIN, 0); }
		public TerminalNode ENCRYPTION_KEY_ADMIN() { return getToken(MySQLStatementParser.ENCRYPTION_KEY_ADMIN, 0); }
		public TerminalNode FIREWALL_ADMIN() { return getToken(MySQLStatementParser.FIREWALL_ADMIN, 0); }
		public TerminalNode FIREWALL_USER() { return getToken(MySQLStatementParser.FIREWALL_USER, 0); }
		public TerminalNode GROUP_REPLICATION_ADMIN() { return getToken(MySQLStatementParser.GROUP_REPLICATION_ADMIN, 0); }
		public TerminalNode REPLICATION_SLAVE_ADMIN() { return getToken(MySQLStatementParser.REPLICATION_SLAVE_ADMIN, 0); }
		public TerminalNode ROLE_ADMIN() { return getToken(MySQLStatementParser.ROLE_ADMIN, 0); }
		public TerminalNode SET_USER_ID() { return getToken(MySQLStatementParser.SET_USER_ID, 0); }
		public TerminalNode SYSTEM_VARIABLES_ADMIN() { return getToken(MySQLStatementParser.SYSTEM_VARIABLES_ADMIN, 0); }
		public TerminalNode VERSION_TOKEN_ADMIN() { return getToken(MySQLStatementParser.VERSION_TOKEN_ADMIN, 0); }
		public PrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType_; }
	}

	public final PrivilegeType_Context privilegeType_() throws RecognitionException {
		PrivilegeType_Context _localctx = new PrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 498, RULE_privilegeType_);
		int _la;
		try {
			setState(3836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,518,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3775);
				match(ALL);
				setState(3777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,516,_ctx) ) {
				case 1:
					{
					setState(3776);
					match(PRIVILEGES);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3779);
				match(ALTER);
				setState(3781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROUTINE) {
					{
					setState(3780);
					match(ROUTINE);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3783);
				match(CREATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3784);
				match(CREATE);
				setState(3785);
				match(ROUTINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3786);
				match(CREATE);
				setState(3787);
				match(TABLESPACE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3788);
				match(CREATE);
				setState(3789);
				match(TEMPORARY);
				setState(3790);
				match(TABLES);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3791);
				match(CREATE);
				setState(3792);
				match(USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3793);
				match(CREATE);
				setState(3794);
				match(VIEW);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3795);
				match(DELETE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3796);
				match(DROP);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3797);
				match(EVENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3798);
				match(EXECUTE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3799);
				match(FILE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3800);
				match(GRANT);
				setState(3801);
				match(OPTION);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3802);
				match(INDEX);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3803);
				match(INSERT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3804);
				match(LOCK);
				setState(3805);
				match(TABLES);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3806);
				match(PROCESS);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3807);
				match(PROXY);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3808);
				match(REFERENCES);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(3809);
				match(RELOAD);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(3810);
				match(REPLICATION);
				setState(3811);
				match(CLIENT);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(3812);
				match(REPLICATION);
				setState(3813);
				match(SLAVE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(3814);
				match(SELECT);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(3815);
				match(SHOW);
				setState(3816);
				match(DATABASES);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(3817);
				match(SHOW);
				setState(3818);
				match(VIEW);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(3819);
				match(SHUTDOWN);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(3820);
				match(SUPER);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(3821);
				match(TRIGGER);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(3822);
				match(UPDATE);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(3823);
				match(USAGE);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(3824);
				match(AUDIT_ADMIN);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(3825);
				match(BINLOG_ADMIN);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(3826);
				match(CONNECTION_ADMIN);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(3827);
				match(ENCRYPTION_KEY_ADMIN);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(3828);
				match(FIREWALL_ADMIN);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(3829);
				match(FIREWALL_USER);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(3830);
				match(GROUP_REPLICATION_ADMIN);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(3831);
				match(REPLICATION_SLAVE_ADMIN);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(3832);
				match(ROLE_ADMIN);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(3833);
				match(SET_USER_ID);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(3834);
				match(SYSTEM_VARIABLES_ADMIN);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(3835);
				match(VERSION_TOKEN_ADMIN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnObjectClause_Context extends ParserRuleContext {
		public PrivilegeLevel_Context privilegeLevel_() {
			return getRuleContext(PrivilegeLevel_Context.class,0);
		}
		public ObjectType_Context objectType_() {
			return getRuleContext(ObjectType_Context.class,0);
		}
		public OnObjectClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause_; }
	}

	public final OnObjectClause_Context onObjectClause_() throws RecognitionException {
		OnObjectClause_Context _localctx = new OnObjectClause_Context(_ctx, getState());
		enterRule(_localctx, 500, RULE_onObjectClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TABLE - 66)) | (1L << (FUNCTION - 66)) | (1L << (PROCEDURE - 66)))) != 0)) {
				{
				setState(3838);
				objectType_();
				}
			}

			setState(3841);
			privilegeLevel_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectType_Context extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TerminalNode FUNCTION() { return getToken(MySQLStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(MySQLStatementParser.PROCEDURE, 0); }
		public ObjectType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType_; }
	}

	public final ObjectType_Context objectType_() throws RecognitionException {
		ObjectType_Context _localctx = new ObjectType_Context(_ctx, getState());
		enterRule(_localctx, 502, RULE_objectType_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3843);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TABLE - 66)) | (1L << (FUNCTION - 66)) | (1L << (PROCEDURE - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeLevel_Context extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public TerminalNode DOT_ASTERISK_() { return getToken(MySQLStatementParser.DOT_ASTERISK_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PrivilegeLevel_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeLevel_; }
	}

	public final PrivilegeLevel_Context privilegeLevel_() throws RecognitionException {
		PrivilegeLevel_Context _localctx = new PrivilegeLevel_Context(_ctx, getState());
		enterRule(_localctx, 504, RULE_privilegeLevel_);
		try {
			setState(3852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,520,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3845);
				match(ASTERISK_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3846);
				match(ASTERISK_);
				setState(3847);
				match(DOT_ASTERISK_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3848);
				identifier_();
				setState(3849);
				match(DOT_ASTERISK_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3851);
				tableName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3854);
			match(CREATE);
			setState(3855);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropUserContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3857);
			match(DROP);
			setState(3858);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterUserContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3860);
			match(ALTER);
			setState(3861);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameUserContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public RenameUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameUser; }
	}

	public final RenameUserContext renameUser() throws RecognitionException {
		RenameUserContext _localctx = new RenameUserContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_renameUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3863);
			match(RENAME);
			setState(3864);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateRoleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3866);
			match(CREATE);
			setState(3867);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropRoleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3869);
			match(DROP);
			setState(3870);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetRoleContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public SetRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setRole; }
	}

	public final SetRoleContext setRole() throws RecognitionException {
		SetRoleContext _localctx = new SetRoleContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_setRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3872);
			match(SET);
			setState(3874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(3873);
				match(DEFAULT);
				}
			}

			setState(3876);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetPasswordContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public SetPasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setPassword; }
	}

	public final SetPasswordContext setPassword() throws RecognitionException {
		SetPasswordContext _localctx = new SetPasswordContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_setPassword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3878);
			match(SET);
			setState(3879);
			match(PASSWORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(MySQLStatementParser.USE, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3881);
			match(USE);
			setState(3882);
			schemaName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(MySQLStatementParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(MySQLStatementParser.DESCRIBE, 0); }
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 524, RULE_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3884);
			_la = _input.LA(1);
			if ( !(_la==DESC || _la==DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3885);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowDatabasesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(MySQLStatementParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(MySQLStatementParser.DATABASES, 0); }
		public TerminalNode SCHEMAS() { return getToken(MySQLStatementParser.SCHEMAS, 0); }
		public ShowLikeContext showLike() {
			return getRuleContext(ShowLikeContext.class,0);
		}
		public ShowWhereClause_Context showWhereClause_() {
			return getRuleContext(ShowWhereClause_Context.class,0);
		}
		public ShowDatabasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDatabases; }
	}

	public final ShowDatabasesContext showDatabases() throws RecognitionException {
		ShowDatabasesContext _localctx = new ShowDatabasesContext(_ctx, getState());
		enterRule(_localctx, 526, RULE_showDatabases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3887);
			match(SHOW);
			setState(3888);
			_la = _input.LA(1);
			if ( !(_la==DATABASES || _la==SCHEMAS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIKE:
				{
				setState(3889);
				showLike();
				}
				break;
			case WHERE:
				{
				setState(3890);
				showWhereClause_();
				}
				break;
			case EOF:
			case SEMI_:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowTablesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(MySQLStatementParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(MySQLStatementParser.TABLES, 0); }
		public TerminalNode EXTENDED() { return getToken(MySQLStatementParser.EXTENDED, 0); }
		public TerminalNode FULL() { return getToken(MySQLStatementParser.FULL, 0); }
		public FromSchemaContext fromSchema() {
			return getRuleContext(FromSchemaContext.class,0);
		}
		public ShowLikeContext showLike() {
			return getRuleContext(ShowLikeContext.class,0);
		}
		public ShowWhereClause_Context showWhereClause_() {
			return getRuleContext(ShowWhereClause_Context.class,0);
		}
		public ShowTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTables; }
	}

	public final ShowTablesContext showTables() throws RecognitionException {
		ShowTablesContext _localctx = new ShowTablesContext(_ctx, getState());
		enterRule(_localctx, 528, RULE_showTables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3893);
			match(SHOW);
			setState(3895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDED) {
				{
				setState(3894);
				match(EXTENDED);
				}
			}

			setState(3898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FULL) {
				{
				setState(3897);
				match(FULL);
				}
			}

			setState(3900);
			match(TABLES);
			setState(3902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM || _la==IN) {
				{
				setState(3901);
				fromSchema();
				}
			}

			setState(3906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIKE:
				{
				setState(3904);
				showLike();
				}
				break;
			case WHERE:
				{
				setState(3905);
				showWhereClause_();
				}
				break;
			case EOF:
			case SEMI_:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowTableStatusContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(MySQLStatementParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TerminalNode STATUS() { return getToken(MySQLStatementParser.STATUS, 0); }
		public FromSchemaContext fromSchema() {
			return getRuleContext(FromSchemaContext.class,0);
		}
		public ShowLikeContext showLike() {
			return getRuleContext(ShowLikeContext.class,0);
		}
		public ShowWhereClause_Context showWhereClause_() {
			return getRuleContext(ShowWhereClause_Context.class,0);
		}
		public ShowTableStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTableStatus; }
	}

	public final ShowTableStatusContext showTableStatus() throws RecognitionException {
		ShowTableStatusContext _localctx = new ShowTableStatusContext(_ctx, getState());
		enterRule(_localctx, 530, RULE_showTableStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3908);
			match(SHOW);
			setState(3909);
			match(TABLE);
			setState(3910);
			match(STATUS);
			setState(3912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM || _la==IN) {
				{
				setState(3911);
				fromSchema();
				}
			}

			setState(3916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIKE:
				{
				setState(3914);
				showLike();
				}
				break;
			case WHERE:
				{
				setState(3915);
				showWhereClause_();
				}
				break;
			case EOF:
			case SEMI_:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowColumnsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(MySQLStatementParser.SHOW, 0); }
		public FromTable_Context fromTable_() {
			return getRuleContext(FromTable_Context.class,0);
		}
		public TerminalNode COLUMNS() { return getToken(MySQLStatementParser.COLUMNS, 0); }
		public TerminalNode FIELDS() { return getToken(MySQLStatementParser.FIELDS, 0); }
		public TerminalNode EXTENDED() { return getToken(MySQLStatementParser.EXTENDED, 0); }
		public TerminalNode FULL() { return getToken(MySQLStatementParser.FULL, 0); }
		public FromSchemaContext fromSchema() {
			return getRuleContext(FromSchemaContext.class,0);
		}
		public ShowLikeContext showLike() {
			return getRuleContext(ShowLikeContext.class,0);
		}
		public ShowWhereClause_Context showWhereClause_() {
			return getRuleContext(ShowWhereClause_Context.class,0);
		}
		public ShowColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showColumns; }
	}

	public final ShowColumnsContext showColumns() throws RecognitionException {
		ShowColumnsContext _localctx = new ShowColumnsContext(_ctx, getState());
		enterRule(_localctx, 532, RULE_showColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3918);
			match(SHOW);
			setState(3920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDED) {
				{
				setState(3919);
				match(EXTENDED);
				}
			}

			setState(3923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FULL) {
				{
				setState(3922);
				match(FULL);
				}
			}

			setState(3925);
			_la = _input.LA(1);
			if ( !(_la==COLUMNS || _la==FIELDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3926);
			fromTable_();
			setState(3928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM || _la==IN) {
				{
				setState(3927);
				fromSchema();
				}
			}

			setState(3932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIKE:
				{
				setState(3930);
				showLike();
				}
				break;
			case WHERE:
				{
				setState(3931);
				showWhereClause_();
				}
				break;
			case EOF:
			case SEMI_:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowIndexContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(MySQLStatementParser.SHOW, 0); }
		public FromTable_Context fromTable_() {
			return getRuleContext(FromTable_Context.class,0);
		}
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(MySQLStatementParser.INDEXES, 0); }
		public TerminalNode KEYS() { return getToken(MySQLStatementParser.KEYS, 0); }
		public TerminalNode EXTENDED() { return getToken(MySQLStatementParser.EXTENDED, 0); }
		public FromSchemaContext fromSchema() {
			return getRuleContext(FromSchemaContext.class,0);
		}
		public ShowWhereClause_Context showWhereClause_() {
			return getRuleContext(ShowWhereClause_Context.class,0);
		}
		public ShowIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showIndex; }
	}

	public final ShowIndexContext showIndex() throws RecognitionException {
		ShowIndexContext _localctx = new ShowIndexContext(_ctx, getState());
		enterRule(_localctx, 534, RULE_showIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3934);
			match(SHOW);
			setState(3936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDED) {
				{
				setState(3935);
				match(EXTENDED);
				}
			}

			setState(3938);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==INDEXES || _la==KEYS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3939);
			fromTable_();
			setState(3941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM || _la==IN) {
				{
				setState(3940);
				fromSchema();
				}
			}

			setState(3944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(3943);
				showWhereClause_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowCreateTableContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(MySQLStatementParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ShowCreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showCreateTable; }
	}

	public final ShowCreateTableContext showCreateTable() throws RecognitionException {
		ShowCreateTableContext _localctx = new ShowCreateTableContext(_ctx, getState());
		enterRule(_localctx, 536, RULE_showCreateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3946);
			match(SHOW);
			setState(3947);
			match(CREATE);
			setState(3948);
			match(TABLE);
			setState(3949);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowOtherContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(MySQLStatementParser.SHOW, 0); }
		public ShowOtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showOther; }
	}

	public final ShowOtherContext showOther() throws RecognitionException {
		ShowOtherContext _localctx = new ShowOtherContext(_ctx, getState());
		enterRule(_localctx, 538, RULE_showOther);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3951);
			match(SHOW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromSchemaContext extends ParserRuleContext {
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public FromSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSchema; }
	}

	public final FromSchemaContext fromSchema() throws RecognitionException {
		FromSchemaContext _localctx = new FromSchemaContext(_ctx, getState());
		enterRule(_localctx, 540, RULE_fromSchema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3953);
			_la = _input.LA(1);
			if ( !(_la==FROM || _la==IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3954);
			schemaName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromTable_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public FromTable_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromTable_; }
	}

	public final FromTable_Context fromTable_() throws RecognitionException {
		FromTable_Context _localctx = new FromTable_Context(_ctx, getState());
		enterRule(_localctx, 542, RULE_fromTable_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3956);
			_la = _input.LA(1);
			if ( !(_la==FROM || _la==IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3957);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowLikeContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(MySQLStatementParser.LIKE, 0); }
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public ShowLikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showLike; }
	}

	public final ShowLikeContext showLike() throws RecognitionException {
		ShowLikeContext _localctx = new ShowLikeContext(_ctx, getState());
		enterRule(_localctx, 544, RULE_showLike);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3959);
			match(LIKE);
			setState(3960);
			stringLiterals();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowWhereClause_Context extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MySQLStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ShowWhereClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showWhereClause_; }
	}

	public final ShowWhereClause_Context showWhereClause_() throws RecognitionException {
		ShowWhereClause_Context _localctx = new ShowWhereClause_Context(_ctx, getState());
		enterRule(_localctx, 546, RULE_showWhereClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3962);
			match(WHERE);
			setState(3963);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetVariableContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public Variable_Context variable_() {
			return getRuleContext(Variable_Context.class,0);
		}
		public SetVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVariable; }
	}

	public final SetVariableContext setVariable() throws RecognitionException {
		SetVariableContext _localctx = new SetVariableContext(_ctx, getState());
		enterRule(_localctx, 548, RULE_setVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3965);
			match(SET);
			setState(3967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT_) | (1L << AT_) | (1L << TRUNCATE))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (POSITION - 74)) | (1L << (VIEW - 74)) | (1L << (ANY - 74)) | (1L << (OFFSET - 74)) | (1L << (BEGIN - 74)) | (1L << (COMMIT - 74)) | (1L << (ROLLBACK - 74)) | (1L << (SAVEPOINT - 74)) | (1L << (BOOLEAN - 74)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DATE - 139)) | (1L << (TIME - 139)) | (1L << (TIMESTAMP - 139)) | (1L << (YEAR - 139)) | (1L << (QUARTER - 139)) | (1L << (MONTH - 139)) | (1L << (WEEK - 139)) | (1L << (DAY - 139)) | (1L << (HOUR - 139)) | (1L << (MINUTE - 139)) | (1L << (SECOND - 139)) | (1L << (MICROSECOND - 139)) | (1L << (MAX - 139)) | (1L << (MIN - 139)) | (1L << (SUM - 139)) | (1L << (COUNT - 139)) | (1L << (AVG - 139)) | (1L << (CURRENT - 139)) | (1L << (ENABLE - 139)) | (1L << (DISABLE - 139)) | (1L << (INSTANCE - 139)) | (1L << (DO - 139)) | (1L << (DEFINER - 139)) | (1L << (CASCADED - 139)) | (1L << (LOCAL - 139)) | (1L << (CLOSE - 139)) | (1L << (OPEN - 139)) | (1L << (NEXT - 139)) | (1L << (NAME - 139)) | (1L << (TABLES - 139)) | (1L << (TABLESPACE - 139)) | (1L << (COLUMNS - 139)) | (1L << (FIELDS - 139)) | (1L << (INDEXES - 139)) | (1L << (STATUS - 139)) | (1L << (MODIFY - 139)) | (1L << (VALUE - 139)) | (1L << (DUPLICATE - 139)) | (1L << (FIRST - 139)) | (1L << (LAST - 139)) | (1L << (AFTER - 139)) | (1L << (OJ - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ACCOUNT - 203)) | (1L << (USER - 203)) | (1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (TRANSACTION - 203)) | (1L << (WITHOUT - 203)) | (1L << (ESCAPE - 203)) | (1L << (SUBPARTITION - 203)) | (1L << (STORAGE - 203)) | (1L << (SUPER - 203)) | (1L << (TEMPORARY - 203)) | (1L << (THAN - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (UPGRADE - 203)) | (1L << (VALIDATION - 203)) | (1L << (ROLLUP - 203)) | (1L << (SOUNDS - 203)) | (1L << (UNKNOWN - 203)) | (1L << (OFF - 203)) | (1L << (ALWAYS - 203)) | (1L << (COMMITTED - 203)) | (1L << (LEVEL - 203)) | (1L << (NO - 203)) | (1L << (PASSWORD - 203)) | (1L << (PRIVILEGES - 203)) | (1L << (ACTION - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTOCOMMIT - 203)) | (1L << (BTREE - 203)) | (1L << (CHAIN - 203)) | (1L << (CHARSET - 203)) | (1L << (CHECKSUM - 203)) | (1L << (CIPHER - 203)) | (1L << (CLIENT - 203)) | (1L << (COALESCE - 203)) | (1L << (COMMENT - 203)) | (1L << (COMPACT - 203)) | (1L << (COMPRESSED - 203)) | (1L << (COMPRESSION - 203)) | (1L << (CONNECTION - 203)) | (1L << (CONSISTENT - 203)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DATA - 269)) | (1L << (DISCARD - 269)) | (1L << (DISK - 269)) | (1L << (ENCRYPTION - 269)) | (1L << (END - 269)) | (1L << (ENGINE - 269)) | (1L << (EVENT - 269)) | (1L << (EXCHANGE - 269)) | (1L << (EXECUTE - 269)) | (1L << (FILE - 269)) | (1L << (FIXED - 269)) | (1L << (FOLLOWING - 269)) | (1L << (GLOBAL - 269)) | (1L << (HASH - 269)) | (1L << (IMPORT_ - 269)) | (1L << (LESS - 269)) | (1L << (MEMORY - 269)) | (1L << (NONE - 269)) | (1L << (PARSER - 269)) | (1L << (PARTIAL - 269)) | (1L << (PARTITIONING - 269)) | (1L << (PERSIST - 269)) | (1L << (PRECEDING - 269)) | (1L << (PROCESS - 269)) | (1L << (PROXY - 269)) | (1L << (QUICK - 269)) | (1L << (REBUILD - 269)) | (1L << (REDUNDANT - 269)) | (1L << (RELOAD - 269)) | (1L << (REMOVE - 269)) | (1L << (REORGANIZE - 269)) | (1L << (REPAIR - 269)) | (1L << (REVERSE - 269)) | (1L << (SESSION - 269)))) != 0) || ((((_la - 334)) & ~0x3f) == 0 && ((1L << (_la - 334)) & ((1L << (SHUTDOWN - 334)) | (1L << (SIMPLE - 334)) | (1L << (SLAVE - 334)) | (1L << (VISIBLE - 334)) | (1L << (INVISIBLE - 334)) | (1L << (ENFORCED - 334)) | (1L << (AGAINST - 334)) | (1L << (LANGUAGE - 334)) | (1L << (MODE - 334)) | (1L << (QUERY - 334)) | (1L << (EXTENDED - 334)) | (1L << (EXPANSION - 334)) | (1L << (VARIANCE - 334)) | (1L << (MAX_ROWS - 334)) | (1L << (MIN_ROWS - 334)) | (1L << (SQL_BIG_RESULT - 334)) | (1L << (SQL_BUFFER_RESULT - 334)) | (1L << (SQL_CACHE - 334)) | (1L << (SQL_NO_CACHE - 334)) | (1L << (STATS_AUTO_RECALC - 334)) | (1L << (STATS_PERSISTENT - 334)) | (1L << (STATS_SAMPLE_PAGES - 334)) | (1L << (ROW_FORMAT - 334)) | (1L << (WEIGHT_STRING - 334)) | (1L << (COLUMN_FORMAT - 334)) | (1L << (INSERT_METHOD - 334)) | (1L << (KEY_BLOCK_SIZE - 334)) | (1L << (PACK_KEYS - 334)) | (1L << (PERSIST_ONLY - 334)) | (1L << (BIT_AND - 334)) | (1L << (BIT_OR - 334)) | (1L << (BIT_XOR - 334)) | (1L << (GROUP_CONCAT - 334)) | (1L << (JSON_ARRAYAGG - 334)) | (1L << (JSON_OBJECTAGG - 334)) | (1L << (STD - 334)) | (1L << (STDDEV - 334)) | (1L << (STDDEV_POP - 334)) | (1L << (STDDEV_SAMP - 334)) | (1L << (VAR_POP - 334)) | (1L << (VAR_SAMP - 334)) | (1L << (AUTO_INCREMENT - 334)) | (1L << (AVG_ROW_LENGTH - 334)) | (1L << (DELAY_KEY_WRITE - 334)))) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (ROTATE - 411)) | (1L << (MASTER - 411)) | (1L << (BINLOG - 411)) | (1L << (ERROR - 411)) | (1L << (SCHEDULE - 411)) | (1L << (COMPLETION - 411)) | (1L << (EVERY - 411)) | (1L << (HOST - 411)) | (1L << (SOCKET - 411)) | (1L << (PORT - 411)) | (1L << (SERVER - 411)) | (1L << (WRAPPER - 411)) | (1L << (OPTIONS - 411)) | (1L << (OWNER - 411)) | (1L << (RETURNS - 411)) | (1L << (CONTAINS - 411)) | (1L << (SECURITY - 411)) | (1L << (INVOKER - 411)) | (1L << (TEMPTABLE - 411)) | (1L << (MERGE - 411)) | (1L << (UNDEFINED - 411)) | (1L << (DATAFILE - 411)) | (1L << (FILE_BLOCK_SIZE - 411)) | (1L << (EXTENT_SIZE - 411)) | (1L << (INITIAL_SIZE - 411)) | (1L << (AUTOEXTEND_SIZE - 411)) | (1L << (MAX_SIZE - 411)) | (1L << (NODEGROUP - 411)) | (1L << (WAIT - 411)) | (1L << (LOGFILE - 411)) | (1L << (UNDOFILE - 411)) | (1L << (UNDO_BUFFER_SIZE - 411)) | (1L << (REDO_BUFFER_SIZE - 411)) | (1L << (HANDLER - 411)) | (1L << (PREV - 411)) | (1L << (ORGANIZATION - 411)) | (1L << (DEFINITION - 411)) | (1L << (DESCRIPTION - 411)) | (1L << (REFERENCE - 411)) | (1L << (FOLLOWS - 411)) | (1L << (PRECEDES - 411)) | (1L << (IMPORT - 411)) | (1L << (CONCURRENT - 411)) | (1L << (XML - 411)) | (1L << (DUMPFILE - 411)) | (1L << (SHARE - 411)) | (1L << (IDENTIFIER_ - 411)))) != 0)) {
				{
				setState(3966);
				variable_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(MySQLStatementParser.CALL, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 550, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3969);
			match(CALL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 94:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 97:
			return booleanPrimary__sempred((BooleanPrimary_Context)_localctx, predIndex);
		case 100:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 101:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanPrimary__sempred(BooleanPrimary_Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 6);
		case 16:
			return precpred(_ctx, 5);
		case 17:
			return precpred(_ctx, 4);
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 8);
		case 21:
			return precpred(_ctx, 10);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01e0\u0f86\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\4\u0108\t\u0108\4\u0109\t\u0109\4\u010a\t\u010a\4\u010b\t\u010b\4\u010c"+
		"\t\u010c\4\u010d\t\u010d\4\u010e\t\u010e\4\u010f\t\u010f\4\u0110\t\u0110"+
		"\4\u0111\t\u0111\4\u0112\t\u0112\4\u0113\t\u0113\4\u0114\t\u0114\4\u0115"+
		"\t\u0115\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\u0251\n\2\3\2\5\2\u0254\n\2\3\3\3\3\3\3\5\3\u0259"+
		"\n\3\3\3\3\3\5\3\u025d\n\3\3\3\3\3\3\3\5\3\u0262\n\3\3\3\5\3\u0265\n\3"+
		"\3\4\5\4\u0268\n\4\3\4\5\4\u026b\n\4\3\5\5\5\u026e\n\5\3\5\3\5\3\5\3\5"+
		"\7\5\u0274\n\5\f\5\16\5\u0277\13\5\3\6\5\6\u027a\n\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u0285\n\7\f\7\16\7\u0288\13\7\3\b\3\b\5\b\u028c"+
		"\n\b\3\b\5\b\u028f\n\b\3\b\3\b\5\b\u0293\n\b\3\b\3\b\3\b\5\b\u0298\n\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u02a1\n\n\3\n\5\n\u02a4\n\n\3\n\5\n\u02a7"+
		"\n\n\3\13\5\13\u02aa\n\13\3\13\5\13\u02ad\n\13\3\f\3\f\3\f\5\f\u02b2\n"+
		"\f\3\f\5\f\u02b5\n\f\3\f\3\f\5\f\u02b9\n\f\3\r\3\r\3\r\3\r\7\r\u02bf\n"+
		"\r\f\r\16\r\u02c2\13\r\3\16\3\16\3\16\3\16\7\16\u02c8\n\16\f\16\16\16"+
		"\u02cb\13\16\3\16\3\16\3\16\3\16\5\16\u02d1\n\16\3\17\3\17\3\17\5\17\u02d6"+
		"\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u02df\n\21\3\21\5\21\u02e2"+
		"\n\21\3\22\5\22\u02e5\n\22\3\22\5\22\u02e8\n\22\3\22\5\22\u02eb\n\22\3"+
		"\23\3\23\3\23\5\23\u02f0\n\23\3\23\5\23\u02f3\n\23\3\23\5\23\u02f6\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0301\n\24\3\25\3\25"+
		"\5\25\u0305\n\25\3\25\3\25\3\25\5\25\u030a\n\25\7\25\u030c\n\25\f\25\16"+
		"\25\u030f\13\25\3\26\5\26\u0312\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u031b\n\27\3\27\5\27\u031e\n\27\3\30\3\30\3\30\3\30\5\30\u0324\n"+
		"\30\3\31\3\31\3\31\3\31\5\31\u032a\n\31\3\32\3\32\3\32\3\32\5\32\u0330"+
		"\n\32\3\32\5\32\u0333\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u033f\n\33\3\33\3\33\5\33\u0343\n\33\3\33\3\33\5\33\u0347\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u034f\n\34\3\34\3\34\5\34\u0353"+
		"\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u035f\n\36"+
		"\3\37\3\37\3\37\5\37\u0364\n\37\3\37\5\37\u0367\n\37\3\37\3\37\3\37\5"+
		"\37\u036c\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0376\n\37"+
		"\f\37\16\37\u0379\13\37\3\37\3\37\5\37\u037d\n\37\3\37\3\37\3\37\5\37"+
		"\u0382\n\37\3\37\3\37\6\37\u0386\n\37\r\37\16\37\u0387\5\37\u038a\n\37"+
		"\3\37\3\37\6\37\u038e\n\37\r\37\16\37\u038f\5\37\u0392\n\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0398\n\37\3\37\3\37\3\37\3\37\7\37\u039e\n\37\f\37\16"+
		"\37\u03a1\13\37\3\37\3\37\5\37\u03a5\n\37\3\37\5\37\u03a8\n\37\3 \3 \3"+
		" \5 \u03ad\n \3 \5 \u03b0\n \3 \3 \3 \5 \u03b5\n \3 \3 \3 \3 \3 \3 \5"+
		" \u03bd\n \3 \3 \3 \3 \3 \3 \5 \u03c5\n \3 \3 \3 \3 \5 \u03cb\n \3 \3"+
		" \3 \3 \7 \u03d1\n \f \16 \u03d4\13 \3 \3 \5 \u03d8\n \3 \5 \u03db\n "+
		"\3!\3!\5!\u03df\n!\3!\3!\3!\7!\u03e4\n!\f!\16!\u03e7\13!\3\"\3\"\5\"\u03eb"+
		"\n\"\3\"\3\"\3\"\3#\3#\3#\5#\u03f3\n#\3#\7#\u03f6\n#\f#\16#\u03f9\13#"+
		"\3$\3$\7$\u03fd\n$\f$\16$\u0400\13$\3$\3$\5$\u0404\n$\3$\5$\u0407\n$\3"+
		"$\5$\u040a\n$\3$\5$\u040d\n$\3$\5$\u0410\n$\3$\5$\u0413\n$\3$\5$\u0416"+
		"\n$\3$\5$\u0419\n$\3$\5$\u041c\n$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0426\n%"+
		"\3&\3&\3\'\3\'\5\'\u042c\n\'\3\'\3\'\7\'\u0430\n\'\f\'\16\'\u0433\13\'"+
		"\3(\3(\5(\u0437\n(\3(\5(\u043a\n(\3(\5(\u043d\n(\3(\5(\u0440\n(\3)\3)"+
		"\5)\u0444\n)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\7-\u0451\n-\f-\16-\u0454"+
		"\13-\3.\3.\3.\3.\3.\3.\5.\u045c\n.\3/\3/\3/\6/\u0461\n/\r/\16/\u0462\3"+
		"/\3/\7/\u0467\n/\f/\16/\u046a\13/\5/\u046c\n/\3\60\3\60\5\60\u0470\n\60"+
		"\3\60\5\60\u0473\n\60\3\60\5\60\u0476\n\60\3\60\5\60\u0479\n\60\3\60\3"+
		"\60\5\60\u047d\n\60\3\60\3\60\3\60\3\60\5\60\u0483\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u048a\n\61\f\61\16\61\u048d\13\61\3\61\3\61\3\62\3\62"+
		"\3\62\7\62\u0494\n\62\f\62\16\62\u0497\13\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u04a1\n\63\5\63\u04a3\n\63\3\63\3\63\3\63\3\63\7"+
		"\63\u04a9\n\63\f\63\16\63\u04ac\13\63\3\63\3\63\3\64\5\64\u04b1\n\64\3"+
		"\64\3\64\5\64\u04b5\n\64\3\64\3\64\5\64\u04b9\n\64\3\64\3\64\5\64\u04bd"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u04c7\n\64\3\64\3\64"+
		"\5\64\u04cb\n\64\3\65\3\65\3\65\3\65\5\65\u04d1\n\65\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\7\67\u04db\n\67\f\67\16\67\u04de\13\67\3\67\3"+
		"\67\5\67\u04e2\n\67\38\38\38\39\39\39\39\59\u04eb\n9\39\39\39\39\39\5"+
		"9\u04f2\n9\3:\3:\5:\u04f6\n:\3;\3;\5;\u04fa\n;\3<\3<\3<\3<\7<\u0500\n"+
		"<\f<\16<\u0503\13<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\5>\u050f\n>\3>\5>\u0512"+
		"\n>\3?\3?\3?\3?\3?\3?\5?\u051a\n?\3@\3@\3@\3@\5@\u0520\n@\3@\3@\3@\3@"+
		"\3@\3@\5@\u0528\n@\3A\3A\3A\3A\7A\u052e\nA\fA\16A\u0531\13A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\5A\u053c\nA\3A\3A\6A\u0540\nA\rA\16A\u0541\5A\u0544\n"+
		"A\3A\3A\6A\u0548\nA\rA\16A\u0549\5A\u054c\nA\5A\u054e\nA\3B\3B\3B\3B\3"+
		"B\3B\5B\u0556\nB\3C\3C\3D\3D\3D\3D\3D\3D\3D\5D\u0561\nD\3E\5E\u0564\n"+
		"E\3E\3E\5E\u0568\nE\3F\5F\u056b\nF\3F\3F\3G\3G\3G\3G\3G\3G\3G\5G\u0576"+
		"\nG\3H\5H\u0579\nH\3H\3H\5H\u057d\nH\3I\5I\u0580\nI\3I\3I\5I\u0584\nI"+
		"\3J\3J\3K\3K\3L\3L\5L\u058c\nL\3M\5M\u058f\nM\3M\5M\u0592\nM\3M\5M\u0595"+
		"\nM\3M\5M\u0598\nM\3M\3M\3N\3N\3N\3N\3N\5N\u05a1\nN\3O\3O\3P\3P\3Q\3Q"+
		"\3Q\5Q\u05aa\nQ\3Q\3Q\3R\3R\3R\5R\u05b1\nR\3R\3R\3S\3S\3S\3S\3S\3S\5S"+
		"\u05bb\nS\3T\3T\3T\3T\3T\3T\5T\u05c3\nT\3U\3U\5U\u05c7\nU\3V\3V\5V\u05cb"+
		"\nV\3W\3W\3W\3W\5W\u05d1\nW\3W\5W\u05d4\nW\3X\3X\3X\3X\5X\u05da\nX\3X"+
		"\5X\u05dd\nX\3Y\3Y\3Z\3Z\3[\5[\u05e4\n[\3[\3[\3[\7[\u05e9\n[\f[\16[\u05ec"+
		"\13[\3[\5[\u05ef\n[\3\\\5\\\u05f2\n\\\3\\\3\\\3\\\7\\\u05f7\n\\\f\\\16"+
		"\\\u05fa\13\\\3\\\5\\\u05fd\n\\\3]\3]\3^\3^\3_\3_\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\5`\u060e\n`\3`\3`\3`\3`\3`\3`\3`\7`\u0617\n`\f`\16`\u061a\13`"+
		"\3a\3a\3b\3b\3c\3c\3c\3c\3c\3c\5c\u0626\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c"+
		"\3c\3c\3c\3c\7c\u0635\nc\fc\16c\u0638\13c\3d\3d\3e\3e\5e\u063e\ne\3e\3"+
		"e\3e\3e\3e\5e\u0645\ne\3e\3e\3e\3e\3e\7e\u064c\ne\fe\16e\u064f\13e\3e"+
		"\3e\3e\3e\5e\u0655\ne\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0663\ne"+
		"\3e\3e\3e\3e\5e\u0669\ne\3e\3e\5e\u066d\ne\3e\3e\3e\3e\5e\u0673\ne\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\7f\u06a2"+
		"\nf\ff\16f\u06a5\13f\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u06b0\ng\3g\3g\3g\3"+
		"g\7g\u06b6\ng\fg\16g\u06b9\13g\3g\3g\3g\5g\u06be\ng\3g\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\5g\u06c9\ng\3g\3g\3g\3g\3g\3g\3g\5g\u06d2\ng\7g\u06d4\ng\fg"+
		"\16g\u06d7\13g\3h\3h\3h\5h\u06dc\nh\3i\3i\3i\5i\u06e1\ni\3i\3i\3i\7i\u06e6"+
		"\ni\fi\16i\u06e9\13i\3i\5i\u06ec\ni\3i\3i\5i\u06f0\ni\3j\3j\3k\3k\3l\3"+
		"l\3l\3l\3l\3l\5l\u06fc\nl\3m\5m\u06ff\nm\3m\5m\u0702\nm\3m\5m\u0705\n"+
		"m\3m\5m\u0708\nm\3n\3n\3n\3n\3n\7n\u070f\nn\fn\16n\u0712\13n\3o\3o\3o"+
		"\5o\u0717\no\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u0725\np\3q\3q\3r"+
		"\3r\3r\3r\3r\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0738\ns\3t\3t\3t\5t\u073d"+
		"\nt\3t\3t\3t\7t\u0742\nt\ft\16t\u0745\13t\3t\5t\u0748\nt\3t\5t\u074b\n"+
		"t\3t\3t\5t\u074f\nt\3t\3t\3u\3u\3u\3u\3u\7u\u0758\nu\fu\16u\u075b\13u"+
		"\3u\3u\3u\3v\3v\3v\3v\3v\3v\3v\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w"+
		"\3w\5w\u0775\nw\3x\3x\3x\3x\3x\3x\3x\3y\3y\3y\3y\3y\3y\3y\5y\u0785\ny"+
		"\3y\3y\3z\3z\3z\3z\3z\3z\3z\3{\3{\3{\3{\3{\7{\u0795\n{\f{\16{\u0798\13"+
		"{\3{\3{\5{\u079c\n{\3{\3{\3|\3|\3|\3|\3|\3|\3|\3|\3}\3}\3}\3}\3}\5}\u07ad"+
		"\n}\3}\5}\u07b0\n}\3}\3}\3~\3~\3~\3~\7~\u07b8\n~\f~\16~\u07bb\13~\3~\3"+
		"~\3~\5~\u07c0\n~\3\177\3\177\5\177\u07c4\n\177\3\177\5\177\u07c7\n\177"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u07ce\n\u0080\f\u0080"+
		"\16\u0080\u07d1\13\u0080\3\u0080\5\u0080\u07d4\n\u0080\3\u0080\3\u0080"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u07e1\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u07e8\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u07fb\n\u0083\3\u0084\3\u0084\5\u0084\u07ff\n\u0084\3"+
		"\u0084\6\u0084\u0802\n\u0084\r\u0084\16\u0084\u0803\3\u0084\5\u0084\u0807"+
		"\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086"+
		"\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u081e\n\u0089\f\u0089\16\u0089"+
		"\u0821\13\u0089\3\u008a\3\u008a\3\u008a\5\u008a\u0826\n\u008a\3\u008a"+
		"\5\u008a\u0829\n\u008a\3\u008b\3\u008b\5\u008b\u082d\n\u008b\3\u008b\5"+
		"\u008b\u0830\n\u008b\3\u008b\5\u008b\u0833\n\u008b\3\u008b\5\u008b\u0836"+
		"\n\u008b\3\u008b\5\u008b\u0839\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\7\u008b\u0840\n\u008b\f\u008b\16\u008b\u0843\13\u008b\3\u008b"+
		"\3\u008b\5\u008b\u0847\n\u008b\3\u008b\5\u008b\u084a\n\u008b\5\u008b\u084c"+
		"\n\u008b\3\u008c\3\u008c\5\u008c\u0850\n\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\5\u008d\u0856\n\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e"+
		"\5\u008e\u085d\n\u008e\3\u008e\3\u008e\3\u008f\3\u008f\5\u008f\u0863\n"+
		"\u008f\3\u008f\3\u008f\5\u008f\u0867\n\u008f\3\u0090\3\u0090\3\u0090\5"+
		"\u0090\u086c\n\u0090\3\u0091\3\u0091\3\u0091\7\u0091\u0871\n\u0091\f\u0091"+
		"\16\u0091\u0874\13\u0091\3\u0092\3\u0092\5\u0092\u0878\n\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u087f\n\u0092\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u0886\n\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\5\u0093\u088c\n\u0093\3\u0093\3\u0093\5\u0093\u0890\n\u0093\3"+
		"\u0093\3\u0093\3\u0093\5\u0093\u0895\n\u0093\3\u0093\7\u0093\u0898\n\u0093"+
		"\f\u0093\16\u0093\u089b\13\u0093\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u08a1\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096"+
		"\3\u0096\3\u0096\5\u0096\u08ac\n\u0096\3\u0096\3\u0096\3\u0096\5\u0096"+
		"\u08b1\n\u0096\3\u0096\3\u0096\5\u0096\u08b5\n\u0096\3\u0096\3\u0096\3"+
		"\u0096\5\u0096\u08ba\n\u0096\3\u0096\7\u0096\u08bd\n\u0096\f\u0096\16"+
		"\u0096\u08c0\13\u0096\3\u0097\3\u0097\5\u0097\u08c4\n\u0097\3\u0097\3"+
		"\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u08cd\n\u0098\3"+
		"\u0098\3\u0098\7\u0098\u08d1\n\u0098\f\u0098\16\u0098\u08d4\13\u0098\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u08da\n\u0099\f\u0099\16\u0099"+
		"\u08dd\13\u0099\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u08e3\n\u009a"+
		"\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\5\u009c\u08f9\n\u009c\5\u009c\u08fb\n\u009c\3\u009d\3"+
		"\u009d\5\u009d\u08ff\n\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u0905"+
		"\n\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d"+
		"\u090e\n\u009d\3\u009d\5\u009d\u0911\n\u009d\3\u009d\3\u009d\3\u009d\3"+
		"\u009d\3\u009d\5\u009d\u0918\n\u009d\3\u009d\3\u009d\5\u009d\u091c\n\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\5\u009e\u0923\n\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u092a\n\u009e\3\u009e\3\u009e"+
		"\3\u009e\5\u009e\u092f\n\u009e\3\u009e\5\u009e\u0932\n\u009e\3\u009e\3"+
		"\u009e\3\u009e\5\u009e\u0937\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3"+
		"\u009e\5\u009e\u093e\n\u009e\3\u009e\3\u009e\5\u009e\u0942\n\u009e\3\u009e"+
		"\3\u009e\5\u009e\u0946\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f"+
		"\u094c\n\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\5\u00a0\u0952\n\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u095a\n\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u0960\n\u00a0\f\u00a0\16\u00a0"+
		"\u0963\13\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u0969\n\u00a0"+
		"\f\u00a0\16\u00a0\u096c\13\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\7\u00a1\u0974\n\u00a1\f\u00a1\16\u00a1\u0977\13\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3"+
		"\u0982\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0988\n\u00a3\3"+
		"\u00a3\3\u00a3\7\u00a3\u098c\n\u00a3\f\u00a3\16\u00a3\u098f\13\u00a3\3"+
		"\u00a3\3\u00a3\7\u00a3\u0993\n\u00a3\f\u00a3\16\u00a3\u0996\13\u00a3\3"+
		"\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u099e\n\u00a4\f"+
		"\u00a4\16\u00a4\u09a1\13\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u09a7\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u09b7"+
		"\n\u00a6\f\u00a6\16\u00a6\u09ba\13\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u09c6\n\u00a7"+
		"\f\u00a7\16\u00a7\u09c9\13\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\5\u00a8\u09d1\n\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u09d8\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u09dd\n\u00a9\3"+
		"\u00a9\5\u00a9\u09e0\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u09e5\n\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u09ed\n\u00a9"+
		"\f\u00a9\16\u00a9\u09f0\13\u00a9\3\u00a9\3\u00a9\5\u00a9\u09f4\n\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u09fa\n\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u09fe\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0a04\n"+
		"\u00aa\3\u00aa\5\u00aa\u0a07\n\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0a0c"+
		"\n\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u0a14"+
		"\n\u00aa\f\u00aa\16\u00aa\u0a17\13\u00aa\3\u00aa\3\u00aa\5\u00aa\u0a1b"+
		"\n\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0a21\n\u00aa\3\u00aa"+
		"\3\u00aa\5\u00aa\u0a25\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab"+
		"\u0a2b\n\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0a30\n\u00ab\f\u00ab\16"+
		"\u00ab\u0a33\13\u00ab\3\u00ab\5\u00ab\u0a36\n\u00ab\3\u00ac\3\u00ac\5"+
		"\u00ac\u0a3a\n\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3"+
		"\u00ac\3\u00ac\5\u00ac\u0a44\n\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0a49"+
		"\n\u00ac\3\u00ac\3\u00ac\5\u00ac\u0a4d\n\u00ac\3\u00ac\5\u00ac\u0a50\n"+
		"\u00ac\3\u00ad\3\u00ad\5\u00ad\u0a54\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad"+
		"\u0a61\n\u00ad\3\u00ad\5\u00ad\u0a64\n\u00ad\3\u00ad\3\u00ad\5\u00ad\u0a68"+
		"\n\u00ad\3\u00ad\5\u00ad\u0a6b\n\u00ad\3\u00ad\3\u00ad\5\u00ad\u0a6f\n"+
		"\u00ad\3\u00ad\5\u00ad\u0a72\n\u00ad\3\u00ad\3\u00ad\5\u00ad\u0a76\n\u00ad"+
		"\3\u00ad\5\u00ad\u0a79\n\u00ad\3\u00ad\3\u00ad\5\u00ad\u0a7d\n\u00ad\3"+
		"\u00ad\5\u00ad\u0a80\n\u00ad\3\u00ad\5\u00ad\u0a83\n\u00ad\3\u00ad\3\u00ad"+
		"\5\u00ad\u0a87\n\u00ad\3\u00ad\5\u00ad\u0a8a\n\u00ad\3\u00ad\3\u00ad\5"+
		"\u00ad\u0a8e\n\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3"+
		"\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0a9b\n\u00ae\3\u00ae\5"+
		"\u00ae\u0a9e\n\u00ae\3\u00ae\3\u00ae\5\u00ae\u0aa2\n\u00ae\3\u00ae\3\u00ae"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u0aab\n\u00af\3\u00af"+
		"\5\u00af\u0aae\n\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0ab9\n\u00b0\3\u00b0\5\u00b0\u0abc\n"+
		"\u00b0\3\u00b0\3\u00b0\5\u00b0\u0ac0\n\u00b0\3\u00b0\5\u00b0\u0ac3\n\u00b0"+
		"\3\u00b0\3\u00b0\5\u00b0\u0ac7\n\u00b0\3\u00b0\5\u00b0\u0aca\n\u00b0\3"+
		"\u00b0\3\u00b0\5\u00b0\u0ace\n\u00b0\3\u00b0\5\u00b0\u0ad1\n\u00b0\3\u00b0"+
		"\5\u00b0\u0ad4\n\u00b0\3\u00b0\3\u00b0\5\u00b0\u0ad8\n\u00b0\3\u00b0\5"+
		"\u00b0\u0adb\n\u00b0\3\u00b0\3\u00b0\5\u00b0\u0adf\n\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\5\u00b1\u0aec\n\u00b1\3\u00b1\5\u00b1\u0aef\n\u00b1\3\u00b1\5\u00b1\u0af2"+
		"\n\u00b1\3\u00b1\3\u00b1\5\u00b1\u0af6\n\u00b1\3\u00b1\3\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3"+
		"\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0b07\n\u00b4\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b6\5\u00b6\u0b0e\n\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6"+
		"\u0b13\n\u00b6\3\u00b6\5\u00b6\u0b16\n\u00b6\3\u00b6\3\u00b6\5\u00b6\u0b1a"+
		"\n\u00b6\3\u00b6\3\u00b6\5\u00b6\u0b1e\n\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\5\u00b6\u0b25\n\u00b6\3\u00b7\3\u00b7\3\u00b7\7\u00b7"+
		"\u0b2a\n\u00b7\f\u00b7\16\u00b7\u0b2d\13\u00b7\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\5\u00b8\u0b33\n\u00b8\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u0b38\n"+
		"\u00b9\f\u00b9\16\u00b9\u0b3b\13\u00b9\3\u00b9\7\u00b9\u0b3e\n\u00b9\f"+
		"\u00b9\16\u00b9\u0b41\13\u00b9\5\u00b9\u0b43\n\u00b9\3\u00ba\3\u00ba\3"+
		"\u00ba\3\u00ba\3\u00ba\5\u00ba\u0b4a\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3"+
		"\u00ba\5\u00ba\u0b50\n\u00ba\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0b55\n\u00bb"+
		"\3\u00bb\5\u00bb\u0b58\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\5\u00bb\u0b60\n\u00bb\3\u00bc\3\u00bc\5\u00bc\u0b64\n\u00bc\5"+
		"\u00bc\u0b66\n\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0b6b\n\u00bc\3\u00bc"+
		"\5\u00bc\u0b6e\n\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0b79\n\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\7\u00bd\u0b7e\n\u00bd\f\u00bd\16\u00bd\u0b81\13\u00bd\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0b8b\n\u00be"+
		"\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0b90\n\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\5\u00bf\u0b95\n\u00bf\3\u00c0\5\u00c0\u0b98\n\u00c0\3\u00c0\5\u00c0\u0b9b"+
		"\n\u00c0\3\u00c0\5\u00c0\u0b9e\n\u00c0\3\u00c0\5\u00c0\u0ba1\n\u00c0\3"+
		"\u00c0\3\u00c0\7\u00c0\u0ba5\n\u00c0\f\u00c0\16\u00c0\u0ba8\13\u00c0\3"+
		"\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\7\u00c2\u0bb1\n"+
		"\u00c2\f\u00c2\16\u00c2\u0bb4\13\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\5\u00c3\u0bbc\n\u00c3\3\u00c3\5\u00c3\u0bbf\n\u00c3\3"+
		"\u00c3\5\u00c3\u0bc2\n\u00c3\3\u00c4\3\u00c4\5\u00c4\u0bc6\n\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0bd0"+
		"\n\u00c4\3\u00c5\3\u00c5\5\u00c5\u0bd4\n\u00c5\5\u00c5\u0bd6\n\u00c5\3"+
		"\u00c5\3\u00c5\3\u00c5\5\u00c5\u0bdb\n\u00c5\3\u00c6\3\u00c6\5\u00c6\u0bdf"+
		"\n\u00c6\3\u00c6\3\u00c6\7\u00c6\u0be3\n\u00c6\f\u00c6\16\u00c6\u0be6"+
		"\13\u00c6\3\u00c7\5\u00c7\u0be9\n\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8"+
		"\5\u00c8\u0bef\n\u00c8\3\u00c8\5\u00c8\u0bf2\n\u00c8\3\u00c8\5\u00c8\u0bf5"+
		"\n\u00c8\3\u00c8\3\u00c8\7\u00c8\u0bf9\n\u00c8\f\u00c8\16\u00c8\u0bfc"+
		"\13\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0c01\n\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00ca\5\u00ca\u0c07\n\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca"+
		"\u0c0c\n\u00ca\3\u00cb\5\u00cb\u0c0f\n\u00cb\3\u00cc\3\u00cc\3\u00cc\7"+
		"\u00cc\u0c14\n\u00cc\f\u00cc\16\u00cc\u0c17\13\u00cc\3\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u0c26\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\5\u00cd\u0c2c\n\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0c31\n\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0c39\n\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0c42\n"+
		"\u00cd\3\u00cd\3\u00cd\5\u00cd\u0c46\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\5\u00cd\u0c4c\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\5\u00cd\u0c5c\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd"+
		"\u0c75\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0c7c\n"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0c83\n\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd"+
		"\u0c96\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0c9c\n\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0ca2\n\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\5\u00cd\u0ca8\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5"+
		"\u00cd\u0cae\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0cb4\n\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0cba\n\u00cd\3\u00ce\3\u00ce"+
		"\5\u00ce\u0cbe\n\u00ce\3\u00ce\7\u00ce\u0cc1\n\u00ce\f\u00ce\16\u00ce"+
		"\u0cc4\13\u00ce\3\u00cf\3\u00cf\5\u00cf\u0cc8\n\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\5\u00cf\u0ccd\n\u00cf\3\u00cf\3\u00cf\5\u00cf\u0cd1\n\u00cf\3"+
		"\u00cf\3\u00cf\5\u00cf\u0cd5\n\u00cf\3\u00cf\3\u00cf\5\u00cf\u0cd9\n\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0cde\n\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\5\u00cf\u0ce3\n\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0ce8\n\u00cf\3"+
		"\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0cee\n\u00cf\3\u00cf\3\u00cf\3"+
		"\u00cf\5\u00cf\u0cf3\n\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0cf8\n\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0cfd\n\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\5\u00cf\u0d02\n\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0d07\n\u00cf\3"+
		"\u00cf\3\u00cf\3\u00cf\5\u00cf\u0d0c\n\u00cf\3\u00cf\3\u00cf\3\u00cf\5"+
		"\u00cf\u0d11\n\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0d16\n\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\5\u00cf\u0d1b\n\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf"+
		"\u0d20\n\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0d25\n\u00cf\3\u00cf\3"+
		"\u00cf\3\u00cf\5\u00cf\u0d2a\n\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0d2f"+
		"\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0d36\n\u00cf"+
		"\3\u00cf\3\u00cf\5\u00cf\u0d3a\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\7\u00cf\u0d40\n\u00cf\f\u00cf\16\u00cf\u0d43\13\u00cf\3\u00cf\3\u00cf"+
		"\5\u00cf\u0d47\n\u00cf\3\u00d0\3\u00d0\5\u00d0\u0d4b\n\u00d0\3\u00d0\3"+
		"\u00d0\5\u00d0\u0d4f\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0d55"+
		"\n\u00d0\f\u00d0\16\u00d0\u0d58\13\u00d0\3\u00d0\3\u00d0\5\u00d0\u0d5c"+
		"\n\u00d0\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0d61\n\u00d1\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\5\u00d4\u0d6b\n\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0d70\n\u00d4\3\u00d5\3\u00d5\5\u00d5"+
		"\u0d74\n\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d8\3\u00d8\5\u00d8\u0d81\n\u00d8\3\u00d8\3\u00d8"+
		"\5\u00d8\u0d85\n\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db\5\u00db"+
		"\u0d95\n\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc"+
		"\u0d9d\n\u00dc\f\u00dc\16\u00dc\u0da0\13\u00dc\3\u00dc\3\u00dc\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\5\u00dd\u0daf\n\u00dd\5\u00dd\u0db1\n\u00dd\3\u00dd\7\u00dd\u0db4"+
		"\n\u00dd\f\u00dd\16\u00dd\u0db7\13\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\7\u00dd\u0dbd\n\u00dd\f\u00dd\16\u00dd\u0dc0\13\u00dd\3\u00dd\3\u00dd"+
		"\5\u00dd\u0dc4\n\u00dd\3\u00de\3\u00de\3\u00de\5\u00de\u0dc9\n\u00de\3"+
		"\u00de\3\u00de\3\u00de\5\u00de\u0dce\n\u00de\3\u00df\3\u00df\3\u00df\7"+
		"\u00df\u0dd3\n\u00df\f\u00df\16\u00df\u0dd6\13\u00df\3\u00e0\5\u00e0\u0dd9"+
		"\n\u00e0\3\u00e0\3\u00e0\5\u00e0\u0ddd\n\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\5\u00e0\u0de2\n\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0de8\n"+
		"\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0dee\n\u00e0\3\u00e0\3"+
		"\u00e0\3\u00e0\5\u00e0\u0df3\n\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0df8"+
		"\n\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0dfd\n\u00e0\3\u00e0\5\u00e0"+
		"\u0e00\n\u00e0\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0e05\n\u00e1\f\u00e1\16"+
		"\u00e1\u0e08\13\u00e1\3\u00e2\5\u00e2\u0e0b\n\u00e2\3\u00e3\3\u00e3\5"+
		"\u00e3\u0e0f\n\u00e3\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3"+
		"\u00e5\3\u00e5\5\u00e5\u0e19\n\u00e5\5\u00e5\u0e1b\n\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\7\u00e6\u0e21\n\u00e6\f\u00e6\16\u00e6\u0e24\13\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\7\u00e6\u0e2c\n\u00e6"+
		"\f\u00e6\16\u00e6\u0e2f\13\u00e6\5\u00e6\u0e31\n\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\7\u00e6\u0e37\n\u00e6\f\u00e6\16\u00e6\u0e3a\13\u00e6"+
		"\5\u00e6\u0e3c\n\u00e6\5\u00e6\u0e3e\n\u00e6\3\u00e7\3\u00e7\3\u00e7\3"+
		"\u00e7\5\u00e7\u0e44\n\u00e7\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\3"+
		"\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\5\u00e9\u0e56\n\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\5\u00ea\u0e5d\n\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u0e6a\n\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u0e6f\n\u00ea\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0e79\n\u00ec\3\u00ed"+
		"\3\u00ed\5\u00ed\u0e7d\n\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\5\u00ee"+
		"\u0e83\n\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00f0"+
		"\3\u00f0\3\u00f0\5\u00f0\u0e8e\n\u00f0\3\u00f1\3\u00f1\3\u00f2\3\u00f2"+
		"\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f4\5\u00f4\u0e9a\n\u00f4"+
		"\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\5\u00f5\u0ea1\n\u00f5\3\u00f6"+
		"\3\u00f6\3\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f9"+
		"\3\u00f9\5\u00f9\u0eae\n\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00fa"+
		"\3\u00fa\5\u00fa\u0eb6\n\u00fa\3\u00fa\3\u00fa\3\u00fa\5\u00fa\u0ebb\n"+
		"\u00fa\7\u00fa\u0ebd\n\u00fa\f\u00fa\16\u00fa\u0ec0\13\u00fa\3\u00fb\3"+
		"\u00fb\5\u00fb\u0ec4\n\u00fb\3\u00fb\3\u00fb\5\u00fb\u0ec8\n\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\5\u00fb\u0eff"+
		"\n\u00fb\3\u00fc\5\u00fc\u0f02\n\u00fc\3\u00fc\3\u00fc\3\u00fd\3\u00fd"+
		"\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\5\u00fe\u0f0f"+
		"\n\u00fe\3\u00ff\3\u00ff\3\u00ff\3\u0100\3\u0100\3\u0100\3\u0101\3\u0101"+
		"\3\u0101\3\u0102\3\u0102\3\u0102\3\u0103\3\u0103\3\u0103\3\u0104\3\u0104"+
		"\3\u0104\3\u0105\3\u0105\5\u0105\u0f25\n\u0105\3\u0105\3\u0105\3\u0106"+
		"\3\u0106\3\u0106\3\u0107\3\u0107\3\u0107\3\u0108\3\u0108\3\u0108\3\u0109"+
		"\3\u0109\3\u0109\3\u0109\5\u0109\u0f36\n\u0109\3\u010a\3\u010a\5\u010a"+
		"\u0f3a\n\u010a\3\u010a\5\u010a\u0f3d\n\u010a\3\u010a\3\u010a\5\u010a\u0f41"+
		"\n\u010a\3\u010a\3\u010a\5\u010a\u0f45\n\u010a\3\u010b\3\u010b\3\u010b"+
		"\3\u010b\5\u010b\u0f4b\n\u010b\3\u010b\3\u010b\5\u010b\u0f4f\n\u010b\3"+
		"\u010c\3\u010c\5\u010c\u0f53\n\u010c\3\u010c\5\u010c\u0f56\n\u010c\3\u010c"+
		"\3\u010c\3\u010c\5\u010c\u0f5b\n\u010c\3\u010c\3\u010c\5\u010c\u0f5f\n"+
		"\u010c\3\u010d\3\u010d\5\u010d\u0f63\n\u010d\3\u010d\3\u010d\3\u010d\5"+
		"\u010d\u0f68\n\u010d\3\u010d\5\u010d\u0f6b\n\u010d\3\u010e\3\u010e\3\u010e"+
		"\3\u010e\3\u010e\3\u010f\3\u010f\3\u0110\3\u0110\3\u0110\3\u0111\3\u0111"+
		"\3\u0111\3\u0112\3\u0112\3\u0112\3\u0113\3\u0113\3\u0113\3\u0114\3\u0114"+
		"\5\u0114\u0f82\n\u0114\3\u0115\3\u0115\3\u0115\2\6\u00be\u00c4\u00ca\u00cc"+
		"\u0116\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"+
		"\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a"+
		"\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162"+
		"\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a"+
		"\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192"+
		"\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa"+
		"\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2"+
		"\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da"+
		"\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2"+
		"\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a"+
		"\u020c\u020e\u0210\u0212\u0214\u0216\u0218\u021a\u021c\u021e\u0220\u0222"+
		"\u0224\u0226\u0228\2H\4\2\u0110\u0110\u0162\u0163\4\2SS\u00c1\u00c1\4"+
		"\2\u0110\u0110\u0163\u0163\5\2\u00af\u00af\u00c3\u00c4\u01c6\u01c6\4\2"+
		"\u00af\u00af\u00c3\u00c3\4\2\u0163\u0163\u01cf\u01cf\4\2\u00be\u00be\u0126"+
		"\u0126\3\2\u00ba\u00bb\4\2\u00d3\u00d3\u01d1\u01d1\4\2VVxx\4\2\u0166\u0166"+
		"\u0168\u0168\5\2VVxx\u00c0\u00c0\5\2\u00b2\u00b2\u0121\u0121\u0126\u0126"+
		"\4\2FFKK\4\2``dd\3\2bc\3\2\u008d\u008f\3\2st\6\2\u0123\u0123\u0139\u0139"+
		"\u014e\u014e\u017b\u017bF\2>>LLQQyy\u0082\u0087\u008d\u008f\u0092\u009f"+
		"\u00a1\u00a3\u00a5\u00a5\u00a7\u00a8\u00ab\u00b0\u00b8\u00bd\u00bf\u00bf"+
		"\u00c1\u00c6\u00cd\u00d1\u00d4\u00d4\u00d6\u00d6\u00d9\u00da\u00dc\u00dc"+
		"\u00de\u00df\u00e1\u00e1\u00e4\u00e4\u00e6\u00e6\u00e8\u00ec\u00ef\u00f1"+
		"\u00f3\u00f4\u00f8\u00f9\u00fb\u00fb\u00fe\u00ff\u0101\u0105\u0107\u010c"+
		"\u010f\u010f\u0112\u0113\u0115\u0118\u011a\u011a\u011c\u011c\u011e\u0120"+
		"\u0123\u0124\u0127\u0127\u012b\u012b\u012f\u0130\u0136\u013d\u013f\u013f"+
		"\u0141\u0141\u0143\u0144\u0146\u0147\u014b\u014b\u014e\u014e\u0150\u0152"+
		"\u0155\u0156\u0158\u0161\u0164\u0166\u0168\u0168\u016a\u016c\u016e\u016e"+
		"\u0173\u0174\u0178\u0187\u0189\u018a\u018c\u018c\u019d\u01a3\u01a6\u01ac"+
		"\u01ae\u01af\u01b2\u01b3\u01b6\u01cd\u01cf\u01cf\u01d7\u01d7\u01d9\u01d9"+
		"\u01db\u01db\3\2\u01dc\u01dd\4\2\f\rno\4\2\16\16qq\4\2rt\u00ea\u00ea\3"+
		"\2xy\3\2 %\3\2\u00cb\u00cc\5\2\16\17\27\30\u00d5\u00d5\6\2\u009b\u009f"+
		"\u015f\u015f\u017c\u017e\u0180\u0187\4\2\u00d3\u00d3\u013e\u013e\4\2["+
		"[\u00dd\u00dd\5\2\u00e0\u00e0\u00fd\u00fd\u012a\u012a\3\2~\177\4\2\u0092"+
		"\u009a\u0191\u019b\3\2\u0089\u008a\5\2\u00a0\u00a0\u010e\u010e\u0128\u0128"+
		"\6\2\u00a0\u00a0\u011b\u011b\u0130\u0130\u014f\u014f\4\2??\u00b6\u00b6"+
		"\3\2\u01b6\u01b8\4\2\u00a8\u00a8\u01b3\u01b3\3\2\u00ab\u00ac\4\2\u00ed"+
		"\u00ed\u014a\u014a\3\2\5\6\4\2==BB\5\2\u00a0\u00a0\u0114\u0114\u011f\u011f"+
		"\5\2\u00a0\u00a0\u0113\u0113\u012f\u012f\3\29:\4\2\u00db\u00db\u00e7\u00e7"+
		"\4\2\u0122\u0122\u0153\u0153\4\2\u00fe\u00fe\u0124\u0124\3\2\u0155\u0156"+
		"\5\2II\u0122\u0122\u0153\u0153\6\2\u00a0\u00a0\u010e\u010e\u0128\u0128"+
		"\u0157\u0157\3\2\u00a2\u00a3\4\2\u0112\u0112\u0127\u0127\4\2TT\u00d4\u00d4"+
		"\4\2FF\u010f\u010f\4\2\u00c3\u00c4\u00f1\u00f1\4\2\u00a0\u00a0\u01de\u01de"+
		"\7\2\u00a0\u00a0\u0108\u0109\u0114\u0114\u011f\u011f\u0141\u0141\4\2g"+
		"gmm\3\2\u0132\u0133\4\2ww\u01b4\u01b5\3\2\b\13\5\2hh\u00eb\u00eb\u01de"+
		"\u01de\5\2DDNNPP\4\2\177\177\u00b3\u00b3\4\2\u00b5\u00b5\u00b7\u00b7\5"+
		"\2FF\u00bc\u00bc\u0129\u0129\4\2\\\\ww\2\u1198\2\u0250\3\2\2\2\4\u0255"+
		"\3\2\2\2\6\u0267\3\2\2\2\b\u026d\3\2\2\2\n\u0279\3\2\2\2\f\u027d\3\2\2"+
		"\2\16\u0289\3\2\2\2\20\u0299\3\2\2\2\22\u029b\3\2\2\2\24\u02a9\3\2\2\2"+
		"\26\u02ae\3\2\2\2\30\u02ba\3\2\2\2\32\u02d0\3\2\2\2\34\u02d5\3\2\2\2\36"+
		"\u02d7\3\2\2\2 \u02da\3\2\2\2\"\u02e4\3\2\2\2$\u02ec\3\2\2\2&\u0300\3"+
		"\2\2\2(\u0302\3\2\2\2*\u0311\3\2\2\2,\u0315\3\2\2\2.\u031f\3\2\2\2\60"+
		"\u0329\3\2\2\2\62\u032b\3\2\2\2\64\u0334\3\2\2\2\66\u0348\3\2\2\28\u0354"+
		"\3\2\2\2:\u0358\3\2\2\2<\u0360\3\2\2\2>\u03a9\3\2\2\2@\u03dc\3\2\2\2B"+
		"\u03e8\3\2\2\2D\u03ef\3\2\2\2F\u03fa\3\2\2\2H\u0425\3\2\2\2J\u0427\3\2"+
		"\2\2L\u042b\3\2\2\2N\u043f\3\2\2\2P\u0443\3\2\2\2R\u0445\3\2\2\2T\u0447"+
		"\3\2\2\2V\u044a\3\2\2\2X\u044d\3\2\2\2Z\u045b\3\2\2\2\\\u046b\3\2\2\2"+
		"^\u0482\3\2\2\2`\u0484\3\2\2\2b\u0490\3\2\2\2d\u0498\3\2\2\2f\u04ca\3"+
		"\2\2\2h\u04d0\3\2\2\2j\u04d2\3\2\2\2l\u04d5\3\2\2\2n\u04e3\3\2\2\2p\u04e6"+
		"\3\2\2\2r\u04f5\3\2\2\2t\u04f9\3\2\2\2v\u04fb\3\2\2\2x\u0504\3\2\2\2z"+
		"\u050a\3\2\2\2|\u0519\3\2\2\2~\u0527\3\2\2\2\u0080\u054d\3\2\2\2\u0082"+
		"\u0555\3\2\2\2\u0084\u0557\3\2\2\2\u0086\u0560\3\2\2\2\u0088\u0563\3\2"+
		"\2\2\u008a\u056a\3\2\2\2\u008c\u0575\3\2\2\2\u008e\u0578\3\2\2\2\u0090"+
		"\u057f\3\2\2\2\u0092\u0585\3\2\2\2\u0094\u0587\3\2\2\2\u0096\u058b\3\2"+
		"\2\2\u0098\u0591\3\2\2\2\u009a\u05a0\3\2\2\2\u009c\u05a2\3\2\2\2\u009e"+
		"\u05a4\3\2\2\2\u00a0\u05a9\3\2\2\2\u00a2\u05b0\3\2\2\2\u00a4\u05ba\3\2"+
		"\2\2\u00a6\u05c2\3\2\2\2\u00a8\u05c6\3\2\2\2\u00aa\u05ca\3\2\2\2\u00ac"+
		"\u05d3\3\2\2\2\u00ae\u05dc\3\2\2\2\u00b0\u05de\3\2\2\2\u00b2\u05e0\3\2"+
		"\2\2\u00b4\u05e3\3\2\2\2\u00b6\u05f1\3\2\2\2\u00b8\u05fe\3\2\2\2\u00ba"+
		"\u0600\3\2\2\2\u00bc\u0602\3\2\2\2\u00be\u060d\3\2\2\2\u00c0\u061b\3\2"+
		"\2\2\u00c2\u061d\3\2\2\2\u00c4\u061f\3\2\2\2\u00c6\u0639\3\2\2\2\u00c8"+
		"\u0672\3\2\2\2\u00ca\u0674\3\2\2\2\u00cc\u06c8\3\2\2\2\u00ce\u06db\3\2"+
		"\2\2\u00d0\u06dd\3\2\2\2\u00d2\u06f1\3\2\2\2\u00d4\u06f3\3\2\2\2\u00d6"+
		"\u06f5\3\2\2\2\u00d8\u06fe\3\2\2\2\u00da\u0709\3\2\2\2\u00dc\u0713\3\2"+
		"\2\2\u00de\u0724\3\2\2\2\u00e0\u0726\3\2\2\2\u00e2\u0728\3\2\2\2\u00e4"+
		"\u0737\3\2\2\2\u00e6\u0739\3\2\2\2\u00e8\u0752\3\2\2\2\u00ea\u075f\3\2"+
		"\2\2\u00ec\u0774\3\2\2\2\u00ee\u0776\3\2\2\2\u00f0\u077d\3\2\2\2\u00f2"+
		"\u0788\3\2\2\2\u00f4\u078f\3\2\2\2\u00f6\u079f\3\2\2\2\u00f8\u07a7\3\2"+
		"\2\2\u00fa\u07b3\3\2\2\2\u00fc\u07c1\3\2\2\2\u00fe\u07c8\3\2\2\2\u0100"+
		"\u07e0\3\2\2\2\u0102\u07e2\3\2\2\2\u0104\u07fa\3\2\2\2\u0106\u07fc\3\2"+
		"\2\2\u0108\u080a\3\2\2\2\u010a\u080f\3\2\2\2\u010c\u0812\3\2\2\2\u010e"+
		"\u0816\3\2\2\2\u0110\u0818\3\2\2\2\u0112\u0825\3\2\2\2\u0114\u084b\3\2"+
		"\2\2\u0116\u084d\3\2\2\2\u0118\u0851\3\2\2\2\u011a\u0859\3\2\2\2\u011c"+
		"\u0860\3\2\2\2\u011e\u0868\3\2\2\2\u0120\u086d\3\2\2\2\u0122\u0875\3\2"+
		"\2\2\u0124\u0880\3\2\2\2\u0126\u089c\3\2\2\2\u0128\u08a2\3\2\2\2\u012a"+
		"\u08a8\3\2\2\2\u012c\u08c1\3\2\2\2\u012e\u08c7\3\2\2\2\u0130\u08d5\3\2"+
		"\2\2\u0132\u08de\3\2\2\2\u0134\u08e6\3\2\2\2\u0136\u08fa\3\2\2\2\u0138"+
		"\u08fc\3\2\2\2\u013a\u0920\3\2\2\2\u013c\u0947\3\2\2\2\u013e\u094f\3\2"+
		"\2\2\u0140\u096f\3\2\2\2\u0142\u0978\3\2\2\2\u0144\u097f\3\2\2\2\u0146"+
		"\u0999\3\2\2\2\u0148\u09a2\3\2\2\2\u014a\u09aa\3\2\2\2\u014c\u09bd\3\2"+
		"\2\2\u014e\u09cc\3\2\2\2\u0150\u09d4\3\2\2\2\u0152\u09ff\3\2\2\2\u0154"+
		"\u0a26\3\2\2\2\u0156\u0a37\3\2\2\2\u0158\u0a51\3\2\2\2\u015a\u0a91\3\2"+
		"\2\2\u015c\u0aa5\3\2\2\2\u015e\u0aaf\3\2\2\2\u0160\u0ae2\3\2\2\2\u0162"+
		"\u0af9\3\2\2\2\u0164\u0b01\3\2\2\2\u0166\u0b06\3\2\2\2\u0168\u0b08\3\2"+
		"\2\2\u016a\u0b24\3\2\2\2\u016c\u0b26\3\2\2\2\u016e\u0b32\3\2\2\2\u0170"+
		"\u0b34\3\2\2\2\u0172\u0b4f\3\2\2\2\u0174\u0b5f\3\2\2\2\u0176\u0b65\3\2"+
		"\2\2\u0178\u0b6f\3\2\2\2\u017a\u0b8a\3\2\2\2\u017c\u0b94\3\2\2\2\u017e"+
		"\u0b97\3\2\2\2\u0180\u0ba9\3\2\2\2\u0182\u0bac\3\2\2\2\u0184\u0bbe\3\2"+
		"\2\2\u0186\u0bcf\3\2\2\2\u0188\u0bd5\3\2\2\2\u018a\u0bdc\3\2\2\2\u018c"+
		"\u0be8\3\2\2\2\u018e\u0bec\3\2\2\2\u0190\u0bfd\3\2\2\2\u0192\u0c06\3\2"+
		"\2\2\u0194\u0c0e\3\2\2\2\u0196\u0c10\3\2\2\2\u0198\u0cb9\3\2\2\2\u019a"+
		"\u0cbb\3\2\2\2\u019c\u0d46\3\2\2\2\u019e\u0d48\3\2\2\2\u01a0\u0d60\3\2"+
		"\2\2\u01a2\u0d62\3\2\2\2\u01a4\u0d65\3\2\2\2\u01a6\u0d68\3\2\2\2\u01a8"+
		"\u0d71\3\2\2\2\u01aa\u0d77\3\2\2\2\u01ac\u0d7b\3\2\2\2\u01ae\u0d7e\3\2"+
		"\2\2\u01b0\u0d86\3\2\2\2\u01b2\u0d8c\3\2\2\2\u01b4\u0d92\3\2\2\2\u01b6"+
		"\u0d98\3\2\2\2\u01b8\u0da3\3\2\2\2\u01ba\u0dcd\3\2\2\2\u01bc\u0dcf\3\2"+
		"\2\2\u01be\u0dff\3\2\2\2\u01c0\u0e01\3\2\2\2\u01c2\u0e0a\3\2\2\2\u01c4"+
		"\u0e0e\3\2\2\2\u01c6\u0e10\3\2\2\2\u01c8\u0e12\3\2\2\2\u01ca\u0e3d\3\2"+
		"\2\2\u01cc\u0e43\3\2\2\2\u01ce\u0e45\3\2\2\2\u01d0\u0e55\3\2\2\2\u01d2"+
		"\u0e6e\3\2\2\2\u01d4\u0e70\3\2\2\2\u01d6\u0e78\3\2\2\2\u01d8\u0e7a\3\2"+
		"\2\2\u01da\u0e80\3\2\2\2\u01dc\u0e88\3\2\2\2\u01de\u0e8d\3\2\2\2\u01e0"+
		"\u0e8f\3\2\2\2\u01e2\u0e91\3\2\2\2\u01e4\u0e93\3\2\2\2\u01e6\u0e95\3\2"+
		"\2\2\u01e8\u0e9b\3\2\2\2\u01ea\u0ea2\3\2\2\2\u01ec\u0ea5\3\2\2\2\u01ee"+
		"\u0ea9\3\2\2\2\u01f0\u0eab\3\2\2\2\u01f2\u0eb3\3\2\2\2\u01f4\u0efe\3\2"+
		"\2\2\u01f6\u0f01\3\2\2\2\u01f8\u0f05\3\2\2\2\u01fa\u0f0e\3\2\2\2\u01fc"+
		"\u0f10\3\2\2\2\u01fe\u0f13\3\2\2\2\u0200\u0f16\3\2\2\2\u0202\u0f19\3\2"+
		"\2\2\u0204\u0f1c\3\2\2\2\u0206\u0f1f\3\2\2\2\u0208\u0f22\3\2\2\2\u020a"+
		"\u0f28\3\2\2\2\u020c\u0f2b\3\2\2\2\u020e\u0f2e\3\2\2\2\u0210\u0f31\3\2"+
		"\2\2\u0212\u0f37\3\2\2\2\u0214\u0f46\3\2\2\2\u0216\u0f50\3\2\2\2\u0218"+
		"\u0f60\3\2\2\2\u021a\u0f6c\3\2\2\2\u021c\u0f71\3\2\2\2\u021e\u0f73\3\2"+
		"\2\2\u0220\u0f76\3\2\2\2\u0222\u0f79\3\2\2\2\u0224\u0f7c\3\2\2\2\u0226"+
		"\u0f7f\3\2\2\2\u0228\u0f83\3\2\2\2\u022a\u0251\5*\26\2\u022b\u0251\5\4"+
		"\3\2\u022c\u0251\5\22\n\2\u022d\u0251\5 \21\2\u022e\u0251\5\16\b\2\u022f"+
		"\u0251\5\u0122\u0092\2\u0230\u0251\5\u0126\u0094\2\u0231\u0251\5\u0128"+
		"\u0095\2\u0232\u0251\5\u012c\u0097\2\u0233\u0251\5\u0124\u0093\2\u0234"+
		"\u0251\5\u012a\u0096\2\u0235\u0251\5\u01d8\u00ed\2\u0236\u0251\5\u01de"+
		"\u00f0\2\u0237\u0251\5\u01da\u00ee\2\u0238\u0251\5\u01e0\u00f1\2\u0239"+
		"\u0251\5\u01e2\u00f2\2\u023a\u0251\5\u01e4\u00f3\2\u023b\u0251\5\u01e6"+
		"\u00f4\2\u023c\u0251\5\u01e8\u00f5\2\u023d\u0251\5\u01fc\u00ff\2\u023e"+
		"\u0251\5\u01fe\u0100\2\u023f\u0251\5\u0200\u0101\2\u0240\u0251\5\u0202"+
		"\u0102\2\u0241\u0251\5\u0204\u0103\2\u0242\u0251\5\u0206\u0104\2\u0243"+
		"\u0251\5\u0208\u0105\2\u0244\u0251\5\u020a\u0106\2\u0245\u0251\5\u020c"+
		"\u0107\2\u0246\u0251\5\u020e\u0108\2\u0247\u0251\5\u0210\u0109\2\u0248"+
		"\u0251\5\u0212\u010a\2\u0249\u0251\5\u0214\u010b\2\u024a\u0251\5\u0216"+
		"\u010c\2\u024b\u0251\5\u0218\u010d\2\u024c\u0251\5\u021a\u010e\2\u024d"+
		"\u0251\5\u021c\u010f\2\u024e\u0251\5\u0226\u0114\2\u024f\u0251\5\u0228"+
		"\u0115\2\u0250\u022a\3\2\2\2\u0250\u022b\3\2\2\2\u0250\u022c\3\2\2\2\u0250"+
		"\u022d\3\2\2\2\u0250\u022e\3\2\2\2\u0250\u022f\3\2\2\2\u0250\u0230\3\2"+
		"\2\2\u0250\u0231\3\2\2\2\u0250\u0232\3\2\2\2\u0250\u0233\3\2\2\2\u0250"+
		"\u0234\3\2\2\2\u0250\u0235\3\2\2\2\u0250\u0236\3\2\2\2\u0250\u0237\3\2"+
		"\2\2\u0250\u0238\3\2\2\2\u0250\u0239\3\2\2\2\u0250\u023a\3\2\2\2\u0250"+
		"\u023b\3\2\2\2\u0250\u023c\3\2\2\2\u0250\u023d\3\2\2\2\u0250\u023e\3\2"+
		"\2\2\u0250\u023f\3\2\2\2\u0250\u0240\3\2\2\2\u0250\u0241\3\2\2\2\u0250"+
		"\u0242\3\2\2\2\u0250\u0243\3\2\2\2\u0250\u0244\3\2\2\2\u0250\u0245\3\2"+
		"\2\2\u0250\u0246\3\2\2\2\u0250\u0247\3\2\2\2\u0250\u0248\3\2\2\2\u0250"+
		"\u0249\3\2\2\2\u0250\u024a\3\2\2\2\u0250\u024b\3\2\2\2\u0250\u024c\3\2"+
		"\2\2\u0250\u024d\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0251"+
		"\u0253\3\2\2\2\u0252\u0254\7\63\2\2\u0253\u0252\3\2\2\2\u0253\u0254\3"+
		"\2\2\2\u0254\3\3\2\2\2\u0255\u0256\78\2\2\u0256\u0258\5\6\4\2\u0257\u0259"+
		"\7R\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025c\5\u00a0Q\2\u025b\u025d\5`\61\2\u025c\u025b\3\2\2\2\u025c\u025d"+
		"\3\2\2\2\u025d\u0261\3\2\2\2\u025e\u0262\5\b\5\2\u025f\u0262\5\30\r\2"+
		"\u0260\u0262\5\n\6\2\u0261\u025e\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0260"+
		"\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0265\5\f\7\2\u0264\u0263\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\5\3\2\2\2\u0266\u0268\t\2\2\2\u0267\u0266\3\2\2\2"+
		"\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u026b\7\u0126\2\2\u026a"+
		"\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\7\3\2\2\2\u026c\u026e\5\u00b4"+
		"[\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0270\t\3\2\2\u0270\u0275\5\32\16\2\u0271\u0272\7-\2\2\u0272\u0274\5"+
		"\32\16\2\u0273\u0271\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\t\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u027a\5\u00b4"+
		"[\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027c\5*\26\2\u027c\13\3\2\2\2\u027d\u027e\7h\2\2\u027e\u027f\7\u00c2"+
		"\2\2\u027f\u0280\7K\2\2\u0280\u0281\79\2\2\u0281\u0286\5\26\f\2\u0282"+
		"\u0283\7-\2\2\u0283\u0285\5\26\f\2\u0284\u0282\3\2\2\2\u0285\u0288\3\2"+
		"\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\r\3\2\2\2\u0288\u0286"+
		"\3\2\2\2\u0289\u028b\7\u00be\2\2\u028a\u028c\5\20\t\2\u028b\u028a\3\2"+
		"\2\2\u028b\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028f\7R\2\2\u028e"+
		"\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\5\u00a0"+
		"Q\2\u0291\u0293\5`\61\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0297\3\2\2\2\u0294\u0298\5\b\5\2\u0295\u0298\5\30\r\2\u0296\u0298\5"+
		"\n\6\2\u0297\u0294\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0296\3\2\2\2\u0298"+
		"\17\3\2\2\2\u0299\u029a\t\4\2\2\u029a\21\3\2\2\2\u029b\u029c\79\2\2\u029c"+
		"\u029d\5\24\13\2\u029d\u029e\5X-\2\u029e\u02a0\5\30\r\2\u029f\u02a1\5"+
		"j\66\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2"+
		"\u02a4\5\u0110\u0089\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6"+
		"\3\2\2\2\u02a5\u02a7\5p9\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\23\3\2\2\2\u02a8\u02aa\7\u0163\2\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3"+
		"\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02ad\7\u0126\2\2\u02ac\u02ab\3\2\2\2"+
		"\u02ac\u02ad\3\2\2\2\u02ad\25\3\2\2\2\u02ae\u02af\5\u00a2R\2\u02af\u02b1"+
		"\7 \2\2\u02b0\u02b2\7S\2\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b4\3\2\2\2\u02b3\u02b5\7\'\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\5\34\17\2\u02b7\u02b9\7(\2\2\u02b8"+
		"\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\27\3\2\2\2\u02ba\u02bb\7C\2\2"+
		"\u02bb\u02c0\5\26\f\2\u02bc\u02bd\7-\2\2\u02bd\u02bf\5\26\f\2\u02be\u02bc"+
		"\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\31\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\7\'\2\2\u02c4\u02c9\5\34\17"+
		"\2\u02c5\u02c6\7-\2\2\u02c6\u02c8\5\34\17\2\u02c7\u02c5\3\2\2\2\u02c8"+
		"\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\3\2"+
		"\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02cd\7(\2\2\u02cd\u02d1\3\2\2\2\u02ce"+
		"\u02cf\7\'\2\2\u02cf\u02d1\7(\2\2\u02d0\u02c3\3\2\2\2\u02d0\u02ce\3\2"+
		"\2\2\u02d1\33\3\2\2\2\u02d2\u02d6\5\u00be`\2\u02d3\u02d6\7\u00a0\2\2\u02d4"+
		"\u02d6\5\36\20\2\u02d5\u02d2\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d4\3"+
		"\2\2\2\u02d6\35\3\2\2\2\u02d7\u02d8\7\u019c\2\2\u02d8\u02d9\7\u01dd\2"+
		"\2\u02d9\37\3\2\2\2\u02da\u02db\7:\2\2\u02db\u02de\5\"\22\2\u02dc\u02df"+
		"\5$\23\2\u02dd\u02df\5&\24\2\u02de\u02dc\3\2\2\2\u02de\u02dd\3\2\2\2\u02df"+
		"\u02e1\3\2\2\2\u02e0\u02e2\5j\66\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2"+
		"\2\2\u02e2!\3\2\2\2\u02e3\u02e5\7\u0163\2\2\u02e4\u02e3\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e8\7\u013d\2\2\u02e7\u02e6"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02eb\7\u0126\2"+
		"\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb#\3\2\2\2\u02ec\u02ed"+
		"\7\\\2\2\u02ed\u02f2\5\u00a0Q\2\u02ee\u02f0\7g\2\2\u02ef\u02ee\3\2\2\2"+
		"\u02ef\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\5P)\2\u02f2\u02ef"+
		"\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02f6\5`\61\2\u02f5"+
		"\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6%\3\2\2\2\u02f7\u02f8\5(\25\2"+
		"\u02f8\u02f9\7\\\2\2\u02f9\u02fa\5X-\2\u02fa\u0301\3\2\2\2\u02fb\u02fc"+
		"\7\\\2\2\u02fc\u02fd\5(\25\2\u02fd\u02fe\7e\2\2\u02fe\u02ff\5X-\2\u02ff"+
		"\u0301\3\2\2\2\u0300\u02f7\3\2\2\2\u0300\u02fb\3\2\2\2\u0301\'\3\2\2\2"+
		"\u0302\u0304\5\u00a0Q\2\u0303\u0305\7\35\2\2\u0304\u0303\3\2\2\2\u0304"+
		"\u0305\3\2\2\2\u0305\u030d\3\2\2\2\u0306\u0307\7-\2\2\u0307\u0309\5\u00a0"+
		"Q\2\u0308\u030a\7\35\2\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u030c\3\2\2\2\u030b\u0306\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2"+
		"\2\2\u030d\u030e\3\2\2\2\u030e)\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0312"+
		"\5@!\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313"+
		"\u0314\5D#\2\u0314+\3\2\2\2\u0315\u0316\7\u00a4\2\2\u0316\u031d\5\u0096"+
		"L\2\u0317\u031a\7\'\2\2\u0318\u031b\5\u0096L\2\u0319\u031b\5\u00be`\2"+
		"\u031a\u0318\3\2\2\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c"+
		"\3\2\2\2\u031c\u031e\7(\2\2\u031d\u0317\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"-\3\2\2\2\u031f\u0320\7\u00a7\2\2\u0320\u0323\5\u00be`\2\u0321\u0322\7"+
		"-\2\2\u0322\u0324\5\u00be`\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"/\3\2\2\2\u0325\u032a\5\62\32\2\u0326\u032a\5\64\33\2\u0327\u032a\5\66"+
		"\34\2\u0328\u032a\58\35\2\u0329\u0325\3\2\2\2\u0329\u0326\3\2\2\2\u0329"+
		"\u0327\3\2\2\2\u0329\u0328\3\2\2\2\u032a\61\3\2\2\2\u032b\u032c\7\u01c5"+
		"\2\2\u032c\u032d\5\u00a0Q\2\u032d\u0332\7\u00ae\2\2\u032e\u0330\7g\2\2"+
		"\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333"+
		"\5\u0096L\2\u0332\u032f\3\2\2\2\u0332\u0333\3\2\2\2\u0333\63\3\2\2\2\u0334"+
		"\u0335\7\u01c5\2\2\u0335\u0336\5\u00a0Q\2\u0336\u0337\7\u00f5\2\2\u0337"+
		"\u033e\5\u0096L\2\u0338\u0339\5\u00c6d\2\u0339\u033a\7\'\2\2\u033a\u033b"+
		"\5\u0096L\2\u033b\u033c\7(\2\2\u033c\u033f\3\2\2\2\u033d\u033f\t\5\2\2"+
		"\u033e\u0338\3\2\2\2\u033e\u033d\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u0341"+
		"\7f\2\2\u0341\u0343\5\u00be`\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2"+
		"\u0343\u0346\3\2\2\2\u0344\u0345\7\u0081\2\2\u0345\u0347\5\u008aF\2\u0346"+
		"\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\65\3\2\2\2\u0348\u0349\7\u01c5"+
		"\2\2\u0349\u034a\5\u00a0Q\2\u034a\u034b\7\u00f5\2\2\u034b\u034e\t\6\2"+
		"\2\u034c\u034d\7f\2\2\u034d\u034f\5\u00be`\2\u034e\u034c\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u0351\7\u0081\2\2\u0351\u0353"+
		"\5\u008aF\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\67\3\2\2\2\u0354"+
		"\u0355\7\u01c5\2\2\u0355\u0356\5\u00a0Q\2\u0356\u0357\7\u00ad\2\2\u0357"+
		"9\3\2\2\2\u0358\u0359\7\u01cd\2\2\u0359\u035a\7D\2\2\u035a\u035b\7\\\2"+
		"\2\u035b\u035e\7\u01dd\2\2\u035c\u035d\7-\2\2\u035d\u035f\7\u01dd\2\2"+
		"\u035e\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f;\3\2\2\2\u0360\u0361\7"+
		"\u01ce\2\2\u0361\u0363\7\u010f\2\2\u0362\u0364\t\7\2\2\u0363\u0362\3\2"+
		"\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0367\7\u00ac\2\2\u0366"+
		"\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\7\u01d0"+
		"\2\2\u0369\u036b\7\u01dd\2\2\u036a\u036c\t\b\2\2\u036b\u036a\3\2\2\2\u036b"+
		"\u036c\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\7R\2\2\u036e\u036f\7D\2"+
		"\2\u036f\u037c\5\u00a0Q\2\u0370\u0371\7\u00d8\2\2\u0371\u0372\7\'\2\2"+
		"\u0372\u0377\5\u0096L\2\u0373\u0374\7-\2\2\u0374\u0376\5\u0096L\2\u0375"+
		"\u0373\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2"+
		"\2\2\u0378\u037a\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u037b\7(\2\2\u037b"+
		"\u037d\3\2\2\2\u037c\u0370\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u0381\3\2"+
		"\2\2\u037e\u037f\7\u008a\2\2\u037f\u0380\7C\2\2\u0380\u0382\5\u0096L\2"+
		"\u0381\u037e\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0389\3\2\2\2\u0383\u0385"+
		"\t\t\2\2\u0384\u0386\5~@\2\u0385\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387"+
		"\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038a\3\2\2\2\u0389\u0383\3\2"+
		"\2\2\u0389\u038a\3\2\2\2\u038a\u0391\3\2\2\2\u038b\u038d\7\u01d1\2\2\u038c"+
		"\u038e\5|?\2\u038d\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u038d\3\2\2"+
		"\2\u038f\u0390\3\2\2\2\u0390\u0392\3\2\2\2\u0391\u038b\3\2\2\2\u0391\u0392"+
		"\3\2\2\2\u0392\u0397\3\2\2\2\u0393\u0394\7\u0126\2\2\u0394\u0395\5\u008a"+
		"F\2\u0395\u0396\t\n\2\2\u0396\u0398\3\2\2\2\u0397\u0393\3\2\2\2\u0397"+
		"\u0398\3\2\2\2\u0398\u03a4\3\2\2\2\u0399\u039a\7\'\2\2\u039a\u039f\5\u0096"+
		"L\2\u039b\u039c\7-\2\2\u039c\u039e\5\u0096L\2\u039d\u039b\3\2\2\2\u039e"+
		"\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\3\2"+
		"\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a3\7(\2\2\u03a3\u03a5\3\2\2\2\u03a4"+
		"\u0399\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6\u03a8\5\30"+
		"\r\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8=\3\2\2\2\u03a9\u03aa"+
		"\7\u01ce\2\2\u03aa\u03ac\7\u01d7\2\2\u03ab\u03ad\t\7\2\2\u03ac\u03ab\3"+
		"\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03af\3\2\2\2\u03ae\u03b0\7\u00ac\2\2"+
		"\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2"+
		"\7\u01d0\2\2\u03b2\u03b4\7\u01dd\2\2\u03b3\u03b5\t\b\2\2\u03b4\u03b3\3"+
		"\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\7R\2\2\u03b7"+
		"\u03b8\7D\2\2\u03b8\u03bc\5\u00a0Q\2\u03b9\u03ba\7\u008a\2\2\u03ba\u03bb"+
		"\7C\2\2\u03bb\u03bd\5\u0096L\2\u03bc\u03b9\3\2\2\2\u03bc\u03bd\3\2\2\2"+
		"\u03bd\u03c4\3\2\2\2\u03be\u03bf\7\u00d3\2\2\u03bf\u03c0\7\u0125\2\2\u03c0"+
		"\u03c1\7}\2\2\u03c1\u03c2\7$\2\2\u03c2\u03c3\7\u01dd\2\2\u03c3\u03c5\7"+
		"\"\2\2\u03c4\u03be\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03ca\3\2\2\2\u03c6"+
		"\u03c7\7\u0126\2\2\u03c7\u03c8\5\u008aF\2\u03c8\u03c9\t\n\2\2\u03c9\u03cb"+
		"\3\2\2\2\u03ca\u03c6\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03d7\3\2\2\2\u03cc"+
		"\u03cd\7\'\2\2\u03cd\u03d2\5\u0096L\2\u03ce\u03cf\7-\2\2\u03cf\u03d1\5"+
		"\u0096L\2\u03d0\u03ce\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2"+
		"\u03d2\u03d3\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d6"+
		"\7(\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03cc\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03da\3\2\2\2\u03d9\u03db\5\30\r\2\u03da\u03d9\3\2\2\2\u03da\u03db\3"+
		"\2\2\2\u03db?\3\2\2\2\u03dc\u03de\7T\2\2\u03dd\u03df\7\u0140\2\2\u03de"+
		"\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e5\5B"+
		"\"\2\u03e1\u03e2\7-\2\2\u03e2\u03e4\5B\"\2\u03e3\u03e1\3\2\2\2\u03e4\u03e7"+
		"\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6A\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e8\u03ea\5\u011e\u0090\2\u03e9\u03eb\5\u00b4[\2\u03ea"+
		"\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\7g"+
		"\2\2\u03ed\u03ee\5z>\2\u03eeC\3\2\2\2\u03ef\u03f7\5F$\2\u03f0\u03f2\7"+
		"U\2\2\u03f1\u03f3\t\13\2\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"\u03f4\3\2\2\2\u03f4\u03f6\5F$\2\u03f5\u03f0\3\2\2\2\u03f6\u03f9\3\2\2"+
		"\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8E\3\2\2\2\u03f9\u03f7"+
		"\3\2\2\2\u03fa\u03fe\7\67\2\2\u03fb\u03fd\5H%\2\u03fc\u03fb\3\2\2\2\u03fd"+
		"\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0401\3\2"+
		"\2\2\u0400\u03fe\3\2\2\2\u0401\u0403\5L\'\2\u0402\u0404\5V,\2\u0403\u0402"+
		"\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u0407\5j\66\2\u0406"+
		"\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\3\2\2\2\u0408\u040a\5l"+
		"\67\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040c\3\2\2\2\u040b"+
		"\u040d\5n8\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040f\3\2\2"+
		"\2\u040e\u0410\5v<\2\u040f\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0412"+
		"\3\2\2\2\u0411\u0413\5\u0110\u0089\2\u0412\u0411\3\2\2\2\u0412\u0413\3"+
		"\2\2\2\u0413\u0415\3\2\2\2\u0414\u0416\5p9\2\u0415\u0414\3\2\2\2\u0415"+
		"\u0416\3\2\2\2\u0416\u0418\3\2\2\2\u0417\u0419\5\u0080A\2\u0418\u0417"+
		"\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041b\3\2\2\2\u041a\u041c\5\u0082B"+
		"\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041cG\3\2\2\2\u041d\u0426"+
		"\5J&\2\u041e\u0426\7\u0162\2\2\u041f\u0426\7\u0172\2\2\u0420\u0426\7\u0169"+
		"\2\2\u0421\u0426\7\u0164\2\2\u0422\u0426\7\u0165\2\2\u0423\u0426\t\f\2"+
		"\2\u0424\u0426\7\u0167\2\2\u0425\u041d\3\2\2\2\u0425\u041e\3\2\2\2\u0425"+
		"\u041f\3\2\2\2\u0425\u0420\3\2\2\2\u0425\u0421\3\2\2\2\u0425\u0422\3\2"+
		"\2\2\u0425\u0423\3\2\2\2\u0425\u0424\3\2\2\2\u0426I\3\2\2\2\u0427\u0428"+
		"\t\r\2\2\u0428K\3\2\2\2\u0429\u042c\5R*\2\u042a\u042c\5N(\2\u042b\u0429"+
		"\3\2\2\2\u042b\u042a\3\2\2\2\u042c\u0431\3\2\2\2\u042d\u042e\7-\2\2\u042e"+
		"\u0430\5N(\2\u042f\u042d\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2"+
		"\2\u0431\u0432\3\2\2\2\u0432M\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u0437"+
		"\5\u00a2R\2\u0435\u0437\5\u00be`\2\u0436\u0434\3\2\2\2\u0436\u0435\3\2"+
		"\2\2\u0437\u043c\3\2\2\2\u0438\u043a\7g\2\2\u0439\u0438\3\2\2\2\u0439"+
		"\u043a\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043d\5P)\2\u043c\u0439\3\2\2"+
		"\2\u043c\u043d\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u0440\5T+\2\u043f\u0436"+
		"\3\2\2\2\u043f\u043e\3\2\2\2\u0440O\3\2\2\2\u0441\u0444\5\u0096L\2\u0442"+
		"\u0444\7\u01dd\2\2\u0443\u0441\3\2\2\2\u0443\u0442\3\2\2\2\u0444Q\3\2"+
		"\2\2\u0445\u0446\7\31\2\2\u0446S\3\2\2\2\u0447\u0448\5\u0096L\2\u0448"+
		"\u0449\7\35\2\2\u0449U\3\2\2\2\u044a\u044b\7\\\2\2\u044b\u044c\5X-\2\u044c"+
		"W\3\2\2\2\u044d\u0452\5Z.\2\u044e\u044f\7-\2\2\u044f\u0451\5Z.\2\u0450"+
		"\u044e\3\2\2\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2"+
		"\2\2\u0453Y\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u045c\5\\/\2\u0456\u0457"+
		"\7)\2\2\u0457\u0458\7\u00c6\2\2\u0458\u0459\5\\/\2\u0459\u045a\7*\2\2"+
		"\u045a\u045c\3\2\2\2\u045b\u0455\3\2\2\2\u045b\u0456\3\2\2\2\u045c[\3"+
		"\2\2\2\u045d\u045e\5^\60\2\u045e\u045f\5f\64\2\u045f\u0461\3\2\2\2\u0460"+
		"\u045d\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463\3\2"+
		"\2\2\u0463\u046c\3\2\2\2\u0464\u0468\5^\60\2\u0465\u0467\5f\64\2\u0466"+
		"\u0465\3\2\2\2\u0467\u046a\3\2\2\2\u0468\u0466\3\2\2\2\u0468\u0469\3\2"+
		"\2\2\u0469\u046c\3\2\2\2\u046a\u0468\3\2\2\2\u046b\u0460\3\2\2\2\u046b"+
		"\u0464\3\2\2\2\u046c]\3\2\2\2\u046d\u046f\5\u00a0Q\2\u046e\u0470\5`\61"+
		"\2\u046f\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0475\3\2\2\2\u0471\u0473"+
		"\7g\2\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\3\2\2\2\u0474"+
		"\u0476\5P)\2\u0475\u0472\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0478\3\2\2"+
		"\2\u0477\u0479\5b\62\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u0483"+
		"\3\2\2\2\u047a\u047c\5z>\2\u047b\u047d\5\u00b4[\2\u047c\u047b\3\2\2\2"+
		"\u047c\u047d\3\2\2\2\u047d\u0483\3\2\2\2\u047e\u047f\7\'\2\2\u047f\u0480"+
		"\5X-\2\u0480\u0481\7(\2\2\u0481\u0483\3\2\2\2\u0482\u046d\3\2\2\2\u0482"+
		"\u047a\3\2\2\2\u0482\u047e\3\2\2\2\u0483_\3\2\2\2\u0484\u0485\7\u00d8"+
		"\2\2\u0485\u0486\7\'\2\2\u0486\u048b\5\u0096L\2\u0487\u0488\7-\2\2\u0488"+
		"\u048a\5\u0096L\2\u0489\u0487\3\2\2\2\u048a\u048d\3\2\2\2\u048b\u0489"+
		"\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048e\3\2\2\2\u048d\u048b\3\2\2\2\u048e"+
		"\u048f\7(\2\2\u048fa\3\2\2\2\u0490\u0495\5d\63\2\u0491\u0492\7-\2\2\u0492"+
		"\u0494\5d\63\2\u0493\u0491\3\2\2\2\u0494\u0497\3\2\2\2\u0495\u0493\3\2"+
		"\2\2\u0495\u0496\3\2\2\2\u0496c\3\2\2\2\u0497\u0495\3\2\2\2\u0498\u0499"+
		"\t\16\2\2\u0499\u04a2\t\17\2\2\u049a\u04a0\7l\2\2\u049b\u04a1\7^\2\2\u049c"+
		"\u049d\7{\2\2\u049d\u04a1\7}\2\2\u049e\u049f\7|\2\2\u049f\u04a1\7}\2\2"+
		"\u04a0\u049b\3\2\2\2\u04a0\u049c\3\2\2\2\u04a0\u049e\3\2\2\2\u04a1\u04a3"+
		"\3\2\2\2\u04a2\u049a\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4"+
		"\u04a5\7\'\2\2\u04a5\u04aa\5\u00b8]\2\u04a6\u04a7\7-\2\2\u04a7\u04a9\5"+
		"\u00b8]\2\u04a8\u04a6\3\2\2\2\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2"+
		"\u04aa\u04ab\3\2\2\2\u04ab\u04ad\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ad\u04ae"+
		"\7(\2\2\u04aee\3\2\2\2\u04af\u04b1\t\20\2\2\u04b0\u04af\3\2\2\2\u04b0"+
		"\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b5\7^\2\2\u04b3\u04b5\7\u0172"+
		"\2\2\u04b4\u04b0\3\2\2\2\u04b4\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6"+
		"\u04b8\5^\60\2\u04b7\u04b9\5h\65\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9\3\2"+
		"\2\2\u04b9\u04cb\3\2\2\2\u04ba\u04bc\t\21\2\2\u04bb\u04bd\7a\2\2\u04bc"+
		"\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf\7^"+
		"\2\2\u04bf\u04c0\5^\60\2\u04c0\u04c1\5h\65\2\u04c1\u04cb\3\2\2\2\u04c2"+
		"\u04c6\7]\2\2\u04c3\u04c7\7`\2\2\u04c4\u04c5\t\21\2\2\u04c5\u04c7\7a\2"+
		"\2\u04c6\u04c3\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8"+
		"\3\2\2\2\u04c8\u04c9\7^\2\2\u04c9\u04cb\5^\60\2\u04ca\u04b4\3\2\2\2\u04ca"+
		"\u04ba\3\2\2\2\u04ca\u04c2\3\2\2\2\u04cbg\3\2\2\2\u04cc\u04cd\7h\2\2\u04cd"+
		"\u04d1\5\u00be`\2\u04ce\u04cf\7e\2\2\u04cf\u04d1\5\u00b4[\2\u04d0\u04cc"+
		"\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d1i\3\2\2\2\u04d2\u04d3\7f\2\2\u04d3\u04d4"+
		"\5\u00be`\2\u04d4k\3\2\2\2\u04d5\u04d6\7|\2\2\u04d6\u04d7\7}\2\2\u04d7"+
		"\u04dc\5\u0112\u008a\2\u04d8\u04d9\7-\2\2\u04d9\u04db\5\u0112\u008a\2"+
		"\u04da\u04d8\3\2\2\2\u04db\u04de\3\2\2\2\u04dc\u04da\3\2\2\2\u04dc\u04dd"+
		"\3\2\2\2\u04dd\u04e1\3\2\2\2\u04de\u04dc\3\2\2\2\u04df\u04e0\7T\2\2\u04e0"+
		"\u04e2\7\u00e8\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2m\3\2"+
		"\2\2\u04e3\u04e4\7\u0080\2\2\u04e4\u04e5\5\u00be`\2\u04e5o\3\2\2\2\u04e6"+
		"\u04f1\7\u0081\2\2\u04e7\u04e8\5t;\2\u04e8\u04e9\7-\2\2\u04e9\u04eb\3"+
		"\2\2\2\u04ea\u04e7\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec"+
		"\u04f2\5r:\2\u04ed\u04ee\5r:\2\u04ee\u04ef\7\u0082\2\2\u04ef\u04f0\5t"+
		";\2\u04f0\u04f2\3\2\2\2\u04f1\u04ea\3\2\2\2\u04f1\u04ed\3\2\2\2\u04f2"+
		"q\3\2\2\2\u04f3\u04f6\5\u008aF\2\u04f4\u04f6\5\u0084C\2\u04f5\u04f3\3"+
		"\2\2\2\u04f5\u04f4\3\2\2\2\u04f6s\3\2\2\2\u04f7\u04fa\5\u008aF\2\u04f8"+
		"\u04fa\5\u0084C\2\u04f9\u04f7\3\2\2\2\u04f9\u04f8\3\2\2\2\u04fau\3\2\2"+
		"\2\u04fb\u04fc\7\u00c7\2\2\u04fc\u0501\5x=\2\u04fd\u04fe\7-\2\2\u04fe"+
		"\u0500\5x=\2\u04ff\u04fd\3\2\2\2\u0500\u0503\3\2\2\2\u0501\u04ff\3\2\2"+
		"\2\u0501\u0502\3\2\2\2\u0502w\3\2\2\2\u0503\u0501\3\2\2\2\u0504\u0505"+
		"\5\u011e\u0090\2\u0505\u0506\7g\2\2\u0506\u0507\7\'\2\2\u0507\u0508\5"+
		"\u00d8m\2\u0508\u0509\7(\2\2\u0509y\3\2\2\2\u050a\u050b\7\'\2\2\u050b"+
		"\u050c\5D#\2\u050c\u050e\7(\2\2\u050d\u050f\7g\2\2\u050e\u050d\3\2\2\2"+
		"\u050e\u050f\3\2\2\2\u050f\u0511\3\2\2\2\u0510\u0512\5P)\2\u0511\u0510"+
		"\3\2\2\2\u0511\u0512\3\2\2\2\u0512{\3\2\2\2\u0513\u0514\7\u01d2\2\2\u0514"+
		"\u0515\7}\2\2\u0515\u051a\7\u01dd\2\2\u0516\u0517\7\u01d3\2\2\u0517\u0518"+
		"\7}\2\2\u0518\u051a\7\u01dd\2\2\u0519\u0513\3\2\2\2\u0519\u0516\3\2\2"+
		"\2\u051a}\3\2\2\2\u051b\u051c\7\u01d3\2\2\u051c\u051d\7}\2\2\u051d\u0528"+
		"\7\u01dd\2\2\u051e\u0520\7\u01d4\2\2\u051f\u051e\3\2\2\2\u051f\u0520\3"+
		"\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\7\u01d5\2\2\u0522\u0523\7}\2\2"+
		"\u0523\u0528\7\u01dd\2\2\u0524\u0525\7\u01d6\2\2\u0525\u0526\7}\2\2\u0526"+
		"\u0528\7\u01dd\2\2\u0527\u051b\3\2\2\2\u0527\u051f\3\2\2\2\u0527\u0524"+
		"\3\2\2\2\u0528\177\3\2\2\2\u0529\u052a\7R\2\2\u052a\u052f\5\u0096L\2\u052b"+
		"\u052c\7-\2\2\u052c\u052e\5\u0096L\2\u052d\u052b\3\2\2\2\u052e\u0531\3"+
		"\2\2\2\u052f\u052d\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u054e\3\2\2\2\u0531"+
		"\u052f\3\2\2\2\u0532\u0533\7R\2\2\u0533\u0534\7\u01d9\2\2\u0534\u054e"+
		"\7\u01dd\2\2\u0535\u0536\7R\2\2\u0536\u0537\7\u01da\2\2\u0537\u053b\7"+
		"\u01dd\2\2\u0538\u0539\7\u008a\2\2\u0539\u053a\7C\2\2\u053a\u053c\7\u01dc"+
		"\2\2\u053b\u0538\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u0543\3\2\2\2\u053d"+
		"\u053f\t\t\2\2\u053e\u0540\5~@\2\u053f\u053e\3\2\2\2\u0540\u0541\3\2\2"+
		"\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0544\3\2\2\2\u0543\u053d"+
		"\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u054b\3\2\2\2\u0545\u0547\7\u01d1\2"+
		"\2\u0546\u0548\5|?\2\u0547\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u0547"+
		"\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054c\3\2\2\2\u054b\u0545\3\2\2\2\u054b"+
		"\u054c\3\2\2\2\u054c\u054e\3\2\2\2\u054d\u0529\3\2\2\2\u054d\u0532\3\2"+
		"\2\2\u054d\u0535\3\2\2\2\u054e\u0081\3\2\2\2\u054f\u0550\7l\2\2\u0550"+
		"\u0556\79\2\2\u0551\u0552\7\u012d\2\2\u0552\u0553\7w\2\2\u0553\u0554\7"+
		"\u01db\2\2\u0554\u0556\7\u015b\2\2\u0555\u054f\3\2\2\2\u0555\u0551\3\2"+
		"\2\2\u0556\u0083\3\2\2\2\u0557\u0558\7\61\2\2\u0558\u0085\3\2\2\2\u0559"+
		"\u0561\5\u0088E\2\u055a\u0561\5\u008aF\2\u055b\u0561\5\u008cG\2\u055c"+
		"\u0561\5\u008eH\2\u055d\u0561\5\u0090I\2\u055e\u0561\5\u0092J\2\u055f"+
		"\u0561\5\u0094K\2\u0560\u0559\3\2\2\2\u0560\u055a\3\2\2\2\u0560\u055b"+
		"\3\2\2\2\u0560\u055c\3\2\2\2\u0560\u055d\3\2\2\2\u0560\u055e\3\2\2\2\u0560"+
		"\u055f\3\2\2\2\u0561\u0087\3\2\2\2\u0562\u0564\5\u00ba^\2\u0563\u0562"+
		"\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0567\7\u01dd\2"+
		"\2\u0566\u0568\5\u011c\u008f\2\u0567\u0566\3\2\2\2\u0567\u0568\3\2\2\2"+
		"\u0568\u0089\3\2\2\2\u0569\u056b\7\30\2\2\u056a\u0569\3\2\2\2\u056a\u056b"+
		"\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056d\7\u01de\2\2\u056d\u008b\3\2\2"+
		"\2\u056e\u056f\t\22\2\2\u056f\u0576\7\u01dd\2\2\u0570\u0571\7)\2\2\u0571"+
		"\u0572\5\u0096L\2\u0572\u0573\7\u01dd\2\2\u0573\u0574\7*\2\2\u0574\u0576"+
		"\3\2\2\2\u0575\u056e\3\2\2\2\u0575\u0570\3\2\2\2\u0576\u008d\3\2\2\2\u0577"+
		"\u0579\5\u00ba^\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a"+
		"\3\2\2\2\u057a\u057c\7\u01df\2\2\u057b\u057d\5\u011c\u008f\2\u057c\u057b"+
		"\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u008f\3\2\2\2\u057e\u0580\5\u00ba^"+
		"\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0583"+
		"\7\u01e0\2\2\u0582\u0584\5\u011c\u008f\2\u0583\u0582\3\2\2\2\u0583\u0584"+
		"\3\2\2\2\u0584\u0091\3\2\2\2\u0585\u0586\t\23\2\2\u0586\u0093\3\2\2\2"+
		"\u0587\u0588\7r\2\2\u0588\u0095\3\2\2\2\u0589\u058c\7\u01dc\2\2\u058a"+
		"\u058c\5\u009cO\2\u058b\u0589\3\2\2\2\u058b\u058a\3\2\2\2\u058c\u0097"+
		"\3\2\2\2\u058d\u058f\7\62\2\2\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2"+
		"\u058f\u0590\3\2\2\2\u0590\u0592\7\62\2\2\u0591\u058e\3\2\2\2\u0591\u0592"+
		"\3\2\2\2\u0592\u0594\3\2\2\2\u0593\u0595\t\24\2\2\u0594\u0593\3\2\2\2"+
		"\u0594\u0595\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0598\7\34\2\2\u0597\u0596"+
		"\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a\5\u0096L"+
		"\2\u059a\u0099\3\2\2\2\u059b\u05a1\t\24\2\2\u059c\u059d\7\62\2\2\u059d"+
		"\u059e\7\62\2\2\u059e\u059f\t\24\2\2\u059f\u05a1\7\34\2\2\u05a0\u059b"+
		"\3\2\2\2\u05a0\u059c\3\2\2\2\u05a1\u009b\3\2\2\2\u05a2\u05a3\t\25\2\2"+
		"\u05a3\u009d\3\2\2\2\u05a4\u05a5\5\u0096L\2\u05a5\u009f\3\2\2\2\u05a6"+
		"\u05a7\5\u00b0Y\2\u05a7\u05a8\7\34\2\2\u05a8\u05aa\3\2\2\2\u05a9\u05a6"+
		"\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\5\u00b2Z"+
		"\2\u05ac\u00a1\3\2\2\2\u05ad\u05ae\5\u00b0Y\2\u05ae\u05af\7\34\2\2\u05af"+
		"\u05b1\3\2\2\2\u05b0\u05ad\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\3\2"+
		"\2\2\u05b2\u05b3\5\u00b2Z\2\u05b3\u00a3\3\2\2\2\u05b4\u05b5\t\26\2\2\u05b5"+
		"\u05b6\7\62\2\2\u05b6\u05b7\7\u01dd\2\2\u05b7\u05bb\7\u01dc\2\2\u05b8"+
		"\u05bb\5\u0096L\2\u05b9\u05bb\7\u01dd\2\2\u05ba\u05b4\3\2\2\2\u05ba\u05b8"+
		"\3\2\2\2\u05ba\u05b9\3\2\2\2\u05bb\u00a5\3\2\2\2\u05bc\u05bd\t\26\2\2"+
		"\u05bd\u05be\7\62\2\2\u05be\u05bf\7\u01dd\2\2\u05bf\u05c3\7\u01dc\2\2"+
		"\u05c0\u05c3\5\u0096L\2\u05c1\u05c3\7\u01dd\2\2\u05c2\u05bc\3\2\2\2\u05c2"+
		"\u05c0\3\2\2\2\u05c2\u05c1\3\2\2\2\u05c3\u00a7\3\2\2\2\u05c4\u05c7\5\u0096"+
		"L\2\u05c5\u05c7\7\u01dd\2\2\u05c6\u05c4\3\2\2\2\u05c6\u05c5\3\2\2\2\u05c7"+
		"\u00a9\3\2\2\2\u05c8\u05cb\5\u0096L\2\u05c9\u05cb\7\u01dd\2\2\u05ca\u05c8"+
		"\3\2\2\2\u05ca\u05c9\3\2\2\2\u05cb\u00ab\3\2\2\2\u05cc\u05d4\5\u0096L"+
		"\2\u05cd\u05ce\5\u00b0Y\2\u05ce\u05cf\7\34\2\2\u05cf\u05d1\3\2\2\2\u05d0"+
		"\u05cd\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d4\5\u0096"+
		"L\2\u05d3\u05cc\3\2\2\2\u05d3\u05d0\3\2\2\2\u05d4\u00ad\3\2\2\2\u05d5"+
		"\u05dd\5\u0096L\2\u05d6\u05d7\5\u00b0Y\2\u05d7\u05d8\7\34\2\2\u05d8\u05da"+
		"\3\2\2\2\u05d9\u05d6\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05db\3\2\2\2\u05db"+
		"\u05dd\5\u0096L\2\u05dc\u05d5\3\2\2\2\u05dc\u05d9\3\2\2\2\u05dd\u00af"+
		"\3\2\2\2\u05de\u05df\5\u0096L\2\u05df\u00b1\3\2\2\2\u05e0\u05e1\5\u0096"+
		"L\2\u05e1\u00b3\3\2\2\2\u05e2\u05e4\7\'\2\2\u05e3\u05e2\3\2\2\2\u05e3"+
		"\u05e4\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05ea\5\u00a2R\2\u05e6\u05e7"+
		"\7-\2\2\u05e7\u05e9\5\u00a2R\2\u05e8\u05e6\3\2\2\2\u05e9\u05ec\3\2\2\2"+
		"\u05ea\u05e8\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ee\3\2\2\2\u05ec\u05ea"+
		"\3\2\2\2\u05ed\u05ef\7(\2\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef"+
		"\u00b5\3\2\2\2\u05f0\u05f2\7\'\2\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2"+
		"\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f8\5\u00a0Q\2\u05f4\u05f5\7-\2\2\u05f5"+
		"\u05f7\5\u00a0Q\2\u05f6\u05f4\3\2\2\2\u05f7\u05fa\3\2\2\2\u05f8\u05f6"+
		"\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fb"+
		"\u05fd\7(\2\2\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u00b7\3\2"+
		"\2\2\u05fe\u05ff\5\u0096L\2\u05ff\u00b9\3\2\2\2\u0600\u0601\7\u01dc\2"+
		"\2\u0601\u00bb\3\2\2\2\u0602\u0603\7\u01dc\2\2\u0603\u00bd\3\2\2\2\u0604"+
		"\u0605\b`\1\2\u0605\u0606\5\u00c2b\2\u0606\u0607\5\u00be`\5\u0607\u060e"+
		"\3\2\2\2\u0608\u0609\7\'\2\2\u0609\u060a\5\u00be`\2\u060a\u060b\7(\2\2"+
		"\u060b\u060e\3\2\2\2\u060c\u060e\5\u00c4c\2\u060d\u0604\3\2\2\2\u060d"+
		"\u0608\3\2\2\2\u060d\u060c\3\2\2\2\u060e\u0618\3\2\2\2\u060f\u0610\f\7"+
		"\2\2\u0610\u0611\5\u00c0a\2\u0611\u0612\5\u00be`\b\u0612\u0617\3\2\2\2"+
		"\u0613\u0614\f\6\2\2\u0614\u0615\7\u00ca\2\2\u0615\u0617\5\u00be`\7\u0616"+
		"\u060f\3\2\2\2\u0616\u0613\3\2\2\2\u0617\u061a\3\2\2\2\u0618\u0616\3\2"+
		"\2\2\u0618\u0619\3\2\2\2\u0619\u00bf\3\2\2\2\u061a\u0618\3\2\2\2\u061b"+
		"\u061c\t\27\2\2\u061c\u00c1\3\2\2\2\u061d\u061e\t\30\2\2\u061e\u00c3\3"+
		"\2\2\2\u061f\u0620\bc\1\2\u0620\u0621\5\u00c8e\2\u0621\u0636\3\2\2\2\u0622"+
		"\u0623\f\7\2\2\u0623\u0625\7p\2\2\u0624\u0626\7q\2\2\u0625\u0624\3\2\2"+
		"\2\u0625\u0626\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0635\t\31\2\2\u0628"+
		"\u0629\f\6\2\2\u0629\u062a\7\36\2\2\u062a\u0635\5\u00c8e\2\u062b\u062c"+
		"\f\5\2\2\u062c\u062d\5\u00c6d\2\u062d\u062e\5\u00c8e\2\u062e\u0635\3\2"+
		"\2\2\u062f\u0630\f\4\2\2\u0630\u0631\5\u00c6d\2\u0631\u0632\t\32\2\2\u0632"+
		"\u0633\5z>\2\u0633\u0635\3\2\2\2\u0634\u0622\3\2\2\2\u0634\u0628\3\2\2"+
		"\2\u0634\u062b\3\2\2\2\u0634\u062f\3\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634"+
		"\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u00c5\3\2\2\2\u0638\u0636\3\2\2\2\u0639"+
		"\u063a\t\33\2\2\u063a\u00c7\3\2\2\2\u063b\u063d\5\u00caf\2\u063c\u063e"+
		"\7q\2\2\u063d\u063c\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u063f\3\2\2\2\u063f"+
		"\u0640\7w\2\2\u0640\u0641\5z>\2\u0641\u0673\3\2\2\2\u0642\u0644\5\u00ca"+
		"f\2\u0643\u0645\7q\2\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646"+
		"\3\2\2\2\u0646\u0647\7w\2\2\u0647\u0648\7\'\2\2\u0648\u064d\5\u00be`\2"+
		"\u0649\u064a\7-\2\2\u064a\u064c\5\u00be`\2\u064b\u0649\3\2\2\2\u064c\u064f"+
		"\3\2\2\2\u064d\u064b\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0650\3\2\2\2\u064f"+
		"\u064d\3\2\2\2\u0650\u0651\7(\2\2\u0651\u0673\3\2\2\2\u0652\u0654\5\u00ca"+
		"f\2\u0653\u0655\7q\2\2\u0654\u0653\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0656"+
		"\3\2\2\2\u0656\u0657\7v\2\2\u0657\u0658\5\u00caf\2\u0658\u0659\7n\2\2"+
		"\u0659\u065a\5\u00c8e\2\u065a\u0673\3\2\2\2\u065b\u065c\5\u00caf\2\u065c"+
		"\u065d\7\u00e9\2\2\u065d\u065e\7z\2\2\u065e\u065f\5\u00caf\2\u065f\u0673"+
		"\3\2\2\2\u0660\u0662\5\u00caf\2\u0661\u0663\7q\2\2\u0662\u0661\3\2\2\2"+
		"\u0662\u0663\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0665\7z\2\2\u0665\u0668"+
		"\5\u00ccg\2\u0666\u0667\7\u00d6\2\2\u0667\u0669\5\u00ccg\2\u0668\u0666"+
		"\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u0673\3\2\2\2\u066a\u066c\5\u00caf"+
		"\2\u066b\u066d\7q\2\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e"+
		"\3\2\2\2\u066e\u066f\t\34\2\2\u066f\u0670\5\u00caf\2\u0670\u0673\3\2\2"+
		"\2\u0671\u0673\5\u00caf\2\u0672\u063b\3\2\2\2\u0672\u0642\3\2\2\2\u0672"+
		"\u0652\3\2\2\2\u0672\u065b\3\2\2\2\u0672\u0660\3\2\2\2\u0672\u066a\3\2"+
		"\2\2\u0672\u0671\3\2\2\2\u0673\u00c9\3\2\2\2\u0674\u0675\bf\1\2\u0675"+
		"\u0676\5\u00ccg\2\u0676\u06a3\3\2\2\2\u0677\u0678\f\21\2\2\u0678\u0679"+
		"\7\20\2\2\u0679\u06a2\5\u00caf\22\u067a\u067b\f\20\2\2\u067b\u067c\7\21"+
		"\2\2\u067c\u06a2\5\u00caf\21\u067d\u067e\f\17\2\2\u067e\u067f\7\22\2\2"+
		"\u067f\u06a2\5\u00caf\20\u0680\u0681\f\16\2\2\u0681\u0682\7\23\2\2\u0682"+
		"\u06a2\5\u00caf\17\u0683\u0684\f\r\2\2\u0684\u0685\7\27\2\2\u0685\u06a2"+
		"\5\u00caf\16\u0686\u0687\f\f\2\2\u0687\u0688\7\30\2\2\u0688\u06a2\5\u00ca"+
		"f\r\u0689\u068a\f\13\2\2\u068a\u068b\7\31\2\2\u068b\u06a2\5\u00caf\f\u068c"+
		"\u068d\f\n\2\2\u068d\u068e\7\32\2\2\u068e\u06a2\5\u00caf\13\u068f\u0690"+
		"\f\t\2\2\u0690\u0691\7\u00c9\2\2\u0691\u06a2\5\u00caf\n\u0692\u0693\f"+
		"\b\2\2\u0693\u0694\7\u00c8\2\2\u0694\u06a2\5\u00caf\t\u0695\u0696\f\7"+
		"\2\2\u0696\u0697\7\25\2\2\u0697\u06a2\5\u00caf\b\u0698\u0699\f\6\2\2\u0699"+
		"\u069a\7\24\2\2\u069a\u06a2\5\u00caf\7\u069b\u069c\f\5\2\2\u069c\u069d"+
		"\7\27\2\2\u069d\u06a2\5\u010c\u0087\2\u069e\u069f\f\4\2\2\u069f\u06a0"+
		"\7\30\2\2\u06a0\u06a2\5\u010c\u0087\2\u06a1\u0677\3\2\2\2\u06a1\u067a"+
		"\3\2\2\2\u06a1\u067d\3\2\2\2\u06a1\u0680\3\2\2\2\u06a1\u0683\3\2\2\2\u06a1"+
		"\u0686\3\2\2\2\u06a1\u0689\3\2\2\2\u06a1\u068c\3\2\2\2\u06a1\u068f\3\2"+
		"\2\2\u06a1\u0692\3\2\2\2\u06a1\u0695\3\2\2\2\u06a1\u0698\3\2\2\2\u06a1"+
		"\u069b\3\2\2\2\u06a1\u069e\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2"+
		"\2\2\u06a3\u06a4\3\2\2\2\u06a4\u00cb\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6"+
		"\u06a7\bg\1\2\u06a7\u06c9\5\u00ceh\2\u06a8\u06c9\5\u0084C\2\u06a9\u06c9"+
		"\5\u0086D\2\u06aa\u06c9\5\u00a2R\2\u06ab\u06c9\5\u0098M\2\u06ac\u06ad"+
		"\t\35\2\2\u06ad\u06c9\5\u00ccg\t\u06ae\u06b0\7\u00d2\2\2\u06af\u06ae\3"+
		"\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b2\7\'\2\2\u06b2"+
		"\u06b7\5\u00be`\2\u06b3\u06b4\7-\2\2\u06b4\u06b6\5\u00be`\2\u06b5\u06b3"+
		"\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8"+
		"\u06ba\3\2\2\2\u06b9\u06b7\3\2\2\2\u06ba\u06bb\7(\2\2\u06bb\u06c9\3\2"+
		"\2\2\u06bc\u06be\7u\2\2\u06bd\u06bc\3\2\2\2\u06bd\u06be\3\2\2\2\u06be"+
		"\u06bf\3\2\2\2\u06bf\u06c9\5z>\2\u06c0\u06c1\7)\2\2\u06c1\u06c2\5\u0096"+
		"L\2\u06c2\u06c3\5\u00be`\2\u06c3\u06c4\7*\2\2\u06c4\u06c9\3\2\2\2\u06c5"+
		"\u06c9\5\u0102\u0082\2\u06c6\u06c9\5\u0106\u0084\2\u06c7\u06c9\5\u010c"+
		"\u0087\2\u06c8\u06a6\3\2\2\2\u06c8\u06a8\3\2\2\2\u06c8\u06a9\3\2\2\2\u06c8"+
		"\u06aa\3\2\2\2\u06c8\u06ab\3\2\2\2\u06c8\u06ac\3\2\2\2\u06c8\u06af\3\2"+
		"\2\2\u06c8\u06bd\3\2\2\2\u06c8\u06c0\3\2\2\2\u06c8\u06c5\3\2\2\2\u06c8"+
		"\u06c6\3\2\2\2\u06c8\u06c7\3\2\2\2\u06c9\u06d5\3\2\2\2\u06ca\u06cb\f\n"+
		"\2\2\u06cb\u06cc\7\r\2\2\u06cc\u06d4\5\u00ccg\13\u06cd\u06ce\f\f\2\2\u06ce"+
		"\u06d1\7\u0106\2\2\u06cf\u06d2\7\u01dd\2\2\u06d0\u06d2\5\u0096L\2\u06d1"+
		"\u06cf\3\2\2\2\u06d1\u06d0\3\2\2\2\u06d2\u06d4\3\2\2\2\u06d3\u06ca\3\2"+
		"\2\2\u06d3\u06cd\3\2\2\2\u06d4\u06d7\3\2\2\2\u06d5\u06d3\3\2\2\2\u06d5"+
		"\u06d6\3\2\2\2\u06d6\u00cd\3\2\2\2\u06d7\u06d5\3\2\2\2\u06d8\u06dc\5\u00d0"+
		"i\2\u06d9\u06dc\5\u00e4s\2\u06da\u06dc\5\u00fe\u0080\2\u06db\u06d8\3\2"+
		"\2\2\u06db\u06d9\3\2\2\2\u06db\u06da\3\2\2\2\u06dc\u00cf\3\2\2\2\u06dd"+
		"\u06de\5\u00d2j\2\u06de\u06e0\7\'\2\2\u06df\u06e1\5\u00d4k\2\u06e0\u06df"+
		"\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06eb\3\2\2\2\u06e2\u06e7\5\u00be`"+
		"\2\u06e3\u06e4\7-\2\2\u06e4\u06e6\5\u00be`\2\u06e5\u06e3\3\2\2\2\u06e6"+
		"\u06e9\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06ec\3\2"+
		"\2\2\u06e9\u06e7\3\2\2\2\u06ea\u06ec\7\31\2\2\u06eb\u06e2\3\2\2\2\u06eb"+
		"\u06ea\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ef\7("+
		"\2\2\u06ee\u06f0\5\u00d6l\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0"+
		"\u00d1\3\2\2\2\u06f1\u06f2\t\36\2\2\u06f2\u00d3\3\2\2\2\u06f3\u06f4\7"+
		"V\2\2\u06f4\u00d5\3\2\2\2\u06f5\u06fb\7\u0135\2\2\u06f6\u06f7\7\'\2\2"+
		"\u06f7\u06f8\5\u00d8m\2\u06f8\u06f9\7(\2\2\u06f9\u06fc\3\2\2\2\u06fa\u06fc"+
		"\5\u0096L\2\u06fb\u06f6\3\2\2\2\u06fb\u06fa\3\2\2\2\u06fc\u00d7\3\2\2"+
		"\2\u06fd\u06ff\5\u0096L\2\u06fe\u06fd\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff"+
		"\u0701\3\2\2\2\u0700\u0702\5\u00dan\2\u0701\u0700\3\2\2\2\u0701\u0702"+
		"\3\2\2\2\u0702\u0704\3\2\2\2\u0703\u0705\5\u0110\u0089\2\u0704\u0703\3"+
		"\2\2\2\u0704\u0705\3\2\2\2\u0705\u0707\3\2\2\2\u0706\u0708\5\u00dco\2"+
		"\u0707\u0706\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u00d9\3\2\2\2\u0709\u070a"+
		"\7\u00d8\2\2\u070a\u070b\7}\2\2\u070b\u0710\5\u00be`\2\u070c\u070d\7-"+
		"\2\2\u070d\u070f\5\u00be`\2\u070e\u070c\3\2\2\2\u070f\u0712\3\2\2\2\u0710"+
		"\u070e\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u00db\3\2\2\2\u0712\u0710\3\2"+
		"\2\2\u0713\u0716\t\37\2\2\u0714\u0717\5\u00dep\2\u0715\u0717\5\u00e2r"+
		"\2\u0716\u0714\3\2\2\2\u0716\u0715\3\2\2\2\u0717\u00dd\3\2\2\2\u0718\u0719"+
		"\7\u00a1\2\2\u0719\u0725\7\u00d2\2\2\u071a\u071b\7\u00e1\2\2\u071b\u0725"+
		"\7\u013a\2\2\u071c\u071d\7\u00e1\2\2\u071d\u0725\7\u0120\2\2\u071e\u071f"+
		"\5\u00be`\2\u071f\u0720\7\u013a\2\2\u0720\u0725\3\2\2\2\u0721\u0722\5"+
		"\u00be`\2\u0722\u0723\7\u0120\2\2\u0723\u0725\3\2\2\2\u0724\u0718\3\2"+
		"\2\2\u0724\u071a\3\2\2\2\u0724\u071c\3\2\2\2\u0724\u071e\3\2\2\2\u0724"+
		"\u0721\3\2\2\2\u0725\u00df\3\2\2\2\u0726\u0727\5\u00dep\2\u0727\u00e1"+
		"\3\2\2\2\u0728\u0729\7v\2\2\u0729\u072a\5\u00dep\2\u072a\u072b\7n\2\2"+
		"\u072b\u072c\5\u00e0q\2\u072c\u00e3\3\2\2\2\u072d\u0738\5\u00e6t\2\u072e"+
		"\u0738\5\u00e8u\2\u072f\u0738\5\u00eav\2\u0730\u0738\5\u00ecw\2\u0731"+
		"\u0738\5\u00eex\2\u0732\u0738\5\u00f0y\2\u0733\u0738\5\u00f2z\2\u0734"+
		"\u0738\5\u00f4{\2\u0735\u0738\5\u00f6|\2\u0736\u0738\5\u00f8}\2\u0737"+
		"\u072d\3\2\2\2\u0737\u072e\3\2\2\2\u0737\u072f\3\2\2\2\u0737\u0730\3\2"+
		"\2\2\u0737\u0731\3\2\2\2\u0737\u0732\3\2\2\2\u0737\u0733\3\2\2\2\u0737"+
		"\u0734\3\2\2\2\u0737\u0735\3\2\2\2\u0737\u0736\3\2\2\2\u0738\u00e5\3\2"+
		"\2\2\u0739\u073a\7\u017f\2\2\u073a\u073c\7\'\2\2\u073b\u073d\5\u00d4k"+
		"\2\u073c\u073b\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u0747\3\2\2\2\u073e\u0743"+
		"\5\u00be`\2\u073f\u0740\7-\2\2\u0740\u0742\5\u00be`\2\u0741\u073f\3\2"+
		"\2\2\u0742\u0745\3\2\2\2\u0743\u0741\3\2\2\2\u0743\u0744\3\2\2\2\u0744"+
		"\u0748\3\2\2\2\u0745\u0743\3\2\2\2\u0746\u0748\7\31\2\2\u0747\u073e\3"+
		"\2\2\2\u0747\u0746\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u074a\3\2\2\2\u0749"+
		"\u074b\5\u0110\u0089\2\u074a\u0749\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074e"+
		"\3\2\2\2\u074c\u074d\7\u014d\2\2\u074d\u074f\5\u00be`\2\u074e\u074c\3"+
		"\2\2\2\u074e\u074f\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0751\7(\2\2\u0751"+
		"\u00e7\3\2\2\2\u0752\u0753\5\u0096L\2\u0753\u0754\7\'\2\2\u0754\u0759"+
		"\5\u00be`\2\u0755\u0756\7-\2\2\u0756\u0758\5\u00be`\2\u0757\u0755\3\2"+
		"\2\2\u0758\u075b\3\2\2\2\u0759\u0757\3\2\2\2\u0759\u075a\3\2\2\2\u075a"+
		"\u075c\3\2\2\2\u075b\u0759\3\2\2\2\u075c\u075d\7(\2\2\u075d\u075e\5\u00d6"+
		"l\2\u075e\u00e9\3\2\2\2\u075f\u0760\7Y\2\2\u0760\u0761\7\'\2\2\u0761\u0762"+
		"\5\u00be`\2\u0762\u0763\7g\2\2\u0763\u0764\5\u0114\u008b\2\u0764\u0765"+
		"\7(\2\2\u0765\u00eb\3\2\2\2\u0766\u0767\7\u010d\2\2\u0767\u0768\7\'\2"+
		"\2\u0768\u0769\5\u00be`\2\u0769\u076a\7-\2\2\u076a\u076b\5\u0114\u008b"+
		"\2\u076b\u076c\7(\2\2\u076c\u0775\3\2\2\2\u076d\u076e\7\u010d\2\2\u076e"+
		"\u076f\7\'\2\2\u076f\u0770\5\u00be`\2\u0770\u0771\7e\2\2\u0771\u0772\5"+
		"\u0096L\2\u0772\u0773\7(\2\2\u0773\u0775\3\2\2\2\u0774\u0766\3\2\2\2\u0774"+
		"\u076d\3\2\2\2\u0775\u00ed\3\2\2\2\u0776\u0777\7L\2\2\u0777\u0778\7\'"+
		"\2\2\u0778\u0779\5\u00be`\2\u0779\u077a\7w\2\2\u077a\u077b\5\u00be`\2"+
		"\u077b\u077c\7(\2\2\u077c\u00ef\3\2\2\2\u077d\u077e\t \2\2\u077e\u077f"+
		"\7\'\2\2\u077f\u0780\5\u00be`\2\u0780\u0781\7\\\2\2\u0781\u0784\7\u01de"+
		"\2\2\u0782\u0783\7l\2\2\u0783\u0785\7\u01de\2\2\u0784\u0782\3\2\2\2\u0784"+
		"\u0785\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u0787\7(\2\2\u0787\u00f1\3\2"+
		"\2\2\u0788\u0789\7\u011d\2\2\u0789\u078a\7\'\2\2\u078a\u078b\5\u0096L"+
		"\2\u078b\u078c\7\\\2\2\u078c\u078d\5\u00be`\2\u078d\u078e\7(\2\2\u078e"+
		"\u00f3\3\2\2\2\u078f\u0790\7\u0089\2\2\u0790\u0791\7\'\2\2\u0791\u0796"+
		"\5\u00be`\2\u0792\u0793\7-\2\2\u0793\u0795\5\u00be`\2\u0794\u0792\3\2"+
		"\2\2\u0795\u0798\3\2\2\2\u0796\u0794\3\2\2\2\u0796\u0797\3\2\2\2\u0797"+
		"\u079b\3\2\2\2\u0798\u0796\3\2\2\2\u0799\u079a\7e\2\2\u079a\u079c\5\u011e"+
		"\u0090\2\u079b\u0799\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079d\3\2\2\2\u079d"+
		"\u079e\7(\2\2\u079e\u00f5\3\2\2\2\u079f\u07a0\7Z\2\2\u07a0\u07a1\7\'\2"+
		"\2\u07a1\u07a2\t!\2\2\u07a2\u07a3\7\u01dd\2\2\u07a3\u07a4\7\\\2\2\u07a4"+
		"\u07a5\7\u01dd\2\2\u07a5\u07a6\7(\2\2\u07a6\u00f7\3\2\2\2\u07a7\u07a8"+
		"\7\u0173\2\2\u07a8\u07a9\7\'\2\2\u07a9\u07ac\5\u00be`\2\u07aa\u07ab\7"+
		"g\2\2\u07ab\u07ad\5\u0114\u008b\2\u07ac\u07aa\3\2\2\2\u07ac\u07ad\3\2"+
		"\2\2\u07ad\u07af\3\2\2\2\u07ae\u07b0\5\u00fa~\2\u07af\u07ae\3\2\2\2\u07af"+
		"\u07b0\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b2\7(\2\2\u07b2\u00f9\3\2"+
		"\2\2\u07b3\u07bf\7\u00f0\2\2\u07b4\u07b9\5\u00fc\177\2\u07b5\u07b6\7-"+
		"\2\2\u07b6\u07b8\5\u00fc\177\2\u07b7\u07b5\3\2\2\2\u07b8\u07bb\3\2\2\2"+
		"\u07b9\u07b7\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07c0\3\2\2\2\u07bb\u07b9"+
		"\3\2\2\2\u07bc\u07bd\7\u01de\2\2\u07bd\u07be\7\30\2\2\u07be\u07c0\7\u01de"+
		"\2\2\u07bf\u07b4\3\2\2\2\u07bf\u07bc\3\2\2\2\u07c0\u00fb\3\2\2\2\u07c1"+
		"\u07c3\7\u01de\2\2\u07c2\u07c4\t\"\2\2\u07c3\u07c2\3\2\2\2\u07c3\u07c4"+
		"\3\2\2\2\u07c4\u07c6\3\2\2\2\u07c5\u07c7\7\u014b\2\2\u07c6\u07c5\3\2\2"+
		"\2\u07c6\u07c7\3\2\2\2\u07c7\u00fd\3\2\2\2\u07c8\u07c9\5\u0100\u0081\2"+
		"\u07c9\u07d3\7\'\2\2\u07ca\u07cf\5\u00be`\2\u07cb\u07cc\7-\2\2\u07cc\u07ce"+
		"\5\u00be`\2\u07cd\u07cb\3\2\2\2\u07ce\u07d1\3\2\2\2\u07cf\u07cd\3\2\2"+
		"\2\u07cf\u07d0\3\2\2\2\u07d0\u07d4\3\2\2\2\u07d1\u07cf\3\2\2\2\u07d2\u07d4"+
		"\7\31\2\2\u07d3\u07ca\3\2\2\2\u07d3\u07d2\3\2\2\2\u07d3\u07d4\3\2\2\2"+
		"\u07d4\u07d5\3\2\2\2\u07d5\u07d6\7(\2\2\u07d6\u00ff\3\2\2\2\u07d7\u07e1"+
		"\5\u0096L\2\u07d8\u07e1\7i\2\2\u07d9\u07e1\7\u0190\2\2\u07da\u07e1\7\u0090"+
		"\2\2\u07db\u07e1\7\u0091\2\2\u07dc\u07e1\7\u0131\2\2\u07dd\u07e1\7\u00be"+
		"\2\2\u07de\u07e1\7\u008c\2\2\u07df\u07e1\7";
	private static final String _serializedATNSegment1 =
		"[\2\2\u07e0\u07d7\3\2\2\2\u07e0\u07d8\3\2\2\2\u07e0\u07d9\3\2\2\2\u07e0"+
		"\u07da\3\2\2\2\u07e0\u07db\3\2\2\2\u07e0\u07dc\3\2\2\2\u07e0\u07dd\3\2"+
		"\2\2\u07e0\u07de\3\2\2\2\u07e0\u07df\3\2\2\2\u07e1\u0101\3\2\2\2\u07e2"+
		"\u07e3\7\u012e\2\2\u07e3\u07e4\5\u00b4[\2\u07e4\u07e5\7\u0159\2\2\u07e5"+
		"\u07e7\5\u00be`\2\u07e6\u07e8\5\u0104\u0083\2\u07e7\u07e6\3\2\2\2\u07e7"+
		"\u07e8\3\2\2\2\u07e8\u0103\3\2\2\2\u07e9\u07ea\7w\2\2\u07ea\u07eb\7]\2"+
		"\2\u07eb\u07ec\7\u015a\2\2\u07ec\u07fb\7\u015b\2\2\u07ed\u07ee\7w\2\2"+
		"\u07ee\u07ef\7]\2\2\u07ef\u07f0\7\u015a\2\2\u07f0\u07f1\7\u015b\2\2\u07f1"+
		"\u07f2\7T\2\2\u07f2\u07f3\7\u015c\2\2\u07f3\u07fb\7\u015e\2\2\u07f4\u07f5"+
		"\7w\2\2\u07f5\u07f6\7\u0087\2\2\u07f6\u07fb\7\u015b\2\2\u07f7\u07f8\7"+
		"T\2\2\u07f8\u07f9\7\u015c\2\2\u07f9\u07fb\7\u015e\2\2\u07fa\u07e9\3\2"+
		"\2\2\u07fa\u07ed\3\2\2\2\u07fa\u07f4\3\2\2\2\u07fa\u07f7\3\2\2\2\u07fb"+
		"\u0105\3\2\2\2\u07fc\u07fe\7W\2\2\u07fd\u07ff\5\u00ccg\2\u07fe\u07fd\3"+
		"\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0801\3\2\2\2\u0800\u0802\5\u0108\u0085"+
		"\2\u0801\u0800\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0801\3\2\2\2\u0803\u0804"+
		"\3\2\2\2\u0804\u0806\3\2\2\2\u0805\u0807\5\u010a\u0086\2\u0806\u0805\3"+
		"\2\2\2\u0806\u0807\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u0809\7\u0116\2\2"+
		"\u0809\u0107\3\2\2\2\u080a\u080b\7X\2\2\u080b\u080c\5\u00be`\2\u080c\u080d"+
		"\7k\2\2\u080d\u080e\5\u00be`\2\u080e\u0109\3\2\2\2\u080f\u0810\7j\2\2"+
		"\u0810\u0811\5\u00be`\2\u0811\u010b\3\2\2\2\u0812\u0813\7\u008c\2\2\u0813"+
		"\u0814\5\u00be`\2\u0814\u0815\5\u010e\u0088\2\u0815\u010d\3\2\2\2\u0816"+
		"\u0817\t#\2\2\u0817\u010f\3\2\2\2\u0818\u0819\7{\2\2\u0819\u081a\7}\2"+
		"\2\u081a\u081f\5\u0112\u008a\2\u081b\u081c\7-\2\2\u081c\u081e\5\u0112"+
		"\u008a\2\u081d\u081b\3\2\2\2\u081e\u0821\3\2\2\2\u081f\u081d\3\2\2\2\u081f"+
		"\u0820\3\2\2\2\u0820\u0111\3\2\2\2\u0821\u081f\3\2\2\2\u0822\u0826\5\u00a2"+
		"R\2\u0823\u0826\5\u008aF\2\u0824\u0826\5\u00be`\2\u0825\u0822\3\2\2\2"+
		"\u0825\u0823\3\2\2\2\u0825\u0824\3\2\2\2\u0826\u0828\3\2\2\2\u0827\u0829"+
		"\t\"\2\2\u0828\u0827\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u0113\3\2\2\2\u082a"+
		"\u082c\5\u0116\u008c\2\u082b\u082d\5\u0118\u008d\2\u082c\u082b\3\2\2\2"+
		"\u082c\u082d\3\2\2\2\u082d\u082f\3\2\2\2\u082e\u0830\5\u011a\u008e\2\u082f"+
		"\u082e\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0832\3\2\2\2\u0831\u0833\5\u011c"+
		"\u008f\2\u0832\u0831\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0835\3\2\2\2\u0834"+
		"\u0836\7\u00e3\2\2\u0835\u0834\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0838"+
		"\3\2\2\2\u0837\u0839\7\u0154\2\2\u0838\u0837\3\2\2\2\u0838\u0839\3\2\2"+
		"\2\u0839\u084c\3\2\2\2\u083a\u083b\5\u0116\u008c\2\u083b\u083c\7\'\2\2"+
		"\u083c\u0841\7\u01dd\2\2\u083d\u083e\7-\2\2\u083e\u0840\7\u01dd\2\2\u083f"+
		"\u083d\3\2\2\2\u0840\u0843\3\2\2\2\u0841\u083f\3\2\2\2\u0841\u0842\3\2"+
		"\2\2\u0842\u0844\3\2\2\2\u0843\u0841\3\2\2\2\u0844\u0846\7(\2\2\u0845"+
		"\u0847\5\u011a\u008e\2\u0846\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0849"+
		"\3\2\2\2\u0848\u084a\5\u011c\u008f\2\u0849\u0848\3\2\2\2\u0849\u084a\3"+
		"\2\2\2\u084a\u084c\3\2\2\2\u084b\u082a\3\2\2\2\u084b\u083a\3\2\2\2\u084c"+
		"\u0115\3\2\2\2\u084d\u084f\5\u0096L\2\u084e\u0850\5\u0096L\2\u084f\u084e"+
		"\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0117\3\2\2\2\u0851\u0852\7\'\2\2\u0852"+
		"\u0855\7\u01de\2\2\u0853\u0854\7-\2\2\u0854\u0856\7\u01de\2\2\u0855\u0853"+
		"\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0858\7(\2\2\u0858"+
		"\u0119\3\2\2\2\u0859\u085a\t$\2\2\u085a\u085c\7C\2\2\u085b\u085d\7 \2"+
		"\2\u085c\u085b\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u085f"+
		"\5\u011e\u0090\2\u085f\u011b\3\2\2\2\u0860\u0862\7\u0106\2\2\u0861\u0863"+
		"\7 \2\2\u0862\u0861\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0866\3\2\2\2\u0864"+
		"\u0867\7\u01dd\2\2\u0865\u0867\5\u011e\u0090\2\u0866\u0864\3\2\2\2\u0866"+
		"\u0865\3\2\2\2\u0867\u011d\3\2\2\2\u0868\u086b\5\u0096L\2\u0869\u086a"+
		"\7\34\2\2\u086a\u086c\5\u0096L\2\u086b\u0869\3\2\2\2\u086b\u086c\3\2\2"+
		"\2\u086c\u011f\3\2\2\2\u086d\u0872\5\u011e\u0090\2\u086e\u086f\7-\2\2"+
		"\u086f\u0871\5\u011e\u0090\2\u0870\u086e\3\2\2\2\u0871\u0874\3\2\2\2\u0872"+
		"\u0870\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0121\3\2\2\2\u0874\u0872\3\2"+
		"\2\2\u0875\u0877\7;\2\2\u0876\u0878\5\u0164\u00b3\2\u0877\u0876\3\2\2"+
		"\2\u0877\u0878\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u087a\7D\2\2\u087a\u087b"+
		"\5\u0166\u00b4\2\u087b\u087e\5\u00a0Q\2\u087c\u087f\5\u0168\u00b5\2\u087d"+
		"\u087f\5\u0192\u00ca\2\u087e\u087c\3\2\2\2\u087e\u087d\3\2\2\2\u087f\u0123"+
		"\3\2\2\2\u0880\u0881\7;\2\2\u0881\u0882\5\u0194\u00cb\2\u0882\u0883\7"+
		"F\2\2\u0883\u0885\5\u00b8]\2\u0884\u0886\5\u0180\u00c1\2\u0885\u0884\3"+
		"\2\2\2\u0885\u0886\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0888\7h\2\2\u0888"+
		"\u0889\5\u00a0Q\2\u0889\u088b\5\u0182\u00c2\2\u088a\u088c\5\u0186\u00c4"+
		"\2\u088b\u088a\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u0899\3\2\2\2\u088d\u088f"+
		"\7\u00f9\2\2\u088e\u0890\7 \2\2\u088f\u088e\3\2\2\2\u088f\u0890\3\2\2"+
		"\2\u0890\u0891\3\2\2\2\u0891\u0898\t%\2\2\u0892\u0894\7\u012d\2\2\u0893"+
		"\u0895\7 \2\2\u0894\u0893\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u0896\3\2"+
		"\2\2\u0896\u0898\t&\2\2\u0897\u088d\3\2\2\2\u0897\u0892\3\2\2\2\u0898"+
		"\u089b\3\2\2\2\u0899\u0897\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u0125\3\2"+
		"\2\2\u089b\u0899\3\2\2\2\u089c\u089d\7<\2\2\u089d\u089e\7D\2\2\u089e\u08a0"+
		"\5\u00a0Q\2\u089f\u08a1\5\u0196\u00cc\2\u08a0\u089f\3\2\2\2\u08a0\u08a1"+
		"\3\2\2\2\u08a1\u0127\3\2\2\2\u08a2\u08a3\7=\2\2\u08a3\u08a4\5\u01c2\u00e2"+
		"\2\u08a4\u08a5\7D\2\2\u08a5\u08a6\5\u01c4\u00e3\2\u08a6\u08a7\5\u00b6"+
		"\\\2\u08a7\u0129\3\2\2\2\u08a8\u08a9\7=\2\2\u08a9\u08ab\7F\2\2\u08aa\u08ac"+
		"\5\u01c6\u00e4\2\u08ab\u08aa\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08ad\3"+
		"\2\2\2\u08ad\u08b0\5\u00b8]\2\u08ae\u08af\7h\2\2\u08af\u08b1\5\u00a0Q"+
		"\2\u08b0\u08ae\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08be\3\2\2\2\u08b2\u08b4"+
		"\7\u00f9\2\2\u08b3\u08b5\7 \2\2\u08b4\u08b3\3\2\2\2\u08b4\u08b5\3\2\2"+
		"\2\u08b5\u08b6\3\2\2\2\u08b6\u08bd\t%\2\2\u08b7\u08b9\7\u012d\2\2\u08b8"+
		"\u08ba\7 \2\2\u08b9\u08b8\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bb\3\2"+
		"\2\2\u08bb\u08bd\t&\2\2\u08bc\u08b2\3\2\2\2\u08bc\u08b7\3\2\2\2\u08bd"+
		"\u08c0\3\2\2\2\u08be\u08bc\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u012b\3\2"+
		"\2\2\u08c0\u08be\3\2\2\2\u08c1\u08c3\7>\2\2\u08c2\u08c4\7D\2\2\u08c3\u08c2"+
		"\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c6\5\u00a0Q"+
		"\2\u08c6\u012d\3\2\2\2\u08c7\u08c8\7;\2\2\u08c8\u08cc\t\'\2\2\u08c9\u08ca"+
		"\7i\2\2\u08ca\u08cb\7q\2\2\u08cb\u08cd\7u\2\2\u08cc\u08c9\3\2\2\2\u08cc"+
		"\u08cd\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce\u08d2\5\u009eP\2\u08cf\u08d1"+
		"\5\u016a\u00b6\2\u08d0\u08cf\3\2\2\2\u08d1\u08d4\3\2\2\2\u08d2\u08d0\3"+
		"\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u012f\3\2\2\2\u08d4\u08d2\3\2\2\2\u08d5"+
		"\u08d6\7<\2\2\u08d6\u08d7\t\'\2\2\u08d7\u08db\5\u009eP\2\u08d8\u08da\5"+
		"\u016a\u00b6\2\u08d9\u08d8\3\2\2\2\u08da\u08dd\3\2\2\2\u08db\u08d9\3\2"+
		"\2\2\u08db\u08dc\3\2\2\2\u08dc\u0131\3\2\2\2\u08dd\u08db\3\2\2\2\u08de"+
		"\u08df\7=\2\2\u08df\u08e2\t\'\2\2\u08e0\u08e1\7i\2\2\u08e1\u08e3\7u\2"+
		"\2\u08e2\u08e0\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e5"+
		"\5\u009eP\2\u08e5\u0133\3\2\2\2\u08e6\u08e7\7<\2\2\u08e7\u08e8\7\u00a5"+
		"\2\2\u08e8\u08e9\5\u0136\u009c\2\u08e9\u0135\3\2\2\2\u08ea\u08eb\7\u019d"+
		"\2\2\u08eb\u08ec\7\3\2\2\u08ec\u08ed\7\u019e\2\2\u08ed\u08fb\7K\2\2\u08ee"+
		"\u08ef\7\u019d\2\2\u08ef\u08f0\7\u019f\2\2\u08f0\u08f1\7\u019e\2\2\u08f1"+
		"\u08fb\7K\2\2\u08f2\u08f3\7\u0143\2\2\u08f3\u08f8\7\4\2\2\u08f4\u08f5"+
		"\7\u00f1\2\2\u08f5\u08f6\7\u0085\2\2\u08f6\u08f7\7h\2\2\u08f7\u08f9\7"+
		"\u01a0\2\2\u08f8\u08f4\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fb\3\2\2\2"+
		"\u08fa\u08ea\3\2\2\2\u08fa\u08ee\3\2\2\2\u08fa\u08f2\3\2\2\2\u08fb\u0137"+
		"\3\2\2\2\u08fc\u08fe\7;\2\2\u08fd\u08ff\5\u01c8\u00e5\2\u08fe\u08fd\3"+
		"\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0900\3\2\2\2\u0900\u0904\7\u0118\2\2"+
		"\u0901\u0902\7i\2\2\u0902\u0903\7q\2\2\u0903\u0905\7u\2\2\u0904\u0901"+
		"\3\2\2\2\u0904\u0905\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u0907\5\u00a6T"+
		"\2\u0907\u0908\7h\2\2\u0908\u0909\7\u01a1\2\2\u0909\u0910\5\u01ca\u00e6"+
		"\2\u090a\u090b\7h\2\2\u090b\u090d\7\u01a2\2\2\u090c\u090e\7q\2\2\u090d"+
		"\u090c\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u0911\7\u00a6"+
		"\2\2\u0910\u090a\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0917\3\2\2\2\u0912"+
		"\u0918\7\u00a2\2\2\u0913\u0918\7\u00a3\2\2\u0914\u0915\7\u00a3\2\2\u0915"+
		"\u0916\7h\2\2\u0916\u0918\7\u0152\2\2\u0917\u0912\3\2\2\2\u0917\u0913"+
		"\3\2\2\2\u0917\u0914\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u091b\3\2\2\2\u0919"+
		"\u091a\7\u0107\2\2\u091a\u091c\7\u01dd\2\2\u091b\u0919\3\2\2\2\u091b\u091c"+
		"\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u091e\7\u00a7\2\2\u091e\u091f\5\u01ce"+
		"\u00e8\2\u091f\u0139\3\2\2\2\u0920\u0922\7<\2\2\u0921\u0923\5\u01c8\u00e5"+
		"\2\u0922\u0921\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u0925"+
		"\7\u0118\2\2\u0925\u0929\5\u00a6T\2\u0926\u0927\7h\2\2\u0927\u0928\7\u01a1"+
		"\2\2\u0928\u092a\5\u01ca\u00e6\2\u0929\u0926\3\2\2\2\u0929\u092a\3\2\2"+
		"\2\u092a\u0931\3\2\2\2\u092b\u092c\7h\2\2\u092c\u092e\7\u01a2\2\2\u092d"+
		"\u092f\7q\2\2\u092e\u092d\3\2\2\2\u092e\u092f\3\2\2\2\u092f\u0930\3\2"+
		"\2\2\u0930\u0932\7\u00a6\2\2\u0931\u092b\3\2\2\2\u0931\u0932\3\2\2\2\u0932"+
		"\u0936\3\2\2\2\u0933\u0934\7\u0145\2\2\u0934\u0935\7m\2\2\u0935\u0937"+
		"\5\u00a6T\2\u0936\u0933\3\2\2\2\u0936\u0937\3\2\2\2\u0937\u093d\3\2\2"+
		"\2\u0938\u093e\7\u00a2\2\2\u0939\u093e\7\u00a3\2\2\u093a\u093b\7\u00a3"+
		"\2\2\u093b\u093c\7h\2\2\u093c\u093e\7\u0152\2\2\u093d\u0938\3\2\2\2\u093d"+
		"\u0939\3\2\2\2\u093d\u093a\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u0941\3\2"+
		"\2\2\u093f\u0940\7\u0107\2\2\u0940\u0942\7\u01dd\2\2\u0941\u093f\3\2\2"+
		"\2\u0941\u0942\3\2\2\2\u0942\u0945\3\2\2\2\u0943\u0944\7\u00a7\2\2\u0944"+
		"\u0946\5\u01ce\u00e8\2\u0945\u0943\3\2\2\2\u0945\u0946\3\2\2\2\u0946\u013b"+
		"\3\2\2\2\u0947\u0948\7=\2\2\u0948\u094b\7\u0118\2\2\u0949\u094a\7i\2\2"+
		"\u094a\u094c\7u\2\2\u094b\u0949\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u094d"+
		"\3\2\2\2\u094d\u094e\5\u00a6T\2\u094e\u013d\3\2\2\2\u094f\u0951\7;\2\2"+
		"\u0950\u0952\5\u01c8\u00e5\2\u0951\u0950\3\2\2\2\u0951\u0952\3\2\2\2\u0952"+
		"\u0953\3\2\2\2\u0953\u0954\7N\2\2\u0954\u0955\5\u00acW\2\u0955\u0959\7"+
		"\'\2\2\u0956\u0957\5\u0096L\2\u0957\u0958\5\u0114\u008b\2\u0958\u095a"+
		"\3\2\2\2\u0959\u0956\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u0961\3\2\2\2\u095b"+
		"\u095c\7-\2\2\u095c\u095d\5\u0096L\2\u095d\u095e\5\u0114\u008b\2\u095e"+
		"\u0960\3\2\2\2\u095f\u095b\3\2\2\2\u0960\u0963\3\2\2\2\u0961\u095f\3\2"+
		"\2\2\u0961\u0962\3\2\2\2\u0962\u0964\3\2\2\2\u0963\u0961\3\2\2\2\u0964"+
		"\u0965\7(\2\2\u0965\u0966\7\u01ae\2\2\u0966\u096a\5\u0114\u008b\2\u0967"+
		"\u0969\5\u01d2\u00ea\2\u0968\u0967\3\2\2\2\u0969\u096c\3\2\2\2\u096a\u0968"+
		"\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u096d\3\2\2\2\u096c\u096a\3\2\2\2\u096d"+
		"\u096e\5\u01ce\u00e8\2\u096e\u013f\3\2\2\2\u096f\u0970\7<\2\2\u0970\u0971"+
		"\7N\2\2\u0971\u0975\5\u00acW\2\u0972\u0974\5\u01d2\u00ea\2\u0973\u0972"+
		"\3\2\2\2\u0974\u0977\3\2\2\2\u0975\u0973\3\2\2\2\u0975\u0976\3\2\2\2\u0976"+
		"\u0141\3\2\2\2\u0977\u0975\3\2\2\2\u0978\u0979\7=\2\2\u0979\u097a\7N\2"+
		"\2\u097a\u097b\7i\2\2\u097b\u097c\7u\2\2\u097c\u097d\3\2\2\2\u097d\u097e"+
		"\5\u00acW\2\u097e\u0143\3\2\2\2\u097f\u0981\7;\2\2\u0980\u0982\5\u01c8"+
		"\u00e5\2\u0981\u0980\3\2\2\2\u0981\u0982\3\2\2\2\u0982\u0983\3\2\2\2\u0983"+
		"\u0984\7P\2\2\u0984\u0985\5\u00acW\2\u0985\u0987\7\'\2\2\u0986\u0988\5"+
		"\u01d4\u00eb\2\u0987\u0986\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u098d\3\2"+
		"\2\2\u0989\u098a\7-\2\2\u098a\u098c\5\u01d4\u00eb\2\u098b\u0989\3\2\2"+
		"\2\u098c\u098f\3\2\2\2\u098d\u098b\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u0990"+
		"\3\2\2\2\u098f\u098d\3\2\2\2\u0990\u0994\7(\2\2\u0991\u0993\5\u01d2\u00ea"+
		"\2\u0992\u0991\3\2\2\2\u0993\u0996\3\2\2\2\u0994\u0992\3\2\2\2\u0994\u0995"+
		"\3\2\2\2\u0995\u0997\3\2\2\2\u0996\u0994\3\2\2\2\u0997\u0998\5\u01ce\u00e8"+
		"\2\u0998\u0145\3\2\2\2\u0999\u099a\7<\2\2\u099a\u099b\7P\2\2\u099b\u099f"+
		"\5\u00acW\2\u099c\u099e\5\u01d2\u00ea\2\u099d\u099c\3\2\2\2\u099e\u09a1"+
		"\3\2\2\2\u099f\u099d\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u0147\3\2\2\2\u09a1"+
		"\u099f\3\2\2\2\u09a2\u09a3\7=\2\2\u09a3\u09a6\7P\2\2\u09a4\u09a5\7i\2"+
		"\2\u09a5\u09a7\7u\2\2\u09a6\u09a4\3\2\2\2\u09a6\u09a7\3\2\2\2\u09a7\u09a8"+
		"\3\2\2\2\u09a8\u09a9\5\u00acW\2\u09a9\u0149\3\2\2\2\u09aa\u09ab\7;\2\2"+
		"\u09ab\u09ac\7\u01a9\2\2\u09ac\u09ad\5\u00a8U\2\u09ad\u09ae\7J\2\2\u09ae"+
		"\u09af\7\u010f\2\2\u09af\u09b0\7\u01aa\2\2\u09b0\u09b1\5\u00aaV\2\u09b1"+
		"\u09b2\7\u01ab\2\2\u09b2\u09b3\7\'\2\2\u09b3\u09b8\5\u01d0\u00e9\2\u09b4"+
		"\u09b5\7-\2\2\u09b5\u09b7\5\u01d0\u00e9\2\u09b6\u09b4\3\2\2\2\u09b7\u09ba"+
		"\3\2\2\2\u09b8\u09b6\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09bb\3\2\2\2\u09ba"+
		"\u09b8\3\2\2\2\u09bb\u09bc\7(\2\2\u09bc\u014b\3\2\2\2\u09bd\u09be\7<\2"+
		"\2\u09be\u09bf\7\u01a9\2\2\u09bf\u09c0\5\u00a8U\2\u09c0\u09c1\7\u01ab"+
		"\2\2\u09c1\u09c2\7\'\2\2\u09c2\u09c7\5\u01d0\u00e9\2\u09c3\u09c4\7-\2"+
		"\2\u09c4\u09c6\5\u01d0\u00e9\2\u09c5\u09c3\3\2\2\2\u09c6\u09c9\3\2\2\2"+
		"\u09c7\u09c5\3\2\2\2\u09c7\u09c8\3\2\2\2\u09c8\u09ca\3\2\2\2\u09c9\u09c7"+
		"\3\2\2\2\u09ca\u09cb\7(\2\2\u09cb\u014d\3\2\2\2\u09cc\u09cd\7=\2\2\u09cd"+
		"\u09d0\7\u01a9\2\2\u09ce\u09cf\7i\2\2\u09cf\u09d1\7u\2\2\u09d0\u09ce\3"+
		"\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2\u09d3\5\u00a8U\2"+
		"\u09d3\u014f\3\2\2\2\u09d4\u09d7\7;\2\2\u09d5\u09d6\7o\2\2\u09d6\u09d8"+
		"\7\u00be\2\2\u09d7\u09d5\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8\u09dc\3\2\2"+
		"\2\u09d9\u09da\7\u00f9\2\2\u09da\u09db\7 \2\2\u09db\u09dd\t(\2\2\u09dc"+
		"\u09d9\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09df\3\2\2\2\u09de\u09e0\5\u01c8"+
		"\u00e5\2\u09df\u09de\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e4\3\2\2\2\u09e1"+
		"\u09e2\7\u00aa\2\2\u09e2\u09e3\7\u01b2\2\2\u09e3\u09e5\t)\2\2\u09e4\u09e1"+
		"\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e7\7Q\2\2\u09e7"+
		"\u09f3\5\u00aeX\2\u09e8\u09e9\7\'\2\2\u09e9\u09ee\5\u0096L\2\u09ea\u09eb"+
		"\7-\2\2\u09eb\u09ed\5\u0096L\2\u09ec\u09ea\3\2\2\2\u09ed\u09f0\3\2\2\2"+
		"\u09ee\u09ec\3\2\2\2\u09ee\u09ef\3\2\2\2\u09ef\u09f1\3\2\2\2\u09f0\u09ee"+
		"\3\2\2\2\u09f1\u09f2\7(\2\2\u09f2\u09f4\3\2\2\2\u09f3\u09e8\3\2\2\2\u09f3"+
		"\u09f4\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5\u09f6\7g\2\2\u09f6\u09fd\5*\26"+
		"\2\u09f7\u09f9\7T\2\2\u09f8\u09fa\t*\2\2\u09f9\u09f8\3\2\2\2\u09f9\u09fa"+
		"\3\2\2\2\u09fa\u09fb\3\2\2\2\u09fb\u09fc\7\u00ee\2\2\u09fc\u09fe\7\u00f2"+
		"\2\2\u09fd\u09f7\3\2\2\2\u09fd\u09fe\3\2\2\2\u09fe\u0151\3\2\2\2\u09ff"+
		"\u0a03\7<\2\2\u0a00\u0a01\7\u00f9\2\2\u0a01\u0a02\7 \2\2\u0a02\u0a04\t"+
		"(\2\2\u0a03\u0a00\3\2\2\2\u0a03\u0a04\3\2\2\2\u0a04\u0a06\3\2\2\2\u0a05"+
		"\u0a07\5\u01c8\u00e5\2\u0a06\u0a05\3\2\2\2\u0a06\u0a07\3\2\2\2\u0a07\u0a0b"+
		"\3\2\2\2\u0a08\u0a09\7\u00aa\2\2\u0a09\u0a0a\7\u01b2\2\2\u0a0a\u0a0c\t"+
		")\2\2\u0a0b\u0a08\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0d\3\2\2\2\u0a0d"+
		"\u0a0e\7Q\2\2\u0a0e\u0a1a\5\u00aeX\2\u0a0f\u0a10\7\'\2\2\u0a10\u0a15\5"+
		"\u0096L\2\u0a11\u0a12\7-\2\2\u0a12\u0a14\5\u0096L\2\u0a13\u0a11\3\2\2"+
		"\2\u0a14\u0a17\3\2\2\2\u0a15\u0a13\3\2\2\2\u0a15\u0a16\3\2\2\2\u0a16\u0a18"+
		"\3\2\2\2\u0a17\u0a15\3\2\2\2\u0a18\u0a19\7(\2\2\u0a19\u0a1b\3\2\2\2\u0a1a"+
		"\u0a0f\3\2\2\2\u0a1a\u0a1b\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1d\7g"+
		"\2\2\u0a1d\u0a24\5*\26\2\u0a1e\u0a20\7T\2\2\u0a1f\u0a21\t*\2\2\u0a20\u0a1f"+
		"\3\2\2\2\u0a20\u0a21\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0a23\7\u00ee\2"+
		"\2\u0a23\u0a25\7\u00f2\2\2\u0a24\u0a1e\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25"+
		"\u0153\3\2\2\2\u0a26\u0a27\7=\2\2\u0a27\u0a2a\7Q\2\2\u0a28\u0a29\7i\2"+
		"\2\u0a29\u0a2b\7u\2\2\u0a2a\u0a28\3\2\2\2\u0a2a\u0a2b\3\2\2\2\u0a2b\u0a2c"+
		"\3\2\2\2\u0a2c\u0a31\5\u00aeX\2\u0a2d\u0a2e\7-\2\2\u0a2e\u0a30\5\u00ae"+
		"X\2\u0a2f\u0a2d\3\2\2\2\u0a30\u0a33\3\2\2\2\u0a31\u0a2f\3\2\2\2\u0a31"+
		"\u0a32\3\2\2\2\u0a32\u0a35\3\2\2\2\u0a33\u0a31\3\2\2\2\u0a34\u0a36\t+"+
		"\2\2\u0a35\u0a34\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u0155\3\2\2\2\u0a37"+
		"\u0a39\7;\2\2\u0a38\u0a3a\7\u01d8\2\2\u0a39\u0a38\3\2\2\2\u0a39\u0a3a"+
		"\3\2\2\2\u0a3a\u0a3b\3\2\2\2\u0a3b\u0a3c\7\u00b9\2\2\u0a3c\u0a3d\5\u0096"+
		"L\2\u0a3d\u0a3e\7B\2\2\u0a3e\u0a3f\7\u01b9\2\2\u0a3f\u0a43\7\u01dd\2\2"+
		"\u0a40\u0a41\7\u01ba\2\2\u0a41\u0a42\7 \2\2\u0a42\u0a44\5\u01d6\u00ec"+
		"\2\u0a43\u0a40\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u0a48\3\2\2\2\u0a45\u0a46"+
		"\7\u0115\2\2\u0a46\u0a47\7 \2\2\u0a47\u0a49\t,\2\2\u0a48\u0a45\3\2\2\2"+
		"\u0a48\u0a49\3\2\2\2\u0a49\u0a4f\3\2\2\2\u0a4a\u0a4c\7\u0117\2\2\u0a4b"+
		"\u0a4d\7 \2\2\u0a4c\u0a4b\3\2\2\2\u0a4c\u0a4d\3\2\2\2\u0a4d\u0a4e\3\2"+
		"\2\2\u0a4e\u0a50\7\u01dd\2\2\u0a4f\u0a4a\3\2\2\2\u0a4f\u0a50\3\2\2\2\u0a50"+
		"\u0157\3\2\2\2\u0a51\u0a53\7;\2\2\u0a52\u0a54\7\u01d8\2\2\u0a53\u0a52"+
		"\3\2\2\2\u0a53\u0a54\3\2\2\2\u0a54\u0a55\3\2\2\2\u0a55\u0a56\7\u00b9\2"+
		"\2\u0a56\u0a57\5\u0096L\2\u0a57\u0a58\7B\2\2\u0a58\u0a59\7\u01b9\2\2\u0a59"+
		"\u0a5a\7\u01dd\2\2\u0a5a\u0a5b\7\u00b2\2\2\u0a5b\u0a5c\7\u01c1\2\2\u0a5c"+
		"\u0a5d\7|\2\2\u0a5d\u0a63\5\u0096L\2\u0a5e\u0a60\7\u01bb\2\2\u0a5f\u0a61"+
		"\7 \2\2\u0a60\u0a5f\3\2\2\2\u0a60\u0a61\3\2\2\2\u0a61\u0a62\3\2\2\2\u0a62"+
		"\u0a64\5\u01d6\u00ec\2\u0a63\u0a5e\3\2\2\2\u0a63\u0a64\3\2\2\2\u0a64\u0a6a"+
		"\3\2\2\2\u0a65\u0a67\7\u01bc\2\2\u0a66\u0a68\7 \2\2\u0a67\u0a66\3\2\2"+
		"\2\u0a67\u0a68\3\2\2\2\u0a68\u0a69\3\2\2\2\u0a69\u0a6b\5\u01d6\u00ec\2"+
		"\u0a6a\u0a65\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b\u0a71\3\2\2\2\u0a6c\u0a6e"+
		"\7\u01bd\2\2\u0a6d\u0a6f\7 \2\2\u0a6e\u0a6d\3\2\2\2\u0a6e\u0a6f\3\2\2"+
		"\2\u0a6f\u0a70\3\2\2\2\u0a70\u0a72\5\u01d6\u00ec\2\u0a71\u0a6c\3\2\2\2"+
		"\u0a71\u0a72\3\2\2\2\u0a72\u0a78\3\2\2\2\u0a73\u0a75\7\u01be\2\2\u0a74"+
		"\u0a76\7 \2\2\u0a75\u0a74\3\2\2\2\u0a75\u0a76\3\2\2\2\u0a76\u0a77\3\2"+
		"\2\2\u0a77\u0a79\5\u01d6\u00ec\2\u0a78\u0a73\3\2\2\2\u0a78\u0a79\3\2\2"+
		"\2\u0a79\u0a7f\3\2\2\2\u0a7a\u0a7c\7\u01bf\2\2\u0a7b\u0a7d\7 \2\2\u0a7c"+
		"\u0a7b\3\2\2\2\u0a7c\u0a7d\3\2\2\2\u0a7d\u0a7e\3\2\2\2\u0a7e\u0a80\5\u0096"+
		"L\2\u0a7f\u0a7a\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80\u0a82\3\2\2\2\u0a81"+
		"\u0a83\7\u01c0\2\2\u0a82\u0a81\3\2\2\2\u0a82\u0a83\3\2\2\2\u0a83\u0a89"+
		"\3\2\2\2\u0a84\u0a86\7\u0107\2\2\u0a85\u0a87\7 \2\2\u0a86\u0a85\3\2\2"+
		"\2\u0a86\u0a87\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88\u0a8a\7\u01dd\2\2\u0a89"+
		"\u0a84\3\2\2\2\u0a89\u0a8a\3\2\2\2\u0a8a\u0a8b\3\2\2\2\u0a8b\u0a8d\7\u0117"+
		"\2\2\u0a8c\u0a8e\7 \2\2\u0a8d\u0a8c\3\2\2\2\u0a8d\u0a8e\3\2\2\2\u0a8e"+
		"\u0a8f\3\2\2\2\u0a8f\u0a90\5\u0096L\2\u0a90\u0159\3\2\2\2\u0a91\u0a92"+
		"\7<\2\2\u0a92\u0a93\7\u00b9\2\2\u0a93\u0a94\5\u0096L\2\u0a94\u0a95\t-"+
		"\2\2\u0a95\u0a96\7\u01b9\2\2\u0a96\u0a9a\7\u01dd\2\2\u0a97\u0a98\7\u01bc"+
		"\2\2\u0a98\u0a99\7 \2\2\u0a99\u0a9b\5\u01d6\u00ec\2\u0a9a\u0a97\3\2\2"+
		"\2\u0a9a\u0a9b\3\2\2\2\u0a9b\u0a9d\3\2\2\2\u0a9c\u0a9e\7\u01c0\2\2\u0a9d"+
		"\u0a9c\3\2\2\2\u0a9d\u0a9e\3\2\2\2\u0a9e\u0a9f\3\2\2\2\u0a9f\u0aa1\7\u0117"+
		"\2\2\u0aa0\u0aa2\7 \2\2\u0aa1\u0aa0\3\2\2\2\u0aa1\u0aa2\3\2\2\2\u0aa2"+
		"\u0aa3\3\2\2\2\u0aa3\u0aa4\5\u0096L\2\u0aa4\u015b\3\2\2\2\u0aa5\u0aa6"+
		"\7=\2\2\u0aa6\u0aa7\7\u00b9\2\2\u0aa7\u0aad\5\u0096L\2\u0aa8\u0aaa\7\u0117"+
		"\2\2\u0aa9\u0aab\7 \2\2\u0aaa\u0aa9\3\2\2\2\u0aaa\u0aab\3\2\2\2\u0aab"+
		"\u0aac\3\2\2\2\u0aac\u0aae\5\u0096L\2\u0aad\u0aa8\3\2\2\2\u0aad\u0aae"+
		"\3\2\2\2\u0aae\u015d\3\2\2\2\u0aaf\u0ab0\7;\2\2\u0ab0\u0ab1\7\u01c1\2"+
		"\2\u0ab1\u0ab2\7|\2\2\u0ab2\u0ab3\5\u0096L\2\u0ab3\u0ab4\7B\2\2\u0ab4"+
		"\u0ab5\7\u01c2\2\2\u0ab5\u0abb\7\u01dd\2\2\u0ab6\u0ab8\7\u01bc\2\2\u0ab7"+
		"\u0ab9\7 \2\2\u0ab8\u0ab7\3\2\2\2\u0ab8\u0ab9\3\2\2\2\u0ab9\u0aba\3\2"+
		"\2\2\u0aba\u0abc\5\u01d6\u00ec\2\u0abb\u0ab6\3\2\2\2\u0abb\u0abc\3\2\2"+
		"\2\u0abc\u0ac2\3\2\2\2\u0abd\u0abf\7\u01c3\2\2\u0abe\u0ac0\7 \2\2\u0abf"+
		"\u0abe\3\2\2\2\u0abf\u0ac0\3\2\2\2\u0ac0\u0ac1\3\2\2\2\u0ac1\u0ac3\5\u01d6"+
		"\u00ec\2\u0ac2\u0abd\3\2\2\2\u0ac2\u0ac3\3\2\2\2\u0ac3\u0ac9\3\2\2\2\u0ac4"+
		"\u0ac6\7\u01c4\2\2\u0ac5\u0ac7\7 \2\2\u0ac6\u0ac5\3\2\2\2\u0ac6\u0ac7"+
		"\3\2\2\2\u0ac7\u0ac8\3\2\2\2\u0ac8\u0aca\5\u01d6\u00ec\2\u0ac9\u0ac4\3"+
		"\2\2\2\u0ac9\u0aca\3\2\2\2\u0aca\u0ad0\3\2\2\2\u0acb\u0acd\7\u01bf\2\2"+
		"\u0acc\u0ace\7 \2\2\u0acd\u0acc\3\2\2\2\u0acd\u0ace\3\2\2\2\u0ace\u0acf"+
		"\3\2\2\2\u0acf\u0ad1\5\u0096L\2\u0ad0\u0acb\3\2\2\2\u0ad0\u0ad1\3\2\2"+
		"\2\u0ad1\u0ad3\3\2\2\2\u0ad2\u0ad4\7\u01c0\2\2\u0ad3\u0ad2\3\2\2\2\u0ad3"+
		"\u0ad4\3\2\2\2\u0ad4\u0ada\3\2\2\2\u0ad5\u0ad7\7\u0107\2\2\u0ad6\u0ad8"+
		"\7 \2\2\u0ad7\u0ad6\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8\u0ad9\3\2\2\2\u0ad9"+
		"\u0adb\7\u01dd\2\2\u0ada\u0ad5\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u0adc"+
		"\3\2\2\2\u0adc\u0ade\7\u0117\2\2\u0add\u0adf\7 \2\2\u0ade\u0add\3\2\2"+
		"\2\u0ade\u0adf\3\2\2\2\u0adf\u0ae0\3\2\2\2\u0ae0\u0ae1\5\u0096L\2\u0ae1"+
		"\u015f\3\2\2\2\u0ae2\u0ae3\7<\2\2\u0ae3\u0ae4\7\u01c1\2\2\u0ae4\u0ae5"+
		"\7|\2\2\u0ae5\u0ae6\5\u0096L\2\u0ae6\u0ae7\7B\2\2\u0ae7\u0ae8\7\u01c2"+
		"\2\2\u0ae8\u0aee\7\u01dd\2\2\u0ae9\u0aeb\7\u01bc\2\2\u0aea\u0aec\7 \2"+
		"\2\u0aeb\u0aea\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u0aed\3\2\2\2\u0aed\u0aef"+
		"\5\u01d6\u00ec\2\u0aee\u0ae9\3\2\2\2\u0aee\u0aef\3\2\2\2\u0aef\u0af1\3"+
		"\2\2\2\u0af0\u0af2\7\u01c0\2\2\u0af1\u0af0\3\2\2\2\u0af1\u0af2\3\2\2\2"+
		"\u0af2\u0af3\3\2\2\2\u0af3\u0af5\7\u0117\2\2\u0af4\u0af6\7 \2\2\u0af5"+
		"\u0af4\3\2\2\2\u0af5\u0af6\3\2\2\2\u0af6\u0af7\3\2\2\2\u0af7\u0af8\5\u0096"+
		"L\2\u0af8\u0161\3\2\2\2\u0af9\u0afa\7=\2\2\u0afa\u0afb\7\u01c1\2\2\u0afb"+
		"\u0afc\7|\2\2\u0afc\u0afd\5\u0096L\2\u0afd\u0afe\7\u0117\2\2\u0afe\u0aff"+
		"\7 \2\2\u0aff\u0b00\5\u0096L\2\u0b00\u0163\3\2\2\2\u0b01\u0b02\7\u00de"+
		"\2\2\u0b02\u0165\3\2\2\2\u0b03\u0b04\7i\2\2\u0b04\u0b05\7q\2\2\u0b05\u0b07"+
		"\7u\2\2\u0b06\u0b03\3\2\2\2\u0b06\u0b07\3\2\2\2\u0b07\u0167\3\2\2\2\u0b08"+
		"\u0b09\7\'\2\2\u0b09\u0b0a\5\u016c\u00b7\2\u0b0a\u0b0b\7(\2\2\u0b0b\u0169"+
		"\3\2\2\2\u0b0c\u0b0e\7\u00a0\2\2\u0b0d\u0b0c\3\2\2\2\u0b0d\u0b0e\3\2\2"+
		"\2\u0b0e\u0b12\3\2\2\2\u0b0f\u0b10\7\u008a\2\2\u0b10\u0b13\7C\2\2\u0b11"+
		"\u0b13\7\u0101\2\2\u0b12\u0b0f\3\2\2\2\u0b12\u0b11\3\2\2\2\u0b13\u0b15"+
		"\3\2\2\2\u0b14\u0b16\7 \2\2\u0b15\u0b14\3\2\2\2\u0b15\u0b16\3\2\2\2\u0b16"+
		"\u0b17\3\2\2\2\u0b17\u0b25\5\u00ba^\2\u0b18\u0b1a\7\u00a0\2\2\u0b19\u0b18"+
		"\3\2\2\2\u0b19\u0b1a\3\2\2\2\u0b1a\u0b1b\3\2\2\2\u0b1b\u0b1d\7\u0106\2"+
		"\2\u0b1c\u0b1e\7 \2\2\u0b1d\u0b1c\3\2\2\2\u0b1d\u0b1e\3\2\2\2\u0b1e\u0b1f"+
		"\3\2\2\2\u0b1f\u0b25\5\u00bc_\2\u0b20\u0b21\7\u00a0\2\2\u0b21\u0b22\7"+
		"\u0115\2\2\u0b22\u0b23\7 \2\2\u0b23\u0b25\t,\2\2\u0b24\u0b0d\3\2\2\2\u0b24"+
		"\u0b19\3\2\2\2\u0b24\u0b20\3\2\2\2\u0b25\u016b\3\2\2\2\u0b26\u0b2b\5\u016e"+
		"\u00b8\2\u0b27\u0b28\7-\2\2\u0b28\u0b2a\5\u016e\u00b8\2\u0b29\u0b27\3"+
		"\2\2\2\u0b2a\u0b2d\3\2\2\2\u0b2b\u0b29\3\2\2\2\u0b2b\u0b2c\3\2\2\2\u0b2c"+
		"\u016d\3\2\2\2\u0b2d\u0b2b\3\2\2\2\u0b2e\u0b33\5\u0170\u00b9\2\u0b2f\u0b33"+
		"\5\u017e\u00c0\2\u0b30\u0b33\5\u0188\u00c5\2\u0b31\u0b33\5\u0176\u00bc"+
		"\2\u0b32\u0b2e\3\2\2\2\u0b32\u0b2f\3\2\2\2\u0b32\u0b30\3\2\2\2\u0b32\u0b31"+
		"\3\2\2\2\u0b33\u016f\3\2\2\2\u0b34\u0b35\5\u00a2R\2\u0b35\u0b42\5\u0114"+
		"\u008b\2\u0b36\u0b38\5\u0172\u00ba\2\u0b37\u0b36\3\2\2\2\u0b38\u0b3b\3"+
		"\2\2\2\u0b39\u0b37\3\2\2\2\u0b39\u0b3a\3\2\2\2\u0b3a\u0b43\3\2\2\2\u0b3b"+
		"\u0b39\3\2\2\2\u0b3c\u0b3e\5\u017c\u00bf\2\u0b3d\u0b3c\3\2\2\2\u0b3e\u0b41"+
		"\3\2\2\2\u0b3f\u0b3d\3\2\2\2\u0b3f\u0b40\3\2\2\2\u0b40\u0b43\3\2\2\2\u0b41"+
		"\u0b3f\3\2\2\2\u0b42\u0b39\3\2\2\2\u0b42\u0b3f\3\2\2\2\u0b43\u0171\3\2"+
		"\2\2\u0b44\u0b50\5\u0174\u00bb\2\u0b45\u0b50\7\u0189\2\2\u0b46\u0b49\7"+
		"\u00a0\2\2\u0b47\u0b4a\5\u0086D\2\u0b48\u0b4a\5\u00be`\2\u0b49\u0b47\3"+
		"\2\2\2\u0b49\u0b48\3\2\2\2\u0b4a\u0b50\3\2\2\2\u0b4b\u0b4c\7\u0174\2\2"+
		"\u0b4c\u0b50\t.\2\2\u0b4d\u0b4e\7\u00da\2\2\u0b4e\u0b50\t/\2\2\u0b4f\u0b44"+
		"\3\2\2\2\u0b4f\u0b45\3\2\2\2\u0b4f\u0b46\3\2\2\2\u0b4f\u0b4b\3\2\2\2\u0b4f"+
		"\u0b4d\3\2\2\2\u0b50\u0173\3\2\2\2\u0b51\u0b60\5\u018c\u00c7\2\u0b52\u0b54"+
		"\7I\2\2\u0b53\u0b55\7K\2\2\u0b54\u0b53\3\2\2\2\u0b54\u0b55\3\2\2\2\u0b55"+
		"\u0b60\3\2\2\2\u0b56\u0b58\7q\2\2\u0b57\u0b56\3\2\2\2\u0b57\u0b58\3\2"+
		"\2\2\u0b58\u0b59\3\2\2\2\u0b59\u0b60\7r\2\2\u0b5a\u0b60\5\u011c\u008f"+
		"\2\u0b5b\u0b60\5\u0176\u00bc\2\u0b5c\u0b60\5\u0178\u00bd\2\u0b5d\u0b5e"+
		"\7\u0107\2\2\u0b5e\u0b60\7\u01dd\2\2\u0b5f\u0b51\3\2\2\2\u0b5f\u0b52\3"+
		"\2\2\2\u0b5f\u0b57\3\2\2\2\u0b5f\u0b5a\3\2\2\2\u0b5f\u0b5b\3\2\2\2\u0b5f"+
		"\u0b5c\3\2\2\2\u0b5f\u0b5d\3\2\2\2\u0b60\u0175\3\2\2\2\u0b61\u0b63\7G"+
		"\2\2\u0b62\u0b64\5\u011e\u0090\2\u0b63\u0b62\3\2\2\2\u0b63\u0b64\3\2\2"+
		"\2\u0b64\u0b66\3\2\2\2\u0b65\u0b61\3\2\2\2\u0b65\u0b66\3\2\2\2\u0b66\u0b67"+
		"\3\2\2\2\u0b67\u0b68\7\u00ee\2\2\u0b68\u0b6d\5\u00be`\2\u0b69\u0b6b\7"+
		"q\2\2\u0b6a\u0b69\3\2\2\2\u0b6a\u0b6b\3\2\2\2\u0b6b\u0b6c\3\2\2\2\u0b6c"+
		"\u0b6e\7\u0158\2\2\u0b6d\u0b6a\3\2\2\2\u0b6d\u0b6e\3\2\2\2\u0b6e\u0177"+
		"\3\2\2\2\u0b6f\u0b70\7\u00f7\2\2\u0b70\u0b71\5\u00a0Q\2\u0b71\u0b78\5"+
		"\u0182\u00c2\2\u0b72\u0b73\7\u012e\2\2\u0b73\u0b79\7_\2\2\u0b74\u0b75"+
		"\7\u012e\2\2\u0b75\u0b79\7\u0137\2\2\u0b76\u0b77\7\u012e\2\2\u0b77\u0b79"+
		"\7\u0151\2\2\u0b78\u0b72\3\2\2\2\u0b78\u0b74\3\2\2\2\u0b78\u0b76\3\2\2"+
		"\2\u0b78\u0b79\3\2\2\2\u0b79\u0b7f\3\2\2\2\u0b7a\u0b7b\7h\2\2\u0b7b\u0b7c"+
		"\t\60\2\2\u0b7c\u0b7e\5\u017a\u00be\2\u0b7d\u0b7a\3\2\2\2\u0b7e\u0b81"+
		"\3\2\2\2\u0b7f\u0b7d\3\2\2\2\u0b7f\u0b80\3\2\2\2\u0b80\u0179\3\2\2\2\u0b81"+
		"\u0b7f\3\2\2\2\u0b82\u0b8b\7\u014a\2\2\u0b83\u0b8b\7\u00ed\2\2\u0b84\u0b85"+
		"\7C\2\2\u0b85\u0b8b\7r\2\2\u0b86\u0b87\7\u00f1\2\2\u0b87\u0b8b\7\u00f8"+
		"\2\2\u0b88\u0b89\7C\2\2\u0b89\u0b8b\7\u00a0\2\2\u0b8a\u0b82\3\2\2\2\u0b8a"+
		"\u0b83\3\2\2\2\u0b8a\u0b84\3\2\2\2\u0b8a\u0b86\3\2\2\2\u0b8a\u0b88\3\2"+
		"\2\2\u0b8b\u017b\3\2\2\2\u0b8c\u0b95\5\u0174\u00bb\2\u0b8d\u0b8e\7\u00d7"+
		"\2\2\u0b8e\u0b90\7\u00ec\2\2\u0b8f\u0b8d\3\2\2\2\u0b8f\u0b90\3\2\2\2\u0b90"+
		"\u0b91\3\2\2\2\u0b91\u0b92\7g\2\2\u0b92\u0b95\5\u00be`\2\u0b93\u0b95\t"+
		"\61\2\2\u0b94\u0b8c\3\2\2\2\u0b94\u0b8f\3\2\2\2\u0b94\u0b93\3\2\2\2\u0b95"+
		"\u017d\3\2\2\2\u0b96\u0b98\t\62\2\2\u0b97\u0b96\3\2\2\2\u0b97\u0b98\3"+
		"\2\2\2\u0b98\u0b9a\3\2\2\2\u0b99\u0b9b\t\17\2\2\u0b9a\u0b99\3\2\2\2\u0b9a"+
		"\u0b9b\3\2\2\2\u0b9b\u0b9d\3\2\2\2\u0b9c\u0b9e\5\u00b8]\2\u0b9d\u0b9c"+
		"\3\2\2\2\u0b9d\u0b9e\3\2\2\2\u0b9e\u0ba0\3\2\2\2\u0b9f\u0ba1\5\u0180\u00c1"+
		"\2\u0ba0\u0b9f\3\2\2\2\u0ba0\u0ba1\3\2\2\2\u0ba1\u0ba2\3\2\2\2\u0ba2\u0ba6"+
		"\5\u0182\u00c2\2\u0ba3\u0ba5\5\u0186\u00c4\2\u0ba4\u0ba3\3\2\2\2\u0ba5"+
		"\u0ba8\3\2\2\2\u0ba6\u0ba4\3\2\2\2\u0ba6\u0ba7\3\2\2\2\u0ba7\u017f\3\2"+
		"\2\2\u0ba8\u0ba6\3\2\2\2\u0ba9\u0baa\7e\2\2\u0baa\u0bab\t\63\2\2\u0bab"+
		"\u0181\3\2\2\2\u0bac\u0bad\7\'\2\2\u0bad\u0bb2\5\u0184\u00c3\2\u0bae\u0baf"+
		"\7-\2\2\u0baf\u0bb1\5\u0184\u00c3\2\u0bb0\u0bae\3\2\2\2\u0bb1\u0bb4\3"+
		"\2\2\2\u0bb2\u0bb0\3\2\2\2\u0bb2\u0bb3\3\2\2\2\u0bb3\u0bb5\3\2\2\2\u0bb4"+
		"\u0bb2\3\2\2\2\u0bb5\u0bb6\7(\2\2\u0bb6\u0183\3\2\2\2\u0bb7\u0bbb\5\u00a2"+
		"R\2\u0bb8\u0bb9\7\'\2\2\u0bb9\u0bba\7\u01de\2\2\u0bba\u0bbc\7(\2\2\u0bbb"+
		"\u0bb8\3\2\2\2\u0bbb\u0bbc\3\2\2\2\u0bbc\u0bbf\3\2\2\2\u0bbd\u0bbf\5\u00be"+
		"`\2\u0bbe\u0bb7\3\2\2\2\u0bbe\u0bbd\3\2\2\2\u0bbf\u0bc1\3\2\2\2\u0bc0"+
		"\u0bc2\t\"\2\2\u0bc1\u0bc0\3\2\2\2\u0bc1\u0bc2\3\2\2\2\u0bc2\u0185\3\2"+
		"\2\2\u0bc3\u0bc5\7\u0179\2\2\u0bc4\u0bc6\7 \2\2\u0bc5\u0bc4\3\2\2\2\u0bc5"+
		"\u0bc6\3\2\2\2\u0bc6\u0bc7\3\2\2\2\u0bc7\u0bd0\7\u01de\2\2\u0bc8\u0bd0"+
		"\5\u0180\u00c1\2\u0bc9\u0bca\7T\2\2\u0bca\u0bcb\7\u0136\2\2\u0bcb\u0bd0"+
		"\5\u0096L\2\u0bcc\u0bcd\7\u0107\2\2\u0bcd\u0bd0\7\u01dd\2\2\u0bce\u0bd0"+
		"\t\64\2\2\u0bcf\u0bc3\3\2\2\2\u0bcf\u0bc8\3\2\2\2\u0bcf\u0bc9\3\2\2\2"+
		"\u0bcf\u0bcc\3\2\2\2\u0bcf\u0bce\3\2\2\2\u0bd0\u0187\3\2\2\2\u0bd1\u0bd3"+
		"\7G\2\2\u0bd2\u0bd4\5\u011e\u0090\2\u0bd3\u0bd2\3\2\2\2\u0bd3\u0bd4\3"+
		"\2\2\2\u0bd4\u0bd6\3\2\2\2\u0bd5\u0bd1\3\2\2\2\u0bd5\u0bd6\3\2\2\2\u0bd6"+
		"\u0bda\3\2\2\2\u0bd7\u0bdb\5\u018a\u00c6\2\u0bd8\u0bdb\5\u018e\u00c8\2"+
		"\u0bd9\u0bdb\5\u0190\u00c9\2\u0bda\u0bd7\3\2\2\2\u0bda\u0bd8\3\2\2\2\u0bda"+
		"\u0bd9\3\2\2\2\u0bdb\u0189\3\2\2\2\u0bdc\u0bde\5\u018c\u00c7\2\u0bdd\u0bdf"+
		"\5\u0180\u00c1\2\u0bde\u0bdd\3\2\2\2\u0bde\u0bdf\3\2\2\2\u0bdf\u0be0\3"+
		"\2\2\2\u0be0\u0be4\5\u00b4[\2\u0be1\u0be3\5\u0186\u00c4\2\u0be2\u0be1"+
		"\3\2\2\2\u0be3\u0be6\3\2\2\2\u0be4\u0be2\3\2\2\2\u0be4\u0be5\3\2\2\2\u0be5"+
		"\u018b\3\2\2\2\u0be6\u0be4\3\2\2\2\u0be7\u0be9\7H\2\2\u0be8\u0be7\3\2"+
		"\2\2\u0be8\u0be9\3\2\2\2\u0be9\u0bea\3\2\2\2\u0bea\u0beb\7K\2\2\u0beb"+
		"\u018d\3\2\2\2\u0bec\u0bee\7I\2\2\u0bed\u0bef\t\17\2\2\u0bee\u0bed\3\2"+
		"\2\2\u0bee\u0bef\3\2\2\2\u0bef\u0bf1\3\2\2\2\u0bf0\u0bf2\5\u00b8]\2\u0bf1"+
		"\u0bf0\3\2\2\2\u0bf1\u0bf2\3\2\2\2\u0bf2\u0bf4\3\2\2\2\u0bf3\u0bf5\5\u0180"+
		"\u00c1\2\u0bf4\u0bf3\3\2\2\2\u0bf4\u0bf5\3\2\2\2\u0bf5\u0bf6\3\2\2\2\u0bf6"+
		"\u0bfa\5\u0182\u00c2\2\u0bf7\u0bf9\5\u0186\u00c4\2\u0bf8\u0bf7\3\2\2\2"+
		"\u0bf9\u0bfc\3\2\2\2\u0bfa\u0bf8\3\2\2\2\u0bfa\u0bfb\3\2\2\2\u0bfb\u018f"+
		"\3\2\2\2\u0bfc\u0bfa\3\2\2\2\u0bfd\u0bfe\7J\2\2\u0bfe\u0c00\7K\2\2\u0bff"+
		"\u0c01\5\u00b8]\2\u0c00\u0bff\3\2\2\2\u0c00\u0c01\3\2\2\2\u0c01\u0c02"+
		"\3\2\2\2\u0c02\u0c03\5\u00b4[\2\u0c03\u0c04\5\u0178\u00bd\2\u0c04\u0191"+
		"\3\2\2\2\u0c05\u0c07\7\'\2\2\u0c06\u0c05\3\2\2\2\u0c06\u0c07\3\2\2\2\u0c07"+
		"\u0c08\3\2\2\2\u0c08\u0c09\7z\2\2\u0c09\u0c0b\5\u00a0Q\2\u0c0a\u0c0c\7"+
		"(\2\2\u0c0b\u0c0a\3\2\2\2\u0c0b\u0c0c\3\2\2\2\u0c0c\u0193\3\2\2\2\u0c0d"+
		"\u0c0f\t\65\2\2\u0c0e\u0c0d\3\2\2\2\u0c0e\u0c0f\3\2\2\2\u0c0f\u0195\3"+
		"\2\2\2\u0c10\u0c15\5\u0198\u00cd\2\u0c11\u0c12\7-\2\2\u0c12\u0c14\5\u0198"+
		"\u00cd\2\u0c13\u0c11\3\2\2\2\u0c14\u0c17\3\2\2\2\u0c15\u0c13\3\2\2\2\u0c15"+
		"\u0c16\3\2\2\2\u0c16\u0197\3\2\2\2\u0c17\u0c15\3\2\2\2\u0c18\u0cba\5\u019a"+
		"\u00ce\2\u0c19\u0cba\5\u019e\u00d0\2\u0c1a\u0cba\5\u01a2\u00d2\2\u0c1b"+
		"\u0cba\5\u01a4\u00d3\2\u0c1c\u0c1d\7B\2\2\u0c1d\u0cba\5\u0176\u00bc\2"+
		"\u0c1e\u0c1f\7=\2\2\u0c1f\u0c20\7\u00ee\2\2\u0c20\u0cba\5\u011e\u0090"+
		"\2\u0c21\u0c22\7<\2\2\u0c22\u0c23\7\u00ee\2\2\u0c23\u0c25\5\u011e\u0090"+
		"\2\u0c24\u0c26\7q\2\2\u0c25\u0c24\3\2\2\2\u0c25\u0c26\3\2\2\2\u0c26\u0c27"+
		"\3\2\2\2\u0c27\u0c28\7\u0158\2\2\u0c28\u0cba\3\2\2\2\u0c29\u0c2b\7\u00f9"+
		"\2\2\u0c2a\u0c2c\7 \2\2\u0c2b\u0c2a\3\2\2\2\u0c2b\u0c2c\3\2\2\2\u0c2c"+
		"\u0c2d\3\2\2\2\u0c2d\u0cba\t\66\2\2\u0c2e\u0c30\7<\2\2\u0c2f\u0c31\7E"+
		"\2\2\u0c30\u0c2f\3\2\2\2\u0c30\u0c31\3\2\2\2\u0c31\u0c32\3\2\2\2\u0c32"+
		"\u0c38\5\u00a2R\2\u0c33\u0c34\7C\2\2\u0c34\u0c35\7\u00a0\2\2\u0c35\u0c39"+
		"\5\u0086D\2\u0c36\u0c37\7=\2\2\u0c37\u0c39\7\u00a0\2\2\u0c38\u0c33\3\2"+
		"\2\2\u0c38\u0c36\3\2\2\2\u0c39\u0cba\3\2\2\2\u0c3a\u0c3b\7<\2\2\u0c3b"+
		"\u0c3c\7F\2\2\u0c3c\u0c3d\5\u00b8]\2\u0c3d\u0c3e\t\64\2\2\u0c3e\u0cba"+
		"\3\2\2\2\u0c3f\u0cba\5\u01a6\u00d4\2\u0c40\u0c42\7\u00a0\2\2\u0c41\u0c40"+
		"\3\2\2\2\u0c41\u0c42\3\2\2\2\u0c42\u0c43\3\2\2\2\u0c43\u0c45\5\u011a\u008e"+
		"\2\u0c44\u0c46\5\u011c\u008f\2\u0c45\u0c44\3\2\2\2\u0c45\u0c46\3\2\2\2"+
		"\u0c46\u0cba\3\2\2\2\u0c47\u0c48\7\u010d\2\2\u0c48\u0c49\7m\2\2\u0c49"+
		"\u0c4b\5\u011a\u008e\2\u0c4a\u0c4c\5\u011c\u008f\2\u0c4b\u0c4a\3\2\2\2"+
		"\u0c4b\u0c4c\3\2\2\2\u0c4c\u0cba\3\2\2\2\u0c4d\u0c4e\t\67\2\2\u0c4e\u0cba"+
		"\7\u0129\2\2\u0c4f\u0c50\t8\2\2\u0c50\u0cba\7\u00b9\2\2\u0c51\u0cba\5"+
		"\u01a8\u00d5\2\u0c52\u0cba\5\u01aa\u00d6\2\u0c53\u0cba\5\u01ac\u00d7\2"+
		"\u0c54\u0c55\7=\2\2\u0c55\u0c56\7J\2\2\u0c56\u0c57\7K\2\2\u0c57\u0cba"+
		"\5\u011e\u0090\2\u0c58\u0cba\7\u0121\2\2\u0c59\u0c5b\7\u012d\2\2\u0c5a"+
		"\u0c5c\7 \2\2\u0c5b\u0c5a\3\2\2\2\u0c5b\u0c5c\3\2\2\2\u0c5c\u0c5d\3\2"+
		"\2\2\u0c5d\u0cba\t&\2\2\u0c5e\u0cba\5\u01ae\u00d8\2\u0c5f\u0c60\7{\2\2"+
		"\u0c60\u0c61\7}\2\2\u0c61\u0cba\5\u00b4[\2\u0c62\u0cba\5\u01b0\u00d9\2"+
		"\u0c63\u0cba\5\u01b2\u00da\2\u0c64\u0cba\5\u01b4\u00db\2\u0c65\u0c66\t"+
		"9\2\2\u0c66\u0cba\7\u00e6\2\2\u0c67\u0c68\7B\2\2\u0c68\u0c69\7\u00d8\2"+
		"\2\u0c69\u0c6a\7\'\2\2\u0c6a\u0c6b\5\u01b8\u00dd\2\u0c6b\u0c6c\7(\2\2"+
		"\u0c6c\u0cba\3\2\2\2\u0c6d\u0c6e\7=\2\2\u0c6e\u0c6f\7\u00d8\2\2\u0c6f"+
		"\u0cba\5\u0120\u0091\2\u0c70\u0c71\7\u0112\2\2\u0c71\u0c74\7\u00d8\2\2"+
		"\u0c72\u0c75\5\u0120\u0091\2\u0c73\u0c75\7x\2\2\u0c74\u0c72\3\2\2\2\u0c74"+
		"\u0c73\3\2\2\2\u0c75\u0c76\3\2\2\2\u0c76\u0cba\7\u00b9\2\2\u0c77\u0c78"+
		"\7\u0127\2\2\u0c78\u0c7b\7\u00d8\2\2\u0c79\u0c7c\5\u0120\u0091\2\u0c7a"+
		"\u0c7c\7x\2\2\u0c7b\u0c79\3\2\2\2\u0c7b\u0c7a\3\2\2\2\u0c7c\u0c7d\3\2"+
		"\2\2\u0c7d\u0cba\7\u00b9\2\2\u0c7e\u0c7f\7>\2\2\u0c7f\u0c82\7\u00d8\2"+
		"\2\u0c80\u0c83\5\u0120\u0091\2\u0c81\u0c83\7x\2\2\u0c82\u0c80\3\2\2\2"+
		"\u0c82\u0c81\3\2\2\2\u0c83\u0cba\3\2\2\2\u0c84\u0c85\7\u0105\2\2\u0c85"+
		"\u0c86\7\u00d8\2\2\u0c86\u0cba\7\u01de\2\2\u0c87\u0c88\7\u0146\2\2\u0c88"+
		"\u0c89\7\u00d8\2\2\u0c89\u0c8a\5\u0120\u0091\2\u0c8a\u0c8b\7R\2\2\u0c8b"+
		"\u0c8c\5\u01b6\u00dc\2\u0c8c\u0cba\3\2\2\2\u0c8d\u0c8e\7\u011a\2\2\u0c8e"+
		"\u0c8f\7\u00d8\2\2\u0c8f\u0c90\5\u011e\u0090\2\u0c90\u0c91\7T\2\2\u0c91"+
		"\u0c92\7D\2\2\u0c92\u0c95\5\u00a0Q\2\u0c93\u0c94\t9\2\2\u0c94\u0c96\7"+
		"\u00e6\2\2\u0c95\u0c93\3\2\2\2\u0c95\u0c96\3\2\2\2\u0c96\u0cba\3\2\2\2"+
		"\u0c97\u0c98\7\u00fa\2\2\u0c98\u0c9b\7\u00d8\2\2\u0c99\u0c9c\5\u0120\u0091"+
		"\2\u0c9a\u0c9c\7x\2\2\u0c9b\u0c99\3\2\2\2\u0c9b\u0c9a\3\2\2\2\u0c9c\u0cba"+
		"\3\2\2\2\u0c9d\u0c9e\7\u00ee\2\2\u0c9e\u0ca1\7\u00d8\2\2\u0c9f\u0ca2\5"+
		"\u0120\u0091\2\u0ca0\u0ca2\7x\2\2\u0ca1\u0c9f\3\2\2\2\u0ca1\u0ca0\3\2"+
		"\2\2\u0ca2\u0cba\3\2\2\2\u0ca3\u0ca4\7\u0134\2\2\u0ca4\u0ca7\7\u00d8\2"+
		"\2\u0ca5\u0ca8\5\u0120\u0091\2\u0ca6\u0ca8\7x\2\2\u0ca7\u0ca5\3\2\2\2"+
		"\u0ca7\u0ca6\3\2\2\2\u0ca8\u0cba\3\2\2\2\u0ca9\u0caa\7\u013f\2\2\u0caa"+
		"\u0cad\7\u00d8\2\2\u0cab\u0cae\5\u0120\u0091\2\u0cac\u0cae\7x\2\2\u0cad"+
		"\u0cab\3\2\2\2\u0cad\u0cac\3\2\2\2\u0cae\u0cba\3\2\2\2\u0caf\u0cb0\7\u0147"+
		"\2\2\u0cb0\u0cb3\7\u00d8\2\2\u0cb1\u0cb4\5\u0120\u0091\2\u0cb2\u0cb4\7"+
		"x\2\2\u0cb3\u0cb1\3\2\2\2\u0cb3\u0cb2\3\2\2\2\u0cb4\u0cba\3\2\2\2\u0cb5"+
		"\u0cb6\7\u0144\2\2\u0cb6\u0cba\7\u0138\2\2\u0cb7\u0cb8\7\u00e4\2\2\u0cb8"+
		"\u0cba\7\u0138\2\2\u0cb9\u0c18\3\2\2\2\u0cb9\u0c19\3\2\2\2\u0cb9\u0c1a"+
		"\3\2\2\2\u0cb9\u0c1b\3\2\2\2\u0cb9\u0c1c\3\2\2\2\u0cb9\u0c1e\3\2\2\2\u0cb9"+
		"\u0c21\3\2\2\2\u0cb9\u0c29\3\2\2\2\u0cb9\u0c2e\3\2\2\2\u0cb9\u0c3a\3\2"+
		"\2\2\u0cb9\u0c3f\3\2\2\2\u0cb9\u0c41\3\2\2\2\u0cb9\u0c47\3\2\2\2\u0cb9"+
		"\u0c4d\3\2\2\2\u0cb9\u0c4f\3\2\2\2\u0cb9\u0c51\3\2\2\2\u0cb9\u0c52\3\2"+
		"\2\2\u0cb9\u0c53\3\2\2\2\u0cb9\u0c54\3\2\2\2\u0cb9\u0c58\3\2\2\2\u0cb9"+
		"\u0c59\3\2\2\2\u0cb9\u0c5e\3\2\2\2\u0cb9\u0c5f\3\2\2\2\u0cb9\u0c62\3\2"+
		"\2\2\u0cb9\u0c63\3\2\2\2\u0cb9\u0c64\3\2\2\2\u0cb9\u0c65\3\2\2\2\u0cb9"+
		"\u0c67\3\2\2\2\u0cb9\u0c6d\3\2\2\2\u0cb9\u0c70\3\2\2\2\u0cb9\u0c77\3\2"+
		"\2\2\u0cb9\u0c7e\3\2\2\2\u0cb9\u0c84\3\2\2\2\u0cb9\u0c87\3\2\2\2\u0cb9"+
		"\u0c8d\3\2\2\2\u0cb9\u0c97\3\2\2\2\u0cb9\u0c9d\3\2\2\2\u0cb9\u0ca3\3\2"+
		"\2\2\u0cb9\u0ca9\3\2\2\2\u0cb9\u0caf\3\2\2\2\u0cb9\u0cb5\3\2\2\2\u0cb9"+
		"\u0cb7\3\2\2\2\u0cba\u0199\3\2\2\2\u0cbb\u0cc2\5\u019c\u00cf\2\u0cbc\u0cbe"+
		"\7-\2\2\u0cbd\u0cbc\3\2\2\2\u0cbd\u0cbe\3\2\2\2\u0cbe\u0cbf\3\2\2\2\u0cbf"+
		"\u0cc1\5\u019c\u00cf\2\u0cc0\u0cbd\3\2\2\2\u0cc1\u0cc4\3\2\2\2\u0cc2\u0cc0"+
		"\3\2\2\2\u0cc2\u0cc3\3\2\2\2\u0cc3\u019b\3\2\2\2\u0cc4\u0cc2\3\2\2\2\u0cc5"+
		"\u0cc7\7\u0189\2\2\u0cc6\u0cc8\7 \2\2\u0cc7\u0cc6\3\2\2\2\u0cc7\u0cc8"+
		"\3\2\2\2\u0cc8\u0cc9\3\2\2\2\u0cc9\u0d47\7\u01de\2\2\u0cca\u0ccc\7\u018a"+
		"\2\2\u0ccb\u0ccd\7 \2\2\u0ccc\u0ccb\3\2\2\2\u0ccc\u0ccd\3\2\2\2\u0ccd"+
		"\u0cce\3\2\2\2\u0cce\u0d47\7\u01de\2\2\u0ccf\u0cd1\7\u00a0\2\2\u0cd0\u0ccf"+
		"\3\2\2\2\u0cd0\u0cd1\3\2\2\2\u0cd1\u0cd4\3\2\2\2\u0cd2\u0cd5\5\u011a\u008e"+
		"\2\u0cd3\u0cd5\5\u011c\u008f\2\u0cd4\u0cd2\3\2\2\2\u0cd4\u0cd3\3\2\2\2"+
		"\u0cd5\u0d47\3\2\2\2\u0cd6\u0cd8\7\u0102\2\2\u0cd7\u0cd9\7 \2\2\u0cd8"+
		"\u0cd7\3\2\2\2\u0cd8\u0cd9\3\2\2\2\u0cd9\u0cda\3\2\2\2\u0cda\u0d47\7\u01de"+
		"\2\2\u0cdb\u0cdd\7\u0107\2\2\u0cdc\u0cde\7 \2\2\u0cdd\u0cdc\3\2\2\2\u0cdd"+
		"\u0cde\3\2\2\2\u0cde\u0cdf\3\2\2\2\u0cdf\u0d47\7\u01dd\2\2\u0ce0\u0ce2"+
		"\7\u010a\2\2\u0ce1\u0ce3\7 \2\2\u0ce2\u0ce1\3\2\2\2\u0ce2\u0ce3\3\2\2"+
		"\2\u0ce3\u0ce4\3\2\2\2\u0ce4\u0d47\7\u01dd\2\2\u0ce5\u0ce7\7\u010b\2\2"+
		"\u0ce6\u0ce8\7 \2\2\u0ce7\u0ce6\3\2\2\2\u0ce7\u0ce8\3\2\2\2\u0ce8\u0ce9"+
		"\3\2\2\2\u0ce9\u0d47\7\u01dd\2\2\u0cea\u0ceb\t:\2\2\u0ceb\u0ced\7\u0111"+
		"\2\2\u0cec\u0cee\7 \2\2\u0ced\u0cec\3\2\2\2\u0ced\u0cee\3\2\2\2\u0cee"+
		"\u0cef\3\2\2\2\u0cef\u0d47\7\u01dd\2\2\u0cf0\u0cf2\7\u018c\2\2\u0cf1\u0cf3"+
		"\7 \2\2\u0cf2\u0cf1\3\2\2\2\u0cf2\u0cf3\3\2\2\2\u0cf3\u0cf4\3\2\2\2\u0cf4"+
		"\u0d47\7\u01de\2\2\u0cf5\u0cf7\7\u0115\2\2\u0cf6\u0cf8\7 \2\2\u0cf7\u0cf6"+
		"\3\2\2\2\u0cf7\u0cf8\3\2\2\2\u0cf8\u0cf9\3\2\2\2\u0cf9\u0d47\7\u01dd\2"+
		"\2\u0cfa\u0cfc\7\u0117\2\2\u0cfb\u0cfd\7 \2\2\u0cfc\u0cfb\3\2\2\2\u0cfc"+
		"\u0cfd\3\2\2\2\u0cfd\u0cfe\3\2\2\2\u0cfe\u0d47\5\u011e\u0090\2\u0cff\u0d01"+
		"\7\u0178\2\2\u0d00\u0d02\7 \2\2\u0d01\u0d00\3\2\2\2\u0d01\u0d02\3\2\2"+
		"\2\u0d02\u0d03\3\2\2\2\u0d03\u0d47\t;\2\2\u0d04\u0d06\7\u0179\2\2\u0d05"+
		"\u0d07\7 \2\2\u0d06\u0d05\3\2\2\2\u0d06\u0d07\3\2\2\2\u0d07\u0d08\3\2"+
		"\2\2\u0d08\u0d47\7\u01de\2\2\u0d09\u0d0b\7\u0160\2\2\u0d0a\u0d0c\7 \2"+
		"\2\u0d0b\u0d0a\3\2\2\2\u0d0b\u0d0c\3\2\2\2\u0d0c\u0d0d\3\2\2\2\u0d0d\u0d47"+
		"\7\u01de\2\2\u0d0e\u0d10\7\u0161\2\2\u0d0f\u0d11\7 \2\2\u0d10\u0d0f\3"+
		"\2\2\2\u0d10\u0d11\3\2\2\2\u0d11\u0d12\3\2\2\2\u0d12\u0d47\7\u01de\2\2"+
		"\u0d13\u0d15\7\u017a\2\2\u0d14\u0d16\7 \2\2\u0d15\u0d14\3\2\2\2\u0d15"+
		"\u0d16\3\2\2\2\u0d16\u0d17\3\2\2\2\u0d17\u0d47\t<\2\2\u0d18\u0d1a\7\u00f3"+
		"\2\2\u0d19\u0d1b\7 \2\2\u0d1a\u0d19\3\2\2\2\u0d1a\u0d1b\3\2\2\2\u0d1b"+
		"\u0d1c\3\2\2\2\u0d1c\u0d47\7\u01dd\2\2\u0d1d\u0d1f\7\u016e\2\2\u0d1e\u0d20"+
		"\7 \2\2\u0d1f\u0d1e\3\2\2\2\u0d1f\u0d20\3\2\2\2\u0d20\u0d21\3\2\2\2\u0d21"+
		"\u0d47\t=\2\2\u0d22\u0d24\7\u016a\2\2\u0d23\u0d25\7 \2\2\u0d24\u0d23\3"+
		"\2\2\2\u0d24\u0d25\3\2\2\2\u0d25\u0d26\3\2\2\2\u0d26\u0d47\t<\2\2\u0d27"+
		"\u0d29\7\u016b\2\2\u0d28\u0d2a\7 \2\2\u0d29\u0d28\3\2\2\2\u0d29\u0d2a"+
		"\3\2\2\2\u0d2a\u0d2b\3\2\2\2\u0d2b\u0d47\t<\2\2\u0d2c\u0d2e\7\u016c\2"+
		"\2\u0d2d\u0d2f\7 \2\2\u0d2e\u0d2d\3\2\2\2\u0d2e\u0d2f\3\2\2\2\u0d2f\u0d30"+
		"\3\2\2\2\u0d30\u0d47\7\u01de\2\2\u0d31\u0d32\7\u00b9\2\2\u0d32\u0d35\5"+
		"\u011e\u0090\2\u0d33\u0d34\7\u00da\2\2\u0d34\u0d36\t/\2\2\u0d35\u0d33"+
		"\3\2\2\2\u0d35\u0d36\3\2\2\2\u0d36\u0d47\3\2\2\2\u0d37\u0d39\7U\2\2\u0d38"+
		"\u0d3a\7 \2\2\u0d39\u0d38\3\2\2\2\u0d39\u0d3a\3\2\2\2\u0d3a\u0d3b\3\2"+
		"\2\2\u0d3b\u0d3c\7\'\2\2\u0d3c\u0d41\5\u00a0Q\2\u0d3d\u0d3e\7-\2\2\u0d3e"+
		"\u0d40\5\u00a0Q\2\u0d3f\u0d3d\3\2\2\2\u0d40\u0d43\3\2\2\2\u0d41\u0d3f"+
		"\3\2\2\2\u0d41\u0d42\3\2\2\2\u0d42\u0d44\3\2\2\2\u0d43\u0d41\3\2\2\2\u0d44"+
		"\u0d45\7(\2\2\u0d45\u0d47\3\2\2\2\u0d46\u0cc5\3\2\2\2\u0d46\u0cca\3\2"+
		"\2\2\u0d46\u0cd0\3\2\2\2\u0d46\u0cd6\3\2\2\2\u0d46\u0cdb\3\2\2\2\u0d46"+
		"\u0ce0\3\2\2\2\u0d46\u0ce5\3\2\2\2\u0d46\u0cea\3\2\2\2\u0d46\u0cf0\3\2"+
		"\2\2\u0d46\u0cf5\3\2\2\2\u0d46\u0cfa\3\2\2\2\u0d46\u0cff\3\2\2\2\u0d46"+
		"\u0d04\3\2\2\2\u0d46\u0d09\3\2\2\2\u0d46\u0d0e\3\2\2\2\u0d46\u0d13\3\2"+
		"\2\2\u0d46\u0d18\3\2\2\2\u0d46\u0d1d\3\2\2\2\u0d46\u0d22\3\2\2\2\u0d46"+
		"\u0d27\3\2\2\2\u0d46\u0d2c\3\2\2\2\u0d46\u0d31\3\2\2\2\u0d46\u0d37\3\2"+
		"\2\2\u0d47\u019d\3\2\2\2\u0d48\u0d4a\7B\2\2\u0d49\u0d4b\7E\2\2\u0d4a\u0d49"+
		"\3\2\2\2\u0d4a\u0d4b\3\2\2\2\u0d4b\u0d5b\3\2\2\2\u0d4c\u0d4e\5\u0170\u00b9"+
		"\2\u0d4d\u0d4f\5\u01a0\u00d1\2\u0d4e\u0d4d\3\2\2\2\u0d4e\u0d4f\3\2\2\2"+
		"\u0d4f\u0d5c\3\2\2\2\u0d50\u0d51\7\'\2\2\u0d51\u0d56\5\u0170\u00b9\2\u0d52"+
		"\u0d53\7-\2\2\u0d53\u0d55\5\u0170\u00b9\2\u0d54\u0d52\3\2\2\2\u0d55\u0d58"+
		"\3\2\2\2\u0d56\u0d54\3\2\2\2\u0d56\u0d57\3\2\2\2\u0d57\u0d59\3\2\2\2\u0d58"+
		"\u0d56\3\2\2\2\u0d59\u0d5a\7(\2\2\u0d5a\u0d5c\3\2\2\2\u0d5b\u0d4c\3\2"+
		"\2\2\u0d5b\u0d50\3\2\2\2\u0d5c\u019f\3\2\2\2\u0d5d\u0d61\7\u00c3\2\2\u0d5e"+
		"\u0d5f\7\u00c5\2\2\u0d5f\u0d61\5\u00a2R\2\u0d60\u0d5d\3\2\2\2\u0d60\u0d5e"+
		"\3\2\2\2\u0d61\u01a1\3\2\2\2\u0d62\u0d63\7B\2\2\u0d63\u0d64\5\u017e\u00c0"+
		"\2\u0d64\u01a3\3\2\2\2\u0d65\u0d66\7B\2\2\u0d66\u0d67\5\u0188\u00c5\2"+
		"\u0d67\u01a5\3\2\2\2\u0d68\u0d6a\7\u0100\2\2\u0d69\u0d6b\7E\2\2\u0d6a"+
		"\u0d69\3\2\2\2\u0d6a\u0d6b\3\2\2\2\u0d6b\u0d6c\3\2\2\2\u0d6c\u0d6d\5\u00a2"+
		"R\2\u0d6d\u0d6f\5\u0170\u00b9\2\u0d6e\u0d70\5\u01a0\u00d1\2\u0d6f\u0d6e"+
		"\3\2\2\2\u0d6f\u0d70\3\2\2\2\u0d70\u01a7\3\2\2\2\u0d71\u0d73\7=\2\2\u0d72"+
		"\u0d74\7E\2\2\u0d73\u0d72\3\2\2\2\u0d73\u0d74\3\2\2\2\u0d74\u0d75\3\2"+
		"\2\2\u0d75\u0d76\5\u00a2R\2\u0d76\u01a9\3\2\2\2\u0d77\u0d78\7=\2\2\u0d78"+
		"\u0d79\t\17\2\2\u0d79\u0d7a\5\u00b8]\2\u0d7a\u01ab\3\2\2\2\u0d7b\u0d7c"+
		"\7=\2\2\u0d7c\u0d7d\5\u018c\u00c7\2\u0d7d\u01ad\3\2\2\2\u0d7e\u0d80\7"+
		"\u00bf\2\2\u0d7f\u0d81\7E\2\2\u0d80\u0d7f\3\2\2\2\u0d80\u0d81\3\2\2\2"+
		"\u0d81\u0d82\3\2\2\2\u0d82\u0d84\5\u0170\u00b9\2\u0d83\u0d85\5\u01a0\u00d1"+
		"\2\u0d84\u0d83\3\2\2\2\u0d84\u0d85\3\2\2\2\u0d85\u01af\3\2\2\2\u0d86\u0d87"+
		"\7\u0145\2\2\u0d87\u0d88\7E\2\2\u0d88\u0d89\5\u00a2R\2\u0d89\u0d8a\7m"+
		"\2\2\u0d8a\u0d8b\5\u00a2R\2\u0d8b\u01b1\3\2\2\2\u0d8c\u0d8d\7\u0145\2"+
		"\2\u0d8d\u0d8e\t\17\2\2\u0d8e\u0d8f\5\u00b8]\2\u0d8f\u0d90\7m\2\2\u0d90"+
		"\u0d91\5\u00b8]\2\u0d91\u01b3\3\2\2\2\u0d92\u0d94\7\u0145\2\2\u0d93\u0d95"+
		"\t>\2\2\u0d94\u0d93\3\2\2\2\u0d94\u0d95\3\2\2\2\u0d95\u0d96\3\2\2\2\u0d96"+
		"\u0d97\5\u0096L\2\u0d97\u01b5\3\2\2\2\u0d98\u0d99\7\'\2\2\u0d99\u0d9e"+
		"\5\u01b8\u00dd\2\u0d9a\u0d9b\7-\2\2\u0d9b\u0d9d\5\u01b8\u00dd\2\u0d9c"+
		"\u0d9a\3\2\2\2\u0d9d\u0da0\3\2\2\2\u0d9e\u0d9c\3\2\2\2\u0d9e\u0d9f\3\2"+
		"\2\2\u0d9f\u0da1\3\2\2\2\u0da0\u0d9e\3\2\2\2\u0da1\u0da2\7(\2\2\u0da2"+
		"\u01b7\3\2\2\2\u0da3\u0da4\7\u00d8\2\2\u0da4\u0db0\5\u0096L\2\u0da5\u0dae"+
		"\7S\2\2\u0da6\u0da7\7\u012b\2\2\u0da7\u0da8\7\u00df\2\2\u0da8\u0daf\5"+
		"\u01ba\u00de\2\u0da9\u0daa\7w\2\2\u0daa\u0dab\7\'\2\2\u0dab\u0dac\5\u01bc"+
		"\u00df\2\u0dac\u0dad\7(\2\2\u0dad\u0daf\3\2\2\2\u0dae\u0da6\3\2\2\2\u0dae"+
		"\u0da9\3\2\2\2\u0daf\u0db1\3\2\2\2\u0db0\u0da5\3\2\2\2\u0db0\u0db1\3\2"+
		"\2\2\u0db1\u0db5\3\2\2\2\u0db2\u0db4\5\u01be\u00e0\2\u0db3\u0db2\3\2\2"+
		"\2\u0db4\u0db7\3\2\2\2\u0db5\u0db3\3\2\2\2\u0db5\u0db6\3\2\2\2\u0db6\u0dc3"+
		"\3\2\2\2\u0db7\u0db5\3\2\2\2\u0db8\u0db9\7\'\2\2\u0db9\u0dbe\5\u01c0\u00e1"+
		"\2\u0dba\u0dbb\7-\2\2\u0dbb\u0dbd\5\u01c0\u00e1\2\u0dbc\u0dba\3\2\2\2"+
		"\u0dbd\u0dc0\3\2\2\2\u0dbe\u0dbc\3\2\2\2\u0dbe\u0dbf\3\2\2\2\u0dbf\u0dc1"+
		"\3\2\2\2\u0dc0\u0dbe\3\2\2\2\u0dc1\u0dc2\7(\2\2\u0dc2\u0dc4\3\2\2\2\u0dc3"+
		"\u0db8\3\2\2\2\u0dc3\u0dc4\3\2\2\2\u0dc4\u01b9\3\2\2\2\u0dc5\u0dc8\7\'"+
		"\2\2\u0dc6\u0dc9\5\u00be`\2\u0dc7\u0dc9\5\u01bc\u00df\2\u0dc8\u0dc6\3"+
		"\2\2\2\u0dc8\u0dc7\3\2\2\2\u0dc9\u0dca\3\2\2\2\u0dca\u0dcb\7(\2\2\u0dcb"+
		"\u0dce\3\2\2\2\u0dcc\u0dce\7\u00fc\2\2\u0dcd\u0dc5\3\2\2\2\u0dcd\u0dcc"+
		"\3\2\2\2\u0dce\u01bb\3\2\2\2\u0dcf\u0dd4\5\u0086D\2\u0dd0\u0dd1\7-\2\2"+
		"\u0dd1\u0dd3\5\u0086D\2\u0dd2\u0dd0\3\2\2\2\u0dd3\u0dd6\3\2\2\2\u0dd4"+
		"\u0dd2\3\2\2\2\u0dd4\u0dd5\3\2\2\2\u0dd5\u01bd\3\2\2\2\u0dd6\u0dd4\3\2"+
		"\2\2\u0dd7\u0dd9\7\u00da\2\2\u0dd8\u0dd7\3\2\2\2\u0dd8\u0dd9\3\2\2\2\u0dd9"+
		"\u0dda\3\2\2\2\u0dda\u0ddc\7\u0117\2\2\u0ddb\u0ddd\7 \2\2\u0ddc\u0ddb"+
		"\3\2\2\2\u0ddc\u0ddd\3\2\2\2\u0ddd\u0dde\3\2\2\2\u0dde\u0e00\5\u0096L"+
		"\2\u0ddf\u0de1\7\u0107\2\2\u0de0\u0de2\7 \2\2\u0de1\u0de0\3\2\2\2\u0de1"+
		"\u0de2\3\2\2\2\u0de2\u0de3\3\2\2\2\u0de3\u0e00\7\u01dd\2\2\u0de4\u0de5"+
		"\7\u010f\2\2\u0de5\u0de7\7\u0111\2\2\u0de6\u0de8\7 \2\2\u0de7\u0de6\3"+
		"\2\2\2\u0de7\u0de8\3\2\2\2\u0de8\u0de9\3\2\2\2\u0de9\u0e00\7\u01dd\2\2"+
		"\u0dea\u0deb\7F\2\2\u0deb\u0ded\7\u0111\2\2\u0dec\u0dee\7 \2\2\u0ded\u0dec"+
		"\3\2\2\2\u0ded\u0dee\3\2\2\2\u0dee\u0def\3\2\2\2\u0def\u0e00\7\u01dd\2"+
		"\2\u0df0\u0df2\7\u0160\2\2\u0df1\u0df3\7 \2\2\u0df2\u0df1\3\2\2\2\u0df2"+
		"\u0df3\3\2\2\2\u0df3\u0df4\3\2\2\2\u0df4\u0e00\7\u01de\2\2\u0df5\u0df7"+
		"\7\u0161\2\2\u0df6\u0df8\7 \2\2\u0df7\u0df6\3\2\2\2\u0df7\u0df8\3\2\2"+
		"\2\u0df8\u0df9\3\2\2\2\u0df9\u0e00\7\u01de\2\2\u0dfa\u0dfc\7\u00b9\2\2"+
		"\u0dfb\u0dfd\7 \2\2\u0dfc\u0dfb\3\2\2\2\u0dfc\u0dfd\3\2\2\2\u0dfd\u0dfe"+
		"\3\2\2\2\u0dfe\u0e00\5\u0096L\2\u0dff\u0dd8\3\2\2\2\u0dff\u0ddf\3\2\2"+
		"\2\u0dff\u0de4\3\2\2\2\u0dff\u0dea\3\2\2\2\u0dff\u0df0\3\2\2\2\u0dff\u0df5"+
		"\3\2\2\2\u0dff\u0dfa\3\2\2\2\u0e00\u01bf\3\2\2\2\u0e01\u0e02\7\u00d9\2"+
		"\2\u0e02\u0e06\5\u0096L\2\u0e03\u0e05\5\u01be\u00e0\2\u0e04\u0e03\3\2"+
		"\2\2\u0e05\u0e08\3\2\2\2\u0e06\u0e04\3\2\2\2\u0e06\u0e07\3\2\2\2\u0e07"+
		"\u01c1\3\2\2\2\u0e08\u0e06\3\2\2\2\u0e09\u0e0b\7\u00de\2\2\u0e0a\u0e09"+
		"\3\2\2\2\u0e0a\u0e0b\3\2\2\2\u0e0b\u01c3\3\2\2\2\u0e0c\u0e0d\7i\2\2\u0e0d"+
		"\u0e0f\7u\2\2\u0e0e\u0e0c\3\2\2\2\u0e0e\u0e0f\3\2\2\2\u0e0f\u01c5\3\2"+
		"\2\2\u0e10\u0e11\t?\2\2\u0e11\u01c7\3\2\2\2\u0e12\u0e13\7\u00a8\2\2\u0e13"+
		"\u0e1a\7 \2\2\u0e14\u0e1b\5\u00a4S\2\u0e15\u0e18\7\u00a9\2\2\u0e16\u0e17"+
		"\7\'\2\2\u0e17\u0e19\7(\2\2\u0e18\u0e16\3\2\2\2\u0e18\u0e19\3\2\2\2\u0e19"+
		"\u0e1b\3\2\2\2\u0e1a\u0e14\3\2\2\2\u0e1a\u0e15\3\2\2\2\u0e1b\u01c9\3\2"+
		"\2\2\u0e1c\u0e1d\7\62\2\2\u0e1d\u0e22\5\u01cc\u00e7\2\u0e1e\u0e1f\7\27"+
		"\2\2\u0e1f\u0e21\5\u010c\u0087\2\u0e20\u0e1e\3\2\2\2\u0e21\u0e24\3\2\2"+
		"\2\u0e22\u0e20\3\2\2\2\u0e22\u0e23\3\2\2\2\u0e23\u0e3e\3\2\2\2\u0e24\u0e22"+
		"\3\2\2\2\u0e25\u0e26\7\u01a3\2\2\u0e26\u0e30\5\u010c\u0087\2\u0e27\u0e28"+
		"\7\u01a4\2\2\u0e28\u0e2d\5\u01cc\u00e7\2\u0e29\u0e2a\7\27\2\2\u0e2a\u0e2c"+
		"\5\u010c\u0087\2\u0e2b\u0e29\3\2\2\2\u0e2c\u0e2f\3\2\2\2\u0e2d\u0e2b\3"+
		"\2\2\2\u0e2d\u0e2e\3\2\2\2\u0e2e\u0e31\3\2\2\2\u0e2f\u0e2d\3\2\2\2\u0e30"+
		"\u0e27\3\2\2\2\u0e30\u0e31\3\2\2\2\u0e31\u0e3b\3\2\2\2\u0e32\u0e33\7\u01a5"+
		"\2\2\u0e33\u0e38\5\u01cc\u00e7\2\u0e34\u0e35\7\27\2\2\u0e35\u0e37\5\u010c"+
		"\u0087\2\u0e36\u0e34\3\2\2\2\u0e37\u0e3a\3\2\2\2\u0e38\u0e36\3\2\2\2\u0e38"+
		"\u0e39\3\2\2\2\u0e39\u0e3c\3\2\2\2\u0e3a\u0e38\3\2\2\2\u0e3b\u0e32\3\2"+
		"\2\2\u0e3b\u0e3c\3\2\2\2\u0e3c\u0e3e\3\2\2\2\u0e3d\u0e1c\3\2\2\2\u0e3d"+
		"\u0e25\3\2\2\2\u0e3e\u01cb\3\2\2\2\u0e3f\u0e44\7\u0190\2\2\u0e40\u0e44"+
		"\5\u0088E\2\u0e41\u0e44\5\u008aF\2\u0e42\u0e44\5\u00be`\2\u0e43\u0e3f"+
		"\3\2\2\2\u0e43\u0e40\3\2\2\2\u0e43\u0e41\3\2\2\2\u0e43\u0e42\3\2\2\2\u0e44"+
		"\u01cd\3\2\2\2\u0e45\u0e46\7\7\2\2\u0e46\u01cf\3\2\2\2\u0e47\u0e48\7\u01a6"+
		"\2\2\u0e48\u0e56\7\u01dd\2\2\u0e49\u0e4a\7\u00b6\2\2\u0e4a\u0e56\7\u01dd"+
		"\2\2\u0e4b\u0e4c\7\u00ce\2\2\u0e4c\u0e56\7\u01dd\2\2\u0e4d\u0e4e\7\u00f3"+
		"\2\2\u0e4e\u0e56\7\u01dd\2\2\u0e4f\u0e50\7\u01a7\2\2\u0e50\u0e56\7\u01dd"+
		"\2\2\u0e51\u0e52\7\u01ac\2\2\u0e52\u0e56\7\u01dd\2\2\u0e53\u0e54\7\u01a8"+
		"\2\2\u0e54\u0e56\5\u008aF\2\u0e55\u0e47\3\2\2\2\u0e55\u0e49\3\2\2\2\u0e55"+
		"\u0e4b\3\2\2\2\u0e55\u0e4d\3\2\2\2\u0e55\u0e4f\3\2\2\2\u0e55\u0e51\3\2"+
		"\2\2\u0e55\u0e53\3\2\2\2\u0e56\u01d1\3\2\2\2\u0e57\u0e58\7\u0107\2\2\u0e58"+
		"\u0e6f\7\u01dd\2\2\u0e59\u0e5a\7\u015a\2\2\u0e5a\u0e6f\7\u00aa\2\2\u0e5b"+
		"\u0e5d\7q\2\2\u0e5c\u0e5b\3\2\2\2\u0e5c\u0e5d\3\2\2\2\u0e5d\u0e5e\3\2"+
		"\2\2\u0e5e\u0e6f\7\u01ad\2\2\u0e5f\u0e60\7\u01af\2\2\u0e60\u0e6a\7\u00aa"+
		"\2\2\u0e61\u0e62\7\u00f1\2\2\u0e62\u0e6a\7\u00aa\2\2\u0e63\u0e64\7\u01b0"+
		"\2\2\u0e64\u0e65\7\u00aa\2\2\u0e65\u0e6a\7\u010f\2\2\u0e66\u0e67\7\u01b1"+
		"\2\2\u0e67\u0e68\7\u00aa\2\2\u0e68\u0e6a\7\u010f\2\2\u0e69\u0e5f\3\2\2"+
		"\2\u0e69\u0e61\3\2\2\2\u0e69\u0e63\3\2\2\2\u0e69\u0e66\3\2\2\2\u0e6a\u0e6f"+
		"\3\2\2\2\u0e6b\u0e6c\7\u00aa\2\2\u0e6c\u0e6d\7\u01b2\2\2\u0e6d\u0e6f\t"+
		")\2\2\u0e6e\u0e57\3\2\2\2\u0e6e\u0e59\3\2\2\2\u0e6e\u0e5c\3\2\2\2\u0e6e"+
		"\u0e69\3\2\2\2\u0e6e\u0e6b\3\2\2\2\u0e6f\u01d3\3\2\2\2\u0e70\u0e71\t@"+
		"\2\2\u0e71\u0e72\5\u0096L\2\u0e72\u0e73\5\u0114\u008b\2\u0e73\u01d5\3"+
		"\2\2\2\u0e74\u0e75\5\u008aF\2\u0e75\u0e76\tA\2\2\u0e76\u0e79\3\2\2\2\u0e77"+
		"\u0e79\5\u008aF\2\u0e78\u0e74\3\2\2\2\u0e78\u0e77\3\2\2\2\u0e79\u01d7"+
		"\3\2\2\2\u0e7a\u0e7c\7C\2\2\u0e7b\u0e7d\5\u009aN\2\u0e7c\u0e7b\3\2\2\2"+
		"\u0e7c\u0e7d\3\2\2\2\u0e7d\u0e7e\3\2\2\2\u0e7e\u0e7f\7\u00d1\2\2\u0e7f"+
		"\u01d9\3\2\2\2\u0e80\u0e82\7C\2\2\u0e81\u0e83\5\u009aN\2\u0e82\u0e81\3"+
		"\2\2\2\u0e82\u0e83\3\2\2\2\u0e83\u0e84\3\2\2\2\u0e84\u0e85\7\u00fb\2\2"+
		"\u0e85\u0e86\7 \2\2\u0e86\u0e87\5\u01dc\u00ef\2\u0e87\u01db\3\2\2\2\u0e88"+
		"\u0e89\tB\2\2\u0e89\u01dd\3\2\2\2\u0e8a\u0e8e\7\u0083\2\2\u0e8b\u0e8c"+
		"\7\u00d0\2\2\u0e8c\u0e8e\7\u00d1\2\2\u0e8d\u0e8a\3\2\2\2\u0e8d\u0e8b\3"+
		"\2\2\2\u0e8e\u01df\3\2\2\2\u0e8f\u0e90\7\u0084\2\2\u0e90\u01e1\3\2\2\2"+
		"\u0e91\u0e92\7\u0085\2\2\u0e92\u01e3\3\2\2\2\u0e93\u0e94\7\u0086\2\2\u0e94"+
		"\u01e5\3\2\2\2\u0e95\u0e99\7@\2\2\u0e96\u0e9a\5\u01ea\u00f6\2\u0e97\u0e9a"+
		"\5\u01ec\u00f7\2\u0e98\u0e9a\5\u01ee\u00f8\2\u0e99\u0e96\3\2\2\2\u0e99"+
		"\u0e97\3\2\2\2\u0e99\u0e98\3\2\2\2\u0e9a\u01e7\3\2\2\2\u0e9b\u0ea0\7A"+
		"\2\2\u0e9c\u0ea1\5\u01ea\u00f6\2\u0e9d\u0ea1\5\u01ec\u00f7\2\u0e9e\u0ea1"+
		"\5\u01f0\u00f9\2\u0e9f\u0ea1\5\u01ee\u00f8\2\u0ea0\u0e9c\3\2\2\2\u0ea0"+
		"\u0e9d\3\2\2\2\u0ea0\u0e9e\3\2\2\2\u0ea0\u0e9f\3\2\2\2\u0ea1\u01e9\3\2"+
		"\2\2\u0ea2\u0ea3\7\u013c\2\2\u0ea3\u0ea4\7h\2\2\u0ea4\u01eb\3\2\2\2\u0ea5"+
		"\u0ea6\5\u01f2\u00fa\2\u0ea6\u0ea7\7h\2\2\u0ea7\u0ea8\5\u01f6\u00fc\2"+
		"\u0ea8\u01ed\3\2\2\2\u0ea9\u0eaa\5\u0120\u0091\2\u0eaa\u01ef\3\2\2\2\u0eab"+
		"\u0ead\7x\2\2\u0eac\u0eae\7\u00f4\2\2\u0ead\u0eac\3\2\2\2\u0ead\u0eae"+
		"\3\2\2\2\u0eae\u0eaf\3\2\2\2\u0eaf\u0eb0\7-\2\2\u0eb0\u0eb1\7@\2\2\u0eb1"+
		"\u0eb2\7\u00f2\2\2\u0eb2\u01f1\3\2\2\2\u0eb3\u0eb5\5\u01f4\u00fb\2\u0eb4"+
		"\u0eb6\5\u00b4[\2\u0eb5\u0eb4\3\2\2\2\u0eb5\u0eb6\3\2\2\2\u0eb6\u0ebe"+
		"\3\2\2\2\u0eb7\u0eb8\7-\2\2\u0eb8\u0eba\5\u01f4\u00fb\2\u0eb9\u0ebb\5"+
		"\u00b4[\2\u0eba\u0eb9\3\2\2\2\u0eba\u0ebb\3\2\2\2\u0ebb\u0ebd\3\2\2\2"+
		"\u0ebc\u0eb7\3\2\2\2\u0ebd\u0ec0\3\2\2\2\u0ebe\u0ebc\3\2\2\2\u0ebe\u0ebf"+
		"\3\2\2\2\u0ebf\u01f3\3\2\2\2\u0ec0\u0ebe\3\2\2\2\u0ec1\u0ec3\7x\2\2\u0ec2"+
		"\u0ec4\7\u00f4\2\2\u0ec3\u0ec2\3\2\2\2\u0ec3\u0ec4\3\2\2\2\u0ec4\u0eff"+
		"\3\2\2\2\u0ec5\u0ec7\7<\2\2\u0ec6\u0ec8\7\u014c\2\2\u0ec7\u0ec6\3\2\2"+
		"\2\u0ec7\u0ec8\3\2\2\2\u0ec8\u0eff\3\2\2\2\u0ec9\u0eff\7;\2\2\u0eca\u0ecb"+
		"\7;\2\2\u0ecb\u0eff\7\u014c\2\2\u0ecc\u0ecd\7;\2\2\u0ecd\u0eff\7\u00b9"+
		"\2\2\u0ece\u0ecf\7;\2\2\u0ecf\u0ed0\7\u00de\2\2\u0ed0\u0eff\7\u00b8\2"+
		"\2\u0ed1\u0ed2\7;\2\2\u0ed2\u0eff\7\u00ce\2\2\u0ed3\u0ed4\7;\2\2\u0ed4"+
		"\u0eff\7Q\2\2\u0ed5\u0eff\7:\2\2\u0ed6\u0eff\7=\2\2\u0ed7\u0eff\7\u0118"+
		"\2\2\u0ed8\u0eff\7\u011c\2\2\u0ed9\u0eff\7\u011e\2\2\u0eda\u0edb\7@\2"+
		"\2\u0edb\u0eff\7\u00f2\2\2\u0edc\u0eff\7F\2\2\u0edd\u0eff\78\2\2\u0ede"+
		"\u0edf\7\u012d\2\2\u0edf\u0eff\7\u00b8\2\2\u0ee0\u0eff\7\u013b\2\2\u0ee1"+
		"\u0eff\7\u013c\2\2\u0ee2\u0eff\7\u00f7\2\2\u0ee3\u0eff\7\u0143\2\2\u0ee4"+
		"\u0ee5\7\u0148\2\2\u0ee5\u0eff\7\u0104\2\2\u0ee6\u0ee7\7\u0148\2\2\u0ee7"+
		"\u0eff\7\u0152\2\2\u0ee8\u0eff\7\67\2\2\u0ee9\u0eea\7\u00b4\2\2\u0eea"+
		"\u0eff\7\u00b5\2\2\u0eeb\u0eec\7\u00b4\2\2\u0eec\u0eff\7Q\2\2\u0eed\u0eff"+
		"\7\u0150\2\2\u0eee\u0eff\7\u00dc\2\2\u0eef\u0eff\7O\2\2\u0ef0\u0eff\7"+
		"9\2\2\u0ef1\u0eff\7\u00e5\2\2\u0ef2\u0eff\7\u0188\2\2\u0ef3\u0eff\7\u018b"+
		"\2\2\u0ef4\u0eff\7\u0175\2\2\u0ef5\u0eff\7\u018d\2\2\u0ef6\u0eff\7\u0176"+
		"\2\2\u0ef7\u0eff\7\u0177\2\2\u0ef8\u0eff\7\u0171\2\2\u0ef9\u0eff\7\u0170"+
		"\2\2\u0efa\u0eff\7\u016d\2\2\u0efb\u0eff\7\u016f\2\2\u0efc\u0eff\7\u018e"+
		"\2\2\u0efd\u0eff\7\u018f\2\2\u0efe\u0ec1\3\2\2\2\u0efe\u0ec5\3\2\2\2\u0efe"+
		"\u0ec9\3\2\2\2\u0efe\u0eca\3\2\2\2\u0efe\u0ecc\3\2\2\2\u0efe\u0ece\3\2"+
		"\2\2\u0efe\u0ed1\3\2\2\2\u0efe\u0ed3\3\2\2\2\u0efe\u0ed5\3\2\2\2\u0efe"+
		"\u0ed6\3\2\2\2\u0efe\u0ed7\3\2\2\2\u0efe\u0ed8\3\2\2\2\u0efe\u0ed9\3\2"+
		"\2\2\u0efe\u0eda\3\2\2\2\u0efe\u0edc\3\2\2\2\u0efe\u0edd\3\2\2\2\u0efe"+
		"\u0ede\3\2\2\2\u0efe\u0ee0\3\2\2\2\u0efe\u0ee1\3\2\2\2\u0efe\u0ee2\3\2"+
		"\2\2\u0efe\u0ee3\3\2\2\2\u0efe\u0ee4\3\2\2\2\u0efe\u0ee6\3\2\2\2\u0efe"+
		"\u0ee8\3\2\2\2\u0efe\u0ee9\3\2\2\2\u0efe\u0eeb\3\2\2\2\u0efe\u0eed\3\2"+
		"\2\2\u0efe\u0eee\3\2\2\2\u0efe\u0eef\3\2\2\2\u0efe\u0ef0\3\2\2\2\u0efe"+
		"\u0ef1\3\2\2\2\u0efe\u0ef2\3\2\2\2\u0efe\u0ef3\3\2\2\2\u0efe\u0ef4\3\2"+
		"\2\2\u0efe\u0ef5\3\2\2\2\u0efe\u0ef6\3\2\2\2\u0efe\u0ef7\3\2\2\2\u0efe"+
		"\u0ef8\3\2\2\2\u0efe\u0ef9\3\2\2\2\u0efe\u0efa\3\2\2\2\u0efe\u0efb\3\2"+
		"\2\2\u0efe\u0efc\3\2\2\2\u0efe\u0efd\3\2\2\2\u0eff\u01f5\3\2\2\2\u0f00"+
		"\u0f02\5\u01f8\u00fd\2\u0f01\u0f00\3\2\2\2\u0f01\u0f02\3\2\2\2\u0f02\u0f03"+
		"\3\2\2\2\u0f03\u0f04\5\u01fa\u00fe\2\u0f04\u01f7\3\2\2\2\u0f05\u0f06\t"+
		"C\2\2\u0f06\u01f9\3\2\2\2\u0f07\u0f0f\7\31\2\2\u0f08\u0f09\7\31\2\2\u0f09"+
		"\u0f0f\7\35\2\2\u0f0a\u0f0b\5\u0096L\2\u0f0b\u0f0c\7\35\2\2\u0f0c\u0f0f"+
		"\3\2\2\2\u0f0d\u0f0f\5\u00a0Q\2\u0f0e\u0f07\3\2\2\2\u0f0e\u0f08\3\2\2"+
		"\2\u0f0e\u0f0a\3\2\2\2\u0f0e\u0f0d\3\2\2\2\u0f0f\u01fb\3\2\2\2\u0f10\u0f11"+
		"\7;\2\2\u0f11\u0f12\7\u00ce\2\2\u0f12\u01fd\3\2\2\2\u0f13\u0f14\7=\2\2"+
		"\u0f14\u0f15\7\u00ce\2\2\u0f15\u01ff\3\2\2\2\u0f16\u0f17\7<\2\2\u0f17"+
		"\u0f18\7\u00ce\2\2\u0f18\u0201\3\2\2\2\u0f19\u0f1a\7\u0145\2\2\u0f1a\u0f1b"+
		"\7\u00ce\2\2\u0f1b\u0203\3\2\2\2\u0f1c\u0f1d\7;\2\2\u0f1d\u0f1e\7\u00cf"+
		"\2\2\u0f1e\u0205\3\2\2\2\u0f1f\u0f20\7=\2\2\u0f20\u0f21\7\u00cf\2\2\u0f21"+
		"\u0207\3\2\2\2\u0f22\u0f24\7C\2\2\u0f23\u0f25\7\u00a0\2\2\u0f24\u0f23"+
		"\3\2\2\2\u0f24\u0f25\3\2\2\2\u0f25\u0f26\3\2\2\2\u0f26\u0f27\7\u00cf\2"+
		"\2\u0f27\u0209\3\2\2\2\u0f28\u0f29\7C\2\2\u0f29\u0f2a\7\u00f3\2\2\u0f2a"+
		"\u020b\3\2\2\2\u0f2b\u0f2c\7\u00b2\2\2\u0f2c\u0f2d\5\u009eP\2\u0f2d\u020d"+
		"\3\2\2\2\u0f2e\u0f2f\tD\2\2\u0f2f\u0f30\5\u00a0Q\2\u0f30\u020f\3\2\2\2"+
		"\u0f31\u0f32\7\u00b4\2\2\u0f32\u0f35\tE\2\2\u0f33\u0f36\5\u0222\u0112"+
		"\2\u0f34\u0f36\5\u0224\u0113\2\u0f35\u0f33\3\2\2\2\u0f35\u0f34\3\2\2\2"+
		"\u0f35\u0f36\3\2\2\2\u0f36\u0211\3\2\2\2\u0f37\u0f39\7\u00b4\2\2\u0f38"+
		"\u0f3a\7\u015d\2\2\u0f39\u0f38\3\2\2\2\u0f39\u0f3a\3\2\2\2\u0f3a\u0f3c"+
		"\3\2\2\2\u0f3b\u0f3d\7_\2\2\u0f3c\u0f3b\3\2\2\2\u0f3c\u0f3d\3\2\2\2\u0f3d"+
		"\u0f3e\3\2\2\2\u0f3e\u0f40\7\u00b8\2\2\u0f3f\u0f41\5\u021e\u0110\2\u0f40"+
		"\u0f3f\3\2\2\2\u0f40\u0f41\3\2\2\2\u0f41\u0f44\3\2\2\2\u0f42\u0f45\5\u0222"+
		"\u0112\2\u0f43\u0f45\5\u0224\u0113\2\u0f44\u0f42\3\2\2\2\u0f44\u0f43\3"+
		"\2\2\2\u0f44\u0f45\3\2\2\2\u0f45\u0213\3\2\2\2\u0f46\u0f47\7\u00b4\2\2"+
		"\u0f47\u0f48\7D\2\2\u0f48\u0f4a\7\u00bd\2\2\u0f49\u0f4b\5\u021e\u0110"+
		"\2\u0f4a\u0f49\3\2\2\2\u0f4a\u0f4b\3\2\2\2\u0f4b\u0f4e\3\2\2\2\u0f4c\u0f4f"+
		"\5\u0222\u0112\2\u0f4d\u0f4f\5\u0224\u0113\2\u0f4e\u0f4c\3\2\2\2\u0f4e"+
		"\u0f4d\3\2\2\2\u0f4e\u0f4f\3\2\2\2\u0f4f\u0215\3\2\2\2\u0f50\u0f52\7\u00b4"+
		"\2\2\u0f51\u0f53\7\u015d\2\2\u0f52\u0f51\3\2\2\2\u0f52\u0f53\3\2\2\2\u0f53"+
		"\u0f55\3\2\2\2\u0f54\u0f56\7_\2\2\u0f55\u0f54\3\2\2\2\u0f55\u0f56\3\2"+
		"\2\2\u0f56\u0f57\3\2\2\2\u0f57\u0f58\t\t\2\2\u0f58\u0f5a\5\u0220\u0111"+
		"\2\u0f59\u0f5b\5\u021e\u0110\2\u0f5a\u0f59\3\2\2\2\u0f5a\u0f5b\3\2\2\2"+
		"\u0f5b\u0f5e\3\2\2\2\u0f5c\u0f5f\5\u0222\u0112\2\u0f5d\u0f5f\5\u0224\u0113"+
		"\2\u0f5e\u0f5c\3\2\2\2\u0f5e\u0f5d\3\2\2\2\u0f5e\u0f5f\3\2\2\2\u0f5f\u0217"+
		"\3\2\2\2\u0f60\u0f62\7\u00b4\2\2\u0f61\u0f63\7\u015d\2\2\u0f62\u0f61\3"+
		"\2\2\2\u0f62\u0f63\3\2\2\2\u0f63\u0f64\3\2\2\2\u0f64\u0f65\tF\2\2\u0f65"+
		"\u0f67\5\u0220\u0111\2\u0f66\u0f68\5\u021e\u0110\2\u0f67\u0f66\3\2\2\2"+
		"\u0f67\u0f68\3\2\2\2\u0f68\u0f6a\3\2\2\2\u0f69\u0f6b\5\u0224\u0113\2\u0f6a"+
		"\u0f69\3\2\2\2\u0f6a\u0f6b\3\2\2\2\u0f6b\u0219\3\2\2\2\u0f6c\u0f6d\7\u00b4"+
		"\2\2\u0f6d\u0f6e\7;\2\2\u0f6e\u0f6f\7D\2\2\u0f6f\u0f70\5\u00a0Q\2\u0f70"+
		"\u021b\3\2\2\2\u0f71\u0f72\7\u00b4\2\2\u0f72\u021d\3\2\2\2\u0f73\u0f74"+
		"\tG\2\2\u0f74\u0f75\5\u009eP\2\u0f75\u021f\3\2\2\2\u0f76\u0f77\tG\2\2"+
		"\u0f77\u0f78\5\u00a0Q\2\u0f78\u0221\3\2\2\2\u0f79\u0f7a\7z\2\2\u0f7a\u0f7b"+
		"\5\u0088E\2\u0f7b\u0223\3\2\2\2\u0f7c\u0f7d\7f\2\2\u0f7d\u0f7e\5\u00be"+
		"`\2\u0f7e\u0225\3\2\2\2\u0f7f\u0f81\7C\2\2\u0f80\u0f82\5\u0098M\2\u0f81"+
		"\u0f80\3\2\2\2\u0f81\u0f82\3\2\2\2\u0f82\u0227\3\2\2\2\u0f83\u0f84\7\u00a4"+
		"\2\2\u0f84\u0229\3\2\2\2\u021b\u0250\u0253\u0258\u025c\u0261\u0264\u0267"+
		"\u026a\u026d\u0275\u0279\u0286\u028b\u028e\u0292\u0297\u02a0\u02a3\u02a6"+
		"\u02a9\u02ac\u02b1\u02b4\u02b8\u02c0\u02c9\u02d0\u02d5\u02de\u02e1\u02e4"+
		"\u02e7\u02ea\u02ef\u02f2\u02f5\u0300\u0304\u0309\u030d\u0311\u031a\u031d"+
		"\u0323\u0329\u032f\u0332\u033e\u0342\u0346\u034e\u0352\u035e\u0363\u0366"+
		"\u036b\u0377\u037c\u0381\u0387\u0389\u038f\u0391\u0397\u039f\u03a4\u03a7"+
		"\u03ac\u03af\u03b4\u03bc\u03c4\u03ca\u03d2\u03d7\u03da\u03de\u03e5\u03ea"+
		"\u03f2\u03f7\u03fe\u0403\u0406\u0409\u040c\u040f\u0412\u0415\u0418\u041b"+
		"\u0425\u042b\u0431\u0436\u0439\u043c\u043f\u0443\u0452\u045b\u0462\u0468"+
		"\u046b\u046f\u0472\u0475\u0478\u047c\u0482\u048b\u0495\u04a0\u04a2\u04aa"+
		"\u04b0\u04b4\u04b8\u04bc\u04c6\u04ca\u04d0\u04dc\u04e1\u04ea\u04f1\u04f5"+
		"\u04f9\u0501\u050e\u0511\u0519\u051f\u0527\u052f\u053b\u0541\u0543\u0549"+
		"\u054b\u054d\u0555\u0560\u0563\u0567\u056a\u0575\u0578\u057c\u057f\u0583"+
		"\u058b\u058e\u0591\u0594\u0597\u05a0\u05a9\u05b0\u05ba\u05c2\u05c6\u05ca"+
		"\u05d0\u05d3\u05d9\u05dc\u05e3\u05ea\u05ee\u05f1\u05f8\u05fc\u060d\u0616"+
		"\u0618\u0625\u0634\u0636\u063d\u0644\u064d\u0654\u0662\u0668\u066c\u0672"+
		"\u06a1\u06a3\u06af\u06b7\u06bd\u06c8\u06d1\u06d3\u06d5\u06db\u06e0\u06e7"+
		"\u06eb\u06ef\u06fb\u06fe\u0701\u0704\u0707\u0710\u0716\u0724\u0737\u073c"+
		"\u0743\u0747\u074a\u074e\u0759\u0774\u0784\u0796\u079b\u07ac\u07af\u07b9"+
		"\u07bf\u07c3\u07c6\u07cf\u07d3\u07e0\u07e7\u07fa\u07fe\u0803\u0806\u081f"+
		"\u0825\u0828\u082c\u082f\u0832\u0835\u0838\u0841\u0846\u0849\u084b\u084f"+
		"\u0855\u085c\u0862\u0866\u086b\u0872\u0877\u087e\u0885\u088b\u088f\u0894"+
		"\u0897\u0899\u08a0\u08ab\u08b0\u08b4\u08b9\u08bc\u08be\u08c3\u08cc\u08d2"+
		"\u08db\u08e2\u08f8\u08fa\u08fe\u0904\u090d\u0910\u0917\u091b\u0922\u0929"+
		"\u092e\u0931\u0936\u093d\u0941\u0945\u094b\u0951\u0959\u0961\u096a\u0975"+
		"\u0981\u0987\u098d\u0994\u099f\u09a6\u09b8\u09c7\u09d0\u09d7\u09dc\u09df"+
		"\u09e4\u09ee\u09f3\u09f9\u09fd\u0a03\u0a06\u0a0b\u0a15\u0a1a\u0a20\u0a24"+
		"\u0a2a\u0a31\u0a35\u0a39\u0a43\u0a48\u0a4c\u0a4f\u0a53\u0a60\u0a63\u0a67"+
		"\u0a6a\u0a6e\u0a71\u0a75\u0a78\u0a7c\u0a7f\u0a82\u0a86\u0a89\u0a8d\u0a9a"+
		"\u0a9d\u0aa1\u0aaa\u0aad\u0ab8\u0abb\u0abf\u0ac2\u0ac6\u0ac9\u0acd\u0ad0"+
		"\u0ad3\u0ad7\u0ada\u0ade\u0aeb\u0aee\u0af1\u0af5\u0b06\u0b0d\u0b12\u0b15"+
		"\u0b19\u0b1d\u0b24\u0b2b\u0b32\u0b39\u0b3f\u0b42\u0b49\u0b4f\u0b54\u0b57"+
		"\u0b5f\u0b63\u0b65\u0b6a\u0b6d\u0b78\u0b7f\u0b8a\u0b8f\u0b94\u0b97\u0b9a"+
		"\u0b9d\u0ba0\u0ba6\u0bb2\u0bbb\u0bbe\u0bc1\u0bc5\u0bcf\u0bd3\u0bd5\u0bda"+
		"\u0bde\u0be4\u0be8\u0bee\u0bf1\u0bf4\u0bfa\u0c00\u0c06\u0c0b\u0c0e\u0c15"+
		"\u0c25\u0c2b\u0c30\u0c38\u0c41\u0c45\u0c4b\u0c5b\u0c74\u0c7b\u0c82\u0c95"+
		"\u0c9b\u0ca1\u0ca7\u0cad\u0cb3\u0cb9\u0cbd\u0cc2\u0cc7\u0ccc\u0cd0\u0cd4"+
		"\u0cd8\u0cdd\u0ce2\u0ce7\u0ced\u0cf2\u0cf7\u0cfc\u0d01\u0d06\u0d0b\u0d10"+
		"\u0d15\u0d1a\u0d1f\u0d24\u0d29\u0d2e\u0d35\u0d39\u0d41\u0d46\u0d4a\u0d4e"+
		"\u0d56\u0d5b\u0d60\u0d6a\u0d6f\u0d73\u0d80\u0d84\u0d94\u0d9e\u0dae\u0db0"+
		"\u0db5\u0dbe\u0dc3\u0dc8\u0dcd\u0dd4\u0dd8\u0ddc\u0de1\u0de7\u0ded\u0df2"+
		"\u0df7\u0dfc\u0dff\u0e06\u0e0a\u0e0e\u0e18\u0e1a\u0e22\u0e2d\u0e30\u0e38"+
		"\u0e3b\u0e3d\u0e43\u0e55\u0e5c\u0e69\u0e6e\u0e78\u0e7c\u0e82\u0e8d\u0e99"+
		"\u0ea0\u0ead\u0eb5\u0eba\u0ebe\u0ec3\u0ec7\u0efe\u0f01\u0f0e\u0f24\u0f35"+
		"\u0f39\u0f3c\u0f40\u0f44\u0f4a\u0f4e\u0f52\u0f55\u0f5a\u0f5e\u0f62\u0f67"+
		"\u0f6a\u0f81";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}