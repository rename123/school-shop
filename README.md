# school-shop
慕课网上的校园商铺，用于练手项目

## 系统功能模块划分
### 前端展示系统
前端展示系统包含的模块如下：
* 头条展示
* 店铺类别展示
* 区域展示
* 店铺
   * 列表展示
   * 查询
   * 详情
* 商品
   * 列表展示
   * 查询
   * 详情

### 店家系统
店家系统包含的功能模块：
* Local账号维护
* 微信账号维护
* 店铺信息维护
* 权限验证
* 商品类别的维护

### 超级管理员系统
超级管理员系统包含的功能模块：
* 头条信息维护
* 店铺类别信息维护
* 区域信息维护
* 权限验证
* 店铺管理
* 用户管理

## 实体类解析
* 区域：店铺属于校园周边的哪个区域
* 用户信息
   + 微信账号
   + 本地帐号
* 头条
* 店铺类别
* 店铺
* 商品
   * 详情图片（一个商品有多个详情图片，是一对多的关系）
* 商品类别


## 各个功能模块的实现
### 店铺注册
学习目标如下：
* 连接数据库
* Mybatis数据库表映射关系映射
* dao->service->controller层代码的编写，Junit的 使用
* Session,图片处理工具Thumbnailator的使用
* suimobile前端设计与开发

店铺注册的逻辑：
* 店铺的信息插入到数据库中，返回店铺的ID
* 通过店铺的ID去创建出存储店铺图片的文件夹
* 在这个文件夹下面去存储店铺的图片
* 把文件夹的地址更新回到这条数据



