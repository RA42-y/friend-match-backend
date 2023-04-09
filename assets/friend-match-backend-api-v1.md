# friend-match-backend RESTful APIs

**Description**: friend-match-backend RESTful APIs

**HOST**:localhost:8080


**Contacts**:https://github.com/RA42-y


**Version**:1.0


**URL**:/v2/api-docs?group=friend-match-backend-api-v1


[TOC]


# team-controller


## addTeam


**url**:`/api/team/add`


**method**:`POST`


**produces**:`application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "description": "",
  "expireTime": "",
  "maxNum": 0,
  "name": "",
  "password": "",
  "status": 0,
  "userId": 0
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|teamAddRequest|teamAddRequest|body|true|TeamAddRequest|TeamAddRequest|
|&emsp;&emsp;description|||false|string||
|&emsp;&emsp;expireTime|||false|string||
|&emsp;&emsp;maxNum|||false|integer||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;status|||false|integer||
|&emsp;&emsp;userId|||false|integer||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«long»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||integer(int64)|integer(int64)|
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": 0,
	"description": "",
	"message": ""
}
```


## deleteTeam


**url**:`/api/team/delete`


**method**:`POST`


**produces**:`application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "id": 0
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|deleteRequest|deleteRequest|body|true|DeleteRequest|DeleteRequest|
|&emsp;&emsp;id|||false|integer||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«boolean»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||boolean||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": true,
	"description": "",
	"message": ""
}
```


## getTeamById


**url**:`/api/team/get`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id|id|query|false|integer(int64)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«Team»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||Team|Team|
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;description||string||
|&emsp;&emsp;expireTime||string||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;maxNum||integer||
|&emsp;&emsp;name||string||
|&emsp;&emsp;password||string||
|&emsp;&emsp;status||integer||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userId||integer||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": {
		"createTime": "",
		"description": "",
		"expireTime": "",
		"id": 0,
		"isDelete": 0,
		"maxNum": 0,
		"name": "",
		"password": "",
		"status": 0,
		"updateTime": "",
		"userId": 0
	},
	"description": "",
	"message": ""
}
```


## joinTeam


**url**:`/api/team/join`


**method**:`POST`


**produces**:`application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "password": "",
  "teamId": 0
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|teamJoinRequest|teamJoinRequest|body|true|TeamJoinRequest|TeamJoinRequest|
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;teamId|||false|integer||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«boolean»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||boolean||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": true,
	"description": "",
	"message": ""
}
```


## listTeams


**url**:`/api/team/list`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|description||query|false|string||
|id||query|false|integer(int64)||
|idList||query|false|array|integer|
|maxNum||query|false|integer(int32)||
|name||query|false|string||
|pageNum||query|false|integer(int32)||
|pageSize||query|false|integer(int32)||
|searchText||query|false|string||
|status||query|false|integer(int32)||
|userId||query|false|integer(int64)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«List«TeamUserVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||array|TeamUserVO|
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;createUser||UserVO|UserVO|
|&emsp;&emsp;&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;&emsp;&emsp;createTime||string||
|&emsp;&emsp;&emsp;&emsp;email||string||
|&emsp;&emsp;&emsp;&emsp;gender||integer||
|&emsp;&emsp;&emsp;&emsp;id||integer||
|&emsp;&emsp;&emsp;&emsp;phone||string||
|&emsp;&emsp;&emsp;&emsp;tags||string||
|&emsp;&emsp;&emsp;&emsp;updateTime||string||
|&emsp;&emsp;&emsp;&emsp;userAccount||string||
|&emsp;&emsp;&emsp;&emsp;userCode||string||
|&emsp;&emsp;&emsp;&emsp;userRole||integer||
|&emsp;&emsp;&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;&emsp;&emsp;username||string||
|&emsp;&emsp;description||string||
|&emsp;&emsp;expireTime||string||
|&emsp;&emsp;hasJoin||boolean||
|&emsp;&emsp;hasJoinNum||integer||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;maxNum||integer||
|&emsp;&emsp;name||string||
|&emsp;&emsp;status||integer||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userId||integer||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": [
		{
			"createTime": "",
			"createUser": {
				"avatarUrl": "",
				"createTime": "",
				"email": "",
				"gender": 0,
				"id": 0,
				"phone": "",
				"tags": "",
				"updateTime": "",
				"userAccount": "",
				"userCode": "",
				"userRole": 0,
				"userStatus": 0,
				"username": ""
			},
			"description": "",
			"expireTime": "",
			"hasJoin": true,
			"hasJoinNum": 0,
			"id": 0,
			"maxNum": 0,
			"name": "",
			"status": 0,
			"updateTime": "",
			"userId": 0
		}
	],
	"description": "",
	"message": ""
}
```


