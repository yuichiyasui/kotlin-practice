# kotlin-practice

Kotlin, SpringBoot の学習用プロジェクト

## 開発環境
- Kotlin
- SpringBoot
- PostgreSQL
- Docker
- TablePlus
- mybatis

## 環境構築手順
1. DB の起動

```
# コンテナを起動
docker-compose up -d

# コンテナに入る
docker exec -it [container_name] bash

# コンテナを停止
docker-compose down -v
```

2. Gradle タスクの `flywayMigrate`を実行して DB の migration を実行

```
./gradlew flywayMigrate
```

3. SpringBoot アプリケーションを起動

## 開発手順
1. Issues を立てる
2. 立てた Issues を Projects に関連づける
3. Issues に関連する PR を作成する

### Open API
- 各エンドポイントの interface は Open API で定義する
- 定義ファイルは open-api ディレクトリに格納する
- controller の実装は Open API によって生成された interface, model を利用する

### API ドキュメントの確認
http://localhost:8080/swagger-ui/index.html

### 運用手順

- 実装手順や設計などは wiki に記載する