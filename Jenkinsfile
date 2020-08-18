pipeline {

  agent any

  stages {
    stage('Test') {
      when { changeRequest() }
      steps {
        script {
          echo "Current Pull Request ID: ${env.CHANGE_ID}"
        }
      }
    }
    stage('Test2') {
      steps {
        script {
          pullRequest.comment("Test")
        }
      }
    }
  }
}
