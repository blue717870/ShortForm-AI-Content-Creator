# ShortForm AI Content Creator

스마트폰에서 AI가 자동으로 숏폼 비디오를 생성하고 게시하는 안드로이드 앱입니다.

## 🎯 기능

- **AI 스크립트 작성**: OpenAI GPT-4를 이용한 자동 시나리오 생성
- **비디오 생성**: AI를 통한 비디오 자동 제작
- **자막 생성**: 자동 자막 추가
- **자동 게시**: SNS에 자동 업로드
- **계정 관리**: 여러 계정 추가/변경 가능

## 📱 기술 스택

- **언어**: Kotlin
- **플랫폼**: Android (최소 API 28+)
- **AI API**: OpenAI GPT-4, Whisper
- **백엔드**: Firebase
- **UI Framework**: Jetpack Compose

## 🏗️ 프로젝트 구조

```
ShortForm-AI-Content-Creator/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── kotlin/com/shortform/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── ui/
│   │   │   │   ├── viewmodel/
│   │   │   │   ├── repository/
│   │   │   │   ├── api/
│   │   │   │   └── utils/
│   │   │   └── res/
│   │   └── test/
│   └── build.gradle
├── gradle/
├── settings.gradle
└── README.md
```

## 🚀 시작하기

### 필수 요구사항
- Android Studio 2023.1+
- JDK 11+
- Kotlin 1.9+

### 설치

1. 저장소 클론
```bash
git clone https://github.com/blue717870/ShortForm-AI-Content-Creator.git
cd ShortForm-AI-Content-Creator
```

2. Android Studio에서 프로젝트 열기

3. Gradle 동기화

### API 키 설정

`local.properties`에 다음 추가:
```
OPENAI_API_KEY=your_api_key
FIREBASE_CONFIG=your_firebase_config
```

## 📄 라이센스

MIT License

## 👤 작성자

blue717870