## listMyCreateTeams


**url**:`/api/team/list/my/create`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|description||query|false|string||
|id||query|false|integer(int64)||
|idList||query|false|array|integer|
|maxNum||query|false|integer(int32)||
|name||query|false|string||
|pageNum||query|false|integer(int32)||
|pageSize||query|false|integer(int32)||
|searchText||query|false|string||
|status||query|false|integer(int32)||
|userId||query|false|integer(int64)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«List«TeamUserVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||array|TeamUserVO|
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;createUser||UserVO|UserVO|
|&emsp;&emsp;&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;&emsp;&emsp;createTime||string||
|&emsp;&emsp;&emsp;&emsp;email||string||
|&emsp;&emsp;&emsp;&emsp;gender||integer||
|&emsp;&emsp;&emsp;&emsp;id||integer||
|&emsp;&emsp;&emsp;&emsp;phone||string||
|&emsp;&emsp;&emsp;&emsp;tags||string||
|&emsp;&emsp;&emsp;&emsp;updateTime||string||
|&emsp;&emsp;&emsp;&emsp;userAccount||string||
|&emsp;&emsp;&emsp;&emsp;userCode||string||
|&emsp;&emsp;&emsp;&emsp;userRole||integer||
|&emsp;&emsp;&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;&emsp;&emsp;username||string||
|&emsp;&emsp;description||string||
|&emsp;&emsp;expireTime||string||
|&emsp;&emsp;hasJoin||boolean||
|&emsp;&emsp;hasJoinNum||integer||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;maxNum||integer||
|&emsp;&emsp;name||string||
|&emsp;&emsp;status||integer||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userId||integer||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": [
		{
			"createTime": "",
			"createUser": {
				"avatarUrl": "",
				"createTime": "",
				"email": "",
				"gender": 0,
				"id": 0,
				"phone": "",
				"tags": "",
				"updateTime": "",
				"userAccount": "",
				"userCode": "",
				"userRole": 0,
				"userStatus": 0,
				"username": ""
			},
			"description": "",
			"expireTime": "",
			"hasJoin": true,
			"hasJoinNum": 0,
			"id": 0,
			"maxNum": 0,
			"name": "",
			"status": 0,
			"updateTime": "",
			"userId": 0
		}
	],
	"description": "",
	"message": ""
}
```


## listMyJoinTeams


**url**:`/api/team/list/my/join`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|description||query|false|string||
|id||query|false|integer(int64)||
|idList||query|false|array|integer|
|maxNum||query|false|integer(int32)||
|name||query|false|string||
|pageNum||query|false|integer(int32)||
|pageSize||query|false|integer(int32)||
|searchText||query|false|string||
|status||query|false|integer(int32)||
|userId||query|false|integer(int64)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«List«TeamUserVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||array|TeamUserVO|
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;createUser||UserVO|UserVO|
|&emsp;&emsp;&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;&emsp;&emsp;createTime||string||
|&emsp;&emsp;&emsp;&emsp;email||string||
|&emsp;&emsp;&emsp;&emsp;gender||integer||
|&emsp;&emsp;&emsp;&emsp;id||integer||
|&emsp;&emsp;&emsp;&emsp;phone||string||
|&emsp;&emsp;&emsp;&emsp;tags||string||
|&emsp;&emsp;&emsp;&emsp;updateTime||string||
|&emsp;&emsp;&emsp;&emsp;userAccount||string||
|&emsp;&emsp;&emsp;&emsp;userCode||string||
|&emsp;&emsp;&emsp;&emsp;userRole||integer||
|&emsp;&emsp;&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;&emsp;&emsp;username||string||
|&emsp;&emsp;description||string||
|&emsp;&emsp;expireTime||string||
|&emsp;&emsp;hasJoin||boolean||
|&emsp;&emsp;hasJoinNum||integer||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;maxNum||integer||
|&emsp;&emsp;name||string||
|&emsp;&emsp;status||integer||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userId||integer||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": [
		{
			"createTime": "",
			"createUser": {
				"avatarUrl": "",
				"createTime": "",
				"email": "",
				"gender": 0,
				"id": 0,
				"phone": "",
				"tags": "",
				"updateTime": "",
				"userAccount": "",
				"userCode": "",
				"userRole": 0,
				"userStatus": 0,
				"username": ""
			},
			"description": "",
			"expireTime": "",
			"hasJoin": true,
			"hasJoinNum": 0,
			"id": 0,
			"maxNum": 0,
			"name": "",
			"status": 0,
			"updateTime": "",
			"userId": 0
		}
	],
	"description": "",
	"message": ""
}
```


