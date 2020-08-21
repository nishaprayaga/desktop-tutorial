

node{
  
    stage('Testing Purpose') {
       jenkinsUrl="http://localhost:9090/"
         def comment = pullRequest.comment('This PR is highly illogical..and jenkins url is "${jenkinsUrl}"')
      currentbuild.description = "${comment}"
    }
}
