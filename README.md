# CodeSandBox
一个代码沙箱

## 公共约定
- 基础路径：`/codeSandbox`
- 内容类型：`application/json`
- 编码：`UTF-8`
- 鉴权：
- 错误：统一返回 JSON 错误结构（`code/message/path/timestamp`）
- 
## 接口

### 编译

`POST` `/compile`

### 运行

`POST` `/run`

### 删除文件

`POST` `/{sandboxId}`