## listTeamsByPage


**url**:`/api/team/list/page`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|description||query|false|string||
|id||query|false|integer(int64)||
|idList||query|false|array|integer|
|maxNum||query|false|integer(int32)||
|name||query|false|string||
|pageNum||query|false|integer(int32)||
|pageSize||query|false|integer(int32)||
|searchText||query|false|string||
|status||query|false|integer(int32)||
|userId||query|false|integer(int64)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«Page«Team»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||Page«Team»|Page«Team»|
|&emsp;&emsp;countId||string||
|&emsp;&emsp;current||integer||
|&emsp;&emsp;maxLimit||integer||
|&emsp;&emsp;optimizeCountSql||boolean||
|&emsp;&emsp;orders||array|OrderItem|
|&emsp;&emsp;&emsp;&emsp;asc||boolean||
|&emsp;&emsp;&emsp;&emsp;column||string||
|&emsp;&emsp;pages||integer||
|&emsp;&emsp;records||array|Team|
|&emsp;&emsp;&emsp;&emsp;createTime||string||
|&emsp;&emsp;&emsp;&emsp;description||string||
|&emsp;&emsp;&emsp;&emsp;expireTime||string||
|&emsp;&emsp;&emsp;&emsp;id||integer||
|&emsp;&emsp;&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;&emsp;&emsp;maxNum||integer||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;password||string||
|&emsp;&emsp;&emsp;&emsp;status||integer||
|&emsp;&emsp;&emsp;&emsp;updateTime||string||
|&emsp;&emsp;&emsp;&emsp;userId||integer||
|&emsp;&emsp;searchCount||boolean||
|&emsp;&emsp;size||integer||
|&emsp;&emsp;total||integer||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": {
		"countId": "",
		"current": 0,
		"maxLimit": 0,
		"optimizeCountSql": true,
		"orders": [
			{
				"asc": true,
				"column": ""
			}
		],
		"pages": 0,
		"records": [
			{
				"createTime": "",
				"description": "",
				"expireTime": "",
				"id": 0,
				"isDelete": 0,
				"maxNum": 0,
				"name": "",
				"password": "",
				"status": 0,
				"updateTime": "",
				"userId": 0
			}
		],
		"searchCount": true,
		"size": 0,
		"total": 0
	},
	"description": "",
	"message": ""
}
```


## quitTeam


**url**:`/api/team/quit`


**method**:`POST`


**produces**:`application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "teamId": 0
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|teamQuitRequest|teamQuitRequest|body|true|TeamQuitRequest|TeamQuitRequest|
|&emsp;&emsp;teamId|||false|integer||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«boolean»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||boolean||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": true,
	"description": "",
	"message": ""
}
```


## updateTeam


**url**:`/api/team/update`


**method**:`POST`


**produces**:`application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "description": "",
  "expireTime": "",
  "id": 0,
  "name": "",
  "password": "",
  "status": 0
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|teamUpdateRequest|teamUpdateRequest|body|true|TeamUpdateRequest|TeamUpdateRequest|
|&emsp;&emsp;description|||false|string||
|&emsp;&emsp;expireTime|||false|string||
|&emsp;&emsp;id|||false|integer||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;status|||false|integer||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«boolean»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||boolean||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": true,
	"description": "",
	"message": ""
}
```


# user-controller


## getCurrentUser


**url**:`/api/user/current`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


暂无


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«User»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||User|User|
|&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;email||string||
|&emsp;&emsp;gender||integer||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;phone||string||
|&emsp;&emsp;profile||string||
|&emsp;&emsp;tags||string||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userAccount||string||
|&emsp;&emsp;userCode||string||
|&emsp;&emsp;userPassword||string||
|&emsp;&emsp;userRole||integer||
|&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;username||string||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": {
		"avatarUrl": "",
		"createTime": "",
		"email": "",
		"gender": 0,
		"id": 0,
		"isDelete": 0,
		"phone": "",
		"profile": "",
		"tags": "",
		"updateTime": "",
		"userAccount": "",
		"userCode": "",
		"userPassword": "",
		"userRole": 0,
		"userStatus": 0,
		"username": ""
	},
	"description": "",
	"message": ""
}
```


## deleteUser


**url**:`/api/user/delete`


**method**:`POST`


