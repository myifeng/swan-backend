<p align="center">
  <a href="https://ant.design">
    <img width="400" src="swan-backend-logo.png">
  </a>
</p>

<h1 align="center">Swan Backend</h1>

------

<div align="center">

![GitHub repo size](https://img.shields.io/badge/Spring%20Boot-2.5.5-green.svg)
![GitHub repo size](https://img.shields.io/badge/Spring%20Cloud-2020.0.4-green.svg)

</div>

<div align="center">

![GitHub repo size](https://img.shields.io/github/repo-size/myifeng/swan-backend)
![license](https://img.shields.io/github/license/myifeng/swan-backend)
![GitHub issues](https://img.shields.io/github/issues/myifeng/swan-backend)
![GitHub closed pull requests](https://img.shields.io/github/issues-pr-closed/myifeng/swan-backend)

</div>

<div align="center">

![workflow](https://github.com/myifeng/swan-backend/actions/workflows/codeql-analysis.yml/badge.svg)
![workflow](https://github.com/myifeng/swan-backend/actions/workflows/ci-appendix.yml/badge.svg)
![workflow](https://github.com/myifeng/swan-backend/actions/workflows/ci-auth.yml/badge.svg)
![workflow](https://github.com/myifeng/swan-backend/actions/workflows/ci-config.yml/badge.svg)
![workflow](https://github.com/myifeng/swan-backend/actions/workflows/ci-eureka.yml/badge.svg)
![workflow](https://github.com/myifeng/swan-backend/actions/workflows/ci-gateway.yml/badge.svg)

</div>

🌍
*[English](README.md)*

**swan-backend**是一个基于`Spring Cloud`全家桶和`Docker容器`快速开发的一个后端微服务脚手架，
集成了配置中心、注册中心、路由网关、身份验证、上传下载等核心功能。
可以在该脚手架的基础上，快速开发出一套自己的后端微服务。

## 使用

点击右上角 `Use this template` 按钮就可以开始使用 **swan-backend**了!

项目中`swan-demo-app`作为一个业务范例模块，供参考。

## 结构

启动项目，应该首先启动配置中心 `swan-config-app` 然后启动注册中心 `swan-eureka-app`, 最后就可以启动其他模块。

代码结构如下:

```
swan-backend
├── swan-appendix-app
├── swan-auth-app
├── swan-config-app
├── swan-demo-app
├── swan-eureka-app
├── swan-gateway
├── swan-stater-auth
```

## 维护者

[@myifeng](https://github.com/myifeng).

## 贡献代码

在使用过程中遇到问题请[创建issue](https://github.com/myifeng/swan-backend/issues/new) ,也欢迎提供代码提交PR

贡献代码的规范和标准请参阅 [Contributor Covenant](http://contributor-covenant.org/version/1/3/0/).

## 贡献者

非常感谢以下所有的贡献者：

[![All contributions](https://contrib.rocks/image?repo=myifeng/swan-backend)](https://github.com/myifeng/swan-backend/graphs/contributors)

## 使用许可

[MIT](LICENSE) © myifeng