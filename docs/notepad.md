# 开发日记

由于事情比较多，可能忙着忙着就忘记前面开发的内容，需要做一下笔记。

## 2021.07.28

在移植 Server 时发现，其实启动过程分为以下几个步骤：

1. 加载参数，重置数据库
2. 初始化世界，开启时钟线程
3. 加载游戏数据
4. 启动服务器（登录、频道、商城）
5. 开启调度（统计、存档、时间）
6. 其他操作

因此可以简化设计为三个步骤：

1. 初始化
2. 加载
3. 启动

先移植完整的功能，之后再重新设计，优化先行，重构不间断，慢慢来，一切都刚刚好。