

node{
  
    stage('Testing Purpose') {
          jenkinsUrl="http://localhost:9090/job/jenkinscheck/job/desktop-tutorial/"
            pullRequest.comment("a(href:${jenkinsUrl}, cat) This is the comment for PR ${env.BUILD_NUMBER}")
    }
  
}
