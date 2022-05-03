# kotlin-gradle-multi-project
Kotlin x SpringBootでのGradleマルチプロジェクトサンプル  
「1つのリポジトリにAPI、バッチをまとめたい」「共通処理を切り出したい」人向けの　サンプルコードとなります

## バージョン
| 名称 | バージョン |
| ---- | ---- |
| OpenJDK | 17(Amazon Corretto) |
| Kotlin | 1.6.10 |
| SpringBoot | 2.6.6 |
| Gradle | 7.0.2 |

## ディレクトリ構造
```
kotlin-gradle-multi-project
├── common
│   └── // 共通処理(UtilやComponent)を配置するためのサブプロジェクト
├── api
│   └── // SpringBootで作成したRestAPI
└── batch
    └── // SpringBootで作成したCommandLine
```

詳細は[build.gradle.kts](./build.gradle.kts)を参照してください