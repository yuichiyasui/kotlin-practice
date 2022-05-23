# kotlin-practice

Kotlin, Springboot の学習用プロジェクト

## 開発環境
- Kotlin
- Spring Boot
- PostgreSQL
- Docker
- TablePlus
- mybatis

## 環境構築手順
DBの起動

```
# コンテナを起動
docker-compose up -d

# コンテナに入る
docker exec -it [container_name] bash

# コンテナを停止
docker-compose down -v
```

## 開発手順
1. Issues を立てる
2. 立てた Issues を Projects に関連づける
3. Issues に関連するPRを作成する

### 運用手順

- 実装手順や設計などは wiki に記載する