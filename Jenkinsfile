

node{
  
    stage('Testing Purpose') {
       jenkinsUrl="http://localhost:9090/"
         def comment = pullRequest.comment('This PR is highly illogical..')
      currentbuild.description = "${comment} and jenkins link is ${jenkinsUrl}"
    }
}