**produces**:`application/json`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id|id|body|true|integer||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«boolean»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||boolean||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": true,
	"description": "",
	"message": ""
}
```


## userLogin


**url**:`/api/user/login`


**method**:`POST`


**produces**:`application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "userAccount": "",
  "userPassword": ""
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userLoginRequest|userLoginRequest|body|true|UserLoginRequest|UserLoginRequest|
|&emsp;&emsp;userAccount|||false|string||
|&emsp;&emsp;userPassword|||false|string||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«User»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||User|User|
|&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;email||string||
|&emsp;&emsp;gender||integer||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;phone||string||
|&emsp;&emsp;profile||string||
|&emsp;&emsp;tags||string||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userAccount||string||
|&emsp;&emsp;userCode||string||
|&emsp;&emsp;userPassword||string||
|&emsp;&emsp;userRole||integer||
|&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;username||string||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": {
		"avatarUrl": "",
		"createTime": "",
		"email": "",
		"gender": 0,
		"id": 0,
		"isDelete": 0,
		"phone": "",
		"profile": "",
		"tags": "",
		"updateTime": "",
		"userAccount": "",
		"userCode": "",
		"userPassword": "",
		"userRole": 0,
		"userStatus": 0,
		"username": ""
	},
	"description": "",
	"message": ""
}
```


## userLogout


**url**:`/api/user/logout`


**method**:`POST`


**produces**:`application/json`


**consumes**:`*/*`


**Note**:


**Params**:


暂无


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«int»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||integer(int32)|integer(int32)|
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": 0,
	"description": "",
	"message": ""
}
```


## matchUsers


**url**:`/api/user/match`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|num|num|query|false|integer(int64)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«List«User»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||array|User|
|&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;email||string||
|&emsp;&emsp;gender||integer||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;phone||string||
|&emsp;&emsp;profile||string||
|&emsp;&emsp;tags||string||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userAccount||string||
|&emsp;&emsp;userCode||string||
|&emsp;&emsp;userPassword||string||
|&emsp;&emsp;userRole||integer||
|&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;username||string||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": [
		{
			"avatarUrl": "",
			"createTime": "",
			"email": "",
			"gender": 0,
			"id": 0,
			"isDelete": 0,
			"phone": "",
			"profile": "",
			"tags": "",
			"updateTime": "",
			"userAccount": "",
			"userCode": "",
			"userPassword": "",
			"userRole": 0,
			"userStatus": 0,
			"username": ""
		}
	],
	"description": "",
	"message": ""
}
```


## recommendUsers


**url**:`/api/user/recommend`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|pageNum|pageNum|query|false|integer(int64)||
|pageSize|pageSize|query|false|integer(int64)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«Page«User»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||Page«User»|Page«User»|
|&emsp;&emsp;countId||string||
|&emsp;&emsp;current||integer||
|&emsp;&emsp;maxLimit||integer||
|&emsp;&emsp;optimizeCountSql||boolean||
|&emsp;&emsp;orders||array|OrderItem|
|&emsp;&emsp;&emsp;&emsp;asc||boolean||
|&emsp;&emsp;&emsp;&emsp;column||string||
|&emsp;&emsp;pages||integer||
|&emsp;&emsp;records||array|User|
|&emsp;&emsp;&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;&emsp;&emsp;createTime||string||
|&emsp;&emsp;&emsp;&emsp;email||string||
|&emsp;&emsp;&emsp;&emsp;gender||integer||
|&emsp;&emsp;&emsp;&emsp;id||integer||
|&emsp;&emsp;&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;&emsp;&emsp;phone||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;tags||string||
|&emsp;&emsp;&emsp;&emsp;updateTime||string||
|&emsp;&emsp;&emsp;&emsp;userAccount||string||
|&emsp;&emsp;&emsp;&emsp;userCode||string||
|&emsp;&emsp;&emsp;&emsp;userPassword||string||
|&emsp;&emsp;&emsp;&emsp;userRole||integer||
|&emsp;&emsp;&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;&emsp;&emsp;username||string||
|&emsp;&emsp;searchCount||boolean||
|&emsp;&emsp;size||integer||
|&emsp;&emsp;total||integer||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": {
		"countId": "",
		"current": 0,
		"maxLimit": 0,
		"optimizeCountSql": true,
		"orders": [
			{
				"asc": true,
				"column": ""
			}
		],
		"pages": 0,
		"records": [
			{
				"avatarUrl": "",
				"createTime": "",
				"email": "",
				"gender": 0,
				"id": 0,
				"isDelete": 0,
				"phone": "",
				"profile": "",
				"tags": "",
				"updateTime": "",
				"userAccount": "",
				"userCode": "",
				"userPassword": "",
				"userRole": 0,
				"userStatus": 0,
				"username": ""
			}
		],
		"searchCount": true,
		"size": 0,
		"total": 0
	},
	"description": "",
	"message": ""
}
```


## userRegister


**url**:`/api/user/register`


**method**:`POST`


**produces**:`application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "checkPassword": "",
  "userAccount": "",
  "userCode": "",
  "userPassword": ""
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userRegisterRequest|userRegisterRequest|body|true|UserRegisterRequest|UserRegisterRequest|
|&emsp;&emsp;checkPassword|||false|string||
|&emsp;&emsp;userAccount|||false|string||
|&emsp;&emsp;userCode|||false|string||
|&emsp;&emsp;userPassword|||false|string||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«long»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||integer(int64)|integer(int64)|
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": 0,
	"description": "",
	"message": ""
}
```


## searchUsers


**url**:`/api/user/search`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|username|username|query|false|string||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«List«User»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||array|User|
|&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;email||string||
|&emsp;&emsp;gender||integer||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;phone||string||
|&emsp;&emsp;profile||string||
|&emsp;&emsp;tags||string||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userAccount||string||
|&emsp;&emsp;userCode||string||
|&emsp;&emsp;userPassword||string||
|&emsp;&emsp;userRole||integer||
|&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;username||string||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": [
		{
			"avatarUrl": "",
			"createTime": "",
			"email": "",
			"gender": 0,
			"id": 0,
			"isDelete": 0,
			"phone": "",
			"profile": "",
			"tags": "",
			"updateTime": "",
			"userAccount": "",
			"userCode": "",
			"userPassword": "",
			"userRole": 0,
			"userStatus": 0,
			"username": ""
		}
	],
	"description": "",
	"message": ""
}
```


## searchUsersByTags


**url**:`/api/user/search/tags`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|tagNameList|tagNameList|query|false|array|string|


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«List«User»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||array|User|
|&emsp;&emsp;avatarUrl||string||
|&emsp;&emsp;createTime||string||
|&emsp;&emsp;email||string||
|&emsp;&emsp;gender||integer||
|&emsp;&emsp;id||integer||
|&emsp;&emsp;isDelete||integer||
|&emsp;&emsp;phone||string||
|&emsp;&emsp;profile||string||
|&emsp;&emsp;tags||string||
|&emsp;&emsp;updateTime||string||
|&emsp;&emsp;userAccount||string||
|&emsp;&emsp;userCode||string||
|&emsp;&emsp;userPassword||string||
|&emsp;&emsp;userRole||integer||
|&emsp;&emsp;userStatus||integer||
|&emsp;&emsp;username||string||
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": [
		{
			"avatarUrl": "",
			"createTime": "",
			"email": "",
			"gender": 0,
			"id": 0,
			"isDelete": 0,
			"phone": "",
			"profile": "",
			"tags": "",
			"updateTime": "",
			"userAccount": "",
			"userCode": "",
			"userPassword": "",
			"userRole": 0,
			"userStatus": 0,
			"username": ""
		}
	],
	"description": "",
	"message": ""
}
```


## updateUser


**url**:`/api/user/update`


**method**:`POST`


**produces**:`application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "avatarUrl": "",
  "createTime": "",
  "email": "",
  "gender": 0,
  "id": 0,
  "isDelete": 0,
  "phone": "",
  "profile": "",
  "tags": "",
  "updateTime": "",
  "userAccount": "",
  "userCode": "",
  "userPassword": "",
  "userRole": 0,
  "userStatus": 0,
  "username": ""
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|user|user|body|true|User|User|
|&emsp;&emsp;avatarUrl|||false|string||
|&emsp;&emsp;createTime|||false|string||
|&emsp;&emsp;email|||false|string||
|&emsp;&emsp;gender|||false|integer||
|&emsp;&emsp;id|||false|integer||
|&emsp;&emsp;isDelete|||false|integer||
|&emsp;&emsp;phone|||false|string||
|&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;tags|||false|string||
|&emsp;&emsp;updateTime|||false|string||
|&emsp;&emsp;userAccount|||false|string||
|&emsp;&emsp;userCode|||false|string||
|&emsp;&emsp;userPassword|||false|string||
|&emsp;&emsp;userRole|||false|integer||
|&emsp;&emsp;userStatus|||false|integer||
|&emsp;&emsp;username|||false|string||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|BaseResponse«int»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||integer(int32)|integer(int32)|
|description||string||
|message||string||


**Response Example**:
```javascript
{
	"code": 0,
	"data": 0,
	"description": "",
	"message": ""
}
```