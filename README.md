# 🎯 Projectile Quadratic Function Plugin

> 마인크래프트에서 투사체를 던지면
> 하트 파티클로 궤적을 시각화
> 이차함수 방정식을 출력

---

## 🧪 기능 소개

- 눈덩이를 던지면!
  - 투사체의 **궤적**을 따라 **하트 파티클**이 그려짐 
  - 콘솔에는 궤적을 근사한 **이차함수 방정식(y = ax² + bx + c)** 출력 

---

## 🔧 설치 방법

1. 리포지토리 클론

    ```bash
    git clone https://github.com/Marobim815/Projectile-Quadratic-Function-Plugin.git
    cd Projectile-Quadratic-Function-Plugin
    ```

2. Gradle 빌드

    ```bash
    ./gradlew build
    ```

3. 빌드 결과물(`build/libs/ProjectileQuadraticFunctionPlugin.jar`)을  
   마인크래프트 서버의 `plugins/` 폴더에 넣기

4. 서버 실행!

---

## 🚀 사용법

게임 내에서 눈덩이(Snowball)를 던지면 자동으로 실행됩니다:

- 하트 파티클이 궤적을 따라 생성됨
- 서버 콘솔에 이차함수 형태로 궤적 공식 출력됨