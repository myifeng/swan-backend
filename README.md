<p align="center">
  <a href="https://github.com/myifeng/swan-backend">
    <img width="400" src="https://raw.githubusercontent.com/myifeng/swan-backend/main/swan-backend-logo.png">
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
*[简体中文](README.zh-CN.md)*

`swan-backend` is a backend microservice scaffold based on Spring Cloud and Docker.

It includes modules such as Config Server, Service Discovery, Gateway, OAuth2...

Using `swan-backend` you can quickly develop a back-end microservice.

## Quick Start

Click the `Use this template` button to start using the **swan-backend**!

It's that easy!

## Module


You should start `swan-config-app` first, then start `swan-eureka-app`, and finally start other services.


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

## Maintainers

[@myifeng](https://github.com/myifeng).

## Contributing

Feel free to dive in! [Open an issue](https://github.com/myifeng/swan-backend/issues/new) or submit PRs.

Standard Readme follows the [Contributor Covenant](http://contributor-covenant.org/version/1/3/0/) Code of Conduct.

## Contributors

All contributions are greatly appreciated.

[![All contributions](https://contrib.rocks/image?repo=myifeng/swan-backend)](https://github.com/myifeng/swan-backend/graphs/contributors)

## License

[MIT](LICENSE) © myifeng