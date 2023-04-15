## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

---
스터디 피드백 내용

1. 접근제어자

2. CarRace, Cars
    * -> 매개변수로 넣지 말고 멤버변수 cars 사용

3. CarRace
    * MVC 패턴으로 하고 싶은데 어떻게 할지 안 그려진다 -> MVC 패턴으로 하고 싶으면 main을 컨트롤러 삼아서 view는 main에서하고 로직은 CarRace에서 하는 방법으로 
  
4. Name 유효성 검사
    * 유효성 검사를 이중으로 하게 된 이유 : 강의 피드백에서 사용 직전에 검사하는 것 고려해보라고 함. 개인적으로는 생성할 때 바로 유효성 검사하는 것이 뒷 로직까지 가지 않고 바로 검사할 수 있기 때문에 생성하는 부분에서도 필요하다고 생각. 
    * -> 지금 코드에서는 생성 후에 바로 사용하는 것이므로 값이 변경될 가능성이 없기 때문에 이중검사는 불필요 할듯
