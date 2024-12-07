# Build Stage (Java 21を使用)
FROM gradle:8.11.1-jdk21 AS build

# 作業ディレクトリを設定
WORKDIR /app

# 必要なファイルをコピー
COPY build.gradle settings.gradle ./
COPY src ./src

# 依存関係の解決とビルド
RUN gradle build --no-daemon --refresh-dependencies --stacktrace

# Production Stage
FROM openjdk:21-jdk-slim

# 作業ディレクトリを設定
WORKDIR /app

# ビルド成果物（JARファイル）をコピー
COPY --from=build /app/build/libs/*.jar app.jar

# 実行コマンドを定義
CMD ["java", "-jar", "app.jar"]

