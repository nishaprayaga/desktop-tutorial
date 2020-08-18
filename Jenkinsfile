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
          pullRequest.comment("Just for test purpose---success+rtifact public id+link to it+the build is successful the version is not available to be deployed until it is merged back to the target branch and successfully built there")
        }
      }
    }
  }
}
