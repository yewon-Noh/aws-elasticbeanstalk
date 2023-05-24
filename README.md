# aws-elasticbeanstalk

### 사전 준비

1. AWS에서 Elastic Baenstalk 생성
2. AWS IAM 계정 생성
3. 프로젝트 생성

<br/>

### Github Actions을 통해 Elasitcbaenstalk 배포 설정

1. Aictions Secrets에 필요한 키 값을 추가합니다.
   
   - 깃 레파지토리 > Settings > Security > Actions
    <img src="https://github.com/yewon-Noh/aws-elasticbeanstalk/assets/80824750/63721882-a2ce-48cd-b606-e99643cbaf8c" width="70%">

     - `APPLICATION` : application-dev.properites 내용
     - `AWS_ACCESS_KEY_ID` : IAM 엑세스 키 ID
     - `AWS_SECRET_ACCESS_KEY` :  IAM 비밀 엑세스 키
   
2. github actions 스크립트 작성
   - 경로 : [.github/workflows/deploy.yml](https://github.com/yewon-Noh/aws-elasticbeanstalk/blob/main/.github/workflows/deploy.yml)
   - main 브랜치에 push 되면 AWS EB로 배포하는 과정을 작성한다.

3. Profile 작성
   - 경로 : [Profile](https://github.com/yewon-Noh/aws-elasticbeanstalk/blob/main/Procfile)
   - Elastic beanstalk에게 실행할 JAR 파일을 알려준다.

4. ebextensions 작성
   - config 파일을 이용해서 고급 환경 구성을 할 수 있게 해줌
   - [00-makeFiles.config](https://github.com/yewon-Noh/aws-elasticbeanstalk/blob/main/.ebextensions/00-makeFiles.config) : Profile에서 실행할 appstart 스크립트 파일 생성
   - [00-set-timezone.config](https://github.com/yewon-Noh/aws-elasticbeanstalk/blob/main/.ebextensions/00-set-timezone.config) : Timezone 설정

<br/>

### 웹 접속

elastic beanstalk에서 만들어진 도메인을 통해 들어가면 확인할 수 있다.

<img src="https://github.com/yewon-Noh/aws-elasticbeanstalk/assets/80824750/f636786a-39d3-43a8-b8eb-684c46172efb" width="40%">
