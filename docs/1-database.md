# 数据库

冒险岛使用 MySQL 来持久化数据。

版本：`5.7.30`

## Windows&Linux

下载传送门：https://downloads.mysql.com/archives/community/

## Docker
参考文档：https://hub.docker.com/

直接运行：

```bash
sudo docker run --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mysql:5.7.30
```
